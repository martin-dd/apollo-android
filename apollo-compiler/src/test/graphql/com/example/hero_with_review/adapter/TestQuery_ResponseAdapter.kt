// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.hero_with_review.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.hero_with_review.TestQuery
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object TestQuery_ResponseAdapter : ResponseAdapter<TestQuery.Data> {
  val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField(
      type = ResponseField.Type.Named("Review", ResponseField.Kind.OBJECT),
      responseName = "createReview",
      fieldName = "createReview",
      arguments = mapOf<String, Any?>(
        "episode" to mapOf<String, Any?>(
          "kind" to "Variable",
          "variableName" to "ep"),
        "review" to mapOf<String, Any?>(
          "stars" to 5,
          "listOfEnums" to listOf<Any?>(
            "JEDI",
            "EMPIRE",
            "NEWHOPE"),
          "listOfStringNonOptional" to listOf<Any?>(
            "1",
            "2",
            "3"),
          "favoriteColor" to mapOf<String, Any?>(
            "red" to 1,
            "blue" to 1.0))),
      conditions = emptyList(),
      possibleFieldSets = mapOf(
        "" to CreateReview.RESPONSE_FIELDS
      ),
    )
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var createReview: TestQuery.Data.CreateReview? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> createReview = readObject<TestQuery.Data.CreateReview>(RESPONSE_FIELDS[0]) { reader ->
            CreateReview.fromResponse(reader)
          }
          else -> break
        }
      }
      TestQuery.Data(
        createReview = createReview
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: TestQuery.Data) {
    if(value.createReview == null) {
      writer.writeObject(RESPONSE_FIELDS[0], null)
    } else {
      writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
        CreateReview.toResponse(writer, value.createReview)
      }
    }
  }

  object CreateReview : ResponseAdapter<TestQuery.Data.CreateReview> {
    val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named("Int",
            ResponseField.Kind.OTHER)),
        responseName = "stars",
        fieldName = "stars",
        arguments = emptyMap(),
        conditions = emptyList(),
        possibleFieldSets = emptyMap(),
      ),
      ResponseField(
        type = ResponseField.Type.Named("String", ResponseField.Kind.OTHER),
        responseName = "commentary",
        fieldName = "commentary",
        arguments = emptyMap(),
        conditions = emptyList(),
        possibleFieldSets = emptyMap(),
      )
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.Data.CreateReview {
      return reader.run {
        var stars: Int? = null
        var commentary: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> stars = readInt(RESPONSE_FIELDS[0])
            1 -> commentary = readString(RESPONSE_FIELDS[1])
            else -> break
          }
        }
        TestQuery.Data.CreateReview(
          stars = stars!!,
          commentary = commentary
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.CreateReview) {
      writer.writeInt(RESPONSE_FIELDS[0], value.stars)
      writer.writeString(RESPONSE_FIELDS[1], value.commentary)
    }
  }
}
