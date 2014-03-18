//======================================================================
//
// File: DerivedOneEndR_CONEPropertySource.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/BuildPropertySource.arc
// Version:      $Revision: 1.66 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================

package com.mentor.nucleus.bp.ui.properties;
import org.eclipse.ui.views.properties.*;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import com.mentor.nucleus.bp.core.ui.cells.editors.*;
import com.mentor.nucleus.bp.core.util.DimensionsUtil;

public class DerivedOneEndR_CONEPropertySource implements IPropertySource {
	private ClassAsDerivedOneSide_c m_inst;
	private ModelClass_c[] m_ClassRelated;
	private PropertyDescriptor[] m_propertyDescriptors;
	private String[] Mult_vals = {"One", "Many"};
	private String[] validMult_vals() {
		String[] onlyOne = {"One"};
		if (m_inst.Manymultallowed()) {
			return Mult_vals;
		}
		return onlyOne;
	}
	private String[] Cond_vals = {"Unconditional", "Conditional"};
	MetadataSortingManager sorter = MetadataSortingManager.createDefault();

	public DerivedOneEndR_CONEPropertySource(ClassAsDerivedOneSide_c inst) {
		m_inst = inst;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
	 */
	public Object getEditableValue() {
		return this;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.Object)
	 */
	public boolean isPropertySet(Object id) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object id) {
		// do nothing
	}

	public String toString() {
		return m_inst.Get_name();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (m_inst == null || m_inst.isOrphaned())
			return new IPropertyDescriptor[0];
		int num_children = 0;
		ModelClass_c[] v_classRelated = ModelClass_c
				.getManyO_OBJsOnR201(ClassInAssociation_c
						.getManyR_OIRsOnR203((ClassAsDerivedOneSide_c) m_inst));

		m_ClassRelated = v_classRelated;
		num_children += m_ClassRelated.length;

		sorter.sort(v_classRelated);
		if (m_propertyDescriptors == null
				|| 3 + num_children != m_propertyDescriptors.length) {
			m_propertyDescriptors = new PropertyDescriptor[3 + num_children];
			boolean readonly = false;

			m_propertyDescriptors[0] = new EnumPropertyDescriptor("Mult",
					"Multiplicity", validMult_vals(), readonly);
			m_propertyDescriptors[0]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[1] = new EnumPropertyDescriptor("Cond",
					"Conditionality", Cond_vals, readonly);
			m_propertyDescriptors[1]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[2] = new TextPropertyDescriptor("Txt_Phrs",
					"Text Phrase");
			m_propertyDescriptors[2]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);

			int d_index = 3;
			for (int i = 0; i < m_ClassRelated.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ClassRelated." + String.valueOf(i), "Related");
				m_propertyDescriptors[d_index].setCategory("Class");
				++d_index;
			}

		}
		return m_propertyDescriptors;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		if (m_inst.isOrphaned()) {
			return "";
		}
		if (id.equals("Mult")) {
			return Mult_vals[m_inst.getMult()];
		} else if (id.equals("Cond")) {
			return Cond_vals[m_inst.getCond()];
		} else if (id.equals("Txt_Phrs")) {
			return m_inst.getTxt_phrs();
		}
		int d_index = 3;
		for (int i = 0; i < m_ClassRelated.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ClassO_OBJPropertySource(m_ClassRelated[i]);
			}
			++d_index;
		}

		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		boolean value_changed = false;
		String trans_name = "";
		Transaction tr = null;
		Ooaofooa modelRoot = (Ooaofooa) m_inst.getModelRoot();
		TransactionManager tm = TransactionManager.getSingleton();
		try {
			if (id.equals("Mult")) {
				int new_val = Integer.parseInt(value.toString());
				if (new_val != m_inst.getMult()) {
					trans_name = "Change in property: 'Mult' of Class As Derived One Side";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setMult(new_val);
				}
			} else if (id.equals("Cond")) {
				int new_val = Integer.parseInt(value.toString());
				if (new_val != m_inst.getCond()) {
					trans_name = "Change in property: 'Cond' of Class As Derived One Side";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setCond(new_val);
				}
			} else if (id.equals("Txt_Phrs")) {
				if (!value.toString().equals(m_inst.getTxt_phrs())) {
					trans_name = "Change in property: 'Txt_Phrs' of Class As Derived One Side";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setTxt_phrs(value.toString());
				}
			}

			// catch all exceptions and cancel the transaction
		} catch (Exception e) {
			// this can be null if there was
			// an exception starting the
			// transaction
			if (tr != null) {
				tm.cancelTransaction(tr, e);
				tr = null;
			}
			CorePlugin.logError("Transaction: " + trans_name
					+ " could not complete", e);
		}
		if (tr != null) {
			if (value_changed)
				tm.endTransaction(tr);
			else
				tm.cancelTransaction(tr);
		}
	}
}
