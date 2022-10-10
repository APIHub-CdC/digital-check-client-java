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
import mx.com.cdc.client.model.ResponsePhAccountDetails;

import java.io.IOException;
import java.math.BigDecimal;
@ApiModel(description = "Detalle del número telefónico.")


public class ResponsePhoneDetails {
  @SerializedName("number")
  private Integer number = null;
  @SerializedName("valid")
  private Boolean valid = null;
  
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PREMIUM_RATE("PREMIUM_RATE"),
    
    TOLL_FREE("TOLL_FREE"),
    
    SHARED_COST("SHARED_COST"),
    
    VOIP("VOIP"),
    
    PERSONAL_NUMBER("PERSONAL_NUMBER"),
    
    PAGER("PAGER"),
    
    UAN("UAN"),
    
    VOICEMAIL("VOICEMAIL"),
    
    FIXED_LINE_OR_MOBILE("FIXED_LINE_OR_MOBILE"),
    
    FIXED_LINE("FIXED_LINE"),
    
    MOBILE("MOBILE");
    private String value;
    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("carrier")
  private String carrier = null;
  @SerializedName("grade")
  private BigDecimal grade = null;
  @SerializedName("account_details")
  private ResponsePhAccountDetails accountDetails = null;
  public ResponsePhoneDetails number(Integer number) {
    this.number = number;
    return this;
  }
   
  @ApiModelProperty(example = "525510176606", value = "Número telefónico del usuario.")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }
  public ResponsePhoneDetails valid(Boolean valid) {
    this.valid = valid;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el número telefónico es válido con base en la longitud e información del prefijo.")
  public Boolean isValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
  public ResponsePhoneDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }
   
  @ApiModelProperty(example = "MOBILE", value = "Tipo de teléfono con base en el número.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
  public ResponsePhoneDetails country(String country) {
    this.country = country;
    return this;
  }
   
  @ApiModelProperty(example = "MX", value = "Código de país asociado con el número telefónico. Formato estándar de dos caracteres ISO 3166-1.")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public ResponsePhoneDetails carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }
   
  @ApiModelProperty(example = "Radiomovil DIPSA", value = "Compañía telefónica con base en el número telefónico.")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }
  public ResponsePhoneDetails grade(BigDecimal grade) {
    this.grade = grade;
    return this;
  }
   
  @ApiModelProperty(example = "15.0", value = "Grade de 0 a 100 que indica la probabilidad de que el número telefónico sea fraudulento.")
  public BigDecimal getGrade() {
    return grade;
  }
  public void setGrade(BigDecimal grade) {
    this.grade = grade;
  }
  public ResponsePhoneDetails accountDetails(ResponsePhAccountDetails accountDetails) {
    this.accountDetails = accountDetails;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhAccountDetails getAccountDetails() {
    return accountDetails;
  }
  public void setAccountDetails(ResponsePhAccountDetails accountDetails) {
    this.accountDetails = accountDetails;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePhoneDetails responsePhoneDetails = (ResponsePhoneDetails) o;
    return Objects.equals(this.number, responsePhoneDetails.number) &&
        Objects.equals(this.valid, responsePhoneDetails.valid) &&
        Objects.equals(this.type, responsePhoneDetails.type) &&
        Objects.equals(this.country, responsePhoneDetails.country) &&
        Objects.equals(this.carrier, responsePhoneDetails.carrier) &&
        Objects.equals(this.grade, responsePhoneDetails.grade) &&
        Objects.equals(this.accountDetails, responsePhoneDetails.accountDetails);
  }
  @Override
  public int hashCode() {
    return Objects.hash(number, valid, type, country, carrier, grade, accountDetails);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePhoneDetails {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
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
