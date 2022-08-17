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
@ApiModel(description = "Detalle del número telefónico con alguna cuenta existente de zalo.")


public class ResponsePhZalo {
  @SerializedName("registered")
  private Boolean registered = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("date_of_birth")
  private String dateOfBirth = null;
  @SerializedName("uid")
  private String uid = null;
  public ResponsePhZalo registered(Boolean registered) {
    this.registered = registered;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el número telefónico se encuentra registrado.")
  public Boolean isRegistered() {
    return registered;
  }
  public void setRegistered(Boolean registered) {
    this.registered = registered;
  }
  public ResponsePhZalo name(String name) {
    this.name = name;
    return this;
  }
   
  @ApiModelProperty(example = "Pepe Lopez 42", value = "Nombre con base en los ajustes de perfil.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public ResponsePhZalo dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }
   
  @ApiModelProperty(example = "1981-08-26", value = "Fecha de nacimiento con base en los ajustes de perfil.")
  public String getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  public ResponsePhZalo uid(String uid) {
    this.uid = uid;
    return this;
  }
   
  @ApiModelProperty(example = "0913393445", value = "Identificador único del usuario.")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePhZalo responsePhZalo = (ResponsePhZalo) o;
    return Objects.equals(this.registered, responsePhZalo.registered) &&
        Objects.equals(this.name, responsePhZalo.name) &&
        Objects.equals(this.dateOfBirth, responsePhZalo.dateOfBirth) &&
        Objects.equals(this.uid, responsePhZalo.uid);
  }
  @Override
  public int hashCode() {
    return Objects.hash(registered, name, dateOfBirth, uid);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePhZalo {\n");
    
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
