package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1beta1PodDisruptionBudgetFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent<A>{
  public V1beta1PodDisruptionBudgetFluentImpl() {
  }
  public V1beta1PodDisruptionBudgetFluentImpl(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudget instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

  }
  private java.lang.String apiVersion;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecBuilder spec;
  private io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusBuilder status;
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
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.MetadataNested<A> withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluentImpl.MetadataNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluentImpl.MetadataNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecBuilder(spec); _visitables.get("spec").add(this.spec);} return (A) this;
  }
  public java.lang.Boolean hasSpec() {
    return this.spec != null;
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.SpecNested<A> withNewSpec() {
    return new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluentImpl.SpecNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluentImpl.SpecNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusBuilder(status); _visitables.get("status").add(this.status);} return (A) this;
  }
  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.StatusNested<A> withNewStatus() {
    return new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluentImpl.StatusNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluentImpl.StatusNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1PodDisruptionBudgetFluentImpl that = (V1beta1PodDisruptionBudgetFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  spec,  status,  super.hashCode());
  }
  public class MetadataNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.MetadataNested<N>> implements io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.MetadataNested<N>,io.kubernetes.client.fluent.Nested<N>{
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1beta1PodDisruptionBudgetFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  public class SpecNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.SpecNested<N>> implements io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.SpecNested<N>,io.kubernetes.client.fluent.Nested<N>{
    SpecNestedImpl(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec item) {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecBuilder builder;
    public N and() {
      return (N) V1beta1PodDisruptionBudgetFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  public class StatusNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluentImpl<io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.StatusNested<N>> implements io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.StatusNested<N>,io.kubernetes.client.fluent.Nested<N>{
    StatusNestedImpl(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus item) {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusBuilder builder;
    public N and() {
      return (N) V1beta1PodDisruptionBudgetFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}