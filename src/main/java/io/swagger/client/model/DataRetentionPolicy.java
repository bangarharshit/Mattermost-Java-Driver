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
 * DataRetentionPolicy
 */

public class DataRetentionPolicy {
  @SerializedName("message_deletion_enabled")
  private Boolean messageDeletionEnabled = null;

  @SerializedName("file_deletion_enabled")
  private Boolean fileDeletionEnabled = null;

  @SerializedName("message_retention_cutoff")
  private Integer messageRetentionCutoff = null;

  @SerializedName("file_retention_cutoff")
  private Integer fileRetentionCutoff = null;

  public DataRetentionPolicy messageDeletionEnabled(Boolean messageDeletionEnabled) {
    this.messageDeletionEnabled = messageDeletionEnabled;
    return this;
  }

   /**
   * Indicates whether data retention policy deletion of messages is enabled.
   * @return messageDeletionEnabled
  **/
  @ApiModelProperty(value = "Indicates whether data retention policy deletion of messages is enabled.")
  public Boolean isMessageDeletionEnabled() {
    return messageDeletionEnabled;
  }

  public void setMessageDeletionEnabled(Boolean messageDeletionEnabled) {
    this.messageDeletionEnabled = messageDeletionEnabled;
  }

  public DataRetentionPolicy fileDeletionEnabled(Boolean fileDeletionEnabled) {
    this.fileDeletionEnabled = fileDeletionEnabled;
    return this;
  }

   /**
   * Indicates whether data retention policy deletion of file attachments is enabled.
   * @return fileDeletionEnabled
  **/
  @ApiModelProperty(value = "Indicates whether data retention policy deletion of file attachments is enabled.")
  public Boolean isFileDeletionEnabled() {
    return fileDeletionEnabled;
  }

  public void setFileDeletionEnabled(Boolean fileDeletionEnabled) {
    this.fileDeletionEnabled = fileDeletionEnabled;
  }

  public DataRetentionPolicy messageRetentionCutoff(Integer messageRetentionCutoff) {
    this.messageRetentionCutoff = messageRetentionCutoff;
    return this;
  }

   /**
   * The current server timestamp before which messages should be deleted.
   * @return messageRetentionCutoff
  **/
  @ApiModelProperty(value = "The current server timestamp before which messages should be deleted.")
  public Integer getMessageRetentionCutoff() {
    return messageRetentionCutoff;
  }

  public void setMessageRetentionCutoff(Integer messageRetentionCutoff) {
    this.messageRetentionCutoff = messageRetentionCutoff;
  }

  public DataRetentionPolicy fileRetentionCutoff(Integer fileRetentionCutoff) {
    this.fileRetentionCutoff = fileRetentionCutoff;
    return this;
  }

   /**
   * The current server timestamp before which files should be deleted.
   * @return fileRetentionCutoff
  **/
  @ApiModelProperty(value = "The current server timestamp before which files should be deleted.")
  public Integer getFileRetentionCutoff() {
    return fileRetentionCutoff;
  }

  public void setFileRetentionCutoff(Integer fileRetentionCutoff) {
    this.fileRetentionCutoff = fileRetentionCutoff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataRetentionPolicy dataRetentionPolicy = (DataRetentionPolicy) o;
    return Objects.equals(this.messageDeletionEnabled, dataRetentionPolicy.messageDeletionEnabled) &&
        Objects.equals(this.fileDeletionEnabled, dataRetentionPolicy.fileDeletionEnabled) &&
        Objects.equals(this.messageRetentionCutoff, dataRetentionPolicy.messageRetentionCutoff) &&
        Objects.equals(this.fileRetentionCutoff, dataRetentionPolicy.fileRetentionCutoff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageDeletionEnabled, fileDeletionEnabled, messageRetentionCutoff, fileRetentionCutoff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataRetentionPolicy {\n");
    
    sb.append("    messageDeletionEnabled: ").append(toIndentedString(messageDeletionEnabled)).append("\n");
    sb.append("    fileDeletionEnabled: ").append(toIndentedString(fileDeletionEnabled)).append("\n");
    sb.append("    messageRetentionCutoff: ").append(toIndentedString(messageRetentionCutoff)).append("\n");
    sb.append("    fileRetentionCutoff: ").append(toIndentedString(fileRetentionCutoff)).append("\n");
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

