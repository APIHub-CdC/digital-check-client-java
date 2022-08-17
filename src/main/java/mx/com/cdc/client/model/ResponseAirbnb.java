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
@ApiModel(description = "Detalle del correo electrónico con alguna cuenta existente de airbnb.")


public class ResponseAirbnb {
  @SerializedName("registered")
  private Boolean registered = null;
  @SerializedName("image")
  private String image = null;
  @SerializedName("location")
  private String location = null;
  @SerializedName("about")
  private String about = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("created_at")
  private String createdAt = null;
  @SerializedName("reviewee_count")
  private String revieweeCount = null;
  @SerializedName("trips")
  private Integer trips = null;
  @SerializedName("work")
  private String work = null;
  @SerializedName("identity_verified")
  private String identityVerified = null;
  public ResponseAirbnb registered(Boolean registered) {
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
  public ResponseAirbnb image(String image) {
    this.image = image;
    return this;
  }
   
  @ApiModelProperty(example = "https://scontent-iad3-1.xx.fbcdn.net/v/t1.30497-1/cp0/c15.0.50.50a/p50x50/84241059_189132118950875_4138507100605120512_n.jpg?_nc_cat=1&ccb=2&_nc_sid=bbed71&_nc_ohc=-elf4e7NxwEAX-ckEQv&_nc_ht=scontent-iad3-1.xx&tp=27&oh=923aa13ff625cad8f9bfadbc7409948e&oe=601C2D8F", value = "URL de la foto de perfil en caso de existir.")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }
  public ResponseAirbnb location(String location) {
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
  public ResponseAirbnb about(String about) {
    this.about = about;
    return this;
  }
   
  @ApiModelProperty(example = "Nacida en la Ciudad de México, pero enamorada de la magia de Cuetzalan. Me gusta conocer gente nueva, hacer ejercicio y alimentarme bien. Me gusta la gente honesta, valiente y honorable.", value = "Descripción del perfil con base en los ajustes del perfil.")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }
  public ResponseAirbnb firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
   
  @ApiModelProperty(example = "Erika", value = "Primer nombre del perfil.")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public ResponseAirbnb createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }
   
  @ApiModelProperty(example = "2019-05-24", value = "Fecha de registro del perfil.")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  public ResponseAirbnb revieweeCount(String revieweeCount) {
    this.revieweeCount = revieweeCount;
    return this;
  }
   
  @ApiModelProperty(example = "\"545\"", value = "Número de evaluaciones del perfil. Tipo de dato: string Valor máximo: 50 caracteres")
  public String getRevieweeCount() {
    return revieweeCount;
  }
  public void setRevieweeCount(String revieweeCount) {
    this.revieweeCount = revieweeCount;
  }
  public ResponseAirbnb trips(Integer trips) {
    this.trips = trips;
    return this;
  }
   
  @ApiModelProperty(example = "58", value = "Número de viajes sobre el perfil.")
  public Integer getTrips() {
    return trips;
  }
  public void setTrips(Integer trips) {
    this.trips = trips;
  }
  public ResponseAirbnb work(String work) {
    this.work = work;
    return this;
  }
   
  @ApiModelProperty(example = "Círculo de Crédito", value = "Nombre del lugar de trabajo con base en los ajustes de perfil.")
  public String getWork() {
    return work;
  }
  public void setWork(String work) {
    this.work = work;
  }
  public ResponseAirbnb identityVerified(String identityVerified) {
    this.identityVerified = identityVerified;
    return this;
  }
   
  @ApiModelProperty(example = "Identity verified", value = "Estado de la verificación con base en los ajustes de perfil.")
  public String getIdentityVerified() {
    return identityVerified;
  }
  public void setIdentityVerified(String identityVerified) {
    this.identityVerified = identityVerified;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAirbnb responseAirbnb = (ResponseAirbnb) o;
    return Objects.equals(this.registered, responseAirbnb.registered) &&
        Objects.equals(this.image, responseAirbnb.image) &&
        Objects.equals(this.location, responseAirbnb.location) &&
        Objects.equals(this.about, responseAirbnb.about) &&
        Objects.equals(this.firstName, responseAirbnb.firstName) &&
        Objects.equals(this.createdAt, responseAirbnb.createdAt) &&
        Objects.equals(this.revieweeCount, responseAirbnb.revieweeCount) &&
        Objects.equals(this.trips, responseAirbnb.trips) &&
        Objects.equals(this.work, responseAirbnb.work) &&
        Objects.equals(this.identityVerified, responseAirbnb.identityVerified);
  }
  @Override
  public int hashCode() {
    return Objects.hash(registered, image, location, about, firstName, createdAt, revieweeCount, trips, work, identityVerified);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAirbnb {\n");
    
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    revieweeCount: ").append(toIndentedString(revieweeCount)).append("\n");
    sb.append("    trips: ").append(toIndentedString(trips)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    identityVerified: ").append(toIndentedString(identityVerified)).append("\n");
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
