package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    InterfaceOperationFormalizeOnMSG_SMWizard.java
//
// WARNING: Do not edit this generated file
// Generated by arc/wizard.inc
//
// (c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.
//
//====================================================================
import java.util.Iterator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.wizard.*;
import org.eclipse.ui.IWorkbench;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.util.TransactionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * InterfaceOperationFormalizeOnMSG_SMWizard class
 */
public class InterfaceOperationFormalizeOnMSG_SMWizard extends Wizard {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	// workbench selection when the wizard was started
	protected IStructuredSelection m_selection;

	// the workbench instance
	protected IWorkbench m_workbench;

	// the viewer the wizard was started from. This must be replaced with a listener system
	protected Viewer m_viewer;

	// Pages stack
	protected Stack m_pagesStack = new Stack();

	// wizard pages
	InterfaceOperationFormalizeOnMSG_SMWizardPage2 MSG_SM_InterfaceOperationFormalizePage2;

	// wizard state
	// constants
	protected static final int INITIAL_WIZARD_STATE = -1;
	protected static final int MSG_SM_INTERFACEOPERATIONFORMALIZE0_WIZARD_STATE = 0;
	// member
	protected int m_state = INITIAL_WIZARD_STATE;
	// end wizard state

	// cache for contextual selections (public for use by unit tests)
	public SynchronousMessage_c v_syncMessage = null;

	// cache for the users selections (public for use by unit tests)
	public InterfaceOperation_c v_Operation = null;

	/**
	 * Constructor for InterfaceOperationFormalizeOnMSG_SMWizard.
	 */
	public InterfaceOperationFormalizeOnMSG_SMWizard() {
		super();
	}

	/**
	 * See field.
	 */
	public IStructuredSelection getSelection() {
		return m_selection;
	}

	public void addPages() {
		MSG_SM_InterfaceOperationFormalizePage2 = new InterfaceOperationFormalizeOnMSG_SMWizardPage2(
				"InterfaceOperationFormalizeOnMSG_SMWizardPage2");
		addPage(MSG_SM_InterfaceOperationFormalizePage2);
	}

	/**
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection,
			Viewer viewer) {
		this.m_workbench = workbench;
		this.m_selection = selection;
		this.m_viewer = viewer;
		for (Iterator iterator = selection.iterator(); iterator.hasNext();) {
			Object context = iterator.next();
			if (context instanceof SynchronousMessage_c) {
				v_syncMessage = (SynchronousMessage_c) context;
			}
		}
	}

	public boolean canFinish() {
		boolean pagesComplete = true;
		pagesComplete = pagesComplete
				&& MSG_SM_InterfaceOperationFormalizePage2.isPageComplete();
		return pagesComplete;
	}

	public IWizardPage getNextPage(IWizardPage page) {
		List pages = new ArrayList(getPages().length);
		for (int i = 0; i < getPages().length; i++) {
			pages.add(getPages()[i]);
		}
		switch (pages.indexOf(page)) {
			case MSG_SM_INTERFACEOPERATIONFORMALIZE0_WIZARD_STATE :
				return null;
		}
		return null;
	}

	public IWizardPage getPreviousPage(IWizardPage page) {
		if (m_pagesStack.empty()) {
			return null;
		} else {
			List pages = new ArrayList(getPages().length);
			for (int i = 0; i < getPages().length; i++) {
				pages.add(getPages()[i]);
			}
			m_state = pages.indexOf((IWizardPage) m_pagesStack.peek());
			((PtWizardPage) m_pagesStack.peek()).onPageEntry();
			return (IWizardPage) m_pagesStack.pop();
		}
	}

	public boolean performFinish() {
		TransactionUtil.TransactionGroup transactionGroup = null;
		ModelRoot modelRoot = v_syncMessage.getModelRoot();
		try {
			transactionGroup = TransactionUtil
					.startTransactionsOnSelectedModelRoots("Interface Operation Formalize"); //$NON-NLS-1$
			Message_c v_message = Message_c.getOneMSG_MOnR1018(v_syncMessage);

			InteractionParticipant_c v_participant = InteractionParticipant_c
					.getOneSQ_POnR1007(v_message);

			ComponentParticipant_c v_cop = ComponentParticipant_c
					.getOneSQ_COPOnR930(v_participant);

			if (((v_cop == null))) {

				v_cop = ComponentParticipant_c
						.getOneSQ_COPOnR930(InteractionParticipant_c
								.getOneSQ_POnR940(Lifespan_c
										.getOneSQ_LSOnR930(v_participant)));

			}

			Component_c v_component = (Component_c) modelRoot.getInstanceList(
					Component_c.class).getGlobal(null, Gd_c.Null_unique_id());

			if (((v_cop != null))) {

				v_component = Component_c.getOneC_COnR955(v_cop);

			}

			if (((v_component != null))) {

				if (((v_Operation != null))) {

					if (v_syncMessage != null) {
						v_syncMessage
								.Formalizewithinterfaceoperation(v_Operation
										.getId());
					} else {
						Throwable t = new Throwable();
						t.fillInStackTrace();
						CorePlugin
								.logError(
										"Attempted to call an operation on a null instance.",
										t);
					}

				}

			}

			// catch all exceptions and cancel the transaction
		} catch (Exception e) {
			if (transactionGroup != null)
				TransactionUtil.cancelTransactions(transactionGroup, e);
			CorePlugin.logError(
					"Transaction: Interface Operation Formalize failed", e);//$NON-NLS-1$
			// return true so that the wizard will
			// close
			return true;
		}
		if (transactionGroup != null)
			TransactionUtil.endTransactions(transactionGroup);
		if (m_viewer != null) {
			if (m_viewer instanceof StructuredViewer) {
				((StructuredViewer) m_viewer).refresh(v_syncMessage);
			} else {
				m_viewer.refresh();
			}
		}
		return true;
	}
}
