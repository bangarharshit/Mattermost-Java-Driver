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
 * Body24
 */

public class Body24 {
  @SerializedName("name")
  private String name = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("header")
  private String header = null;

  public Body24 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique handle for the channel, will be present in the channel URL
   * @return name
  **/
  @ApiModelProperty(value = "The unique handle for the channel, will be present in the channel URL")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Body24 displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The non-unique UI name for the channel
   * @return displayName
  **/
  @ApiModelProperty(value = "The non-unique UI name for the channel")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Body24 purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * A short description of the purpose of the channel
   * @return purpose
  **/
  @ApiModelProperty(value = "A short description of the purpose of the channel")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public Body24 header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Markdown-formatted text to display in the header of the channel
   * @return header
  **/
  @ApiModelProperty(value = "Markdown-formatted text to display in the header of the channel")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body24 body24 = (Body24) o;
    return Objects.equals(this.name, body24.name) &&
        Objects.equals(this.displayName, body24.displayName) &&
        Objects.equals(this.purpose, body24.purpose) &&
        Objects.equals(this.header, body24.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, purpose, header);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body24 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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

