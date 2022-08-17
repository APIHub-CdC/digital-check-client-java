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
import mx.com.cdc.client.model.ResponseData;
import mx.com.cdc.client.model.ResponseError;

import java.io.IOException;


public class Response {
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;
  @SerializedName("folioConsulta")
  private String folioConsulta = null;
  @SerializedName("error")
  private ResponseError error = null;
  @SerializedName("data")
  private ResponseData data = null;
  public Response success(Boolean success) {
    this.success = success;
    return this;
  }
   
  @ApiModelProperty(value = "Indicador de éxito de la consulta.")
  public Boolean isSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }
  public Response folioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "10011956", value = "Folio interno del Otorgante.")
  public String getFolioOtorgante() {
    return folioOtorgante;
  }
  public void setFolioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
  }
  public Response folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "Folio de consulta de Digital Checks.")
  public String getFolioConsulta() {
    return folioConsulta;
  }
  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }
  public Response error(ResponseError error) {
    this.error = error;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseError getError() {
    return error;
  }
  public void setError(ResponseError error) {
    this.error = error;
  }
  public Response data(ResponseData data) {
    this.data = data;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseData getData() {
    return data;
  }
  public void setData(ResponseData data) {
    this.data = data;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.success, response.success) &&
        Objects.equals(this.folioOtorgante, response.folioOtorgante) &&
        Objects.equals(this.folioConsulta, response.folioConsulta) &&
        Objects.equals(this.error, response.error) &&
        Objects.equals(this.data, response.data);
  }
  @Override
  public int hashCode() {
    return Objects.hash(success, folioOtorgante, folioConsulta, error, data);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
