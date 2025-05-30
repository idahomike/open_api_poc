/*
 * APIFiddle Sample Definition
 * Example workspace
 *
 * The version of the OpenAPI document: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * A simplified representation of a Fish, typically used in list views.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-06T21:58:54.065274387Z[Etc/UTC]", comments = "Generator version: 7.14.0-SNAPSHOT")
public class FishSummary {
  public static final String SERIALIZED_NAME_COMMON_NAME = "commonName";
  @SerializedName(SERIALIZED_NAME_COMMON_NAME)
  @javax.annotation.Nonnull
  private String commonName;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  @javax.annotation.Nonnull
  private String locationId;

  public FishSummary() {
  }

  public FishSummary commonName(@javax.annotation.Nonnull String commonName) {
    this.commonName = commonName;
    return this;
  }

  /**
   * Get commonName
   * @return commonName
   */
  @javax.annotation.Nonnull
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(@javax.annotation.Nonnull String commonName) {
    this.commonName = commonName;
  }


  public FishSummary locationId(@javax.annotation.Nonnull String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
   */
  @javax.annotation.Nonnull
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(@javax.annotation.Nonnull String locationId) {
    this.locationId = locationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FishSummary fishSummary = (FishSummary) o;
    return Objects.equals(this.commonName, fishSummary.commonName) &&
        Objects.equals(this.locationId, fishSummary.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonName, locationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FishSummary {\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("commonName");
    openapiFields.add("locationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("commonName");
    openapiRequiredFields.add("locationId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FishSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FishSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FishSummary is not found in the empty JSON string", FishSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FishSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FishSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FishSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("commonName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commonName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commonName").toString()));
      }
      if (!jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FishSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FishSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FishSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FishSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<FishSummary>() {
           @Override
           public void write(JsonWriter out, FishSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FishSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FishSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FishSummary
   * @throws IOException if the JSON string is invalid with respect to FishSummary
   */
  public static FishSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FishSummary.class);
  }

  /**
   * Convert an instance of FishSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

