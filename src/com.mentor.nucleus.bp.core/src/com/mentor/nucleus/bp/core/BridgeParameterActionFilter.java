package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.BridgeParameterActionFilter.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================
import org.eclipse.ui.IActionFilter;
import com.mentor.nucleus.bp.core.BridgeParameter_c;

public class BridgeParameterActionFilter implements IActionFilter {
	private static BridgeParameterActionFilter singleton;

	public static BridgeParameterActionFilter getSingleton() {
		if (singleton == null)
			singleton = new BridgeParameterActionFilter();
		return singleton;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionFilter#testAttribute(java.lang.Object, java.lang.String, java.lang.String)
	 */
	public boolean testAttribute(Object target, String name, String value) {
		BridgeParameter_c x = (BridgeParameter_c) target;
		return x.Actionfilter(name, value);
	}

}
