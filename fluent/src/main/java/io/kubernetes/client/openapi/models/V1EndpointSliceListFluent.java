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
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EndpointSliceListFluent<A extends io.kubernetes.client.openapi.models.V1EndpointSliceListFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public A addToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1EndpointSlice item);
  public A setToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1EndpointSlice item);
  public A addToItems(io.kubernetes.client.openapi.models.V1EndpointSlice... items);
  public A addAllToItems(java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointSlice> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1EndpointSlice... items);
  public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointSlice> items);
  public A removeMatchingFromItems(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSliceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointSlice> getItems();
  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointSlice> buildItems();
  public io.kubernetes.client.openapi.models.V1EndpointSlice buildItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1EndpointSlice buildFirstItem();
  public io.kubernetes.client.openapi.models.V1EndpointSlice buildLastItem();
  public io.kubernetes.client.openapi.models.V1EndpointSlice buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSliceBuilder> predicate);
  public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSliceBuilder> predicate);
  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1EndpointSlice> items);
  public A withItems(io.kubernetes.client.openapi.models.V1EndpointSlice... items);
  public java.lang.Boolean hasItems();
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.ItemsNested<A> addNewItem();
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1EndpointSlice item);
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.ItemsNested<A> setNewItemLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1EndpointSlice item);
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.ItemsNested<A> editItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.ItemsNested<A> editFirstItem();
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.ItemsNested<A> editLastItem();
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSliceBuilder> predicate);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ListMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
  public interface ItemsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1EndpointSliceFluent<io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ListMetaFluent<io.kubernetes.client.openapi.models.V1EndpointSliceListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}