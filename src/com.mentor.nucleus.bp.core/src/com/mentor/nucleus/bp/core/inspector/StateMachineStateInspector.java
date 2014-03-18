package com.mentor.nucleus.bp.core.inspector;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/inspector/StateMachineStateInspector.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_object_inspector.inc
// Version:      $Revision: 1.23 $
//
// (c) Copyright 2004-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class StateMachineState_c from the traversal mechanisms that it provides to
// model diff.
//
import com.mentor.nucleus.bp.core.*;

import org.eclipse.swt.graphics.Image;

import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import java.util.*;

/**
 * This file adapts the meta-model entity; 'StateMachineState_c' to provide 
 * support of traversing to its children and parents.
 * <p>
 * Do not edit this class, it was created using the Mentor Graphics
 * MC-Java code generator product.
 * </p>
 */
public class StateMachineStateInspector extends BaseModelClassInspector {

  private String parentAssoc;
  
  public StateMachineStateInspector(MetadataSortingManager sortingManager){
    super(sortingManager);
  }

  /**
   * @see IModelClassInspector#getParent(Object)
   * Returns the parent(s) of this node
   */
  public Object getParent(Object arg) {
    InstanceStateMachine_c result1 = InstanceStateMachine_c.getOneSM_ISMOnR517(StateMachine_c.getOneSM_SMOnR501((StateMachineState_c)arg));
     if (result1 != null) {
        return result1;
    }               
    ClassStateMachine_c result2 = ClassStateMachine_c.getOneSM_ASMOnR517(StateMachine_c.getOneSM_SMOnR501((StateMachineState_c)arg));
     if (result2 != null) {
        return result2;
    }               
        return null;    //No parent found           
  }
  	  
  /**
   * @see IModelClassInspector#getChildRelations(Object)
   * Returns the children of this node
   */
  public ObjectElement[] getChildRelations(Object arg) {
    int resultSize = 0;
    StateEventMatrixEntry_c [] v_stateeventmatrixentryEventIgnored = 
StateEventMatrixEntry_c.getManySM_SEMEsOnR504(
EventIgnored_c.getManySM_EIGNsOnR504(
StateEventMatrixEntry_c.getManySM_SEMEsOnR503(
(StateMachineState_c)arg)
)
)
;



    sort(v_stateeventmatrixentryEventIgnored);
    StateEventMatrixEntry_c [] v_stateeventmatrixentryCantHappen = 
StateEventMatrixEntry_c.getManySM_SEMEsOnR504(
CantHappen_c.getManySM_CHsOnR504(
StateEventMatrixEntry_c.getManySM_SEMEsOnR503(
(StateMachineState_c)arg)
)
)
;



    sort(v_stateeventmatrixentryCantHappen);
    Action_c [] v_action = 
Action_c.getManySM_ACTsOnR514(
ActionHome_c.getManySM_AHsOnR513(
MooreActionHome_c.getManySM_MOAHsOnR511(
(StateMachineState_c)arg)
)
)
;



    sort(v_action);
    Transition_c [] v_transitionsNewStateTransitions = 
Transition_c.getManySM_TXNsOnR507(
NewStateTransition_c.getManySM_NSTXNsOnR504(
StateEventMatrixEntry_c.getManySM_SEMEsOnR503(
(StateMachineState_c)arg)
)
)
;



    sort(v_transitionsNewStateTransitions);
    Transition_c [] v_transitionsNoEventTransitions = 
Transition_c.getManySM_TXNsOnR507(
NoEventTransition_c.getManySM_NETXNsOnR508(
(StateMachineState_c)arg)
)
;



    sort(v_transitionsNoEventTransitions);
    List<ObjectElement> result = new ArrayList<ObjectElement> ();
    for (int i = 0 ; i < v_stateeventmatrixentryEventIgnored.length ; i++) {   
        result.add(new ObjectElement("v_stateeventmatrixentryEventIgnored", ObjectElement.RELATION_ROLE_ELEMENT, v_stateeventmatrixentryEventIgnored[i], arg, false));
    }
    for (int i = 0 ; i < v_stateeventmatrixentryCantHappen.length ; i++) {   
        result.add(new ObjectElement("v_stateeventmatrixentryCantHappen", ObjectElement.RELATION_ROLE_ELEMENT, v_stateeventmatrixentryCantHappen[i], arg, false));
    }
    for (int i = 0 ; i < v_action.length ; i++) {   
        result.add(new ObjectElement("v_action", ObjectElement.RELATION_ROLE_ELEMENT, v_action[i], arg, false));
    }
    for (int i = 0 ; i < v_transitionsNewStateTransitions.length ; i++) {   
        result.add(new ObjectElement("v_transitionsNewStateTransitions", ObjectElement.RELATION_ROLE_ELEMENT, v_transitionsNewStateTransitions[i], arg, false));
    }
    for (int i = 0 ; i < v_transitionsNoEventTransitions.length ; i++) {   
        result.add(new ObjectElement("v_transitionsNoEventTransitions", ObjectElement.RELATION_ROLE_ELEMENT, v_transitionsNoEventTransitions[i], arg, false));
    }
    return result.toArray(new ObjectElement[result.size()]);
  }
  /**
   * @see IModelClassInspector#hasChildren(Object)
   * Returns true if this node has any children
   */
  public boolean hasChildRelations(Object arg) {
    StateEventMatrixEntry_c [] v_stateeventmatrixentryEventIgnored = 
StateEventMatrixEntry_c.getManySM_SEMEsOnR504(
EventIgnored_c.getManySM_EIGNsOnR504(
StateEventMatrixEntry_c.getManySM_SEMEsOnR503(
(StateMachineState_c)arg)
)
)
;



    if (v_stateeventmatrixentryEventIgnored.length > 0) return true;
    StateEventMatrixEntry_c [] v_stateeventmatrixentryCantHappen = 
StateEventMatrixEntry_c.getManySM_SEMEsOnR504(
CantHappen_c.getManySM_CHsOnR504(
StateEventMatrixEntry_c.getManySM_SEMEsOnR503(
(StateMachineState_c)arg)
)
)
;



    if (v_stateeventmatrixentryCantHappen.length > 0) return true;
    Action_c [] v_action = 
Action_c.getManySM_ACTsOnR514(
ActionHome_c.getManySM_AHsOnR513(
MooreActionHome_c.getManySM_MOAHsOnR511(
(StateMachineState_c)arg)
)
)
;



    if (v_action.length > 0) return true;
    Transition_c [] v_transitionsNewStateTransitions = 
Transition_c.getManySM_TXNsOnR507(
NewStateTransition_c.getManySM_NSTXNsOnR504(
StateEventMatrixEntry_c.getManySM_SEMEsOnR503(
(StateMachineState_c)arg)
)
)
;



    if (v_transitionsNewStateTransitions.length > 0) return true;
    Transition_c [] v_transitionsNoEventTransitions = 
Transition_c.getManySM_TXNsOnR507(
NoEventTransition_c.getManySM_NETXNsOnR508(
(StateMachineState_c)arg)
)
;



    if (v_transitionsNoEventTransitions.length > 0) return true;
    return false;
  }
  
  public Object[] getReferentialDetails(Class<?> referentialClass, Object arg) {
  	Object[] details = new Object[4];
	return details;
  }
  
  /**
  * @seee IModelClassInspector#getReferentials(Object)
  * Returns the an array of Role Objects specifying the referenctial attibutes of
  * this model element
  * Role Name: <T_TPS.NameOnly>
  * Role Value: <Chain_result>
  * Role Type: "Referential"
  */
  public ObjectElement[] getReferentials(Object arg) {
     List<ObjectElement> referentials = new ArrayList<ObjectElement>();
    return referentials.toArray(new ObjectElement [referentials.size()]);        
  }

  /**
  * @seee IModelClassInspector#getAttributes(Object)
  * Returns the an array of Role objects that give the attibutes of the model 
  * element it self e.g.
  * Role Name: "Name"
  * Role Value: metaModelElement.getName()
  * Role Type: "Primitive"
  */
  public ObjectElement[] getAttributes(Object arg) {
    ObjectElement attrSet[] = new ObjectElement[6];
      attrSet[0] = new ObjectElement("Name", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getName"), arg, "getName", true);
      attrSet[1] = new ObjectElement("Numb", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getNumb"), arg, "getNumb", true);
      attrSet[2] = new ObjectElement("Final", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getFinal"), arg, "getFinal", true);
    ObjectElement compAttrSet[] = new ObjectElement[3];    
    for (int i = 0; i < 3 ; i++) {
        compAttrSet[i] = attrSet[i];
    }
    return compAttrSet;
  }

    /**
     * Return configured image if none exists for the element type
     */
    public Image getImage(Object element) {
		Image image = CorePlugin.getImageFor(element, false);
		if(image != null) {
			return image;
		}
		return CorePlugin.getImageFor("State.gif");
	}
    }       

