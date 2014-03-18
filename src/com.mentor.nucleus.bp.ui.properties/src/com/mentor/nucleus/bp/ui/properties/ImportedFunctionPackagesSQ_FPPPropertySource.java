//======================================================================
//
// File: ImportedFunctionPackagesSQ_FPPPropertySource.java
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

public class ImportedFunctionPackagesSQ_FPPPropertySource
		implements
			IPropertySource {
	private FunctionPackageParticipant_c m_inst;
	private Lifespan_c[] m_Lifespans;
	private SynchronousMessage_c[] m_SynchronousMessages;
	private ReturnMessage_c[] m_ReturnMessages;
	private FunctionPackage_c[] m_FunctionPackageFormalFunctionPackage;
	private PropertyDescriptor[] m_propertyDescriptors;

	MetadataSortingManager sorter = MetadataSortingManager.createDefault();

	public ImportedFunctionPackagesSQ_FPPPropertySource(
			FunctionPackageParticipant_c inst) {
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
		Lifespan_c[] v_lifespans = Lifespan_c
				.getManySQ_LSsOnR940(InteractionParticipant_c
						.getManySQ_PsOnR930((FunctionPackageParticipant_c) m_inst));

		m_Lifespans = v_lifespans;
		num_children += m_Lifespans.length;

		sorter.sort(v_lifespans);
		SynchronousMessage_c[] v_synchronousmessages = SynchronousMessage_c
				.getManyMSG_SMsOnR1018(Message_c.getManyMSG_MsOnR1007(InteractionParticipant_c
						.getManySQ_PsOnR930((FunctionPackageParticipant_c) m_inst)));

		m_SynchronousMessages = v_synchronousmessages;
		num_children += m_SynchronousMessages.length;

		sorter.sort(v_synchronousmessages);
		ReturnMessage_c[] v_returnmessages = ReturnMessage_c
				.getManyMSG_RsOnR1018(Message_c.getManyMSG_MsOnR1007(InteractionParticipant_c
						.getManySQ_PsOnR930((FunctionPackageParticipant_c) m_inst)));

		m_ReturnMessages = v_returnmessages;
		num_children += m_ReturnMessages.length;

		sorter.sort(v_returnmessages);
		FunctionPackage_c[] v_functionpackageFormalFunctionPackage = FunctionPackage_c
				.getManyS_FPKsOnR932((FunctionPackageParticipant_c) m_inst);

		m_FunctionPackageFormalFunctionPackage = v_functionpackageFormalFunctionPackage;
		num_children += m_FunctionPackageFormalFunctionPackage.length;

		sorter.sort(v_functionpackageFormalFunctionPackage);
		if (m_propertyDescriptors == null
				|| 3 + num_children != m_propertyDescriptors.length) {
			m_propertyDescriptors = new PropertyDescriptor[3 + num_children];
			boolean readonly = false;

			m_propertyDescriptors[0] = new TextPropertyDescriptor(
					"InformalName", "Informal Function Package Name");
			m_propertyDescriptors[0]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[1] = new DescriptionPropertyDescriptor(
					"Descrip", "Function Package Description", m_inst);
			m_propertyDescriptors[1]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[2] = new PropertyDescriptor("isFormal",
					"Is Formal");
			m_propertyDescriptors[2]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);

			int d_index = 3;
			for (int i = 0; i < m_Lifespans.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"Lifespans." + String.valueOf(i), "Lifespan");
				m_propertyDescriptors[d_index].setCategory("Lifespans");
				++d_index;
			}

			for (int i = 0; i < m_SynchronousMessages.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"SynchronousMessages." + String.valueOf(i),
						"Synchronous Message");
				m_propertyDescriptors[d_index]
						.setCategory("Synchronous Messages");
				++d_index;
			}

			for (int i = 0; i < m_ReturnMessages.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ReturnMessages." + String.valueOf(i), "Return Message");
				m_propertyDescriptors[d_index].setCategory("Return Messages");
				++d_index;
			}

			for (int i = 0; i < m_FunctionPackageFormalFunctionPackage.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"FunctionPackageFormalFunctionPackage."
								+ String.valueOf(i), "Formal Function Package");
				m_propertyDescriptors[d_index].setCategory("Function Package");
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
		if (id.equals("InformalName")) {
			return m_inst.getInformalname();
		} else if (id.equals("Descrip")) {
			return m_inst.getDescrip().replace('\n', '/');
		} else if (id.equals("isFormal")) {
			return new Boolean(m_inst.getIsformal());
		}
		int d_index = 3;
		for (int i = 0; i < m_Lifespans.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new LifespansSQ_LSPropertySource(m_Lifespans[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_SynchronousMessages.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new SynchronousMessagesMSG_SMPropertySource(
						m_SynchronousMessages[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ReturnMessages.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ReturnMessagesMSG_RPropertySource(
						m_ReturnMessages[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_FunctionPackageFormalFunctionPackage.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new FunctionPackageS_FPKPropertySource(
						m_FunctionPackageFormalFunctionPackage[i]);
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
			if (id.equals("InformalName")) {
				if (!value.toString().equals(m_inst.getInformalname())) {
					trans_name = "Change in property: 'InformalName' of Function Package Participant";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setInformalname(value.toString());
				}
			} else if (id.equals("Descrip")) {
				if (!value.toString().equals(m_inst.getDescrip())) {
					trans_name = "Change in property: 'Descrip' of Function Package Participant";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setDescrip(value.toString());
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
