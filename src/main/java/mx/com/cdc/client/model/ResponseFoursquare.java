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
@ApiModel(description = "Detalle del correo electrónico con alguna cuenta existente de foursquare.")


public class ResponseFoursquare {
  @SerializedName("registered")
  private Boolean registered = null;
  @SerializedName("photo")
  private String photo = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("bio")
  private String bio = null;
  public ResponseFoursquare registered(Boolean registered) {
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
  public ResponseFoursquare photo(String photo) {
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
  public ResponseFoursquare url(String url) {
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
  public ResponseFoursquare bio(String bio) {
    this.bio = bio;
    return this;
  }
   
  @ApiModelProperty(example = "Apasionado por la finanzas y la tecnología, de gran espiritu de trabajo en equipo.", value = "\"Biografía del perfil. Texto Libre.\"")
  public String getBio() {
    return bio;
  }
  public void setBio(String bio) {
    this.bio = bio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseFoursquare responseFoursquare = (ResponseFoursquare) o;
    return Objects.equals(this.registered, responseFoursquare.registered) &&
        Objects.equals(this.photo, responseFoursquare.photo) &&
        Objects.equals(this.url, responseFoursquare.url) &&
        Objects.equals(this.bio, responseFoursquare.bio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(registered, photo, url, bio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseFoursquare {\n");
    
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
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
