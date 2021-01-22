// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.mutation_create_review_semantic_naming.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.mutation_create_review_semantic_naming.CreateReviewForEpisodeMutation
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object CreateReviewForEpisodeMutation_ResponseAdapter :
    ResponseAdapter<CreateReviewForEpisodeMutation.Data> {
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
          "kind" to "Variable",
          "variableName" to "review")),
      conditions = emptyList(),
      fields = CreateReview.RESPONSE_FIELDS,
    )
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?):
      CreateReviewForEpisodeMutation.Data {
    return reader.run {
      var createReview: CreateReviewForEpisodeMutation.Data.CreateReview? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> createReview = readObject<CreateReviewForEpisodeMutation.Data.CreateReview>(RESPONSE_FIELDS[0]) { reader ->
            CreateReview.fromResponse(reader)
          }
          else -> break
        }
      }
      CreateReviewForEpisodeMutation.Data(
        createReview = createReview
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: CreateReviewForEpisodeMutation.Data) {
    if(value.createReview == null) {
      writer.writeObject(RESPONSE_FIELDS[0], null)
    } else {
      writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
        CreateReview.toResponse(writer, value.createReview)
      }
    }
  }

  object CreateReview : ResponseAdapter<CreateReviewForEpisodeMutation.Data.CreateReview> {
    val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named("Int",
            ResponseField.Kind.OTHER)),
        responseName = "stars",
        fieldName = "stars",
        arguments = emptyMap(),
        conditions = emptyList(),
        fields = emptyArray(),
      ),
      ResponseField(
        type = ResponseField.Type.Named("String", ResponseField.Kind.OTHER),
        responseName = "commentary",
        fieldName = "commentary",
        arguments = emptyMap(),
        conditions = emptyList(),
        fields = emptyArray(),
      )
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        CreateReviewForEpisodeMutation.Data.CreateReview {
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
        CreateReviewForEpisodeMutation.Data.CreateReview(
          stars = stars!!,
          commentary = commentary
        )
      }
    }

    override fun toResponse(writer: ResponseWriter,
        value: CreateReviewForEpisodeMutation.Data.CreateReview) {
      writer.writeInt(RESPONSE_FIELDS[0], value.stars)
      writer.writeString(RESPONSE_FIELDS[1], value.commentary)
    }
  }
}
