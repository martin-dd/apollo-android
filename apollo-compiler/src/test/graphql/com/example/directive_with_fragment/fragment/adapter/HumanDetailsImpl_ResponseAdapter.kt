// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.directive_with_fragment.fragment.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.directive_with_fragment.fragment.HumanDetailsImpl
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object HumanDetailsImpl_ResponseAdapter : ResponseAdapter<HumanDetailsImpl.Data> {
  val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField(
      type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
          ResponseField.Kind.OTHER)),
      responseName = "__typename",
      fieldName = "__typename",
      arguments = emptyMap(),
      conditions = emptyList(),
      possibleFieldSets = emptyMap(),
    ),
    ResponseField(
      type = ResponseField.Type.Named("String", ResponseField.Kind.OTHER),
      responseName = "homePlanet",
      fieldName = "homePlanet",
      arguments = emptyMap(),
      conditions = emptyList(),
      possibleFieldSets = emptyMap(),
    )
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): HumanDetailsImpl.Data {
    return reader.run {
      var __typename: String? = __typename
      var homePlanet: String? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> __typename = readString(RESPONSE_FIELDS[0])
          1 -> homePlanet = readString(RESPONSE_FIELDS[1])
          else -> break
        }
      }
      HumanDetailsImpl.Data(
        __typename = __typename!!,
        homePlanet = homePlanet
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: HumanDetailsImpl.Data) {
    writer.writeString(RESPONSE_FIELDS[0], value.__typename)
    writer.writeString(RESPONSE_FIELDS[1], value.homePlanet)
  }
}
