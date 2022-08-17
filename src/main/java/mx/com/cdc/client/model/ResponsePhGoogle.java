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
@ApiModel(description = "Detalle del número telefónico con alguna cuenta existente de google.")


public class ResponsePhGoogle {
  @SerializedName("registered")
  private Boolean registered = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("full_name")
  private String fullName = null;
  public ResponsePhGoogle registered(Boolean registered) {
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
  public ResponsePhGoogle id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(example = "pepe.lopez", value = "Identificador único del perfil.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public ResponsePhGoogle fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }
   
  @ApiModelProperty(example = "Luis Ramirez", value = "Nombre del perfil.")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePhGoogle responsePhGoogle = (ResponsePhGoogle) o;
    return Objects.equals(this.registered, responsePhGoogle.registered) &&
        Objects.equals(this.id, responsePhGoogle.id) &&
        Objects.equals(this.fullName, responsePhGoogle.fullName);
  }
  @Override
  public int hashCode() {
    return Objects.hash(registered, id, fullName);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePhGoogle {\n");
    
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
