package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.TransientValueReference_c.java
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
abstract class EV_TRANSIENT_VALUE_REFERENCE extends genericEvent_c {
	public abstract int getEvtcode();
}

public class TransientValueReference_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public TransientValueReference_c(ModelRoot modelRoot,
			java.util.UUID p_m_value_id, java.util.UUID p_m_var_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_value_id = IdAssigner.preprocessUUID(p_m_value_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_var_id = IdAssigner.preprocessUUID(p_m_var_id);

		Object[] key = {m_value_id};
		addInstanceToMap(key);
	}
	static public TransientValueReference_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_value_id, java.util.UUID p_m_var_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(TransientValueReference_c.class);
		TransientValueReference_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_value_id};
			new_inst = (TransientValueReference_c) instances.get(key);
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
				new_inst.m_value_id = IdAssigner.preprocessUUID(p_m_value_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_var_id = IdAssigner.preprocessUUID(p_m_var_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new TransientValueReference_c(modelRoot, p_m_value_id,
					p_m_var_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public TransientValueReference_c resolveInstance(
			ModelRoot modelRoot, java.util.UUID p_m_value_id,
			java.util.UUID p_m_var_id) {
		InstanceList instances = modelRoot
				.getInstanceList(TransientValueReference_c.class);
		TransientValueReference_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_value_id};
			source = (TransientValueReference_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_value_id = IdAssigner.preprocessUUID(p_m_value_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_var_id = IdAssigner.preprocessUUID(p_m_var_id);

				return source;
			}
		}
		// there is no instance matching the id
		TransientValueReference_c new_inst = new TransientValueReference_c(
				modelRoot, p_m_value_id, p_m_var_id);
		return new_inst;
	}
	public TransientValueReference_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_value_id = IdAssigner.NULL_UUID;
		m_var_id = IdAssigner.NULL_UUID;
		Object[] key = {m_value_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_value_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_value_id != p_newKey) {

			m_value_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof TransientValueReference_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof TransientValueReference_c)) {
			return false;
		}

		TransientValueReference_c me = (TransientValueReference_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getValue_id()) || IdAssigner.NULL_UUID
				.equals(((TransientValueReference_c) elem).getValue_id()))
				&& this != elem) {
			return false;
		}
		if (!getValue_id().equals(
				((TransientValueReference_c) elem).getValue_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof TransientValueReference_c)) {
			return false;
		}

		TransientValueReference_c me = (TransientValueReference_c) elem;
		if (!getValue_idCachedValue().equals(
				((TransientValueReference_c) elem).getValue_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_value_id;
	private java.util.UUID m_var_id;

	// declare association references from this class

	// referring navigation

	Variable_c ReferencesVariable;
	public void relateAcrossR805To(Variable_c target) {
		relateAcrossR805To(target, true);
	}
	public void relateAcrossR805To(Variable_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == ReferencesVariable)
			return; // already related

		if (ReferencesVariable != target) {

			Object oldKey = getInstanceKey();

			if (ReferencesVariable != null) {

				ReferencesVariable.clearBackPointerR805To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"TransientValueReference_c.relateAcrossR805To(Variable_c target)",
									"Relate performed across R805 from Transient Value Reference to Variable without unrelate of prior instance.");
				}
			}

			ReferencesVariable = target;
			m_var_id = target.getVar_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR805To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR805From(Variable_c target) {
		unrelateAcrossR805From(target, true);
	}
	public void unrelateAcrossR805From(Variable_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (ReferencesVariable == null)
			return; // already unrelated

		if (target != ReferencesVariable) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R805",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR805To(this);
		}

		if (ReferencesVariable != null) {

			m_var_id = ReferencesVariable.getVar_id();
			ReferencesVariable = null;
			target.removeRef();
		}
	}

	public static TransientValueReference_c getOneV_TVLOnR805(
			Variable_c[] targets) {
		return getOneV_TVLOnR805(targets, null);
	}

	public static TransientValueReference_c getOneV_TVLOnR805(
			Variable_c[] targets, ClassQueryInterface_c test) {
		TransientValueReference_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneV_TVLOnR805(targets[i], test);
			}
		}

		return ret_val;
	}

	public static TransientValueReference_c getOneV_TVLOnR805(Variable_c target) {
		return getOneV_TVLOnR805(target, null);
	}

	public static TransientValueReference_c getOneV_TVLOnR805(
			Variable_c target, boolean loadComponent) {
		return getOneV_TVLOnR805(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static TransientValueReference_c getOneV_TVLOnR805(
			Variable_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneV_TVLOnR805(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static TransientValueReference_c getOneV_TVLOnR805(
			ModelRoot modelRoot, Variable_c target, ClassQueryInterface_c test) {
		return getOneV_TVLOnR805(modelRoot, target, test, true);
	}

	public static TransientValueReference_c getOneV_TVLOnR805(
			ModelRoot modelRoot, Variable_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneV_TVLOnR805(modelRoot, target, test);
	}
	private static TransientValueReference_c find_getOneV_TVLOnR805(
			ModelRoot modelRoot, Variable_c target, ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_TransientValueReference_R805) {
				for (int i = 0; i < target.backPointer_TransientValueReference_R805
						.size(); ++i) {
					TransientValueReference_c source = (TransientValueReference_c) target.backPointer_TransientValueReference_R805
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static TransientValueReference_c[] getManyV_TVLsOnR805(
			Variable_c[] targets) {
		return getManyV_TVLsOnR805(targets, null);
	}
	public static TransientValueReference_c[] getManyV_TVLsOnR805(
			Variable_c[] targets, boolean loadComponent) {
		return getManyV_TVLsOnR805(targets, null, loadComponent);
	}
	public static TransientValueReference_c[] getManyV_TVLsOnR805(
			Variable_c[] targets, ClassQueryInterface_c test) {
		return getManyV_TVLsOnR805(targets, test, true);
	}

	public static TransientValueReference_c[] getManyV_TVLsOnR805(
			Variable_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new TransientValueReference_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(TransientValueReference_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_TransientValueReference_R805) {
				for (int j = 0; j < targets[i].backPointer_TransientValueReference_R805
						.size(); ++j) {
					TransientValueReference_c source = (TransientValueReference_c) targets[i].backPointer_TransientValueReference_R805
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			TransientValueReference_c[] ret_set = new TransientValueReference_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new TransientValueReference_c[0];
		}
	}

	public static TransientValueReference_c[] getManyV_TVLsOnR805(
			Variable_c target) {
		return getManyV_TVLsOnR805(target, null);
	}

	public static TransientValueReference_c[] getManyV_TVLsOnR805(
			Variable_c target, boolean loadComponent) {
		return getManyV_TVLsOnR805(target, null, loadComponent);
	}

	public static TransientValueReference_c[] getManyV_TVLsOnR805(
			Variable_c target, ClassQueryInterface_c test) {
		return getManyV_TVLsOnR805(target, test, true);
	}

	public static TransientValueReference_c[] getManyV_TVLsOnR805(
			Variable_c target, ClassQueryInterface_c test, boolean loadComponent) {
		if (target == null)
			return new TransientValueReference_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		Vector matches = new Vector();
		synchronized (target.backPointer_TransientValueReference_R805) {
			for (int i = 0; i < target.backPointer_TransientValueReference_R805
					.size(); ++i) {
				TransientValueReference_c source = (TransientValueReference_c) target.backPointer_TransientValueReference_R805
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			TransientValueReference_c[] ret_set = new TransientValueReference_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new TransientValueReference_c[0];
		}
	}

	// referring navigation

	Value_c IsSupertypeValue;
	public void relateAcrossR801To(Value_c target) {
		relateAcrossR801To(target, true);
	}
	public void relateAcrossR801To(Value_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeValue)
			return; // already related

		if (IsSupertypeValue != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeValue != null) {

				IsSupertypeValue.clearBackPointerR801To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"TransientValueReference_c.relateAcrossR801To(Value_c target)",
									"Relate performed across R801 from Transient Value Reference to Value without unrelate of prior instance.");
				}
			}

			IsSupertypeValue = target;
			m_value_id = target.getValue_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR801To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR801From(Value_c target) {
		unrelateAcrossR801From(target, true);
	}
	public void unrelateAcrossR801From(Value_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeValue == null)
			return; // already unrelated

		if (target != IsSupertypeValue) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R801",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR801To(this);
		}

		if (IsSupertypeValue != null) {

			m_value_id = IsSupertypeValue.getValue_id();
			IsSupertypeValue = null;
			target.removeRef();
		}
	}

	public static TransientValueReference_c getOneV_TVLOnR801(Value_c[] targets) {
		return getOneV_TVLOnR801(targets, null);
	}

	public static TransientValueReference_c getOneV_TVLOnR801(
			Value_c[] targets, ClassQueryInterface_c test) {
		TransientValueReference_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneV_TVLOnR801(targets[i], test);
			}
		}

		return ret_val;
	}

	public static TransientValueReference_c getOneV_TVLOnR801(Value_c target) {
		return getOneV_TVLOnR801(target, null);
	}

	public static TransientValueReference_c getOneV_TVLOnR801(Value_c target,
			boolean loadComponent) {
		return getOneV_TVLOnR801(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static TransientValueReference_c getOneV_TVLOnR801(Value_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneV_TVLOnR801(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static TransientValueReference_c getOneV_TVLOnR801(
			ModelRoot modelRoot, Value_c target, ClassQueryInterface_c test) {
		return getOneV_TVLOnR801(modelRoot, target, test, true);
	}

	public static TransientValueReference_c getOneV_TVLOnR801(
			ModelRoot modelRoot, Value_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneV_TVLOnR801(modelRoot, target, test);
	}
	private static TransientValueReference_c find_getOneV_TVLOnR801(
			ModelRoot modelRoot, Value_c target, ClassQueryInterface_c test) {
		if (target != null) {
			TransientValueReference_c source = (TransientValueReference_c) target.backPointer_IsSubtypeTransientValueReferenceIsSubtype_R801;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static TransientValueReference_c[] getManyV_TVLsOnR801(
			Value_c[] targets) {
		return getManyV_TVLsOnR801(targets, null);
	}
	public static TransientValueReference_c[] getManyV_TVLsOnR801(
			Value_c[] targets, boolean loadComponent) {
		return getManyV_TVLsOnR801(targets, null, loadComponent);
	}
	public static TransientValueReference_c[] getManyV_TVLsOnR801(
			Value_c[] targets, ClassQueryInterface_c test) {
		return getManyV_TVLsOnR801(targets, test, true);
	}

	public static TransientValueReference_c[] getManyV_TVLsOnR801(
			Value_c[] targets, ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new TransientValueReference_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(TransientValueReference_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			TransientValueReference_c source = (TransientValueReference_c) targets[i].backPointer_IsSubtypeTransientValueReferenceIsSubtype_R801;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			TransientValueReference_c[] ret_set = new TransientValueReference_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new TransientValueReference_c[0];
		}
	}

	public static TransientValueReference_c[] getManyV_TVLsOnR801(Value_c target) {
		if (target != null) {
			Value_c[] targetArray = new Value_c[1];
			targetArray[0] = target;
			return getManyV_TVLsOnR801(targetArray);
		} else {
			TransientValueReference_c[] result = new TransientValueReference_c[0];
			return result;
		}
	}

	public static TransientValueReference_c[] getManyV_TVLsOnR801(
			Value_c target, boolean loadComponent) {
		if (target != null) {
			Value_c[] targetArray = new Value_c[1];
			targetArray[0] = target;
			return getManyV_TVLsOnR801(targetArray, loadComponent);
		} else {
			TransientValueReference_c[] result = new TransientValueReference_c[0];
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

		if (ReferencesVariable == null) {
			// R805
			Variable_c relInst37416 = (Variable_c) baseRoot.getInstanceList(
					Variable_c.class).get(new Object[]{m_var_id});
			// if there was no local element, check for any global elements
			// failing that proceed to check other model roots
			if (relInst37416 == null) {
				relInst37416 = (Variable_c) Ooaofooa.getDefaultInstance()
						.getInstanceList(Variable_c.class)
						.get(new Object[]{m_var_id});
			}
			if (relInst37416 == null && searchAllRoots
					&& !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
					if (roots[i].isCompareRoot()) {
						// never use elements from any compare root
						continue;
					}
					relInst37416 = (Variable_c) roots[i].getInstanceList(
							Variable_c.class).get(new Object[]{m_var_id});
					if (relInst37416 != null)
						break;
				}
			}
			//synchronized
			if (relInst37416 != null) {
				if (relateProxies || !isProxy()
						|| (inSameComponent(this, relInst37416) && !isProxy())) {
					relInst37416.relateAcrossR805To(this, notifyChanges);
				}
			}
		}

		// R801
		Value_c relInst37417 = (Value_c) baseRoot
				.getInstanceList(Value_c.class).get(new Object[]{m_value_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst37417 == null) {
			relInst37417 = (Value_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Value_c.class)
					.get(new Object[]{m_value_id});
		}
		if (relInst37417 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst37417 = (Value_c) roots[i]
						.getInstanceList(Value_c.class).get(
								new Object[]{m_value_id});
				if (relInst37417 != null)
					break;
			}
		}
		//synchronized
		if (relInst37417 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst37417) && !isProxy())) {
				relInst37417.relateAcrossR801To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R805
		// V_VAR
		inst = ReferencesVariable;
		unrelateAcrossR805From(ReferencesVariable, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// R801
		// V_VAL
		inst = IsSupertypeValue;
		unrelateAcrossR801From(IsSupertypeValue, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(TransientValueReference_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final TransientValueReference_c inst = (TransientValueReference_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(TransientValueReference_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static TransientValueReference_c TransientValueReferenceInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		TransientValueReference_c result = findTransientValueReferenceInstance(
				modelRoot, test, loadComponent);
		return result;
	}
	private static TransientValueReference_c findTransientValueReferenceInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(TransientValueReference_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				TransientValueReference_c x = (TransientValueReference_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static TransientValueReference_c TransientValueReferenceInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return TransientValueReferenceInstance(modelRoot, test, true);
	}

	public static TransientValueReference_c TransientValueReferenceInstance(
			ModelRoot modelRoot) {
		return TransientValueReferenceInstance(modelRoot, null, true);
	}

	public static TransientValueReference_c[] TransientValueReferenceInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(TransientValueReference_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				TransientValueReference_c x = (TransientValueReference_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				TransientValueReference_c[] ret_set = new TransientValueReference_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new TransientValueReference_c[0];
			}
		}
	}
	public static TransientValueReference_c[] TransientValueReferenceInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return TransientValueReferenceInstances(modelRoot, test, true);
	}
	public static TransientValueReference_c[] TransientValueReferenceInstances(
			ModelRoot modelRoot) {
		return TransientValueReferenceInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Transient Value Reference.dispose call: ";
		Variable_c testR805Inst = Variable_c.getOneV_VAROnR805(this, false);

		if (testR805Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "805 ";
		}
		Value_c testR801Inst13 = Value_c.getOneV_VALOnR801(this, false);

		if (testR801Inst13 != null) {
			delete_error = true;
			errorMsg = errorMsg + "801 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE,
						"Transient Value Reference", errorMsg);
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
		if (attributeName.equals("value_id")) {
			return true;
		}
		if (attributeName.equals("var_id")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getValue_idLongBased() {
		if (IsSupertypeValue != null) {
			return IsSupertypeValue.getValue_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getValue_id() {
		if (IsSupertypeValue != null) {
			return IsSupertypeValue.getValue_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeValue != null);

	}

	public java.util.UUID getValue_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_value_id))
			return m_value_id;
		else
			return getValue_id();
	}

	public void setValue_id(java.util.UUID newValue) {
		m_value_id = IdAssigner.preprocessUUID(newValue);
	}
	public long getVar_idLongBased() {
		if (ReferencesVariable != null) {
			return ReferencesVariable.getVar_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getVar_id() {
		if (ReferencesVariable != null) {
			return ReferencesVariable.getVar_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getVar_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_var_id))
			return m_var_id;
		else
			return getVar_id();
	}

	public void setVar_id(java.util.UUID newValue) {
		m_var_id = IdAssigner.preprocessUUID(newValue);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Transient Value Reference", //$NON-NLS-1$
						" Operation entered: Transient Value Reference::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		TransientValueReference_c[] objs = TransientValueReference_c
				.TransientValueReferenceInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Transient Value Reference", //$NON-NLS-1$
						" Operation entered: Transient Value Reference::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class TransientValueReference_c_test37419_c
				implements
					ClassQueryInterface_c {
			TransientValueReference_c_test37419_c(java.util.UUID p37420) {
				m_p37420 = p37420;
			}
			private java.util.UUID m_p37420;
			public boolean evaluate(Object candidate) {
				TransientValueReference_c selected = (TransientValueReference_c) candidate;
				boolean retval = false;
				retval = (selected.getValue_id().equals(m_p37420));
				return retval;
			}
		}

		TransientValueReference_c[] objs37418 = TransientValueReference_c
				.TransientValueReferenceInstances(
						modelRoot,
						new TransientValueReference_c_test37419_c(getValue_id()));

		if (((objs37418.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Transient Value Reference", //$NON-NLS-1$
								"Consistency: Object: Transient Value Reference: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs37418.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Transient Value Reference: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37418.length), e);
			}
			retval = false;

		}

		if (((objs37418.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Transient Value Reference", //$NON-NLS-1$
								"Consistency: Object: Transient Value Reference: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs37418.length)
										+ " Value_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Transient Value Reference: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37418.length)
										+ " Value_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Transient Value Reference is a subtype in association: rel.Numb = 801
		// The supertype class is: Value
		class Value_c_test37424_c implements ClassQueryInterface_c {
			Value_c_test37424_c(java.util.UUID p37425) {
				m_p37425 = p37425;
			}
			private java.util.UUID m_p37425;
			public boolean evaluate(Object candidate) {
				Value_c selected = (Value_c) candidate;
				boolean retval = false;
				retval = (selected.getValue_id().equals(m_p37425));
				return retval;
			}
		}

		Value_c[] objs37423 = Value_c.ValueInstances(modelRoot,
				new Value_c_test37424_c(getValue_id()));

		if (((objs37423.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Transient Value Reference", //$NON-NLS-1$
								"Consistency: Object: Transient Value Reference: Association: 801: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs37423.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Transient Value Reference: Association: 801: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37423.length), e);
			}
			retval = false;

		}

		// Transient Value Reference is a referring class in association: rel.Numb = 805
		// The participating class is: Variable
		class Variable_c_test37427_c implements ClassQueryInterface_c {
			Variable_c_test37427_c(java.util.UUID p37428) {
				m_p37428 = p37428;
			}
			private java.util.UUID m_p37428;
			public boolean evaluate(Object candidate) {
				Variable_c selected = (Variable_c) candidate;
				boolean retval = false;
				retval = (selected.getVar_id().equals(m_p37428));
				return retval;
			}
		}

		Variable_c[] objs37426 = Variable_c.VariableInstances(modelRoot,
				new Variable_c_test37427_c(getVar_id()));

		// The participant is unconditional
		// The multiplicity of the participant is one
		if (((objs37426.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Transient Value Reference", //$NON-NLS-1$
								"Consistency: Object: Transient Value Reference: Association: 805: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs37426.length)
										+ " Var_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Transient Value Reference: Association: 805: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37426.length)
										+ " Var_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public Object Getvalue(final java.util.UUID p_Stack_frame_id) {
		Ooaofooa.log.println(ILogger.OPERATION, "Transient Value Reference",
				" Operation entered: TransientValueReference::Getvalue");
		final ModelRoot modelRoot = getModelRoot();
		return Gd_c.Null_instance();

	} // End getValue
	public void Setvalue(final java.util.UUID p_Member_id,
			final java.util.UUID p_Stack_frame_id, final Object p_Value) {
		Ooaofooa.log.println(ILogger.OPERATION, "Transient Value Reference",
				" Operation entered: TransientValueReference::Setvalue");
		final ModelRoot modelRoot = getModelRoot();

	} // End setValue
	public java.util.UUID Getruntimevalue(final java.util.UUID p_Stack_frame_id) {
		Ooaofooa.log.println(ILogger.OPERATION, "Transient Value Reference",
				" Operation entered: TransientValueReference::Getruntimevalue");
		final ModelRoot modelRoot = getModelRoot();
		return Gd_c.Null_unique_id();

	} // End getRuntimeValue

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Transient Value Reference
