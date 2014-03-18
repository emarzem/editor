package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.ForkJoinNode_c.java
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
abstract class EV_FORK_JOIN_NODE extends genericEvent_c {
	public abstract int getEvtcode();
}

public class ForkJoinNode_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public ForkJoinNode_c(ModelRoot modelRoot, java.util.UUID p_m_id,
			String p_m_descrip, String p_m_guardcondition) {
		super(modelRoot);
		m_descrip = p_m_descrip;
		m_guardcondition = p_m_guardcondition;
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_id = IdAssigner.preprocessUUID(p_m_id);

		Object[] key = {m_id};
		addInstanceToMap(key);
	}
	static public ForkJoinNode_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_id, String p_m_descrip,
			String p_m_guardcondition, String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(ForkJoinNode_c.class);
		ForkJoinNode_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_id};
			new_inst = (ForkJoinNode_c) instances.get(key);
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
				new_inst.m_descrip = p_m_descrip;
				new_inst.m_guardcondition = p_m_guardcondition;
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_id = IdAssigner.preprocessUUID(p_m_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new ForkJoinNode_c(modelRoot, p_m_id, p_m_descrip,
					p_m_guardcondition);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public ForkJoinNode_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_id, String p_m_descrip, String p_m_guardcondition) {
		InstanceList instances = modelRoot
				.getInstanceList(ForkJoinNode_c.class);
		ForkJoinNode_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_id};
			source = (ForkJoinNode_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				source.m_descrip = p_m_descrip;
				source.m_guardcondition = p_m_guardcondition;
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_id = IdAssigner.preprocessUUID(p_m_id);

				return source;
			}
		}
		// there is no instance matching the id
		ForkJoinNode_c new_inst = new ForkJoinNode_c(modelRoot, p_m_id,
				p_m_descrip, p_m_guardcondition);
		return new_inst;
	}
	public ForkJoinNode_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_descrip = "";
		m_guardcondition = "";
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
		if (!(elem instanceof ForkJoinNode_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof ForkJoinNode_c)) {
			return false;
		}

		ForkJoinNode_c me = (ForkJoinNode_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getId()) || IdAssigner.NULL_UUID
				.equals(((ForkJoinNode_c) elem).getId())) && this != elem) {
			return false;
		}
		if (!getId().equals(((ForkJoinNode_c) elem).getId()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof ForkJoinNode_c)) {
			return false;
		}

		ForkJoinNode_c me = (ForkJoinNode_c) elem;
		if (!getIdCachedValue().equals(
				((ForkJoinNode_c) elem).getIdCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private String m_descrip;
	private String m_guardcondition;
	private java.util.UUID m_id;

	// declare association references from this class

	// referring navigation

	ControlNode_c IsSupertypeControlNode;
	public void relateAcrossR1106To(ControlNode_c target) {
		relateAcrossR1106To(target, true);
	}
	public void relateAcrossR1106To(ControlNode_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeControlNode)
			return; // already related

		if (IsSupertypeControlNode != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeControlNode != null) {

				IsSupertypeControlNode.clearBackPointerR1106To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"ForkJoinNode_c.relateAcrossR1106To(ControlNode_c target)",
									"Relate performed across R1106 from Fork Join Node to Control Node without unrelate of prior instance.");
				}
			}

			IsSupertypeControlNode = target;
			if (IdAssigner.NULL_UUID.equals(target.getId())) {
				// do not update cached value
			} else {
				// update cached value
				m_id = target.getIdCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR1106To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "1106", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR1106From(ControlNode_c target) {
		unrelateAcrossR1106From(target, true);
	}
	public void unrelateAcrossR1106From(ControlNode_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeControlNode == null)
			return; // already unrelated

		if (target != IsSupertypeControlNode) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R1106",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR1106To(this);
		}

		if (IsSupertypeControlNode != null) {

			m_id = IsSupertypeControlNode.getId();
			if (IdAssigner.NULL_UUID.equals(m_id)) {
				m_id = IsSupertypeControlNode.getIdCachedValue();
			}
			IsSupertypeControlNode = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "1106", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	public static ForkJoinNode_c getOneA_FJOnR1106(ControlNode_c[] targets) {
		return getOneA_FJOnR1106(targets, null);
	}

	public static ForkJoinNode_c getOneA_FJOnR1106(ControlNode_c[] targets,
			ClassQueryInterface_c test) {
		ForkJoinNode_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneA_FJOnR1106(targets[i], test);
			}
		}

		return ret_val;
	}

	public static ForkJoinNode_c getOneA_FJOnR1106(ControlNode_c target) {
		return getOneA_FJOnR1106(target, null);
	}

	public static ForkJoinNode_c getOneA_FJOnR1106(ControlNode_c target,
			boolean loadComponent) {
		return getOneA_FJOnR1106(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static ForkJoinNode_c getOneA_FJOnR1106(ControlNode_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneA_FJOnR1106(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static ForkJoinNode_c getOneA_FJOnR1106(ModelRoot modelRoot,
			ControlNode_c target, ClassQueryInterface_c test) {
		return getOneA_FJOnR1106(modelRoot, target, test, true);
	}

	public static ForkJoinNode_c getOneA_FJOnR1106(ModelRoot modelRoot,
			ControlNode_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneA_FJOnR1106(modelRoot, target, test);
	}
	private static ForkJoinNode_c find_getOneA_FJOnR1106(ModelRoot modelRoot,
			ControlNode_c target, ClassQueryInterface_c test) {
		if (target != null) {
			ForkJoinNode_c source = (ForkJoinNode_c) target.backPointer_IsSubtypeForkJoinNodeIsSubtype_R1106;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static ForkJoinNode_c[] getManyA_FJsOnR1106(ControlNode_c[] targets) {
		return getManyA_FJsOnR1106(targets, null);
	}
	public static ForkJoinNode_c[] getManyA_FJsOnR1106(ControlNode_c[] targets,
			boolean loadComponent) {
		return getManyA_FJsOnR1106(targets, null, loadComponent);
	}
	public static ForkJoinNode_c[] getManyA_FJsOnR1106(ControlNode_c[] targets,
			ClassQueryInterface_c test) {
		return getManyA_FJsOnR1106(targets, test, true);
	}

	public static ForkJoinNode_c[] getManyA_FJsOnR1106(ControlNode_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new ForkJoinNode_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(ForkJoinNode_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			ForkJoinNode_c source = (ForkJoinNode_c) targets[i].backPointer_IsSubtypeForkJoinNodeIsSubtype_R1106;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			ForkJoinNode_c[] ret_set = new ForkJoinNode_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new ForkJoinNode_c[0];
		}
	}

	public static ForkJoinNode_c[] getManyA_FJsOnR1106(ControlNode_c target) {
		if (target != null) {
			ControlNode_c[] targetArray = new ControlNode_c[1];
			targetArray[0] = target;
			return getManyA_FJsOnR1106(targetArray);
		} else {
			ForkJoinNode_c[] result = new ForkJoinNode_c[0];
			return result;
		}
	}

	public static ForkJoinNode_c[] getManyA_FJsOnR1106(ControlNode_c target,
			boolean loadComponent) {
		if (target != null) {
			ControlNode_c[] targetArray = new ControlNode_c[1];
			targetArray[0] = target;
			return getManyA_FJsOnR1106(targetArray, loadComponent);
		} else {
			ForkJoinNode_c[] result = new ForkJoinNode_c[0];
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

		// R1106
		ControlNode_c relInst56939 = (ControlNode_c) baseRoot.getInstanceList(
				ControlNode_c.class).get(new Object[]{m_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst56939 == null) {
			relInst56939 = (ControlNode_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(ControlNode_c.class)
					.get(new Object[]{m_id});
		}
		if (relInst56939 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst56939 = (ControlNode_c) roots[i].getInstanceList(
						ControlNode_c.class).get(new Object[]{m_id});
				if (relInst56939 != null)
					break;
			}
		}
		//synchronized
		if (relInst56939 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst56939) && !isProxy())) {
				relInst56939.relateAcrossR1106To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R1106
		// A_CTL
		inst = IsSupertypeControlNode;
		unrelateAcrossR1106From(IsSupertypeControlNode, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(ForkJoinNode_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final ForkJoinNode_c inst = (ForkJoinNode_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(ForkJoinNode_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static ForkJoinNode_c ForkJoinNodeInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		ForkJoinNode_c result = findForkJoinNodeInstance(modelRoot, test,
				loadComponent);
		if (result == null && loadComponent) {
			List pmcs = PersistenceManager.findAllComponents(modelRoot,
					ForkJoinNode_c.class);
			for (int i = 0; i < pmcs.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) pmcs
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = findForkJoinNodeInstance(modelRoot, test,
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
	private static ForkJoinNode_c findForkJoinNodeInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(ForkJoinNode_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				ForkJoinNode_c x = (ForkJoinNode_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						return x;
				}
			}
		}
		return null;
	}
	public static ForkJoinNode_c ForkJoinNodeInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return ForkJoinNodeInstance(modelRoot, test, true);
	}

	public static ForkJoinNode_c ForkJoinNodeInstance(ModelRoot modelRoot) {
		return ForkJoinNodeInstance(modelRoot, null, true);
	}

	public static ForkJoinNode_c[] ForkJoinNodeInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		if (loadComponent) {
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					ForkJoinNode_c.class);
		}
		InstanceList instances = modelRoot
				.getInstanceList(ForkJoinNode_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				ForkJoinNode_c x = (ForkJoinNode_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						matches.add(x);
				}
			}
			if (matches.size() > 0) {
				ForkJoinNode_c[] ret_set = new ForkJoinNode_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new ForkJoinNode_c[0];
			}
		}
	}
	public static ForkJoinNode_c[] ForkJoinNodeInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return ForkJoinNodeInstances(modelRoot, test, true);
	}
	public static ForkJoinNode_c[] ForkJoinNodeInstances(ModelRoot modelRoot) {
		return ForkJoinNodeInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Fork Join Node.dispose call: ";
		ControlNode_c testR1106Inst5 = ControlNode_c.getOneA_CTLOnR1106(this,
				false);

		if (testR1106Inst5 != null) {
			delete_error = true;
			errorMsg = errorMsg + "1106 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.DELETE, "Fork Join Node", errorMsg);
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
	public String getDescrip() {
		return m_descrip;
	}

	public void setDescrip(String newValue) {
		if (newValue != null) {
			if (newValue.equals(m_descrip)) {
				return;
			}
		} else if (m_descrip != null) {
			if (m_descrip.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Descrip", m_descrip, newValue, true);
		m_descrip = newValue;
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	public String getGuardcondition() {
		return m_guardcondition;
	}

	public void setGuardcondition(String newValue) {
		if (newValue != null) {
			if (newValue.equals(m_guardcondition)) {
				return;
			}
		} else if (m_guardcondition != null) {
			if (m_guardcondition.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Guardcondition", m_guardcondition, newValue, true);
		m_guardcondition = newValue;
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	public long getIdLongBased() {
		if (IsSupertypeControlNode != null) {
			return IsSupertypeControlNode.getIdLongBased();
		}
		return 0;
	}
	public java.util.UUID getId() {
		if (IsSupertypeControlNode != null) {
			return IsSupertypeControlNode.getId();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeControlNode != null);

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
		Ooaofooa.log.println(ILogger.OPERATION, "Fork Join Node", //$NON-NLS-1$
				" Operation entered: Fork Join Node::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		ForkJoinNode_c[] objs = ForkJoinNode_c.ForkJoinNodeInstances(modelRoot,
				null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Fork Join Node", //$NON-NLS-1$
				" Operation entered: Fork Join Node::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class ForkJoinNode_c_test56941_c implements ClassQueryInterface_c {
			ForkJoinNode_c_test56941_c(java.util.UUID p56942) {
				m_p56942 = p56942;
			}
			private java.util.UUID m_p56942;
			public boolean evaluate(Object candidate) {
				ForkJoinNode_c selected = (ForkJoinNode_c) candidate;
				boolean retval = false;
				retval = (selected.getId().equals(m_p56942));
				return retval;
			}
		}

		ForkJoinNode_c[] objs56940 = ForkJoinNode_c.ForkJoinNodeInstances(
				modelRoot, new ForkJoinNode_c_test56941_c(getId()));

		if (((objs56940.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Fork Join Node", //$NON-NLS-1$
								"Consistency: Object: Fork Join Node: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56940.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin.logError(
						"Consistency: Object: Fork Join Node: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
								+ "Actual Value: " //$NON-NLS-1$
								+ Integer.toString(objs56940.length), e);
			}
			retval = false;

		}

		if (((objs56940.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Fork Join Node", //$NON-NLS-1$
								"Consistency: Object: Fork Join Node: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs56940.length)
										+ " Id: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Fork Join Node: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56940.length)
										+ " Id: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Fork Join Node is a subtype in association: rel.Numb = 1106
		// The supertype class is: Control Node
		class ControlNode_c_test56946_c implements ClassQueryInterface_c {
			ControlNode_c_test56946_c(java.util.UUID p56947) {
				m_p56947 = p56947;
			}
			private java.util.UUID m_p56947;
			public boolean evaluate(Object candidate) {
				ControlNode_c selected = (ControlNode_c) candidate;
				boolean retval = false;
				retval = (selected.getId().equals(m_p56947));
				return retval;
			}
		}

		ControlNode_c[] objs56945 = ControlNode_c.ControlNodeInstances(
				modelRoot, new ControlNode_c_test56946_c(getId()));

		if (((objs56945.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Fork Join Node", //$NON-NLS-1$
								"Consistency: Object: Fork Join Node: Association: 1106: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56945.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Fork Join Node: Association: 1106: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56945.length), e);
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Fork Join Node",
				" Operation entered: ForkJoinNode::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		ControlNode_c v_parent = ControlNode_c.getOneA_CTLOnR1106(this);

		if (((v_parent != null))) {

			if (v_parent != null) {
				v_parent.Dispose();
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

			return;

		}

		if (delete()) {
			Ooaofooa.getDefaultInstance().fireModelElementDeleted(
					new BaseModelDelta(Modeleventnotification_c.DELTA_DELETE,
							this));
		}

	} // End dispose
	public java.util.UUID Get_ooa_id() {
		Ooaofooa.log.println(ILogger.OPERATION, "Fork Join Node",
				" Operation entered: ForkJoinNode::Get_ooa_id");
		final ModelRoot modelRoot = getModelRoot();
		return getId();

	} // End get_ooa_id
	public int Get_style(final int p_At) {
		Ooaofooa.log.println(ILogger.OPERATION, "Fork Join Node",
				" Operation entered: ForkJoinNode::Get_style");
		final ModelRoot modelRoot = getModelRoot();
		return Style_c.None;

	} // End get_style
	public String Get_connector_text(final java.util.UUID p_Ooa_id,
			final boolean p_Ooa_typeisimportedclass, final int p_At,
			final java.util.UUID p_Parent_id) {
		Ooaofooa.log.println(ILogger.OPERATION, "Fork Join Node",
				" Operation entered: ForkJoinNode::Get_connector_text");
		final ModelRoot modelRoot = getModelRoot();
		String v_result = "";

		if ((p_At == End_c.End)) {

			v_result = getGuardcondition();

		}

		return v_result;

	} // End get_connector_text
	public String Get_name() {
		Ooaofooa.log.println(ILogger.OPERATION, "Fork Join Node",
				" Operation entered: ForkJoinNode::Get_name");
		final ModelRoot modelRoot = getModelRoot();
		return getGuardcondition();

	} // End get_name
	public boolean Incomingedgeallowed() {
		Ooaofooa.log.println(ILogger.OPERATION, "Fork Join Node",
				" Operation entered: ForkJoinNode::Incomingedgeallowed");
		final ModelRoot modelRoot = getModelRoot();
		return true;

	} // End incomingEdgeAllowed
	public boolean Outgoingedgeallowed() {
		Ooaofooa.log.println(ILogger.OPERATION, "Fork Join Node",
				" Operation entered: ForkJoinNode::Outgoingedgeallowed");
		final ModelRoot modelRoot = getModelRoot();
		return true;

	} // End outgoingEdgeAllowed

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Fork Join Node
