package io.kubernetes.client.openapi.models;

import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1TopologySelectorLabelRequirementFluentImpl<A extends io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluent<A>{
  public V1TopologySelectorLabelRequirementFluentImpl() {
  }
  public V1TopologySelectorLabelRequirementFluentImpl(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement instance) {
    this.withKey(instance.getKey());

    this.withValues(instance.getValues());

  }
  private java.lang.String key;
  private java.util.List<java.lang.String> values;
  public java.lang.String getKey() {
    return this.key;
  }
  public A withKey(java.lang.String key) {
    this.key=key; return (A) this;
  }
  public java.lang.Boolean hasKey() {
    return this.key != null;
  }
  
  /**
   * Method is deprecated. use withKey instead.
   */
  @java.lang.Deprecated
  public A withNewKey(java.lang.String arg0) {
    return (A)withKey(new String(arg0));
  }
  public A addToValues(java.lang.Integer index,java.lang.String item) {
    if (this.values == null) {this.values = new java.util.ArrayList<java.lang.String>();}
    this.values.add(index, item);
    return (A)this;
  }
  public A setToValues(java.lang.Integer index,java.lang.String item) {
    if (this.values == null) {this.values = new java.util.ArrayList<java.lang.String>();}
    this.values.set(index, item); return (A)this;
  }
  public A addToValues(java.lang.String... items) {
    if (this.values == null) {this.values = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.values.add(item);} return (A)this;
  }
  public A addAllToValues(java.util.Collection<java.lang.String> items) {
    if (this.values == null) {this.values = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.values.add(item);} return (A)this;
  }
  public A removeFromValues(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.values!= null){ this.values.remove(item);}} return (A)this;
  }
  public A removeAllFromValues(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.values!= null){ this.values.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getValues() {
    return this.values;
  }
  public java.lang.String getValue(java.lang.Integer index) {
    return this.values.get(index);
  }
  public java.lang.String getFirstValue() {
    return this.values.get(0);
  }
  public java.lang.String getLastValue() {
    return this.values.get(values.size() - 1);
  }
  public java.lang.String getMatchingValue(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: values) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingValue(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: values) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withValues(java.util.List<java.lang.String> values) {
    if (values != null) {this.values = new java.util.ArrayList(); for (java.lang.String item : values){this.addToValues(item);}} else { this.values = null;} return (A) this;
  }
  public A withValues(java.lang.String... values) {
    if (this.values != null) {this.values.clear();}
    if (values != null) {for (java.lang.String item :values){ this.addToValues(item);}} return (A) this;
  }
  public java.lang.Boolean hasValues() {
    return values != null && !values.isEmpty();
  }
  public A addNewValue(java.lang.String arg0) {
    return (A)addToValues(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TopologySelectorLabelRequirementFluentImpl that = (V1TopologySelectorLabelRequirementFluentImpl) o;
    if (key != null ? !key.equals(that.key) :that.key != null) return false;
    if (values != null ? !values.equals(that.values) :that.values != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(key,  values,  super.hashCode());
  }
  
}