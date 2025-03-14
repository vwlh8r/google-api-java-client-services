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

package com.google.api.services.vmmigration.v1alpha1.model;

/**
 * Response message for fetchInventory.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FetchInventoryResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when the source was last queried (if the result is from the cache).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The description of the VMs in a Source of type Vmware.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VmwareVmsDetails vmwareVms;

  /**
   * Output only. The timestamp when the source was last queried (if the result is from the cache).
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the source was last queried (if the result is from the cache).
   * @param updateTime updateTime or {@code null} for none
   */
  public FetchInventoryResponse setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * The description of the VMs in a Source of type Vmware.
   * @return value or {@code null} for none
   */
  public VmwareVmsDetails getVmwareVms() {
    return vmwareVms;
  }

  /**
   * The description of the VMs in a Source of type Vmware.
   * @param vmwareVms vmwareVms or {@code null} for none
   */
  public FetchInventoryResponse setVmwareVms(VmwareVmsDetails vmwareVms) {
    this.vmwareVms = vmwareVms;
    return this;
  }

  @Override
  public FetchInventoryResponse set(String fieldName, Object value) {
    return (FetchInventoryResponse) super.set(fieldName, value);
  }

  @Override
  public FetchInventoryResponse clone() {
    return (FetchInventoryResponse) super.clone();
  }

}
