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
public class V1EnvVarFluentImpl<A extends io.kubernetes.client.openapi.models.V1EnvVarFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1EnvVarFluent<A>{
  public V1EnvVarFluentImpl() {
  }
  public V1EnvVarFluentImpl(io.kubernetes.client.openapi.models.V1EnvVar instance) {
    this.withName(instance.getName());

    this.withValue(instance.getValue());

    this.withValueFrom(instance.getValueFrom());

  }
  private java.lang.String name;
  private java.lang.String value;
  private io.kubernetes.client.openapi.models.V1EnvVarSourceBuilder valueFrom;
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0) {
    return (A)withName(new String(arg0));
  }
  public java.lang.String getValue() {
    return this.value;
  }
  public A withValue(java.lang.String value) {
    this.value=value; return (A) this;
  }
  public java.lang.Boolean hasValue() {
    return this.value != null;
  }
  
  /**
   * Method is deprecated. use withValue instead.
   */
  @java.lang.Deprecated
  public A withNewValue(java.lang.String arg0) {
    return (A)withValue(new String(arg0));
  }
  
  /**
   * This method has been deprecated, please use method buildValueFrom instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1EnvVarSource getValueFrom() {
    return this.valueFrom!=null ?this.valueFrom.build():null;
  }
  public io.kubernetes.client.openapi.models.V1EnvVarSource buildValueFrom() {
    return this.valueFrom!=null ?this.valueFrom.build():null;
  }
  public A withValueFrom(io.kubernetes.client.openapi.models.V1EnvVarSource valueFrom) {
    _visitables.get("valueFrom").remove(this.valueFrom);
    if (valueFrom!=null){ this.valueFrom= new io.kubernetes.client.openapi.models.V1EnvVarSourceBuilder(valueFrom); _visitables.get("valueFrom").add(this.valueFrom);} return (A) this;
  }
  public java.lang.Boolean hasValueFrom() {
    return this.valueFrom != null;
  }
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> withNewValueFrom() {
    return new io.kubernetes.client.openapi.models.V1EnvVarFluentImpl.ValueFromNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> withNewValueFromLike(io.kubernetes.client.openapi.models.V1EnvVarSource item) {
    return new io.kubernetes.client.openapi.models.V1EnvVarFluentImpl.ValueFromNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> editValueFrom() {
    return withNewValueFromLike(getValueFrom());
  }
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> editOrNewValueFrom() {
    return withNewValueFromLike(getValueFrom() != null ? getValueFrom(): new io.kubernetes.client.openapi.models.V1EnvVarSourceBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> editOrNewValueFromLike(io.kubernetes.client.openapi.models.V1EnvVarSource item) {
    return withNewValueFromLike(getValueFrom() != null ? getValueFrom(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EnvVarFluentImpl that = (V1EnvVarFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (value != null ? !value.equals(that.value) :that.value != null) return false;
    if (valueFrom != null ? !valueFrom.equals(that.valueFrom) :that.valueFrom != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  value,  valueFrom,  super.hashCode());
  }
  public class ValueFromNestedImpl<N> extends io.kubernetes.client.openapi.models.V1EnvVarSourceFluentImpl<io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<N>> implements io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<N>,io.kubernetes.client.fluent.Nested<N>{
    ValueFromNestedImpl(io.kubernetes.client.openapi.models.V1EnvVarSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1EnvVarSourceBuilder(this, item);
    }
    ValueFromNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1EnvVarSourceBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1EnvVarSourceBuilder builder;
    public N and() {
      return (N) V1EnvVarFluentImpl.this.withValueFrom(builder.build());
    }
    public N endValueFrom() {
      return and();
    }
    
  }
  
}