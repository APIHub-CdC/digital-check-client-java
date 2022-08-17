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
import mx.com.cdc.client.model.ResponseAdobe;
import mx.com.cdc.client.model.ResponseAirbnb;
import mx.com.cdc.client.model.ResponseAmazon;
import mx.com.cdc.client.model.ResponseApple;
import mx.com.cdc.client.model.ResponseArchiveorg;
import mx.com.cdc.client.model.ResponseAtlassian;
import mx.com.cdc.client.model.ResponseBooking;
import mx.com.cdc.client.model.ResponseBukalapak;
import mx.com.cdc.client.model.ResponseDiscord;
import mx.com.cdc.client.model.ResponseDisneyplus;
import mx.com.cdc.client.model.ResponseEbay;
import mx.com.cdc.client.model.ResponseEnvato;
import mx.com.cdc.client.model.ResponseEvernote;
import mx.com.cdc.client.model.ResponseFacebook;
import mx.com.cdc.client.model.ResponseFlickr;
import mx.com.cdc.client.model.ResponseFlipkart;
import mx.com.cdc.client.model.ResponseFoursquare;
import mx.com.cdc.client.model.ResponseGithub;
import mx.com.cdc.client.model.ResponseGoogle;
import mx.com.cdc.client.model.ResponseGravatar;
import mx.com.cdc.client.model.ResponseImgur;
import mx.com.cdc.client.model.ResponseInstagram;
import mx.com.cdc.client.model.ResponseJdid;
import mx.com.cdc.client.model.ResponseKakao;
import mx.com.cdc.client.model.ResponseLastfm;
import mx.com.cdc.client.model.ResponseLazada;
import mx.com.cdc.client.model.ResponseLinkedin;
import mx.com.cdc.client.model.ResponseMailru;
import mx.com.cdc.client.model.ResponseMicrosoft;
import mx.com.cdc.client.model.ResponseMyspace;
import mx.com.cdc.client.model.ResponseNetflix;
import mx.com.cdc.client.model.ResponseOk;
import mx.com.cdc.client.model.ResponsePatreon;
import mx.com.cdc.client.model.ResponsePinterest;
import mx.com.cdc.client.model.ResponseQuora;
import mx.com.cdc.client.model.ResponseQzone;
import mx.com.cdc.client.model.ResponseRambler;
import mx.com.cdc.client.model.ResponseSamsung;
import mx.com.cdc.client.model.ResponseSkype;
import mx.com.cdc.client.model.ResponseSpotify;
import mx.com.cdc.client.model.ResponseTokopedia;
import mx.com.cdc.client.model.ResponseTumblr;
import mx.com.cdc.client.model.ResponseTwitter;
import mx.com.cdc.client.model.ResponseVimeo;
import mx.com.cdc.client.model.ResponseWeibo;
import mx.com.cdc.client.model.ResponseWordpress;
import mx.com.cdc.client.model.ResponseYahoo;
import mx.com.cdc.client.model.ResponseZoho;

import java.io.IOException;
@ApiModel(description = "Detalle de las cuentas de redes sociales asociadas al correo electrónico")


public class ResponseAccountDetails {
  @SerializedName("apple")
  private ResponseApple apple = null;
  @SerializedName("ebay")
  private ResponseEbay ebay = null;
  @SerializedName("facebook")
  private ResponseFacebook facebook = null;
  @SerializedName("flickr")
  private ResponseFlickr flickr = null;
  @SerializedName("foursquare")
  private ResponseFoursquare foursquare = null;
  @SerializedName("github")
  private ResponseGithub github = null;
  @SerializedName("google")
  private ResponseGoogle google = null;
  @SerializedName("gravatar")
  private ResponseGravatar gravatar = null;
  @SerializedName("instagram")
  private ResponseInstagram instagram = null;
  @SerializedName("lastfm")
  private ResponseLastfm lastfm = null;
  @SerializedName("linkedin")
  private ResponseLinkedin linkedin = null;
  @SerializedName("microsoft")
  private ResponseMicrosoft microsoft = null;
  @SerializedName("myspace")
  private ResponseMyspace myspace = null;
  @SerializedName("pinterest")
  private ResponsePinterest pinterest = null;
  @SerializedName("skype")
  private ResponseSkype skype = null;
  @SerializedName("spotify")
  private ResponseSpotify spotify = null;
  @SerializedName("tumblr")
  private ResponseTumblr tumblr = null;
  @SerializedName("twitter")
  private ResponseTwitter twitter = null;
  @SerializedName("vimeo")
  private ResponseVimeo vimeo = null;
  @SerializedName("weibo")
  private ResponseWeibo weibo = null;
  @SerializedName("yahoo")
  private ResponseYahoo yahoo = null;
  @SerializedName("discord")
  private ResponseDiscord discord = null;
  @SerializedName("ok")
  private ResponseOk ok = null;
  @SerializedName("kakao")
  private ResponseKakao kakao = null;
  @SerializedName("booking")
  private ResponseBooking booking = null;
  @SerializedName("airbnb")
  private ResponseAirbnb airbnb = null;
  @SerializedName("amazon")
  private ResponseAmazon amazon = null;
  @SerializedName("qzone")
  private ResponseQzone qzone = null;
  @SerializedName("adobe")
  private ResponseAdobe adobe = null;
  @SerializedName("mailru")
  private ResponseMailru mailru = null;
  @SerializedName("wordpress")
  private ResponseWordpress wordpress = null;
  @SerializedName("imgur")
  private ResponseImgur imgur = null;
  @SerializedName("disneyplus")
  private ResponseDisneyplus disneyplus = null;
  @SerializedName("netflix")
  private ResponseNetflix netflix = null;
  @SerializedName("jdid")
  private ResponseJdid jdid = null;
  @SerializedName("flipkart")
  private ResponseFlipkart flipkart = null;
  @SerializedName("bukalapak")
  private ResponseBukalapak bukalapak = null;
  @SerializedName("archiveorg")
  private ResponseArchiveorg archiveorg = null;
  @SerializedName("lazada")
  private ResponseLazada lazada = null;
  @SerializedName("zoho")
  private ResponseZoho zoho = null;
  @SerializedName("samsung")
  private ResponseSamsung samsung = null;
  @SerializedName("evernote")
  private ResponseEvernote evernote = null;
  @SerializedName("envato")
  private ResponseEnvato envato = null;
  @SerializedName("patreon")
  private ResponsePatreon patreon = null;
  @SerializedName("tokopedia")
  private ResponseTokopedia tokopedia = null;
  @SerializedName("rambler")
  private ResponseRambler rambler = null;
  @SerializedName("quora")
  private ResponseQuora quora = null;
  @SerializedName("atlassian")
  private ResponseAtlassian atlassian = null;
  public ResponseAccountDetails apple(ResponseApple apple) {
    this.apple = apple;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseApple getApple() {
    return apple;
  }
  public void setApple(ResponseApple apple) {
    this.apple = apple;
  }
  public ResponseAccountDetails ebay(ResponseEbay ebay) {
    this.ebay = ebay;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseEbay getEbay() {
    return ebay;
  }
  public void setEbay(ResponseEbay ebay) {
    this.ebay = ebay;
  }
  public ResponseAccountDetails facebook(ResponseFacebook facebook) {
    this.facebook = facebook;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseFacebook getFacebook() {
    return facebook;
  }
  public void setFacebook(ResponseFacebook facebook) {
    this.facebook = facebook;
  }
  public ResponseAccountDetails flickr(ResponseFlickr flickr) {
    this.flickr = flickr;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseFlickr getFlickr() {
    return flickr;
  }
  public void setFlickr(ResponseFlickr flickr) {
    this.flickr = flickr;
  }
  public ResponseAccountDetails foursquare(ResponseFoursquare foursquare) {
    this.foursquare = foursquare;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseFoursquare getFoursquare() {
    return foursquare;
  }
  public void setFoursquare(ResponseFoursquare foursquare) {
    this.foursquare = foursquare;
  }
  public ResponseAccountDetails github(ResponseGithub github) {
    this.github = github;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseGithub getGithub() {
    return github;
  }
  public void setGithub(ResponseGithub github) {
    this.github = github;
  }
  public ResponseAccountDetails google(ResponseGoogle google) {
    this.google = google;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseGoogle getGoogle() {
    return google;
  }
  public void setGoogle(ResponseGoogle google) {
    this.google = google;
  }
  public ResponseAccountDetails gravatar(ResponseGravatar gravatar) {
    this.gravatar = gravatar;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseGravatar getGravatar() {
    return gravatar;
  }
  public void setGravatar(ResponseGravatar gravatar) {
    this.gravatar = gravatar;
  }
  public ResponseAccountDetails instagram(ResponseInstagram instagram) {
    this.instagram = instagram;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseInstagram getInstagram() {
    return instagram;
  }
  public void setInstagram(ResponseInstagram instagram) {
    this.instagram = instagram;
  }
  public ResponseAccountDetails lastfm(ResponseLastfm lastfm) {
    this.lastfm = lastfm;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseLastfm getLastfm() {
    return lastfm;
  }
  public void setLastfm(ResponseLastfm lastfm) {
    this.lastfm = lastfm;
  }
  public ResponseAccountDetails linkedin(ResponseLinkedin linkedin) {
    this.linkedin = linkedin;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseLinkedin getLinkedin() {
    return linkedin;
  }
  public void setLinkedin(ResponseLinkedin linkedin) {
    this.linkedin = linkedin;
  }
  public ResponseAccountDetails microsoft(ResponseMicrosoft microsoft) {
    this.microsoft = microsoft;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseMicrosoft getMicrosoft() {
    return microsoft;
  }
  public void setMicrosoft(ResponseMicrosoft microsoft) {
    this.microsoft = microsoft;
  }
  public ResponseAccountDetails myspace(ResponseMyspace myspace) {
    this.myspace = myspace;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseMyspace getMyspace() {
    return myspace;
  }
  public void setMyspace(ResponseMyspace myspace) {
    this.myspace = myspace;
  }
  public ResponseAccountDetails pinterest(ResponsePinterest pinterest) {
    this.pinterest = pinterest;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePinterest getPinterest() {
    return pinterest;
  }
  public void setPinterest(ResponsePinterest pinterest) {
    this.pinterest = pinterest;
  }
  public ResponseAccountDetails skype(ResponseSkype skype) {
    this.skype = skype;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseSkype getSkype() {
    return skype;
  }
  public void setSkype(ResponseSkype skype) {
    this.skype = skype;
  }
  public ResponseAccountDetails spotify(ResponseSpotify spotify) {
    this.spotify = spotify;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseSpotify getSpotify() {
    return spotify;
  }
  public void setSpotify(ResponseSpotify spotify) {
    this.spotify = spotify;
  }
  public ResponseAccountDetails tumblr(ResponseTumblr tumblr) {
    this.tumblr = tumblr;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseTumblr getTumblr() {
    return tumblr;
  }
  public void setTumblr(ResponseTumblr tumblr) {
    this.tumblr = tumblr;
  }
  public ResponseAccountDetails twitter(ResponseTwitter twitter) {
    this.twitter = twitter;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseTwitter getTwitter() {
    return twitter;
  }
  public void setTwitter(ResponseTwitter twitter) {
    this.twitter = twitter;
  }
  public ResponseAccountDetails vimeo(ResponseVimeo vimeo) {
    this.vimeo = vimeo;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseVimeo getVimeo() {
    return vimeo;
  }
  public void setVimeo(ResponseVimeo vimeo) {
    this.vimeo = vimeo;
  }
  public ResponseAccountDetails weibo(ResponseWeibo weibo) {
    this.weibo = weibo;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseWeibo getWeibo() {
    return weibo;
  }
  public void setWeibo(ResponseWeibo weibo) {
    this.weibo = weibo;
  }
  public ResponseAccountDetails yahoo(ResponseYahoo yahoo) {
    this.yahoo = yahoo;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseYahoo getYahoo() {
    return yahoo;
  }
  public void setYahoo(ResponseYahoo yahoo) {
    this.yahoo = yahoo;
  }
  public ResponseAccountDetails discord(ResponseDiscord discord) {
    this.discord = discord;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseDiscord getDiscord() {
    return discord;
  }
  public void setDiscord(ResponseDiscord discord) {
    this.discord = discord;
  }
  public ResponseAccountDetails ok(ResponseOk ok) {
    this.ok = ok;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseOk getOk() {
    return ok;
  }
  public void setOk(ResponseOk ok) {
    this.ok = ok;
  }
  public ResponseAccountDetails kakao(ResponseKakao kakao) {
    this.kakao = kakao;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseKakao getKakao() {
    return kakao;
  }
  public void setKakao(ResponseKakao kakao) {
    this.kakao = kakao;
  }
  public ResponseAccountDetails booking(ResponseBooking booking) {
    this.booking = booking;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseBooking getBooking() {
    return booking;
  }
  public void setBooking(ResponseBooking booking) {
    this.booking = booking;
  }
  public ResponseAccountDetails airbnb(ResponseAirbnb airbnb) {
    this.airbnb = airbnb;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseAirbnb getAirbnb() {
    return airbnb;
  }
  public void setAirbnb(ResponseAirbnb airbnb) {
    this.airbnb = airbnb;
  }
  public ResponseAccountDetails amazon(ResponseAmazon amazon) {
    this.amazon = amazon;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseAmazon getAmazon() {
    return amazon;
  }
  public void setAmazon(ResponseAmazon amazon) {
    this.amazon = amazon;
  }
  public ResponseAccountDetails qzone(ResponseQzone qzone) {
    this.qzone = qzone;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseQzone getQzone() {
    return qzone;
  }
  public void setQzone(ResponseQzone qzone) {
    this.qzone = qzone;
  }
  public ResponseAccountDetails adobe(ResponseAdobe adobe) {
    this.adobe = adobe;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseAdobe getAdobe() {
    return adobe;
  }
  public void setAdobe(ResponseAdobe adobe) {
    this.adobe = adobe;
  }
  public ResponseAccountDetails mailru(ResponseMailru mailru) {
    this.mailru = mailru;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseMailru getMailru() {
    return mailru;
  }
  public void setMailru(ResponseMailru mailru) {
    this.mailru = mailru;
  }
  public ResponseAccountDetails wordpress(ResponseWordpress wordpress) {
    this.wordpress = wordpress;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseWordpress getWordpress() {
    return wordpress;
  }
  public void setWordpress(ResponseWordpress wordpress) {
    this.wordpress = wordpress;
  }
  public ResponseAccountDetails imgur(ResponseImgur imgur) {
    this.imgur = imgur;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseImgur getImgur() {
    return imgur;
  }
  public void setImgur(ResponseImgur imgur) {
    this.imgur = imgur;
  }
  public ResponseAccountDetails disneyplus(ResponseDisneyplus disneyplus) {
    this.disneyplus = disneyplus;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseDisneyplus getDisneyplus() {
    return disneyplus;
  }
  public void setDisneyplus(ResponseDisneyplus disneyplus) {
    this.disneyplus = disneyplus;
  }
  public ResponseAccountDetails netflix(ResponseNetflix netflix) {
    this.netflix = netflix;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseNetflix getNetflix() {
    return netflix;
  }
  public void setNetflix(ResponseNetflix netflix) {
    this.netflix = netflix;
  }
  public ResponseAccountDetails jdid(ResponseJdid jdid) {
    this.jdid = jdid;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseJdid getJdid() {
    return jdid;
  }
  public void setJdid(ResponseJdid jdid) {
    this.jdid = jdid;
  }
  public ResponseAccountDetails flipkart(ResponseFlipkart flipkart) {
    this.flipkart = flipkart;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseFlipkart getFlipkart() {
    return flipkart;
  }
  public void setFlipkart(ResponseFlipkart flipkart) {
    this.flipkart = flipkart;
  }
  public ResponseAccountDetails bukalapak(ResponseBukalapak bukalapak) {
    this.bukalapak = bukalapak;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseBukalapak getBukalapak() {
    return bukalapak;
  }
  public void setBukalapak(ResponseBukalapak bukalapak) {
    this.bukalapak = bukalapak;
  }
  public ResponseAccountDetails archiveorg(ResponseArchiveorg archiveorg) {
    this.archiveorg = archiveorg;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseArchiveorg getArchiveorg() {
    return archiveorg;
  }
  public void setArchiveorg(ResponseArchiveorg archiveorg) {
    this.archiveorg = archiveorg;
  }
  public ResponseAccountDetails lazada(ResponseLazada lazada) {
    this.lazada = lazada;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseLazada getLazada() {
    return lazada;
  }
  public void setLazada(ResponseLazada lazada) {
    this.lazada = lazada;
  }
  public ResponseAccountDetails zoho(ResponseZoho zoho) {
    this.zoho = zoho;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseZoho getZoho() {
    return zoho;
  }
  public void setZoho(ResponseZoho zoho) {
    this.zoho = zoho;
  }
  public ResponseAccountDetails samsung(ResponseSamsung samsung) {
    this.samsung = samsung;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseSamsung getSamsung() {
    return samsung;
  }
  public void setSamsung(ResponseSamsung samsung) {
    this.samsung = samsung;
  }
  public ResponseAccountDetails evernote(ResponseEvernote evernote) {
    this.evernote = evernote;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseEvernote getEvernote() {
    return evernote;
  }
  public void setEvernote(ResponseEvernote evernote) {
    this.evernote = evernote;
  }
  public ResponseAccountDetails envato(ResponseEnvato envato) {
    this.envato = envato;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseEnvato getEnvato() {
    return envato;
  }
  public void setEnvato(ResponseEnvato envato) {
    this.envato = envato;
  }
  public ResponseAccountDetails patreon(ResponsePatreon patreon) {
    this.patreon = patreon;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponsePatreon getPatreon() {
    return patreon;
  }
  public void setPatreon(ResponsePatreon patreon) {
    this.patreon = patreon;
  }
  public ResponseAccountDetails tokopedia(ResponseTokopedia tokopedia) {
    this.tokopedia = tokopedia;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseTokopedia getTokopedia() {
    return tokopedia;
  }
  public void setTokopedia(ResponseTokopedia tokopedia) {
    this.tokopedia = tokopedia;
  }
  public ResponseAccountDetails rambler(ResponseRambler rambler) {
    this.rambler = rambler;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseRambler getRambler() {
    return rambler;
  }
  public void setRambler(ResponseRambler rambler) {
    this.rambler = rambler;
  }
  public ResponseAccountDetails quora(ResponseQuora quora) {
    this.quora = quora;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseQuora getQuora() {
    return quora;
  }
  public void setQuora(ResponseQuora quora) {
    this.quora = quora;
  }
  public ResponseAccountDetails atlassian(ResponseAtlassian atlassian) {
    this.atlassian = atlassian;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseAtlassian getAtlassian() {
    return atlassian;
  }
  public void setAtlassian(ResponseAtlassian atlassian) {
    this.atlassian = atlassian;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAccountDetails responseAccountDetails = (ResponseAccountDetails) o;
    return Objects.equals(this.apple, responseAccountDetails.apple) &&
        Objects.equals(this.ebay, responseAccountDetails.ebay) &&
        Objects.equals(this.facebook, responseAccountDetails.facebook) &&
        Objects.equals(this.flickr, responseAccountDetails.flickr) &&
        Objects.equals(this.foursquare, responseAccountDetails.foursquare) &&
        Objects.equals(this.github, responseAccountDetails.github) &&
        Objects.equals(this.google, responseAccountDetails.google) &&
        Objects.equals(this.gravatar, responseAccountDetails.gravatar) &&
        Objects.equals(this.instagram, responseAccountDetails.instagram) &&
        Objects.equals(this.lastfm, responseAccountDetails.lastfm) &&
        Objects.equals(this.linkedin, responseAccountDetails.linkedin) &&
        Objects.equals(this.microsoft, responseAccountDetails.microsoft) &&
        Objects.equals(this.myspace, responseAccountDetails.myspace) &&
        Objects.equals(this.pinterest, responseAccountDetails.pinterest) &&
        Objects.equals(this.skype, responseAccountDetails.skype) &&
        Objects.equals(this.spotify, responseAccountDetails.spotify) &&
        Objects.equals(this.tumblr, responseAccountDetails.tumblr) &&
        Objects.equals(this.twitter, responseAccountDetails.twitter) &&
        Objects.equals(this.vimeo, responseAccountDetails.vimeo) &&
        Objects.equals(this.weibo, responseAccountDetails.weibo) &&
        Objects.equals(this.yahoo, responseAccountDetails.yahoo) &&
        Objects.equals(this.discord, responseAccountDetails.discord) &&
        Objects.equals(this.ok, responseAccountDetails.ok) &&
        Objects.equals(this.kakao, responseAccountDetails.kakao) &&
        Objects.equals(this.booking, responseAccountDetails.booking) &&
        Objects.equals(this.airbnb, responseAccountDetails.airbnb) &&
        Objects.equals(this.amazon, responseAccountDetails.amazon) &&
        Objects.equals(this.qzone, responseAccountDetails.qzone) &&
        Objects.equals(this.adobe, responseAccountDetails.adobe) &&
        Objects.equals(this.mailru, responseAccountDetails.mailru) &&
        Objects.equals(this.wordpress, responseAccountDetails.wordpress) &&
        Objects.equals(this.imgur, responseAccountDetails.imgur) &&
        Objects.equals(this.disneyplus, responseAccountDetails.disneyplus) &&
        Objects.equals(this.netflix, responseAccountDetails.netflix) &&
        Objects.equals(this.jdid, responseAccountDetails.jdid) &&
        Objects.equals(this.flipkart, responseAccountDetails.flipkart) &&
        Objects.equals(this.bukalapak, responseAccountDetails.bukalapak) &&
        Objects.equals(this.archiveorg, responseAccountDetails.archiveorg) &&
        Objects.equals(this.lazada, responseAccountDetails.lazada) &&
        Objects.equals(this.zoho, responseAccountDetails.zoho) &&
        Objects.equals(this.samsung, responseAccountDetails.samsung) &&
        Objects.equals(this.evernote, responseAccountDetails.evernote) &&
        Objects.equals(this.envato, responseAccountDetails.envato) &&
        Objects.equals(this.patreon, responseAccountDetails.patreon) &&
        Objects.equals(this.tokopedia, responseAccountDetails.tokopedia) &&
        Objects.equals(this.rambler, responseAccountDetails.rambler) &&
        Objects.equals(this.quora, responseAccountDetails.quora) &&
        Objects.equals(this.atlassian, responseAccountDetails.atlassian);
  }
  @Override
  public int hashCode() {
    return Objects.hash(apple, ebay, facebook, flickr, foursquare, github, google, gravatar, instagram, lastfm, linkedin, microsoft, myspace, pinterest, skype, spotify, tumblr, twitter, vimeo, weibo, yahoo, discord, ok, kakao, booking, airbnb, amazon, qzone, adobe, mailru, wordpress, imgur, disneyplus, netflix, jdid, flipkart, bukalapak, archiveorg, lazada, zoho, samsung, evernote, envato, patreon, tokopedia, rambler, quora, atlassian);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAccountDetails {\n");
    
    sb.append("    apple: ").append(toIndentedString(apple)).append("\n");
    sb.append("    ebay: ").append(toIndentedString(ebay)).append("\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    flickr: ").append(toIndentedString(flickr)).append("\n");
    sb.append("    foursquare: ").append(toIndentedString(foursquare)).append("\n");
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
    sb.append("    google: ").append(toIndentedString(google)).append("\n");
    sb.append("    gravatar: ").append(toIndentedString(gravatar)).append("\n");
    sb.append("    instagram: ").append(toIndentedString(instagram)).append("\n");
    sb.append("    lastfm: ").append(toIndentedString(lastfm)).append("\n");
    sb.append("    linkedin: ").append(toIndentedString(linkedin)).append("\n");
    sb.append("    microsoft: ").append(toIndentedString(microsoft)).append("\n");
    sb.append("    myspace: ").append(toIndentedString(myspace)).append("\n");
    sb.append("    pinterest: ").append(toIndentedString(pinterest)).append("\n");
    sb.append("    skype: ").append(toIndentedString(skype)).append("\n");
    sb.append("    spotify: ").append(toIndentedString(spotify)).append("\n");
    sb.append("    tumblr: ").append(toIndentedString(tumblr)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    vimeo: ").append(toIndentedString(vimeo)).append("\n");
    sb.append("    weibo: ").append(toIndentedString(weibo)).append("\n");
    sb.append("    yahoo: ").append(toIndentedString(yahoo)).append("\n");
    sb.append("    discord: ").append(toIndentedString(discord)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    kakao: ").append(toIndentedString(kakao)).append("\n");
    sb.append("    booking: ").append(toIndentedString(booking)).append("\n");
    sb.append("    airbnb: ").append(toIndentedString(airbnb)).append("\n");
    sb.append("    amazon: ").append(toIndentedString(amazon)).append("\n");
    sb.append("    qzone: ").append(toIndentedString(qzone)).append("\n");
    sb.append("    adobe: ").append(toIndentedString(adobe)).append("\n");
    sb.append("    mailru: ").append(toIndentedString(mailru)).append("\n");
    sb.append("    wordpress: ").append(toIndentedString(wordpress)).append("\n");
    sb.append("    imgur: ").append(toIndentedString(imgur)).append("\n");
    sb.append("    disneyplus: ").append(toIndentedString(disneyplus)).append("\n");
    sb.append("    netflix: ").append(toIndentedString(netflix)).append("\n");
    sb.append("    jdid: ").append(toIndentedString(jdid)).append("\n");
    sb.append("    flipkart: ").append(toIndentedString(flipkart)).append("\n");
    sb.append("    bukalapak: ").append(toIndentedString(bukalapak)).append("\n");
    sb.append("    archiveorg: ").append(toIndentedString(archiveorg)).append("\n");
    sb.append("    lazada: ").append(toIndentedString(lazada)).append("\n");
    sb.append("    zoho: ").append(toIndentedString(zoho)).append("\n");
    sb.append("    samsung: ").append(toIndentedString(samsung)).append("\n");
    sb.append("    evernote: ").append(toIndentedString(evernote)).append("\n");
    sb.append("    envato: ").append(toIndentedString(envato)).append("\n");
    sb.append("    patreon: ").append(toIndentedString(patreon)).append("\n");
    sb.append("    tokopedia: ").append(toIndentedString(tokopedia)).append("\n");
    sb.append("    rambler: ").append(toIndentedString(rambler)).append("\n");
    sb.append("    quora: ").append(toIndentedString(quora)).append("\n");
    sb.append("    atlassian: ").append(toIndentedString(atlassian)).append("\n");
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
