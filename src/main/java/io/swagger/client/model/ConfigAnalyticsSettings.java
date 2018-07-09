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
 * ConfigAnalyticsSettings
 */

public class ConfigAnalyticsSettings {
  @SerializedName("MaxUsersForStatistics")
  private Integer maxUsersForStatistics = null;

  public ConfigAnalyticsSettings maxUsersForStatistics(Integer maxUsersForStatistics) {
    this.maxUsersForStatistics = maxUsersForStatistics;
    return this;
  }

   /**
   * Get maxUsersForStatistics
   * @return maxUsersForStatistics
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxUsersForStatistics() {
    return maxUsersForStatistics;
  }

  public void setMaxUsersForStatistics(Integer maxUsersForStatistics) {
    this.maxUsersForStatistics = maxUsersForStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigAnalyticsSettings configAnalyticsSettings = (ConfigAnalyticsSettings) o;
    return Objects.equals(this.maxUsersForStatistics, configAnalyticsSettings.maxUsersForStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxUsersForStatistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigAnalyticsSettings {\n");
    
    sb.append("    maxUsersForStatistics: ").append(toIndentedString(maxUsersForStatistics)).append("\n");
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
