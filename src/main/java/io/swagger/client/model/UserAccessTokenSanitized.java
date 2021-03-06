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
 * UserAccessTokenSanitized
 */

public class UserAccessTokenSanitized {
  @SerializedName("id")
  private String id = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  public UserAccessTokenSanitized id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the token
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the token")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserAccessTokenSanitized userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user the token authenticates for
   * @return userId
  **/
  @ApiModelProperty(value = "The user the token authenticates for")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserAccessTokenSanitized description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the token usage
   * @return description
  **/
  @ApiModelProperty(value = "A description of the token usage")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserAccessTokenSanitized isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates whether the token is active
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates whether the token is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccessTokenSanitized userAccessTokenSanitized = (UserAccessTokenSanitized) o;
    return Objects.equals(this.id, userAccessTokenSanitized.id) &&
        Objects.equals(this.userId, userAccessTokenSanitized.userId) &&
        Objects.equals(this.description, userAccessTokenSanitized.description) &&
        Objects.equals(this.isActive, userAccessTokenSanitized.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, description, isActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccessTokenSanitized {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

