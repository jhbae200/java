package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1VolumeDeviceFluentImpl<A extends io.kubernetes.client.openapi.models.V1VolumeDeviceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1VolumeDeviceFluent<A>{
  public V1VolumeDeviceFluentImpl() {
  }
  public V1VolumeDeviceFluentImpl(io.kubernetes.client.openapi.models.V1VolumeDevice instance) {
    this.withDevicePath(instance.getDevicePath());

    this.withName(instance.getName());

  }
  private java.lang.String devicePath;
  private java.lang.String name;
  public java.lang.String getDevicePath() {
    return this.devicePath;
  }
  public A withDevicePath(java.lang.String devicePath) {
    this.devicePath=devicePath; return (A) this;
  }
  public java.lang.Boolean hasDevicePath() {
    return this.devicePath != null;
  }
  
  /**
   * Method is deprecated. use withDevicePath instead.
   */
  @java.lang.Deprecated
  public A withNewDevicePath(java.lang.String arg0) {
    return (A)withDevicePath(new String(arg0));
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
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeDeviceFluentImpl that = (V1VolumeDeviceFluentImpl) o;
    if (devicePath != null ? !devicePath.equals(that.devicePath) :that.devicePath != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(devicePath,  name,  super.hashCode());
  }
  
}