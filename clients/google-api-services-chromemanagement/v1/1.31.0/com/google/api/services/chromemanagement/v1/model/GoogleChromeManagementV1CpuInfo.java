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

package com.google.api.services.chromemanagement.v1.model;

/**
 * CPU specs for a CPU.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromeManagementV1CpuInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The CPU architecture.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String architecture;

  /**
   * Output only. The max CPU clock speed in kHz.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxClockSpeed;

  /**
   * Output only. The CPU model name. Example: Intel(R) Core(TM) i5-8250U CPU @ 1.60GHz
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * Output only. The CPU architecture.
   * @return value or {@code null} for none
   */
  public java.lang.String getArchitecture() {
    return architecture;
  }

  /**
   * Output only. The CPU architecture.
   * @param architecture architecture or {@code null} for none
   */
  public GoogleChromeManagementV1CpuInfo setArchitecture(java.lang.String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Output only. The max CPU clock speed in kHz.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxClockSpeed() {
    return maxClockSpeed;
  }

  /**
   * Output only. The max CPU clock speed in kHz.
   * @param maxClockSpeed maxClockSpeed or {@code null} for none
   */
  public GoogleChromeManagementV1CpuInfo setMaxClockSpeed(java.lang.Integer maxClockSpeed) {
    this.maxClockSpeed = maxClockSpeed;
    return this;
  }

  /**
   * Output only. The CPU model name. Example: Intel(R) Core(TM) i5-8250U CPU @ 1.60GHz
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Output only. The CPU model name. Example: Intel(R) Core(TM) i5-8250U CPU @ 1.60GHz
   * @param model model or {@code null} for none
   */
  public GoogleChromeManagementV1CpuInfo setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  @Override
  public GoogleChromeManagementV1CpuInfo set(String fieldName, Object value) {
    return (GoogleChromeManagementV1CpuInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1CpuInfo clone() {
    return (GoogleChromeManagementV1CpuInfo) super.clone();
  }

}
