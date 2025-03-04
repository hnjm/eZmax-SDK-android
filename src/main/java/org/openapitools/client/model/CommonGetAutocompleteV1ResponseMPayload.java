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
 * Generic Autocomplete Response
 **/
@ApiModel(description = "Generic Autocomplete Response")
public class CommonGetAutocompleteV1ResponseMPayload {
  
  @SerializedName("group")
  private String group = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("option")
  private String option = null;

  /**
   * The Category (ie group) for the dropdown or an empty string if not categorized
   **/
  @ApiModelProperty(required = true, value = "The Category (ie group) for the dropdown or an empty string if not categorized")
  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
  }

  /**
   * The Unique ID of the element
   **/
  @ApiModelProperty(required = true, value = "The Unique ID of the element")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The Description of the element
   **/
  @ApiModelProperty(required = true, value = "The Description of the element")
  public String getOption() {
    return option;
  }
  public void setOption(String option) {
    this.option = option;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonGetAutocompleteV1ResponseMPayload commonGetAutocompleteV1ResponseMPayload = (CommonGetAutocompleteV1ResponseMPayload) o;
    return (this.group == null ? commonGetAutocompleteV1ResponseMPayload.group == null : this.group.equals(commonGetAutocompleteV1ResponseMPayload.group)) &&
        (this.id == null ? commonGetAutocompleteV1ResponseMPayload.id == null : this.id.equals(commonGetAutocompleteV1ResponseMPayload.id)) &&
        (this.option == null ? commonGetAutocompleteV1ResponseMPayload.option == null : this.option.equals(commonGetAutocompleteV1ResponseMPayload.option));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.group == null ? 0: this.group.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.option == null ? 0: this.option.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonGetAutocompleteV1ResponseMPayload {\n");
    
    sb.append("  group: ").append(group).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  option: ").append(option).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
