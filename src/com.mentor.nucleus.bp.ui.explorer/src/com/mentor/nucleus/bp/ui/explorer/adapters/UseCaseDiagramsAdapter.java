package com.mentor.nucleus.bp.ui.explorer.adapters;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/explorer/adapters/UseCaseDiagramsAdapter.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_adapters.inc
// Version:      $Revision: 1.31 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class UseCaseDiagram_c from the tree viewer and the hierarchy
// it imposes.
//
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import com.mentor.nucleus.bp.core.*;

import com.mentor.nucleus.bp.ui.explorer.*;
/**
 * This file adapts the meta-model entity; 'UseCaseDiagram_c'
 * so that it works with the Eclipse JFace user interface components.
 * <p>
 * Do not edit this class, it was created using the Mentor 
 * Graphics MC-Java code generator product.
 * </p>
 */
public class UseCaseDiagramsAdapter implements ITreeContentProvider {
	static UseCaseDiagramsAdapter usecasediagramsadapter = null;
	/**
	 * Returns the adapters singleton instance. If this
	 * is the first time, the instance is created.
	 */
	public static UseCaseDiagramsAdapter getInstance() {
		if (usecasediagramsadapter == null) {
			usecasediagramsadapter = new UseCaseDiagramsAdapter();
		}
		return usecasediagramsadapter;
	}
	/**
	 * @see IContentProvider#inputChanged(Viewer, Object, Object)
	 * Called when the tree's input has been changed
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Nothing to do
	}
	/**
	 * @see IContentProvider#dispose()
	 * Called when this viewer is no longer needed
	 */
	public void dispose() {
		// Nothing to dispose
	}
	/**
	 * @see ITreeContentProvider#getParent(Object)
	 * Returns the parent of this node
	 */
	public Object getParent(Object arg) {
		Component_c result128 = Component_c
				.getOneC_COnR4204(DomainAsComponent_c
						.getOneCN_DCOnR4204(Domain_c
								.getOneS_DOMOnR1201((UseCaseDiagram_c) arg)));
		if (result128 != null) {
			return result128;
		}
		SystemModel_c result129 = SystemModel_c
				.getOneS_SYSOnR1211((UseCaseDiagram_c) arg);
		if (result129 != null) {
			return result129;
		}
		Domain_c result130 = Domain_c
				.getOneS_DOMOnR1201((UseCaseDiagram_c) arg);
		if (result130 != null) {
			return result130;
		}
		Subsystem_c result131 = Subsystem_c
				.getOneS_SSOnR1202((UseCaseDiagram_c) arg);
		if (result131 != null) {
			return result131;
		}
		UseCaseDiagram_c result132 = UseCaseDiagram_c
				.getOneUC_UCCOnR1208(UseCaseInUseCase_c
						.getOneUC_UIUOnR1209((UseCaseDiagram_c) arg));
		if (result132 != null) {
			return result132;
		}
		Package_c result133 = Package_c
				.getOneEP_PKGOnR1400(SpecificationPackage_c
						.getOneEP_SPKGOnR1402((UseCaseDiagram_c) arg));
		if (result133 != null) {
			return result133;
		}
		ComponentPackage_c result134 = ComponentPackage_c
				.getOneCP_CPOnR1212((UseCaseDiagram_c) arg);
		if (result134 != null) {
			return result134;
		}
		Component_c result135 = Component_c
				.getOneC_COnR1213((UseCaseDiagram_c) arg);
		if (result135 != null) {
			return result135;
		}
		return null;
	}
	/**
	 * @see IStructuredContentProvider#getElements(Object)
	 * Returns the elements below this node
	 */
	public Object[] getElements(Object arg) {
		return getChildren(arg);
	}

	/**
	 * @see ITreeContentProvider#getChildren(Object)
	 * Returns the children of this node
	 */
	public Object[] getChildren(Object arg) {
		int resultSize = 0;
		ActorParticipant_c[] actors_1203_1 = ActorParticipant_c
				.getManySQ_APsOnR930(InteractionParticipant_c.getManySQ_PsOnR1203(ParticipantInUseCase_c
						.getManyUC_PIUCsOnR1203((UseCaseDiagram_c) arg)));

		ModelContentProvider.sort(actors_1203_1);
		resultSize += actors_1203_1.length;
		UseCaseDiagram_c[] usecasediagrams_1208_2 = UseCaseDiagram_c
				.getManyUC_UCCsOnR1209(UseCaseInUseCase_c
						.getManyUC_UIUsOnR1208((UseCaseDiagram_c) arg));

		ModelContentProvider.sort(usecasediagrams_1208_2);
		resultSize += usecasediagrams_1208_2.length;
		UseCaseParticipant_c[] usecases_1203_3 = UseCaseParticipant_c
				.getManyIA_UCPsOnR930(InteractionParticipant_c.getManySQ_PsOnR1203(ParticipantInUseCase_c
						.getManyUC_PIUCsOnR1203((UseCaseDiagram_c) arg)));

		ModelContentProvider.sort(usecases_1203_3);
		resultSize += usecases_1203_3.length;

		Object[] result = new Object[resultSize];
		int count = 0;
		for (int i = 0; i < actors_1203_1.length; i++) {
			result[count] = actors_1203_1[i];
			count++;
		}
		for (int i = 0; i < usecasediagrams_1208_2.length; i++) {
			result[count] = usecasediagrams_1208_2[i];
			count++;
		}
		for (int i = 0; i < usecases_1203_3.length; i++) {
			result[count] = usecases_1203_3[i];
			count++;
		}
		return result;
	}
	/**
	 * @see ITreeContentProvider#hasChildren(Object)
	 * Returns true if this node has any children
	 */
	public boolean hasChildren(Object arg) {
		ActorParticipant_c[] actors_1203_1 = ActorParticipant_c
				.getManySQ_APsOnR930(InteractionParticipant_c.getManySQ_PsOnR1203(ParticipantInUseCase_c
						.getManyUC_PIUCsOnR1203((UseCaseDiagram_c) arg)));

		if (actors_1203_1.length > 0)
			return true;
		UseCaseDiagram_c[] usecasediagrams_1208_2 = UseCaseDiagram_c
				.getManyUC_UCCsOnR1209(UseCaseInUseCase_c
						.getManyUC_UIUsOnR1208((UseCaseDiagram_c) arg));

		if (usecasediagrams_1208_2.length > 0)
			return true;
		UseCaseParticipant_c[] usecases_1203_3 = UseCaseParticipant_c
				.getManyIA_UCPsOnR930(InteractionParticipant_c.getManySQ_PsOnR1203(ParticipantInUseCase_c
						.getManyUC_PIUCsOnR1203((UseCaseDiagram_c) arg)));

		if (usecases_1203_3.length > 0)
			return true;
		return false;
	}
}
