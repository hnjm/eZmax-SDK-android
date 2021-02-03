/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.27
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for the /1/object/ezsignfolder/createObject API Request
 **/
@ApiModel(description = "Payload for the /1/object/ezsignfolder/createObject API Request")
public class EzsignfolderCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsignfolderID")
  private List<Integer> aPkiEzsignfolderID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsignfolderID() {
    return aPkiEzsignfolderID;
  }
  public void setAPkiEzsignfolderID(List<Integer> aPkiEzsignfolderID) {
    this.aPkiEzsignfolderID = aPkiEzsignfolderID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderCreateObjectV1ResponseMPayload ezsignfolderCreateObjectV1ResponseMPayload = (EzsignfolderCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsignfolderID == null ? ezsignfolderCreateObjectV1ResponseMPayload.aPkiEzsignfolderID == null : this.aPkiEzsignfolderID.equals(ezsignfolderCreateObjectV1ResponseMPayload.aPkiEzsignfolderID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignfolderID == null ? 0: this.aPkiEzsignfolderID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignfolderID: ").append(aPkiEzsignfolderID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
