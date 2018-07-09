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
 * Body19
 */

public class Body19 {
  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("invite_id")
  private String inviteId = null;

  @SerializedName("allow_open_invite")
  private Boolean allowOpenInvite = null;

  public Body19 displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Body19 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Body19 companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Body19 inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

   /**
   * Get inviteId
   * @return inviteId
  **/
  @ApiModelProperty(value = "")
  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public Body19 allowOpenInvite(Boolean allowOpenInvite) {
    this.allowOpenInvite = allowOpenInvite;
    return this;
  }

   /**
   * Get allowOpenInvite
   * @return allowOpenInvite
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowOpenInvite() {
    return allowOpenInvite;
  }

  public void setAllowOpenInvite(Boolean allowOpenInvite) {
    this.allowOpenInvite = allowOpenInvite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body19 body19 = (Body19) o;
    return Objects.equals(this.displayName, body19.displayName) &&
        Objects.equals(this.description, body19.description) &&
        Objects.equals(this.companyName, body19.companyName) &&
        Objects.equals(this.inviteId, body19.inviteId) &&
        Objects.equals(this.allowOpenInvite, body19.allowOpenInvite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, description, companyName, inviteId, allowOpenInvite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body19 {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
    sb.append("    allowOpenInvite: ").append(toIndentedString(allowOpenInvite)).append("\n");
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
