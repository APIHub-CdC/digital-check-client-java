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
import mx.com.cdc.client.model.ResponseAccountDetails;
import mx.com.cdc.client.model.ResponseBreachDetails;
import mx.com.cdc.client.model.ResponseDomainDetails;

import java.io.IOException;
@ApiModel(description = "Detalle del correo electrónico.")


public class ResponseEmailDetails {
  @SerializedName("email")
  private String email = null;
  @SerializedName("grade")
  private String grade = null;
  @SerializedName("deliverable")
  private Boolean deliverable = null;
  @SerializedName("domain_details")
  private ResponseDomainDetails domainDetails = null;
  @SerializedName("account_details")
  private ResponseAccountDetails accountDetails = null;
  @SerializedName("breach_details")
  private ResponseBreachDetails breachDetails = null;
  public ResponseEmailDetails email(String email) {
    this.email = email;
    return this;
  }
   
  @ApiModelProperty(example = "ejemplo.ejemplo@gmail.com", value = "Correo electrónico del cliente")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public ResponseEmailDetails grade(String grade) {
    this.grade = grade;
    return this;
  }
   
  @ApiModelProperty(example = "1.2", value = "Puntuación del 0 al 100 que indica la probabilidad de que el correo electrónico del usuario es fraudulento.")
  public String getGrade() {
    return grade;
  }
  public void setGrade(String grade) {
    this.grade = grade;
  }
  public ResponseEmailDetails deliverable(Boolean deliverable) {
    this.deliverable = deliverable;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el correo electrónico existe, a través de una validación rápida del SMTP-MX.")
  public Boolean isDeliverable() {
    return deliverable;
  }
  public void setDeliverable(Boolean deliverable) {
    this.deliverable = deliverable;
  }
  public ResponseEmailDetails domainDetails(ResponseDomainDetails domainDetails) {
    this.domainDetails = domainDetails;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseDomainDetails getDomainDetails() {
    return domainDetails;
  }
  public void setDomainDetails(ResponseDomainDetails domainDetails) {
    this.domainDetails = domainDetails;
  }
  public ResponseEmailDetails accountDetails(ResponseAccountDetails accountDetails) {
    this.accountDetails = accountDetails;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseAccountDetails getAccountDetails() {
    return accountDetails;
  }
  public void setAccountDetails(ResponseAccountDetails accountDetails) {
    this.accountDetails = accountDetails;
  }
  public ResponseEmailDetails breachDetails(ResponseBreachDetails breachDetails) {
    this.breachDetails = breachDetails;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseBreachDetails getBreachDetails() {
    return breachDetails;
  }
  public void setBreachDetails(ResponseBreachDetails breachDetails) {
    this.breachDetails = breachDetails;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseEmailDetails responseEmailDetails = (ResponseEmailDetails) o;
    return Objects.equals(this.email, responseEmailDetails.email) &&
        Objects.equals(this.grade, responseEmailDetails.grade) &&
        Objects.equals(this.deliverable, responseEmailDetails.deliverable) &&
        Objects.equals(this.domainDetails, responseEmailDetails.domainDetails) &&
        Objects.equals(this.accountDetails, responseEmailDetails.accountDetails) &&
        Objects.equals(this.breachDetails, responseEmailDetails.breachDetails);
  }
  @Override
  public int hashCode() {
    return Objects.hash(email, grade, deliverable, domainDetails, accountDetails, breachDetails);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseEmailDetails {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    deliverable: ").append(toIndentedString(deliverable)).append("\n");
    sb.append("    domainDetails: ").append(toIndentedString(domainDetails)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
    sb.append("    breachDetails: ").append(toIndentedString(breachDetails)).append("\n");
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
