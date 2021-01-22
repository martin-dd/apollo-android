// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.named_fragment_delegate.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.named_fragment_delegate.TestQuery
import kotlin.Any
import kotlin.Array
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
      possibleFieldSets = mapOf(
        "Droid" to Hero.DroidHero.RESPONSE_FIELDS,
        "Human" to Hero.HumanHero.RESPONSE_FIELDS,
      ),
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
    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data.Hero {
      val typename = __typename ?: reader.readString(ResponseField.Typename)
      return when(typename) {
        "Droid" -> DroidHero.fromResponse(reader, typename)
        "Human" -> HumanHero.fromResponse(reader, typename)
        else -> OtherHero.fromResponse(reader, typename)
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Hero) {
      when(value) {
        is TestQuery.Data.Hero.DroidHero -> DroidHero.toResponse(writer, value)
        is TestQuery.Data.Hero.HumanHero -> HumanHero.toResponse(writer, value)
        is TestQuery.Data.Hero.OtherHero -> OtherHero.toResponse(writer, value)
      }
    }

    object DroidHero : ResponseAdapter<TestQuery.Data.Hero.DroidHero> {
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
          type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
              ResponseField.Kind.OTHER)),
          responseName = "name",
          fieldName = "name",
          arguments = emptyMap(),
          conditions = emptyList(),
          possibleFieldSets = emptyMap(),
        ),
        ResponseField(
          type = ResponseField.Type.Named("String", ResponseField.Kind.OTHER),
          responseName = "primaryFunction",
          fieldName = "primaryFunction",
          arguments = emptyMap(),
          conditions = emptyList(),
          possibleFieldSets = emptyMap(),
        ),
        ResponseField(
          type = ResponseField.Type.List(ResponseField.Type.Named("Character",
              ResponseField.Kind.OBJECT)),
          responseName = "friends",
          fieldName = "friends",
          arguments = emptyMap(),
          conditions = emptyList(),
          possibleFieldSets = mapOf(
            "" to Friend.RESPONSE_FIELDS
          ),
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.Hero.DroidHero {
        return reader.run {
          var __typename: String? = __typename
          var name: String? = null
          var primaryFunction: String? = null
          var friends: List<TestQuery.Data.Hero.DroidHero.Friend?>? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              1 -> name = readString(RESPONSE_FIELDS[1])
              2 -> primaryFunction = readString(RESPONSE_FIELDS[2])
              3 -> friends = readList<TestQuery.Data.Hero.DroidHero.Friend>(RESPONSE_FIELDS[3]) { reader ->
                reader.readObject<TestQuery.Data.Hero.DroidHero.Friend> { reader ->
                  Friend.fromResponse(reader)
                }
              }
              else -> break
            }
          }
          TestQuery.Data.Hero.DroidHero(
            __typename = __typename!!,
            name = name!!,
            primaryFunction = primaryFunction,
            friends = friends
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Hero.DroidHero) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
        writer.writeString(RESPONSE_FIELDS[1], value.name)
        writer.writeString(RESPONSE_FIELDS[2], value.primaryFunction)
        writer.writeList(RESPONSE_FIELDS[3], value.friends) { value, listItemWriter ->
          listItemWriter.writeObject { writer ->
            Friend.toResponse(writer, value)
          }
        }
      }

      object Friend : ResponseAdapter<TestQuery.Data.Hero.DroidHero.Friend> {
        val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField(
            type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
                ResponseField.Kind.OTHER)),
            responseName = "name",
            fieldName = "name",
            arguments = emptyMap(),
            conditions = emptyList(),
            possibleFieldSets = emptyMap(),
          )
        )

        override fun fromResponse(reader: ResponseReader, __typename: String?):
            TestQuery.Data.Hero.DroidHero.Friend {
          return reader.run {
            var name: String? = null
            while(true) {
              when (selectField(RESPONSE_FIELDS)) {
                0 -> name = readString(RESPONSE_FIELDS[0])
                else -> break
              }
            }
            TestQuery.Data.Hero.DroidHero.Friend(
              name = name!!
            )
          }
        }

        override fun toResponse(writer: ResponseWriter,
            value: TestQuery.Data.Hero.DroidHero.Friend) {
          writer.writeString(RESPONSE_FIELDS[0], value.name)
        }
      }
    }

    object HumanHero : ResponseAdapter<TestQuery.Data.Hero.HumanHero> {
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
          type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
              ResponseField.Kind.OTHER)),
          responseName = "name",
          fieldName = "name",
          arguments = emptyMap(),
          conditions = emptyList(),
          possibleFieldSets = emptyMap(),
        ),
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named("URL",
              ResponseField.Kind.OTHER)),
          responseName = "profileLink",
          fieldName = "profileLink",
          arguments = emptyMap(),
          conditions = emptyList(),
          possibleFieldSets = emptyMap(),
        ),
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named("FriendsConnection",
              ResponseField.Kind.OBJECT)),
          responseName = "friendsConnection",
          fieldName = "friendsConnection",
          arguments = emptyMap(),
          conditions = emptyList(),
          possibleFieldSets = mapOf(
            "" to FriendsConnection.RESPONSE_FIELDS
          ),
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.Hero.HumanHero {
        return reader.run {
          var __typename: String? = __typename
          var name: String? = null
          var profileLink: Any? = null
          var friendsConnection: TestQuery.Data.Hero.HumanHero.FriendsConnection? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              1 -> name = readString(RESPONSE_FIELDS[1])
              2 -> profileLink = readCustomScalar<Any>(RESPONSE_FIELDS[2])
              3 -> friendsConnection = readObject<TestQuery.Data.Hero.HumanHero.FriendsConnection>(RESPONSE_FIELDS[3]) { reader ->
                FriendsConnection.fromResponse(reader)
              }
              else -> break
            }
          }
          TestQuery.Data.Hero.HumanHero(
            __typename = __typename!!,
            name = name!!,
            profileLink = profileLink!!,
            friendsConnection = friendsConnection!!
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Hero.HumanHero) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
        writer.writeString(RESPONSE_FIELDS[1], value.name)
        writer.writeCustom(RESPONSE_FIELDS[2], value.profileLink)
        writer.writeObject(RESPONSE_FIELDS[3]) { writer ->
          FriendsConnection.toResponse(writer, value.friendsConnection)
        }
      }

      object FriendsConnection : ResponseAdapter<TestQuery.Data.Hero.HumanHero.FriendsConnection> {
        val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField(
            type = ResponseField.Type.List(ResponseField.Type.Named("FriendsEdge",
                ResponseField.Kind.OBJECT)),
            responseName = "edges",
            fieldName = "edges",
            arguments = emptyMap(),
            conditions = emptyList(),
            possibleFieldSets = mapOf(
              "" to Edge.RESPONSE_FIELDS
            ),
          )
        )

        override fun fromResponse(reader: ResponseReader, __typename: String?):
            TestQuery.Data.Hero.HumanHero.FriendsConnection {
          return reader.run {
            var edges: List<TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge?>? = null
            while(true) {
              when (selectField(RESPONSE_FIELDS)) {
                0 -> edges = readList<TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge>(RESPONSE_FIELDS[0]) { reader ->
                  reader.readObject<TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge> { reader ->
                    Edge.fromResponse(reader)
                  }
                }
                else -> break
              }
            }
            TestQuery.Data.Hero.HumanHero.FriendsConnection(
              edges = edges
            )
          }
        }

        override fun toResponse(writer: ResponseWriter,
            value: TestQuery.Data.Hero.HumanHero.FriendsConnection) {
          writer.writeList(RESPONSE_FIELDS[0], value.edges) { value, listItemWriter ->
            listItemWriter.writeObject { writer ->
              Edge.toResponse(writer, value)
            }
          }
        }

        object Edge : ResponseAdapter<TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge> {
          val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
            ResponseField(
              type = ResponseField.Type.Named("Character", ResponseField.Kind.OBJECT),
              responseName = "node",
              fieldName = "node",
              arguments = emptyMap(),
              conditions = emptyList(),
              possibleFieldSets = mapOf(
                "" to Node.RESPONSE_FIELDS
              ),
            )
          )

          override fun fromResponse(reader: ResponseReader, __typename: String?):
              TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge {
            return reader.run {
              var node: TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge.Node? = null
              while(true) {
                when (selectField(RESPONSE_FIELDS)) {
                  0 -> node = readObject<TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge.Node>(RESPONSE_FIELDS[0]) { reader ->
                    Node.fromResponse(reader)
                  }
                  else -> break
                }
              }
              TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge(
                node = node
              )
            }
          }

          override fun toResponse(writer: ResponseWriter,
              value: TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge) {
            if(value.node == null) {
              writer.writeObject(RESPONSE_FIELDS[0], null)
            } else {
              writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
                Node.toResponse(writer, value.node)
              }
            }
          }

          object Node : ResponseAdapter<TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge.Node> {
            val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
              ResponseField(
                type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
                    ResponseField.Kind.OTHER)),
                responseName = "name",
                fieldName = "name",
                arguments = emptyMap(),
                conditions = emptyList(),
                possibleFieldSets = emptyMap(),
              )
            )

            override fun fromResponse(reader: ResponseReader, __typename: String?):
                TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge.Node {
              return reader.run {
                var name: String? = null
                while(true) {
                  when (selectField(RESPONSE_FIELDS)) {
                    0 -> name = readString(RESPONSE_FIELDS[0])
                    else -> break
                  }
                }
                TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge.Node(
                  name = name!!
                )
              }
            }

            override fun toResponse(writer: ResponseWriter,
                value: TestQuery.Data.Hero.HumanHero.FriendsConnection.Edge.Node) {
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
          possibleFieldSets = emptyMap(),
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
