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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /1/module/user/createEzsignuser API Request
 **/
@ApiModel(description = "Request for the /1/module/user/createEzsignuser API Request")
public class UserCreateEzsignuserV1Request {
  
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sUserFirstname")
  private String sUserFirstname = null;
  @SerializedName("sUserLastname")
  private String sUserLastname = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;
  @SerializedName("sPhoneRegion")
  private String sPhoneRegion = null;
  @SerializedName("sPhoneExchange")
  private String sPhoneExchange = null;
  @SerializedName("sPhoneNumber")
  private String sPhoneNumber = null;
  @SerializedName("sPhoneExtension")
  private String sPhoneExtension = null;

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
   * The email address.
   **/
  @ApiModelProperty(required = true, value = "The email address.")
  public String getSEmailAddress() {
    return sEmailAddress;
  }
  public void setSEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }

  /**
   * The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123
   **/
  @ApiModelProperty(required = true, value = "The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123")
  public String getSPhoneRegion() {
    return sPhoneRegion;
  }
  public void setSPhoneRegion(String sPhoneRegion) {
    this.sPhoneRegion = sPhoneRegion;
  }

  /**
   * The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123
   **/
  @ApiModelProperty(required = true, value = "The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123")
  public String getSPhoneExchange() {
    return sPhoneExchange;
  }
  public void setSPhoneExchange(String sPhoneExchange) {
    this.sPhoneExchange = sPhoneExchange;
  }

  /**
   * The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123
   **/
  @ApiModelProperty(required = true, value = "The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123")
  public String getSPhoneNumber() {
    return sPhoneNumber;
  }
  public void setSPhoneNumber(String sPhoneNumber) {
    this.sPhoneNumber = sPhoneNumber;
  }

  /**
   * The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
   **/
  @ApiModelProperty(value = "The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers")
  public String getSPhoneExtension() {
    return sPhoneExtension;
  }
  public void setSPhoneExtension(String sPhoneExtension) {
    this.sPhoneExtension = sPhoneExtension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateEzsignuserV1Request userCreateEzsignuserV1Request = (UserCreateEzsignuserV1Request) o;
    return (this.fkiLanguageID == null ? userCreateEzsignuserV1Request.fkiLanguageID == null : this.fkiLanguageID.equals(userCreateEzsignuserV1Request.fkiLanguageID)) &&
        (this.sUserFirstname == null ? userCreateEzsignuserV1Request.sUserFirstname == null : this.sUserFirstname.equals(userCreateEzsignuserV1Request.sUserFirstname)) &&
        (this.sUserLastname == null ? userCreateEzsignuserV1Request.sUserLastname == null : this.sUserLastname.equals(userCreateEzsignuserV1Request.sUserLastname)) &&
        (this.sEmailAddress == null ? userCreateEzsignuserV1Request.sEmailAddress == null : this.sEmailAddress.equals(userCreateEzsignuserV1Request.sEmailAddress)) &&
        (this.sPhoneRegion == null ? userCreateEzsignuserV1Request.sPhoneRegion == null : this.sPhoneRegion.equals(userCreateEzsignuserV1Request.sPhoneRegion)) &&
        (this.sPhoneExchange == null ? userCreateEzsignuserV1Request.sPhoneExchange == null : this.sPhoneExchange.equals(userCreateEzsignuserV1Request.sPhoneExchange)) &&
        (this.sPhoneNumber == null ? userCreateEzsignuserV1Request.sPhoneNumber == null : this.sPhoneNumber.equals(userCreateEzsignuserV1Request.sPhoneNumber)) &&
        (this.sPhoneExtension == null ? userCreateEzsignuserV1Request.sPhoneExtension == null : this.sPhoneExtension.equals(userCreateEzsignuserV1Request.sPhoneExtension));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sUserFirstname == null ? 0: this.sUserFirstname.hashCode());
    result = 31 * result + (this.sUserLastname == null ? 0: this.sUserLastname.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    result = 31 * result + (this.sPhoneRegion == null ? 0: this.sPhoneRegion.hashCode());
    result = 31 * result + (this.sPhoneExchange == null ? 0: this.sPhoneExchange.hashCode());
    result = 31 * result + (this.sPhoneNumber == null ? 0: this.sPhoneNumber.hashCode());
    result = 31 * result + (this.sPhoneExtension == null ? 0: this.sPhoneExtension.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateEzsignuserV1Request {\n");
    
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sUserFirstname: ").append(sUserFirstname).append("\n");
    sb.append("  sUserLastname: ").append(sUserLastname).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("  sPhoneRegion: ").append(sPhoneRegion).append("\n");
    sb.append("  sPhoneExchange: ").append(sPhoneExchange).append("\n");
    sb.append("  sPhoneNumber: ").append(sPhoneNumber).append("\n");
    sb.append("  sPhoneExtension: ").append(sPhoneExtension).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
