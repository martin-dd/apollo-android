// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragments_with_type_condition.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.fragments_with_type_condition.TestQuery
import kotlin.Array
import kotlin.Double
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object TestQuery_ResponseAdapter : ResponseAdapter<TestQuery.Data> {
  val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField(
      type = ResponseField.Type.Named("Character", ResponseField.Kind.OBJECT),
      responseName = "r2",
      fieldName = "hero",
      arguments = emptyMap(),
      conditions = emptyList(),
      fields = R2.RESPONSE_FIELDS,
    ),
    ResponseField(
      type = ResponseField.Type.Named("Character", ResponseField.Kind.OBJECT),
      responseName = "luke",
      fieldName = "hero",
      arguments = emptyMap(),
      conditions = emptyList(),
      fields = Luke.RESPONSE_FIELDS,
    )
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var r2: TestQuery.Data.R2? = null
      var luke: TestQuery.Data.Luke? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> r2 = readObject<TestQuery.Data.R2>(RESPONSE_FIELDS[0]) { reader ->
            R2.fromResponse(reader)
          }
          1 -> luke = readObject<TestQuery.Data.Luke>(RESPONSE_FIELDS[1]) { reader ->
            Luke.fromResponse(reader)
          }
          else -> break
        }
      }
      TestQuery.Data(
        r2 = r2,
        luke = luke
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: TestQuery.Data) {
    if(value.r2 == null) {
      writer.writeObject(RESPONSE_FIELDS[0], null)
    } else {
      writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
        R2.toResponse(writer, value.r2)
      }
    }
    if(value.luke == null) {
      writer.writeObject(RESPONSE_FIELDS[1], null)
    } else {
      writer.writeObject(RESPONSE_FIELDS[1]) { writer ->
        Luke.toResponse(writer, value.luke)
      }
    }
  }

  object R2 : ResponseAdapter<TestQuery.Data.R2> {
    val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
            ResponseField.Kind.OTHER)),
        responseName = "__typename",
        fieldName = "__typename",
        arguments = emptyMap(),
        conditions = emptyList(),
        fields = emptyArray(),
      )
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data.R2 {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Human" -> HumanR2.fromResponse(reader, typename)
        "Droid" -> DroidR2.fromResponse(reader, typename)
        else -> OtherR2.fromResponse(reader, typename)
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.R2) {
      when(value) {
        is TestQuery.Data.R2.HumanR2 -> HumanR2.toResponse(writer, value)
        is TestQuery.Data.R2.DroidR2 -> DroidR2.toResponse(writer, value)
        is TestQuery.Data.R2.OtherR2 -> OtherR2.toResponse(writer, value)
      }
    }

    object HumanR2 : ResponseAdapter<TestQuery.Data.R2.HumanR2> {
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
          type = ResponseField.Type.Named("Float", ResponseField.Kind.OTHER),
          responseName = "height",
          fieldName = "height",
          arguments = emptyMap(),
          conditions = emptyList(),
          fields = emptyArray(),
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.R2.HumanR2 {
        return reader.run {
          var __typename: String? = __typename
          var name: String? = null
          var height: Double? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              1 -> name = readString(RESPONSE_FIELDS[1])
              2 -> height = readDouble(RESPONSE_FIELDS[2])
              else -> break
            }
          }
          TestQuery.Data.R2.HumanR2(
            __typename = __typename!!,
            name = name!!,
            height = height
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.R2.HumanR2) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
        writer.writeString(RESPONSE_FIELDS[1], value.name)
        writer.writeDouble(RESPONSE_FIELDS[2], value.height)
      }
    }

    object DroidR2 : ResponseAdapter<TestQuery.Data.R2.DroidR2> {
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

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.R2.DroidR2 {
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
          TestQuery.Data.R2.DroidR2(
            __typename = __typename!!,
            name = name!!,
            primaryFunction = primaryFunction
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.R2.DroidR2) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
        writer.writeString(RESPONSE_FIELDS[1], value.name)
        writer.writeString(RESPONSE_FIELDS[2], value.primaryFunction)
      }
    }

    object OtherR2 : ResponseAdapter<TestQuery.Data.R2.OtherR2> {
      val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
              ResponseField.Kind.OTHER)),
          responseName = "__typename",
          fieldName = "__typename",
          arguments = emptyMap(),
          conditions = emptyList(),
          fields = emptyArray(),
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.R2.OtherR2 {
        return reader.run {
          var __typename: String? = __typename
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              else -> break
            }
          }
          TestQuery.Data.R2.OtherR2(
            __typename = __typename!!
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.R2.OtherR2) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      }
    }
  }

  object Luke : ResponseAdapter<TestQuery.Data.Luke> {
    val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
            ResponseField.Kind.OTHER)),
        responseName = "__typename",
        fieldName = "__typename",
        arguments = emptyMap(),
        conditions = emptyList(),
        fields = emptyArray(),
      )
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data.Luke {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Human" -> HumanLuke.fromResponse(reader, typename)
        "Droid" -> DroidLuke.fromResponse(reader, typename)
        else -> OtherLuke.fromResponse(reader, typename)
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Luke) {
      when(value) {
        is TestQuery.Data.Luke.HumanLuke -> HumanLuke.toResponse(writer, value)
        is TestQuery.Data.Luke.DroidLuke -> DroidLuke.toResponse(writer, value)
        is TestQuery.Data.Luke.OtherLuke -> OtherLuke.toResponse(writer, value)
      }
    }

    object HumanLuke : ResponseAdapter<TestQuery.Data.Luke.HumanLuke> {
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
          type = ResponseField.Type.Named("Float", ResponseField.Kind.OTHER),
          responseName = "height",
          fieldName = "height",
          arguments = emptyMap(),
          conditions = emptyList(),
          fields = emptyArray(),
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.Luke.HumanLuke {
        return reader.run {
          var __typename: String? = __typename
          var name: String? = null
          var height: Double? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              1 -> name = readString(RESPONSE_FIELDS[1])
              2 -> height = readDouble(RESPONSE_FIELDS[2])
              else -> break
            }
          }
          TestQuery.Data.Luke.HumanLuke(
            __typename = __typename!!,
            name = name!!,
            height = height
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Luke.HumanLuke) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
        writer.writeString(RESPONSE_FIELDS[1], value.name)
        writer.writeDouble(RESPONSE_FIELDS[2], value.height)
      }
    }

    object DroidLuke : ResponseAdapter<TestQuery.Data.Luke.DroidLuke> {
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

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.Luke.DroidLuke {
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
          TestQuery.Data.Luke.DroidLuke(
            __typename = __typename!!,
            name = name!!,
            primaryFunction = primaryFunction
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Luke.DroidLuke) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
        writer.writeString(RESPONSE_FIELDS[1], value.name)
        writer.writeString(RESPONSE_FIELDS[2], value.primaryFunction)
      }
    }

    object OtherLuke : ResponseAdapter<TestQuery.Data.Luke.OtherLuke> {
      val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
              ResponseField.Kind.OTHER)),
          responseName = "__typename",
          fieldName = "__typename",
          arguments = emptyMap(),
          conditions = emptyList(),
          fields = emptyArray(),
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.Luke.OtherLuke {
        return reader.run {
          var __typename: String? = __typename
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              else -> break
            }
          }
          TestQuery.Data.Luke.OtherLuke(
            __typename = __typename!!
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Luke.OtherLuke) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      }
    }
  }
}
