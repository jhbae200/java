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
public class V1PolicyRuleFluentImpl<A extends io.kubernetes.client.openapi.models.V1PolicyRuleFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PolicyRuleFluent<A>{
  public V1PolicyRuleFluentImpl() {
  }
  public V1PolicyRuleFluentImpl(io.kubernetes.client.openapi.models.V1PolicyRule instance) {
    this.withApiGroups(instance.getApiGroups());

    this.withNonResourceURLs(instance.getNonResourceURLs());

    this.withResourceNames(instance.getResourceNames());

    this.withResources(instance.getResources());

    this.withVerbs(instance.getVerbs());

  }
  private java.util.List<java.lang.String> apiGroups;
  private java.util.List<java.lang.String> nonResourceURLs;
  private java.util.List<java.lang.String> resourceNames;
  private java.util.List<java.lang.String> resources;
  private java.util.List<java.lang.String> verbs;
  public A addToApiGroups(java.lang.Integer index,java.lang.String item) {
    if (this.apiGroups == null) {this.apiGroups = new java.util.ArrayList<java.lang.String>();}
    this.apiGroups.add(index, item);
    return (A)this;
  }
  public A setToApiGroups(java.lang.Integer index,java.lang.String item) {
    if (this.apiGroups == null) {this.apiGroups = new java.util.ArrayList<java.lang.String>();}
    this.apiGroups.set(index, item); return (A)this;
  }
  public A addToApiGroups(java.lang.String... items) {
    if (this.apiGroups == null) {this.apiGroups = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.apiGroups.add(item);} return (A)this;
  }
  public A addAllToApiGroups(java.util.Collection<java.lang.String> items) {
    if (this.apiGroups == null) {this.apiGroups = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.apiGroups.add(item);} return (A)this;
  }
  public A removeFromApiGroups(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.apiGroups!= null){ this.apiGroups.remove(item);}} return (A)this;
  }
  public A removeAllFromApiGroups(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.apiGroups!= null){ this.apiGroups.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getApiGroups() {
    return this.apiGroups;
  }
  public java.lang.String getApiGroup(java.lang.Integer index) {
    return this.apiGroups.get(index);
  }
  public java.lang.String getFirstApiGroup() {
    return this.apiGroups.get(0);
  }
  public java.lang.String getLastApiGroup() {
    return this.apiGroups.get(apiGroups.size() - 1);
  }
  public java.lang.String getMatchingApiGroup(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: apiGroups) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingApiGroup(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: apiGroups) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withApiGroups(java.util.List<java.lang.String> apiGroups) {
    if (apiGroups != null) {this.apiGroups = new java.util.ArrayList(); for (java.lang.String item : apiGroups){this.addToApiGroups(item);}} else { this.apiGroups = null;} return (A) this;
  }
  public A withApiGroups(java.lang.String... apiGroups) {
    if (this.apiGroups != null) {this.apiGroups.clear();}
    if (apiGroups != null) {for (java.lang.String item :apiGroups){ this.addToApiGroups(item);}} return (A) this;
  }
  public java.lang.Boolean hasApiGroups() {
    return apiGroups != null && !apiGroups.isEmpty();
  }
  public A addNewApiGroup(java.lang.String arg0) {
    return (A)addToApiGroups(new String(arg0));
  }
  public A addToNonResourceURLs(java.lang.Integer index,java.lang.String item) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new java.util.ArrayList<java.lang.String>();}
    this.nonResourceURLs.add(index, item);
    return (A)this;
  }
  public A setToNonResourceURLs(java.lang.Integer index,java.lang.String item) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new java.util.ArrayList<java.lang.String>();}
    this.nonResourceURLs.set(index, item); return (A)this;
  }
  public A addToNonResourceURLs(java.lang.String... items) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.nonResourceURLs.add(item);} return (A)this;
  }
  public A addAllToNonResourceURLs(java.util.Collection<java.lang.String> items) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.nonResourceURLs.add(item);} return (A)this;
  }
  public A removeFromNonResourceURLs(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.nonResourceURLs!= null){ this.nonResourceURLs.remove(item);}} return (A)this;
  }
  public A removeAllFromNonResourceURLs(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.nonResourceURLs!= null){ this.nonResourceURLs.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getNonResourceURLs() {
    return this.nonResourceURLs;
  }
  public java.lang.String getNonResourceURL(java.lang.Integer index) {
    return this.nonResourceURLs.get(index);
  }
  public java.lang.String getFirstNonResourceURL() {
    return this.nonResourceURLs.get(0);
  }
  public java.lang.String getLastNonResourceURL() {
    return this.nonResourceURLs.get(nonResourceURLs.size() - 1);
  }
  public java.lang.String getMatchingNonResourceURL(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: nonResourceURLs) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingNonResourceURL(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: nonResourceURLs) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withNonResourceURLs(java.util.List<java.lang.String> nonResourceURLs) {
    if (nonResourceURLs != null) {this.nonResourceURLs = new java.util.ArrayList(); for (java.lang.String item : nonResourceURLs){this.addToNonResourceURLs(item);}} else { this.nonResourceURLs = null;} return (A) this;
  }
  public A withNonResourceURLs(java.lang.String... nonResourceURLs) {
    if (this.nonResourceURLs != null) {this.nonResourceURLs.clear();}
    if (nonResourceURLs != null) {for (java.lang.String item :nonResourceURLs){ this.addToNonResourceURLs(item);}} return (A) this;
  }
  public java.lang.Boolean hasNonResourceURLs() {
    return nonResourceURLs != null && !nonResourceURLs.isEmpty();
  }
  public A addNewNonResourceURL(java.lang.String arg0) {
    return (A)addToNonResourceURLs(new String(arg0));
  }
  public A addToResourceNames(java.lang.Integer index,java.lang.String item) {
    if (this.resourceNames == null) {this.resourceNames = new java.util.ArrayList<java.lang.String>();}
    this.resourceNames.add(index, item);
    return (A)this;
  }
  public A setToResourceNames(java.lang.Integer index,java.lang.String item) {
    if (this.resourceNames == null) {this.resourceNames = new java.util.ArrayList<java.lang.String>();}
    this.resourceNames.set(index, item); return (A)this;
  }
  public A addToResourceNames(java.lang.String... items) {
    if (this.resourceNames == null) {this.resourceNames = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.resourceNames.add(item);} return (A)this;
  }
  public A addAllToResourceNames(java.util.Collection<java.lang.String> items) {
    if (this.resourceNames == null) {this.resourceNames = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.resourceNames.add(item);} return (A)this;
  }
  public A removeFromResourceNames(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.resourceNames!= null){ this.resourceNames.remove(item);}} return (A)this;
  }
  public A removeAllFromResourceNames(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.resourceNames!= null){ this.resourceNames.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getResourceNames() {
    return this.resourceNames;
  }
  public java.lang.String getResourceName(java.lang.Integer index) {
    return this.resourceNames.get(index);
  }
  public java.lang.String getFirstResourceName() {
    return this.resourceNames.get(0);
  }
  public java.lang.String getLastResourceName() {
    return this.resourceNames.get(resourceNames.size() - 1);
  }
  public java.lang.String getMatchingResourceName(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: resourceNames) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingResourceName(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: resourceNames) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withResourceNames(java.util.List<java.lang.String> resourceNames) {
    if (resourceNames != null) {this.resourceNames = new java.util.ArrayList(); for (java.lang.String item : resourceNames){this.addToResourceNames(item);}} else { this.resourceNames = null;} return (A) this;
  }
  public A withResourceNames(java.lang.String... resourceNames) {
    if (this.resourceNames != null) {this.resourceNames.clear();}
    if (resourceNames != null) {for (java.lang.String item :resourceNames){ this.addToResourceNames(item);}} return (A) this;
  }
  public java.lang.Boolean hasResourceNames() {
    return resourceNames != null && !resourceNames.isEmpty();
  }
  public A addNewResourceName(java.lang.String arg0) {
    return (A)addToResourceNames(new String(arg0));
  }
  public A addToResources(java.lang.Integer index,java.lang.String item) {
    if (this.resources == null) {this.resources = new java.util.ArrayList<java.lang.String>();}
    this.resources.add(index, item);
    return (A)this;
  }
  public A setToResources(java.lang.Integer index,java.lang.String item) {
    if (this.resources == null) {this.resources = new java.util.ArrayList<java.lang.String>();}
    this.resources.set(index, item); return (A)this;
  }
  public A addToResources(java.lang.String... items) {
    if (this.resources == null) {this.resources = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.resources.add(item);} return (A)this;
  }
  public A addAllToResources(java.util.Collection<java.lang.String> items) {
    if (this.resources == null) {this.resources = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.resources.add(item);} return (A)this;
  }
  public A removeFromResources(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.resources!= null){ this.resources.remove(item);}} return (A)this;
  }
  public A removeAllFromResources(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.resources!= null){ this.resources.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getResources() {
    return this.resources;
  }
  public java.lang.String getResource(java.lang.Integer index) {
    return this.resources.get(index);
  }
  public java.lang.String getFirstResource() {
    return this.resources.get(0);
  }
  public java.lang.String getLastResource() {
    return this.resources.get(resources.size() - 1);
  }
  public java.lang.String getMatchingResource(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: resources) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingResource(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: resources) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withResources(java.util.List<java.lang.String> resources) {
    if (resources != null) {this.resources = new java.util.ArrayList(); for (java.lang.String item : resources){this.addToResources(item);}} else { this.resources = null;} return (A) this;
  }
  public A withResources(java.lang.String... resources) {
    if (this.resources != null) {this.resources.clear();}
    if (resources != null) {for (java.lang.String item :resources){ this.addToResources(item);}} return (A) this;
  }
  public java.lang.Boolean hasResources() {
    return resources != null && !resources.isEmpty();
  }
  public A addNewResource(java.lang.String arg0) {
    return (A)addToResources(new String(arg0));
  }
  public A addToVerbs(java.lang.Integer index,java.lang.String item) {
    if (this.verbs == null) {this.verbs = new java.util.ArrayList<java.lang.String>();}
    this.verbs.add(index, item);
    return (A)this;
  }
  public A setToVerbs(java.lang.Integer index,java.lang.String item) {
    if (this.verbs == null) {this.verbs = new java.util.ArrayList<java.lang.String>();}
    this.verbs.set(index, item); return (A)this;
  }
  public A addToVerbs(java.lang.String... items) {
    if (this.verbs == null) {this.verbs = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.verbs.add(item);} return (A)this;
  }
  public A addAllToVerbs(java.util.Collection<java.lang.String> items) {
    if (this.verbs == null) {this.verbs = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.verbs.add(item);} return (A)this;
  }
  public A removeFromVerbs(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
  }
  public A removeAllFromVerbs(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getVerbs() {
    return this.verbs;
  }
  public java.lang.String getVerb(java.lang.Integer index) {
    return this.verbs.get(index);
  }
  public java.lang.String getFirstVerb() {
    return this.verbs.get(0);
  }
  public java.lang.String getLastVerb() {
    return this.verbs.get(verbs.size() - 1);
  }
  public java.lang.String getMatchingVerb(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: verbs) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingVerb(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: verbs) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVerbs(java.util.List<java.lang.String> verbs) {
    if (verbs != null) {this.verbs = new java.util.ArrayList(); for (java.lang.String item : verbs){this.addToVerbs(item);}} else { this.verbs = null;} return (A) this;
  }
  public A withVerbs(java.lang.String... verbs) {
    if (this.verbs != null) {this.verbs.clear();}
    if (verbs != null) {for (java.lang.String item :verbs){ this.addToVerbs(item);}} return (A) this;
  }
  public java.lang.Boolean hasVerbs() {
    return verbs != null && !verbs.isEmpty();
  }
  public A addNewVerb(java.lang.String arg0) {
    return (A)addToVerbs(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PolicyRuleFluentImpl that = (V1PolicyRuleFluentImpl) o;
    if (apiGroups != null ? !apiGroups.equals(that.apiGroups) :that.apiGroups != null) return false;
    if (nonResourceURLs != null ? !nonResourceURLs.equals(that.nonResourceURLs) :that.nonResourceURLs != null) return false;
    if (resourceNames != null ? !resourceNames.equals(that.resourceNames) :that.resourceNames != null) return false;
    if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
    if (verbs != null ? !verbs.equals(that.verbs) :that.verbs != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiGroups,  nonResourceURLs,  resourceNames,  resources,  verbs,  super.hashCode());
  }
  
}