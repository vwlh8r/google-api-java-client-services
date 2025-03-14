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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * The request message for a webhook call. The request is sent as a JSON object and the field names
 * will be presented in camel cases.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1WebhookRequest extends com.google.api.client.json.GenericJson {

  /**
   * Always present. The unique identifier of the DetectIntentResponse that will be returned to the
   * API caller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detectIntentResponseId;

  /**
   * Always present. Information about the fulfillment that triggered this webhook call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo fulfillmentInfo;

  /**
   * Information about the last matched intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo intentInfo;

  /**
   * The language code specified in the original request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * The list of rich message responses to present to the user. Webhook can choose to append or
   * replace this list in WebhookResponse.fulfillment_response;
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessage> messages;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowCxV3beta1ResponseMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowCxV3beta1ResponseMessage.class);
  }

  /**
   * Information about page status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1PageInfo pageInfo;

  /**
   * Custom data set in QueryParameters.payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> payload;

  /**
   * The sentiment analysis result of the current user request. The field is filled when sentiment
   * analysis is configured to be enabled for the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1WebhookRequestSentimentAnalysisResult sentimentAnalysisResult;

  /**
   * Information about session status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1SessionInfo sessionInfo;

  /**
   * If natural language text was provided as input, this field will contain a copy of the text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * If natural language speech audio was provided as input, this field will contain the transcript
   * for the audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transcript;

  /**
   * If an event was provided as input, this field will contain the name of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerEvent;

  /**
   * If an intent was provided as input, this field will contain a copy of the intent identifier.
   * Format: `projects//locations//agents//intents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerIntent;

  /**
   * Always present. The unique identifier of the DetectIntentResponse that will be returned to the
   * API caller.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetectIntentResponseId() {
    return detectIntentResponseId;
  }

  /**
   * Always present. The unique identifier of the DetectIntentResponse that will be returned to the
   * API caller.
   * @param detectIntentResponseId detectIntentResponseId or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setDetectIntentResponseId(java.lang.String detectIntentResponseId) {
    this.detectIntentResponseId = detectIntentResponseId;
    return this;
  }

  /**
   * Always present. Information about the fulfillment that triggered this webhook call.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo getFulfillmentInfo() {
    return fulfillmentInfo;
  }

  /**
   * Always present. Information about the fulfillment that triggered this webhook call.
   * @param fulfillmentInfo fulfillmentInfo or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setFulfillmentInfo(GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo fulfillmentInfo) {
    this.fulfillmentInfo = fulfillmentInfo;
    return this;
  }

  /**
   * Information about the last matched intent.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo getIntentInfo() {
    return intentInfo;
  }

  /**
   * Information about the last matched intent.
   * @param intentInfo intentInfo or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setIntentInfo(GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo intentInfo) {
    this.intentInfo = intentInfo;
    return this;
  }

  /**
   * The language code specified in the original request.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * The language code specified in the original request.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * The list of rich message responses to present to the user. Webhook can choose to append or
   * replace this list in WebhookResponse.fulfillment_response;
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessage> getMessages() {
    return messages;
  }

  /**
   * The list of rich message responses to present to the user. Webhook can choose to append or
   * replace this list in WebhookResponse.fulfillment_response;
   * @param messages messages or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setMessages(java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessage> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Information about page status.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1PageInfo getPageInfo() {
    return pageInfo;
  }

  /**
   * Information about page status.
   * @param pageInfo pageInfo or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setPageInfo(GoogleCloudDialogflowCxV3beta1PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Custom data set in QueryParameters.payload.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPayload() {
    return payload;
  }

  /**
   * Custom data set in QueryParameters.payload.
   * @param payload payload or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setPayload(java.util.Map<String, java.lang.Object> payload) {
    this.payload = payload;
    return this;
  }

  /**
   * The sentiment analysis result of the current user request. The field is filled when sentiment
   * analysis is configured to be enabled for the request.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequestSentimentAnalysisResult getSentimentAnalysisResult() {
    return sentimentAnalysisResult;
  }

  /**
   * The sentiment analysis result of the current user request. The field is filled when sentiment
   * analysis is configured to be enabled for the request.
   * @param sentimentAnalysisResult sentimentAnalysisResult or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setSentimentAnalysisResult(GoogleCloudDialogflowCxV3beta1WebhookRequestSentimentAnalysisResult sentimentAnalysisResult) {
    this.sentimentAnalysisResult = sentimentAnalysisResult;
    return this;
  }

  /**
   * Information about session status.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1SessionInfo getSessionInfo() {
    return sessionInfo;
  }

  /**
   * Information about session status.
   * @param sessionInfo sessionInfo or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setSessionInfo(GoogleCloudDialogflowCxV3beta1SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
    return this;
  }

  /**
   * If natural language text was provided as input, this field will contain a copy of the text.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * If natural language text was provided as input, this field will contain a copy of the text.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * If natural language speech audio was provided as input, this field will contain the transcript
   * for the audio.
   * @return value or {@code null} for none
   */
  public java.lang.String getTranscript() {
    return transcript;
  }

  /**
   * If natural language speech audio was provided as input, this field will contain the transcript
   * for the audio.
   * @param transcript transcript or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setTranscript(java.lang.String transcript) {
    this.transcript = transcript;
    return this;
  }

  /**
   * If an event was provided as input, this field will contain the name of the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerEvent() {
    return triggerEvent;
  }

  /**
   * If an event was provided as input, this field will contain the name of the event.
   * @param triggerEvent triggerEvent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setTriggerEvent(java.lang.String triggerEvent) {
    this.triggerEvent = triggerEvent;
    return this;
  }

  /**
   * If an intent was provided as input, this field will contain a copy of the intent identifier.
   * Format: `projects//locations//agents//intents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerIntent() {
    return triggerIntent;
  }

  /**
   * If an intent was provided as input, this field will contain a copy of the intent identifier.
   * Format: `projects//locations//agents//intents/`.
   * @param triggerIntent triggerIntent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookRequest setTriggerIntent(java.lang.String triggerIntent) {
    this.triggerIntent = triggerIntent;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1WebhookRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1WebhookRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1WebhookRequest clone() {
    return (GoogleCloudDialogflowCxV3beta1WebhookRequest) super.clone();
  }

}
