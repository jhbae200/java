package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
public class V1MutatingWebhookConfigurationFluentImpl<A extends io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent<A>{
  public V1MutatingWebhookConfigurationFluentImpl() {
  }
  public V1MutatingWebhookConfigurationFluentImpl(io.kubernetes.client.openapi.models.V1MutatingWebhookConfiguration instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withWebhooks(instance.getWebhooks());

  }
  private java.lang.String apiVersion;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder> webhooks;
  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0) {
    return (A)withApiVersion(new String(arg0));
  }
  public java.lang.String getKind() {
    return this.kind;
  }
  public A withKind(java.lang.String kind) {
    this.kind=kind; return (A) this;
  }
  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0) {
    return (A)withKind(new String(arg0));
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} return (A) this;
  }
  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluentImpl.MetadataNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluentImpl.MetadataNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public A addToWebhooks(java.lang.Integer index,io.kubernetes.client.openapi.models.V1MutatingWebhook item) {
    if (this.webhooks == null) {this.webhooks = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder>();}
    io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder builder = new io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder(item);_visitables.get("webhooks").add(index >= 0 ? index : _visitables.get("webhooks").size(), builder);this.webhooks.add(index >= 0 ? index : webhooks.size(), builder); return (A)this;
  }
  public A setToWebhooks(java.lang.Integer index,io.kubernetes.client.openapi.models.V1MutatingWebhook item) {
    if (this.webhooks == null) {this.webhooks = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder>();}
    io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder builder = new io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder(item);
    if (index < 0 || index >= _visitables.get("webhooks").size()) { _visitables.get("webhooks").add(builder); } else { _visitables.get("webhooks").set(index, builder);}
    if (index < 0 || index >= webhooks.size()) { webhooks.add(builder); } else { webhooks.set(index, builder);}
     return (A)this;
  }
  public A addToWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... items) {
    if (this.webhooks == null) {this.webhooks = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder>();}
    for (io.kubernetes.client.openapi.models.V1MutatingWebhook item : items) {io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder builder = new io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder(item);_visitables.get("webhooks").add(builder);this.webhooks.add(builder);} return (A)this;
  }
  public A addAllToWebhooks(java.util.Collection<io.kubernetes.client.openapi.models.V1MutatingWebhook> items) {
    if (this.webhooks == null) {this.webhooks = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder>();}
    for (io.kubernetes.client.openapi.models.V1MutatingWebhook item : items) {io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder builder = new io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder(item);_visitables.get("webhooks").add(builder);this.webhooks.add(builder);} return (A)this;
  }
  public A removeFromWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... items) {
    for (io.kubernetes.client.openapi.models.V1MutatingWebhook item : items) {io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder builder = new io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder(item);_visitables.get("webhooks").remove(builder);if (this.webhooks != null) {this.webhooks.remove(builder);}} return (A)this;
  }
  public A removeAllFromWebhooks(java.util.Collection<io.kubernetes.client.openapi.models.V1MutatingWebhook> items) {
    for (io.kubernetes.client.openapi.models.V1MutatingWebhook item : items) {io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder builder = new io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder(item);_visitables.get("webhooks").remove(builder);if (this.webhooks != null) {this.webhooks.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromWebhooks(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder> predicate) {
    if (webhooks == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder> each = webhooks.iterator();
    final List visitables = _visitables.get("webhooks");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildWebhooks instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1MutatingWebhook> getWebhooks() {
    return webhooks != null ? build(webhooks) : null;
  }
  public java.util.List<io.kubernetes.client.openapi.models.V1MutatingWebhook> buildWebhooks() {
    return webhooks != null ? build(webhooks) : null;
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhook buildWebhook(java.lang.Integer index) {
    return this.webhooks.get(index).build();
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhook buildFirstWebhook() {
    return this.webhooks.get(0).build();
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhook buildLastWebhook() {
    return this.webhooks.get(webhooks.size() - 1).build();
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhook buildMatchingWebhook(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder item: webhooks) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public java.lang.Boolean hasMatchingWebhook(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder item: webhooks) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withWebhooks(java.util.List<io.kubernetes.client.openapi.models.V1MutatingWebhook> webhooks) {
    if (this.webhooks != null) { _visitables.get("webhooks").removeAll(this.webhooks);}
    if (webhooks != null) {this.webhooks = new java.util.ArrayList(); for (io.kubernetes.client.openapi.models.V1MutatingWebhook item : webhooks){this.addToWebhooks(item);}} else { this.webhooks = null;} return (A) this;
  }
  public A withWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... webhooks) {
    if (this.webhooks != null) {this.webhooks.clear();}
    if (webhooks != null) {for (io.kubernetes.client.openapi.models.V1MutatingWebhook item :webhooks){ this.addToWebhooks(item);}} return (A) this;
  }
  public java.lang.Boolean hasWebhooks() {
    return webhooks != null && !webhooks.isEmpty();
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhook() {
    return new io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluentImpl.WebhooksNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhookLike(io.kubernetes.client.openapi.models.V1MutatingWebhook item) {
    return new io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluentImpl.WebhooksNestedImpl(-1, item);
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A> setNewWebhookLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1MutatingWebhook item) {
    return new io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluentImpl.WebhooksNestedImpl(index, item);
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editWebhook(java.lang.Integer index) {
    if (webhooks.size() <= index) throw new RuntimeException("Can't edit webhooks. Index exceeds size.");
    return setNewWebhookLike(index, buildWebhook(index));
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editFirstWebhook() {
    if (webhooks.size() == 0) throw new RuntimeException("Can't edit first webhooks. The list is empty.");
    return setNewWebhookLike(0, buildWebhook(0));
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editLastWebhook() {
    int index = webhooks.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last webhooks. The list is empty.");
    return setNewWebhookLike(index, buildWebhook(index));
  }
  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editMatchingWebhook(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder> predicate) {
    int index = -1;
    for (int i=0;i<webhooks.size();i++) { 
    if (predicate.test(webhooks.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching webhooks. No match found.");
    return setNewWebhookLike(index, buildWebhook(index));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1MutatingWebhookConfigurationFluentImpl that = (V1MutatingWebhookConfigurationFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (webhooks != null ? !webhooks.equals(that.webhooks) :that.webhooks != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  webhooks,  super.hashCode());
  }
  public class MetadataNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<N>> implements io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<N>,io.kubernetes.client.fluent.Nested<N>{
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1MutatingWebhookConfigurationFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  public class WebhooksNestedImpl<N> extends io.kubernetes.client.openapi.models.V1MutatingWebhookFluentImpl<io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<N>> implements io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<N>,io.kubernetes.client.fluent.Nested<N>{
    WebhooksNestedImpl(java.lang.Integer index,io.kubernetes.client.openapi.models.V1MutatingWebhook item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder(this, item);
    }
    WebhooksNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder builder;
    java.lang.Integer index;
    public N and() {
      return (N) V1MutatingWebhookConfigurationFluentImpl.this.setToWebhooks(index,builder.build());
    }
    public N endWebhook() {
      return and();
    }
    
  }
  
}