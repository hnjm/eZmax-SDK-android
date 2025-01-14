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
import org.openapitools.client.model.EzsignfolderResponse;
import org.openapitools.client.model.FieldEEzsignfolderSendreminderfrequency;
import org.openapitools.client.model.FieldEEzsignfolderStep;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfolder Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsignfolder Object and children to create a complete structure")
public class EzsignfolderResponseCompound {
  
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiEzsigntsarequirementID")
  private Integer fkiEzsigntsarequirementID = null;
  @SerializedName("sEzsignfolderDescription")
  private String sEzsignfolderDescription = null;
  @SerializedName("tEzsignfolderNote")
  private String tEzsignfolderNote = null;
  @SerializedName("eEzsignfolderSendreminderfrequency")
  private FieldEEzsignfolderSendreminderfrequency eEzsignfolderSendreminderfrequency = null;
  @SerializedName("pkiEzsignfolderID")
  private Integer pkiEzsignfolderID = null;
  @SerializedName("dtEzsignfolderSentdate")
  private String dtEzsignfolderSentdate = null;
  @SerializedName("eEzsignfolderStep")
  private FieldEEzsignfolderStep eEzsignfolderStep = null;
  @SerializedName("dtEzsignfolderClose")
  private String dtEzsignfolderClose = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;

  /**
   * The unique ID of the Ezsignfoldertype.    This value can be queried by the API and is also visible in the admin interface.    There are two types of Ezsignfoldertype. **User** and **Shared**. **User** can only be seen by the user who created the folder or its assistants. Access to **Shared** folders are configurable for access and email delivery. You should typically choose a **Shared** type here.
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldertype.    This value can be queried by the API and is also visible in the admin interface.    There are two types of Ezsignfoldertype. **User** and **Shared**. **User** can only be seen by the user who created the folder or its assistants. Access to **Shared** folders are configurable for access and email delivery. You should typically choose a **Shared** type here.")
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }
  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
  }

  /**
   * The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
   * minimum: 1
   * maximum: 3
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|")
  public Integer getFkiEzsigntsarequirementID() {
    return fkiEzsigntsarequirementID;
  }
  public void setFkiEzsigntsarequirementID(Integer fkiEzsigntsarequirementID) {
    this.fkiEzsigntsarequirementID = fkiEzsigntsarequirementID;
  }

  /**
   * The description of the Ezsign Folder
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsign Folder")
  public String getSEzsignfolderDescription() {
    return sEzsignfolderDescription;
  }
  public void setSEzsignfolderDescription(String sEzsignfolderDescription) {
    this.sEzsignfolderDescription = sEzsignfolderDescription;
  }

  /**
   * Somes extra notes about the eZsign Folder
   **/
  @ApiModelProperty(required = true, value = "Somes extra notes about the eZsign Folder")
  public String getTEzsignfolderNote() {
    return tEzsignfolderNote;
  }
  public void setTEzsignfolderNote(String tEzsignfolderNote) {
    this.tEzsignfolderNote = tEzsignfolderNote;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignfolderSendreminderfrequency getEEzsignfolderSendreminderfrequency() {
    return eEzsignfolderSendreminderfrequency;
  }
  public void setEEzsignfolderSendreminderfrequency(FieldEEzsignfolderSendreminderfrequency eEzsignfolderSendreminderfrequency) {
    this.eEzsignfolderSendreminderfrequency = eEzsignfolderSendreminderfrequency;
  }

  /**
   * The unique ID of the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getPkiEzsignfolderID() {
    return pkiEzsignfolderID;
  }
  public void setPkiEzsignfolderID(Integer pkiEzsignfolderID) {
    this.pkiEzsignfolderID = pkiEzsignfolderID;
  }

  /**
   * The date and time at which the Ezsign folder was sent the last time.
   **/
  @ApiModelProperty(required = true, value = "The date and time at which the Ezsign folder was sent the last time.")
  public String getDtEzsignfolderSentdate() {
    return dtEzsignfolderSentdate;
  }
  public void setDtEzsignfolderSentdate(String dtEzsignfolderSentdate) {
    this.dtEzsignfolderSentdate = dtEzsignfolderSentdate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignfolderStep getEEzsignfolderStep() {
    return eEzsignfolderStep;
  }
  public void setEEzsignfolderStep(FieldEEzsignfolderStep eEzsignfolderStep) {
    this.eEzsignfolderStep = eEzsignfolderStep;
  }

  /**
   * The date and time at which the folder was closed. Either by applying the last signature or by completing it prematurely.
   **/
  @ApiModelProperty(required = true, value = "The date and time at which the folder was closed. Either by applying the last signature or by completing it prematurely.")
  public String getDtEzsignfolderClose() {
    return dtEzsignfolderClose;
  }
  public void setDtEzsignfolderClose(String dtEzsignfolderClose) {
    this.dtEzsignfolderClose = dtEzsignfolderClose;
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
    EzsignfolderResponseCompound ezsignfolderResponseCompound = (EzsignfolderResponseCompound) o;
    return (this.fkiEzsignfoldertypeID == null ? ezsignfolderResponseCompound.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsignfolderResponseCompound.fkiEzsignfoldertypeID)) &&
        (this.fkiEzsigntsarequirementID == null ? ezsignfolderResponseCompound.fkiEzsigntsarequirementID == null : this.fkiEzsigntsarequirementID.equals(ezsignfolderResponseCompound.fkiEzsigntsarequirementID)) &&
        (this.sEzsignfolderDescription == null ? ezsignfolderResponseCompound.sEzsignfolderDescription == null : this.sEzsignfolderDescription.equals(ezsignfolderResponseCompound.sEzsignfolderDescription)) &&
        (this.tEzsignfolderNote == null ? ezsignfolderResponseCompound.tEzsignfolderNote == null : this.tEzsignfolderNote.equals(ezsignfolderResponseCompound.tEzsignfolderNote)) &&
        (this.eEzsignfolderSendreminderfrequency == null ? ezsignfolderResponseCompound.eEzsignfolderSendreminderfrequency == null : this.eEzsignfolderSendreminderfrequency.equals(ezsignfolderResponseCompound.eEzsignfolderSendreminderfrequency)) &&
        (this.pkiEzsignfolderID == null ? ezsignfolderResponseCompound.pkiEzsignfolderID == null : this.pkiEzsignfolderID.equals(ezsignfolderResponseCompound.pkiEzsignfolderID)) &&
        (this.dtEzsignfolderSentdate == null ? ezsignfolderResponseCompound.dtEzsignfolderSentdate == null : this.dtEzsignfolderSentdate.equals(ezsignfolderResponseCompound.dtEzsignfolderSentdate)) &&
        (this.eEzsignfolderStep == null ? ezsignfolderResponseCompound.eEzsignfolderStep == null : this.eEzsignfolderStep.equals(ezsignfolderResponseCompound.eEzsignfolderStep)) &&
        (this.dtEzsignfolderClose == null ? ezsignfolderResponseCompound.dtEzsignfolderClose == null : this.dtEzsignfolderClose.equals(ezsignfolderResponseCompound.dtEzsignfolderClose)) &&
        (this.objAudit == null ? ezsignfolderResponseCompound.objAudit == null : this.objAudit.equals(ezsignfolderResponseCompound.objAudit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiEzsigntsarequirementID == null ? 0: this.fkiEzsigntsarequirementID.hashCode());
    result = 31 * result + (this.sEzsignfolderDescription == null ? 0: this.sEzsignfolderDescription.hashCode());
    result = 31 * result + (this.tEzsignfolderNote == null ? 0: this.tEzsignfolderNote.hashCode());
    result = 31 * result + (this.eEzsignfolderSendreminderfrequency == null ? 0: this.eEzsignfolderSendreminderfrequency.hashCode());
    result = 31 * result + (this.pkiEzsignfolderID == null ? 0: this.pkiEzsignfolderID.hashCode());
    result = 31 * result + (this.dtEzsignfolderSentdate == null ? 0: this.dtEzsignfolderSentdate.hashCode());
    result = 31 * result + (this.eEzsignfolderStep == null ? 0: this.eEzsignfolderStep.hashCode());
    result = 31 * result + (this.dtEzsignfolderClose == null ? 0: this.dtEzsignfolderClose.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderResponseCompound {\n");
    
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiEzsigntsarequirementID: ").append(fkiEzsigntsarequirementID).append("\n");
    sb.append("  sEzsignfolderDescription: ").append(sEzsignfolderDescription).append("\n");
    sb.append("  tEzsignfolderNote: ").append(tEzsignfolderNote).append("\n");
    sb.append("  eEzsignfolderSendreminderfrequency: ").append(eEzsignfolderSendreminderfrequency).append("\n");
    sb.append("  pkiEzsignfolderID: ").append(pkiEzsignfolderID).append("\n");
    sb.append("  dtEzsignfolderSentdate: ").append(dtEzsignfolderSentdate).append("\n");
    sb.append("  eEzsignfolderStep: ").append(eEzsignfolderStep).append("\n");
    sb.append("  dtEzsignfolderClose: ").append(dtEzsignfolderClose).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
