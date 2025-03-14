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

package com.google.api.services.compute.model;

/**
 * Sets the scheduling options for an Instance. NextID: 21
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Scheduling extends com.google.api.client.json.GenericJson {

  /**
   * Specifies whether the instance should be automatically restarted if it is terminated by Compute
   * Engine (not terminated by a user). You can only set the automatic restart option for standard
   * instances. Preemptible instances cannot be automatically restarted. By default, this is set to
   * true so an instance is automatically restarted if it is terminated by Compute Engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean automaticRestart;

  /**
   * Specify the time in seconds for host error detection, the value must be within the range of
   * [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will
   * be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer hostErrorTimeoutSeconds;

  /**
   * Specifies the termination action for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceTerminationAction;

  /**
   * An opaque location hint used to place the instance close to other resources. This field is for
   * use by internal tools that use the public API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationHint;

  /**
   * Specifies the number of hours after VM instance creation where the VM won't be scheduled for
   * maintenance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maintenanceFreezeDurationHours;

  /**
   * For more information about maintenance intervals, see Setting maintenance intervals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String maintenanceInterval;

  /**
   * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant
   * node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minNodeCpus;

  /**
   * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for
   * more information. Overrides reservationAffinity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SchedulingNodeAffinity> nodeAffinities;

  /**
   * Defines the maintenance behavior for this instance. For standard instances, the default
   * behavior is MIGRATE. For preemptible instances, the default and only possible behavior is
   * TERMINATE. For more information, see Set VM availability policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String onHostMaintenance;

  /**
   * Defines whether the instance is preemptible. This can only be set during instance creation or
   * while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle
   * for more information on the possible instance states.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preemptible;

  /**
   * Specifies the provisioning model of the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provisioningModel;

  /**
   * Specifies whether the instance should be automatically restarted if it is terminated by Compute
   * Engine (not terminated by a user). You can only set the automatic restart option for standard
   * instances. Preemptible instances cannot be automatically restarted. By default, this is set to
   * true so an instance is automatically restarted if it is terminated by Compute Engine.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutomaticRestart() {
    return automaticRestart;
  }

  /**
   * Specifies whether the instance should be automatically restarted if it is terminated by Compute
   * Engine (not terminated by a user). You can only set the automatic restart option for standard
   * instances. Preemptible instances cannot be automatically restarted. By default, this is set to
   * true so an instance is automatically restarted if it is terminated by Compute Engine.
   * @param automaticRestart automaticRestart or {@code null} for none
   */
  public Scheduling setAutomaticRestart(java.lang.Boolean automaticRestart) {
    this.automaticRestart = automaticRestart;
    return this;
  }

  /**
   * Specify the time in seconds for host error detection, the value must be within the range of
   * [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will
   * be used.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHostErrorTimeoutSeconds() {
    return hostErrorTimeoutSeconds;
  }

  /**
   * Specify the time in seconds for host error detection, the value must be within the range of
   * [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will
   * be used.
   * @param hostErrorTimeoutSeconds hostErrorTimeoutSeconds or {@code null} for none
   */
  public Scheduling setHostErrorTimeoutSeconds(java.lang.Integer hostErrorTimeoutSeconds) {
    this.hostErrorTimeoutSeconds = hostErrorTimeoutSeconds;
    return this;
  }

  /**
   * Specifies the termination action for the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceTerminationAction() {
    return instanceTerminationAction;
  }

  /**
   * Specifies the termination action for the instance.
   * @param instanceTerminationAction instanceTerminationAction or {@code null} for none
   */
  public Scheduling setInstanceTerminationAction(java.lang.String instanceTerminationAction) {
    this.instanceTerminationAction = instanceTerminationAction;
    return this;
  }

  /**
   * An opaque location hint used to place the instance close to other resources. This field is for
   * use by internal tools that use the public API.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationHint() {
    return locationHint;
  }

  /**
   * An opaque location hint used to place the instance close to other resources. This field is for
   * use by internal tools that use the public API.
   * @param locationHint locationHint or {@code null} for none
   */
  public Scheduling setLocationHint(java.lang.String locationHint) {
    this.locationHint = locationHint;
    return this;
  }

  /**
   * Specifies the number of hours after VM instance creation where the VM won't be scheduled for
   * maintenance.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaintenanceFreezeDurationHours() {
    return maintenanceFreezeDurationHours;
  }

  /**
   * Specifies the number of hours after VM instance creation where the VM won't be scheduled for
   * maintenance.
   * @param maintenanceFreezeDurationHours maintenanceFreezeDurationHours or {@code null} for none
   */
  public Scheduling setMaintenanceFreezeDurationHours(java.lang.Integer maintenanceFreezeDurationHours) {
    this.maintenanceFreezeDurationHours = maintenanceFreezeDurationHours;
    return this;
  }

  /**
   * For more information about maintenance intervals, see Setting maintenance intervals.
   * @return value or {@code null} for none
   */
  public java.lang.String getMaintenanceInterval() {
    return maintenanceInterval;
  }

  /**
   * For more information about maintenance intervals, see Setting maintenance intervals.
   * @param maintenanceInterval maintenanceInterval or {@code null} for none
   */
  public Scheduling setMaintenanceInterval(java.lang.String maintenanceInterval) {
    this.maintenanceInterval = maintenanceInterval;
    return this;
  }

  /**
   * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant
   * node.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinNodeCpus() {
    return minNodeCpus;
  }

  /**
   * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant
   * node.
   * @param minNodeCpus minNodeCpus or {@code null} for none
   */
  public Scheduling setMinNodeCpus(java.lang.Integer minNodeCpus) {
    this.minNodeCpus = minNodeCpus;
    return this;
  }

  /**
   * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for
   * more information. Overrides reservationAffinity.
   * @return value or {@code null} for none
   */
  public java.util.List<SchedulingNodeAffinity> getNodeAffinities() {
    return nodeAffinities;
  }

  /**
   * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for
   * more information. Overrides reservationAffinity.
   * @param nodeAffinities nodeAffinities or {@code null} for none
   */
  public Scheduling setNodeAffinities(java.util.List<SchedulingNodeAffinity> nodeAffinities) {
    this.nodeAffinities = nodeAffinities;
    return this;
  }

  /**
   * Defines the maintenance behavior for this instance. For standard instances, the default
   * behavior is MIGRATE. For preemptible instances, the default and only possible behavior is
   * TERMINATE. For more information, see Set VM availability policies.
   * @return value or {@code null} for none
   */
  public java.lang.String getOnHostMaintenance() {
    return onHostMaintenance;
  }

  /**
   * Defines the maintenance behavior for this instance. For standard instances, the default
   * behavior is MIGRATE. For preemptible instances, the default and only possible behavior is
   * TERMINATE. For more information, see Set VM availability policies.
   * @param onHostMaintenance onHostMaintenance or {@code null} for none
   */
  public Scheduling setOnHostMaintenance(java.lang.String onHostMaintenance) {
    this.onHostMaintenance = onHostMaintenance;
    return this;
  }

  /**
   * Defines whether the instance is preemptible. This can only be set during instance creation or
   * while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle
   * for more information on the possible instance states.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreemptible() {
    return preemptible;
  }

  /**
   * Defines whether the instance is preemptible. This can only be set during instance creation or
   * while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle
   * for more information on the possible instance states.
   * @param preemptible preemptible or {@code null} for none
   */
  public Scheduling setPreemptible(java.lang.Boolean preemptible) {
    this.preemptible = preemptible;
    return this;
  }

  /**
   * Specifies the provisioning model of the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getProvisioningModel() {
    return provisioningModel;
  }

  /**
   * Specifies the provisioning model of the instance.
   * @param provisioningModel provisioningModel or {@code null} for none
   */
  public Scheduling setProvisioningModel(java.lang.String provisioningModel) {
    this.provisioningModel = provisioningModel;
    return this;
  }

  @Override
  public Scheduling set(String fieldName, Object value) {
    return (Scheduling) super.set(fieldName, value);
  }

  @Override
  public Scheduling clone() {
    return (Scheduling) super.clone();
  }

}
