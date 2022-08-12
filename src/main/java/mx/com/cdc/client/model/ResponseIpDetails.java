package mx.com.cdc.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "Detalles de la dirección IP.")


public class ResponseIpDetails {
  @SerializedName("ip")
  private String ip = null;
  @SerializedName("score")
  private BigDecimal score = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("state_prov")
  private String stateProv = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("timezone_offset")
  private String timezoneOffset = null;
  @SerializedName("isp_name")
  private String ispName = null;
  @SerializedName("latitude")
  private BigDecimal latitude = null;
  @SerializedName("longitude")
  private BigDecimal longitude = null;
  
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    COM_COMMERCIAL_("COM (Commercial)"),
    
    ORG_ORGANIZATION_("ORG (Organization)"),
    
    EDU_SCHOOL_COLLEGE_UNIVERSITY_("EDU (School/College/University)"),
    
    LIB_LIBRARY_("LIB (Library)"),
    
    ISP_FIXED_LINE_ISP_("ISP (Fixed Line ISP)"),
    
    MOB_MOBILE_ISP_("MOB (Mobile ISP)"),
    
    DCH_DATA_CENTER_WEB_HOSTING_("DCH (Data Center/Web Hosting)"),
    
    RSV_RESERVED_("RSV (Reserved)"),
    
    MIL_MILITARY_("MIL (Military)"),
    
    CDN_CONTENT_DELIVERY_NETWORK_("CDN (Content Delivery Network)"),
    
    GOV_GOVERNMENT_("GOV (Government)"),
    
    SES_SEARCH_ENGINE_SPIDER_("SES (Search Engine Spider)");
    private String value;
    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("open_ports")
  private List<BigDecimal> openPorts = null;
  @SerializedName("tor")
  private Boolean tor = null;
  @SerializedName("harmful")
  private Boolean harmful = null;
  @SerializedName("vpn")
  private Boolean vpn = null;
  @SerializedName("web_proxy")
  private Boolean webProxy = null;
  @SerializedName("public_proxy")
  private Boolean publicProxy = null;
  @SerializedName("spam_number")
  private Integer spamNumber = null;
  @SerializedName("spam_urls")
  private List<String> spamUrls = null;
  public ResponseIpDetails ip(String ip) {
    this.ip = ip;
    return this;
  }
   
  @ApiModelProperty(example = "1.1.1.1", value = "Dirección IP del usuario.")
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }
  public ResponseIpDetails score(BigDecimal score) {
    this.score = score;
    return this;
  }
   
  @ApiModelProperty(example = "5.0", value = "Puntuación de 0 a 100 que indica la probabilidad de que la dirección IP del usuario sea fraudulenta.")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }
  public ResponseIpDetails country(String country) {
    this.country = country;
    return this;
  }
   
  @ApiModelProperty(example = "US", value = "Código de país de la IP. Utiliza dos caracteres bajo el estándar ISO 3166-1.")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public ResponseIpDetails stateProv(String stateProv) {
    this.stateProv = stateProv;
    return this;
  }
   
  @ApiModelProperty(example = "California", value = "Estado de la dirección IP.")
  public String getStateProv() {
    return stateProv;
  }
  public void setStateProv(String stateProv) {
    this.stateProv = stateProv;
  }
  public ResponseIpDetails city(String city) {
    this.city = city;
    return this;
  }
   
  @ApiModelProperty(example = "Los Angeles", value = "Ciudad de la dirección IP.")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public ResponseIpDetails timezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }
   
  @ApiModelProperty(example = "-07:00", value = "Zona horaria de la dirección IP.")
  public String getTimezoneOffset() {
    return timezoneOffset;
  }
  public void setTimezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }
  public ResponseIpDetails ispName(String ispName) {
    this.ispName = ispName;
    return this;
  }
   
  @ApiModelProperty(example = "APNIC and CloudFlare DNS Resolver Project", value = "Nombre del ISP de la dirección IP.")
  public String getIspName() {
    return ispName;
  }
  public void setIspName(String ispName) {
    this.ispName = ispName;
  }
  public ResponseIpDetails latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }
   
  @ApiModelProperty(example = "34.052859", value = "Latitud de la dirección IP.")
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }
  public ResponseIpDetails longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }
   
  @ApiModelProperty(example = "-118.24357", value = "Longitud de la dirección IP.")
  public BigDecimal getLongitude() {
    return longitude;
  }
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }
  public ResponseIpDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }
   
  @ApiModelProperty(example = "CDN", value = "\"Tipo de dirección IP basado en el ISP.\"")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
  public ResponseIpDetails openPorts(List<BigDecimal> openPorts) {
    this.openPorts = openPorts;
    return this;
  }
  public ResponseIpDetails addOpenPortsItem(BigDecimal openPortsItem) {
    if (this.openPorts == null) {
      this.openPorts = new ArrayList<BigDecimal>();
    }
    this.openPorts.add(openPortsItem);
    return this;
  }
   
  @ApiModelProperty(example = "[80,110,90]", value = "Lista de puertos abiertos en la dirección IP. Tipo de dato: string Tamaño máximo del campo: 50 listed ports")
  public List<BigDecimal> getOpenPorts() {
    return openPorts;
  }
  public void setOpenPorts(List<BigDecimal> openPorts) {
    this.openPorts = openPorts;
  }
  public ResponseIpDetails tor(Boolean tor) {
    this.tor = tor;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si la IP es TOR.")
  public Boolean isTor() {
    return tor;
  }
  public void setTor(Boolean tor) {
    this.tor = tor;
  }
  public ResponseIpDetails harmful(Boolean harmful) {
    this.harmful = harmful;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si la dirección IP se encuentra en una blacklist.")
  public Boolean isHarmful() {
    return harmful;
  }
  public void setHarmful(Boolean harmful) {
    this.harmful = harmful;
  }
  public ResponseIpDetails vpn(Boolean vpn) {
    this.vpn = vpn;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si la dirección IP es una VPN.")
  public Boolean isVpn() {
    return vpn;
  }
  public void setVpn(Boolean vpn) {
    this.vpn = vpn;
  }
  public ResponseIpDetails webProxy(Boolean webProxy) {
    this.webProxy = webProxy;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si la dirección IP es una web proxy.")
  public Boolean isWebProxy() {
    return webProxy;
  }
  public void setWebProxy(Boolean webProxy) {
    this.webProxy = webProxy;
  }
  public ResponseIpDetails publicProxy(Boolean publicProxy) {
    this.publicProxy = publicProxy;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si la dirección IP es un proxy público.")
  public Boolean isPublicProxy() {
    return publicProxy;
  }
  public void setPublicProxy(Boolean publicProxy) {
    this.publicProxy = publicProxy;
  }
  public ResponseIpDetails spamNumber(Integer spamNumber) {
    this.spamNumber = spamNumber;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Indica la cantidad de listas de spam donde la dirección IP se encuentra listada.")
  public Integer getSpamNumber() {
    return spamNumber;
  }
  public void setSpamNumber(Integer spamNumber) {
    this.spamNumber = spamNumber;
  }
  public ResponseIpDetails spamUrls(List<String> spamUrls) {
    this.spamUrls = spamUrls;
    return this;
  }
  public ResponseIpDetails addSpamUrlsItem(String spamUrlsItem) {
    if (this.spamUrls == null) {
      this.spamUrls = new ArrayList<String>();
    }
    this.spamUrls.add(spamUrlsItem);
    return this;
  }
   
  @ApiModelProperty(example = "[\"http://encyclopedia.com\",\"http:dinerofacil.com'\"]", value = "Lista de URL de las listas spam detectadas. Tipo de dato: string.")
  public List<String> getSpamUrls() {
    return spamUrls;
  }
  public void setSpamUrls(List<String> spamUrls) {
    this.spamUrls = spamUrls;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseIpDetails responseIpDetails = (ResponseIpDetails) o;
    return Objects.equals(this.ip, responseIpDetails.ip) &&
        Objects.equals(this.score, responseIpDetails.score) &&
        Objects.equals(this.country, responseIpDetails.country) &&
        Objects.equals(this.stateProv, responseIpDetails.stateProv) &&
        Objects.equals(this.city, responseIpDetails.city) &&
        Objects.equals(this.timezoneOffset, responseIpDetails.timezoneOffset) &&
        Objects.equals(this.ispName, responseIpDetails.ispName) &&
        Objects.equals(this.latitude, responseIpDetails.latitude) &&
        Objects.equals(this.longitude, responseIpDetails.longitude) &&
        Objects.equals(this.type, responseIpDetails.type) &&
        Objects.equals(this.openPorts, responseIpDetails.openPorts) &&
        Objects.equals(this.tor, responseIpDetails.tor) &&
        Objects.equals(this.harmful, responseIpDetails.harmful) &&
        Objects.equals(this.vpn, responseIpDetails.vpn) &&
        Objects.equals(this.webProxy, responseIpDetails.webProxy) &&
        Objects.equals(this.publicProxy, responseIpDetails.publicProxy) &&
        Objects.equals(this.spamNumber, responseIpDetails.spamNumber) &&
        Objects.equals(this.spamUrls, responseIpDetails.spamUrls);
  }
  @Override
  public int hashCode() {
    return Objects.hash(ip, score, country, stateProv, city, timezoneOffset, ispName, latitude, longitude, type, openPorts, tor, harmful, vpn, webProxy, publicProxy, spamNumber, spamUrls);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseIpDetails {\n");
    
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    stateProv: ").append(toIndentedString(stateProv)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    ispName: ").append(toIndentedString(ispName)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    openPorts: ").append(toIndentedString(openPorts)).append("\n");
    sb.append("    tor: ").append(toIndentedString(tor)).append("\n");
    sb.append("    harmful: ").append(toIndentedString(harmful)).append("\n");
    sb.append("    vpn: ").append(toIndentedString(vpn)).append("\n");
    sb.append("    webProxy: ").append(toIndentedString(webProxy)).append("\n");
    sb.append("    publicProxy: ").append(toIndentedString(publicProxy)).append("\n");
    sb.append("    spamNumber: ").append(toIndentedString(spamNumber)).append("\n");
    sb.append("    spamUrls: ").append(toIndentedString(spamUrls)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
