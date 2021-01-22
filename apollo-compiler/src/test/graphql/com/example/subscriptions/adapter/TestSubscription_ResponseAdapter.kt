// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.subscriptions.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.subscriptions.TestSubscription
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object TestSubscription_ResponseAdapter : ResponseAdapter<TestSubscription.Data> {
  val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField(
      type = ResponseField.Type.Named("Comment", ResponseField.Kind.OBJECT),
      responseName = "commentAdded",
      fieldName = "commentAdded",
      arguments = mapOf<String, Any?>(
        "repoFullName" to mapOf<String, Any?>(
          "kind" to "Variable",
          "variableName" to "repo")),
      conditions = emptyList(),
      fields = CommentAdded.RESPONSE_FIELDS,
    )
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestSubscription.Data {
    return reader.run {
      var commentAdded: TestSubscription.Data.CommentAdded? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> commentAdded = readObject<TestSubscription.Data.CommentAdded>(RESPONSE_FIELDS[0]) { reader ->
            CommentAdded.fromResponse(reader)
          }
          else -> break
        }
      }
      TestSubscription.Data(
        commentAdded = commentAdded
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: TestSubscription.Data) {
    if(value.commentAdded == null) {
      writer.writeObject(RESPONSE_FIELDS[0], null)
    } else {
      writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
        CommentAdded.toResponse(writer, value.commentAdded)
      }
    }
  }

  object CommentAdded : ResponseAdapter<TestSubscription.Data.CommentAdded> {
    val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named("Int",
            ResponseField.Kind.OTHER)),
        responseName = "id",
        fieldName = "id",
        arguments = emptyMap(),
        conditions = emptyList(),
        fields = emptyArray(),
      ),
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
            ResponseField.Kind.OTHER)),
        responseName = "content",
        fieldName = "content",
        arguments = emptyMap(),
        conditions = emptyList(),
        fields = emptyArray(),
      )
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestSubscription.Data.CommentAdded {
      return reader.run {
        var id: Int? = null
        var content: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> id = readInt(RESPONSE_FIELDS[0])
            1 -> content = readString(RESPONSE_FIELDS[1])
            else -> break
          }
        }
        TestSubscription.Data.CommentAdded(
          id = id!!,
          content = content!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestSubscription.Data.CommentAdded) {
      writer.writeInt(RESPONSE_FIELDS[0], value.id)
      writer.writeString(RESPONSE_FIELDS[1], value.content)
    }
  }
}
