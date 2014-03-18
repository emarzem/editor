package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.AssociationActionFilter.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================
import org.eclipse.ui.IActionFilter;
import com.mentor.nucleus.bp.core.Association_c;

public class AssociationActionFilter implements IActionFilter {
	private static AssociationActionFilter singleton;

	public static AssociationActionFilter getSingleton() {
		if (singleton == null)
			singleton = new AssociationActionFilter();
		return singleton;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionFilter#testAttribute(java.lang.Object, java.lang.String, java.lang.String)
	 */
	public boolean testAttribute(Object target, String name, String value) {
		Association_c x = (Association_c) target;
		return x.Actionfilter(name, value);
	}

}
