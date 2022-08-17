package mx.com.cdc.client.api;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import mx.com.cdc.client.ApiClient;
import mx.com.cdc.client.ApiException;
import mx.com.cdc.client.model.Otorgante;
import mx.com.cdc.client.model.Response;
import okhttp3.OkHttpClient;

public class DigitalCheckApiTest {
    
  private Logger logger = LoggerFactory.getLogger(DigitalCheckApiTest.class.getName());
    
  private final DefaultApi api = new DefaultApi();
  private ApiClient apiClient;
    
  private SignerInterceptor interceptor;
  
  private String url		= "cdc-api-url";
  private String xApiKey	= "your-x-api-key";
  private String username	= "your-username";
  private String password	= "your-password";

  private String keystoreFile		= "";
  private String cdcCertFile		= "";
  private String keystorePassword = "";
  private String keyAlias			= "";
  private String keyPassword		= "";
    
    @Before()
    public void Setup() {
       this.apiClient = api.getApiClient();
         this.apiClient.setBasePath(url);
         OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor(
            keystoreFile, 
            cdcCertFile, 
            keystorePassword, 
            keyAlias, 
            keyPassword))
                .build();
         apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void fullfraudTest() throws  ApiException {
      
      Otorgante otorgante = new Otorgante();
      
      otorgante.setFolioOtorgante("");
      otorgante.setFolioConsulta("");
	  otorgante.setEmail("");
	  otorgante.setIp("");
	  otorgante.setPhone("");
	  
      try {
        Response response = api.fullfraud(xApiKey, username, password, otorgante);
        
        Assert.assertTrue(response != null);
            if(response != null) {
                logger.info(response.toString());
            }
      } catch (ApiException e) {
        logger.info(e.getResponseBody());
      }
    }
}
