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
public class V1SelfSubjectAccessReviewFluentImpl<A extends io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent<A>{
  public V1SelfSubjectAccessReviewFluentImpl() {
  }
  public V1SelfSubjectAccessReviewFluentImpl(io.kubernetes.client.openapi.models.V1SelfSubjectAccessReview instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

  }
  private java.lang.String apiVersion;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecBuilder spec;
  private io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusBuilder status;
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
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.MetadataNested<A> withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluentImpl.MetadataNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluentImpl.MetadataNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecBuilder(spec); _visitables.get("spec").add(this.spec);} return (A) this;
  }
  public java.lang.Boolean hasSpec() {
    return this.spec != null;
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.SpecNested<A> withNewSpec() {
    return new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluentImpl.SpecNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec item) {
    return new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluentImpl.SpecNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusBuilder(status); _visitables.get("status").add(this.status);} return (A) this;
  }
  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.StatusNested<A> withNewStatus() {
    return new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluentImpl.StatusNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus item) {
    return new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluentImpl.StatusNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SelfSubjectAccessReviewFluentImpl that = (V1SelfSubjectAccessReviewFluentImpl) o;
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
  public class MetadataNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.MetadataNested<N>> implements io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.MetadataNested<N>,io.kubernetes.client.fluent.Nested<N>{
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1SelfSubjectAccessReviewFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  public class SpecNestedImpl<N> extends io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluentImpl<io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.SpecNested<N>> implements io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.SpecNested<N>,io.kubernetes.client.fluent.Nested<N>{
    SpecNestedImpl(io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec item) {
      this.builder = new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecBuilder builder;
    public N and() {
      return (N) V1SelfSubjectAccessReviewFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  public class StatusNestedImpl<N> extends io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusFluentImpl<io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.StatusNested<N>> implements io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewFluent.StatusNested<N>,io.kubernetes.client.fluent.Nested<N>{
    StatusNestedImpl(io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus item) {
      this.builder = new io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusBuilder builder;
    public N and() {
      return (N) V1SelfSubjectAccessReviewFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}