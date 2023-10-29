# swagger_client.CloudsApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_cloud**](CloudsApi.md#create_cloud) | **POST** /clouds | Создание заказа на облако
[**delete_cloud_by_id**](CloudsApi.md#delete_cloud_by_id) | **DELETE** /clouds/{cloud_id} | Метод удаления заказа на облако по ID
[**get_all_clouds**](CloudsApi.md#get_all_clouds) | **GET** /clouds | Метод получения списка ресурсов на облако
[**get_cloud_by_id**](CloudsApi.md#get_cloud_by_id) | **GET** /clouds/{cloud_id} | Метод получения заказа на облако по ID

# **create_cloud**
> Clouds create_cloud(body=body)

Создание заказа на облако

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()
body = swagger_client.Error() # Error |  (optional)

try:
    # Создание заказа на облако
    api_response = api_instance.create_cloud(body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CloudsApi->create_cloud: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Error**](Error.md)|  | [optional] 

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: adplication/json
 - **Accept**: adplication/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_cloud_by_id**
> delete_cloud_by_id(cloud_id)

Метод удаления заказа на облако по ID

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()
cloud_id = 'cloud_id_example' # str | Идентификатор заказа облака

try:
    # Метод удаления заказа на облако по ID
    api_instance.delete_cloud_by_id(cloud_id)
except ApiException as e:
    print("Exception when calling CloudsApi->delete_cloud_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud_id** | **str**| Идентификатор заказа облака | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_clouds**
> Clouds get_all_clouds()

Метод получения списка ресурсов на облако

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()

try:
    # Метод получения списка ресурсов на облако
    api_response = api_instance.get_all_clouds()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CloudsApi->get_all_clouds: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cloud_by_id**
> Cloud get_cloud_by_id(cloud_id)

Метод получения заказа на облако по ID

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()
cloud_id = 'cloud_id_example' # str | Идентификатор заказа облака

try:
    # Метод получения заказа на облако по ID
    api_response = api_instance.get_cloud_by_id(cloud_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CloudsApi->get_cloud_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud_id** | **str**| Идентификатор заказа облака | 

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

