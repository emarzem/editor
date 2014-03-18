      
package com.mentor.nucleus.bp.ui.canvas ;
//====================================================================
//
// File:      com.mentor.nucleus.bp.ui.canvas.Layer_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

import com.mentor.nucleus.bp.core.*;
import org.eclipse.swt.graphics.GC;
import java.util.* ;
import java.lang.reflect.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import com.mentor.nucleus.bp.core.util.PersistenceUtil;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.mentor.nucleus.bp.core.ui.marker.UmlProblem;
import org.eclipse.swt.graphics.Color;
import com.mentor.nucleus.bp.core.common.*;      
abstract class EV_LAYER extends genericEvent_c 
{
  public abstract int getEvtcode() ;
}

public class Layer_c extends NonRootModelElement implements IAdaptable, Cloneable
{
  // Public Constructors
  public Layer_c(ModelRoot modelRoot,
       String       p_m_layer_name,
       boolean      p_m_visible,
       java.util.UUID         p_m_diagramid)
  {
    super(modelRoot);
       m_layer_name = p_m_layer_name;
       //pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
       m_diagramid = IdAssigner.preprocessUUID(p_m_diagramid);
       m_visible = p_m_visible;
        
    Object [] key = {m_layer_name};
    addInstanceToMap(key);
  }
  static public Layer_c createProxy(ModelRoot modelRoot,
       String       p_m_layer_name,
       boolean      p_m_visible,
       java.util.UUID         p_m_diagramid, String p_contentPath, IPath p_localPath)
  {
	  ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot, p_contentPath, p_localPath);
	  // if a model root was not resolved it is most likely
	  // due to a missing file of the proxy, defualt back to
	  // the original model root
	  if(resolvedModelRoot != null)
	  	modelRoot = resolvedModelRoot;
      InstanceList instances = modelRoot.getInstanceList(Layer_c.class);
      Layer_c new_inst = null;
      synchronized(instances) {
          Object[] key = {p_m_layer_name};
          new_inst = (Layer_c) instances.get(key) ;
        }
	String contentPath = PersistenceUtil.resolveRelativePath(
			p_localPath,
			new Path(p_contentPath));
	if(modelRoot.isNewCompareRoot()) {
	      // for comparisons we do not want to change
	      // the content path
	      contentPath = p_contentPath;
	}
	if ( new_inst != null && !modelRoot.isCompareRoot()) {
		PersistableModelComponent pmc = new_inst.getPersistableComponent();
		if (pmc == null) {
			// dangling reference, redo this instance
			new_inst.batchUnrelate();
       new_inst.m_layer_name = p_m_layer_name;
       //pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
       new_inst.m_diagramid = IdAssigner.preprocessUUID(p_m_diagramid);
       new_inst.m_visible = p_m_visible;
        
		}
	}
	if ( new_inst == null ) {
		// there is no instance matching the id, create a proxy
		// if the resource doesn't exist then this will be a dangling reference
    	new_inst = new Layer_c(modelRoot,
p_m_layer_name,
p_m_visible,
p_m_diagramid
);
		new_inst.m_contentPath = contentPath;
	}
    return new_inst;
  }

  static public Layer_c resolveInstance(ModelRoot modelRoot,
       String       p_m_layer_name,
       boolean      p_m_visible,
       java.util.UUID         p_m_diagramid){
    InstanceList instances = modelRoot.getInstanceList(Layer_c.class);
    Layer_c source = null;
    synchronized(instances) {
        Object [] key = {
        p_m_layer_name
            };
        source = (Layer_c) instances.get(key);
        if (source != null && !modelRoot.isCompareRoot()) {
           source.convertFromProxy();
           source.batchUnrelate();
       source.m_layer_name = p_m_layer_name;
       //pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
       source.m_diagramid = IdAssigner.preprocessUUID(p_m_diagramid);
       source.m_visible = p_m_visible;
        
           return source ;
        }
      }
      // there is no instance matching the id
    Layer_c new_inst = new Layer_c(modelRoot,
p_m_layer_name,
p_m_visible,
p_m_diagramid
);
    return new_inst;
  }
  public Layer_c(ModelRoot modelRoot)
  {
    super(modelRoot);
     m_layer_name = "";   
     m_diagramid = IdAssigner.NULL_UUID;   
    Object [] key = {m_layer_name};
    addInstanceToMap(key);
  }

  public Object getInstanceKey() {
    Object [] key =  {m_layer_name};
		return key;
  }
  
  public boolean setInstanceKey(UUID p_newKey){
  
  	boolean changed = false;
		// round p1
		// round p2
		// round p3
			// round p6
		// round p7
  	return changed;
  }
  

  



  public boolean equals (Object elem) {
     if (!(elem instanceof Layer_c)) {
         return false;
     }
	    // check that the model-roots are the same
    	if (((NonRootModelElement)elem).getModelRoot() != getModelRoot()) {
    		return false;
    	}
    	
     return identityEquals(elem);
  }
  
   public boolean identityEquals(Object elem) {
       if (!(elem instanceof Layer_c)) {
           return false;
       }
       
       Layer_c me = (Layer_c)elem;
      if (!getLayer_name().equals(((Layer_c)elem).getLayer_name())) return false;    
      return true;
    }

   public boolean cachedIdentityEquals(Object elem) {
       if (!(elem instanceof Layer_c)) {
           return false;
       }
       
       Layer_c me = (Layer_c)elem;
      if (!getLayer_name().equals(((Layer_c)elem).getLayer_name())) return false;   
      return true;
    }


  // Attributes
  private String       m_layer_name ;
  private java.util.UUID         m_diagramid ;
  private boolean      m_visible ;
      
// declare association references from this class
  
  
    
// referring navigation

Model_c ContainsElementsOfModel ;
public void relateAcrossR34To(Model_c target)
{
	relateAcrossR34To(target, true);
}
public void relateAcrossR34To(Model_c target, boolean notifyChanges)
{
	if (target == null) return;
	
	if (target == ContainsElementsOfModel) return;  // already related

    if ( ContainsElementsOfModel != target ) {
    
    Object oldKey = getInstanceKey();

    if (ContainsElementsOfModel != null) {
    
        ContainsElementsOfModel.clearBackPointerR34To(this);
        
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) {   //$NON-NLS-1$
		Ooaofgraphics.log.println(ILogger.CONSISTENCY, 
			"Layer_c.relateAcrossR34To(Model_c target)", 
			"Relate performed across R34 from Layer to Model without unrelate of prior instance.");  
		}
    }
                
    	ContainsElementsOfModel = target ;
        if(IdAssigner.NULL_UUID.equals(target.getDiagramid()))
        {
            // do not update cached value
        } else {
          // update cached value
          m_diagramid = target.getDiagramidCachedValue();
        }
      updateInstanceKey(oldKey, getInstanceKey());
	    target.setBackPointerR34To(this);
        target.addRef();
      if(notifyChanges) {
	    	RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(Modeleventnotification_c.DELTA_ELEMENT_RELATED, this, target, "34", "");
        Ooaofgraphics.getDefaultInstance().fireModelElementRelationChanged(change);
      }
    }
}
public void unrelateAcrossR34From(Model_c target)
{
	unrelateAcrossR34From(target, true);
}
public void unrelateAcrossR34From(Model_c target, boolean notifyChanges)
{
	if (target == null) return;
	
	if (ContainsElementsOfModel == null) return;  // already unrelated
	
	if (target != ContainsElementsOfModel) {
		Exception e = new Exception();
		e.fillInStackTrace();
		CanvasPlugin.logError("Tried to unrelate from non-related instance across R34", e);
		return;
	}

    if (target != null) {
        target.clearBackPointerR34To(this);
    }
    

      if(ContainsElementsOfModel != null) {
      
        m_diagramid = ContainsElementsOfModel.getDiagramid();
        if(IdAssigner.NULL_UUID.equals(m_diagramid))
        {
          m_diagramid = ContainsElementsOfModel.getDiagramidCachedValue();
        }       
        ContainsElementsOfModel = null ;
        target.removeRef();
      if(notifyChanges) { 
        RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this, target, "34", "");
        Ooaofgraphics.getDefaultInstance().fireModelElementRelationChanged(change);
      }
    }
}

  
    
      
public static Layer_c getOneGD_LAYOnR34(Model_c [] targets)
{
    return getOneGD_LAYOnR34(targets, null);
}

public static Layer_c getOneGD_LAYOnR34(Model_c [] targets, ClassQueryInterface_c test)
{
    Layer_c ret_val = null;
    if (targets != null)
    {
        for (int i = 0; i < targets.length && ret_val == null; ++i )
        {
           ret_val = getOneGD_LAYOnR34(targets[i], test);
        }
    }

    return ret_val;
}

public static Layer_c getOneGD_LAYOnR34(Model_c target)
{
  return getOneGD_LAYOnR34(target, null);
}

public static Layer_c getOneGD_LAYOnR34(Model_c target, boolean loadComponent)
{
    return getOneGD_LAYOnR34(target.getModelRoot(), target, null, loadComponent);
}

public static Layer_c getOneGD_LAYOnR34(Model_c target, ClassQueryInterface_c test)
{
  if (target != null) {
    return getOneGD_LAYOnR34(target.getModelRoot(), target, test);
  }
  return null;
}

public static Layer_c getOneGD_LAYOnR34(ModelRoot modelRoot, Model_c target, ClassQueryInterface_c test)
{
	return getOneGD_LAYOnR34(modelRoot, target, test, true);
}

public static Layer_c getOneGD_LAYOnR34(ModelRoot modelRoot, Model_c target, ClassQueryInterface_c test, boolean loadComponent)
{
   return find_getOneGD_LAYOnR34(modelRoot,target,test);
}
private static Layer_c find_getOneGD_LAYOnR34(ModelRoot modelRoot, Model_c target, ClassQueryInterface_c test)
{
  if (target != null) {
    synchronized(target.backPointer_ContentsDisplayedInLayerContentsDisplayedIn_R34) {
	    for ( int i = 0; i < target.backPointer_ContentsDisplayedInLayerContentsDisplayedIn_R34.size(); ++i ) {
	      Layer_c source = (Layer_c)target.backPointer_ContentsDisplayedInLayerContentsDisplayedIn_R34.get(i) ;
	      if (source != null && (test == null || test.evaluate(source))) {
	        return source ;
      }
    }
  }
  }
  // not found
  return null ;
}

public static Layer_c [] getManyGD_LAYsOnR34(Model_c [] targets)
{
  return getManyGD_LAYsOnR34(targets, null);
}
public static Layer_c [] getManyGD_LAYsOnR34(Model_c [] targets, boolean loadComponent)
{
  return getManyGD_LAYsOnR34(targets, null, loadComponent);
}
public static Layer_c [] getManyGD_LAYsOnR34(Model_c [] targets, ClassQueryInterface_c test)
{
	return getManyGD_LAYsOnR34(targets, test, true);
}

public static Layer_c [] getManyGD_LAYsOnR34(Model_c [] targets, ClassQueryInterface_c test, boolean loadComponent)
{

  if(targets == null || targets.length == 0 || targets[0] == null)
  	return new Layer_c[0];

  ModelRoot modelRoot = targets[0].getModelRoot();
 
   InstanceList instances = modelRoot.getInstanceList(Layer_c.class);

  Vector matches = new Vector();
  for (int i = 0 ; i < targets.length ; i++) {
    synchronized(targets[i].backPointer_ContentsDisplayedInLayerContentsDisplayedIn_R34) {
	    for (int j = 0; j < targets[i].backPointer_ContentsDisplayedInLayerContentsDisplayedIn_R34.size(); ++j) {
	      Layer_c source = (Layer_c)targets[i].backPointer_ContentsDisplayedInLayerContentsDisplayedIn_R34.get(j) ;
          if (source != null && (test == null || test.evaluate(source))) {
	        matches.add(source);
    }
  }
    }
  }
  if (matches.size() > 0) {
	Layer_c[] ret_set = new Layer_c[matches.size()];
	matches.copyInto(ret_set);
	return ret_set;
  } else {
	return new Layer_c[0];
  }
  }

public static Layer_c [] getManyGD_LAYsOnR34(Model_c target)
{
  return getManyGD_LAYsOnR34(target, null);
}

public static Layer_c [] getManyGD_LAYsOnR34(Model_c target, boolean loadComponent)
{
  return getManyGD_LAYsOnR34(target, null, loadComponent);
}

public static Layer_c [] getManyGD_LAYsOnR34(Model_c target, ClassQueryInterface_c test)
{
	return getManyGD_LAYsOnR34(target, test, true);
}

public static Layer_c [] getManyGD_LAYsOnR34(Model_c target, ClassQueryInterface_c test, boolean loadComponent)
{
  if(target == null)
    return new Layer_c[0];    

  ModelRoot modelRoot = target.getModelRoot();
  Vector matches = new Vector();
  synchronized(target.backPointer_ContentsDisplayedInLayerContentsDisplayedIn_R34) {
    for (int i = 0; i < target.backPointer_ContentsDisplayedInLayerContentsDisplayedIn_R34.size(); ++i) {
      Layer_c source = (Layer_c)target.backPointer_ContentsDisplayedInLayerContentsDisplayedIn_R34.get(i);
      if (source != null && (test == null || test.evaluate(source))) {

        matches.add(source);
	  }
	}
  }
  
	if (matches.size() > 0) {
		Layer_c[] ret_set = new Layer_c[matches.size()];
		matches.copyInto(ret_set);
		return ret_set;
	} else {
		return new Layer_c[0];
	}
  }



// declare associations referring to this class

    
  
  
// referred to navigation

ArrayList<Graphicalelementinlayer_c> backPointer_ContainsGraphicalelementinlayerContains_R35 = new ArrayList<Graphicalelementinlayer_c>();

public void setGraphicalelementinlayerOrderInChildListR35(Graphicalelementinlayer_c target, int index) {
	unrelateAcrossR35From(target);
	Graphicalelementinlayer_c[] elements = Graphicalelementinlayer_c.getManyGD_GLAYsOnR35(this);
	int count = 0;
	for(int i = 0; i < elements.length; i++) {
		if(count >= index) {
			unrelateAcrossR35From((Graphicalelementinlayer_c) elements[i]); 
		}
		count++;
	}
	relateAcrossR35To(target);
	count = 0;
	for(int i = 0; i < elements.length; i++) {
		if(count >= index) {
			relateAcrossR35To((Graphicalelementinlayer_c) elements[i]);
		}
		count++;
	}
}

public void relateAcrossR35To(Graphicalelementinlayer_c target)
{
  if (target != null) {
    target.relateAcrossR35To(this, true) ;
  }
}

public void relateAcrossR35To(Graphicalelementinlayer_c target, boolean notifyChanges)
{
  if (target != null) {
    target.relateAcrossR35To(this, notifyChanges) ;
  }
}

public void setBackPointerR35To(Graphicalelementinlayer_c target)
{
  	synchronized (backPointer_ContainsGraphicalelementinlayerContains_R35) {
		backPointer_ContainsGraphicalelementinlayerContains_R35.add(target);
	}
}

public void unrelateAcrossR35From(Graphicalelementinlayer_c target)
{
  if (target != null) {
    target.unrelateAcrossR35From(this, true) ;
  }
}

public void unrelateAcrossR35From(Graphicalelementinlayer_c target, boolean notifyChanges)
{
  if (target != null) {
    target.unrelateAcrossR35From(this, notifyChanges) ;
  }
}

public void clearBackPointerR35To(Graphicalelementinlayer_c target)
{
  synchronized (backPointer_ContainsGraphicalelementinlayerContains_R35) {
	    backPointer_ContainsGraphicalelementinlayerContains_R35.remove(target);
	}
}

public static Layer_c getOneGD_LAYOnR35(Graphicalelementinlayer_c [] targets)
{
    return getOneGD_LAYOnR35(targets, null);
}

public static Layer_c getOneGD_LAYOnR35(Graphicalelementinlayer_c [] targets, ClassQueryInterface_c test)
{
    return getOneGD_LAYOnR35(targets, test, true);
}

public static Layer_c getOneGD_LAYOnR35(Graphicalelementinlayer_c [] targets, ClassQueryInterface_c test, boolean loadComponent)
{
    Layer_c ret_val = null;
    if (targets != null)
    {
        for (int i = 0; i < targets.length && ret_val == null; ++i )
        {
           if (test != null) {
             Layer_c candidate_val = getOneGD_LAYOnR35(targets[i],true);
             if ( candidate_val != null && test.evaluate(candidate_val) )
             {
               ret_val = candidate_val;
               break;
             }
           }
           else {
             ret_val = getOneGD_LAYOnR35(targets[i], loadComponent);
             if (ret_val != null) {
               break;
             }
           }
        }
    }
    return ret_val;
}

public static Layer_c getOneGD_LAYOnR35(Graphicalelementinlayer_c target)
{
	return getOneGD_LAYOnR35(target, true);
}
public static Layer_c getOneGD_LAYOnR35(Graphicalelementinlayer_c target, boolean loadComponent)
{
  if (target != null) {
	if(loadComponent){
	     target.loadProxy();
	}
    return target.ContainedInLayer ;
  } else {
    return null;
  }
}

public static Layer_c [] getManyGD_LAYsOnR35(Graphicalelementinlayer_c [] targets,
    ClassQueryInterface_c test)
{
	return getManyGD_LAYsOnR35(targets, test, true);
}

public static Layer_c [] getManyGD_LAYsOnR35(Graphicalelementinlayer_c [] targets,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if(targets == null || targets.length == 0 || targets[0] == null)
    return new Layer_c[0];
  
  
  LinkedHashSet<Layer_c> elementsSet = new LinkedHashSet<Layer_c>();
  for (int i = 0; i < targets.length; i++) {
	if(loadComponent && targets[i] != null && targets[i].ContainedInLayer == null)
	  targets[i].loadProxy();
    Layer_c associate = targets[i].ContainedInLayer;
    if (targets[i] != null && associate != null
    	&& (test == null || test.evaluate(associate))) {
        	if (elementsSet.add(associate)){ 
            }
    }
  }

  Layer_c[] result = new Layer_c[elementsSet.size()];
  elementsSet.toArray(result);
  return result;
}

public static Layer_c [] getManyGD_LAYsOnR35(Graphicalelementinlayer_c [] targets)
{
  return getManyGD_LAYsOnR35(targets, null);
}

public static Layer_c [] getManyGD_LAYsOnR35(Graphicalelementinlayer_c target,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if (target != null) {
    Graphicalelementinlayer_c [] targetArray = new Graphicalelementinlayer_c[1];
    targetArray[0] = target;
    return getManyGD_LAYsOnR35(targetArray, test, loadComponent);
  } else {
    Layer_c [] result = new Layer_c [0] ;
    return result ;
  }
  
}

public static Layer_c [] getManyGD_LAYsOnR35(Graphicalelementinlayer_c target,
    ClassQueryInterface_c test)
{
    return getManyGD_LAYsOnR35(target, null, true);
}

public static Layer_c [] getManyGD_LAYsOnR35(Graphicalelementinlayer_c target)
{
    return getManyGD_LAYsOnR35(target, null, true);
}

public static Layer_c [] getManyGD_LAYsOnR35(Graphicalelementinlayer_c target, boolean loadComponent)
{
    return getManyGD_LAYsOnR35(target, null, loadComponent);
}

public static Layer_c getOneGD_LAYOnR35(GraphicalElement_c target)
{
  return Layer_c.getOneGD_LAYOnR35(Graphicalelementinlayer_c.getOneGD_GLAYOnR35(target)) ;
}

public static Layer_c getOneGD_LAYOnR35(GraphicalElement_c target,
    ClassQueryInterface_c test)
{
  return Layer_c.getOneGD_LAYOnR35(Graphicalelementinlayer_c.getManyGD_GLAYsOnR35(target), test) ;
}

public static Layer_c [] getManyGD_LAYsOnR35(GraphicalElement_c target,
    ClassQueryInterface_c test)
{
	return getManyGD_LAYsOnR35(target, test, true);
}
public static Layer_c [] getManyGD_LAYsOnR35(GraphicalElement_c target,
    ClassQueryInterface_c test, boolean loadComponent)
{

  Graphicalelementinlayer_c [] associators = Graphicalelementinlayer_c.getManyGD_GLAYsOnR35(target, loadComponent) ;
    return Layer_c.getManyGD_LAYsOnR35(associators, test, loadComponent) ;
}
public static Layer_c [] getManyGD_LAYsOnR35(GraphicalElement_c target)
{
    return getManyGD_LAYsOnR35(target, null, true);
}
public static Layer_c [] getManyGD_LAYsOnR35(GraphicalElement_c target, boolean loadComponent)
{
    return getManyGD_LAYsOnR35(target, null, loadComponent);
}


      
  public void batchRelate(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots)
  {
      batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
  }
  
  public void batchRelate(ModelRoot modelRoot, boolean relateProxies, boolean notifyChanges, boolean searchAllRoots)
  {
        InstanceList instances=null;
        ModelRoot baseRoot = modelRoot;

	if (ContainsElementsOfModel == null) {          
      // R34
      Model_c relInst22209 = (Model_c) baseRoot.getInstanceList(Model_c.class).get(new Object[] {m_diagramid});
            // if there was no local element, check for any global elements
            // failing that proceed to check other model roots
      		if (relInst22209 == null) {
      			relInst22209 = (Model_c) Ooaofooa.getDefaultInstance().getInstanceList(Model_c.class).get(new Object[] {m_diagramid});
      		}
			//synchronized
      if ( relInst22209 != null )
      {
          if (relateProxies || !isProxy() || (inSameComponent(this, relInst22209) && !isProxy())) {
	      relInst22209.relateAcrossR34To(this, notifyChanges);
	  }
	  }
	}
	          
	}
  public void batchUnrelate(boolean notifyChanges)
  {
		NonRootModelElement inst=null;
      // R34
      // GD_MD
		  inst=ContainsElementsOfModel;
			unrelateAcrossR34From(ContainsElementsOfModel, notifyChanges);
          if ( inst != null ) {
			   inst.removeRef();
	      }
	}
  public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
  }	  
  public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(Layer_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final Layer_c inst = (Layer_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }

  public static void clearInstances(ModelRoot modelRoot)
  {
    InstanceList instances = modelRoot.getInstanceList(Layer_c.class);
    synchronized(instances) {
       for(int i=instances.size()-1; i>=0; i--){
              ((NonRootModelElement)instances.get(i)).delete_unchecked();
       }
    
    }
  }

  public static Layer_c LayerInstance(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
  {
  		Layer_c result=findLayerInstance(modelRoot,test,loadComponent);
	  return result;  
  }
private static Layer_c findLayerInstance(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
{
	InstanceList instances = modelRoot.getInstanceList(Layer_c.class);
		synchronized (instances) {
            for (int i = 0; i < instances.size(); ++i) {
				Layer_c x = (Layer_c) instances.get(i);
				if (test==null || test.evaluate(x)){
					return x;
			}
		}
		}
			return null;
}
  public static Layer_c LayerInstance(ModelRoot modelRoot, ClassQueryInterface_c test){
     return LayerInstance(modelRoot,test,true);
  }
  
  public static Layer_c LayerInstance(ModelRoot modelRoot)
  {
	 return LayerInstance(modelRoot,null,true);
  }

  public static Layer_c [] LayerInstances(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
  {	
		    InstanceList instances = modelRoot.getInstanceList(Layer_c.class);
			Vector matches = new Vector();
			synchronized (instances) {
                for (int i = 0; i < instances.size(); ++i) {
					Layer_c x = (Layer_c) instances.get(i);
					if (test==null ||test.evaluate(x)){
						matches.add(x);
			    }
				}
			if (matches.size() > 0) {
				Layer_c[] ret_set = new Layer_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new Layer_c[0];
			}		
		} 
  }
  public static Layer_c [] LayerInstances(ModelRoot modelRoot, ClassQueryInterface_c test){
    return  LayerInstances(modelRoot,test,true);
  }
  public static Layer_c [] LayerInstances(ModelRoot modelRoot)
  {
	return LayerInstances(modelRoot,null,true);
  }

  public boolean delete()
  {
    boolean result = super.delete();
	boolean delete_error = false;
	String errorMsg = "The following relationships were not torn down by the Layer.dispose call: ";
	Model_c testR34Inst = Model_c.getOneGD_MDOnR34(this, false);

	if ( testR34Inst != null )
	{
   	delete_error = true;	        
	errorMsg = errorMsg + "34 ";
	}
	Graphicalelementinlayer_c testR35Inst = Graphicalelementinlayer_c.getOneGD_GLAYOnR35(this, false);

	if ( testR35Inst != null )
	{
   	delete_error = true;	        
	errorMsg = errorMsg + "35 ";
	}
	if(delete_error == true) {

		if(CanvasPlugin.getDefault().isDebugging()) {
			Ooaofgraphics.log.println(ILogger.DELETE, "Layer", errorMsg);
		}
		else {
			Exception e = new Exception();
            e.fillInStackTrace();
			CanvasPlugin.logError(errorMsg, e);
		}
	}
	return result;
  }

  // end declare instance pool

  // declare attribute accessors
  public boolean isUUID(String attributeName){
      if(attributeName.equals("diagramid")){
         return true;
      }
      return false;      
  }      
  // declare attribute accessors
  public String getLayer_name()
  {
    return m_layer_name ;
  }


  public void setLayer_name(String newValue)
  {
	if(newValue != null){
	    if(newValue.equals(m_layer_name)){
	        return;
	    }
	}else if(m_layer_name != null){
	    if(m_layer_name.equals(newValue)){
	        return;
	    }
	}else{
	    return;
	}
	AttributeChangeModelDelta change = new AttributeChangeModelDelta(Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Layer_name", m_layer_name, newValue,true); 
   m_layer_name = newValue ;
    Ooaofgraphics.getDefaultInstance().fireModelElementAttributeChanged(change);
  }
  public long getDiagramidLongBased()
  {
    if ( ContainsElementsOfModel != null )
    {
      return ContainsElementsOfModel.getDiagramidLongBased();
    }
    return 0;  
  }          
  public java.util.UUID getDiagramid()
  {
    if ( ContainsElementsOfModel != null )
    {
      return ContainsElementsOfModel.getDiagramid();
    }
    return IdAssigner.NULL_UUID;
  }


  public java.util.UUID getDiagramidCachedValue()
  {
    if ( !IdAssigner.NULL_UUID.equals(m_diagramid) )
      return m_diagramid;
    else
      return getDiagramid();
  }
  
  public void setDiagramid(java.util.UUID newValue)
  {
	if(newValue != null){
	    if(newValue.equals(m_diagramid)){
	        return;
	    }
	}else if(m_diagramid != null){
	    if(m_diagramid.equals(newValue)){
	        return;
	    }
	}else{
	    return;
	}
	AttributeChangeModelDelta change = new AttributeChangeModelDelta(Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Diagramid", m_diagramid, newValue,true); 
   m_diagramid = IdAssigner.preprocessUUID(newValue);
    Ooaofgraphics.getDefaultInstance().fireModelElementAttributeChanged(change);
  }
  public boolean getVisible()
  {
    return m_visible ;
  }


  public void setVisible(boolean newValue)
  {
    if(m_visible == newValue){
        return;
    }
    AttributeChangeModelDelta change = new AttributeChangeModelDelta(Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Visible", new Boolean(m_visible), new Boolean(newValue),true);

   m_visible = newValue ;
    Ooaofgraphics.getDefaultInstance().fireModelElementAttributeChanged(change);
  }
  // end declare accessors
  public static void checkClassConsistency (ModelRoot modelRoot) {
    Ooaofooa.log.println(
	  ILogger.OPERATION,
	  "Layer", //$NON-NLS-1$
	  " Operation entered: Layer::checkClassConsistency"); //$NON-NLS-1$
     if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) {  //$NON-NLS-1$
       return;
     }
     Layer_c [] objs = Layer_c.LayerInstances(modelRoot,null,false); 
     
     for ( int i = 0; i < objs.length; i++) {
       objs[i].checkConsistency();
     }  
  } 
  public boolean checkConsistency () {
    Ooaofooa.log.println(
	  ILogger.OPERATION,
	  "Layer", //$NON-NLS-1$
	  " Operation entered: Layer::checkConsistency");  //$NON-NLS-1$
    if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) {  //$NON-NLS-1$
      return true;
    }
	ModelRoot modelRoot = getModelRoot();
    boolean      retval = true;
    class Layer_c_test22211_c implements ClassQueryInterface_c
    {
	  Layer_c_test22211_c( String          p22212 ) {
	  m_p22212 = p22212;
	  }
	  private String           m_p22212; 
	  public boolean evaluate (Object candidate)
	  {
	      Layer_c selected = (Layer_c) candidate;
	      boolean retval = false;
	      retval = (selected.getLayer_name().equals(m_p22212));
	      return retval;
	  }
    }

    Layer_c [] objs22210 = 
    Layer_c.LayerInstances(modelRoot, new Layer_c_test22211_c(getLayer_name())) ;

    if ( (  (objs22210.length) == 0) )
    {

      if (CanvasPlugin.getDefault().isDebugging()){
          Ooaofgraphics.log.println(ILogger.CONSISTENCY, "Layer", //$NON-NLS-1$
           "Consistency: Object: Layer: Cardinality of an identifier is zero. " //$NON-NLS-1$
           + "Actual Value: " + Integer.toString( objs22210.length ) ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CanvasPlugin.logError("Consistency: Object: Layer: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs22210.length )  , e); 
      }
      retval = false;

    }

    if ( (  (objs22210.length) > 1) )
    {

      if (CanvasPlugin.getDefault().isDebugging()){
          Ooaofgraphics.log.println(ILogger.CONSISTENCY, "Layer", //$NON-NLS-1$
           "Consistency: Object: Layer: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
           + "Actual Value: " //$NON-NLS-1$ 
           + Integer.toString( objs22210.length )  + " Layer_Name: " + getLayer_name() ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CanvasPlugin.logError("Consistency: Object: Layer: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs22210.length )  + " Layer_Name: " + getLayer_name() , e); //$NON-NLS-1$
      }
      retval = false;

    }

          // Layer is a referring class in association: rel.Numb = 34
          // The participating class is: Model
    class Model_c_test22216_c implements ClassQueryInterface_c
    {
	  Model_c_test22216_c( java.util.UUID            p22217 ) {
	  m_p22217 = p22217;
	  }
	  private java.util.UUID             m_p22217; 
	  public boolean evaluate (Object candidate)
	  {
	      Model_c selected = (Model_c) candidate;
	      boolean retval = false;
	      retval = (selected.getDiagramid().equals(m_p22217));
	      return retval;
	  }
    }

    Model_c [] objs22215 = 
    Model_c.ModelInstances(modelRoot, new Model_c_test22216_c(getDiagramid())) ;

          // The participant is unconditional
          // The multiplicity of the participant is one
    if ( (  (objs22215.length) != 1) )
    {

      if (CanvasPlugin.getDefault().isDebugging()){
          Ooaofgraphics.log.println(ILogger.CONSISTENCY, "Layer", //$NON-NLS-1$
           "Consistency: Object: Layer: Association: 34: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$
           + "Actual Value: " //$NON-NLS-1$ 
           + Integer.toString( objs22215.length )  + " diagramId: " + "Not Printable" ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CanvasPlugin.logError("Consistency: Object: Layer: Association: 34: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs22215.length )  + " diagramId: " + "Not Printable" , e); //$NON-NLS-1$
      }
      retval = false;

    }

          // Associated One Side: rel.Numb = 35
            // Link Object: GraphicalElementInLayer
            // Other Side Class: Graphical Element
    return retval;
  }


  // declare transform functions
  public  void Addelementtolayer(final java.util.UUID         p_Elementid)
  {
      Ooaofgraphics.log.println(ILogger.OPERATION, "Layer", " Operation entered: Layer::Addelementtolayer") ; 
               final ModelRoot modelRoot = getModelRoot();
  class GraphicalElement_test21569_c implements ClassQueryInterface_c
  {
	public boolean evaluate (Object candidate)
	{
		GraphicalElement_c selected = (GraphicalElement_c)candidate;
		return (selected.getElementid().equals(p_Elementid)) ;
	}
  }
GraphicalElement_c v_ge = GraphicalElement_c.getOneGD_GEOnR1(Model_c.getManyGD_MDsOnR34(this), new GraphicalElement_test21569_c());


if ( (  (v_ge != null)) )
{

Graphicalelementinlayer_c v_glay = new Graphicalelementinlayer_c(modelRoot) ;
Ooaofgraphics.getDefaultInstance().fireModelElementCreated(new BaseModelDelta(Modeleventnotification_c.DELTA_NEW, v_glay));


if (v_glay != null) {
  v_glay.relateAcrossR35To( this ) ;   v_glay.relateAcrossR35To( v_ge ) ;
}
else {
  Throwable t = new Throwable();
  t.fillInStackTrace();
  CorePlugin.logError("Relate using attempted on null link class instance.", t);
}



}


   } // End addElementToLayer
  public  void Dispose()
  {
      Ooaofgraphics.log.println(ILogger.OPERATION, "Layer", " Operation entered: Layer::Dispose") ; 
               final ModelRoot modelRoot = getModelRoot();
Model_c v_model = Model_c.getOneGD_MDOnR34(this);


if ( (  (v_model != null)) )
{

this.unrelateAcrossR34From(v_model);



}

Graphicalelementinlayer_c [] v_glays = Graphicalelementinlayer_c.getManyGD_GLAYsOnR35(this);


Graphicalelementinlayer_c  v_glay = null;
for ( int i21361 = 0; i21361 < v_glays.length; i21361++)
{
  v_glay = v_glays[i21361] ;

GraphicalElement_c v_element = GraphicalElement_c.getOneGD_GEOnR35(v_glay);


if (v_glay != null) {
v_glay.unrelateAcrossR35From( this ) ; v_glay.unrelateAcrossR35From( v_element ) ;
}
else {
  Throwable t = new Throwable();
  t.fillInStackTrace();
  CorePlugin.logError("Unrelate using attempted on null link class instance.", t);
}


if (v_glay != null) {
// get the location of this element in the instance list
// before deleting
if ( v_glay.delete() ) {
    Ooaofgraphics.getDefaultInstance().fireModelElementDeleted(new BaseModelDelta(Modeleventnotification_c.DELTA_DELETE, v_glay));
}
}
else {
  Throwable t = new Throwable();
  t.fillInStackTrace();
  CorePlugin.logError("Delete attempted on null instance.", t);
}



}

if ( delete() ) {
    Ooaofgraphics.getDefaultInstance().fireModelElementDeleted(new BaseModelDelta(Modeleventnotification_c.DELTA_DELETE, this));
}



   } // End dispose
  public  String       Get_name()
  {
      Ooaofgraphics.log.println(ILogger.OPERATION, "Layer", " Operation entered: Layer::Get_name") ; 
               final ModelRoot modelRoot = getModelRoot();
return getLayer_name();



   } // End get_name

  // end transform functions


  public Object getAdapter(Class adapter) {
    Object superAdapter = super.getAdapter(adapter);
    if(superAdapter != null) {
    	return superAdapter;
    }
	  return null;
  }
} // end Layer
