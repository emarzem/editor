package com.mentor.nucleus.bp.ui.canvas.inspector;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/canvas/inspector/WaypointInspector.java
//
// WARNING:      Do not edit this generated file
// Generated by: ../com.mentor.nucleus.bp.core/arc/create_object_inspector.inc
// Version:      $Revision: 1.23 $
//
// (c) Copyright 2004-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class Waypoint_c from the traversal mechanisms that it provides to
// model diff.
//
import com.mentor.nucleus.bp.ui.canvas.*;

import org.eclipse.swt.graphics.Image;

import com.mentor.nucleus.bp.core.CorePlugin;
import com.mentor.nucleus.bp.core.inspector.*;
import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import java.util.*;

/**
 * This file adapts the meta-model entity; 'Waypoint_c' to provide 
 * support of traversing to its children and parents.
 * <p>
 * Do not edit this class, it was created using the Mentor Graphics
 * MC-Java code generator product.
 * </p>
 */
public class WaypointInspector extends BaseModelClassInspector {

  private String parentAssoc;
  
  public WaypointInspector(MetadataSortingManager sortingManager){
    super(sortingManager);
  }

  /**
   * @see IModelClassInspector#getParent(Object)
   * Returns the parent(s) of this node
   */
  public Object getParent(Object arg) {
    Connector_c result1 = Connector_c.getOneGD_CONOnR20(Graphedge_c.getOneDIM_EDOnR319((Waypoint_c)arg));
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
    List<ObjectElement> result = new ArrayList<ObjectElement> ();
    return result.toArray(new ObjectElement[result.size()]);
  }
  /**
   * @see IModelClassInspector#hasChildren(Object)
   * Returns true if this node has any children
   */
  public boolean hasChildRelations(Object arg) {
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
      attrSet[0] = new ObjectElement("positionX", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getPositionx"), arg, "getPositionx", true);
      attrSet[1] = new ObjectElement("positionY", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getPositiony"), arg, "getPositiony", true);
    ObjectElement compAttrSet[] = new ObjectElement[2];    
    for (int i = 0; i < 2 ; i++) {
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
		return CorePlugin.getImageFor("metadata/Bendpoint.gif");
	}
    }       

