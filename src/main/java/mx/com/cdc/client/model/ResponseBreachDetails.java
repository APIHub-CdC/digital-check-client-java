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
import mx.com.cdc.client.model.ResponseBreaches;

import java.io.IOException;
@ApiModel(description = "Detalles acerca de las filtraciones en caso de que el correo electrónico haya sido comprometido.")


public class ResponseBreachDetails {
  @SerializedName("haveibeenpwned_listed")
  private Boolean haveibeenpwnedListed = null;
  @SerializedName("number_of_breaches")
  private Integer numberOfBreaches = null;
  @SerializedName("first_breach")
  private String firstBreach = null;
  @SerializedName("breaches")
  private ResponseBreaches breaches = null;
  public ResponseBreachDetails haveibeenpwnedListed(Boolean haveibeenpwnedListed) {
    this.haveibeenpwnedListed = haveibeenpwnedListed;
    return this;
  }
   
  @ApiModelProperty(value = "El correo electrónico ha estado comprometido en una filtración de datos.")
  public Boolean isHaveibeenpwnedListed() {
    return haveibeenpwnedListed;
  }
  public void setHaveibeenpwnedListed(Boolean haveibeenpwnedListed) {
    this.haveibeenpwnedListed = haveibeenpwnedListed;
  }
  public ResponseBreachDetails numberOfBreaches(Integer numberOfBreaches) {
    this.numberOfBreaches = numberOfBreaches;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "Número de filtraciones de datos donde el correo electrónico ha estado comprometido.")
  public Integer getNumberOfBreaches() {
    return numberOfBreaches;
  }
  public void setNumberOfBreaches(Integer numberOfBreaches) {
    this.numberOfBreaches = numberOfBreaches;
  }
  public ResponseBreachDetails firstBreach(String firstBreach) {
    this.firstBreach = firstBreach;
    return this;
  }
   
  @ApiModelProperty(example = "2019-05-24", value = "Fecha de la primera filtración de datos donde el correo electrónico fue comprometido.")
  public String getFirstBreach() {
    return firstBreach;
  }
  public void setFirstBreach(String firstBreach) {
    this.firstBreach = firstBreach;
  }
  public ResponseBreachDetails breaches(ResponseBreaches breaches) {
    this.breaches = breaches;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseBreaches getBreaches() {
    return breaches;
  }
  public void setBreaches(ResponseBreaches breaches) {
    this.breaches = breaches;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBreachDetails responseBreachDetails = (ResponseBreachDetails) o;
    return Objects.equals(this.haveibeenpwnedListed, responseBreachDetails.haveibeenpwnedListed) &&
        Objects.equals(this.numberOfBreaches, responseBreachDetails.numberOfBreaches) &&
        Objects.equals(this.firstBreach, responseBreachDetails.firstBreach) &&
        Objects.equals(this.breaches, responseBreachDetails.breaches);
  }
  @Override
  public int hashCode() {
    return Objects.hash(haveibeenpwnedListed, numberOfBreaches, firstBreach, breaches);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBreachDetails {\n");
    
    sb.append("    haveibeenpwnedListed: ").append(toIndentedString(haveibeenpwnedListed)).append("\n");
    sb.append("    numberOfBreaches: ").append(toIndentedString(numberOfBreaches)).append("\n");
    sb.append("    firstBreach: ").append(toIndentedString(firstBreach)).append("\n");
    sb.append("    breaches: ").append(toIndentedString(breaches)).append("\n");
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
