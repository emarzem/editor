package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.DeclarationQuery_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.*;
import java.lang.reflect.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import com.mentor.nucleus.bp.core.util.PersistenceUtil;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.mentor.nucleus.bp.core.ui.marker.UmlProblem;
import com.mentor.nucleus.bp.core.common.*;
abstract class EV_DECLARATION_QUERY extends genericEvent_c {
	public abstract int getEvtcode();
}

public class DeclarationQuery_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public DeclarationQuery_c(ModelRoot modelRoot, java.util.UUID p_m_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_id = IdAssigner.preprocessUUID(p_m_id);

		Object[] key = {m_id};
		addInstanceToMap(key);
	}
	static public DeclarationQuery_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_id, String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(DeclarationQuery_c.class);
		DeclarationQuery_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_id};
			new_inst = (DeclarationQuery_c) instances.get(key);
		}
		String contentPath = PersistenceUtil.resolveRelativePath(p_localPath,
				new Path(p_contentPath));
		if (modelRoot.isNewCompareRoot()) {
			// for comparisons we do not want to change
			// the content path
			contentPath = p_contentPath;
		}
		if (new_inst != null && !modelRoot.isCompareRoot()) {
			PersistableModelComponent pmc = new_inst.getPersistableComponent();
			if (pmc == null) {
				// dangling reference, redo this instance
				new_inst.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_id = IdAssigner.preprocessUUID(p_m_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new DeclarationQuery_c(modelRoot, p_m_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public DeclarationQuery_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_id) {
		InstanceList instances = modelRoot
				.getInstanceList(DeclarationQuery_c.class);
		DeclarationQuery_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_id};
			source = (DeclarationQuery_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_id = IdAssigner.preprocessUUID(p_m_id);

				return source;
			}
		}
		// there is no instance matching the id
		DeclarationQuery_c new_inst = new DeclarationQuery_c(modelRoot, p_m_id);
		return new_inst;
	}
	public DeclarationQuery_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_id = IdAssigner.NULL_UUID;
		Object[] key = {m_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_id != p_newKey) {

			m_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof DeclarationQuery_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof DeclarationQuery_c)) {
			return false;
		}

		DeclarationQuery_c me = (DeclarationQuery_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getId()) || IdAssigner.NULL_UUID
				.equals(((DeclarationQuery_c) elem).getId())) && this != elem) {
			return false;
		}
		if (!getId().equals(((DeclarationQuery_c) elem).getId()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof DeclarationQuery_c)) {
			return false;
		}

		DeclarationQuery_c me = (DeclarationQuery_c) elem;
		if (!getIdCachedValue().equals(
				((DeclarationQuery_c) elem).getIdCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_id;

	// declare association references from this class

	// referring navigation

	Query_c IsSupertypeQuery;
	public void relateAcrossR9600To(Query_c target) {
		relateAcrossR9600To(target, true);
	}
	public void relateAcrossR9600To(Query_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeQuery)
			return; // already related

		if (IsSupertypeQuery != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeQuery != null) {

				IsSupertypeQuery.clearBackPointerR9600To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"DeclarationQuery_c.relateAcrossR9600To(Query_c target)",
									"Relate performed across R9600 from Declaration Query to Query without unrelate of prior instance.");
				}
			}

			IsSupertypeQuery = target;
			m_id = target.getId();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR9600To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "9600", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR9600From(Query_c target) {
		unrelateAcrossR9600From(target, true);
	}
	public void unrelateAcrossR9600From(Query_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeQuery == null)
			return; // already unrelated

		if (target != IsSupertypeQuery) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R9600",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR9600To(this);
		}

		if (IsSupertypeQuery != null) {

			m_id = IsSupertypeQuery.getId();
			IsSupertypeQuery = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "9600", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	public static DeclarationQuery_c getOneSQU_DOnR9600(Query_c[] targets) {
		return getOneSQU_DOnR9600(targets, null);
	}

	public static DeclarationQuery_c getOneSQU_DOnR9600(Query_c[] targets,
			ClassQueryInterface_c test) {
		DeclarationQuery_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneSQU_DOnR9600(targets[i], test);
			}
		}

		return ret_val;
	}

	public static DeclarationQuery_c getOneSQU_DOnR9600(Query_c target) {
		return getOneSQU_DOnR9600(target, null);
	}

	public static DeclarationQuery_c getOneSQU_DOnR9600(Query_c target,
			boolean loadComponent) {
		return getOneSQU_DOnR9600(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static DeclarationQuery_c getOneSQU_DOnR9600(Query_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneSQU_DOnR9600(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static DeclarationQuery_c getOneSQU_DOnR9600(ModelRoot modelRoot,
			Query_c target, ClassQueryInterface_c test) {
		return getOneSQU_DOnR9600(modelRoot, target, test, true);
	}

	public static DeclarationQuery_c getOneSQU_DOnR9600(ModelRoot modelRoot,
			Query_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneSQU_DOnR9600(modelRoot, target, test);
	}
	private static DeclarationQuery_c find_getOneSQU_DOnR9600(
			ModelRoot modelRoot, Query_c target, ClassQueryInterface_c test) {
		if (target != null) {
			DeclarationQuery_c source = (DeclarationQuery_c) target.backPointer_IsSubtypeDeclarationQueryIsSubtype_R9600;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static DeclarationQuery_c[] getManySQU_DsOnR9600(Query_c[] targets) {
		return getManySQU_DsOnR9600(targets, null);
	}
	public static DeclarationQuery_c[] getManySQU_DsOnR9600(Query_c[] targets,
			boolean loadComponent) {
		return getManySQU_DsOnR9600(targets, null, loadComponent);
	}
	public static DeclarationQuery_c[] getManySQU_DsOnR9600(Query_c[] targets,
			ClassQueryInterface_c test) {
		return getManySQU_DsOnR9600(targets, test, true);
	}

	public static DeclarationQuery_c[] getManySQU_DsOnR9600(Query_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new DeclarationQuery_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(DeclarationQuery_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			DeclarationQuery_c source = (DeclarationQuery_c) targets[i].backPointer_IsSubtypeDeclarationQueryIsSubtype_R9600;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			DeclarationQuery_c[] ret_set = new DeclarationQuery_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new DeclarationQuery_c[0];
		}
	}

	public static DeclarationQuery_c[] getManySQU_DsOnR9600(Query_c target) {
		if (target != null) {
			Query_c[] targetArray = new Query_c[1];
			targetArray[0] = target;
			return getManySQU_DsOnR9600(targetArray);
		} else {
			DeclarationQuery_c[] result = new DeclarationQuery_c[0];
			return result;
		}
	}

	public static DeclarationQuery_c[] getManySQU_DsOnR9600(Query_c target,
			boolean loadComponent) {
		if (target != null) {
			Query_c[] targetArray = new Query_c[1];
			targetArray[0] = target;
			return getManySQU_DsOnR9600(targetArray, loadComponent);
		} else {
			DeclarationQuery_c[] result = new DeclarationQuery_c[0];
			return result;
		}
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
		InstanceList instances = null;
		ModelRoot baseRoot = modelRoot;

		// R9600
		Query_c relInst39017 = (Query_c) baseRoot
				.getInstanceList(Query_c.class).get(new Object[]{m_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst39017 == null) {
			relInst39017 = (Query_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Query_c.class).get(new Object[]{m_id});
		}
		if (relInst39017 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst39017 = (Query_c) roots[i]
						.getInstanceList(Query_c.class).get(new Object[]{m_id});
				if (relInst39017 != null)
					break;
			}
		}
		//synchronized
		if (relInst39017 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst39017) && !isProxy())) {
				relInst39017.relateAcrossR9600To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R9600
		// SQU_Q
		inst = IsSupertypeQuery;
		unrelateAcrossR9600From(IsSupertypeQuery, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
	}
	public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(DeclarationQuery_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final DeclarationQuery_c inst = (DeclarationQuery_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(DeclarationQuery_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static DeclarationQuery_c DeclarationQueryInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		DeclarationQuery_c result = findDeclarationQueryInstance(modelRoot,
				test, loadComponent);
		if (result == null && loadComponent) {
			List pmcs = PersistenceManager.findAllComponents(modelRoot,
					DeclarationQuery_c.class);
			for (int i = 0; i < pmcs.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) pmcs
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = findDeclarationQueryInstance(modelRoot, test,
								loadComponent);
						if (result != null)
							return result;
					} catch (Exception e) {
						CorePlugin.logError("Error Loading component", e);
					}
				}
			}
		}
		if (result != null && loadComponent) {
			result.loadProxy();
		}
		return result;
	}
	private static DeclarationQuery_c findDeclarationQueryInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(DeclarationQuery_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				DeclarationQuery_c x = (DeclarationQuery_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						return x;
				}
			}
		}
		return null;
	}
	public static DeclarationQuery_c DeclarationQueryInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return DeclarationQueryInstance(modelRoot, test, true);
	}

	public static DeclarationQuery_c DeclarationQueryInstance(
			ModelRoot modelRoot) {
		return DeclarationQueryInstance(modelRoot, null, true);
	}

	public static DeclarationQuery_c[] DeclarationQueryInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (loadComponent) {
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					DeclarationQuery_c.class);
		}
		InstanceList instances = modelRoot
				.getInstanceList(DeclarationQuery_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				DeclarationQuery_c x = (DeclarationQuery_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						matches.add(x);
				}
			}
			if (matches.size() > 0) {
				DeclarationQuery_c[] ret_set = new DeclarationQuery_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new DeclarationQuery_c[0];
			}
		}
	}
	public static DeclarationQuery_c[] DeclarationQueryInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return DeclarationQueryInstances(modelRoot, test, true);
	}
	public static DeclarationQuery_c[] DeclarationQueryInstances(
			ModelRoot modelRoot) {
		return DeclarationQueryInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Declaration Query.dispose call: ";
		Query_c testR9600Inst2 = Query_c.getOneSQU_QOnR9600(this, false);

		if (testR9600Inst2 != null) {
			delete_error = true;
			errorMsg = errorMsg + "9600 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Declaration Query",
						errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CorePlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		if (attributeName.equals("id")) {
			return true;
		}
		return false;
	}
	public String getCompUniqueID() {
		UUID tempID = null;
		long longID = 0L;
		StringBuffer result = new StringBuffer();

		tempID = getId();

		if (IdAssigner.NULL_UUID.equals(tempID))
			tempID = getIdCachedValue();
		result.append(Long.toHexString(tempID.getMostSignificantBits()));
		result.append(Long.toHexString(tempID.getLeastSignificantBits()));
		return result.toString();
	}
	// declare attribute accessors
	public long getIdLongBased() {
		if (IsSupertypeQuery != null) {
			return IsSupertypeQuery.getIdLongBased();
		}
		return 0;
	}
	public java.util.UUID getId() {
		if (IsSupertypeQuery != null) {
			return IsSupertypeQuery.getId();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeQuery != null);

	}

	public java.util.UUID getIdCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_id))
			return m_id;
		else
			return getId();
	}

	public void setId(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_id)) {
				return;
			}
		} else if (m_id != null) {
			if (m_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Id",
				m_id, newValue, true);
		m_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log.println(ILogger.OPERATION, "Declaration Query", //$NON-NLS-1$
				" Operation entered: Declaration Query::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		DeclarationQuery_c[] objs = DeclarationQuery_c
				.DeclarationQueryInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Declaration Query", //$NON-NLS-1$
				" Operation entered: Declaration Query::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class DeclarationQuery_c_test39019_c implements ClassQueryInterface_c {
			DeclarationQuery_c_test39019_c(java.util.UUID p39020) {
				m_p39020 = p39020;
			}
			private java.util.UUID m_p39020;
			public boolean evaluate(Object candidate) {
				DeclarationQuery_c selected = (DeclarationQuery_c) candidate;
				boolean retval = false;
				retval = (selected.getId().equals(m_p39020));
				return retval;
			}
		}

		DeclarationQuery_c[] objs39018 = DeclarationQuery_c
				.DeclarationQueryInstances(modelRoot,
						new DeclarationQuery_c_test39019_c(getId()));

		if (((objs39018.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Declaration Query", //$NON-NLS-1$
								"Consistency: Object: Declaration Query: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs39018.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Declaration Query: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs39018.length), e);
			}
			retval = false;

		}

		if (((objs39018.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Declaration Query", //$NON-NLS-1$
								"Consistency: Object: Declaration Query: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs39018.length)
										+ " Id: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Declaration Query: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs39018.length)
										+ " Id: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Declaration Query is a subtype in association: rel.Numb = 9600
		// The supertype class is: Query
		class Query_c_test39024_c implements ClassQueryInterface_c {
			Query_c_test39024_c(java.util.UUID p39025) {
				m_p39025 = p39025;
			}
			private java.util.UUID m_p39025;
			public boolean evaluate(Object candidate) {
				Query_c selected = (Query_c) candidate;
				boolean retval = false;
				retval = (selected.getId().equals(m_p39025));
				return retval;
			}
		}

		Query_c[] objs39023 = Query_c.QueryInstances(modelRoot,
				new Query_c_test39024_c(getId()));

		if (((objs39023.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Declaration Query", //$NON-NLS-1$
								"Consistency: Object: Declaration Query: Association: 9600: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs39023.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Declaration Query: Association: 9600: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs39023.length), e);
			}
			retval = false;

		}

		return retval;
	}

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Declaration Query
