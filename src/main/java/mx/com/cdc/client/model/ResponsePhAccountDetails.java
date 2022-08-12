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
import mx.com.cdc.client.model.ResponsePhBukalapak;
import mx.com.cdc.client.model.ResponsePhFacebook;
import mx.com.cdc.client.model.ResponsePhFlipkart;
import mx.com.cdc.client.model.ResponsePhGoogle;
import mx.com.cdc.client.model.ResponsePhInstagram;
import mx.com.cdc.client.model.ResponsePhJdid;
import mx.com.cdc.client.model.ResponsePhKakao;
import mx.com.cdc.client.model.ResponsePhLine;
import mx.com.cdc.client.model.ResponsePhMicrosoft;
import mx.com.cdc.client.model.ResponsePhOk;
import mx.com.cdc.client.model.ResponsePhSkype;
import mx.com.cdc.client.model.ResponsePhSnapchat;
import mx.com.cdc.client.model.ResponsePhTelegram;
import mx.com.cdc.client.model.ResponsePhTwitter;
import mx.com.cdc.client.model.ResponsePhViber;
import mx.com.cdc.client.model.ResponsePhWhatsapp;
import mx.com.cdc.client.model.ResponsePhYahoo;
import mx.com.cdc.client.model.ResponsePhZalo;

import java.io.IOException;
@ApiModel(description = "Detalle de las cuentas de redes sociales asociadas al número telefónico.")


public class ResponsePhAccountDetails {
  @SerializedName("facebook")
  private ResponsePhFacebook facebook = null;
  @SerializedName("google")
  private ResponsePhGoogle google = null;
  @SerializedName("twitter")
  private ResponsePhTwitter twitter = null;
  @SerializedName("instagram")
  private ResponsePhInstagram instagram = null;
  @SerializedName("yahoo")
  private ResponsePhYahoo yahoo = null;
  @SerializedName("microsoft")
  private ResponsePhMicrosoft microsoft = null;
  @SerializedName("snapchat")
  private ResponsePhSnapchat snapchat = null;
  @SerializedName("skype")
  private ResponsePhSkype skype = null;
  @SerializedName("whatsapp")
  private ResponsePhWhatsapp whatsapp = null;
  @SerializedName("telegram")
  private ResponsePhTelegram telegram = null;
  @SerializedName("viber")
  private ResponsePhViber viber = null;
  @SerializedName("kakao")
  private ResponsePhKakao kakao = null;
  @SerializedName("ok")
  private ResponsePhOk ok = null;
  @SerializedName("zalo")
  private ResponsePhZalo zalo = null;
  @SerializedName("line")
  private ResponsePhLine line = null;
  @SerializedName("flipkart")
  private ResponsePhFlipkart flipkart = null;
  @SerializedName("bukalapak")
  private ResponsePhBukalapak bukalapak = null;
  @SerializedName("jdid")
  private ResponsePhJdid jdid = null;
  public ResponsePhAccountDetails facebook(ResponsePhFacebook facebook) {
    this.facebook = facebook;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhFacebook getFacebook() {
    return facebook;
  }
  public void setFacebook(ResponsePhFacebook facebook) {
    this.facebook = facebook;
  }
  public ResponsePhAccountDetails google(ResponsePhGoogle google) {
    this.google = google;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhGoogle getGoogle() {
    return google;
  }
  public void setGoogle(ResponsePhGoogle google) {
    this.google = google;
  }
  public ResponsePhAccountDetails twitter(ResponsePhTwitter twitter) {
    this.twitter = twitter;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhTwitter getTwitter() {
    return twitter;
  }
  public void setTwitter(ResponsePhTwitter twitter) {
    this.twitter = twitter;
  }
  public ResponsePhAccountDetails instagram(ResponsePhInstagram instagram) {
    this.instagram = instagram;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhInstagram getInstagram() {
    return instagram;
  }
  public void setInstagram(ResponsePhInstagram instagram) {
    this.instagram = instagram;
  }
  public ResponsePhAccountDetails yahoo(ResponsePhYahoo yahoo) {
    this.yahoo = yahoo;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhYahoo getYahoo() {
    return yahoo;
  }
  public void setYahoo(ResponsePhYahoo yahoo) {
    this.yahoo = yahoo;
  }
  public ResponsePhAccountDetails microsoft(ResponsePhMicrosoft microsoft) {
    this.microsoft = microsoft;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhMicrosoft getMicrosoft() {
    return microsoft;
  }
  public void setMicrosoft(ResponsePhMicrosoft microsoft) {
    this.microsoft = microsoft;
  }
  public ResponsePhAccountDetails snapchat(ResponsePhSnapchat snapchat) {
    this.snapchat = snapchat;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhSnapchat getSnapchat() {
    return snapchat;
  }
  public void setSnapchat(ResponsePhSnapchat snapchat) {
    this.snapchat = snapchat;
  }
  public ResponsePhAccountDetails skype(ResponsePhSkype skype) {
    this.skype = skype;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhSkype getSkype() {
    return skype;
  }
  public void setSkype(ResponsePhSkype skype) {
    this.skype = skype;
  }
  public ResponsePhAccountDetails whatsapp(ResponsePhWhatsapp whatsapp) {
    this.whatsapp = whatsapp;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhWhatsapp getWhatsapp() {
    return whatsapp;
  }
  public void setWhatsapp(ResponsePhWhatsapp whatsapp) {
    this.whatsapp = whatsapp;
  }
  public ResponsePhAccountDetails telegram(ResponsePhTelegram telegram) {
    this.telegram = telegram;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhTelegram getTelegram() {
    return telegram;
  }
  public void setTelegram(ResponsePhTelegram telegram) {
    this.telegram = telegram;
  }
  public ResponsePhAccountDetails viber(ResponsePhViber viber) {
    this.viber = viber;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhViber getViber() {
    return viber;
  }
  public void setViber(ResponsePhViber viber) {
    this.viber = viber;
  }
  public ResponsePhAccountDetails kakao(ResponsePhKakao kakao) {
    this.kakao = kakao;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhKakao getKakao() {
    return kakao;
  }
  public void setKakao(ResponsePhKakao kakao) {
    this.kakao = kakao;
  }
  public ResponsePhAccountDetails ok(ResponsePhOk ok) {
    this.ok = ok;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhOk getOk() {
    return ok;
  }
  public void setOk(ResponsePhOk ok) {
    this.ok = ok;
  }
  public ResponsePhAccountDetails zalo(ResponsePhZalo zalo) {
    this.zalo = zalo;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhZalo getZalo() {
    return zalo;
  }
  public void setZalo(ResponsePhZalo zalo) {
    this.zalo = zalo;
  }
  public ResponsePhAccountDetails line(ResponsePhLine line) {
    this.line = line;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhLine getLine() {
    return line;
  }
  public void setLine(ResponsePhLine line) {
    this.line = line;
  }
  public ResponsePhAccountDetails flipkart(ResponsePhFlipkart flipkart) {
    this.flipkart = flipkart;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhFlipkart getFlipkart() {
    return flipkart;
  }
  public void setFlipkart(ResponsePhFlipkart flipkart) {
    this.flipkart = flipkart;
  }
  public ResponsePhAccountDetails bukalapak(ResponsePhBukalapak bukalapak) {
    this.bukalapak = bukalapak;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhBukalapak getBukalapak() {
    return bukalapak;
  }
  public void setBukalapak(ResponsePhBukalapak bukalapak) {
    this.bukalapak = bukalapak;
  }
  public ResponsePhAccountDetails jdid(ResponsePhJdid jdid) {
    this.jdid = jdid;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePhJdid getJdid() {
    return jdid;
  }
  public void setJdid(ResponsePhJdid jdid) {
    this.jdid = jdid;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePhAccountDetails responsePhAccountDetails = (ResponsePhAccountDetails) o;
    return Objects.equals(this.facebook, responsePhAccountDetails.facebook) &&
        Objects.equals(this.google, responsePhAccountDetails.google) &&
        Objects.equals(this.twitter, responsePhAccountDetails.twitter) &&
        Objects.equals(this.instagram, responsePhAccountDetails.instagram) &&
        Objects.equals(this.yahoo, responsePhAccountDetails.yahoo) &&
        Objects.equals(this.microsoft, responsePhAccountDetails.microsoft) &&
        Objects.equals(this.snapchat, responsePhAccountDetails.snapchat) &&
        Objects.equals(this.skype, responsePhAccountDetails.skype) &&
        Objects.equals(this.whatsapp, responsePhAccountDetails.whatsapp) &&
        Objects.equals(this.telegram, responsePhAccountDetails.telegram) &&
        Objects.equals(this.viber, responsePhAccountDetails.viber) &&
        Objects.equals(this.kakao, responsePhAccountDetails.kakao) &&
        Objects.equals(this.ok, responsePhAccountDetails.ok) &&
        Objects.equals(this.zalo, responsePhAccountDetails.zalo) &&
        Objects.equals(this.line, responsePhAccountDetails.line) &&
        Objects.equals(this.flipkart, responsePhAccountDetails.flipkart) &&
        Objects.equals(this.bukalapak, responsePhAccountDetails.bukalapak) &&
        Objects.equals(this.jdid, responsePhAccountDetails.jdid);
  }
  @Override
  public int hashCode() {
    return Objects.hash(facebook, google, twitter, instagram, yahoo, microsoft, snapchat, skype, whatsapp, telegram, viber, kakao, ok, zalo, line, flipkart, bukalapak, jdid);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePhAccountDetails {\n");
    
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    google: ").append(toIndentedString(google)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    instagram: ").append(toIndentedString(instagram)).append("\n");
    sb.append("    yahoo: ").append(toIndentedString(yahoo)).append("\n");
    sb.append("    microsoft: ").append(toIndentedString(microsoft)).append("\n");
    sb.append("    snapchat: ").append(toIndentedString(snapchat)).append("\n");
    sb.append("    skype: ").append(toIndentedString(skype)).append("\n");
    sb.append("    whatsapp: ").append(toIndentedString(whatsapp)).append("\n");
    sb.append("    telegram: ").append(toIndentedString(telegram)).append("\n");
    sb.append("    viber: ").append(toIndentedString(viber)).append("\n");
    sb.append("    kakao: ").append(toIndentedString(kakao)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    zalo: ").append(toIndentedString(zalo)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    flipkart: ").append(toIndentedString(flipkart)).append("\n");
    sb.append("    bukalapak: ").append(toIndentedString(bukalapak)).append("\n");
    sb.append("    jdid: ").append(toIndentedString(jdid)).append("\n");
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
