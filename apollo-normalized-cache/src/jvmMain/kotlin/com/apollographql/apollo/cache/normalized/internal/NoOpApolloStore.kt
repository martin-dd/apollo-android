package com.apollographql.apollo.cache.normalized.internal

import com.apollographql.apollo.api.Fragment
import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.internal.json.JsonReader
import com.apollographql.apollo.cache.CacheHeaders
import com.apollographql.apollo.cache.normalized.ApolloStore
import com.apollographql.apollo.cache.normalized.CacheKey
import com.apollographql.apollo.cache.normalized.CacheKeyResolver
import com.apollographql.apollo.cache.normalized.NormalizedCache
import com.apollographql.apollo.cache.normalized.Record
import java.util.UUID

/**
 * An alternative to RealApolloStore for when a no-operation cache is needed.
 */
class NoOpApolloStore : ApolloStore, ReadableStore, WriteableStore {
  override fun merge(recordCollection: Collection<Record>, cacheHeaders: CacheHeaders): Set<String> {
    return emptySet()
  }

  override fun merge(record: Record, cacheHeaders: CacheHeaders): Set<String> {
    return emptySet()
  }

  override fun stream(key: String, cacheHeaders: CacheHeaders): JsonReader? {
    return null
  }

  override fun read(key: String, cacheHeaders: CacheHeaders): Record? {
    return null
  }

  override fun read(keys: Collection<String>, cacheHeaders: CacheHeaders): Collection<Record> {
    return emptySet()
  }

  override fun subscribe(subscriber: ApolloStore.RecordChangeSubscriber) {}
  override fun unsubscribe(subscriber: ApolloStore.RecordChangeSubscriber) {}
  override fun publish(keys: Set<String>) {}
  override fun clearAll(): Boolean {
    return false
  }

  override fun remove(cacheKey: CacheKey, cascade: Boolean): Boolean {
    return false
  }

  override fun remove(cacheKeys: List<CacheKey>, cascade: Boolean): Int {
    return 0
  }

  override fun normalizedCache(): NormalizedCache {
    error("Cannot get normalizedCache: no cache configured")
  }

  override fun cacheKeyResolver(): CacheKeyResolver {
    return CacheKeyResolver.DEFAULT
  }

  override fun <D : Operation.Data> readOperation(
      operation: Operation<D>,
      cacheHeaders: CacheHeaders
  ): D? {
    // This will be seen as a cache MISS and the request will go to the network.
    return null
  }


  override fun <D : Fragment.Data> readFragment(
      fragment: Fragment<D>,
      cacheKey: CacheKey,
      cacheHeaders: CacheHeaders,
  ): D? {
    return null
  }

  override fun <D : Operation.Data> writeOperation(
      operation: Operation<D>,
      operationData: D,
      cacheHeaders: CacheHeaders,
      publish: Boolean
  ): Set<String> {
    return emptySet()
  }

  override fun <D : Fragment.Data> writeFragment(
      fragment: Fragment<D>,
      cacheKey: CacheKey,
      fragmentData: D,
      cacheHeaders: CacheHeaders,
      publish: Boolean
  ): Set<String> {
    return emptySet()
  }


  override fun <D : Operation.Data> writeOptimisticUpdates(
      operation: Operation<D>,
      operationData: D,
      mutationId: UUID,
      publish: Boolean
  ): Set<String> {
    return emptySet()
  }

  override fun rollbackOptimisticUpdates(
      mutationId: UUID,
      publish: Boolean
  ): Set<String> {
    return emptySet()
  }

  override fun <D : Operation.Data> writeOperationWithRecords(operation: Operation<D>, operationData: D, cacheHeaders: CacheHeaders, publish: Boolean): Pair<Set<Record>, Set<String>> {
    return emptySet<Record>() to emptySet()
  }
}
