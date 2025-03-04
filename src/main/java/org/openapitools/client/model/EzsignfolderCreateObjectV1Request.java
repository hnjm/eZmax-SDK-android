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

import org.openapitools.client.model.EzsignfolderRequest;
import org.openapitools.client.model.EzsignfolderRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /1/object/ezsignfolder/createObject API Request
 **/
@ApiModel(description = "Request for the /1/object/ezsignfolder/createObject API Request")
public class EzsignfolderCreateObjectV1Request {
  
  @SerializedName("objEzsignfolder")
  private EzsignfolderRequest objEzsignfolder = null;
  @SerializedName("objEzsignfolderCompound")
  private EzsignfolderRequestCompound objEzsignfolderCompound = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignfolderRequest getObjEzsignfolder() {
    return objEzsignfolder;
  }
  public void setObjEzsignfolder(EzsignfolderRequest objEzsignfolder) {
    this.objEzsignfolder = objEzsignfolder;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignfolderRequestCompound getObjEzsignfolderCompound() {
    return objEzsignfolderCompound;
  }
  public void setObjEzsignfolderCompound(EzsignfolderRequestCompound objEzsignfolderCompound) {
    this.objEzsignfolderCompound = objEzsignfolderCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderCreateObjectV1Request ezsignfolderCreateObjectV1Request = (EzsignfolderCreateObjectV1Request) o;
    return (this.objEzsignfolder == null ? ezsignfolderCreateObjectV1Request.objEzsignfolder == null : this.objEzsignfolder.equals(ezsignfolderCreateObjectV1Request.objEzsignfolder)) &&
        (this.objEzsignfolderCompound == null ? ezsignfolderCreateObjectV1Request.objEzsignfolderCompound == null : this.objEzsignfolderCompound.equals(ezsignfolderCreateObjectV1Request.objEzsignfolderCompound));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignfolder == null ? 0: this.objEzsignfolder.hashCode());
    result = 31 * result + (this.objEzsignfolderCompound == null ? 0: this.objEzsignfolderCompound.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderCreateObjectV1Request {\n");
    
    sb.append("  objEzsignfolder: ").append(objEzsignfolder).append("\n");
    sb.append("  objEzsignfolderCompound: ").append(objEzsignfolderCompound).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
