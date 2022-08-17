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
@ApiModel(description = "Cada objeto describe una regla que ha sido activada. Min: 0, Máx: 10")


public class ResponseAppliedRules {
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    PLUS("+"),
    
    QUOTE("'"),
    
    APPROVE("APPROVE"),
    
    REVIEW("REVIEW"),
    
    DECLINE("DECLINE"),
    
    BLACKLIST("BLACKLIST"),
    
    WHITELIST("WHITELIST"),
    
    LIST("LIST");
    private String value;
    OperationEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperationEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("operation")
  private OperationEnum operation = null;
  @SerializedName("score")
  private BigDecimal score = null;
  public ResponseAppliedRules id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(example = "HC129", value = "Identificador único de la regla.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public ResponseAppliedRules name(String name) {
    this.name = name;
    return this;
  }
   
  @ApiModelProperty(example = "Phone country and IP country does not match", value = "Nombre de la regla.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public ResponseAppliedRules operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }
   
  @ApiModelProperty(example = "+", value = "Operación de la regla.")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }
  public ResponseAppliedRules score(BigDecimal score) {
    this.score = score;
    return this;
  }
   
  @ApiModelProperty(example = "2.0", value = "Score de la regla.")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAppliedRules responseAppliedRules = (ResponseAppliedRules) o;
    return Objects.equals(this.id, responseAppliedRules.id) &&
        Objects.equals(this.name, responseAppliedRules.name) &&
        Objects.equals(this.operation, responseAppliedRules.operation) &&
        Objects.equals(this.score, responseAppliedRules.score);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, name, operation, score);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAppliedRules {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
