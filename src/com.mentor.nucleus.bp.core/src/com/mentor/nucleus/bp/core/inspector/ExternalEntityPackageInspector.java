package com.mentor.nucleus.bp.core.inspector;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/inspector/ExternalEntityPackageInspector.java
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
// class ExternalEntityPackage_c from the traversal mechanisms that it provides to
// model diff.
//
import com.mentor.nucleus.bp.core.*;

import org.eclipse.swt.graphics.Image;

import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import java.util.*;

/**
 * This file adapts the meta-model entity; 'ExternalEntityPackage_c' to provide 
 * support of traversing to its children and parents.
 * <p>
 * Do not edit this class, it was created using the Mentor Graphics
 * MC-Java code generator product.
 * </p>
 */
public class ExternalEntityPackageInspector extends BaseModelClassInspector {

  private String parentAssoc;
  
  public ExternalEntityPackageInspector(MetadataSortingManager sortingManager){
    super(sortingManager);
  }

  /**
   * @see IModelClassInspector#getParent(Object)
   * Returns the parent(s) of this node
   */
  public Object getParent(Object arg) {
    Domain_c result1 = Domain_c.getOneS_DOMOnR36((ExternalEntityPackage_c)arg);
     if (result1 != null) {
        return result1;
    }               
    ExternalEntityPackage_c result2 = ExternalEntityPackage_c.getOneS_EEPKOnR34(EePackageInPackage_c.getOneS_EEPIPOnR35((ExternalEntityPackage_c)arg));
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
    ExternalEntity_c [] v_externalentity = 
ExternalEntity_c.getManyS_EEsOnR33(
ExternalEntityInPackage_c.getManyS_EEIPsOnR33(
(ExternalEntityPackage_c)arg)
)
;



    sort(v_externalentity);
    ExternalEntityPackage_c [] v_externalentitypackage = 
ExternalEntityPackage_c.getManyS_EEPKsOnR35(
EePackageInPackage_c.getManyS_EEPIPsOnR34(
(ExternalEntityPackage_c)arg)
)
;



    sort(v_externalentitypackage);
    List<ObjectElement> result = new ArrayList<ObjectElement> ();
    for (int i = 0 ; i < v_externalentity.length ; i++) {   
        result.add(new ObjectElement("v_externalentity", ObjectElement.RELATION_ROLE_ELEMENT, v_externalentity[i], arg, false));
    }
    for (int i = 0 ; i < v_externalentitypackage.length ; i++) {   
        result.add(new ObjectElement("v_externalentitypackage", ObjectElement.RELATION_ROLE_ELEMENT, v_externalentitypackage[i], arg, false));
    }
    return result.toArray(new ObjectElement[result.size()]);
  }
  /**
   * @see IModelClassInspector#hasChildren(Object)
   * Returns true if this node has any children
   */
  public boolean hasChildRelations(Object arg) {
    ExternalEntity_c [] v_externalentity = 
ExternalEntity_c.getManyS_EEsOnR33(
ExternalEntityInPackage_c.getManyS_EEIPsOnR33(
(ExternalEntityPackage_c)arg)
)
;



    if (v_externalentity.length > 0) return true;
    ExternalEntityPackage_c [] v_externalentitypackage = 
ExternalEntityPackage_c.getManyS_EEPKsOnR35(
EePackageInPackage_c.getManyS_EEPIPsOnR34(
(ExternalEntityPackage_c)arg)
)
;



    if (v_externalentitypackage.length > 0) return true;
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
    ObjectElement attrSet[] = new ObjectElement[4];
      attrSet[0] = new ObjectElement("Name", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getName"), arg, "getName", true);
    ObjectElement compAttrSet[] = new ObjectElement[1];    
    for (int i = 0; i < 1 ; i++) {
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
		return CorePlugin.getImageFor("ExternalEntityPackage.gif");
	}
    }       

