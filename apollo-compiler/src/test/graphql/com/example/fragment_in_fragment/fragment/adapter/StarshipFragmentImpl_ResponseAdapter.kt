// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_in_fragment.fragment.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.fragment_in_fragment.fragment.StarshipFragmentImpl
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object StarshipFragmentImpl_ResponseAdapter : ResponseAdapter<StarshipFragmentImpl.Data> {
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
      responseName = "id",
      fieldName = "id",
      arguments = emptyMap(),
      conditions = emptyList(),
      possibleFieldSets = emptyMap(),
    ),
    ResponseField(
      type = ResponseField.Type.Named("String", ResponseField.Kind.OTHER),
      responseName = "name",
      fieldName = "name",
      arguments = emptyMap(),
      conditions = emptyList(),
      possibleFieldSets = emptyMap(),
    ),
    ResponseField(
      type = ResponseField.Type.Named("StarshipPilotsConnection", ResponseField.Kind.OBJECT),
      responseName = "pilotConnection",
      fieldName = "pilotConnection",
      arguments = emptyMap(),
      conditions = emptyList(),
      possibleFieldSets = mapOf(
        "" to PilotConnection.RESPONSE_FIELDS
      ),
    )
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?):
      StarshipFragmentImpl.Data {
    return reader.run {
      var __typename: String? = __typename
      var id: String? = null
      var name: String? = null
      var pilotConnection: StarshipFragmentImpl.Data.PilotConnection? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> __typename = readString(RESPONSE_FIELDS[0])
          1 -> id = readString(RESPONSE_FIELDS[1])
          2 -> name = readString(RESPONSE_FIELDS[2])
          3 -> pilotConnection = readObject<StarshipFragmentImpl.Data.PilotConnection>(RESPONSE_FIELDS[3]) { reader ->
            PilotConnection.fromResponse(reader)
          }
          else -> break
        }
      }
      StarshipFragmentImpl.Data(
        __typename = __typename!!,
        id = id!!,
        name = name,
        pilotConnection = pilotConnection
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: StarshipFragmentImpl.Data) {
    writer.writeString(RESPONSE_FIELDS[0], value.__typename)
    writer.writeString(RESPONSE_FIELDS[1], value.id)
    writer.writeString(RESPONSE_FIELDS[2], value.name)
    if(value.pilotConnection == null) {
      writer.writeObject(RESPONSE_FIELDS[3], null)
    } else {
      writer.writeObject(RESPONSE_FIELDS[3]) { writer ->
        PilotConnection.toResponse(writer, value.pilotConnection)
      }
    }
  }

  object PilotConnection : ResponseAdapter<StarshipFragmentImpl.Data.PilotConnection> {
    val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField(
        type = ResponseField.Type.List(ResponseField.Type.Named("StarshipPilotsEdge",
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
        StarshipFragmentImpl.Data.PilotConnection {
      return reader.run {
        var edges: List<StarshipFragmentImpl.Data.PilotConnection.Edge?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> edges = readList<StarshipFragmentImpl.Data.PilotConnection.Edge>(RESPONSE_FIELDS[0]) { reader ->
              reader.readObject<StarshipFragmentImpl.Data.PilotConnection.Edge> { reader ->
                Edge.fromResponse(reader)
              }
            }
            else -> break
          }
        }
        StarshipFragmentImpl.Data.PilotConnection(
          edges = edges
        )
      }
    }

    override fun toResponse(writer: ResponseWriter,
        value: StarshipFragmentImpl.Data.PilotConnection) {
      writer.writeList(RESPONSE_FIELDS[0], value.edges) { value, listItemWriter ->
        listItemWriter.writeObject { writer ->
          Edge.toResponse(writer, value)
        }
      }
    }

    object Edge : ResponseAdapter<StarshipFragmentImpl.Data.PilotConnection.Edge> {
      val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.Named("Person", ResponseField.Kind.OBJECT),
          responseName = "node",
          fieldName = "node",
          arguments = emptyMap(),
          conditions = emptyList(),
          possibleFieldSets = mapOf(
            "Person" to Node.PersonNode.RESPONSE_FIELDS,
          ),
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          StarshipFragmentImpl.Data.PilotConnection.Edge {
        return reader.run {
          var node: StarshipFragmentImpl.Data.PilotConnection.Edge.Node? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> node = readObject<StarshipFragmentImpl.Data.PilotConnection.Edge.Node>(RESPONSE_FIELDS[0]) { reader ->
                Node.fromResponse(reader)
              }
              else -> break
            }
          }
          StarshipFragmentImpl.Data.PilotConnection.Edge(
            node = node
          )
        }
      }

      override fun toResponse(writer: ResponseWriter,
          value: StarshipFragmentImpl.Data.PilotConnection.Edge) {
        if(value.node == null) {
          writer.writeObject(RESPONSE_FIELDS[0], null)
        } else {
          writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
            Node.toResponse(writer, value.node)
          }
        }
      }

      object Node : ResponseAdapter<StarshipFragmentImpl.Data.PilotConnection.Edge.Node> {
        override fun fromResponse(reader: ResponseReader, __typename: String?):
            StarshipFragmentImpl.Data.PilotConnection.Edge.Node {
          val typename = __typename ?: reader.readString(ResponseField.Typename)
          return when(typename) {
            "Person" -> PersonNode.fromResponse(reader, typename)
            else -> OtherNode.fromResponse(reader, typename)
          }
        }

        override fun toResponse(writer: ResponseWriter,
            value: StarshipFragmentImpl.Data.PilotConnection.Edge.Node) {
          when(value) {
            is StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode -> PersonNode.toResponse(writer, value)
            is StarshipFragmentImpl.Data.PilotConnection.Edge.Node.OtherNode -> OtherNode.toResponse(writer, value)
          }
        }

        object PersonNode :
            ResponseAdapter<StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode> {
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
              responseName = "name",
              fieldName = "name",
              arguments = emptyMap(),
              conditions = emptyList(),
              possibleFieldSets = emptyMap(),
            ),
            ResponseField(
              type = ResponseField.Type.Named("Planet", ResponseField.Kind.OBJECT),
              responseName = "homeworld",
              fieldName = "homeworld",
              arguments = emptyMap(),
              conditions = emptyList(),
              possibleFieldSets = mapOf(
                "Planet" to Homeworld.PlanetHomeworld.RESPONSE_FIELDS,
              ),
            )
          )

          override fun fromResponse(reader: ResponseReader, __typename: String?):
              StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode {
            return reader.run {
              var __typename: String? = __typename
              var name: String? = null
              var homeworld: StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld? = null
              while(true) {
                when (selectField(RESPONSE_FIELDS)) {
                  0 -> __typename = readString(RESPONSE_FIELDS[0])
                  1 -> name = readString(RESPONSE_FIELDS[1])
                  2 -> homeworld = readObject<StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld>(RESPONSE_FIELDS[2]) { reader ->
                    Homeworld.fromResponse(reader)
                  }
                  else -> break
                }
              }
              StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode(
                __typename = __typename!!,
                name = name,
                homeworld = homeworld
              )
            }
          }

          override fun toResponse(writer: ResponseWriter,
              value: StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode) {
            writer.writeString(RESPONSE_FIELDS[0], value.__typename)
            writer.writeString(RESPONSE_FIELDS[1], value.name)
            if(value.homeworld == null) {
              writer.writeObject(RESPONSE_FIELDS[2], null)
            } else {
              writer.writeObject(RESPONSE_FIELDS[2]) { writer ->
                Homeworld.toResponse(writer, value.homeworld)
              }
            }
          }

          object Homeworld :
              ResponseAdapter<StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld>
              {
            override fun fromResponse(reader: ResponseReader, __typename: String?):
                StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld {
              val typename = __typename ?: reader.readString(ResponseField.Typename)
              return when(typename) {
                "Planet" -> PlanetHomeworld.fromResponse(reader, typename)
                else -> OtherHomeworld.fromResponse(reader, typename)
              }
            }

            override fun toResponse(writer: ResponseWriter,
                value: StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld) {
              when(value) {
                is StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld.PlanetHomeworld -> PlanetHomeworld.toResponse(writer, value)
                is StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld.OtherHomeworld -> OtherHomeworld.toResponse(writer, value)
              }
            }

            object PlanetHomeworld :
                ResponseAdapter<StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld.PlanetHomeworld>
                {
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
                  responseName = "name",
                  fieldName = "name",
                  arguments = emptyMap(),
                  conditions = emptyList(),
                  possibleFieldSets = emptyMap(),
                )
              )

              override fun fromResponse(reader: ResponseReader, __typename: String?):
                  StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld.PlanetHomeworld {
                return reader.run {
                  var __typename: String? = __typename
                  var name: String? = null
                  while(true) {
                    when (selectField(RESPONSE_FIELDS)) {
                      0 -> __typename = readString(RESPONSE_FIELDS[0])
                      1 -> name = readString(RESPONSE_FIELDS[1])
                      else -> break
                    }
                  }
                  StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld.PlanetHomeworld(
                    __typename = __typename!!,
                    name = name
                  )
                }
              }

              override fun toResponse(writer: ResponseWriter,
                  value: StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld.PlanetHomeworld) {
                writer.writeString(RESPONSE_FIELDS[0], value.__typename)
                writer.writeString(RESPONSE_FIELDS[1], value.name)
              }
            }

            object OtherHomeworld :
                ResponseAdapter<StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld.OtherHomeworld>
                {
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
                  StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld.OtherHomeworld {
                return reader.run {
                  var __typename: String? = __typename
                  while(true) {
                    when (selectField(RESPONSE_FIELDS)) {
                      0 -> __typename = readString(RESPONSE_FIELDS[0])
                      else -> break
                    }
                  }
                  StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld.OtherHomeworld(
                    __typename = __typename!!
                  )
                }
              }

              override fun toResponse(writer: ResponseWriter,
                  value: StarshipFragmentImpl.Data.PilotConnection.Edge.Node.PersonNode.Homeworld.OtherHomeworld) {
                writer.writeString(RESPONSE_FIELDS[0], value.__typename)
              }
            }
          }
        }

        object OtherNode :
            ResponseAdapter<StarshipFragmentImpl.Data.PilotConnection.Edge.Node.OtherNode> {
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
              StarshipFragmentImpl.Data.PilotConnection.Edge.Node.OtherNode {
            return reader.run {
              var __typename: String? = __typename
              while(true) {
                when (selectField(RESPONSE_FIELDS)) {
                  0 -> __typename = readString(RESPONSE_FIELDS[0])
                  else -> break
                }
              }
              StarshipFragmentImpl.Data.PilotConnection.Edge.Node.OtherNode(
                __typename = __typename!!
              )
            }
          }

          override fun toResponse(writer: ResponseWriter,
              value: StarshipFragmentImpl.Data.PilotConnection.Edge.Node.OtherNode) {
            writer.writeString(RESPONSE_FIELDS[0], value.__typename)
          }
        }
      }
    }
  }
}
