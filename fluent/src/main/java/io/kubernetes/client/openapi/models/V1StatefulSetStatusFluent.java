package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatefulSetStatusFluent<A extends io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.Integer getAvailableReplicas();
  public A withAvailableReplicas(java.lang.Integer availableReplicas);
  public java.lang.Boolean hasAvailableReplicas();
  public java.lang.Integer getCollisionCount();
  public A withCollisionCount(java.lang.Integer collisionCount);
  public java.lang.Boolean hasCollisionCount();
  public A addToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1StatefulSetCondition item);
  public A setToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1StatefulSetCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1StatefulSetCondition... items);
  public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1StatefulSetCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1StatefulSetCondition... items);
  public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1StatefulSetCondition> items);
  public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatefulSetConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1StatefulSetCondition> getConditions();
  public java.util.List<io.kubernetes.client.openapi.models.V1StatefulSetCondition> buildConditions();
  public io.kubernetes.client.openapi.models.V1StatefulSetCondition buildCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1StatefulSetCondition buildFirstCondition();
  public io.kubernetes.client.openapi.models.V1StatefulSetCondition buildLastCondition();
  public io.kubernetes.client.openapi.models.V1StatefulSetCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatefulSetConditionBuilder> predicate);
  public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatefulSetConditionBuilder> predicate);
  public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1StatefulSetCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1StatefulSetCondition... conditions);
  public java.lang.Boolean hasConditions();
  public io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent.ConditionsNested<A> addNewCondition();
  public io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1StatefulSetCondition item);
  public io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1StatefulSetCondition item);
  public io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent.ConditionsNested<A> editFirstCondition();
  public io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent.ConditionsNested<A> editLastCondition();
  public io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatefulSetConditionBuilder> predicate);
  public java.lang.Integer getCurrentReplicas();
  public A withCurrentReplicas(java.lang.Integer currentReplicas);
  public java.lang.Boolean hasCurrentReplicas();
  public java.lang.String getCurrentRevision();
  public A withCurrentRevision(java.lang.String currentRevision);
  public java.lang.Boolean hasCurrentRevision();
  
  /**
   * Method is deprecated. use withCurrentRevision instead.
   */
  @java.lang.Deprecated
  public A withNewCurrentRevision(java.lang.String arg0);
  public java.lang.Long getObservedGeneration();
  public A withObservedGeneration(java.lang.Long observedGeneration);
  public java.lang.Boolean hasObservedGeneration();
  public java.lang.Integer getReadyReplicas();
  public A withReadyReplicas(java.lang.Integer readyReplicas);
  public java.lang.Boolean hasReadyReplicas();
  public java.lang.Integer getReplicas();
  public A withReplicas(java.lang.Integer replicas);
  public java.lang.Boolean hasReplicas();
  public java.lang.String getUpdateRevision();
  public A withUpdateRevision(java.lang.String updateRevision);
  public java.lang.Boolean hasUpdateRevision();
  
  /**
   * Method is deprecated. use withUpdateRevision instead.
   */
  @java.lang.Deprecated
  public A withNewUpdateRevision(java.lang.String arg0);
  public java.lang.Integer getUpdatedReplicas();
  public A withUpdatedReplicas(java.lang.Integer updatedReplicas);
  public java.lang.Boolean hasUpdatedReplicas();
  public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1StatefulSetConditionFluent<io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}