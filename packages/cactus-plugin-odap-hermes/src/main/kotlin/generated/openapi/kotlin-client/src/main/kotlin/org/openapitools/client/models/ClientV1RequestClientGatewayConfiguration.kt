/**
 * Hyperledger Cactus Plugin - Odap Hermes
 *
 * Implementation for Odap and Hermes
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param apiHost 
 */

data class ClientV1RequestClientGatewayConfiguration (

    @Json(name = "apiHost")
    val apiHost: kotlin.String

)

