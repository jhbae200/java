package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public class V1NamespaceSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1NamespaceSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1NamespaceSpecFluent<A>{
  public V1NamespaceSpecFluentImpl() {
  }
  public V1NamespaceSpecFluentImpl(io.kubernetes.client.openapi.models.V1NamespaceSpec instance) {
    this.withFinalizers(instance.getFinalizers());

  }
  private java.util.List<java.lang.String> finalizers;
  public A addToFinalizers(java.lang.Integer index,java.lang.String item) {
    if (this.finalizers == null) {this.finalizers = new java.util.ArrayList<java.lang.String>();}
    this.finalizers.add(index, item);
    return (A)this;
  }
  public A setToFinalizers(java.lang.Integer index,java.lang.String item) {
    if (this.finalizers == null) {this.finalizers = new java.util.ArrayList<java.lang.String>();}
    this.finalizers.set(index, item); return (A)this;
  }
  public A addToFinalizers(java.lang.String... items) {
    if (this.finalizers == null) {this.finalizers = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.finalizers.add(item);} return (A)this;
  }
  public A addAllToFinalizers(java.util.Collection<java.lang.String> items) {
    if (this.finalizers == null) {this.finalizers = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.finalizers.add(item);} return (A)this;
  }
  public A removeFromFinalizers(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.finalizers!= null){ this.finalizers.remove(item);}} return (A)this;
  }
  public A removeAllFromFinalizers(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.finalizers!= null){ this.finalizers.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getFinalizers() {
    return this.finalizers;
  }
  public java.lang.String getFinalizer(java.lang.Integer index) {
    return this.finalizers.get(index);
  }
  public java.lang.String getFirstFinalizer() {
    return this.finalizers.get(0);
  }
  public java.lang.String getLastFinalizer() {
    return this.finalizers.get(finalizers.size() - 1);
  }
  public java.lang.String getMatchingFinalizer(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: finalizers) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingFinalizer(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: finalizers) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withFinalizers(java.util.List<java.lang.String> finalizers) {
    if (finalizers != null) {this.finalizers = new java.util.ArrayList(); for (java.lang.String item : finalizers){this.addToFinalizers(item);}} else { this.finalizers = null;} return (A) this;
  }
  public A withFinalizers(java.lang.String... finalizers) {
    if (this.finalizers != null) {this.finalizers.clear();}
    if (finalizers != null) {for (java.lang.String item :finalizers){ this.addToFinalizers(item);}} return (A) this;
  }
  public java.lang.Boolean hasFinalizers() {
    return finalizers != null && !finalizers.isEmpty();
  }
  public A addNewFinalizer(java.lang.String arg0) {
    return (A)addToFinalizers(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NamespaceSpecFluentImpl that = (V1NamespaceSpecFluentImpl) o;
    if (finalizers != null ? !finalizers.equals(that.finalizers) :that.finalizers != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(finalizers,  super.hashCode());
  }
  
}