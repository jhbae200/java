package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1ComponentConditionFluentImpl<A extends io.kubernetes.client.openapi.models.V1ComponentConditionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ComponentConditionFluent<A>{
  public V1ComponentConditionFluentImpl() {
  }
  public V1ComponentConditionFluentImpl(io.kubernetes.client.openapi.models.V1ComponentCondition instance) {
    this.withError(instance.getError());

    this.withMessage(instance.getMessage());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

  }
  private java.lang.String error;
  private java.lang.String message;
  private java.lang.String status;
  private java.lang.String type;
  public java.lang.String getError() {
    return this.error;
  }
  public A withError(java.lang.String error) {
    this.error=error; return (A) this;
  }
  public java.lang.Boolean hasError() {
    return this.error != null;
  }
  
  /**
   * Method is deprecated. use withError instead.
   */
  @java.lang.Deprecated
  public A withNewError(java.lang.String arg0) {
    return (A)withError(new String(arg0));
  }
  public java.lang.String getMessage() {
    return this.message;
  }
  public A withMessage(java.lang.String message) {
    this.message=message; return (A) this;
  }
  public java.lang.Boolean hasMessage() {
    return this.message != null;
  }
  
  /**
   * Method is deprecated. use withMessage instead.
   */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String arg0) {
    return (A)withMessage(new String(arg0));
  }
  public java.lang.String getStatus() {
    return this.status;
  }
  public A withStatus(java.lang.String status) {
    this.status=status; return (A) this;
  }
  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }
  
  /**
   * Method is deprecated. use withStatus instead.
   */
  @java.lang.Deprecated
  public A withNewStatus(java.lang.String arg0) {
    return (A)withStatus(new String(arg0));
  }
  public java.lang.String getType() {
    return this.type;
  }
  public A withType(java.lang.String type) {
    this.type=type; return (A) this;
  }
  public java.lang.Boolean hasType() {
    return this.type != null;
  }
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String arg0) {
    return (A)withType(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ComponentConditionFluentImpl that = (V1ComponentConditionFluentImpl) o;
    if (error != null ? !error.equals(that.error) :that.error != null) return false;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(error,  message,  status,  type,  super.hashCode());
  }
  
}