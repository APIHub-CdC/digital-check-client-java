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


public class Otorgante {
  @SerializedName("FolioOtorgante")
  private String folioOtorgante = null;
  @SerializedName("FolioConsulta")
  private String folioConsulta = null;
  @SerializedName("ip")
  private String ip = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  public Otorgante folioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "94762", required = true, value = "")
  public String getFolioOtorgante() {
    return folioOtorgante;
  }
  public void setFolioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
  }
  public Otorgante folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "X", required = true, value = "Folio de consulta del RC o RCC para identificar al solicitante de crédito ")
  public String getFolioConsulta() {
    return folioConsulta;
  }
  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }
  public Otorgante ip(String ip) {
    this.ip = ip;
    return this;
  }
   
  @ApiModelProperty(example = "104.28.11.164", value = "")
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }
  public Otorgante email(String email) {
    this.email = email;
    return this;
  }
   
  @ApiModelProperty(example = "nombre.apellido@gmail.com", required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public Otorgante phone(String phone) {
    this.phone = phone;
    return this;
  }
   
  @ApiModelProperty(example = "525510176606", value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Otorgante otorgante = (Otorgante) o;
    return Objects.equals(this.folioOtorgante, otorgante.folioOtorgante) &&
        Objects.equals(this.folioConsulta, otorgante.folioConsulta) &&
        Objects.equals(this.ip, otorgante.ip) &&
        Objects.equals(this.email, otorgante.email) &&
        Objects.equals(this.phone, otorgante.phone);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioOtorgante, folioConsulta, ip, email, phone);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Otorgante {\n");
    
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
