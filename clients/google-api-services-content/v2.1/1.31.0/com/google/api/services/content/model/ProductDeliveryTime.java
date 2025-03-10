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

package com.google.api.services.content.model;

/**
 * The estimated days to deliver for this product. These methods are intended for authorized
 * partners working with a merchant. Merchants should use the [product
 * API](https://developers.google.com/shopping-content/reference/rest/v2.1/products#productshipping)
 * instead. To obtain authorization from a merchant refer to
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductDeliveryTime extends com.google.api.client.json.GenericJson {

  /**
   * Required. A set of associations between DeliveryAreas and DeliveryTimes. The total number of
   * areaDeliveryTimes can be at most 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ProductDeliveryTimeAreaDeliveryTime> areaDeliveryTimes;

  /**
   * Required. The id of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProductId productId;

  /**
   * Required. A set of associations between DeliveryAreas and DeliveryTimes. The total number of
   * areaDeliveryTimes can be at most 100.
   * @return value or {@code null} for none
   */
  public java.util.List<ProductDeliveryTimeAreaDeliveryTime> getAreaDeliveryTimes() {
    return areaDeliveryTimes;
  }

  /**
   * Required. A set of associations between DeliveryAreas and DeliveryTimes. The total number of
   * areaDeliveryTimes can be at most 100.
   * @param areaDeliveryTimes areaDeliveryTimes or {@code null} for none
   */
  public ProductDeliveryTime setAreaDeliveryTimes(java.util.List<ProductDeliveryTimeAreaDeliveryTime> areaDeliveryTimes) {
    this.areaDeliveryTimes = areaDeliveryTimes;
    return this;
  }

  /**
   * Required. The id of the product.
   * @return value or {@code null} for none
   */
  public ProductId getProductId() {
    return productId;
  }

  /**
   * Required. The id of the product.
   * @param productId productId or {@code null} for none
   */
  public ProductDeliveryTime setProductId(ProductId productId) {
    this.productId = productId;
    return this;
  }

  @Override
  public ProductDeliveryTime set(String fieldName, Object value) {
    return (ProductDeliveryTime) super.set(fieldName, value);
  }

  @Override
  public ProductDeliveryTime clone() {
    return (ProductDeliveryTime) super.clone();
  }

}
