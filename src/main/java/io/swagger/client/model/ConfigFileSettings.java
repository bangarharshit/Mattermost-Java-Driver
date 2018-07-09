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
 * ConfigFileSettings
 */

public class ConfigFileSettings {
  @SerializedName("MaxFileSize")
  private Integer maxFileSize = null;

  @SerializedName("DriverName")
  private String driverName = null;

  @SerializedName("Directory")
  private String directory = null;

  @SerializedName("EnablePublicLink")
  private Boolean enablePublicLink = null;

  @SerializedName("PublicLinkSalt")
  private String publicLinkSalt = null;

  @SerializedName("ThumbnailWidth")
  private Integer thumbnailWidth = null;

  @SerializedName("ThumbnailHeight")
  private Integer thumbnailHeight = null;

  @SerializedName("PreviewWidth")
  private Integer previewWidth = null;

  @SerializedName("PreviewHeight")
  private Integer previewHeight = null;

  @SerializedName("ProfileWidth")
  private Integer profileWidth = null;

  @SerializedName("ProfileHeight")
  private Integer profileHeight = null;

  @SerializedName("InitialFont")
  private String initialFont = null;

  @SerializedName("AmazonS3AccessKeyId")
  private String amazonS3AccessKeyId = null;

  @SerializedName("AmazonS3SecretAccessKey")
  private String amazonS3SecretAccessKey = null;

  @SerializedName("AmazonS3Bucket")
  private String amazonS3Bucket = null;

  @SerializedName("AmazonS3Region")
  private String amazonS3Region = null;

  @SerializedName("AmazonS3Endpoint")
  private String amazonS3Endpoint = null;

  @SerializedName("AmazonS3SSL")
  private Boolean amazonS3SSL = null;

  public ConfigFileSettings maxFileSize(Integer maxFileSize) {
    this.maxFileSize = maxFileSize;
    return this;
  }

   /**
   * Get maxFileSize
   * @return maxFileSize
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxFileSize() {
    return maxFileSize;
  }

  public void setMaxFileSize(Integer maxFileSize) {
    this.maxFileSize = maxFileSize;
  }

  public ConfigFileSettings driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

   /**
   * Get driverName
   * @return driverName
  **/
  @ApiModelProperty(value = "")
  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public ConfigFileSettings directory(String directory) {
    this.directory = directory;
    return this;
  }

   /**
   * Get directory
   * @return directory
  **/
  @ApiModelProperty(value = "")
  public String getDirectory() {
    return directory;
  }

  public void setDirectory(String directory) {
    this.directory = directory;
  }

  public ConfigFileSettings enablePublicLink(Boolean enablePublicLink) {
    this.enablePublicLink = enablePublicLink;
    return this;
  }

   /**
   * Get enablePublicLink
   * @return enablePublicLink
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnablePublicLink() {
    return enablePublicLink;
  }

  public void setEnablePublicLink(Boolean enablePublicLink) {
    this.enablePublicLink = enablePublicLink;
  }

  public ConfigFileSettings publicLinkSalt(String publicLinkSalt) {
    this.publicLinkSalt = publicLinkSalt;
    return this;
  }

   /**
   * Get publicLinkSalt
   * @return publicLinkSalt
  **/
  @ApiModelProperty(value = "")
  public String getPublicLinkSalt() {
    return publicLinkSalt;
  }

  public void setPublicLinkSalt(String publicLinkSalt) {
    this.publicLinkSalt = publicLinkSalt;
  }

  public ConfigFileSettings thumbnailWidth(Integer thumbnailWidth) {
    this.thumbnailWidth = thumbnailWidth;
    return this;
  }

   /**
   * Get thumbnailWidth
   * @return thumbnailWidth
  **/
  @ApiModelProperty(value = "")
  public Integer getThumbnailWidth() {
    return thumbnailWidth;
  }

  public void setThumbnailWidth(Integer thumbnailWidth) {
    this.thumbnailWidth = thumbnailWidth;
  }

  public ConfigFileSettings thumbnailHeight(Integer thumbnailHeight) {
    this.thumbnailHeight = thumbnailHeight;
    return this;
  }

   /**
   * Get thumbnailHeight
   * @return thumbnailHeight
  **/
  @ApiModelProperty(value = "")
  public Integer getThumbnailHeight() {
    return thumbnailHeight;
  }

  public void setThumbnailHeight(Integer thumbnailHeight) {
    this.thumbnailHeight = thumbnailHeight;
  }

  public ConfigFileSettings previewWidth(Integer previewWidth) {
    this.previewWidth = previewWidth;
    return this;
  }

   /**
   * Get previewWidth
   * @return previewWidth
  **/
  @ApiModelProperty(value = "")
  public Integer getPreviewWidth() {
    return previewWidth;
  }

  public void setPreviewWidth(Integer previewWidth) {
    this.previewWidth = previewWidth;
  }

  public ConfigFileSettings previewHeight(Integer previewHeight) {
    this.previewHeight = previewHeight;
    return this;
  }

   /**
   * Get previewHeight
   * @return previewHeight
  **/
  @ApiModelProperty(value = "")
  public Integer getPreviewHeight() {
    return previewHeight;
  }

  public void setPreviewHeight(Integer previewHeight) {
    this.previewHeight = previewHeight;
  }

  public ConfigFileSettings profileWidth(Integer profileWidth) {
    this.profileWidth = profileWidth;
    return this;
  }

   /**
   * Get profileWidth
   * @return profileWidth
  **/
  @ApiModelProperty(value = "")
  public Integer getProfileWidth() {
    return profileWidth;
  }

  public void setProfileWidth(Integer profileWidth) {
    this.profileWidth = profileWidth;
  }

  public ConfigFileSettings profileHeight(Integer profileHeight) {
    this.profileHeight = profileHeight;
    return this;
  }

   /**
   * Get profileHeight
   * @return profileHeight
  **/
  @ApiModelProperty(value = "")
  public Integer getProfileHeight() {
    return profileHeight;
  }

  public void setProfileHeight(Integer profileHeight) {
    this.profileHeight = profileHeight;
  }

  public ConfigFileSettings initialFont(String initialFont) {
    this.initialFont = initialFont;
    return this;
  }

   /**
   * Get initialFont
   * @return initialFont
  **/
  @ApiModelProperty(value = "")
  public String getInitialFont() {
    return initialFont;
  }

  public void setInitialFont(String initialFont) {
    this.initialFont = initialFont;
  }

  public ConfigFileSettings amazonS3AccessKeyId(String amazonS3AccessKeyId) {
    this.amazonS3AccessKeyId = amazonS3AccessKeyId;
    return this;
  }

   /**
   * Get amazonS3AccessKeyId
   * @return amazonS3AccessKeyId
  **/
  @ApiModelProperty(value = "")
  public String getAmazonS3AccessKeyId() {
    return amazonS3AccessKeyId;
  }

  public void setAmazonS3AccessKeyId(String amazonS3AccessKeyId) {
    this.amazonS3AccessKeyId = amazonS3AccessKeyId;
  }

  public ConfigFileSettings amazonS3SecretAccessKey(String amazonS3SecretAccessKey) {
    this.amazonS3SecretAccessKey = amazonS3SecretAccessKey;
    return this;
  }

   /**
   * Get amazonS3SecretAccessKey
   * @return amazonS3SecretAccessKey
  **/
  @ApiModelProperty(value = "")
  public String getAmazonS3SecretAccessKey() {
    return amazonS3SecretAccessKey;
  }

  public void setAmazonS3SecretAccessKey(String amazonS3SecretAccessKey) {
    this.amazonS3SecretAccessKey = amazonS3SecretAccessKey;
  }

  public ConfigFileSettings amazonS3Bucket(String amazonS3Bucket) {
    this.amazonS3Bucket = amazonS3Bucket;
    return this;
  }

   /**
   * Get amazonS3Bucket
   * @return amazonS3Bucket
  **/
  @ApiModelProperty(value = "")
  public String getAmazonS3Bucket() {
    return amazonS3Bucket;
  }

  public void setAmazonS3Bucket(String amazonS3Bucket) {
    this.amazonS3Bucket = amazonS3Bucket;
  }

  public ConfigFileSettings amazonS3Region(String amazonS3Region) {
    this.amazonS3Region = amazonS3Region;
    return this;
  }

   /**
   * Get amazonS3Region
   * @return amazonS3Region
  **/
  @ApiModelProperty(value = "")
  public String getAmazonS3Region() {
    return amazonS3Region;
  }

  public void setAmazonS3Region(String amazonS3Region) {
    this.amazonS3Region = amazonS3Region;
  }

  public ConfigFileSettings amazonS3Endpoint(String amazonS3Endpoint) {
    this.amazonS3Endpoint = amazonS3Endpoint;
    return this;
  }

   /**
   * Get amazonS3Endpoint
   * @return amazonS3Endpoint
  **/
  @ApiModelProperty(value = "")
  public String getAmazonS3Endpoint() {
    return amazonS3Endpoint;
  }

  public void setAmazonS3Endpoint(String amazonS3Endpoint) {
    this.amazonS3Endpoint = amazonS3Endpoint;
  }

  public ConfigFileSettings amazonS3SSL(Boolean amazonS3SSL) {
    this.amazonS3SSL = amazonS3SSL;
    return this;
  }

   /**
   * Get amazonS3SSL
   * @return amazonS3SSL
  **/
  @ApiModelProperty(value = "")
  public Boolean isAmazonS3SSL() {
    return amazonS3SSL;
  }

  public void setAmazonS3SSL(Boolean amazonS3SSL) {
    this.amazonS3SSL = amazonS3SSL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigFileSettings configFileSettings = (ConfigFileSettings) o;
    return Objects.equals(this.maxFileSize, configFileSettings.maxFileSize) &&
        Objects.equals(this.driverName, configFileSettings.driverName) &&
        Objects.equals(this.directory, configFileSettings.directory) &&
        Objects.equals(this.enablePublicLink, configFileSettings.enablePublicLink) &&
        Objects.equals(this.publicLinkSalt, configFileSettings.publicLinkSalt) &&
        Objects.equals(this.thumbnailWidth, configFileSettings.thumbnailWidth) &&
        Objects.equals(this.thumbnailHeight, configFileSettings.thumbnailHeight) &&
        Objects.equals(this.previewWidth, configFileSettings.previewWidth) &&
        Objects.equals(this.previewHeight, configFileSettings.previewHeight) &&
        Objects.equals(this.profileWidth, configFileSettings.profileWidth) &&
        Objects.equals(this.profileHeight, configFileSettings.profileHeight) &&
        Objects.equals(this.initialFont, configFileSettings.initialFont) &&
        Objects.equals(this.amazonS3AccessKeyId, configFileSettings.amazonS3AccessKeyId) &&
        Objects.equals(this.amazonS3SecretAccessKey, configFileSettings.amazonS3SecretAccessKey) &&
        Objects.equals(this.amazonS3Bucket, configFileSettings.amazonS3Bucket) &&
        Objects.equals(this.amazonS3Region, configFileSettings.amazonS3Region) &&
        Objects.equals(this.amazonS3Endpoint, configFileSettings.amazonS3Endpoint) &&
        Objects.equals(this.amazonS3SSL, configFileSettings.amazonS3SSL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxFileSize, driverName, directory, enablePublicLink, publicLinkSalt, thumbnailWidth, thumbnailHeight, previewWidth, previewHeight, profileWidth, profileHeight, initialFont, amazonS3AccessKeyId, amazonS3SecretAccessKey, amazonS3Bucket, amazonS3Region, amazonS3Endpoint, amazonS3SSL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigFileSettings {\n");
    
    sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    enablePublicLink: ").append(toIndentedString(enablePublicLink)).append("\n");
    sb.append("    publicLinkSalt: ").append(toIndentedString(publicLinkSalt)).append("\n");
    sb.append("    thumbnailWidth: ").append(toIndentedString(thumbnailWidth)).append("\n");
    sb.append("    thumbnailHeight: ").append(toIndentedString(thumbnailHeight)).append("\n");
    sb.append("    previewWidth: ").append(toIndentedString(previewWidth)).append("\n");
    sb.append("    previewHeight: ").append(toIndentedString(previewHeight)).append("\n");
    sb.append("    profileWidth: ").append(toIndentedString(profileWidth)).append("\n");
    sb.append("    profileHeight: ").append(toIndentedString(profileHeight)).append("\n");
    sb.append("    initialFont: ").append(toIndentedString(initialFont)).append("\n");
    sb.append("    amazonS3AccessKeyId: ").append(toIndentedString(amazonS3AccessKeyId)).append("\n");
    sb.append("    amazonS3SecretAccessKey: ").append(toIndentedString(amazonS3SecretAccessKey)).append("\n");
    sb.append("    amazonS3Bucket: ").append(toIndentedString(amazonS3Bucket)).append("\n");
    sb.append("    amazonS3Region: ").append(toIndentedString(amazonS3Region)).append("\n");
    sb.append("    amazonS3Endpoint: ").append(toIndentedString(amazonS3Endpoint)).append("\n");
    sb.append("    amazonS3SSL: ").append(toIndentedString(amazonS3SSL)).append("\n");
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

