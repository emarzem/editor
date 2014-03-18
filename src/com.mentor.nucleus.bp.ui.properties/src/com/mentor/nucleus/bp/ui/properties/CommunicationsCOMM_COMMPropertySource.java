//======================================================================
//
// File: CommunicationsCOMM_COMMPropertySource.java
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

public class CommunicationsCOMM_COMMPropertySource implements IPropertySource {
	private Communication_c m_inst;
	private Communication_c[] m_Communications;
	private ClassInstanceParticipant_c[] m_Instances;
	private ClassParticipant_c[] m_ImportedClasses;
	private ExternalEntityParticipant_c[] m_ImportedExternalEntities;
	private FunctionPackageParticipant_c[] m_ImportedFunctionPackages;
	private ActorParticipant_c[] m_Actors;
	private CommunicationLink_c[] m_CommunicationLinks;
	private ComponentParticipant_c[] m_ComponentParticipants;
	private SynchronousMessage_c[] m_SynchronousMessages;
	private AsynchronousMessage_c[] m_AsynchronousMessages;
	private ReturnMessage_c[] m_ReturnMessages;
	private PropertyDescriptor[] m_propertyDescriptors;

	MetadataSortingManager sorter = MetadataSortingManager.createDefault();

	public CommunicationsCOMM_COMMPropertySource(Communication_c inst) {
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
		return m_inst.getName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (m_inst == null || m_inst.isOrphaned())
			return new IPropertyDescriptor[0];
		int num_children = 0;
		Communication_c[] v_communications = Communication_c
				.getManyCOMM_COMMsOnR1129(CommunicationInCommunication_c
						.getManyCOMM_CICsOnR1130((Communication_c) m_inst));

		m_Communications = v_communications;
		num_children += m_Communications.length;

		sorter.sort(v_communications);
		ClassInstanceParticipant_c[] v_instances = ClassInstanceParticipant_c
				.getManySQ_CIPsOnR930(InteractionParticipant_c.getManySQ_PsOnR1126(ParticipantInCommunication_c
						.getManyCOMM_PICsOnR1126((Communication_c) m_inst)));

		m_Instances = v_instances;
		num_children += m_Instances.length;

		sorter.sort(v_instances);
		ClassParticipant_c[] v_importedclasses = ClassParticipant_c
				.getManySQ_CPsOnR930(InteractionParticipant_c.getManySQ_PsOnR1126(ParticipantInCommunication_c
						.getManyCOMM_PICsOnR1126((Communication_c) m_inst)));

		m_ImportedClasses = v_importedclasses;
		num_children += m_ImportedClasses.length;

		sorter.sort(v_importedclasses);
		ExternalEntityParticipant_c[] v_importedexternalentities = ExternalEntityParticipant_c
				.getManySQ_EEPsOnR930(InteractionParticipant_c.getManySQ_PsOnR1126(ParticipantInCommunication_c
						.getManyCOMM_PICsOnR1126((Communication_c) m_inst)));

		m_ImportedExternalEntities = v_importedexternalentities;
		num_children += m_ImportedExternalEntities.length;

		sorter.sort(v_importedexternalentities);
		FunctionPackageParticipant_c[] v_importedfunctionpackages = FunctionPackageParticipant_c
				.getManySQ_FPPsOnR930(InteractionParticipant_c.getManySQ_PsOnR1126(ParticipantInCommunication_c
						.getManyCOMM_PICsOnR1126((Communication_c) m_inst)));

		m_ImportedFunctionPackages = v_importedfunctionpackages;
		num_children += m_ImportedFunctionPackages.length;

		sorter.sort(v_importedfunctionpackages);
		ActorParticipant_c[] v_actors = ActorParticipant_c
				.getManySQ_APsOnR930(InteractionParticipant_c.getManySQ_PsOnR1126(ParticipantInCommunication_c
						.getManyCOMM_PICsOnR1126((Communication_c) m_inst)));

		m_Actors = v_actors;
		num_children += m_Actors.length;

		sorter.sort(v_actors);
		CommunicationLink_c[] v_communicationlinks = CommunicationLink_c
				.getManyCOMM_LNKsOnR1133(InteractionParticipant_c.getManySQ_PsOnR1126(ParticipantInCommunication_c
						.getManyCOMM_PICsOnR1126((Communication_c) m_inst)));

		m_CommunicationLinks = v_communicationlinks;
		num_children += m_CommunicationLinks.length;

		sorter.sort(v_communicationlinks);
		ComponentParticipant_c[] v_componentparticipants = ComponentParticipant_c
				.getManySQ_COPsOnR930(InteractionParticipant_c.getManySQ_PsOnR1126(ParticipantInCommunication_c
						.getManyCOMM_PICsOnR1126((Communication_c) m_inst)));

		m_ComponentParticipants = v_componentparticipants;
		num_children += m_ComponentParticipants.length;

		sorter.sort(v_componentparticipants);
		SynchronousMessage_c[] v_synchronousmessages = SynchronousMessage_c
				.getManyMSG_SMsOnR1018(Message_c.getManyMSG_MsOnR1135(MessageInCommunication_c
						.getManyCOMM_MICsOnR1135((Communication_c) m_inst)));

		m_SynchronousMessages = v_synchronousmessages;
		num_children += m_SynchronousMessages.length;

		sorter.sort(v_synchronousmessages);
		AsynchronousMessage_c[] v_asynchronousmessages = AsynchronousMessage_c
				.getManyMSG_AMsOnR1018(Message_c.getManyMSG_MsOnR1135(MessageInCommunication_c
						.getManyCOMM_MICsOnR1135((Communication_c) m_inst)));

		m_AsynchronousMessages = v_asynchronousmessages;
		num_children += m_AsynchronousMessages.length;

		sorter.sort(v_asynchronousmessages);
		ReturnMessage_c[] v_returnmessages = ReturnMessage_c
				.getManyMSG_RsOnR1018(Message_c.getManyMSG_MsOnR1135(MessageInCommunication_c
						.getManyCOMM_MICsOnR1135((Communication_c) m_inst)));

		m_ReturnMessages = v_returnmessages;
		num_children += m_ReturnMessages.length;

		sorter.sort(v_returnmessages);
		if (m_propertyDescriptors == null
				|| 2 + num_children != m_propertyDescriptors.length) {
			m_propertyDescriptors = new PropertyDescriptor[2 + num_children];
			boolean readonly = false;

			m_propertyDescriptors[0] = new TextPropertyDescriptor("Name",
					"Communication Name");
			m_propertyDescriptors[0]
					.setValidator(new ModelElementNameValidator(m_inst));
			m_propertyDescriptors[0]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[1] = new DescriptionPropertyDescriptor(
					"Descrip", "Communication Description", m_inst);
			m_propertyDescriptors[1]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);

			int d_index = 2;
			for (int i = 0; i < m_Communications.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"Communications." + String.valueOf(i), "Communication");
				m_propertyDescriptors[d_index].setCategory("Communications");
				++d_index;
			}

			for (int i = 0; i < m_Instances.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"Instances." + String.valueOf(i),
						"Class Instance Participant");
				m_propertyDescriptors[d_index].setCategory("Instances");
				++d_index;
			}

			for (int i = 0; i < m_ImportedClasses.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ImportedClasses." + String.valueOf(i),
						"Class Participant");
				m_propertyDescriptors[d_index].setCategory("Imported Classes");
				++d_index;
			}

			for (int i = 0; i < m_ImportedExternalEntities.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ImportedExternalEntities." + String.valueOf(i),
						"External Entity Participant");
				m_propertyDescriptors[d_index]
						.setCategory("Imported External Entities");
				++d_index;
			}

			for (int i = 0; i < m_ImportedFunctionPackages.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ImportedFunctionPackages." + String.valueOf(i),
						"Function Package Participant");
				m_propertyDescriptors[d_index]
						.setCategory("Imported Function Packages");
				++d_index;
			}

			for (int i = 0; i < m_Actors.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"Actors." + String.valueOf(i), "Actor Participant");
				m_propertyDescriptors[d_index].setCategory("Actors");
				++d_index;
			}

			for (int i = 0; i < m_CommunicationLinks.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"CommunicationLinks." + String.valueOf(i),
						"Communication Link");
				m_propertyDescriptors[d_index]
						.setCategory("Communication Links");
				++d_index;
			}

			for (int i = 0; i < m_ComponentParticipants.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ComponentParticipants." + String.valueOf(i),
						"Component Participant");
				m_propertyDescriptors[d_index]
						.setCategory("Component Participants");
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

			for (int i = 0; i < m_AsynchronousMessages.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"AsynchronousMessages." + String.valueOf(i),
						"Asynchronous Message");
				m_propertyDescriptors[d_index]
						.setCategory("Asynchronous Messages");
				++d_index;
			}

			for (int i = 0; i < m_ReturnMessages.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ReturnMessages." + String.valueOf(i), "Return Message");
				m_propertyDescriptors[d_index].setCategory("Return Messages");
				++d_index;
			}

		}
		if (m_propertyDescriptors.length > 0)
			m_propertyDescriptors[0]
					.setValidator(new CommunicationNameValidator());
		return m_propertyDescriptors;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		if (m_inst.isOrphaned()) {
			return "";
		}
		if (id.equals("Name")) {
			return m_inst.getName();
		} else if (id.equals("Descrip")) {
			return m_inst.getDescrip().replace('\n', '/');
		}
		int d_index = 2;
		for (int i = 0; i < m_Communications.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new CommunicationsCOMM_COMMPropertySource(
						m_Communications[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_Instances.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new InstancesSQ_CIPPropertySource(m_Instances[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ImportedClasses.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ImportedClassesSQ_CPPropertySource(
						m_ImportedClasses[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ImportedExternalEntities.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ImportedExternalEntitiesSQ_EEPPropertySource(
						m_ImportedExternalEntities[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ImportedFunctionPackages.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ImportedFunctionPackagesSQ_FPPPropertySource(
						m_ImportedFunctionPackages[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_Actors.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ActorsSQ_APPropertySource(m_Actors[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_CommunicationLinks.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new CommunicationLinksCOMM_LNKPropertySource(
						m_CommunicationLinks[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ComponentParticipants.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ComponentParticipantsSQ_COPPropertySource(
						m_ComponentParticipants[i]);
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

		for (int i = 0; i < m_AsynchronousMessages.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new AsynchronousMessagesMSG_AMPropertySource(
						m_AsynchronousMessages[i]);
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
			if (id.equals("Name")) {
				if (!value.toString().equals(m_inst.getName())) {
					trans_name = "Change in property: 'Name' of Communication";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setName(value.toString());
				}
			} else if (id.equals("Descrip")) {
				if (!value.toString().equals(m_inst.getDescrip())) {
					trans_name = "Change in property: 'Descrip' of Communication";//$NON-NLS-1$
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
