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
@ApiModel(description = "Detalle del correo electrónico con alguna cuenta existente de linkedin.")


public class ResponseLinkedin {
  @SerializedName("registered")
  private Boolean registered = null;
  @SerializedName("photo")
  private String photo = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("location")
  private String location = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("company")
  private String company = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("website")
  private String website = null;
  @SerializedName("twitter")
  private String twitter = null;
  @SerializedName("connection_count")
  private BigDecimal connectionCount = null;
  public ResponseLinkedin registered(Boolean registered) {
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
  public ResponseLinkedin photo(String photo) {
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
  public ResponseLinkedin url(String url) {
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
  public ResponseLinkedin location(String location) {
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
  public ResponseLinkedin name(String name) {
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
  public ResponseLinkedin company(String company) {
    this.company = company;
    return this;
  }
   
  @ApiModelProperty(example = "Círculo de Crédito", value = "Nombre de la empresa con base en los ajustes de perfil.")
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }
  public ResponseLinkedin title(String title) {
    this.title = title;
    return this;
  }
   
  @ApiModelProperty(example = "Analista de Base de Datos", value = "Puesto o título de la persona con base en los ajustes del perfil.")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public ResponseLinkedin website(String website) {
    this.website = website;
    return this;
  }
   
  @ApiModelProperty(example = "https://developer.circulodecredito.com.mx", value = "Página web con base en los ajustes del perfil.")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }
  public ResponseLinkedin twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }
   
  @ApiModelProperty(example = "https://www.linkedin.com/company/circulo-de-credito/mycompany", value = "Cuenta de Twitter vinculada con base en los ajustes de perfil.")
  public String getTwitter() {
    return twitter;
  }
  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }
  public ResponseLinkedin connectionCount(BigDecimal connectionCount) {
    this.connectionCount = connectionCount;
    return this;
  }
   
  @ApiModelProperty(example = "34.0", value = "Cantidad de conexiones del perfil.")
  public BigDecimal getConnectionCount() {
    return connectionCount;
  }
  public void setConnectionCount(BigDecimal connectionCount) {
    this.connectionCount = connectionCount;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseLinkedin responseLinkedin = (ResponseLinkedin) o;
    return Objects.equals(this.registered, responseLinkedin.registered) &&
        Objects.equals(this.photo, responseLinkedin.photo) &&
        Objects.equals(this.url, responseLinkedin.url) &&
        Objects.equals(this.location, responseLinkedin.location) &&
        Objects.equals(this.name, responseLinkedin.name) &&
        Objects.equals(this.company, responseLinkedin.company) &&
        Objects.equals(this.title, responseLinkedin.title) &&
        Objects.equals(this.website, responseLinkedin.website) &&
        Objects.equals(this.twitter, responseLinkedin.twitter) &&
        Objects.equals(this.connectionCount, responseLinkedin.connectionCount);
  }
  @Override
  public int hashCode() {
    return Objects.hash(registered, photo, url, location, name, company, title, website, twitter, connectionCount);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseLinkedin {\n");
    
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
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
