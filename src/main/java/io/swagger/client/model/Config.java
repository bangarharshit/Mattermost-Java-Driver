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
import io.swagger.client.model.ConfigAnalyticsSettings;
import io.swagger.client.model.ConfigClusterSettings;
import io.swagger.client.model.ConfigComplianceSettings;
import io.swagger.client.model.ConfigEmailSettings;
import io.swagger.client.model.ConfigFileSettings;
import io.swagger.client.model.ConfigGitLabSettings;
import io.swagger.client.model.ConfigLdapSettings;
import io.swagger.client.model.ConfigLocalizationSettings;
import io.swagger.client.model.ConfigLogSettings;
import io.swagger.client.model.ConfigMetricsSettings;
import io.swagger.client.model.ConfigNativeAppSettings;
import io.swagger.client.model.ConfigPasswordSettings;
import io.swagger.client.model.ConfigPrivacySettings;
import io.swagger.client.model.ConfigRateLimitSettings;
import io.swagger.client.model.ConfigSamlSettings;
import io.swagger.client.model.ConfigServiceSettings;
import io.swagger.client.model.ConfigSqlSettings;
import io.swagger.client.model.ConfigSupportSettings;
import io.swagger.client.model.ConfigTeamSettings;
import io.swagger.client.model.ConfigWebrtcSettings;
import java.io.IOException;

/**
 * Config
 */

public class Config {
  @SerializedName("ServiceSettings")
  private ConfigServiceSettings serviceSettings = null;

  @SerializedName("TeamSettings")
  private ConfigTeamSettings teamSettings = null;

  @SerializedName("SqlSettings")
  private ConfigSqlSettings sqlSettings = null;

  @SerializedName("LogSettings")
  private ConfigLogSettings logSettings = null;

  @SerializedName("PasswordSettings")
  private ConfigPasswordSettings passwordSettings = null;

  @SerializedName("FileSettings")
  private ConfigFileSettings fileSettings = null;

  @SerializedName("EmailSettings")
  private ConfigEmailSettings emailSettings = null;

  @SerializedName("RateLimitSettings")
  private ConfigRateLimitSettings rateLimitSettings = null;

  @SerializedName("PrivacySettings")
  private ConfigPrivacySettings privacySettings = null;

  @SerializedName("SupportSettings")
  private ConfigSupportSettings supportSettings = null;

  @SerializedName("GitLabSettings")
  private ConfigGitLabSettings gitLabSettings = null;

  @SerializedName("GoogleSettings")
  private ConfigGitLabSettings googleSettings = null;

  @SerializedName("Office365Settings")
  private ConfigGitLabSettings office365Settings = null;

  @SerializedName("LdapSettings")
  private ConfigLdapSettings ldapSettings = null;

  @SerializedName("ComplianceSettings")
  private ConfigComplianceSettings complianceSettings = null;

  @SerializedName("LocalizationSettings")
  private ConfigLocalizationSettings localizationSettings = null;

  @SerializedName("SamlSettings")
  private ConfigSamlSettings samlSettings = null;

  @SerializedName("NativeAppSettings")
  private ConfigNativeAppSettings nativeAppSettings = null;

  @SerializedName("ClusterSettings")
  private ConfigClusterSettings clusterSettings = null;

  @SerializedName("MetricsSettings")
  private ConfigMetricsSettings metricsSettings = null;

  @SerializedName("AnalyticsSettings")
  private ConfigAnalyticsSettings analyticsSettings = null;

  @SerializedName("WebrtcSettings")
  private ConfigWebrtcSettings webrtcSettings = null;

  public Config serviceSettings(ConfigServiceSettings serviceSettings) {
    this.serviceSettings = serviceSettings;
    return this;
  }

   /**
   * Get serviceSettings
   * @return serviceSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigServiceSettings getServiceSettings() {
    return serviceSettings;
  }

  public void setServiceSettings(ConfigServiceSettings serviceSettings) {
    this.serviceSettings = serviceSettings;
  }

  public Config teamSettings(ConfigTeamSettings teamSettings) {
    this.teamSettings = teamSettings;
    return this;
  }

   /**
   * Get teamSettings
   * @return teamSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigTeamSettings getTeamSettings() {
    return teamSettings;
  }

  public void setTeamSettings(ConfigTeamSettings teamSettings) {
    this.teamSettings = teamSettings;
  }

  public Config sqlSettings(ConfigSqlSettings sqlSettings) {
    this.sqlSettings = sqlSettings;
    return this;
  }

   /**
   * Get sqlSettings
   * @return sqlSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigSqlSettings getSqlSettings() {
    return sqlSettings;
  }

  public void setSqlSettings(ConfigSqlSettings sqlSettings) {
    this.sqlSettings = sqlSettings;
  }

  public Config logSettings(ConfigLogSettings logSettings) {
    this.logSettings = logSettings;
    return this;
  }

   /**
   * Get logSettings
   * @return logSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigLogSettings getLogSettings() {
    return logSettings;
  }

  public void setLogSettings(ConfigLogSettings logSettings) {
    this.logSettings = logSettings;
  }

  public Config passwordSettings(ConfigPasswordSettings passwordSettings) {
    this.passwordSettings = passwordSettings;
    return this;
  }

   /**
   * Get passwordSettings
   * @return passwordSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigPasswordSettings getPasswordSettings() {
    return passwordSettings;
  }

  public void setPasswordSettings(ConfigPasswordSettings passwordSettings) {
    this.passwordSettings = passwordSettings;
  }

  public Config fileSettings(ConfigFileSettings fileSettings) {
    this.fileSettings = fileSettings;
    return this;
  }

   /**
   * Get fileSettings
   * @return fileSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigFileSettings getFileSettings() {
    return fileSettings;
  }

  public void setFileSettings(ConfigFileSettings fileSettings) {
    this.fileSettings = fileSettings;
  }

  public Config emailSettings(ConfigEmailSettings emailSettings) {
    this.emailSettings = emailSettings;
    return this;
  }

   /**
   * Get emailSettings
   * @return emailSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigEmailSettings getEmailSettings() {
    return emailSettings;
  }

  public void setEmailSettings(ConfigEmailSettings emailSettings) {
    this.emailSettings = emailSettings;
  }

  public Config rateLimitSettings(ConfigRateLimitSettings rateLimitSettings) {
    this.rateLimitSettings = rateLimitSettings;
    return this;
  }

   /**
   * Get rateLimitSettings
   * @return rateLimitSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigRateLimitSettings getRateLimitSettings() {
    return rateLimitSettings;
  }

  public void setRateLimitSettings(ConfigRateLimitSettings rateLimitSettings) {
    this.rateLimitSettings = rateLimitSettings;
  }

  public Config privacySettings(ConfigPrivacySettings privacySettings) {
    this.privacySettings = privacySettings;
    return this;
  }

   /**
   * Get privacySettings
   * @return privacySettings
  **/
  @ApiModelProperty(value = "")
  public ConfigPrivacySettings getPrivacySettings() {
    return privacySettings;
  }

  public void setPrivacySettings(ConfigPrivacySettings privacySettings) {
    this.privacySettings = privacySettings;
  }

  public Config supportSettings(ConfigSupportSettings supportSettings) {
    this.supportSettings = supportSettings;
    return this;
  }

   /**
   * Get supportSettings
   * @return supportSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigSupportSettings getSupportSettings() {
    return supportSettings;
  }

  public void setSupportSettings(ConfigSupportSettings supportSettings) {
    this.supportSettings = supportSettings;
  }

  public Config gitLabSettings(ConfigGitLabSettings gitLabSettings) {
    this.gitLabSettings = gitLabSettings;
    return this;
  }

   /**
   * Get gitLabSettings
   * @return gitLabSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigGitLabSettings getGitLabSettings() {
    return gitLabSettings;
  }

  public void setGitLabSettings(ConfigGitLabSettings gitLabSettings) {
    this.gitLabSettings = gitLabSettings;
  }

  public Config googleSettings(ConfigGitLabSettings googleSettings) {
    this.googleSettings = googleSettings;
    return this;
  }

   /**
   * Get googleSettings
   * @return googleSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigGitLabSettings getGoogleSettings() {
    return googleSettings;
  }

  public void setGoogleSettings(ConfigGitLabSettings googleSettings) {
    this.googleSettings = googleSettings;
  }

  public Config office365Settings(ConfigGitLabSettings office365Settings) {
    this.office365Settings = office365Settings;
    return this;
  }

   /**
   * Get office365Settings
   * @return office365Settings
  **/
  @ApiModelProperty(value = "")
  public ConfigGitLabSettings getOffice365Settings() {
    return office365Settings;
  }

  public void setOffice365Settings(ConfigGitLabSettings office365Settings) {
    this.office365Settings = office365Settings;
  }

  public Config ldapSettings(ConfigLdapSettings ldapSettings) {
    this.ldapSettings = ldapSettings;
    return this;
  }

   /**
   * Get ldapSettings
   * @return ldapSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigLdapSettings getLdapSettings() {
    return ldapSettings;
  }

  public void setLdapSettings(ConfigLdapSettings ldapSettings) {
    this.ldapSettings = ldapSettings;
  }

  public Config complianceSettings(ConfigComplianceSettings complianceSettings) {
    this.complianceSettings = complianceSettings;
    return this;
  }

   /**
   * Get complianceSettings
   * @return complianceSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigComplianceSettings getComplianceSettings() {
    return complianceSettings;
  }

  public void setComplianceSettings(ConfigComplianceSettings complianceSettings) {
    this.complianceSettings = complianceSettings;
  }

  public Config localizationSettings(ConfigLocalizationSettings localizationSettings) {
    this.localizationSettings = localizationSettings;
    return this;
  }

   /**
   * Get localizationSettings
   * @return localizationSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigLocalizationSettings getLocalizationSettings() {
    return localizationSettings;
  }

  public void setLocalizationSettings(ConfigLocalizationSettings localizationSettings) {
    this.localizationSettings = localizationSettings;
  }

  public Config samlSettings(ConfigSamlSettings samlSettings) {
    this.samlSettings = samlSettings;
    return this;
  }

   /**
   * Get samlSettings
   * @return samlSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigSamlSettings getSamlSettings() {
    return samlSettings;
  }

  public void setSamlSettings(ConfigSamlSettings samlSettings) {
    this.samlSettings = samlSettings;
  }

  public Config nativeAppSettings(ConfigNativeAppSettings nativeAppSettings) {
    this.nativeAppSettings = nativeAppSettings;
    return this;
  }

   /**
   * Get nativeAppSettings
   * @return nativeAppSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigNativeAppSettings getNativeAppSettings() {
    return nativeAppSettings;
  }

  public void setNativeAppSettings(ConfigNativeAppSettings nativeAppSettings) {
    this.nativeAppSettings = nativeAppSettings;
  }

  public Config clusterSettings(ConfigClusterSettings clusterSettings) {
    this.clusterSettings = clusterSettings;
    return this;
  }

   /**
   * Get clusterSettings
   * @return clusterSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigClusterSettings getClusterSettings() {
    return clusterSettings;
  }

  public void setClusterSettings(ConfigClusterSettings clusterSettings) {
    this.clusterSettings = clusterSettings;
  }

  public Config metricsSettings(ConfigMetricsSettings metricsSettings) {
    this.metricsSettings = metricsSettings;
    return this;
  }

   /**
   * Get metricsSettings
   * @return metricsSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigMetricsSettings getMetricsSettings() {
    return metricsSettings;
  }

  public void setMetricsSettings(ConfigMetricsSettings metricsSettings) {
    this.metricsSettings = metricsSettings;
  }

  public Config analyticsSettings(ConfigAnalyticsSettings analyticsSettings) {
    this.analyticsSettings = analyticsSettings;
    return this;
  }

   /**
   * Get analyticsSettings
   * @return analyticsSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigAnalyticsSettings getAnalyticsSettings() {
    return analyticsSettings;
  }

  public void setAnalyticsSettings(ConfigAnalyticsSettings analyticsSettings) {
    this.analyticsSettings = analyticsSettings;
  }

  public Config webrtcSettings(ConfigWebrtcSettings webrtcSettings) {
    this.webrtcSettings = webrtcSettings;
    return this;
  }

   /**
   * Get webrtcSettings
   * @return webrtcSettings
  **/
  @ApiModelProperty(value = "")
  public ConfigWebrtcSettings getWebrtcSettings() {
    return webrtcSettings;
  }

  public void setWebrtcSettings(ConfigWebrtcSettings webrtcSettings) {
    this.webrtcSettings = webrtcSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Config config = (Config) o;
    return Objects.equals(this.serviceSettings, config.serviceSettings) &&
        Objects.equals(this.teamSettings, config.teamSettings) &&
        Objects.equals(this.sqlSettings, config.sqlSettings) &&
        Objects.equals(this.logSettings, config.logSettings) &&
        Objects.equals(this.passwordSettings, config.passwordSettings) &&
        Objects.equals(this.fileSettings, config.fileSettings) &&
        Objects.equals(this.emailSettings, config.emailSettings) &&
        Objects.equals(this.rateLimitSettings, config.rateLimitSettings) &&
        Objects.equals(this.privacySettings, config.privacySettings) &&
        Objects.equals(this.supportSettings, config.supportSettings) &&
        Objects.equals(this.gitLabSettings, config.gitLabSettings) &&
        Objects.equals(this.googleSettings, config.googleSettings) &&
        Objects.equals(this.office365Settings, config.office365Settings) &&
        Objects.equals(this.ldapSettings, config.ldapSettings) &&
        Objects.equals(this.complianceSettings, config.complianceSettings) &&
        Objects.equals(this.localizationSettings, config.localizationSettings) &&
        Objects.equals(this.samlSettings, config.samlSettings) &&
        Objects.equals(this.nativeAppSettings, config.nativeAppSettings) &&
        Objects.equals(this.clusterSettings, config.clusterSettings) &&
        Objects.equals(this.metricsSettings, config.metricsSettings) &&
        Objects.equals(this.analyticsSettings, config.analyticsSettings) &&
        Objects.equals(this.webrtcSettings, config.webrtcSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceSettings, teamSettings, sqlSettings, logSettings, passwordSettings, fileSettings, emailSettings, rateLimitSettings, privacySettings, supportSettings, gitLabSettings, googleSettings, office365Settings, ldapSettings, complianceSettings, localizationSettings, samlSettings, nativeAppSettings, clusterSettings, metricsSettings, analyticsSettings, webrtcSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    
    sb.append("    serviceSettings: ").append(toIndentedString(serviceSettings)).append("\n");
    sb.append("    teamSettings: ").append(toIndentedString(teamSettings)).append("\n");
    sb.append("    sqlSettings: ").append(toIndentedString(sqlSettings)).append("\n");
    sb.append("    logSettings: ").append(toIndentedString(logSettings)).append("\n");
    sb.append("    passwordSettings: ").append(toIndentedString(passwordSettings)).append("\n");
    sb.append("    fileSettings: ").append(toIndentedString(fileSettings)).append("\n");
    sb.append("    emailSettings: ").append(toIndentedString(emailSettings)).append("\n");
    sb.append("    rateLimitSettings: ").append(toIndentedString(rateLimitSettings)).append("\n");
    sb.append("    privacySettings: ").append(toIndentedString(privacySettings)).append("\n");
    sb.append("    supportSettings: ").append(toIndentedString(supportSettings)).append("\n");
    sb.append("    gitLabSettings: ").append(toIndentedString(gitLabSettings)).append("\n");
    sb.append("    googleSettings: ").append(toIndentedString(googleSettings)).append("\n");
    sb.append("    office365Settings: ").append(toIndentedString(office365Settings)).append("\n");
    sb.append("    ldapSettings: ").append(toIndentedString(ldapSettings)).append("\n");
    sb.append("    complianceSettings: ").append(toIndentedString(complianceSettings)).append("\n");
    sb.append("    localizationSettings: ").append(toIndentedString(localizationSettings)).append("\n");
    sb.append("    samlSettings: ").append(toIndentedString(samlSettings)).append("\n");
    sb.append("    nativeAppSettings: ").append(toIndentedString(nativeAppSettings)).append("\n");
    sb.append("    clusterSettings: ").append(toIndentedString(clusterSettings)).append("\n");
    sb.append("    metricsSettings: ").append(toIndentedString(metricsSettings)).append("\n");
    sb.append("    analyticsSettings: ").append(toIndentedString(analyticsSettings)).append("\n");
    sb.append("    webrtcSettings: ").append(toIndentedString(webrtcSettings)).append("\n");
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

