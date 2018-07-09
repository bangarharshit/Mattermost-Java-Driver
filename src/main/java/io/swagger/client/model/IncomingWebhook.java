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
 * IncomingWebhook
 */

public class IncomingWebhook {
  @SerializedName("id")
  private String id = null;

  @SerializedName("create_at")
  private Integer createAt = null;

  @SerializedName("update_at")
  private Integer updateAt = null;

  @SerializedName("delete_at")
  private Integer deleteAt = null;

  @SerializedName("channel_id")
  private String channelId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("display_name")
  private String displayName = null;

  public IncomingWebhook id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this incoming webhook
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier for this incoming webhook")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IncomingWebhook createAt(Integer createAt) {
    this.createAt = createAt;
    return this;
  }

   /**
   * Get createAt
   * @return createAt
  **/
  @ApiModelProperty(value = "")
  public Integer getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Integer createAt) {
    this.createAt = createAt;
  }

  public IncomingWebhook updateAt(Integer updateAt) {
    this.updateAt = updateAt;
    return this;
  }

   /**
   * Get updateAt
   * @return updateAt
  **/
  @ApiModelProperty(value = "")
  public Integer getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Integer updateAt) {
    this.updateAt = updateAt;
  }

  public IncomingWebhook deleteAt(Integer deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

   /**
   * Get deleteAt
   * @return deleteAt
  **/
  @ApiModelProperty(value = "")
  public Integer getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(Integer deleteAt) {
    this.deleteAt = deleteAt;
  }

  public IncomingWebhook channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * The ID of a public channel or private group that receives the webhook payloads
   * @return channelId
  **/
  @ApiModelProperty(value = "The ID of a public channel or private group that receives the webhook payloads")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public IncomingWebhook description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description for this incoming webhook
   * @return description
  **/
  @ApiModelProperty(value = "The description for this incoming webhook")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IncomingWebhook displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name for this incoming webhook
   * @return displayName
  **/
  @ApiModelProperty(value = "The display name for this incoming webhook")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomingWebhook incomingWebhook = (IncomingWebhook) o;
    return Objects.equals(this.id, incomingWebhook.id) &&
        Objects.equals(this.createAt, incomingWebhook.createAt) &&
        Objects.equals(this.updateAt, incomingWebhook.updateAt) &&
        Objects.equals(this.deleteAt, incomingWebhook.deleteAt) &&
        Objects.equals(this.channelId, incomingWebhook.channelId) &&
        Objects.equals(this.description, incomingWebhook.description) &&
        Objects.equals(this.displayName, incomingWebhook.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createAt, updateAt, deleteAt, channelId, description, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomingWebhook {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
