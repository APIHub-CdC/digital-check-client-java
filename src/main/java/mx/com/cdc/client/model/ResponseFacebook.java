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
@ApiModel(description = "Detalle del correo electrónico con alguna cuenta existente de facebook.")


public class ResponseFacebook {
  @SerializedName("registered")
  private Boolean registered = null;
  @SerializedName("photo")
  private String photo = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("name")
  private String name = null;
  public ResponseFacebook registered(Boolean registered) {
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
  public ResponseFacebook photo(String photo) {
    this.photo = photo;
    return this;
  }
   
  @ApiModelProperty(example = "https://scontent-iad3-1.xx.fbcdn.net/v/t1.30497-1/cp0/c15.0.50.50a/p50x50/84241059_189132118950875_4138507100605120512_n.jpg?_nc_cat=1&ccb=2&_nc_sid=bbed71&_nc_ohc=-elf4e7NxwEAX-ckEQv&_nc_ht=scontent-iad3-1.xx&tp=27&oh=923aa13ff625cad8f9bfadbc7409948e&oe=601C2D8F", value = "URL de la foto de perfil en caso de existir.")
  public String getPhoto() {
    return photo;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public ResponseFacebook url(String url) {
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
  public ResponseFacebook name(String name) {
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
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseFacebook responseFacebook = (ResponseFacebook) o;
    return Objects.equals(this.registered, responseFacebook.registered) &&
        Objects.equals(this.photo, responseFacebook.photo) &&
        Objects.equals(this.url, responseFacebook.url) &&
        Objects.equals(this.name, responseFacebook.name);
  }
  @Override
  public int hashCode() {
    return Objects.hash(registered, photo, url, name);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseFacebook {\n");
    
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
