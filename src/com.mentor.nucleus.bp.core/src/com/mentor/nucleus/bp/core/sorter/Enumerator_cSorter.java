package com.mentor.nucleus.bp.core.sorter;

//======================================================================
//
// File: src/com/mentor/nucleus/bp/core/sorter/Enumerator_cSorter.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_metadata_elements_sorters.arc
// Version:      $Revision: 1.12.88.2 $
//
// (c) Copyright 2004-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================

import com.mentor.nucleus.bp.core.Enumerator_c;
import com.mentor.nucleus.bp.core.CorePlugin;

public class Enumerator_cSorter extends BaseTypeSpecificSorter {

	public Enumerator_cSorter() {
		super(Enumerator_c.class);
	}

	public void sort(Object[] elements) {
		if (elements.length < 2) {
			return;
		}

		Enumerator_c[] enumerators = (Enumerator_c[]) elements;
		int index = 0;
		Enumerator_c tail = null;

		// Search from the end as there are fair chances that array is already
		// sorted.
		for (index = enumerators.length - 1; index >= 0; index--) {
			Enumerator_c enumerator = Enumerator_c
					.getOneS_ENUMOnR56Precedes(enumerators[index]);
			if (enumerator == null) {
				tail = enumerators[index];
				break;
			}
		}

		if (tail == null) {
			CorePlugin.logError(
					"Enumerator ordering relationship R56 is corrupt", null);
			return;
		}

		for (index = enumerators.length - 1; index >= 0; index--) {
			enumerators[index] = tail;
			tail = Enumerator_c.getOneS_ENUMOnR56Succeeds(tail);
		}
	}
}
