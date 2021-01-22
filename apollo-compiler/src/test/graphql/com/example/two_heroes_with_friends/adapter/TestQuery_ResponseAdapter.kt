// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.two_heroes_with_friends.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.two_heroes_with_friends.TestQuery
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
      responseName = "r2",
      fieldName = "hero",
      arguments = emptyMap(),
      conditions = emptyList(),
      possibleFieldSets = mapOf(
        "" to R2.RESPONSE_FIELDS
      ),
    ),
    ResponseField(
      type = ResponseField.Type.Named("Character", ResponseField.Kind.OBJECT),
      responseName = "luke",
      fieldName = "hero",
      arguments = mapOf<String, Any?>(
        "episode" to "EMPIRE"),
      conditions = emptyList(),
      possibleFieldSets = mapOf(
        "" to Luke.RESPONSE_FIELDS
      ),
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
        responseName = "name",
        fieldName = "name",
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

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data.R2 {
      return reader.run {
        var name: String? = null
        var friendsConnection: TestQuery.Data.R2.FriendsConnection? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> name = readString(RESPONSE_FIELDS[0])
            1 -> friendsConnection = readObject<TestQuery.Data.R2.FriendsConnection>(RESPONSE_FIELDS[1]) { reader ->
              FriendsConnection.fromResponse(reader)
            }
            else -> break
          }
        }
        TestQuery.Data.R2(
          name = name!!,
          friendsConnection = friendsConnection!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.R2) {
      writer.writeString(RESPONSE_FIELDS[0], value.name)
      writer.writeObject(RESPONSE_FIELDS[1]) { writer ->
        FriendsConnection.toResponse(writer, value.friendsConnection)
      }
    }

    object FriendsConnection : ResponseAdapter<TestQuery.Data.R2.FriendsConnection> {
      val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.Named("Int", ResponseField.Kind.OTHER),
          responseName = "totalCount",
          fieldName = "totalCount",
          arguments = emptyMap(),
          conditions = emptyList(),
          possibleFieldSets = emptyMap(),
        ),
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
          TestQuery.Data.R2.FriendsConnection {
        return reader.run {
          var totalCount: Int? = null
          var edges: List<TestQuery.Data.R2.FriendsConnection.Edge?>? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> totalCount = readInt(RESPONSE_FIELDS[0])
              1 -> edges = readList<TestQuery.Data.R2.FriendsConnection.Edge>(RESPONSE_FIELDS[1]) { reader ->
                reader.readObject<TestQuery.Data.R2.FriendsConnection.Edge> { reader ->
                  Edge.fromResponse(reader)
                }
              }
              else -> break
            }
          }
          TestQuery.Data.R2.FriendsConnection(
            totalCount = totalCount,
            edges = edges
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.R2.FriendsConnection) {
        writer.writeInt(RESPONSE_FIELDS[0], value.totalCount)
        writer.writeList(RESPONSE_FIELDS[1], value.edges) { value, listItemWriter ->
          listItemWriter.writeObject { writer ->
            Edge.toResponse(writer, value)
          }
        }
      }

      object Edge : ResponseAdapter<TestQuery.Data.R2.FriendsConnection.Edge> {
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
            TestQuery.Data.R2.FriendsConnection.Edge {
          return reader.run {
            var node: TestQuery.Data.R2.FriendsConnection.Edge.Node? = null
            while(true) {
              when (selectField(RESPONSE_FIELDS)) {
                0 -> node = readObject<TestQuery.Data.R2.FriendsConnection.Edge.Node>(RESPONSE_FIELDS[0]) { reader ->
                  Node.fromResponse(reader)
                }
                else -> break
              }
            }
            TestQuery.Data.R2.FriendsConnection.Edge(
              node = node
            )
          }
        }

        override fun toResponse(writer: ResponseWriter,
            value: TestQuery.Data.R2.FriendsConnection.Edge) {
          if(value.node == null) {
            writer.writeObject(RESPONSE_FIELDS[0], null)
          } else {
            writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
              Node.toResponse(writer, value.node)
            }
          }
        }

        object Node : ResponseAdapter<TestQuery.Data.R2.FriendsConnection.Edge.Node> {
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
              TestQuery.Data.R2.FriendsConnection.Edge.Node {
            return reader.run {
              var name: String? = null
              while(true) {
                when (selectField(RESPONSE_FIELDS)) {
                  0 -> name = readString(RESPONSE_FIELDS[0])
                  else -> break
                }
              }
              TestQuery.Data.R2.FriendsConnection.Edge.Node(
                name = name!!
              )
            }
          }

          override fun toResponse(writer: ResponseWriter,
              value: TestQuery.Data.R2.FriendsConnection.Edge.Node) {
            writer.writeString(RESPONSE_FIELDS[0], value.name)
          }
        }
      }
    }
  }

  object Luke : ResponseAdapter<TestQuery.Data.Luke> {
    val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named("String",
            ResponseField.Kind.OTHER)),
        responseName = "id",
        fieldName = "id",
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

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data.Luke {
      return reader.run {
        var id: String? = null
        var name: String? = null
        var friendsConnection: TestQuery.Data.Luke.FriendsConnection? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> id = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> friendsConnection = readObject<TestQuery.Data.Luke.FriendsConnection>(RESPONSE_FIELDS[2]) { reader ->
              FriendsConnection.fromResponse(reader)
            }
            else -> break
          }
        }
        TestQuery.Data.Luke(
          id = id!!,
          name = name!!,
          friendsConnection = friendsConnection!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Luke) {
      writer.writeString(RESPONSE_FIELDS[0], value.id)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
      writer.writeObject(RESPONSE_FIELDS[2]) { writer ->
        FriendsConnection.toResponse(writer, value.friendsConnection)
      }
    }

    object FriendsConnection : ResponseAdapter<TestQuery.Data.Luke.FriendsConnection> {
      val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.Named("Int", ResponseField.Kind.OTHER),
          responseName = "totalCount",
          fieldName = "totalCount",
          arguments = emptyMap(),
          conditions = emptyList(),
          possibleFieldSets = emptyMap(),
        ),
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
          TestQuery.Data.Luke.FriendsConnection {
        return reader.run {
          var totalCount: Int? = null
          var edges: List<TestQuery.Data.Luke.FriendsConnection.Edge?>? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> totalCount = readInt(RESPONSE_FIELDS[0])
              1 -> edges = readList<TestQuery.Data.Luke.FriendsConnection.Edge>(RESPONSE_FIELDS[1]) { reader ->
                reader.readObject<TestQuery.Data.Luke.FriendsConnection.Edge> { reader ->
                  Edge.fromResponse(reader)
                }
              }
              else -> break
            }
          }
          TestQuery.Data.Luke.FriendsConnection(
            totalCount = totalCount,
            edges = edges
          )
        }
      }

      override fun toResponse(writer: ResponseWriter,
          value: TestQuery.Data.Luke.FriendsConnection) {
        writer.writeInt(RESPONSE_FIELDS[0], value.totalCount)
        writer.writeList(RESPONSE_FIELDS[1], value.edges) { value, listItemWriter ->
          listItemWriter.writeObject { writer ->
            Edge.toResponse(writer, value)
          }
        }
      }

      object Edge : ResponseAdapter<TestQuery.Data.Luke.FriendsConnection.Edge> {
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
            TestQuery.Data.Luke.FriendsConnection.Edge {
          return reader.run {
            var node: TestQuery.Data.Luke.FriendsConnection.Edge.Node? = null
            while(true) {
              when (selectField(RESPONSE_FIELDS)) {
                0 -> node = readObject<TestQuery.Data.Luke.FriendsConnection.Edge.Node>(RESPONSE_FIELDS[0]) { reader ->
                  Node.fromResponse(reader)
                }
                else -> break
              }
            }
            TestQuery.Data.Luke.FriendsConnection.Edge(
              node = node
            )
          }
        }

        override fun toResponse(writer: ResponseWriter,
            value: TestQuery.Data.Luke.FriendsConnection.Edge) {
          if(value.node == null) {
            writer.writeObject(RESPONSE_FIELDS[0], null)
          } else {
            writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
              Node.toResponse(writer, value.node)
            }
          }
        }

        object Node : ResponseAdapter<TestQuery.Data.Luke.FriendsConnection.Edge.Node> {
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
              TestQuery.Data.Luke.FriendsConnection.Edge.Node {
            return reader.run {
              var name: String? = null
              while(true) {
                when (selectField(RESPONSE_FIELDS)) {
                  0 -> name = readString(RESPONSE_FIELDS[0])
                  else -> break
                }
              }
              TestQuery.Data.Luke.FriendsConnection.Edge.Node(
                name = name!!
              )
            }
          }

          override fun toResponse(writer: ResponseWriter,
              value: TestQuery.Data.Luke.FriendsConnection.Edge.Node) {
            writer.writeString(RESPONSE_FIELDS[0], value.name)
          }
        }
      }
    }
  }
}
