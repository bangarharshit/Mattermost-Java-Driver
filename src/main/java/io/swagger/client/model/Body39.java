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
 * Body39
 */

public class Body39 {
  @SerializedName("channel_id")
  private String channelId = null;

  @SerializedName("command")
  private String command = null;

  public Body39 channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Channel Id where the command will execute
   * @return channelId
  **/
  @ApiModelProperty(required = true, value = "Channel Id where the command will execute")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public Body39 command(String command) {
    this.command = command;
    return this;
  }

   /**
   * The slash command to execute
   * @return command
  **/
  @ApiModelProperty(required = true, value = "The slash command to execute")
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body39 body39 = (Body39) o;
    return Objects.equals(this.channelId, body39.channelId) &&
        Objects.equals(this.command, body39.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, command);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body39 {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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

