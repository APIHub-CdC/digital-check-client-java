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
@ApiModel(description = "Detalle del correo electrónico con alguna cuenta existente de atlassian.")


public class ResponseAtlassian {
  @SerializedName("registered")
  private Boolean registered = null;
  public ResponseAtlassian registered(Boolean registered) {
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
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAtlassian responseAtlassian = (ResponseAtlassian) o;
    return Objects.equals(this.registered, responseAtlassian.registered);
  }
  @Override
  public int hashCode() {
    return Objects.hash(registered);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAtlassian {\n");
    
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
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
