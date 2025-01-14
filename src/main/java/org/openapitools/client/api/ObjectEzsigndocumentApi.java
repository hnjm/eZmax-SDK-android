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

package org.openapitools.client.api;

import eZmaxAPI.ApiInvoker;
import eZmaxAPI.ApiException;
import eZmaxAPI.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.CommonResponseError;
import org.openapitools.client.model.EzsigndocumentApplyEzsigntemplateV1Request;
import org.openapitools.client.model.EzsigndocumentApplyEzsigntemplateV1Response;
import org.openapitools.client.model.EzsigndocumentCreateObjectV1Request;
import org.openapitools.client.model.EzsigndocumentCreateObjectV1Response;
import org.openapitools.client.model.EzsigndocumentDeleteObjectV1Response;
import org.openapitools.client.model.EzsigndocumentGetDownloadUrlV1Response;
import org.openapitools.client.model.EzsigndocumentGetObjectV1Response;
import java.util.*;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsigndocumentApi {
  String basePath = "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Apply an Ezsign Template to the Ezsigndocument.
  * This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.
   * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
   * @param ezsigndocumentApplyEzsigntemplateV1Request 
   * @return EzsigndocumentApplyEzsigntemplateV1Response
  */
  public EzsigndocumentApplyEzsigntemplateV1Response ezsigndocumentApplyEzsigntemplateV1 (Integer pkiEzsigndocumentID, EzsigndocumentApplyEzsigntemplateV1Request ezsigndocumentApplyEzsigntemplateV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsigndocumentApplyEzsigntemplateV1Request;
    // verify the required parameter 'pkiEzsigndocumentID' is set
    if (pkiEzsigndocumentID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentApplyEzsigntemplateV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentApplyEzsigntemplateV1"));
    }
    // verify the required parameter 'ezsigndocumentApplyEzsigntemplateV1Request' is set
    if (ezsigndocumentApplyEzsigntemplateV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigndocumentApplyEzsigntemplateV1Request' when calling ezsigndocumentApplyEzsigntemplateV1",
        new ApiException(400, "Missing the required parameter 'ezsigndocumentApplyEzsigntemplateV1Request' when calling ezsigndocumentApplyEzsigntemplateV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate".replaceAll("\\{" + "pkiEzsigndocumentID" + "\\}", apiInvoker.escapeString(pkiEzsigndocumentID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (EzsigndocumentApplyEzsigntemplateV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigndocumentApplyEzsigntemplateV1Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Apply an Ezsign Template to the Ezsigndocument.
   * This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.
   * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument   * @param ezsigndocumentApplyEzsigntemplateV1Request 
  */
  public void ezsigndocumentApplyEzsigntemplateV1 (Integer pkiEzsigndocumentID, EzsigndocumentApplyEzsigntemplateV1Request ezsigndocumentApplyEzsigntemplateV1Request, final Response.Listener<EzsigndocumentApplyEzsigntemplateV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsigndocumentApplyEzsigntemplateV1Request;

    // verify the required parameter 'pkiEzsigndocumentID' is set
    if (pkiEzsigndocumentID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentApplyEzsigntemplateV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentApplyEzsigntemplateV1"));
    }
    // verify the required parameter 'ezsigndocumentApplyEzsigntemplateV1Request' is set
    if (ezsigndocumentApplyEzsigntemplateV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigndocumentApplyEzsigntemplateV1Request' when calling ezsigndocumentApplyEzsigntemplateV1",
        new ApiException(400, "Missing the required parameter 'ezsigndocumentApplyEzsigntemplateV1Request' when calling ezsigndocumentApplyEzsigntemplateV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigndocumentID" + "\\}", apiInvoker.escapeString(pkiEzsigndocumentID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((EzsigndocumentApplyEzsigntemplateV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigndocumentApplyEzsigntemplateV1Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Create a new Ezsigndocument
  * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
   * @param ezsigndocumentCreateObjectV1Request 
   * @return EzsigndocumentCreateObjectV1Response
  */
  public EzsigndocumentCreateObjectV1Response ezsigndocumentCreateObjectV1 (List<EzsigndocumentCreateObjectV1Request> ezsigndocumentCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsigndocumentCreateObjectV1Request;
    // verify the required parameter 'ezsigndocumentCreateObjectV1Request' is set
    if (ezsigndocumentCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigndocumentCreateObjectV1Request' when calling ezsigndocumentCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigndocumentCreateObjectV1Request' when calling ezsigndocumentCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (EzsigndocumentCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigndocumentCreateObjectV1Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Create a new Ezsigndocument
   * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
   * @param ezsigndocumentCreateObjectV1Request 
  */
  public void ezsigndocumentCreateObjectV1 (List<EzsigndocumentCreateObjectV1Request> ezsigndocumentCreateObjectV1Request, final Response.Listener<EzsigndocumentCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsigndocumentCreateObjectV1Request;

    // verify the required parameter 'ezsigndocumentCreateObjectV1Request' is set
    if (ezsigndocumentCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigndocumentCreateObjectV1Request' when calling ezsigndocumentCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigndocumentCreateObjectV1Request' when calling ezsigndocumentCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((EzsigndocumentCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigndocumentCreateObjectV1Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Delete an existing Ezsigndocument
  * 
   * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
   * @return EzsigndocumentDeleteObjectV1Response
  */
  public EzsigndocumentDeleteObjectV1Response ezsigndocumentDeleteObjectV1 (Integer pkiEzsigndocumentID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigndocumentID' is set
    if (pkiEzsigndocumentID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}".replaceAll("\\{" + "pkiEzsigndocumentID" + "\\}", apiInvoker.escapeString(pkiEzsigndocumentID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (EzsigndocumentDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigndocumentDeleteObjectV1Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Delete an existing Ezsigndocument
   * 
   * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
  */
  public void ezsigndocumentDeleteObjectV1 (Integer pkiEzsigndocumentID, final Response.Listener<EzsigndocumentDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigndocumentID' is set
    if (pkiEzsigndocumentID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigndocumentID" + "\\}", apiInvoker.escapeString(pkiEzsigndocumentID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((EzsigndocumentDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigndocumentDeleteObjectV1Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Retrieve an existing Ezsigndocument&#39;s children IDs
  * 
   * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
   * @return void
  */
  public void ezsigndocumentGetChildrenV1 (Integer pkiEzsigndocumentID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigndocumentID' is set
    if (pkiEzsigndocumentID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetChildrenV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetChildrenV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}/getChildren".replaceAll("\\{" + "pkiEzsigndocumentID" + "\\}", apiInvoker.escapeString(pkiEzsigndocumentID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Retrieve an existing Ezsigndocument&#39;s children IDs
   * 
   * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
  */
  public void ezsigndocumentGetChildrenV1 (Integer pkiEzsigndocumentID, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigndocumentID' is set
    if (pkiEzsigndocumentID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetChildrenV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetChildrenV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}/getChildren".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigndocumentID" + "\\}", apiInvoker.escapeString(pkiEzsigndocumentID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Retrieve a URL to download documents.
  * This endpoint returns URLs to different files that can be downloaded during the signing process.  These links will expire after 5 minutes so the download of the file should be made soon after retrieving the link.
   * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
   * @param eDocumentType The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **Signed** Is the final document once all signatures were applied. 3. **Proofdocument** Is the evidence report. 4. **Proof** Is the complete evidence archive including all of the above and more. 
   * @return EzsigndocumentGetDownloadUrlV1Response
  */
  public EzsigndocumentGetDownloadUrlV1Response ezsigndocumentGetDownloadUrlV1 (Integer pkiEzsigndocumentID, String eDocumentType) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigndocumentID' is set
    if (pkiEzsigndocumentID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetDownloadUrlV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetDownloadUrlV1"));
    }
    // verify the required parameter 'eDocumentType' is set
    if (eDocumentType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'eDocumentType' when calling ezsigndocumentGetDownloadUrlV1",
        new ApiException(400, "Missing the required parameter 'eDocumentType' when calling ezsigndocumentGetDownloadUrlV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType}".replaceAll("\\{" + "pkiEzsigndocumentID" + "\\}", apiInvoker.escapeString(pkiEzsigndocumentID.toString())).replaceAll("\\{" + "eDocumentType" + "\\}", apiInvoker.escapeString(eDocumentType.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (EzsigndocumentGetDownloadUrlV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigndocumentGetDownloadUrlV1Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Retrieve a URL to download documents.
   * This endpoint returns URLs to different files that can be downloaded during the signing process.  These links will expire after 5 minutes so the download of the file should be made soon after retrieving the link.
   * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument   * @param eDocumentType The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **Signed** Is the final document once all signatures were applied. 3. **Proofdocument** Is the evidence report. 4. **Proof** Is the complete evidence archive including all of the above and more. 
  */
  public void ezsigndocumentGetDownloadUrlV1 (Integer pkiEzsigndocumentID, String eDocumentType, final Response.Listener<EzsigndocumentGetDownloadUrlV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigndocumentID' is set
    if (pkiEzsigndocumentID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetDownloadUrlV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetDownloadUrlV1"));
    }
    // verify the required parameter 'eDocumentType' is set
    if (eDocumentType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'eDocumentType' when calling ezsigndocumentGetDownloadUrlV1",
        new ApiException(400, "Missing the required parameter 'eDocumentType' when calling ezsigndocumentGetDownloadUrlV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigndocumentID" + "\\}", apiInvoker.escapeString(pkiEzsigndocumentID.toString())).replaceAll("\\{" + "eDocumentType" + "\\}", apiInvoker.escapeString(eDocumentType.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((EzsigndocumentGetDownloadUrlV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigndocumentGetDownloadUrlV1Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Retrieve an existing Ezsigndocument
  * 
   * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
   * @return EzsigndocumentGetObjectV1Response
  */
  public EzsigndocumentGetObjectV1Response ezsigndocumentGetObjectV1 (Integer pkiEzsigndocumentID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigndocumentID' is set
    if (pkiEzsigndocumentID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}".replaceAll("\\{" + "pkiEzsigndocumentID" + "\\}", apiInvoker.escapeString(pkiEzsigndocumentID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (EzsigndocumentGetObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigndocumentGetObjectV1Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Retrieve an existing Ezsigndocument
   * 
   * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
  */
  public void ezsigndocumentGetObjectV1 (Integer pkiEzsigndocumentID, final Response.Listener<EzsigndocumentGetObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigndocumentID' is set
    if (pkiEzsigndocumentID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigndocumentID' when calling ezsigndocumentGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigndocumentID" + "\\}", apiInvoker.escapeString(pkiEzsigndocumentID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((EzsigndocumentGetObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigndocumentGetObjectV1Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
