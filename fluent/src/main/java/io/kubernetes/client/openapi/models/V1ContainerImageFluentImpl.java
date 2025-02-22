package io.kubernetes.client.openapi.models;

import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1ContainerImageFluentImpl<A extends io.kubernetes.client.openapi.models.V1ContainerImageFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ContainerImageFluent<A>{
  public V1ContainerImageFluentImpl() {
  }
  public V1ContainerImageFluentImpl(io.kubernetes.client.openapi.models.V1ContainerImage instance) {
    this.withNames(instance.getNames());

    this.withSizeBytes(instance.getSizeBytes());

  }
  private java.util.List<java.lang.String> names;
  private java.lang.Long sizeBytes;
  public A addToNames(java.lang.Integer index,java.lang.String item) {
    if (this.names == null) {this.names = new java.util.ArrayList<java.lang.String>();}
    this.names.add(index, item);
    return (A)this;
  }
  public A setToNames(java.lang.Integer index,java.lang.String item) {
    if (this.names == null) {this.names = new java.util.ArrayList<java.lang.String>();}
    this.names.set(index, item); return (A)this;
  }
  public A addToNames(java.lang.String... items) {
    if (this.names == null) {this.names = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.names.add(item);} return (A)this;
  }
  public A addAllToNames(java.util.Collection<java.lang.String> items) {
    if (this.names == null) {this.names = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.names.add(item);} return (A)this;
  }
  public A removeFromNames(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.names!= null){ this.names.remove(item);}} return (A)this;
  }
  public A removeAllFromNames(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.names!= null){ this.names.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getNames() {
    return this.names;
  }
  public java.lang.String getName(java.lang.Integer index) {
    return this.names.get(index);
  }
  public java.lang.String getFirstName() {
    return this.names.get(0);
  }
  public java.lang.String getLastName() {
    return this.names.get(names.size() - 1);
  }
  public java.lang.String getMatchingName(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: names) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingName(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: names) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withNames(java.util.List<java.lang.String> names) {
    if (names != null) {this.names = new java.util.ArrayList(); for (java.lang.String item : names){this.addToNames(item);}} else { this.names = null;} return (A) this;
  }
  public A withNames(java.lang.String... names) {
    if (this.names != null) {this.names.clear();}
    if (names != null) {for (java.lang.String item :names){ this.addToNames(item);}} return (A) this;
  }
  public java.lang.Boolean hasNames() {
    return names != null && !names.isEmpty();
  }
  public A addNewName(java.lang.String arg0) {
    return (A)addToNames(new String(arg0));
  }
  public java.lang.Long getSizeBytes() {
    return this.sizeBytes;
  }
  public A withSizeBytes(java.lang.Long sizeBytes) {
    this.sizeBytes=sizeBytes; return (A) this;
  }
  public java.lang.Boolean hasSizeBytes() {
    return this.sizeBytes != null;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerImageFluentImpl that = (V1ContainerImageFluentImpl) o;
    if (names != null ? !names.equals(that.names) :that.names != null) return false;
    if (sizeBytes != null ? !sizeBytes.equals(that.sizeBytes) :that.sizeBytes != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(names,  sizeBytes,  super.hashCode());
  }
  
}