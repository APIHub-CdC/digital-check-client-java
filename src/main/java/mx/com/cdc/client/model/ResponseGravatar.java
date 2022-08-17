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
@ApiModel(description = "Detalle del correo electrónico con alguna cuenta existente de gravatar.")


public class ResponseGravatar {
  @SerializedName("registered")
  private String registered = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("location")
  private String location = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("username")
  private String username = null;
  public ResponseGravatar registered(String registered) {
    this.registered = registered;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el correo electrónico se encuentra registrado.")
  public String getRegistered() {
    return registered;
  }
  public void setRegistered(String registered) {
    this.registered = registered;
  }
  public ResponseGravatar url(String url) {
    this.url = url;
    return this;
  }
   
  @ApiModelProperty(example = "https://www.facebook.com/100003707493626", value = "URL del perfil en caso de existir.")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public ResponseGravatar location(String location) {
    this.location = location;
    return this;
  }
   
  @ApiModelProperty(value = "Ubicación con base en los ajustes de perfil.")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }
  public ResponseGravatar name(String name) {
    this.name = name;
    return this;
  }
   
  @ApiModelProperty(value = "Nombre con base en los ajustes de perfil.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public ResponseGravatar username(String username) {
    this.username = username;
    return this;
  }
   
  @ApiModelProperty(example = "Jose_Lopez42", value = "Nombre de usuario.")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseGravatar responseGravatar = (ResponseGravatar) o;
    return Objects.equals(this.registered, responseGravatar.registered) &&
        Objects.equals(this.url, responseGravatar.url) &&
        Objects.equals(this.location, responseGravatar.location) &&
        Objects.equals(this.name, responseGravatar.name) &&
        Objects.equals(this.username, responseGravatar.username);
  }
  @Override
  public int hashCode() {
    return Objects.hash(registered, url, location, name, username);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGravatar {\n");
    
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
