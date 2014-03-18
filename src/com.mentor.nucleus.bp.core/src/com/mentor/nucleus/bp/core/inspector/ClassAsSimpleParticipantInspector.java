package com.mentor.nucleus.bp.core.inspector;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/inspector/ClassAsSimpleParticipantInspector.java
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
// class ClassAsSimpleParticipant_c from the traversal mechanisms that it provides to
// model diff.
//
import com.mentor.nucleus.bp.core.*;

import org.eclipse.swt.graphics.Image;

import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import java.util.*;

/**
 * This file adapts the meta-model entity; 'ClassAsSimpleParticipant_c' to provide 
 * support of traversing to its children and parents.
 * <p>
 * Do not edit this class, it was created using the Mentor Graphics
 * MC-Java code generator product.
 * </p>
 */
public class ClassAsSimpleParticipantInspector extends BaseModelClassInspector {

  private String parentAssoc;
  
  public ClassAsSimpleParticipantInspector(MetadataSortingManager sortingManager){
    super(sortingManager);
  }

  /**
   * @see IModelClassInspector#getParent(Object)
   * Returns the parent(s) of this node
   */
  public Object getParent(Object arg) {
    Association_c result1 = Association_c.getOneR_RELOnR201(ClassInAssociation_c.getOneR_OIROnR203(ReferredToClassInAssoc_c.getOneR_RTOOnR204((ClassAsSimpleParticipant_c)arg)));
     if (result1 != null) {
        return result1;
    }               
        return null;    //No parent found           
  }
  	  
  /**
   * @see IModelClassInspector#getChildRelations(Object)
   * Returns the children of this node
   */
  public ObjectElement[] getChildRelations(Object arg) {
    int resultSize = 0;
    ReferredToIdentifierAttribute_c [] v_referencedidentifier = 
ReferredToIdentifierAttribute_c.getManyO_RTIDAsOnR110(
ReferredToClassInAssoc_c.getManyR_RTOsOnR204(
(ClassAsSimpleParticipant_c)arg)
)
;



    sort(v_referencedidentifier);
    List<ObjectElement> result = new ArrayList<ObjectElement> ();
    for (int i = 0 ; i < v_referencedidentifier.length ; i++) {   
        result.add(new ObjectElement("v_referencedidentifier", ObjectElement.RELATION_ROLE_ELEMENT, v_referencedidentifier[i], arg, false));
    }
    return result.toArray(new ObjectElement[result.size()]);
  }
  /**
   * @see IModelClassInspector#hasChildren(Object)
   * Returns true if this node has any children
   */
  public boolean hasChildRelations(Object arg) {
    ReferredToIdentifierAttribute_c [] v_referencedidentifier = 
ReferredToIdentifierAttribute_c.getManyO_RTIDAsOnR110(
ReferredToClassInAssoc_c.getManyR_RTOsOnR204(
(ClassAsSimpleParticipant_c)arg)
)
;



    if (v_referencedidentifier.length > 0) return true;
    return false;
  }
  
  public Object[] getReferentialDetails(Class<?> referentialClass, Object arg) {
  	Object[] details = new Object[4];
	if(details[0] == null && referentialClass == ModelClass_c.class) {
		details[0] = ModelClass_c.getOneO_OBJOnR201(
ClassInAssociation_c.getOneR_OIROnR203(
ReferredToClassInAssoc_c.getOneR_RTOOnR204(
(ClassAsSimpleParticipant_c)arg)
)
)
;



;
		details[1] = arg;
		details[2] = "201";
		details[3] = "";
	}
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
        Object referential = ModelClass_c.getOneO_OBJOnR201(
ClassInAssociation_c.getOneR_OIROnR203(
ReferredToClassInAssoc_c.getOneR_RTOOnR204(
(ClassAsSimpleParticipant_c)arg)
)
)

;
     referentials.add(new ObjectElement ("referential_Related", ObjectElement.REFERENTIAL_ATTRIBUTE_ELEMENT, referential, arg, false));
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
      attrSet[0] = new ObjectElement("Mult", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getMult"), arg, "getMult", true);
      attrSet[1] = new ObjectElement("Cond", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getCond"), arg, "getCond", true);
      attrSet[2] = new ObjectElement("Txt_Phrs", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getTxt_phrs"), arg, "getTxt_phrs", true);
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
		return CorePlugin.getImageFor("AssociationParticipantEnd.gif");
	}
    }       

