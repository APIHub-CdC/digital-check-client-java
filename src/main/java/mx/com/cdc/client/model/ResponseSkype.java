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
@ApiModel(description = "Detalle del correo electrónico con alguna cuenta existente de skype.")


public class ResponseSkype {
  @SerializedName("registered")
  private Boolean registered = null;
  @SerializedName("photo")
  private String photo = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("gender")
  private Integer gender = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("handle")
  private String handle = null;
  @SerializedName("bio")
  private String bio = null;
  @SerializedName("age")
  private Integer age = null;
  @SerializedName("language")
  private String language = null;
  @SerializedName("state")
  private String state = null;
  public ResponseSkype registered(Boolean registered) {
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
  public ResponseSkype photo(String photo) {
    this.photo = photo;
    return this;
  }
   
  @ApiModelProperty(example = "https://avatar.skype.com/v1/avatars/live:luisginclan/public?returnDefaultImage=true", value = "URL de la foto de perfil en caso de existir.")
  public String getPhoto() {
    return photo;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public ResponseSkype name(String name) {
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
  public ResponseSkype country(String country) {
    this.country = country;
    return this;
  }
   
  @ApiModelProperty(example = "México", value = "País con base en los ajustes de perfil.")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public ResponseSkype city(String city) {
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
  public ResponseSkype gender(Integer gender) {
    this.gender = gender;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "Sexo con base en los ajustes de perfil. Valores posibles: 1 (Hombre), 2 (Mujer).")
  public Integer getGender() {
    return gender;
  }
  public void setGender(Integer gender) {
    this.gender = gender;
  }
  public ResponseSkype id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(example = "live:luisginclan", value = "Identificador único del perfil.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public ResponseSkype handle(String handle) {
    this.handle = handle;
    return this;
  }
   
  @ApiModelProperty(example = "live:luisginclan", value = "Manejo de la cuenta. Texto libre.")
  public String getHandle() {
    return handle;
  }
  public void setHandle(String handle) {
    this.handle = handle;
  }
  public ResponseSkype bio(String bio) {
    this.bio = bio;
    return this;
  }
   
  @ApiModelProperty(example = "Apasionado por la finanzas y la tecnología, de gran espiritu de trabajo en equipo.", value = "Biografía del perfil. Texto Libre.")
  public String getBio() {
    return bio;
  }
  public void setBio(String bio) {
    this.bio = bio;
  }
  public ResponseSkype age(Integer age) {
    this.age = age;
    return this;
  }
   
  @ApiModelProperty(example = "40", value = "Edad del usuario con base en lo ajustes de perfil.")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }
  public ResponseSkype language(String language) {
    this.language = language;
    return this;
  }
   
  @ApiModelProperty(value = "Idioma con base en la configuración de perfil.")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }
  public ResponseSkype state(String state) {
    this.state = state;
    return this;
  }
   
  @ApiModelProperty(value = "Estado de la relación del usuario con base en los ajustes de perfil.")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseSkype responseSkype = (ResponseSkype) o;
    return Objects.equals(this.registered, responseSkype.registered) &&
        Objects.equals(this.photo, responseSkype.photo) &&
        Objects.equals(this.name, responseSkype.name) &&
        Objects.equals(this.country, responseSkype.country) &&
        Objects.equals(this.city, responseSkype.city) &&
        Objects.equals(this.gender, responseSkype.gender) &&
        Objects.equals(this.id, responseSkype.id) &&
        Objects.equals(this.handle, responseSkype.handle) &&
        Objects.equals(this.bio, responseSkype.bio) &&
        Objects.equals(this.age, responseSkype.age) &&
        Objects.equals(this.language, responseSkype.language) &&
        Objects.equals(this.state, responseSkype.state);
  }
  @Override
  public int hashCode() {
    return Objects.hash(registered, photo, name, country, city, gender, id, handle, bio, age, language, state);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseSkype {\n");
    
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
