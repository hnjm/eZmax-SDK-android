/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.31
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Gives informations about the user that created the object and the last user to have modified it.  If the object was never modified after creation, both Created and Modified informations will be the same.  Apikey details will only be provided if the changes were made by an API key.  
 **/
@ApiModel(description = "Gives informations about the user that created the object and the last user to have modified it.  If the object was never modified after creation, both Created and Modified informations will be the same.  Apikey details will only be provided if the changes were made by an API key.  ")
public class CommonAudit {
  
  @SerializedName("fkiUserIDCreated")
  private Integer fkiUserIDCreated = null;
  @SerializedName("fkiUserIDModified")
  private Integer fkiUserIDModified = null;
  @SerializedName("fkiApikeyIDCreated")
  private Integer fkiApikeyIDCreated = null;
  @SerializedName("fkiApikeyIDModified")
  private Integer fkiApikeyIDModified = null;
  @SerializedName("dtCreatedDate")
  private String dtCreatedDate = null;
  @SerializedName("dtModifiedDate")
  private String dtModifiedDate = null;

  /**
   * The id of the User that created the object.
   **/
  @ApiModelProperty(required = true, value = "The id of the User that created the object.")
  public Integer getFkiUserIDCreated() {
    return fkiUserIDCreated;
  }
  public void setFkiUserIDCreated(Integer fkiUserIDCreated) {
    this.fkiUserIDCreated = fkiUserIDCreated;
  }

  /**
   * The id of the User that made the last modification on the object.
   **/
  @ApiModelProperty(required = true, value = "The id of the User that made the last modification on the object.")
  public Integer getFkiUserIDModified() {
    return fkiUserIDModified;
  }
  public void setFkiUserIDModified(Integer fkiUserIDModified) {
    this.fkiUserIDModified = fkiUserIDModified;
  }

  /**
   * The id of the API Key that created the object.
   **/
  @ApiModelProperty(value = "The id of the API Key that created the object.")
  public Integer getFkiApikeyIDCreated() {
    return fkiApikeyIDCreated;
  }
  public void setFkiApikeyIDCreated(Integer fkiApikeyIDCreated) {
    this.fkiApikeyIDCreated = fkiApikeyIDCreated;
  }

  /**
   * The id of the API Key that made the last modification on the object.
   **/
  @ApiModelProperty(value = "The id of the API Key that made the last modification on the object.")
  public Integer getFkiApikeyIDModified() {
    return fkiApikeyIDModified;
  }
  public void setFkiApikeyIDModified(Integer fkiApikeyIDModified) {
    this.fkiApikeyIDModified = fkiApikeyIDModified;
  }

  /**
   * Represent a Date Time. The timezone is the one configured in the User's profile.
   **/
  @ApiModelProperty(required = true, value = "Represent a Date Time. The timezone is the one configured in the User's profile.")
  public String getDtCreatedDate() {
    return dtCreatedDate;
  }
  public void setDtCreatedDate(String dtCreatedDate) {
    this.dtCreatedDate = dtCreatedDate;
  }

  /**
   * Represent a Date Time. The timezone is the one configured in the User's profile.
   **/
  @ApiModelProperty(required = true, value = "Represent a Date Time. The timezone is the one configured in the User's profile.")
  public String getDtModifiedDate() {
    return dtModifiedDate;
  }
  public void setDtModifiedDate(String dtModifiedDate) {
    this.dtModifiedDate = dtModifiedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonAudit commonAudit = (CommonAudit) o;
    return (this.fkiUserIDCreated == null ? commonAudit.fkiUserIDCreated == null : this.fkiUserIDCreated.equals(commonAudit.fkiUserIDCreated)) &&
        (this.fkiUserIDModified == null ? commonAudit.fkiUserIDModified == null : this.fkiUserIDModified.equals(commonAudit.fkiUserIDModified)) &&
        (this.fkiApikeyIDCreated == null ? commonAudit.fkiApikeyIDCreated == null : this.fkiApikeyIDCreated.equals(commonAudit.fkiApikeyIDCreated)) &&
        (this.fkiApikeyIDModified == null ? commonAudit.fkiApikeyIDModified == null : this.fkiApikeyIDModified.equals(commonAudit.fkiApikeyIDModified)) &&
        (this.dtCreatedDate == null ? commonAudit.dtCreatedDate == null : this.dtCreatedDate.equals(commonAudit.dtCreatedDate)) &&
        (this.dtModifiedDate == null ? commonAudit.dtModifiedDate == null : this.dtModifiedDate.equals(commonAudit.dtModifiedDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiUserIDCreated == null ? 0: this.fkiUserIDCreated.hashCode());
    result = 31 * result + (this.fkiUserIDModified == null ? 0: this.fkiUserIDModified.hashCode());
    result = 31 * result + (this.fkiApikeyIDCreated == null ? 0: this.fkiApikeyIDCreated.hashCode());
    result = 31 * result + (this.fkiApikeyIDModified == null ? 0: this.fkiApikeyIDModified.hashCode());
    result = 31 * result + (this.dtCreatedDate == null ? 0: this.dtCreatedDate.hashCode());
    result = 31 * result + (this.dtModifiedDate == null ? 0: this.dtModifiedDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonAudit {\n");
    
    sb.append("  fkiUserIDCreated: ").append(fkiUserIDCreated).append("\n");
    sb.append("  fkiUserIDModified: ").append(fkiUserIDModified).append("\n");
    sb.append("  fkiApikeyIDCreated: ").append(fkiApikeyIDCreated).append("\n");
    sb.append("  fkiApikeyIDModified: ").append(fkiApikeyIDModified).append("\n");
    sb.append("  dtCreatedDate: ").append(dtCreatedDate).append("\n");
    sb.append("  dtModifiedDate: ").append(dtModifiedDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
