// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_friends_connection.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.fragment_friends_connection.TestQuery
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object TestQuery_ResponseAdapter : ResponseAdapter<TestQuery.Data> {
  val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField(
      type = ResponseField.Type.Named("Character", ResponseField.Kind.OBJECT),
      responseName = "hero",
      fieldName = "hero",
      arguments = emptyMap(),
      conditions = emptyList(),
      fields = Hero.RESPONSE_FIELDS,
    )
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var hero: TestQuery.Data.Hero? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> hero = readObject<TestQuery.Data.Hero>(RESPONSE_FIELDS[0]) { reader ->
            Hero.fromResponse(reader)
          }
          else -> break
        }
      }
      TestQuery.Data(
        hero = hero
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: TestQuery.Data) {
    if(value.hero == null) {
      writer.writeObject(RESPONSE_FIELDS[0], null)
    } else {
      writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
        Hero.toResponse(writer, value.hero)
      }
    }
  }

  object Hero : ResponseAdapter<TestQuery.Data.Hero> {
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

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data.Hero {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Droid" -> CharacterHero.fromResponse(reader, typename)
        "Human" -> CharacterHero.fromResponse(reader, typename)
        else -> OtherHero.fromResponse(reader, typename)
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Hero) {
      when(value) {
        is TestQuery.Data.Hero.CharacterHero -> CharacterHero.toResponse(writer, value)
        is TestQuery.Data.Hero.OtherHero -> OtherHero.toResponse(writer, value)
      }
    }

    object CharacterHero : ResponseAdapter<TestQuery.Data.Hero.CharacterHero> {
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
          type = ResponseField.Type.NotNull(ResponseField.Type.Named("FriendsConnection",
              ResponseField.Kind.OBJECT)),
          responseName = "friendsConnection",
          fieldName = "friendsConnection",
          arguments = emptyMap(),
          conditions = emptyList(),
          fields = FriendsConnection.RESPONSE_FIELDS,
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.Hero.CharacterHero {
        return reader.run {
          var __typename: String? = __typename
          var name: String? = null
          var friendsConnection: TestQuery.Data.Hero.CharacterHero.FriendsConnection? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              1 -> name = readString(RESPONSE_FIELDS[1])
              2 -> friendsConnection = readObject<TestQuery.Data.Hero.CharacterHero.FriendsConnection>(RESPONSE_FIELDS[2]) { reader ->
                FriendsConnection.fromResponse(reader)
              }
              else -> break
            }
          }
          TestQuery.Data.Hero.CharacterHero(
            __typename = __typename!!,
            name = name!!,
            friendsConnection = friendsConnection!!
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Hero.CharacterHero) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
        writer.writeString(RESPONSE_FIELDS[1], value.name)
        writer.writeObject(RESPONSE_FIELDS[2]) { writer ->
          FriendsConnection.toResponse(writer, value.friendsConnection)
        }
      }

      object FriendsConnection :
          ResponseAdapter<TestQuery.Data.Hero.CharacterHero.FriendsConnection> {
        val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField(
            type = ResponseField.Type.Named("Int", ResponseField.Kind.OTHER),
            responseName = "totalCount",
            fieldName = "totalCount",
            arguments = emptyMap(),
            conditions = emptyList(),
            fields = emptyArray(),
          ),
          ResponseField(
            type = ResponseField.Type.List(ResponseField.Type.Named("FriendsEdge",
                ResponseField.Kind.OBJECT)),
            responseName = "edges",
            fieldName = "edges",
            arguments = emptyMap(),
            conditions = emptyList(),
            fields = Edge.RESPONSE_FIELDS,
          )
        )

        override fun fromResponse(reader: ResponseReader, __typename: String?):
            TestQuery.Data.Hero.CharacterHero.FriendsConnection {
          return reader.run {
            var totalCount: Int? = null
            var edges: List<TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge?>? = null
            while(true) {
              when (selectField(RESPONSE_FIELDS)) {
                0 -> totalCount = readInt(RESPONSE_FIELDS[0])
                1 -> edges = readList<TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge>(RESPONSE_FIELDS[1]) { reader ->
                  reader.readObject<TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge> { reader ->
                    Edge.fromResponse(reader)
                  }
                }
                else -> break
              }
            }
            TestQuery.Data.Hero.CharacterHero.FriendsConnection(
              totalCount = totalCount,
              edges = edges
            )
          }
        }

        override fun toResponse(writer: ResponseWriter,
            value: TestQuery.Data.Hero.CharacterHero.FriendsConnection) {
          writer.writeInt(RESPONSE_FIELDS[0], value.totalCount)
          writer.writeList(RESPONSE_FIELDS[1], value.edges) { value, listItemWriter ->
            listItemWriter.writeObject { writer ->
              Edge.toResponse(writer, value)
            }
          }
        }

        object Edge : ResponseAdapter<TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge> {
          val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
            ResponseField(
              type = ResponseField.Type.Named("Character", ResponseField.Kind.OBJECT),
              responseName = "node",
              fieldName = "node",
              arguments = emptyMap(),
              conditions = emptyList(),
              fields = Node.RESPONSE_FIELDS,
            )
          )

          override fun fromResponse(reader: ResponseReader, __typename: String?):
              TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge {
            return reader.run {
              var node: TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge.Node? = null
              while(true) {
                when (selectField(RESPONSE_FIELDS)) {
                  0 -> node = readObject<TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge.Node>(RESPONSE_FIELDS[0]) { reader ->
                    Node.fromResponse(reader)
                  }
                  else -> break
                }
              }
              TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge(
                node = node
              )
            }
          }

          override fun toResponse(writer: ResponseWriter,
              value: TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge) {
            if(value.node == null) {
              writer.writeObject(RESPONSE_FIELDS[0], null)
            } else {
              writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
                Node.toResponse(writer, value.node)
              }
            }
          }

          object Node :
              ResponseAdapter<TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge.Node> {
            val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
              ResponseField(
                type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
                    ResponseField.Kind.OTHER)),
                responseName = "name",
                fieldName = "name",
                arguments = emptyMap(),
                conditions = emptyList(),
                fields = emptyArray(),
              )
            )

            override fun fromResponse(reader: ResponseReader, __typename: String?):
                TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge.Node {
              return reader.run {
                var name: String? = null
                while(true) {
                  when (selectField(RESPONSE_FIELDS)) {
                    0 -> name = readString(RESPONSE_FIELDS[0])
                    else -> break
                  }
                }
                TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge.Node(
                  name = name!!
                )
              }
            }

            override fun toResponse(writer: ResponseWriter,
                value: TestQuery.Data.Hero.CharacterHero.FriendsConnection.Edge.Node) {
              writer.writeString(RESPONSE_FIELDS[0], value.name)
            }
          }
        }
      }
    }

    object OtherHero : ResponseAdapter<TestQuery.Data.Hero.OtherHero> {
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
          TestQuery.Data.Hero.OtherHero {
        return reader.run {
          var __typename: String? = __typename
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              else -> break
            }
          }
          TestQuery.Data.Hero.OtherHero(
            __typename = __typename!!
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Hero.OtherHero) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      }
    }
  }
}
