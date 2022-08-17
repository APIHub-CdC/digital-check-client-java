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


public class ResponseDomainDetails {
  @SerializedName("domain")
  private String domain = null;
  @SerializedName("tld")
  private String tld = null;
  @SerializedName("registered")
  private Boolean registered = null;
  @SerializedName("created")
  private String created = null;
  @SerializedName("updated")
  private String updated = null;
  @SerializedName("expires")
  private String expires = null;
  @SerializedName("registrar_name")
  private String registrarName = null;
  @SerializedName("registered_to")
  private String registeredTo = null;
  @SerializedName("disposable")
  private Boolean disposable = null;
  @SerializedName("free")
  private Boolean free = null;
  @SerializedName("custom")
  private Boolean custom = null;
  @SerializedName("dmarc_enforced")
  private Boolean dmarcEnforced = null;
  @SerializedName("spf_strict")
  private Boolean spfStrict = null;
  @SerializedName("valid_mx")
  private Boolean validMx = null;
  @SerializedName("accept_all")
  private Boolean acceptAll = null;
  @SerializedName("suspicious_tld")
  private Boolean suspiciousTld = null;
  @SerializedName("website_exists")
  private Boolean websiteExists = null;
  public ResponseDomainDetails domain(String domain) {
    this.domain = domain;
    return this;
  }
   
  @ApiModelProperty(example = "gmail.com", value = "El dominio de la dirección de correo electrónico del cliente")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }
  public ResponseDomainDetails tld(String tld) {
    this.tld = tld;
    return this;
  }
   
  @ApiModelProperty(example = ".com", value = "El dominio de nivel superior.")
  public String getTld() {
    return tld;
  }
  public void setTld(String tld) {
    this.tld = tld;
  }
  public ResponseDomainDetails registered(Boolean registered) {
    this.registered = registered;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el dominio del correo electrónico se encuentra registrado")
  public Boolean isRegistered() {
    return registered;
  }
  public void setRegistered(Boolean registered) {
    this.registered = registered;
  }
  public ResponseDomainDetails created(String created) {
    this.created = created;
    return this;
  }
   
  @ApiModelProperty(example = "1995-08-13 04:00:00", value = "Fecha y hora de creación del dominio de correo electrónico (zona horaria UTC).")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }
  public ResponseDomainDetails updated(String updated) {
    this.updated = updated;
    return this;
  }
   
  @ApiModelProperty(example = "2022-07-11 09:25:59", value = "Fecha y hora de la última actualización del dominio de correo electrónico (zona horaria UTC).")
  public String getUpdated() {
    return updated;
  }
  public void setUpdated(String updated) {
    this.updated = updated;
  }
  public ResponseDomainDetails expires(String expires) {
    this.expires = expires;
    return this;
  }
   
  @ApiModelProperty(example = "2023-08-12 04:00:00", value = "Fecha y hora de vencimiento del dominio de correo electrónico (zona horaria UTC).")
  public String getExpires() {
    return expires;
  }
  public void setExpires(String expires) {
    this.expires = expires;
  }
  public ResponseDomainDetails registrarName(String registrarName) {
    this.registrarName = registrarName;
    return this;
  }
   
  @ApiModelProperty(example = "MarkMonitor Inc.", value = "Nombre de la empresa que gestiona la reserva del nombre de dominio.")
  public String getRegistrarName() {
    return registrarName;
  }
  public void setRegistrarName(String registrarName) {
    this.registrarName = registrarName;
  }
  public ResponseDomainDetails registeredTo(String registeredTo) {
    this.registeredTo = registeredTo;
    return this;
  }
   
  @ApiModelProperty(example = "Google LLC", value = "Nombre de la empresa a la que está registrado el dominio.")
  public String getRegisteredTo() {
    return registeredTo;
  }
  public void setRegisteredTo(String registeredTo) {
    this.registeredTo = registeredTo;
  }
  public ResponseDomainDetails disposable(Boolean disposable) {
    this.disposable = disposable;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el dominio del correo electrónico es fraudulento (como correo desechable, dominios fraudulentos anteriores).")
  public Boolean isDisposable() {
    return disposable;
  }
  public void setDisposable(Boolean disposable) {
    this.disposable = disposable;
  }
  public ResponseDomainDetails free(Boolean free) {
    this.free = free;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el dominio del correo electrónico es un proveedor gratuito (como gmail, hotmail, etc.).")
  public Boolean isFree() {
    return free;
  }
  public void setFree(Boolean free) {
    this.free = free;
  }
  public ResponseDomainDetails custom(Boolean custom) {
    this.custom = custom;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el dominio del correo electrónico es personalizado (como dominio de empresa, no gratuito ni descartable).")
  public Boolean isCustom() {
    return custom;
  }
  public void setCustom(Boolean custom) {
    this.custom = custom;
  }
  public ResponseDomainDetails dmarcEnforced(Boolean dmarcEnforced) {
    this.dmarcEnforced = dmarcEnforced;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el dominio del correo electrónico se aplica DMARC (Informes y conformidad de autenticación de mensajes basados en dominio).")
  public Boolean isDmarcEnforced() {
    return dmarcEnforced;
  }
  public void setDmarcEnforced(Boolean dmarcEnforced) {
    this.dmarcEnforced = dmarcEnforced;
  }
  public ResponseDomainDetails spfStrict(Boolean spfStrict) {
    this.spfStrict = spfStrict;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el SPF es suficientemente estricto para evitar la suplantación de identidad.")
  public Boolean isSpfStrict() {
    return spfStrict;
  }
  public void setSpfStrict(Boolean spfStrict) {
    this.spfStrict = spfStrict;
  }
  public ResponseDomainDetails validMx(Boolean validMx) {
    this.validMx = validMx;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si los registros MX del dominio son válidos.")
  public Boolean isValidMx() {
    return validMx;
  }
  public void setValidMx(Boolean validMx) {
    this.validMx = validMx;
  }
  public ResponseDomainDetails acceptAll(Boolean acceptAll) {
    this.acceptAll = acceptAll;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el servidor está configurado para recibir todos los correos electrónicos en este dominio.")
  public Boolean isAcceptAll() {
    return acceptAll;
  }
  public void setAcceptAll(Boolean acceptAll) {
    this.acceptAll = acceptAll;
  }
  public ResponseDomainDetails suspiciousTld(Boolean suspiciousTld) {
    this.suspiciousTld = suspiciousTld;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el dominio de nivel superior del correo electrónico es probablemente fraudulento o riesgoso.")
  public Boolean isSuspiciousTld() {
    return suspiciousTld;
  }
  public void setSuspiciousTld(Boolean suspiciousTld) {
    this.suspiciousTld = suspiciousTld;
  }
  public ResponseDomainDetails websiteExists(Boolean websiteExists) {
    this.websiteExists = websiteExists;
    return this;
  }
   
  @ApiModelProperty(value = "Indica si el dominio del correo electrónico tiene un sitio web.")
  public Boolean isWebsiteExists() {
    return websiteExists;
  }
  public void setWebsiteExists(Boolean websiteExists) {
    this.websiteExists = websiteExists;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDomainDetails responseDomainDetails = (ResponseDomainDetails) o;
    return Objects.equals(this.domain, responseDomainDetails.domain) &&
        Objects.equals(this.tld, responseDomainDetails.tld) &&
        Objects.equals(this.registered, responseDomainDetails.registered) &&
        Objects.equals(this.created, responseDomainDetails.created) &&
        Objects.equals(this.updated, responseDomainDetails.updated) &&
        Objects.equals(this.expires, responseDomainDetails.expires) &&
        Objects.equals(this.registrarName, responseDomainDetails.registrarName) &&
        Objects.equals(this.registeredTo, responseDomainDetails.registeredTo) &&
        Objects.equals(this.disposable, responseDomainDetails.disposable) &&
        Objects.equals(this.free, responseDomainDetails.free) &&
        Objects.equals(this.custom, responseDomainDetails.custom) &&
        Objects.equals(this.dmarcEnforced, responseDomainDetails.dmarcEnforced) &&
        Objects.equals(this.spfStrict, responseDomainDetails.spfStrict) &&
        Objects.equals(this.validMx, responseDomainDetails.validMx) &&
        Objects.equals(this.acceptAll, responseDomainDetails.acceptAll) &&
        Objects.equals(this.suspiciousTld, responseDomainDetails.suspiciousTld) &&
        Objects.equals(this.websiteExists, responseDomainDetails.websiteExists);
  }
  @Override
  public int hashCode() {
    return Objects.hash(domain, tld, registered, created, updated, expires, registrarName, registeredTo, disposable, free, custom, dmarcEnforced, spfStrict, validMx, acceptAll, suspiciousTld, websiteExists);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDomainDetails {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    tld: ").append(toIndentedString(tld)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    registrarName: ").append(toIndentedString(registrarName)).append("\n");
    sb.append("    registeredTo: ").append(toIndentedString(registeredTo)).append("\n");
    sb.append("    disposable: ").append(toIndentedString(disposable)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    dmarcEnforced: ").append(toIndentedString(dmarcEnforced)).append("\n");
    sb.append("    spfStrict: ").append(toIndentedString(spfStrict)).append("\n");
    sb.append("    validMx: ").append(toIndentedString(validMx)).append("\n");
    sb.append("    acceptAll: ").append(toIndentedString(acceptAll)).append("\n");
    sb.append("    suspiciousTld: ").append(toIndentedString(suspiciousTld)).append("\n");
    sb.append("    websiteExists: ").append(toIndentedString(websiteExists)).append("\n");
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
