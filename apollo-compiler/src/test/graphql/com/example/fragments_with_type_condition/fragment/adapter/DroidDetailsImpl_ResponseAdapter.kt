// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragments_with_type_condition.fragment.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.fragments_with_type_condition.fragment.DroidDetailsImpl
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object DroidDetailsImpl_ResponseAdapter : ResponseAdapter<DroidDetailsImpl.Data> {
  val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField(
      type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
          ResponseField.Kind.OTHER)),
      responseName = "__typename",
      fieldName = "__typename",
      arguments = emptyMap(),
      conditions = emptyList(),
      fields = emptyArray(),
    ),
    ResponseField(
      type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
          ResponseField.Kind.OTHER)),
      responseName = "name",
      fieldName = "name",
      arguments = emptyMap(),
      conditions = emptyList(),
      fields = emptyArray(),
    ),
    ResponseField(
      type = ResponseField.Type.Named("String", ResponseField.Kind.OTHER),
      responseName = "primaryFunction",
      fieldName = "primaryFunction",
      arguments = emptyMap(),
      conditions = emptyList(),
      fields = emptyArray(),
    )
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): DroidDetailsImpl.Data {
    return reader.run {
      var __typename: String? = __typename
      var name: String? = null
      var primaryFunction: String? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> __typename = readString(RESPONSE_FIELDS[0])
          1 -> name = readString(RESPONSE_FIELDS[1])
          2 -> primaryFunction = readString(RESPONSE_FIELDS[2])
          else -> break
        }
      }
      DroidDetailsImpl.Data(
        __typename = __typename!!,
        name = name!!,
        primaryFunction = primaryFunction
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: DroidDetailsImpl.Data) {
    writer.writeString(RESPONSE_FIELDS[0], value.__typename)
    writer.writeString(RESPONSE_FIELDS[1], value.name)
    writer.writeString(RESPONSE_FIELDS[2], value.primaryFunction)
  }
}
