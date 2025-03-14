/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.retail.v2.model;

/**
 * Request message for SearchService.Search method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2SearchRequest extends com.google.api.client.json.GenericJson {

  /**
   * Boost specification to boost certain products. See more details at this [user
   * guide](https://cloud.google.com/retail/docs/boosting). Notice that if both
   * ServingConfig.boost_control_ids and [SearchRequest.boost_spec] are set, the boost conditions
   * from both places are evaluated. If a search request matches multiple boost conditions, the
   * final boost score is equal to the sum of the boost scores from all matched boost conditions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2SearchRequestBoostSpec boostSpec;

  /**
   * The branch resource name, such as
   * `projects/locations/global/catalogs/default_catalog/branches/0`. Use "default_branch" as the
   * branch ID or leave this field empty, to search products under the default branch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String branch;

  /**
   * The default filter that is applied when a user performs a search without checking any filters
   * on the search page. The filter applied to every search request when quality improvement such as
   * query expansion is needed. For example, if a query does not have enough results, an expanded
   * query with SearchRequest.canonical_filter will be returned as a supplement of the original
   * query. This field is strongly recommended to achieve high search quality. See
   * SearchRequest.filter for more details about filter syntax.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String canonicalFilter;

  /**
   * Deprecated. Refer to https://cloud.google.com/retail/docs/configs#dynamic to enable dynamic
   * facets. Do not set this field. The specification for dynamically generated facets. Notice that
   * only textual facets can be dynamically generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2SearchRequestDynamicFacetSpec dynamicFacetSpec;

  /**
   * Facet specifications for faceted search. If empty, no facets are returned. A maximum of 100
   * values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2SearchRequestFacetSpec> facetSpecs;

  /**
   * The filter syntax consists of an expression language for constructing a predicate from one or
   * more fields of the products being filtered. Filter expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#filter). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * The labels applied to a resource must meet the following requirements: * Each resource can have
   * multiple labels, up to a maximum of 64. * Each label must be a key-value pair. * Keys have a
   * minimum length of 1 character and a maximum length of 63 characters, and cannot be empty.
   * Values can be empty, and have a maximum length of 63 characters. * Keys and values can contain
   * only lowercase letters, numeric characters, underscores, and dashes. All characters must use
   * UTF-8 encoding, and international characters are allowed. * The key portion of a label must be
   * unique. However, you can use the same key with multiple resources. * Keys must start with a
   * lowercase letter or international character. See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * A 0-indexed integer that specifies the current offset (that is, starting result location,
   * amongst the Products deemed by the API as relevant) in search results. This field is only
   * considered if page_token is unset. If this field is negative, an INVALID_ARGUMENT is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer offset;

  /**
   * The order in which products are returned. Products can be ordered by a field in an Product
   * object. Leave it unset if ordered by relevance. OrderBy expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#order). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderBy;

  /**
   * The categories associated with a category page. Required for category navigation queries to
   * achieve good search quality. The format should be the same as UserEvent.page_categories; To
   * represent full path of category, use '>' sign to separate different hierarchies. If '>' is part
   * of the category name, please replace it with other character(s). Category pages include special
   * pages such as sales or promotions. For instance, a special sale page may have the category
   * hierarchy: "pageCategories" : ["Sales > 2017 Black Friday Deals"].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> pageCategories;

  /**
   * Maximum number of Products to return. If unspecified, defaults to a reasonable value. The
   * maximum allowed value is 120. Values above 120 will be coerced to 120. If this field is
   * negative, an INVALID_ARGUMENT is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * A page token SearchResponse.next_page_token, received from a previous SearchService.Search
   * call. Provide this to retrieve the subsequent page. When paginating, all other parameters
   * provided to SearchService.Search must match the call that provided the page token. Otherwise,
   * an INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * The specification for personalization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2SearchRequestPersonalizationSpec personalizationSpec;

  /**
   * Raw search query. If this field is empty, the request is considered a category browsing request
   * and returned results are based on filter and page_categories.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The query expansion specification that specifies the conditions under which query expansion
   * will occur. See more details at this [user guide](https://cloud.google.com/retail/docs/result-
   * size#query_expansion).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2SearchRequestQueryExpansionSpec queryExpansionSpec;

  /**
   * The search mode of the search request. If not specified, a single search request triggers both
   * product search and faceted search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchMode;

  /**
   * User information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2UserInfo userInfo;

  /**
   * The keys to fetch and rollup the matching variant Products attributes, FulfillmentInfo or
   * LocalInventorys attributes. The attributes from all the matching variant Products or
   * LocalInventorys are merged and de-duplicated. Notice that rollup attributes will lead to extra
   * query latency. Maximum number of keys is 30. For FulfillmentInfo, a fulfillment type and a
   * fulfillment ID must be provided in the format of "fulfillmentType.fulfillmentId". E.g., in
   * "pickupInStore.store123", "pickupInStore" is fulfillment type and "store123" is the store ID.
   * Supported keys are: * colorFamilies * price * originalPrice * discount * variantId *
   * inventory(place_id,price) * inventory(place_id,original_price) *
   * inventory(place_id,attributes.key), where key is any key in the Product.inventories.attributes
   * map. * attributes.key, where key is any key in the Product.attributes map. * pickupInStore.id,
   * where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "pickup-in-store". *
   * shipToStore.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "ship-to-
   * store". * sameDayDelivery.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "same-day-delivery". * nextDayDelivery.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "next-day-delivery". *
   * customFulfillment1.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-1". * customFulfillment2.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "custom-type-2". * customFulfillment3.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-3". * customFulfillment4.id,
   * where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-4". *
   * customFulfillment5.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-5". If this field is set to an invalid value other than these, an INVALID_ARGUMENT
   * error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> variantRollupKeys;

  /**
   * Required. A unique identifier for tracking visitors. For example, this could be implemented
   * with an HTTP cookie, which should be able to uniquely identify a visitor on a single device.
   * This unique identifier should not change if the visitor logs in or out of the website. This
   * should be the same identifier as UserEvent.visitor_id. The field must be a UTF-8 encoded string
   * with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visitorId;

  /**
   * Boost specification to boost certain products. See more details at this [user
   * guide](https://cloud.google.com/retail/docs/boosting). Notice that if both
   * ServingConfig.boost_control_ids and [SearchRequest.boost_spec] are set, the boost conditions
   * from both places are evaluated. If a search request matches multiple boost conditions, the
   * final boost score is equal to the sum of the boost scores from all matched boost conditions.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequestBoostSpec getBoostSpec() {
    return boostSpec;
  }

  /**
   * Boost specification to boost certain products. See more details at this [user
   * guide](https://cloud.google.com/retail/docs/boosting). Notice that if both
   * ServingConfig.boost_control_ids and [SearchRequest.boost_spec] are set, the boost conditions
   * from both places are evaluated. If a search request matches multiple boost conditions, the
   * final boost score is equal to the sum of the boost scores from all matched boost conditions.
   * @param boostSpec boostSpec or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setBoostSpec(GoogleCloudRetailV2SearchRequestBoostSpec boostSpec) {
    this.boostSpec = boostSpec;
    return this;
  }

  /**
   * The branch resource name, such as
   * `projects/locations/global/catalogs/default_catalog/branches/0`. Use "default_branch" as the
   * branch ID or leave this field empty, to search products under the default branch.
   * @return value or {@code null} for none
   */
  public java.lang.String getBranch() {
    return branch;
  }

  /**
   * The branch resource name, such as
   * `projects/locations/global/catalogs/default_catalog/branches/0`. Use "default_branch" as the
   * branch ID or leave this field empty, to search products under the default branch.
   * @param branch branch or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setBranch(java.lang.String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * The default filter that is applied when a user performs a search without checking any filters
   * on the search page. The filter applied to every search request when quality improvement such as
   * query expansion is needed. For example, if a query does not have enough results, an expanded
   * query with SearchRequest.canonical_filter will be returned as a supplement of the original
   * query. This field is strongly recommended to achieve high search quality. See
   * SearchRequest.filter for more details about filter syntax.
   * @return value or {@code null} for none
   */
  public java.lang.String getCanonicalFilter() {
    return canonicalFilter;
  }

  /**
   * The default filter that is applied when a user performs a search without checking any filters
   * on the search page. The filter applied to every search request when quality improvement such as
   * query expansion is needed. For example, if a query does not have enough results, an expanded
   * query with SearchRequest.canonical_filter will be returned as a supplement of the original
   * query. This field is strongly recommended to achieve high search quality. See
   * SearchRequest.filter for more details about filter syntax.
   * @param canonicalFilter canonicalFilter or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setCanonicalFilter(java.lang.String canonicalFilter) {
    this.canonicalFilter = canonicalFilter;
    return this;
  }

  /**
   * Deprecated. Refer to https://cloud.google.com/retail/docs/configs#dynamic to enable dynamic
   * facets. Do not set this field. The specification for dynamically generated facets. Notice that
   * only textual facets can be dynamically generated.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequestDynamicFacetSpec getDynamicFacetSpec() {
    return dynamicFacetSpec;
  }

  /**
   * Deprecated. Refer to https://cloud.google.com/retail/docs/configs#dynamic to enable dynamic
   * facets. Do not set this field. The specification for dynamically generated facets. Notice that
   * only textual facets can be dynamically generated.
   * @param dynamicFacetSpec dynamicFacetSpec or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setDynamicFacetSpec(GoogleCloudRetailV2SearchRequestDynamicFacetSpec dynamicFacetSpec) {
    this.dynamicFacetSpec = dynamicFacetSpec;
    return this;
  }

  /**
   * Facet specifications for faceted search. If empty, no facets are returned. A maximum of 100
   * values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2SearchRequestFacetSpec> getFacetSpecs() {
    return facetSpecs;
  }

  /**
   * Facet specifications for faceted search. If empty, no facets are returned. A maximum of 100
   * values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
   * @param facetSpecs facetSpecs or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setFacetSpecs(java.util.List<GoogleCloudRetailV2SearchRequestFacetSpec> facetSpecs) {
    this.facetSpecs = facetSpecs;
    return this;
  }

  /**
   * The filter syntax consists of an expression language for constructing a predicate from one or
   * more fields of the products being filtered. Filter expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#filter). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * The filter syntax consists of an expression language for constructing a predicate from one or
   * more fields of the products being filtered. Filter expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#filter). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * @param filter filter or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * The labels applied to a resource must meet the following requirements: * Each resource can have
   * multiple labels, up to a maximum of 64. * Each label must be a key-value pair. * Keys have a
   * minimum length of 1 character and a maximum length of 63 characters, and cannot be empty.
   * Values can be empty, and have a maximum length of 63 characters. * Keys and values can contain
   * only lowercase letters, numeric characters, underscores, and dashes. All characters must use
   * UTF-8 encoding, and international characters are allowed. * The key portion of a label must be
   * unique. However, you can use the same key with multiple resources. * Keys must start with a
   * lowercase letter or international character. See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels applied to a resource must meet the following requirements: * Each resource can have
   * multiple labels, up to a maximum of 64. * Each label must be a key-value pair. * Keys have a
   * minimum length of 1 character and a maximum length of 63 characters, and cannot be empty.
   * Values can be empty, and have a maximum length of 63 characters. * Keys and values can contain
   * only lowercase letters, numeric characters, underscores, and dashes. All characters must use
   * UTF-8 encoding, and international characters are allowed. * The key portion of a label must be
   * unique. However, you can use the same key with multiple resources. * Keys must start with a
   * lowercase letter or international character. See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * A 0-indexed integer that specifies the current offset (that is, starting result location,
   * amongst the Products deemed by the API as relevant) in search results. This field is only
   * considered if page_token is unset. If this field is negative, an INVALID_ARGUMENT is returned.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOffset() {
    return offset;
  }

  /**
   * A 0-indexed integer that specifies the current offset (that is, starting result location,
   * amongst the Products deemed by the API as relevant) in search results. This field is only
   * considered if page_token is unset. If this field is negative, an INVALID_ARGUMENT is returned.
   * @param offset offset or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setOffset(java.lang.Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The order in which products are returned. Products can be ordered by a field in an Product
   * object. Leave it unset if ordered by relevance. OrderBy expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#order). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderBy() {
    return orderBy;
  }

  /**
   * The order in which products are returned. Products can be ordered by a field in an Product
   * object. Leave it unset if ordered by relevance. OrderBy expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#order). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * @param orderBy orderBy or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setOrderBy(java.lang.String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * The categories associated with a category page. Required for category navigation queries to
   * achieve good search quality. The format should be the same as UserEvent.page_categories; To
   * represent full path of category, use '>' sign to separate different hierarchies. If '>' is part
   * of the category name, please replace it with other character(s). Category pages include special
   * pages such as sales or promotions. For instance, a special sale page may have the category
   * hierarchy: "pageCategories" : ["Sales > 2017 Black Friday Deals"].
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPageCategories() {
    return pageCategories;
  }

  /**
   * The categories associated with a category page. Required for category navigation queries to
   * achieve good search quality. The format should be the same as UserEvent.page_categories; To
   * represent full path of category, use '>' sign to separate different hierarchies. If '>' is part
   * of the category name, please replace it with other character(s). Category pages include special
   * pages such as sales or promotions. For instance, a special sale page may have the category
   * hierarchy: "pageCategories" : ["Sales > 2017 Black Friday Deals"].
   * @param pageCategories pageCategories or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setPageCategories(java.util.List<java.lang.String> pageCategories) {
    this.pageCategories = pageCategories;
    return this;
  }

  /**
   * Maximum number of Products to return. If unspecified, defaults to a reasonable value. The
   * maximum allowed value is 120. Values above 120 will be coerced to 120. If this field is
   * negative, an INVALID_ARGUMENT is returned.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Maximum number of Products to return. If unspecified, defaults to a reasonable value. The
   * maximum allowed value is 120. Values above 120 will be coerced to 120. If this field is
   * negative, an INVALID_ARGUMENT is returned.
   * @param pageSize pageSize or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * A page token SearchResponse.next_page_token, received from a previous SearchService.Search
   * call. Provide this to retrieve the subsequent page. When paginating, all other parameters
   * provided to SearchService.Search must match the call that provided the page token. Otherwise,
   * an INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * A page token SearchResponse.next_page_token, received from a previous SearchService.Search
   * call. Provide this to retrieve the subsequent page. When paginating, all other parameters
   * provided to SearchService.Search must match the call that provided the page token. Otherwise,
   * an INVALID_ARGUMENT error is returned.
   * @param pageToken pageToken or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * The specification for personalization.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequestPersonalizationSpec getPersonalizationSpec() {
    return personalizationSpec;
  }

  /**
   * The specification for personalization.
   * @param personalizationSpec personalizationSpec or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setPersonalizationSpec(GoogleCloudRetailV2SearchRequestPersonalizationSpec personalizationSpec) {
    this.personalizationSpec = personalizationSpec;
    return this;
  }

  /**
   * Raw search query. If this field is empty, the request is considered a category browsing request
   * and returned results are based on filter and page_categories.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Raw search query. If this field is empty, the request is considered a category browsing request
   * and returned results are based on filter and page_categories.
   * @param query query or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * The query expansion specification that specifies the conditions under which query expansion
   * will occur. See more details at this [user guide](https://cloud.google.com/retail/docs/result-
   * size#query_expansion).
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequestQueryExpansionSpec getQueryExpansionSpec() {
    return queryExpansionSpec;
  }

  /**
   * The query expansion specification that specifies the conditions under which query expansion
   * will occur. See more details at this [user guide](https://cloud.google.com/retail/docs/result-
   * size#query_expansion).
   * @param queryExpansionSpec queryExpansionSpec or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setQueryExpansionSpec(GoogleCloudRetailV2SearchRequestQueryExpansionSpec queryExpansionSpec) {
    this.queryExpansionSpec = queryExpansionSpec;
    return this;
  }

  /**
   * The search mode of the search request. If not specified, a single search request triggers both
   * product search and faceted search.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchMode() {
    return searchMode;
  }

  /**
   * The search mode of the search request. If not specified, a single search request triggers both
   * product search and faceted search.
   * @param searchMode searchMode or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setSearchMode(java.lang.String searchMode) {
    this.searchMode = searchMode;
    return this;
  }

  /**
   * User information.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2UserInfo getUserInfo() {
    return userInfo;
  }

  /**
   * User information.
   * @param userInfo userInfo or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setUserInfo(GoogleCloudRetailV2UserInfo userInfo) {
    this.userInfo = userInfo;
    return this;
  }

  /**
   * The keys to fetch and rollup the matching variant Products attributes, FulfillmentInfo or
   * LocalInventorys attributes. The attributes from all the matching variant Products or
   * LocalInventorys are merged and de-duplicated. Notice that rollup attributes will lead to extra
   * query latency. Maximum number of keys is 30. For FulfillmentInfo, a fulfillment type and a
   * fulfillment ID must be provided in the format of "fulfillmentType.fulfillmentId". E.g., in
   * "pickupInStore.store123", "pickupInStore" is fulfillment type and "store123" is the store ID.
   * Supported keys are: * colorFamilies * price * originalPrice * discount * variantId *
   * inventory(place_id,price) * inventory(place_id,original_price) *
   * inventory(place_id,attributes.key), where key is any key in the Product.inventories.attributes
   * map. * attributes.key, where key is any key in the Product.attributes map. * pickupInStore.id,
   * where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "pickup-in-store". *
   * shipToStore.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "ship-to-
   * store". * sameDayDelivery.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "same-day-delivery". * nextDayDelivery.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "next-day-delivery". *
   * customFulfillment1.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-1". * customFulfillment2.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "custom-type-2". * customFulfillment3.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-3". * customFulfillment4.id,
   * where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-4". *
   * customFulfillment5.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-5". If this field is set to an invalid value other than these, an INVALID_ARGUMENT
   * error is returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVariantRollupKeys() {
    return variantRollupKeys;
  }

  /**
   * The keys to fetch and rollup the matching variant Products attributes, FulfillmentInfo or
   * LocalInventorys attributes. The attributes from all the matching variant Products or
   * LocalInventorys are merged and de-duplicated. Notice that rollup attributes will lead to extra
   * query latency. Maximum number of keys is 30. For FulfillmentInfo, a fulfillment type and a
   * fulfillment ID must be provided in the format of "fulfillmentType.fulfillmentId". E.g., in
   * "pickupInStore.store123", "pickupInStore" is fulfillment type and "store123" is the store ID.
   * Supported keys are: * colorFamilies * price * originalPrice * discount * variantId *
   * inventory(place_id,price) * inventory(place_id,original_price) *
   * inventory(place_id,attributes.key), where key is any key in the Product.inventories.attributes
   * map. * attributes.key, where key is any key in the Product.attributes map. * pickupInStore.id,
   * where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "pickup-in-store". *
   * shipToStore.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "ship-to-
   * store". * sameDayDelivery.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "same-day-delivery". * nextDayDelivery.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "next-day-delivery". *
   * customFulfillment1.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-1". * customFulfillment2.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "custom-type-2". * customFulfillment3.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-3". * customFulfillment4.id,
   * where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-4". *
   * customFulfillment5.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-5". If this field is set to an invalid value other than these, an INVALID_ARGUMENT
   * error is returned.
   * @param variantRollupKeys variantRollupKeys or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setVariantRollupKeys(java.util.List<java.lang.String> variantRollupKeys) {
    this.variantRollupKeys = variantRollupKeys;
    return this;
  }

  /**
   * Required. A unique identifier for tracking visitors. For example, this could be implemented
   * with an HTTP cookie, which should be able to uniquely identify a visitor on a single device.
   * This unique identifier should not change if the visitor logs in or out of the website. This
   * should be the same identifier as UserEvent.visitor_id. The field must be a UTF-8 encoded string
   * with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getVisitorId() {
    return visitorId;
  }

  /**
   * Required. A unique identifier for tracking visitors. For example, this could be implemented
   * with an HTTP cookie, which should be able to uniquely identify a visitor on a single device.
   * This unique identifier should not change if the visitor logs in or out of the website. This
   * should be the same identifier as UserEvent.visitor_id. The field must be a UTF-8 encoded string
   * with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * @param visitorId visitorId or {@code null} for none
   */
  public GoogleCloudRetailV2SearchRequest setVisitorId(java.lang.String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

  @Override
  public GoogleCloudRetailV2SearchRequest set(String fieldName, Object value) {
    return (GoogleCloudRetailV2SearchRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2SearchRequest clone() {
    return (GoogleCloudRetailV2SearchRequest) super.clone();
  }

}
