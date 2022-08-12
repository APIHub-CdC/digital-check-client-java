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
@ApiModel(description = "Detalle del correo electrónico con alguna cuenta existente de ok.")


public class ResponseOk {
  @SerializedName("registered")
  private Boolean registered = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("age")
  private Integer age = null;
  @SerializedName("date_joined")
  private String dateJoined = null;
  public ResponseOk registered(Boolean registered) {
    this.registered = registered;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el correo electrónico se encuentra registrado.")
  public Boolean isRegistered() {
    return registered;
  }
  public void setRegistered(Boolean registered) {
    this.registered = registered;
  }
  public ResponseOk city(String city) {
    this.city = city;
    return this;
  }
   
  @ApiModelProperty(example = "CDMX", value = "Ciudad con base en los ajustes de perfil.")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public ResponseOk age(Integer age) {
    this.age = age;
    return this;
  }
   
  @ApiModelProperty(example = "40", value = "Edad del usuario con base en los ajustes de perfil.")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }
  public ResponseOk dateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }
   
  @ApiModelProperty(example = "2019-05-24", value = "Fecha de registro del perfil.")
  public String getDateJoined() {
    return dateJoined;
  }
  public void setDateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseOk responseOk = (ResponseOk) o;
    return Objects.equals(this.registered, responseOk.registered) &&
        Objects.equals(this.city, responseOk.city) &&
        Objects.equals(this.age, responseOk.age) &&
        Objects.equals(this.dateJoined, responseOk.dateJoined);
  }
  @Override
  public int hashCode() {
    return Objects.hash(registered, city, age, dateJoined);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseOk {\n");
    
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
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
