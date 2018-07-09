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
 * ClusterInfo
 */

public class ClusterInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("config_hash")
  private String configHash = null;

  @SerializedName("internode_url")
  private String internodeUrl = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("last_ping")
  private Integer lastPing = null;

  @SerializedName("is_alive")
  private Boolean isAlive = null;

  public ClusterInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID for the node
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for the node")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ClusterInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The server version the node is on
   * @return version
  **/
  @ApiModelProperty(value = "The server version the node is on")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ClusterInfo configHash(String configHash) {
    this.configHash = configHash;
    return this;
  }

   /**
   * The hash of the configuartion file the node is using
   * @return configHash
  **/
  @ApiModelProperty(value = "The hash of the configuartion file the node is using")
  public String getConfigHash() {
    return configHash;
  }

  public void setConfigHash(String configHash) {
    this.configHash = configHash;
  }

  public ClusterInfo internodeUrl(String internodeUrl) {
    this.internodeUrl = internodeUrl;
    return this;
  }

   /**
   * The URL used to communicate with those node from other nodes
   * @return internodeUrl
  **/
  @ApiModelProperty(value = "The URL used to communicate with those node from other nodes")
  public String getInternodeUrl() {
    return internodeUrl;
  }

  public void setInternodeUrl(String internodeUrl) {
    this.internodeUrl = internodeUrl;
  }

  public ClusterInfo hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * The hostname for this node
   * @return hostname
  **/
  @ApiModelProperty(value = "The hostname for this node")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public ClusterInfo lastPing(Integer lastPing) {
    this.lastPing = lastPing;
    return this;
  }

   /**
   * The time of the last ping to this node
   * @return lastPing
  **/
  @ApiModelProperty(value = "The time of the last ping to this node")
  public Integer getLastPing() {
    return lastPing;
  }

  public void setLastPing(Integer lastPing) {
    this.lastPing = lastPing;
  }

  public ClusterInfo isAlive(Boolean isAlive) {
    this.isAlive = isAlive;
    return this;
  }

   /**
   * Whether or not the node is alive and well
   * @return isAlive
  **/
  @ApiModelProperty(value = "Whether or not the node is alive and well")
  public Boolean isIsAlive() {
    return isAlive;
  }

  public void setIsAlive(Boolean isAlive) {
    this.isAlive = isAlive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterInfo clusterInfo = (ClusterInfo) o;
    return Objects.equals(this.id, clusterInfo.id) &&
        Objects.equals(this.version, clusterInfo.version) &&
        Objects.equals(this.configHash, clusterInfo.configHash) &&
        Objects.equals(this.internodeUrl, clusterInfo.internodeUrl) &&
        Objects.equals(this.hostname, clusterInfo.hostname) &&
        Objects.equals(this.lastPing, clusterInfo.lastPing) &&
        Objects.equals(this.isAlive, clusterInfo.isAlive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, configHash, internodeUrl, hostname, lastPing, isAlive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    configHash: ").append(toIndentedString(configHash)).append("\n");
    sb.append("    internodeUrl: ").append(toIndentedString(internodeUrl)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    lastPing: ").append(toIndentedString(lastPing)).append("\n");
    sb.append("    isAlive: ").append(toIndentedString(isAlive)).append("\n");
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

