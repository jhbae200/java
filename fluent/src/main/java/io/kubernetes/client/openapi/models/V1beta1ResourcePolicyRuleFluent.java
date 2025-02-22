package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1beta1ResourcePolicyRuleFluent<A extends io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRuleFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToApiGroups(java.lang.Integer index,java.lang.String item);
  public A setToApiGroups(java.lang.Integer index,java.lang.String item);
  public A addToApiGroups(java.lang.String... items);
  public A addAllToApiGroups(java.util.Collection<java.lang.String> items);
  public A removeFromApiGroups(java.lang.String... items);
  public A removeAllFromApiGroups(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getApiGroups();
  public java.lang.String getApiGroup(java.lang.Integer index);
  public java.lang.String getFirstApiGroup();
  public java.lang.String getLastApiGroup();
  public java.lang.String getMatchingApiGroup(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingApiGroup(java.util.function.Predicate<java.lang.String> predicate);
  public A withApiGroups(java.util.List<java.lang.String> apiGroups);
  public A withApiGroups(java.lang.String... apiGroups);
  public java.lang.Boolean hasApiGroups();
  public A addNewApiGroup(java.lang.String arg0);
  public java.lang.Boolean getClusterScope();
  public A withClusterScope(java.lang.Boolean clusterScope);
  public java.lang.Boolean hasClusterScope();
  public A addToNamespaces(java.lang.Integer index,java.lang.String item);
  public A setToNamespaces(java.lang.Integer index,java.lang.String item);
  public A addToNamespaces(java.lang.String... items);
  public A addAllToNamespaces(java.util.Collection<java.lang.String> items);
  public A removeFromNamespaces(java.lang.String... items);
  public A removeAllFromNamespaces(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getNamespaces();
  public java.lang.String getNamespace(java.lang.Integer index);
  public java.lang.String getFirstNamespace();
  public java.lang.String getLastNamespace();
  public java.lang.String getMatchingNamespace(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingNamespace(java.util.function.Predicate<java.lang.String> predicate);
  public A withNamespaces(java.util.List<java.lang.String> namespaces);
  public A withNamespaces(java.lang.String... namespaces);
  public java.lang.Boolean hasNamespaces();
  public A addNewNamespace(java.lang.String arg0);
  public A addToResources(java.lang.Integer index,java.lang.String item);
  public A setToResources(java.lang.Integer index,java.lang.String item);
  public A addToResources(java.lang.String... items);
  public A addAllToResources(java.util.Collection<java.lang.String> items);
  public A removeFromResources(java.lang.String... items);
  public A removeAllFromResources(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getResources();
  public java.lang.String getResource(java.lang.Integer index);
  public java.lang.String getFirstResource();
  public java.lang.String getLastResource();
  public java.lang.String getMatchingResource(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingResource(java.util.function.Predicate<java.lang.String> predicate);
  public A withResources(java.util.List<java.lang.String> resources);
  public A withResources(java.lang.String... resources);
  public java.lang.Boolean hasResources();
  public A addNewResource(java.lang.String arg0);
  public A addToVerbs(java.lang.Integer index,java.lang.String item);
  public A setToVerbs(java.lang.Integer index,java.lang.String item);
  public A addToVerbs(java.lang.String... items);
  public A addAllToVerbs(java.util.Collection<java.lang.String> items);
  public A removeFromVerbs(java.lang.String... items);
  public A removeAllFromVerbs(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getVerbs();
  public java.lang.String getVerb(java.lang.Integer index);
  public java.lang.String getFirstVerb();
  public java.lang.String getLastVerb();
  public java.lang.String getMatchingVerb(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingVerb(java.util.function.Predicate<java.lang.String> predicate);
  public A withVerbs(java.util.List<java.lang.String> verbs);
  public A withVerbs(java.lang.String... verbs);
  public java.lang.Boolean hasVerbs();
  public A addNewVerb(java.lang.String arg0);
  
}