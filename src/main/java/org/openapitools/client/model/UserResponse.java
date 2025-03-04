/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.39
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.FieldEUserType;
import org.openapitools.client.model.UserResponseAllOf;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A User Object
 **/
@ApiModel(description = "A User Object")
public class UserResponse {
  
  @SerializedName("pkiUserID")
  private Integer pkiUserID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("eUserType")
  private FieldEUserType eUserType = null;
  @SerializedName("sUserFirstname")
  private String sUserFirstname = null;
  @SerializedName("sUserLastname")
  private String sUserLastname = null;
  @SerializedName("sUserLoginname")
  private String sUserLoginname = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;

  /**
   * The unique ID of the User
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getPkiUserID() {
    return pkiUserID;
  }
  public void setPkiUserID(Integer pkiUserID) {
    this.pkiUserID = pkiUserID;
  }

  /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")
  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }
  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEUserType getEUserType() {
    return eUserType;
  }
  public void setEUserType(FieldEUserType eUserType) {
    this.eUserType = eUserType;
  }

  /**
   * The First name of the user
   **/
  @ApiModelProperty(required = true, value = "The First name of the user")
  public String getSUserFirstname() {
    return sUserFirstname;
  }
  public void setSUserFirstname(String sUserFirstname) {
    this.sUserFirstname = sUserFirstname;
  }

  /**
   * The Last name of the user
   **/
  @ApiModelProperty(required = true, value = "The Last name of the user")
  public String getSUserLastname() {
    return sUserLastname;
  }
  public void setSUserLastname(String sUserLastname) {
    this.sUserLastname = sUserLastname;
  }

  /**
   * The Login name of the User.
   **/
  @ApiModelProperty(required = true, value = "The Login name of the User.")
  public String getSUserLoginname() {
    return sUserLoginname;
  }
  public void setSUserLoginname(String sUserLoginname) {
    this.sUserLoginname = sUserLoginname;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonAudit getObjAudit() {
    return objAudit;
  }
  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return (this.pkiUserID == null ? userResponse.pkiUserID == null : this.pkiUserID.equals(userResponse.pkiUserID)) &&
        (this.fkiLanguageID == null ? userResponse.fkiLanguageID == null : this.fkiLanguageID.equals(userResponse.fkiLanguageID)) &&
        (this.eUserType == null ? userResponse.eUserType == null : this.eUserType.equals(userResponse.eUserType)) &&
        (this.sUserFirstname == null ? userResponse.sUserFirstname == null : this.sUserFirstname.equals(userResponse.sUserFirstname)) &&
        (this.sUserLastname == null ? userResponse.sUserLastname == null : this.sUserLastname.equals(userResponse.sUserLastname)) &&
        (this.sUserLoginname == null ? userResponse.sUserLoginname == null : this.sUserLoginname.equals(userResponse.sUserLoginname)) &&
        (this.objAudit == null ? userResponse.objAudit == null : this.objAudit.equals(userResponse.objAudit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiUserID == null ? 0: this.pkiUserID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.eUserType == null ? 0: this.eUserType.hashCode());
    result = 31 * result + (this.sUserFirstname == null ? 0: this.sUserFirstname.hashCode());
    result = 31 * result + (this.sUserLastname == null ? 0: this.sUserLastname.hashCode());
    result = 31 * result + (this.sUserLoginname == null ? 0: this.sUserLoginname.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    
    sb.append("  pkiUserID: ").append(pkiUserID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  eUserType: ").append(eUserType).append("\n");
    sb.append("  sUserFirstname: ").append(sUserFirstname).append("\n");
    sb.append("  sUserLastname: ").append(sUserLastname).append("\n");
    sb.append("  sUserLoginname: ").append(sUserLoginname).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
