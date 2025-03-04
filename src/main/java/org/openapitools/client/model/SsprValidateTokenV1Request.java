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

import org.openapitools.client.model.FieldEUserTypeSSPR;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /1/module/sspr/validateToken API Request
 **/
@ApiModel(description = "Request for the /1/module/sspr/validateToken API Request")
public class SsprValidateTokenV1Request {
  
  @SerializedName("pksCustomerCode")
  private String pksCustomerCode = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("eUserTypeSSPR")
  private FieldEUserTypeSSPR eUserTypeSSPR = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;
  @SerializedName("sUserLoginname")
  private String sUserLoginname = null;
  @SerializedName("binUserSSPRtoken")
  private String binUserSSPRtoken = null;

  /**
   * The customer code assigned to your account
   **/
  @ApiModelProperty(required = true, value = "The customer code assigned to your account")
  public String getPksCustomerCode() {
    return pksCustomerCode;
  }
  public void setPksCustomerCode(String pksCustomerCode) {
    this.pksCustomerCode = pksCustomerCode;
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
  public FieldEUserTypeSSPR getEUserTypeSSPR() {
    return eUserTypeSSPR;
  }
  public void setEUserTypeSSPR(FieldEUserTypeSSPR eUserTypeSSPR) {
    this.eUserTypeSSPR = eUserTypeSSPR;
  }

  /**
   * The email address.
   **/
  @ApiModelProperty(value = "The email address.")
  public String getSEmailAddress() {
    return sEmailAddress;
  }
  public void setSEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }

  /**
   * The Login name of the User.
   **/
  @ApiModelProperty(value = "The Login name of the User.")
  public String getSUserLoginname() {
    return sUserLoginname;
  }
  public void setSUserLoginname(String sUserLoginname) {
    this.sUserLoginname = sUserLoginname;
  }

  /**
   * Hex Encoded Secret SSPR token
   **/
  @ApiModelProperty(required = true, value = "Hex Encoded Secret SSPR token")
  public String getBinUserSSPRtoken() {
    return binUserSSPRtoken;
  }
  public void setBinUserSSPRtoken(String binUserSSPRtoken) {
    this.binUserSSPRtoken = binUserSSPRtoken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsprValidateTokenV1Request ssprValidateTokenV1Request = (SsprValidateTokenV1Request) o;
    return (this.pksCustomerCode == null ? ssprValidateTokenV1Request.pksCustomerCode == null : this.pksCustomerCode.equals(ssprValidateTokenV1Request.pksCustomerCode)) &&
        (this.fkiLanguageID == null ? ssprValidateTokenV1Request.fkiLanguageID == null : this.fkiLanguageID.equals(ssprValidateTokenV1Request.fkiLanguageID)) &&
        (this.eUserTypeSSPR == null ? ssprValidateTokenV1Request.eUserTypeSSPR == null : this.eUserTypeSSPR.equals(ssprValidateTokenV1Request.eUserTypeSSPR)) &&
        (this.sEmailAddress == null ? ssprValidateTokenV1Request.sEmailAddress == null : this.sEmailAddress.equals(ssprValidateTokenV1Request.sEmailAddress)) &&
        (this.sUserLoginname == null ? ssprValidateTokenV1Request.sUserLoginname == null : this.sUserLoginname.equals(ssprValidateTokenV1Request.sUserLoginname)) &&
        (this.binUserSSPRtoken == null ? ssprValidateTokenV1Request.binUserSSPRtoken == null : this.binUserSSPRtoken.equals(ssprValidateTokenV1Request.binUserSSPRtoken));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pksCustomerCode == null ? 0: this.pksCustomerCode.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.eUserTypeSSPR == null ? 0: this.eUserTypeSSPR.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    result = 31 * result + (this.sUserLoginname == null ? 0: this.sUserLoginname.hashCode());
    result = 31 * result + (this.binUserSSPRtoken == null ? 0: this.binUserSSPRtoken.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsprValidateTokenV1Request {\n");
    
    sb.append("  pksCustomerCode: ").append(pksCustomerCode).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  eUserTypeSSPR: ").append(eUserTypeSSPR).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("  sUserLoginname: ").append(sUserLoginname).append("\n");
    sb.append("  binUserSSPRtoken: ").append(binUserSSPRtoken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
