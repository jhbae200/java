package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1VolumeMountFluentImpl<A extends io.kubernetes.client.openapi.models.V1VolumeMountFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1VolumeMountFluent<A>{
  public V1VolumeMountFluentImpl() {
  }
  public V1VolumeMountFluentImpl(io.kubernetes.client.openapi.models.V1VolumeMount instance) {
    this.withMountPath(instance.getMountPath());

    this.withMountPropagation(instance.getMountPropagation());

    this.withName(instance.getName());

    this.withReadOnly(instance.getReadOnly());

    this.withSubPath(instance.getSubPath());

    this.withSubPathExpr(instance.getSubPathExpr());

  }
  private java.lang.String mountPath;
  private java.lang.String mountPropagation;
  private java.lang.String name;
  private java.lang.Boolean readOnly;
  private java.lang.String subPath;
  private java.lang.String subPathExpr;
  public java.lang.String getMountPath() {
    return this.mountPath;
  }
  public A withMountPath(java.lang.String mountPath) {
    this.mountPath=mountPath; return (A) this;
  }
  public java.lang.Boolean hasMountPath() {
    return this.mountPath != null;
  }
  
  /**
   * Method is deprecated. use withMountPath instead.
   */
  @java.lang.Deprecated
  public A withNewMountPath(java.lang.String arg0) {
    return (A)withMountPath(new String(arg0));
  }
  public java.lang.String getMountPropagation() {
    return this.mountPropagation;
  }
  public A withMountPropagation(java.lang.String mountPropagation) {
    this.mountPropagation=mountPropagation; return (A) this;
  }
  public java.lang.Boolean hasMountPropagation() {
    return this.mountPropagation != null;
  }
  
  /**
   * Method is deprecated. use withMountPropagation instead.
   */
  @java.lang.Deprecated
  public A withNewMountPropagation(java.lang.String arg0) {
    return (A)withMountPropagation(new String(arg0));
  }
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
  public java.lang.Boolean getReadOnly() {
    return this.readOnly;
  }
  public A withReadOnly(java.lang.Boolean readOnly) {
    this.readOnly=readOnly; return (A) this;
  }
  public java.lang.Boolean hasReadOnly() {
    return this.readOnly != null;
  }
  public java.lang.String getSubPath() {
    return this.subPath;
  }
  public A withSubPath(java.lang.String subPath) {
    this.subPath=subPath; return (A) this;
  }
  public java.lang.Boolean hasSubPath() {
    return this.subPath != null;
  }
  
  /**
   * Method is deprecated. use withSubPath instead.
   */
  @java.lang.Deprecated
  public A withNewSubPath(java.lang.String arg0) {
    return (A)withSubPath(new String(arg0));
  }
  public java.lang.String getSubPathExpr() {
    return this.subPathExpr;
  }
  public A withSubPathExpr(java.lang.String subPathExpr) {
    this.subPathExpr=subPathExpr; return (A) this;
  }
  public java.lang.Boolean hasSubPathExpr() {
    return this.subPathExpr != null;
  }
  
  /**
   * Method is deprecated. use withSubPathExpr instead.
   */
  @java.lang.Deprecated
  public A withNewSubPathExpr(java.lang.String arg0) {
    return (A)withSubPathExpr(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeMountFluentImpl that = (V1VolumeMountFluentImpl) o;
    if (mountPath != null ? !mountPath.equals(that.mountPath) :that.mountPath != null) return false;
    if (mountPropagation != null ? !mountPropagation.equals(that.mountPropagation) :that.mountPropagation != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (subPath != null ? !subPath.equals(that.subPath) :that.subPath != null) return false;
    if (subPathExpr != null ? !subPathExpr.equals(that.subPathExpr) :that.subPathExpr != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(mountPath,  mountPropagation,  name,  readOnly,  subPath,  subPathExpr,  super.hashCode());
  }
  
}