package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ValidatingWebhookConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public A addToWebhooks(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ValidatingWebhook item);
  public A setToWebhooks(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ValidatingWebhook item);
  public A addToWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... items);
  public A addAllToWebhooks(java.util.Collection<io.kubernetes.client.openapi.models.V1ValidatingWebhook> items);
  public A removeFromWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... items);
  public A removeAllFromWebhooks(java.util.Collection<io.kubernetes.client.openapi.models.V1ValidatingWebhook> items);
  public A removeMatchingFromWebhooks(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildWebhooks instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ValidatingWebhook> getWebhooks();
  public java.util.List<io.kubernetes.client.openapi.models.V1ValidatingWebhook> buildWebhooks();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildWebhook(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildFirstWebhook();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildLastWebhook();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildMatchingWebhook(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder> predicate);
  public java.lang.Boolean hasMatchingWebhook(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder> predicate);
  public A withWebhooks(java.util.List<io.kubernetes.client.openapi.models.V1ValidatingWebhook> webhooks);
  public A withWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... webhooks);
  public java.lang.Boolean hasWebhooks();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhook();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhookLike(io.kubernetes.client.openapi.models.V1ValidatingWebhook item);
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<A> setNewWebhookLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ValidatingWebhook item);
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<A> editWebhook(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<A> editFirstWebhook();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<A> editLastWebhook();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<A> editMatchingWebhook(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder> predicate);
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface WebhooksNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent<io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<N>>{
    public N and();
    public N endWebhook();
    
  }
  
}