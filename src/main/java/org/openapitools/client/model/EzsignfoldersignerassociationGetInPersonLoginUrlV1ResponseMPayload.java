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
 * Payload for the /1/object/ezsignfoldersignerassociation/getInPersonLoginUrl API Request
 **/
@ApiModel(description = "Payload for the /1/object/ezsignfoldersignerassociation/getInPersonLoginUrl API Request")
public class EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload {
  
  @SerializedName("sLoginUrl")
  private String sLoginUrl = null;

  /**
   * The Url to login to the signing application.    Url will expire after 30 minutes.  
   **/
  @ApiModelProperty(required = true, value = "The Url to login to the signing application.    Url will expire after 30 minutes.  ")
  public String getSLoginUrl() {
    return sLoginUrl;
  }
  public void setSLoginUrl(String sLoginUrl) {
    this.sLoginUrl = sLoginUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload ezsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload = (EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload) o;
    return (this.sLoginUrl == null ? ezsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload.sLoginUrl == null : this.sLoginUrl.equals(ezsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload.sLoginUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sLoginUrl == null ? 0: this.sLoginUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload {\n");
    
    sb.append("  sLoginUrl: ").append(sLoginUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
