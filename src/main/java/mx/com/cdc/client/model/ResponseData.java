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
import mx.com.cdc.client.model.ResponseAppliedRules;
import mx.com.cdc.client.model.ResponseEmailDetails;
import mx.com.cdc.client.model.ResponseIpDetails;
import mx.com.cdc.client.model.ResponsePhoneDetails;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ResponseData {
  @SerializedName("id")
  private String id = null;
  
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    APPROVE("APPROVE"),
    
    REVIEW("REVIEW"),
    
    DECLINE("DECLINE");
    private String value;
    StateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("state")
  private StateEnum state = null;
  @SerializedName("fraud_score")
  private BigDecimal fraudScore = null;
  @SerializedName("version")
  private String version = null;
  @SerializedName("applied_rules")
  private List<ResponseAppliedRules> appliedRules = null;
  @SerializedName("ip_details")
  private ResponseIpDetails ipDetails = null;
  @SerializedName("email_details")
  private ResponseEmailDetails emailDetails = null;
  @SerializedName("phone_details")
  private ResponsePhoneDetails phoneDetails = null;
  public ResponseData id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(example = "6dcff0e37dbf", value = "Identificador único, equivale al campo transaction_id cuando este es incluido en la petición, se genera uno de forma automática")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public ResponseData state(StateEnum state) {
    this.state = state;
    return this;
  }
   
  @ApiModelProperty(example = "DECLINE", value = "Estado de la transacción.")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }
  public ResponseData fraudScore(BigDecimal fraudScore) {
    this.fraudScore = fraudScore;
    return this;
  }
   
  @ApiModelProperty(example = "90.0", value = "\"Score que indica la probabilidad de que una transacción sea fraudulenta. Mín: 0, Máx: 999\"")
  public BigDecimal getFraudScore() {
    return fraudScore;
  }
  public void setFraudScore(BigDecimal fraudScore) {
    this.fraudScore = fraudScore;
  }
  public ResponseData version(String version) {
    this.version = version;
    return this;
  }
   
  @ApiModelProperty(example = "v2.0", value = "Versión del API de consumo.")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }
  public ResponseData appliedRules(List<ResponseAppliedRules> appliedRules) {
    this.appliedRules = appliedRules;
    return this;
  }
  public ResponseData addAppliedRulesItem(ResponseAppliedRules appliedRulesItem) {
    if (this.appliedRules == null) {
      this.appliedRules = new ArrayList<ResponseAppliedRules>();
    }
    this.appliedRules.add(appliedRulesItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<ResponseAppliedRules> getAppliedRules() {
    return appliedRules;
  }
  public void setAppliedRules(List<ResponseAppliedRules> appliedRules) {
    this.appliedRules = appliedRules;
  }
  public ResponseData ipDetails(ResponseIpDetails ipDetails) {
    this.ipDetails = ipDetails;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseIpDetails getIpDetails() {
    return ipDetails;
  }
  public void setIpDetails(ResponseIpDetails ipDetails) {
    this.ipDetails = ipDetails;
  }
  public ResponseData emailDetails(ResponseEmailDetails emailDetails) {
    this.emailDetails = emailDetails;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseEmailDetails getEmailDetails() {
    return emailDetails;
  }
  public void setEmailDetails(ResponseEmailDetails emailDetails) {
    this.emailDetails = emailDetails;
  }
  public ResponseData phoneDetails(ResponsePhoneDetails phoneDetails) {
    this.phoneDetails = phoneDetails;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhoneDetails getPhoneDetails() {
    return phoneDetails;
  }
  public void setPhoneDetails(ResponsePhoneDetails phoneDetails) {
    this.phoneDetails = phoneDetails;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseData responseData = (ResponseData) o;
    return Objects.equals(this.id, responseData.id) &&
        Objects.equals(this.state, responseData.state) &&
        Objects.equals(this.fraudScore, responseData.fraudScore) &&
        Objects.equals(this.version, responseData.version) &&
        Objects.equals(this.appliedRules, responseData.appliedRules) &&
        Objects.equals(this.ipDetails, responseData.ipDetails) &&
        Objects.equals(this.emailDetails, responseData.emailDetails) &&
        Objects.equals(this.phoneDetails, responseData.phoneDetails);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, state, fraudScore, version, appliedRules, ipDetails, emailDetails, phoneDetails);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    fraudScore: ").append(toIndentedString(fraudScore)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    appliedRules: ").append(toIndentedString(appliedRules)).append("\n");
    sb.append("    ipDetails: ").append(toIndentedString(ipDetails)).append("\n");
    sb.append("    emailDetails: ").append(toIndentedString(emailDetails)).append("\n");
    sb.append("    phoneDetails: ").append(toIndentedString(phoneDetails)).append("\n");
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
