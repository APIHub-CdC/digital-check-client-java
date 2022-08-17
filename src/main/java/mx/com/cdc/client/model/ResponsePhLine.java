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
@ApiModel(description = "Detalle del número telefónico con alguna cuenta existente de line.")


public class ResponsePhLine {
  @SerializedName("registered")
  private Boolean registered = null;
  @SerializedName("photo")
  private String photo = null;
  @SerializedName("name")
  private String name = null;
  public ResponsePhLine registered(Boolean registered) {
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
  public ResponsePhLine photo(String photo) {
    this.photo = photo;
    return this;
  }
   
  @ApiModelProperty(example = "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", value = "Imagen codificada en Base64 del usuario.")
  public String getPhoto() {
    return photo;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public ResponsePhLine name(String name) {
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
    ResponsePhLine responsePhLine = (ResponsePhLine) o;
    return Objects.equals(this.registered, responsePhLine.registered) &&
        Objects.equals(this.photo, responsePhLine.photo) &&
        Objects.equals(this.name, responsePhLine.name);
  }
  @Override
  public int hashCode() {
    return Objects.hash(registered, photo, name);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePhLine {\n");
    
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
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
