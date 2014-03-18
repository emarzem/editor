package com.mentor.nucleus.bp.core.ui;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/ui/MakePrivateOnO_OBJAction.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_object_action.inc
// Version:      $Revision: 1.30 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is the main BridgePoint entry point for the action that
// creates new Make Privates.
//
import java.util.Iterator;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.util.OoaofgraphicsUtil;
import com.mentor.nucleus.bp.core.util.RenameActionUtil;
import com.mentor.nucleus.bp.core.util.TransactionUtil;
import com.mentor.nucleus.bp.core.util.UIUtil;

public class MakePrivateOnO_OBJAction implements IObjectActionDelegate {

	/**
	 * Constructor for MakePrivateOnO_OBJAction.
	 */
	public MakePrivateOnO_OBJAction() {
		super();
	}
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// The part is mainly needed to locate the selection provider, and
		// we cache our selection in core so no action is needed here.
	}
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IStructuredSelection structuredSelection = Selection.getInstance()
				.getStructuredSelection();
		O_OBJ_MakePrivate(structuredSelection);

	}
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}
	private void O_OBJ_MakePrivate(IStructuredSelection selection) {
		// Assign the context selection variables with the action context 
		// Assign the context selection variable with the action context 
		Object context = selection.iterator().next();
		ModelClass_c v_obj = (ModelClass_c) context;
		PersistableModelComponent.ensureCoreDataTypesAvailable(v_obj
				.getModelRoot());

		TransactionUtil.TransactionGroup transactionGroup = TransactionUtil
				.startTransactionsOnSelectedModelRoots("Model Class Make Private");
		try {
			// Ensure that actions take place between Verifier Activity executions
			Ooaofooa.beginSaveOperation();
			PackageableElement_c v_pe = PackageableElement_c
					.getOnePE_PEOnR8001(v_obj);

			if (v_pe != null) {
				v_pe.setVisibility(Visibility_c.Private);
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin.logError(
						"Attribute write attempted on null instance.", t);
			}

			// end critical section
			Ooaofooa.endSaveOperation();
			// catch all exceptions and cancel the transactions
		} catch (Exception e) {
			Ooaofooa.endSaveOperation();
			TransactionUtil.cancelTransactions(transactionGroup, e);
			CorePlugin.logError(
					"Transaction: Model Class Make Private failed", e);//$NON-NLS-1$
		}
		TransactionUtil.endTransactions(transactionGroup);

	}
} // end MakePrivateOnO_OBJAction

