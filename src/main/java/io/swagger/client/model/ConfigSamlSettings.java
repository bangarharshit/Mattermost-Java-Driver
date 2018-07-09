/*
 * Mattermost API Reference
 * ### API version 4 is stable with the Mattermost server 4.0 release. API version 3 is scheduled for deprecation on January 16th, 2018. [Details here](/#tag/APIv3-Deprecation). Looking for the APIv3 reference? It has moved [here](https://api.mattermost.com/v3). 
 *
 * OpenAPI spec version: 4.0.0
 * Contact: feedback@mattermost.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ConfigSamlSettings
 */

public class ConfigSamlSettings {
  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("Verify")
  private Boolean verify = null;

  @SerializedName("Encrypt")
  private Boolean encrypt = null;

  @SerializedName("IdpUrl")
  private String idpUrl = null;

  @SerializedName("IdpDescriptorUrl")
  private String idpDescriptorUrl = null;

  @SerializedName("AssertionConsumerServiceURL")
  private String assertionConsumerServiceURL = null;

  @SerializedName("IdpCertificateFile")
  private String idpCertificateFile = null;

  @SerializedName("PublicCertificateFile")
  private String publicCertificateFile = null;

  @SerializedName("PrivateKeyFile")
  private String privateKeyFile = null;

  @SerializedName("FirstNameAttribute")
  private String firstNameAttribute = null;

  @SerializedName("LastNameAttribute")
  private String lastNameAttribute = null;

  @SerializedName("EmailAttribute")
  private String emailAttribute = null;

  @SerializedName("UsernameAttribute")
  private String usernameAttribute = null;

  @SerializedName("NicknameAttribute")
  private String nicknameAttribute = null;

  @SerializedName("LocaleAttribute")
  private String localeAttribute = null;

  @SerializedName("PositionAttribute")
  private String positionAttribute = null;

  @SerializedName("LoginButtonText")
  private String loginButtonText = null;

  public ConfigSamlSettings enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public ConfigSamlSettings verify(Boolean verify) {
    this.verify = verify;
    return this;
  }

   /**
   * Get verify
   * @return verify
  **/
  @ApiModelProperty(value = "")
  public Boolean isVerify() {
    return verify;
  }

  public void setVerify(Boolean verify) {
    this.verify = verify;
  }

  public ConfigSamlSettings encrypt(Boolean encrypt) {
    this.encrypt = encrypt;
    return this;
  }

   /**
   * Get encrypt
   * @return encrypt
  **/
  @ApiModelProperty(value = "")
  public Boolean isEncrypt() {
    return encrypt;
  }

  public void setEncrypt(Boolean encrypt) {
    this.encrypt = encrypt;
  }

  public ConfigSamlSettings idpUrl(String idpUrl) {
    this.idpUrl = idpUrl;
    return this;
  }

   /**
   * Get idpUrl
   * @return idpUrl
  **/
  @ApiModelProperty(value = "")
  public String getIdpUrl() {
    return idpUrl;
  }

  public void setIdpUrl(String idpUrl) {
    this.idpUrl = idpUrl;
  }

  public ConfigSamlSettings idpDescriptorUrl(String idpDescriptorUrl) {
    this.idpDescriptorUrl = idpDescriptorUrl;
    return this;
  }

   /**
   * Get idpDescriptorUrl
   * @return idpDescriptorUrl
  **/
  @ApiModelProperty(value = "")
  public String getIdpDescriptorUrl() {
    return idpDescriptorUrl;
  }

  public void setIdpDescriptorUrl(String idpDescriptorUrl) {
    this.idpDescriptorUrl = idpDescriptorUrl;
  }

  public ConfigSamlSettings assertionConsumerServiceURL(String assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    return this;
  }

   /**
   * Get assertionConsumerServiceURL
   * @return assertionConsumerServiceURL
  **/
  @ApiModelProperty(value = "")
  public String getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  public void setAssertionConsumerServiceURL(String assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  public ConfigSamlSettings idpCertificateFile(String idpCertificateFile) {
    this.idpCertificateFile = idpCertificateFile;
    return this;
  }

   /**
   * Get idpCertificateFile
   * @return idpCertificateFile
  **/
  @ApiModelProperty(value = "")
  public String getIdpCertificateFile() {
    return idpCertificateFile;
  }

  public void setIdpCertificateFile(String idpCertificateFile) {
    this.idpCertificateFile = idpCertificateFile;
  }

  public ConfigSamlSettings publicCertificateFile(String publicCertificateFile) {
    this.publicCertificateFile = publicCertificateFile;
    return this;
  }

   /**
   * Get publicCertificateFile
   * @return publicCertificateFile
  **/
  @ApiModelProperty(value = "")
  public String getPublicCertificateFile() {
    return publicCertificateFile;
  }

  public void setPublicCertificateFile(String publicCertificateFile) {
    this.publicCertificateFile = publicCertificateFile;
  }

  public ConfigSamlSettings privateKeyFile(String privateKeyFile) {
    this.privateKeyFile = privateKeyFile;
    return this;
  }

   /**
   * Get privateKeyFile
   * @return privateKeyFile
  **/
  @ApiModelProperty(value = "")
  public String getPrivateKeyFile() {
    return privateKeyFile;
  }

  public void setPrivateKeyFile(String privateKeyFile) {
    this.privateKeyFile = privateKeyFile;
  }

  public ConfigSamlSettings firstNameAttribute(String firstNameAttribute) {
    this.firstNameAttribute = firstNameAttribute;
    return this;
  }

   /**
   * Get firstNameAttribute
   * @return firstNameAttribute
  **/
  @ApiModelProperty(value = "")
  public String getFirstNameAttribute() {
    return firstNameAttribute;
  }

  public void setFirstNameAttribute(String firstNameAttribute) {
    this.firstNameAttribute = firstNameAttribute;
  }

  public ConfigSamlSettings lastNameAttribute(String lastNameAttribute) {
    this.lastNameAttribute = lastNameAttribute;
    return this;
  }

   /**
   * Get lastNameAttribute
   * @return lastNameAttribute
  **/
  @ApiModelProperty(value = "")
  public String getLastNameAttribute() {
    return lastNameAttribute;
  }

  public void setLastNameAttribute(String lastNameAttribute) {
    this.lastNameAttribute = lastNameAttribute;
  }

  public ConfigSamlSettings emailAttribute(String emailAttribute) {
    this.emailAttribute = emailAttribute;
    return this;
  }

   /**
   * Get emailAttribute
   * @return emailAttribute
  **/
  @ApiModelProperty(value = "")
  public String getEmailAttribute() {
    return emailAttribute;
  }

  public void setEmailAttribute(String emailAttribute) {
    this.emailAttribute = emailAttribute;
  }

  public ConfigSamlSettings usernameAttribute(String usernameAttribute) {
    this.usernameAttribute = usernameAttribute;
    return this;
  }

   /**
   * Get usernameAttribute
   * @return usernameAttribute
  **/
  @ApiModelProperty(value = "")
  public String getUsernameAttribute() {
    return usernameAttribute;
  }

  public void setUsernameAttribute(String usernameAttribute) {
    this.usernameAttribute = usernameAttribute;
  }

  public ConfigSamlSettings nicknameAttribute(String nicknameAttribute) {
    this.nicknameAttribute = nicknameAttribute;
    return this;
  }

   /**
   * Get nicknameAttribute
   * @return nicknameAttribute
  **/
  @ApiModelProperty(value = "")
  public String getNicknameAttribute() {
    return nicknameAttribute;
  }

  public void setNicknameAttribute(String nicknameAttribute) {
    this.nicknameAttribute = nicknameAttribute;
  }

  public ConfigSamlSettings localeAttribute(String localeAttribute) {
    this.localeAttribute = localeAttribute;
    return this;
  }

   /**
   * Get localeAttribute
   * @return localeAttribute
  **/
  @ApiModelProperty(value = "")
  public String getLocaleAttribute() {
    return localeAttribute;
  }

  public void setLocaleAttribute(String localeAttribute) {
    this.localeAttribute = localeAttribute;
  }

  public ConfigSamlSettings positionAttribute(String positionAttribute) {
    this.positionAttribute = positionAttribute;
    return this;
  }

   /**
   * Get positionAttribute
   * @return positionAttribute
  **/
  @ApiModelProperty(value = "")
  public String getPositionAttribute() {
    return positionAttribute;
  }

  public void setPositionAttribute(String positionAttribute) {
    this.positionAttribute = positionAttribute;
  }

  public ConfigSamlSettings loginButtonText(String loginButtonText) {
    this.loginButtonText = loginButtonText;
    return this;
  }

   /**
   * Get loginButtonText
   * @return loginButtonText
  **/
  @ApiModelProperty(value = "")
  public String getLoginButtonText() {
    return loginButtonText;
  }

  public void setLoginButtonText(String loginButtonText) {
    this.loginButtonText = loginButtonText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigSamlSettings configSamlSettings = (ConfigSamlSettings) o;
    return Objects.equals(this.enable, configSamlSettings.enable) &&
        Objects.equals(this.verify, configSamlSettings.verify) &&
        Objects.equals(this.encrypt, configSamlSettings.encrypt) &&
        Objects.equals(this.idpUrl, configSamlSettings.idpUrl) &&
        Objects.equals(this.idpDescriptorUrl, configSamlSettings.idpDescriptorUrl) &&
        Objects.equals(this.assertionConsumerServiceURL, configSamlSettings.assertionConsumerServiceURL) &&
        Objects.equals(this.idpCertificateFile, configSamlSettings.idpCertificateFile) &&
        Objects.equals(this.publicCertificateFile, configSamlSettings.publicCertificateFile) &&
        Objects.equals(this.privateKeyFile, configSamlSettings.privateKeyFile) &&
        Objects.equals(this.firstNameAttribute, configSamlSettings.firstNameAttribute) &&
        Objects.equals(this.lastNameAttribute, configSamlSettings.lastNameAttribute) &&
        Objects.equals(this.emailAttribute, configSamlSettings.emailAttribute) &&
        Objects.equals(this.usernameAttribute, configSamlSettings.usernameAttribute) &&
        Objects.equals(this.nicknameAttribute, configSamlSettings.nicknameAttribute) &&
        Objects.equals(this.localeAttribute, configSamlSettings.localeAttribute) &&
        Objects.equals(this.positionAttribute, configSamlSettings.positionAttribute) &&
        Objects.equals(this.loginButtonText, configSamlSettings.loginButtonText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, verify, encrypt, idpUrl, idpDescriptorUrl, assertionConsumerServiceURL, idpCertificateFile, publicCertificateFile, privateKeyFile, firstNameAttribute, lastNameAttribute, emailAttribute, usernameAttribute, nicknameAttribute, localeAttribute, positionAttribute, loginButtonText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigSamlSettings {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    verify: ").append(toIndentedString(verify)).append("\n");
    sb.append("    encrypt: ").append(toIndentedString(encrypt)).append("\n");
    sb.append("    idpUrl: ").append(toIndentedString(idpUrl)).append("\n");
    sb.append("    idpDescriptorUrl: ").append(toIndentedString(idpDescriptorUrl)).append("\n");
    sb.append("    assertionConsumerServiceURL: ").append(toIndentedString(assertionConsumerServiceURL)).append("\n");
    sb.append("    idpCertificateFile: ").append(toIndentedString(idpCertificateFile)).append("\n");
    sb.append("    publicCertificateFile: ").append(toIndentedString(publicCertificateFile)).append("\n");
    sb.append("    privateKeyFile: ").append(toIndentedString(privateKeyFile)).append("\n");
    sb.append("    firstNameAttribute: ").append(toIndentedString(firstNameAttribute)).append("\n");
    sb.append("    lastNameAttribute: ").append(toIndentedString(lastNameAttribute)).append("\n");
    sb.append("    emailAttribute: ").append(toIndentedString(emailAttribute)).append("\n");
    sb.append("    usernameAttribute: ").append(toIndentedString(usernameAttribute)).append("\n");
    sb.append("    nicknameAttribute: ").append(toIndentedString(nicknameAttribute)).append("\n");
    sb.append("    localeAttribute: ").append(toIndentedString(localeAttribute)).append("\n");
    sb.append("    positionAttribute: ").append(toIndentedString(positionAttribute)).append("\n");
    sb.append("    loginButtonText: ").append(toIndentedString(loginButtonText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

