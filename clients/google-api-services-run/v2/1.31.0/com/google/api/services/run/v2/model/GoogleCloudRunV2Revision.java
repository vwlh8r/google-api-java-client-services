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

package com.google.api.services.run.v2.model;

/**
 * A Revision is an immutable snapshot of code and configuration. A Revision references a container
 * image. Revisions are only created by updates to its parent Service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunV2Revision extends com.google.api.client.json.GenericJson {

  /**
   * KRM-style annotations for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Output only. The Condition of this Revision, containing its readiness status, and detailed
   * error information in case it did not reach a serving state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2Condition> conditions;

  static {
    // hack to force ProGuard to consider GoogleCloudRunV2Condition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRunV2Condition.class);
  }

  /**
   * Indicates whether Confidential Cloud Run is enabled in this Revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean confidential;

  /**
   * Sets the maximum number of requests that each serving instance can receive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer containerConcurrency;

  /**
   * Holds the single container that defines the unit of execution for this Revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2Container> containers;

  static {
    // hack to force ProGuard to consider GoogleCloudRunV2Container used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRunV2Container.class);
  }

  /**
   * Output only. The creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. For a deleted resource, the deletion time. It is only populated as a response to a
   * Delete request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image.
   * For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptionKey;

  /**
   * Output only. A system-generated fingerprint for this version of the resource. May be used to
   * detect modification conflict during updates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The execution environment being used to host this Revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionEnvironment;

  /**
   * Output only. For a deleted resource, the time after which it will be permamently deleted. It is
   * only populated as a response to a Delete request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Output only. A number that monotonically increases every time the user modifies the desired
   * state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long generation;

  /**
   * KRM-style labels for the resource. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit https://cloud.google.com/resource-
   * manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels
   * Cloud Run will populate some labels with 'run.googleapis.com' or 'serving.knative.dev'
   * namespaces. Those labels are read-only, and user changes will not be preserved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Set the launch stage to a preview stage on write to allow use of preview features in that
   * stage. On read, describes whether the resource uses preview features. Launch Stages are defined
   * at [Google Cloud Platform Launch Stages](https://cloud.google.com/terms/launch-stages).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String launchStage;

  /**
   * Output only. The Google Console URI to obtain logs for the Revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logUri;

  /**
   * Output only. The unique name of this Revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The generation of this Revision currently serving traffic. See comments in
   * `reconciling` for additional information on reconciliation process in Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long observedGeneration;

  /**
   * Output only. Indicates whether the resource's reconciliation is still in progress. See comments
   * in `Service.reconciling` for additional information on reconciliation process in Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reconciling;

  /**
   * Scaling settings for this revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunV2RevisionScaling scaling;

  /**
   * Output only. The name of the parent service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Max allowed time for an instance to respond to a request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeout;

  /**
   * Output only. Server assigned unique identifier for the Revision. The value is a UUID4 string
   * and guaranteed to remain unchanged until the resource is deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The last-modified time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * A list of Volumes to make available to containers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2Volume> volumes;

  /**
   * VPC Access configuration for this Revision. For more information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunV2VpcAccess vpcAccess;

  /**
   * KRM-style annotations for the resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * KRM-style annotations for the resource.
   * @param annotations annotations or {@code null} for none
   */
  public GoogleCloudRunV2Revision setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Output only. The Condition of this Revision, containing its readiness status, and detailed
   * error information in case it did not reach a serving state.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2Condition> getConditions() {
    return conditions;
  }

  /**
   * Output only. The Condition of this Revision, containing its readiness status, and detailed
   * error information in case it did not reach a serving state.
   * @param conditions conditions or {@code null} for none
   */
  public GoogleCloudRunV2Revision setConditions(java.util.List<GoogleCloudRunV2Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Indicates whether Confidential Cloud Run is enabled in this Revision.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConfidential() {
    return confidential;
  }

  /**
   * Indicates whether Confidential Cloud Run is enabled in this Revision.
   * @param confidential confidential or {@code null} for none
   */
  public GoogleCloudRunV2Revision setConfidential(java.lang.Boolean confidential) {
    this.confidential = confidential;
    return this;
  }

  /**
   * Sets the maximum number of requests that each serving instance can receive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getContainerConcurrency() {
    return containerConcurrency;
  }

  /**
   * Sets the maximum number of requests that each serving instance can receive.
   * @param containerConcurrency containerConcurrency or {@code null} for none
   */
  public GoogleCloudRunV2Revision setContainerConcurrency(java.lang.Integer containerConcurrency) {
    this.containerConcurrency = containerConcurrency;
    return this;
  }

  /**
   * Holds the single container that defines the unit of execution for this Revision.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2Container> getContainers() {
    return containers;
  }

  /**
   * Holds the single container that defines the unit of execution for this Revision.
   * @param containers containers or {@code null} for none
   */
  public GoogleCloudRunV2Revision setContainers(java.util.List<GoogleCloudRunV2Container> containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Output only. The creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudRunV2Revision setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. For a deleted resource, the deletion time. It is only populated as a response to a
   * Delete request.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. For a deleted resource, the deletion time. It is only populated as a response to a
   * Delete request.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public GoogleCloudRunV2Revision setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image.
   * For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image.
   * For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
   * @param encryptionKey encryptionKey or {@code null} for none
   */
  public GoogleCloudRunV2Revision setEncryptionKey(java.lang.String encryptionKey) {
    this.encryptionKey = encryptionKey;
    return this;
  }

  /**
   * Output only. A system-generated fingerprint for this version of the resource. May be used to
   * detect modification conflict during updates.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. A system-generated fingerprint for this version of the resource. May be used to
   * detect modification conflict during updates.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudRunV2Revision setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The execution environment being used to host this Revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionEnvironment() {
    return executionEnvironment;
  }

  /**
   * The execution environment being used to host this Revision.
   * @param executionEnvironment executionEnvironment or {@code null} for none
   */
  public GoogleCloudRunV2Revision setExecutionEnvironment(java.lang.String executionEnvironment) {
    this.executionEnvironment = executionEnvironment;
    return this;
  }

  /**
   * Output only. For a deleted resource, the time after which it will be permamently deleted. It is
   * only populated as a response to a Delete request.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. For a deleted resource, the time after which it will be permamently deleted. It is
   * only populated as a response to a Delete request.
   * @param expireTime expireTime or {@code null} for none
   */
  public GoogleCloudRunV2Revision setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Output only. A number that monotonically increases every time the user modifies the desired
   * state.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGeneration() {
    return generation;
  }

  /**
   * Output only. A number that monotonically increases every time the user modifies the desired
   * state.
   * @param generation generation or {@code null} for none
   */
  public GoogleCloudRunV2Revision setGeneration(java.lang.Long generation) {
    this.generation = generation;
    return this;
  }

  /**
   * KRM-style labels for the resource. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit https://cloud.google.com/resource-
   * manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels
   * Cloud Run will populate some labels with 'run.googleapis.com' or 'serving.knative.dev'
   * namespaces. Those labels are read-only, and user changes will not be preserved.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * KRM-style labels for the resource. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit https://cloud.google.com/resource-
   * manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels
   * Cloud Run will populate some labels with 'run.googleapis.com' or 'serving.knative.dev'
   * namespaces. Those labels are read-only, and user changes will not be preserved.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudRunV2Revision setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Set the launch stage to a preview stage on write to allow use of preview features in that
   * stage. On read, describes whether the resource uses preview features. Launch Stages are defined
   * at [Google Cloud Platform Launch Stages](https://cloud.google.com/terms/launch-stages).
   * @return value or {@code null} for none
   */
  public java.lang.String getLaunchStage() {
    return launchStage;
  }

  /**
   * Set the launch stage to a preview stage on write to allow use of preview features in that
   * stage. On read, describes whether the resource uses preview features. Launch Stages are defined
   * at [Google Cloud Platform Launch Stages](https://cloud.google.com/terms/launch-stages).
   * @param launchStage launchStage or {@code null} for none
   */
  public GoogleCloudRunV2Revision setLaunchStage(java.lang.String launchStage) {
    this.launchStage = launchStage;
    return this;
  }

  /**
   * Output only. The Google Console URI to obtain logs for the Revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogUri() {
    return logUri;
  }

  /**
   * Output only. The Google Console URI to obtain logs for the Revision.
   * @param logUri logUri or {@code null} for none
   */
  public GoogleCloudRunV2Revision setLogUri(java.lang.String logUri) {
    this.logUri = logUri;
    return this;
  }

  /**
   * Output only. The unique name of this Revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The unique name of this Revision.
   * @param name name or {@code null} for none
   */
  public GoogleCloudRunV2Revision setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The generation of this Revision currently serving traffic. See comments in
   * `reconciling` for additional information on reconciliation process in Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObservedGeneration() {
    return observedGeneration;
  }

  /**
   * Output only. The generation of this Revision currently serving traffic. See comments in
   * `reconciling` for additional information on reconciliation process in Cloud Run.
   * @param observedGeneration observedGeneration or {@code null} for none
   */
  public GoogleCloudRunV2Revision setObservedGeneration(java.lang.Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * Output only. Indicates whether the resource's reconciliation is still in progress. See comments
   * in `Service.reconciling` for additional information on reconciliation process in Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReconciling() {
    return reconciling;
  }

  /**
   * Output only. Indicates whether the resource's reconciliation is still in progress. See comments
   * in `Service.reconciling` for additional information on reconciliation process in Cloud Run.
   * @param reconciling reconciling or {@code null} for none
   */
  public GoogleCloudRunV2Revision setReconciling(java.lang.Boolean reconciling) {
    this.reconciling = reconciling;
    return this;
  }

  /**
   * Scaling settings for this revision.
   * @return value or {@code null} for none
   */
  public GoogleCloudRunV2RevisionScaling getScaling() {
    return scaling;
  }

  /**
   * Scaling settings for this revision.
   * @param scaling scaling or {@code null} for none
   */
  public GoogleCloudRunV2Revision setScaling(GoogleCloudRunV2RevisionScaling scaling) {
    this.scaling = scaling;
    return this;
  }

  /**
   * Output only. The name of the parent service.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * Output only. The name of the parent service.
   * @param service service or {@code null} for none
   */
  public GoogleCloudRunV2Revision setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public GoogleCloudRunV2Revision setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Max allowed time for an instance to respond to a request.
   * @return value or {@code null} for none
   */
  public String getTimeout() {
    return timeout;
  }

  /**
   * Max allowed time for an instance to respond to a request.
   * @param timeout timeout or {@code null} for none
   */
  public GoogleCloudRunV2Revision setTimeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Output only. Server assigned unique identifier for the Revision. The value is a UUID4 string
   * and guaranteed to remain unchanged until the resource is deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. Server assigned unique identifier for the Revision. The value is a UUID4 string
   * and guaranteed to remain unchanged until the resource is deleted.
   * @param uid uid or {@code null} for none
   */
  public GoogleCloudRunV2Revision setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. The last-modified time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last-modified time.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudRunV2Revision setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * A list of Volumes to make available to containers.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2Volume> getVolumes() {
    return volumes;
  }

  /**
   * A list of Volumes to make available to containers.
   * @param volumes volumes or {@code null} for none
   */
  public GoogleCloudRunV2Revision setVolumes(java.util.List<GoogleCloudRunV2Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  /**
   * VPC Access configuration for this Revision. For more information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * @return value or {@code null} for none
   */
  public GoogleCloudRunV2VpcAccess getVpcAccess() {
    return vpcAccess;
  }

  /**
   * VPC Access configuration for this Revision. For more information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * @param vpcAccess vpcAccess or {@code null} for none
   */
  public GoogleCloudRunV2Revision setVpcAccess(GoogleCloudRunV2VpcAccess vpcAccess) {
    this.vpcAccess = vpcAccess;
    return this;
  }

  @Override
  public GoogleCloudRunV2Revision set(String fieldName, Object value) {
    return (GoogleCloudRunV2Revision) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunV2Revision clone() {
    return (GoogleCloudRunV2Revision) super.clone();
  }

}
