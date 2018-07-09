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
 * SlackAttachmentField
 */

public class SlackAttachmentField {
  @SerializedName("Title")
  private String title = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("Short")
  private Boolean _short = null;

  public SlackAttachmentField title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SlackAttachmentField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the attachment, set as string but capable with golang interface
   * @return value
  **/
  @ApiModelProperty(value = "The value of the attachment, set as string but capable with golang interface")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SlackAttachmentField _short(Boolean _short) {
    this._short = _short;
    return this;
  }

   /**
   * Get _short
   * @return _short
  **/
  @ApiModelProperty(value = "")
  public Boolean isShort() {
    return _short;
  }

  public void setShort(Boolean _short) {
    this._short = _short;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackAttachmentField slackAttachmentField = (SlackAttachmentField) o;
    return Objects.equals(this.title, slackAttachmentField.title) &&
        Objects.equals(this.value, slackAttachmentField.value) &&
        Objects.equals(this._short, slackAttachmentField._short);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, value, _short);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackAttachmentField {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
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
