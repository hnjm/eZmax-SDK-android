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
 * Response for the /1/customer/{pksCustomerCode}/endpoint API Request
 **/
@ApiModel(description = "Response for the /1/customer/{pksCustomerCode}/endpoint API Request")
public class GlobalCustomerGetEndpointV1Response {
  
  @SerializedName("sEndpointURL")
  private String sEndpointURL = null;

  /**
   * The endpoint's URL
   **/
  @ApiModelProperty(required = true, value = "The endpoint's URL")
  public String getSEndpointURL() {
    return sEndpointURL;
  }
  public void setSEndpointURL(String sEndpointURL) {
    this.sEndpointURL = sEndpointURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalCustomerGetEndpointV1Response globalCustomerGetEndpointV1Response = (GlobalCustomerGetEndpointV1Response) o;
    return (this.sEndpointURL == null ? globalCustomerGetEndpointV1Response.sEndpointURL == null : this.sEndpointURL.equals(globalCustomerGetEndpointV1Response.sEndpointURL));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEndpointURL == null ? 0: this.sEndpointURL.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalCustomerGetEndpointV1Response {\n");
    
    sb.append("  sEndpointURL: ").append(sEndpointURL).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
