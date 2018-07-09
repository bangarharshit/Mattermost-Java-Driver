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
 * Body38
 */

public class Body38 {
  @SerializedName("team_id")
  private String teamId = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("trigger")
  private String trigger = null;

  @SerializedName("url")
  private String url = null;

  public Body38 teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

   /**
   * Team ID to where the command should be created
   * @return teamId
  **/
  @ApiModelProperty(required = true, value = "Team ID to where the command should be created")
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public Body38 method(String method) {
    this.method = method;
    return this;
  }

   /**
   * &#x60;&#39;P&#39;&#x60; for post request, &#x60;&#39;G&#39;&#x60; for get request
   * @return method
  **/
  @ApiModelProperty(required = true, value = "`'P'` for post request, `'G'` for get request")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Body38 trigger(String trigger) {
    this.trigger = trigger;
    return this;
  }

   /**
   * Activation word to trigger the command
   * @return trigger
  **/
  @ApiModelProperty(required = true, value = "Activation word to trigger the command")
  public String getTrigger() {
    return trigger;
  }

  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

  public Body38 url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL that the command will make the request
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The URL that the command will make the request")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body38 body38 = (Body38) o;
    return Objects.equals(this.teamId, body38.teamId) &&
        Objects.equals(this.method, body38.method) &&
        Objects.equals(this.trigger, body38.trigger) &&
        Objects.equals(this.url, body38.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, method, trigger, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body38 {\n");
    
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

