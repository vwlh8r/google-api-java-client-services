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

package com.google.api.services.playdeveloperreporting.v1beta1.model;

/**
 * Request message for QueryCrashRateMetricSet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetRequest extends com.google.api.client.json.GenericJson {

  /**
   * Dimensions to slice the metrics by. **Supported dimensions:** * `apiLevel` (string): the API
   * level of Android that was running on the user's device. * `versionCode` (int64): version of the
   * app that was running on the user's device. * `deviceModel` (string): unique identifier of the
   * user's device model. * `deviceType` (string): the type (also known as form factor) of the
   * user's device. * `countryCode` (string): the country or region of the user's device based on
   * their IP address, represented as a 2-letter ISO-3166 code (e.g. US for the United States).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dimensions;

  /**
   * Filters to apply to data. The filtering expression follows
   * [AIP-160](https://google.aip.dev/160) standard and supports filtering by equality of all
   * breakdown dimensions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Metrics to aggregate. **Supported metrics:** * `crashRate` (`google.type.Decimal`): Percentage
   * of distinct users in the aggregation period that experienced at least one crash. If your app
   * exhibits a crash rate equal to or higher than the threshold, it's in the bottom 25% of the top
   * 1,000 apps on Google Play (by number of installs). * `crashRate7dUserWeighted`
   * (`google.type.Decimal`): Rolling average value of `crashRate` in the last 7 days. The daily
   * values are weighted by the count of distinct users for the day. * `crashRate28dUserWeighted`
   * (`google.type.Decimal`): Rolling average value of `crashRate` in the last 28 days. The daily
   * values are weighted by the count of distinct users for the day. * `distinctUsers`
   * (`google.type.Decimal`): Count of distinct users in the aggregation period that were used as
   * normalization value for the `crashRate` metric. A user is counted in this metric if they used
   * the app in the foreground during the aggregation period. Care must be taken not to aggregate
   * this count further, as it may result in users being counted multiple times.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> metrics;

  /**
   * Maximum size of the returned data. If unspecified, at most 1000 rows will be returned. The
   * maximum value is 100,000; values above 100,000 will be coerced to 100,000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * A page token, received from a previous call. Provide this to retrieve the subsequent page. When
   * paginating, all other parameters provided to the request must match the call that provided the
   * page token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Specification of the timeline aggregation parameters. **Supported aggregation periods:** *
   * DAILY: metrics are aggregated in calendar date intervals. Due to historical constraints, the
   * default and only supported timezone is `America/Los_Angeles`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePlayDeveloperReportingV1beta1TimelineSpec timelineSpec;

  /**
   * Dimensions to slice the metrics by. **Supported dimensions:** * `apiLevel` (string): the API
   * level of Android that was running on the user's device. * `versionCode` (int64): version of the
   * app that was running on the user's device. * `deviceModel` (string): unique identifier of the
   * user's device model. * `deviceType` (string): the type (also known as form factor) of the
   * user's device. * `countryCode` (string): the country or region of the user's device based on
   * their IP address, represented as a 2-letter ISO-3166 code (e.g. US for the United States).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDimensions() {
    return dimensions;
  }

  /**
   * Dimensions to slice the metrics by. **Supported dimensions:** * `apiLevel` (string): the API
   * level of Android that was running on the user's device. * `versionCode` (int64): version of the
   * app that was running on the user's device. * `deviceModel` (string): unique identifier of the
   * user's device model. * `deviceType` (string): the type (also known as form factor) of the
   * user's device. * `countryCode` (string): the country or region of the user's device based on
   * their IP address, represented as a 2-letter ISO-3166 code (e.g. US for the United States).
   * @param dimensions dimensions or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetRequest setDimensions(java.util.List<java.lang.String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * Filters to apply to data. The filtering expression follows
   * [AIP-160](https://google.aip.dev/160) standard and supports filtering by equality of all
   * breakdown dimensions.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Filters to apply to data. The filtering expression follows
   * [AIP-160](https://google.aip.dev/160) standard and supports filtering by equality of all
   * breakdown dimensions.
   * @param filter filter or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Metrics to aggregate. **Supported metrics:** * `crashRate` (`google.type.Decimal`): Percentage
   * of distinct users in the aggregation period that experienced at least one crash. If your app
   * exhibits a crash rate equal to or higher than the threshold, it's in the bottom 25% of the top
   * 1,000 apps on Google Play (by number of installs). * `crashRate7dUserWeighted`
   * (`google.type.Decimal`): Rolling average value of `crashRate` in the last 7 days. The daily
   * values are weighted by the count of distinct users for the day. * `crashRate28dUserWeighted`
   * (`google.type.Decimal`): Rolling average value of `crashRate` in the last 28 days. The daily
   * values are weighted by the count of distinct users for the day. * `distinctUsers`
   * (`google.type.Decimal`): Count of distinct users in the aggregation period that were used as
   * normalization value for the `crashRate` metric. A user is counted in this metric if they used
   * the app in the foreground during the aggregation period. Care must be taken not to aggregate
   * this count further, as it may result in users being counted multiple times.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMetrics() {
    return metrics;
  }

  /**
   * Metrics to aggregate. **Supported metrics:** * `crashRate` (`google.type.Decimal`): Percentage
   * of distinct users in the aggregation period that experienced at least one crash. If your app
   * exhibits a crash rate equal to or higher than the threshold, it's in the bottom 25% of the top
   * 1,000 apps on Google Play (by number of installs). * `crashRate7dUserWeighted`
   * (`google.type.Decimal`): Rolling average value of `crashRate` in the last 7 days. The daily
   * values are weighted by the count of distinct users for the day. * `crashRate28dUserWeighted`
   * (`google.type.Decimal`): Rolling average value of `crashRate` in the last 28 days. The daily
   * values are weighted by the count of distinct users for the day. * `distinctUsers`
   * (`google.type.Decimal`): Count of distinct users in the aggregation period that were used as
   * normalization value for the `crashRate` metric. A user is counted in this metric if they used
   * the app in the foreground during the aggregation period. Care must be taken not to aggregate
   * this count further, as it may result in users being counted multiple times.
   * @param metrics metrics or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetRequest setMetrics(java.util.List<java.lang.String> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Maximum size of the returned data. If unspecified, at most 1000 rows will be returned. The
   * maximum value is 100,000; values above 100,000 will be coerced to 100,000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Maximum size of the returned data. If unspecified, at most 1000 rows will be returned. The
   * maximum value is 100,000; values above 100,000 will be coerced to 100,000.
   * @param pageSize pageSize or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * A page token, received from a previous call. Provide this to retrieve the subsequent page. When
   * paginating, all other parameters provided to the request must match the call that provided the
   * page token.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * A page token, received from a previous call. Provide this to retrieve the subsequent page. When
   * paginating, all other parameters provided to the request must match the call that provided the
   * page token.
   * @param pageToken pageToken or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Specification of the timeline aggregation parameters. **Supported aggregation periods:** *
   * DAILY: metrics are aggregated in calendar date intervals. Due to historical constraints, the
   * default and only supported timezone is `America/Los_Angeles`.
   * @return value or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1beta1TimelineSpec getTimelineSpec() {
    return timelineSpec;
  }

  /**
   * Specification of the timeline aggregation parameters. **Supported aggregation periods:** *
   * DAILY: metrics are aggregated in calendar date intervals. Due to historical constraints, the
   * default and only supported timezone is `America/Los_Angeles`.
   * @param timelineSpec timelineSpec or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetRequest setTimelineSpec(GooglePlayDeveloperReportingV1beta1TimelineSpec timelineSpec) {
    this.timelineSpec = timelineSpec;
    return this;
  }

  @Override
  public GooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetRequest set(String fieldName, Object value) {
    return (GooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetRequest) super.set(fieldName, value);
  }

  @Override
  public GooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetRequest clone() {
    return (GooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetRequest) super.clone();
  }

}
