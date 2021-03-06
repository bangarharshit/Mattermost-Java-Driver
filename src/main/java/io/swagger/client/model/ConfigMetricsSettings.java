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
 * ConfigMetricsSettings
 */

public class ConfigMetricsSettings {
  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("BlockProfileRate")
  private Integer blockProfileRate = null;

  @SerializedName("ListenAddress")
  private String listenAddress = null;

  public ConfigMetricsSettings enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public ConfigMetricsSettings blockProfileRate(Integer blockProfileRate) {
    this.blockProfileRate = blockProfileRate;
    return this;
  }

   /**
   * Get blockProfileRate
   * @return blockProfileRate
  **/
  @ApiModelProperty(value = "")
  public Integer getBlockProfileRate() {
    return blockProfileRate;
  }

  public void setBlockProfileRate(Integer blockProfileRate) {
    this.blockProfileRate = blockProfileRate;
  }

  public ConfigMetricsSettings listenAddress(String listenAddress) {
    this.listenAddress = listenAddress;
    return this;
  }

   /**
   * Get listenAddress
   * @return listenAddress
  **/
  @ApiModelProperty(value = "")
  public String getListenAddress() {
    return listenAddress;
  }

  public void setListenAddress(String listenAddress) {
    this.listenAddress = listenAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigMetricsSettings configMetricsSettings = (ConfigMetricsSettings) o;
    return Objects.equals(this.enable, configMetricsSettings.enable) &&
        Objects.equals(this.blockProfileRate, configMetricsSettings.blockProfileRate) &&
        Objects.equals(this.listenAddress, configMetricsSettings.listenAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, blockProfileRate, listenAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigMetricsSettings {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    blockProfileRate: ").append(toIndentedString(blockProfileRate)).append("\n");
    sb.append("    listenAddress: ").append(toIndentedString(listenAddress)).append("\n");
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

