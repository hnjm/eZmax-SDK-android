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

import org.openapitools.client.model.ApikeyRequest;
import org.openapitools.client.model.ApikeyRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /1/object/apikey/createObject API Request
 **/
@ApiModel(description = "Request for the /1/object/apikey/createObject API Request")
public class ApikeyCreateObjectV1Request {
  
  @SerializedName("objApikey")
  private ApikeyRequest objApikey = null;
  @SerializedName("objApikeyCompound")
  private ApikeyRequestCompound objApikeyCompound = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ApikeyRequest getObjApikey() {
    return objApikey;
  }
  public void setObjApikey(ApikeyRequest objApikey) {
    this.objApikey = objApikey;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ApikeyRequestCompound getObjApikeyCompound() {
    return objApikeyCompound;
  }
  public void setObjApikeyCompound(ApikeyRequestCompound objApikeyCompound) {
    this.objApikeyCompound = objApikeyCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyCreateObjectV1Request apikeyCreateObjectV1Request = (ApikeyCreateObjectV1Request) o;
    return (this.objApikey == null ? apikeyCreateObjectV1Request.objApikey == null : this.objApikey.equals(apikeyCreateObjectV1Request.objApikey)) &&
        (this.objApikeyCompound == null ? apikeyCreateObjectV1Request.objApikeyCompound == null : this.objApikeyCompound.equals(apikeyCreateObjectV1Request.objApikeyCompound));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objApikey == null ? 0: this.objApikey.hashCode());
    result = 31 * result + (this.objApikeyCompound == null ? 0: this.objApikeyCompound.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyCreateObjectV1Request {\n");
    
    sb.append("  objApikey: ").append(objApikey).append("\n");
    sb.append("  objApikeyCompound: ").append(objApikeyCompound).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
