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
 * Body30
 */

public class Body30 {
  @SerializedName("terms")
  private String terms = null;

  @SerializedName("is_or_search")
  private Boolean isOrSearch = null;

  public Body30 terms(String terms) {
    this.terms = terms;
    return this;
  }

   /**
   * The search terms as inputed by the user. To search for posts from a user include &#x60;from:someusername&#x60;, using a user&#39;s username. To search in a specific channel include &#x60;in:somechannel&#x60;, using the channel name (not the display name).
   * @return terms
  **/
  @ApiModelProperty(required = true, value = "The search terms as inputed by the user. To search for posts from a user include `from:someusername`, using a user's username. To search in a specific channel include `in:somechannel`, using the channel name (not the display name).")
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public Body30 isOrSearch(Boolean isOrSearch) {
    this.isOrSearch = isOrSearch;
    return this;
  }

   /**
   * Set to true if an Or search should be performed vs an And search.
   * @return isOrSearch
  **/
  @ApiModelProperty(required = true, value = "Set to true if an Or search should be performed vs an And search.")
  public Boolean isIsOrSearch() {
    return isOrSearch;
  }

  public void setIsOrSearch(Boolean isOrSearch) {
    this.isOrSearch = isOrSearch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body30 body30 = (Body30) o;
    return Objects.equals(this.terms, body30.terms) &&
        Objects.equals(this.isOrSearch, body30.isOrSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terms, isOrSearch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body30 {\n");
    
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    isOrSearch: ").append(toIndentedString(isOrSearch)).append("\n");
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
