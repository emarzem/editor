package com.mentor.nucleus.bp.core.sorter;

//======================================================================
//
// File: src/com/mentor/nucleus/bp/core/sorter/PropertyParameter_cSorter.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_metadata_elements_sorters.arc
// Version:      $Revision: 1.12.88.2 $
//
// (c) Copyright 2004-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================

import com.mentor.nucleus.bp.core.PropertyParameter_c;
import com.mentor.nucleus.bp.core.CorePlugin;

public class PropertyParameter_cSorter extends BaseTypeSpecificSorter {

	public PropertyParameter_cSorter() {
		super(PropertyParameter_c.class);
	}

	public void sort(Object[] elements) {
		if (elements.length < 2) {
			return;
		}

		PropertyParameter_c[] propertyparameters = (PropertyParameter_c[]) elements;
		int index = 0;
		PropertyParameter_c tail = null;

		// Search from the end as there are fair chances that array is already
		// sorted.
		for (index = propertyparameters.length - 1; index >= 0; index--) {
			PropertyParameter_c propertyparameter = PropertyParameter_c
					.getOneC_PPOnR4021Precedes(propertyparameters[index]);
			if (propertyparameter == null) {
				tail = propertyparameters[index];
				break;
			}
		}

		if (tail == null) {
			CorePlugin
					.logError(
							"Property Parameter ordering relationship R4021 is corrupt",
							null);
			return;
		}

		for (index = propertyparameters.length - 1; index >= 0; index--) {
			propertyparameters[index] = tail;
			tail = PropertyParameter_c.getOneC_PPOnR4021Succeeds(tail);
		}
	}
}
