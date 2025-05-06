# FishApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFish**](FishApi.md#createFish) | **POST** /fishes | Create fish |
| [**deleteFish**](FishApi.md#deleteFish) | **DELETE** /fish/{fish_id} | delete fish |
| [**getFish**](FishApi.md#getFish) | **GET** /fishes/{fish_id} | Get Fish |
| [**getFishList**](FishApi.md#getFishList) | **GET** /fish | Get fish list |


<a id="createFish"></a>
# **createFish**
> Fish createFish(fish)

Create fish

Create a fish

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FishApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FishApi apiInstance = new FishApi(defaultClient);
    Fish fish = new Fish(); // Fish | 
    try {
      Fish result = apiInstance.createFish(fish);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FishApi#createFish");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fish** | [**Fish**](Fish.md)|  | |

### Return type

[**Fish**](Fish.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful, and a new resource was created. |  -  |
| **400** | The server could not understand the request due to invalid syntax. The client should modify the request and try again. |  -  |

<a id="deleteFish"></a>
# **deleteFish**
> Object deleteFish(fishId)

delete fish

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FishApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FishApi apiInstance = new FishApi(defaultClient);
    Integer fishId = 56; // Integer | 
    try {
      Object result = apiInstance.deleteFish(fishId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FishApi#deleteFish");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fishId** | **Integer**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The request was successful, but there is no content to return in the response. |  -  |
| **400** | The server could not understand the request due to invalid syntax. The client should modify the request and try again. |  -  |
| **404** | The server cannot find the requested resource. The endpoint may be invalid or the resource may no longer exist. |  -  |
| **409** | The request could not be completed due to a conflict with the current state of the resource. Resolve the conflict and try again. |  -  |
| **500** | The server encountered an unexpected condition that prevented it from fulfilling the request. Report the issue to the support team if it persists. |  -  |

<a id="getFish"></a>
# **getFish**
> Fish getFish(fishId)

Get Fish

Get fish based on id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FishApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FishApi apiInstance = new FishApi(defaultClient);
    Integer fishId = 56; // Integer | 
    try {
      Fish result = apiInstance.getFish(fishId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FishApi#getFish");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fishId** | **Integer**|  | |

### Return type

[**Fish**](Fish.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful, and the server has returned the requested resource in the response body. |  -  |
| **400** | The server could not understand the request due to invalid syntax. The client should modify the request and try again. |  -  |
| **404** | The server cannot find the requested resource. The endpoint may be invalid or the resource may no longer exist. |  -  |
| **500** | The server encountered an unexpected condition that prevented it from fulfilling the request. Report the issue to the support team if it persists. |  -  |

<a id="getFishList"></a>
# **getFishList**
> List&lt;FishSummary&gt; getFishList(locationId, fishName)

Get fish list

Fetches a comprehensive list of all fish. Each fish object includes details like fish name and location.  This endpoint is paginated using the &#39;page&#39; syntax.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FishApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FishApi apiInstance = new FishApi(defaultClient);
    String locationId = "locationId_example"; // String | Location identifier
    String fishName = "fishName_example"; // String | Name of fish type
    try {
      List<FishSummary> result = apiInstance.getFishList(locationId, fishName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FishApi#getFishList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **locationId** | **String**| Location identifier | [optional] |
| **fishName** | **String**| Name of fish type | [optional] |

### Return type

[**List&lt;FishSummary&gt;**](FishSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful, and the server has returned the requested resource in the response body. |  -  |
| **400** | The server could not understand the request due to invalid syntax. The client should modify the request and try again. |  -  |
| **404** | The server cannot find the requested resource. The endpoint may be invalid or the resource may no longer exist. |  -  |
| **500** | The server encountered an unexpected condition that prevented it from fulfilling the request. Report the issue to the support team if it persists. |  -  |

