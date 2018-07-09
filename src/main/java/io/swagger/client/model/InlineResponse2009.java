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
import io.swagger.client.model.PluginManifest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2009
 */

public class InlineResponse2009 {
  @SerializedName("active")
  private List<PluginManifest> active = null;

  @SerializedName("inactive")
  private List<PluginManifest> inactive = null;

  public InlineResponse2009 active(List<PluginManifest> active) {
    this.active = active;
    return this;
  }

  public InlineResponse2009 addActiveItem(PluginManifest activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<PluginManifest>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public List<PluginManifest> getActive() {
    return active;
  }

  public void setActive(List<PluginManifest> active) {
    this.active = active;
  }

  public InlineResponse2009 inactive(List<PluginManifest> inactive) {
    this.inactive = inactive;
    return this;
  }

  public InlineResponse2009 addInactiveItem(PluginManifest inactiveItem) {
    if (this.inactive == null) {
      this.inactive = new ArrayList<PluginManifest>();
    }
    this.inactive.add(inactiveItem);
    return this;
  }

   /**
   * Get inactive
   * @return inactive
  **/
  @ApiModelProperty(value = "")
  public List<PluginManifest> getInactive() {
    return inactive;
  }

  public void setInactive(List<PluginManifest> inactive) {
    this.inactive = inactive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009 inlineResponse2009 = (InlineResponse2009) o;
    return Objects.equals(this.active, inlineResponse2009.active) &&
        Objects.equals(this.inactive, inlineResponse2009.inactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, inactive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009 {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
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

