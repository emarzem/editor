package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.DescriptionQuery_c.java
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
abstract class EV_DESCRIPTION_QUERY extends genericEvent_c {
	public abstract int getEvtcode();
}

public class DescriptionQuery_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public DescriptionQuery_c(ModelRoot modelRoot, java.util.UUID p_m_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_id = IdAssigner.preprocessUUID(p_m_id);

		Object[] key = {m_id};
		addInstanceToMap(key);
	}
	static public DescriptionQuery_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_id, String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(DescriptionQuery_c.class);
		DescriptionQuery_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_id};
			new_inst = (DescriptionQuery_c) instances.get(key);
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
			new_inst = new DescriptionQuery_c(modelRoot, p_m_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public DescriptionQuery_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_id) {
		InstanceList instances = modelRoot
				.getInstanceList(DescriptionQuery_c.class);
		DescriptionQuery_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_id};
			source = (DescriptionQuery_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_id = IdAssigner.preprocessUUID(p_m_id);

				return source;
			}
		}
		// there is no instance matching the id
		DescriptionQuery_c new_inst = new DescriptionQuery_c(modelRoot, p_m_id);
		return new_inst;
	}
	public DescriptionQuery_c(ModelRoot modelRoot) {
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
		if (!(elem instanceof DescriptionQuery_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof DescriptionQuery_c)) {
			return false;
		}

		DescriptionQuery_c me = (DescriptionQuery_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getId()) || IdAssigner.NULL_UUID
				.equals(((DescriptionQuery_c) elem).getId())) && this != elem) {
			return false;
		}
		if (!getId().equals(((DescriptionQuery_c) elem).getId()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof DescriptionQuery_c)) {
			return false;
		}

		DescriptionQuery_c me = (DescriptionQuery_c) elem;
		if (!getIdCachedValue().equals(
				((DescriptionQuery_c) elem).getIdCachedValue()))
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
									"DescriptionQuery_c.relateAcrossR9600To(Query_c target)",
									"Relate performed across R9600 from Description Query to Query without unrelate of prior instance.");
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

	public static DescriptionQuery_c getOneSQU_DEOnR9600(Query_c[] targets) {
		return getOneSQU_DEOnR9600(targets, null);
	}

	public static DescriptionQuery_c getOneSQU_DEOnR9600(Query_c[] targets,
			ClassQueryInterface_c test) {
		DescriptionQuery_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneSQU_DEOnR9600(targets[i], test);
			}
		}

		return ret_val;
	}

	public static DescriptionQuery_c getOneSQU_DEOnR9600(Query_c target) {
		return getOneSQU_DEOnR9600(target, null);
	}

	public static DescriptionQuery_c getOneSQU_DEOnR9600(Query_c target,
			boolean loadComponent) {
		return getOneSQU_DEOnR9600(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static DescriptionQuery_c getOneSQU_DEOnR9600(Query_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneSQU_DEOnR9600(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static DescriptionQuery_c getOneSQU_DEOnR9600(ModelRoot modelRoot,
			Query_c target, ClassQueryInterface_c test) {
		return getOneSQU_DEOnR9600(modelRoot, target, test, true);
	}

	public static DescriptionQuery_c getOneSQU_DEOnR9600(ModelRoot modelRoot,
			Query_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneSQU_DEOnR9600(modelRoot, target, test);
	}
	private static DescriptionQuery_c find_getOneSQU_DEOnR9600(
			ModelRoot modelRoot, Query_c target, ClassQueryInterface_c test) {
		if (target != null) {
			DescriptionQuery_c source = (DescriptionQuery_c) target.backPointer_IsSubtypeDescriptionQueryIsSubtype_R9600;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static DescriptionQuery_c[] getManySQU_DEsOnR9600(Query_c[] targets) {
		return getManySQU_DEsOnR9600(targets, null);
	}
	public static DescriptionQuery_c[] getManySQU_DEsOnR9600(Query_c[] targets,
			boolean loadComponent) {
		return getManySQU_DEsOnR9600(targets, null, loadComponent);
	}
	public static DescriptionQuery_c[] getManySQU_DEsOnR9600(Query_c[] targets,
			ClassQueryInterface_c test) {
		return getManySQU_DEsOnR9600(targets, test, true);
	}

	public static DescriptionQuery_c[] getManySQU_DEsOnR9600(Query_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new DescriptionQuery_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(DescriptionQuery_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			DescriptionQuery_c source = (DescriptionQuery_c) targets[i].backPointer_IsSubtypeDescriptionQueryIsSubtype_R9600;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			DescriptionQuery_c[] ret_set = new DescriptionQuery_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new DescriptionQuery_c[0];
		}
	}

	public static DescriptionQuery_c[] getManySQU_DEsOnR9600(Query_c target) {
		if (target != null) {
			Query_c[] targetArray = new Query_c[1];
			targetArray[0] = target;
			return getManySQU_DEsOnR9600(targetArray);
		} else {
			DescriptionQuery_c[] result = new DescriptionQuery_c[0];
			return result;
		}
	}

	public static DescriptionQuery_c[] getManySQU_DEsOnR9600(Query_c target,
			boolean loadComponent) {
		if (target != null) {
			Query_c[] targetArray = new Query_c[1];
			targetArray[0] = target;
			return getManySQU_DEsOnR9600(targetArray, loadComponent);
		} else {
			DescriptionQuery_c[] result = new DescriptionQuery_c[0];
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
		Query_c relInst39008 = (Query_c) baseRoot
				.getInstanceList(Query_c.class).get(new Object[]{m_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst39008 == null) {
			relInst39008 = (Query_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Query_c.class).get(new Object[]{m_id});
		}
		if (relInst39008 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst39008 = (Query_c) roots[i]
						.getInstanceList(Query_c.class).get(new Object[]{m_id});
				if (relInst39008 != null)
					break;
			}
		}
		//synchronized
		if (relInst39008 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst39008) && !isProxy())) {
				relInst39008.relateAcrossR9600To(this, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(DescriptionQuery_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final DescriptionQuery_c inst = (DescriptionQuery_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(DescriptionQuery_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static DescriptionQuery_c DescriptionQueryInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		DescriptionQuery_c result = findDescriptionQueryInstance(modelRoot,
				test, loadComponent);
		if (result == null && loadComponent) {
			List pmcs = PersistenceManager.findAllComponents(modelRoot,
					DescriptionQuery_c.class);
			for (int i = 0; i < pmcs.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) pmcs
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = findDescriptionQueryInstance(modelRoot, test,
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
	private static DescriptionQuery_c findDescriptionQueryInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(DescriptionQuery_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				DescriptionQuery_c x = (DescriptionQuery_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						return x;
				}
			}
		}
		return null;
	}
	public static DescriptionQuery_c DescriptionQueryInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return DescriptionQueryInstance(modelRoot, test, true);
	}

	public static DescriptionQuery_c DescriptionQueryInstance(
			ModelRoot modelRoot) {
		return DescriptionQueryInstance(modelRoot, null, true);
	}

	public static DescriptionQuery_c[] DescriptionQueryInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (loadComponent) {
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					DescriptionQuery_c.class);
		}
		InstanceList instances = modelRoot
				.getInstanceList(DescriptionQuery_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				DescriptionQuery_c x = (DescriptionQuery_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						matches.add(x);
				}
			}
			if (matches.size() > 0) {
				DescriptionQuery_c[] ret_set = new DescriptionQuery_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new DescriptionQuery_c[0];
			}
		}
	}
	public static DescriptionQuery_c[] DescriptionQueryInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return DescriptionQueryInstances(modelRoot, test, true);
	}
	public static DescriptionQuery_c[] DescriptionQueryInstances(
			ModelRoot modelRoot) {
		return DescriptionQueryInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Description Query.dispose call: ";
		Query_c testR9600Inst3 = Query_c.getOneSQU_QOnR9600(this, false);

		if (testR9600Inst3 != null) {
			delete_error = true;
			errorMsg = errorMsg + "9600 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Description Query",
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
		Ooaofooa.log.println(ILogger.OPERATION, "Description Query", //$NON-NLS-1$
				" Operation entered: Description Query::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		DescriptionQuery_c[] objs = DescriptionQuery_c
				.DescriptionQueryInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Description Query", //$NON-NLS-1$
				" Operation entered: Description Query::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class DescriptionQuery_c_test39010_c implements ClassQueryInterface_c {
			DescriptionQuery_c_test39010_c(java.util.UUID p39011) {
				m_p39011 = p39011;
			}
			private java.util.UUID m_p39011;
			public boolean evaluate(Object candidate) {
				DescriptionQuery_c selected = (DescriptionQuery_c) candidate;
				boolean retval = false;
				retval = (selected.getId().equals(m_p39011));
				return retval;
			}
		}

		DescriptionQuery_c[] objs39009 = DescriptionQuery_c
				.DescriptionQueryInstances(modelRoot,
						new DescriptionQuery_c_test39010_c(getId()));

		if (((objs39009.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Description Query", //$NON-NLS-1$
								"Consistency: Object: Description Query: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs39009.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Description Query: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs39009.length), e);
			}
			retval = false;

		}

		if (((objs39009.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Description Query", //$NON-NLS-1$
								"Consistency: Object: Description Query: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs39009.length)
										+ " Id: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Description Query: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs39009.length)
										+ " Id: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Description Query is a subtype in association: rel.Numb = 9600
		// The supertype class is: Query
		class Query_c_test39015_c implements ClassQueryInterface_c {
			Query_c_test39015_c(java.util.UUID p39016) {
				m_p39016 = p39016;
			}
			private java.util.UUID m_p39016;
			public boolean evaluate(Object candidate) {
				Query_c selected = (Query_c) candidate;
				boolean retval = false;
				retval = (selected.getId().equals(m_p39016));
				return retval;
			}
		}

		Query_c[] objs39014 = Query_c.QueryInstances(modelRoot,
				new Query_c_test39015_c(getId()));

		if (((objs39014.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Description Query", //$NON-NLS-1$
								"Consistency: Object: Description Query: Association: 9600: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs39014.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Description Query: Association: 9600: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs39014.length), e);
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Configureparticipants(final Object p_Monitor) {
		Ooaofooa.log.println(ILogger.OPERATION, "Description Query",
				" Operation entered: DescriptionQuery::Configureparticipants");
		final ModelRoot modelRoot = getModelRoot();
		Query_c v_query = Query_c.getOneSQU_QOnR9600(this);

		Search_c.Gatherparticipants(p_Monitor, v_query.getId());

	} // End configureParticipants
	public void Createparticipant(final String p_Classname,
			final Object p_Elementid, final String p_Modelrootid,
			final String p_Searchablevalue) {
		Ooaofooa.log.println(ILogger.OPERATION, "Description Query",
				" Operation entered: DescriptionQuery::Createparticipant");
		final ModelRoot modelRoot = getModelRoot();
		SearchParticipant_c v_participant = new SearchParticipant_c(modelRoot);
		Ooaofooa.getDefaultInstance().fireModelElementCreated(
				new BaseModelDelta(Modeleventnotification_c.DELTA_NEW,
						v_participant));

		SearchableElement_c v_searchable = new SearchableElement_c(modelRoot);
		Ooaofooa.getDefaultInstance().fireModelElementCreated(
				new BaseModelDelta(Modeleventnotification_c.DELTA_NEW,
						v_searchable));

		DescriptionSearchable_c v_descriptionParticipant = new DescriptionSearchable_c(
				modelRoot);
		Ooaofooa.getDefaultInstance().fireModelElementCreated(
				new BaseModelDelta(Modeleventnotification_c.DELTA_NEW,
						v_descriptionParticipant));

		if (v_searchable != null) {
			v_searchable.relateAcrossR9700To(v_participant);
		} else {
			Throwable t = new Throwable();
			t.fillInStackTrace();
			CorePlugin.logError("Relate attempted on null left hand instance.",
					t);
		}

		if (v_searchable != null) {
			v_searchable.setModelrootid(p_Modelrootid);
		} else {
			Throwable t = new Throwable();
			t.fillInStackTrace();
			CorePlugin.logError("Attribute write attempted on null instance.",
					t);
		}

		if (v_searchable != null) {
			v_searchable.setElementid(p_Elementid);
		} else {
			Throwable t = new Throwable();
			t.fillInStackTrace();
			CorePlugin.logError("Attribute write attempted on null instance.",
					t);
		}

		if (v_searchable != null) {
			v_searchable.setClassname(p_Classname);
		} else {
			Throwable t = new Throwable();
			t.fillInStackTrace();
			CorePlugin.logError("Attribute write attempted on null instance.",
					t);
		}

		if (v_descriptionParticipant != null) {
			v_descriptionParticipant.setSearchablevalue(p_Searchablevalue);
		} else {
			Throwable t = new Throwable();
			t.fillInStackTrace();
			CorePlugin.logError("Attribute write attempted on null instance.",
					t);
		}

		if (v_descriptionParticipant != null) {
			v_descriptionParticipant.relateAcrossR9702To(v_searchable);
		} else {
			Throwable t = new Throwable();
			t.fillInStackTrace();
			CorePlugin.logError("Relate attempted on null left hand instance.",
					t);
		}

		SearchEngine_c v_engine = SearchEngine_c.getOneSEN_EOnR9500(Query_c
				.getOneSQU_QOnR9600(this));

		if (v_engine != null) {
			v_engine.relateAcrossR9502To(v_participant);
		} else {
			Throwable t = new Throwable();
			t.fillInStackTrace();
			CorePlugin.logError("Relate attempted on null left hand instance.",
					t);
		}

	} // End createParticipant

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Description Query
