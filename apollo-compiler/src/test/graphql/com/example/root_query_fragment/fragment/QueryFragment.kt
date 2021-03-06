// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.root_query_fragment.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.ResponseReader
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
data class QueryFragment(
  val __typename: String = "Query",
  val hero: Hero?
) : GraphqlFragment {
  override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
    writer.writeString(RESPONSE_FIELDS[0], this@QueryFragment.__typename)
    writer.writeObject(RESPONSE_FIELDS[1], this@QueryFragment.hero?.marshaller())
  }

  companion object {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forObject("hero", "hero", null, true, null)
        )

    val FRAGMENT_DEFINITION: String = """
        |fragment QueryFragment on Query {
        |  __typename
        |  hero {
        |    __typename
        |    name
        |  }
        |}
        """.trimMargin()

    operator fun invoke(reader: ResponseReader): QueryFragment = reader.run {
      val __typename = readString(RESPONSE_FIELDS[0])!!
      val hero = readObject<Hero>(RESPONSE_FIELDS[1]) { reader ->
        Hero(reader)
      }
      QueryFragment(
        __typename = __typename,
        hero = hero
      )
    }

    @Suppress("FunctionName")
    fun Mapper(): ResponseFieldMapper<QueryFragment> = ResponseFieldMapper { invoke(it) }
  }

  /**
   * A character from the Star Wars universe
   */
  data class Hero(
    val __typename: String = "Character",
    /**
     * The name of the character
     */
    val name: String
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@Hero.__typename)
      writer.writeString(RESPONSE_FIELDS[1], this@Hero.name)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("name", "name", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): Hero = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val name = readString(RESPONSE_FIELDS[1])!!
        Hero(
          __typename = __typename,
          name = name
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<Hero> = ResponseFieldMapper { invoke(it) }
    }
  }
}
