package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.InstanceSet_c.java
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
abstract class EV_INSTANCE_SET extends genericEvent_c {
	public abstract int getEvtcode();
}

public class InstanceSet_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public InstanceSet_c(ModelRoot modelRoot, java.util.UUID p_m_var_id,
			java.util.UUID p_m_obj_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_var_id = IdAssigner.preprocessUUID(p_m_var_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_obj_id = IdAssigner.preprocessUUID(p_m_obj_id);

		Object[] key = {m_var_id};
		addInstanceToMap(key);
	}
	static public InstanceSet_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_var_id, java.util.UUID p_m_obj_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot.getInstanceList(InstanceSet_c.class);
		InstanceSet_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_var_id};
			new_inst = (InstanceSet_c) instances.get(key);
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
				new_inst.m_var_id = IdAssigner.preprocessUUID(p_m_var_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_obj_id = IdAssigner.preprocessUUID(p_m_obj_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new InstanceSet_c(modelRoot, p_m_var_id, p_m_obj_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public InstanceSet_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_var_id, java.util.UUID p_m_obj_id) {
		InstanceList instances = modelRoot.getInstanceList(InstanceSet_c.class);
		InstanceSet_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_var_id};
			source = (InstanceSet_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_var_id = IdAssigner.preprocessUUID(p_m_var_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_obj_id = IdAssigner.preprocessUUID(p_m_obj_id);

				return source;
			}
		}
		// there is no instance matching the id
		InstanceSet_c new_inst = new InstanceSet_c(modelRoot, p_m_var_id,
				p_m_obj_id);
		return new_inst;
	}
	public InstanceSet_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_var_id = IdAssigner.NULL_UUID;
		m_obj_id = IdAssigner.NULL_UUID;
		Object[] key = {m_var_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_var_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_var_id != p_newKey) {

			m_var_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof InstanceSet_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof InstanceSet_c)) {
			return false;
		}

		InstanceSet_c me = (InstanceSet_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getVar_id()) || IdAssigner.NULL_UUID
				.equals(((InstanceSet_c) elem).getVar_id())) && this != elem) {
			return false;
		}
		if (!getVar_id().equals(((InstanceSet_c) elem).getVar_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof InstanceSet_c)) {
			return false;
		}

		InstanceSet_c me = (InstanceSet_c) elem;
		if (!getVar_idCachedValue().equals(
				((InstanceSet_c) elem).getVar_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_var_id;
	private java.util.UUID m_obj_id;

	// declare association references from this class

	// referring navigation

	Variable_c IsSupertypeVariable;
	public void relateAcrossR814To(Variable_c target) {
		relateAcrossR814To(target, true);
	}
	public void relateAcrossR814To(Variable_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeVariable)
			return; // already related

		if (IsSupertypeVariable != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeVariable != null) {

				IsSupertypeVariable.clearBackPointerR814To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"InstanceSet_c.relateAcrossR814To(Variable_c target)",
									"Relate performed across R814 from Instance Set to Variable without unrelate of prior instance.");
				}
			}

			IsSupertypeVariable = target;
			m_var_id = target.getVar_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR814To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR814From(Variable_c target) {
		unrelateAcrossR814From(target, true);
	}
	public void unrelateAcrossR814From(Variable_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeVariable == null)
			return; // already unrelated

		if (target != IsSupertypeVariable) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R814",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR814To(this);
		}

		if (IsSupertypeVariable != null) {

			m_var_id = IsSupertypeVariable.getVar_id();
			IsSupertypeVariable = null;
			target.removeRef();
		}
	}

	public static InstanceSet_c getOneV_INSOnR814(Variable_c[] targets) {
		return getOneV_INSOnR814(targets, null);
	}

	public static InstanceSet_c getOneV_INSOnR814(Variable_c[] targets,
			ClassQueryInterface_c test) {
		InstanceSet_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneV_INSOnR814(targets[i], test);
			}
		}

		return ret_val;
	}

	public static InstanceSet_c getOneV_INSOnR814(Variable_c target) {
		return getOneV_INSOnR814(target, null);
	}

	public static InstanceSet_c getOneV_INSOnR814(Variable_c target,
			boolean loadComponent) {
		return getOneV_INSOnR814(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static InstanceSet_c getOneV_INSOnR814(Variable_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneV_INSOnR814(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static InstanceSet_c getOneV_INSOnR814(ModelRoot modelRoot,
			Variable_c target, ClassQueryInterface_c test) {
		return getOneV_INSOnR814(modelRoot, target, test, true);
	}

	public static InstanceSet_c getOneV_INSOnR814(ModelRoot modelRoot,
			Variable_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneV_INSOnR814(modelRoot, target, test);
	}
	private static InstanceSet_c find_getOneV_INSOnR814(ModelRoot modelRoot,
			Variable_c target, ClassQueryInterface_c test) {
		if (target != null) {
			InstanceSet_c source = (InstanceSet_c) target.backPointer_IsSubtypeInstanceSetIsSubtype_R814;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static InstanceSet_c[] getManyV_INSsOnR814(Variable_c[] targets) {
		return getManyV_INSsOnR814(targets, null);
	}
	public static InstanceSet_c[] getManyV_INSsOnR814(Variable_c[] targets,
			boolean loadComponent) {
		return getManyV_INSsOnR814(targets, null, loadComponent);
	}
	public static InstanceSet_c[] getManyV_INSsOnR814(Variable_c[] targets,
			ClassQueryInterface_c test) {
		return getManyV_INSsOnR814(targets, test, true);
	}

	public static InstanceSet_c[] getManyV_INSsOnR814(Variable_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new InstanceSet_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot.getInstanceList(InstanceSet_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			InstanceSet_c source = (InstanceSet_c) targets[i].backPointer_IsSubtypeInstanceSetIsSubtype_R814;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			InstanceSet_c[] ret_set = new InstanceSet_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new InstanceSet_c[0];
		}
	}

	public static InstanceSet_c[] getManyV_INSsOnR814(Variable_c target) {
		if (target != null) {
			Variable_c[] targetArray = new Variable_c[1];
			targetArray[0] = target;
			return getManyV_INSsOnR814(targetArray);
		} else {
			InstanceSet_c[] result = new InstanceSet_c[0];
			return result;
		}
	}

	public static InstanceSet_c[] getManyV_INSsOnR814(Variable_c target,
			boolean loadComponent) {
		if (target != null) {
			Variable_c[] targetArray = new Variable_c[1];
			targetArray[0] = target;
			return getManyV_INSsOnR814(targetArray, loadComponent);
		} else {
			InstanceSet_c[] result = new InstanceSet_c[0];
			return result;
		}
	}

	// referring navigation

	ModelClass_c RefersToModelClass;
	public void relateAcrossR819To(ModelClass_c target) {
		relateAcrossR819To(target, true);
	}
	public void relateAcrossR819To(ModelClass_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == RefersToModelClass)
			return; // already related

		if (RefersToModelClass != target) {

			Object oldKey = getInstanceKey();

			if (RefersToModelClass != null) {

				RefersToModelClass.clearBackPointerR819To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"InstanceSet_c.relateAcrossR819To(ModelClass_c target)",
									"Relate performed across R819 from Instance Set to Model Class without unrelate of prior instance.");
				}
			}

			RefersToModelClass = target;
			if (IdAssigner.NULL_UUID.equals(target.getObj_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_obj_id = target.getObj_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR819To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR819From(ModelClass_c target) {
		unrelateAcrossR819From(target, true);
	}
	public void unrelateAcrossR819From(ModelClass_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (RefersToModelClass == null)
			return; // already unrelated

		if (target != RefersToModelClass) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R819",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR819To(this);
		}

		if (RefersToModelClass != null) {

			m_obj_id = RefersToModelClass.getObj_id();
			if (IdAssigner.NULL_UUID.equals(m_obj_id)) {
				m_obj_id = RefersToModelClass.getObj_idCachedValue();
			}
			RefersToModelClass = null;
			target.removeRef();
		}
	}

	public static InstanceSet_c getOneV_INSOnR819(ModelClass_c[] targets) {
		return getOneV_INSOnR819(targets, null);
	}

	public static InstanceSet_c getOneV_INSOnR819(ModelClass_c[] targets,
			ClassQueryInterface_c test) {
		InstanceSet_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneV_INSOnR819(targets[i], test);
			}
		}

		return ret_val;
	}

	public static InstanceSet_c getOneV_INSOnR819(ModelClass_c target) {
		return getOneV_INSOnR819(target, null);
	}

	public static InstanceSet_c getOneV_INSOnR819(ModelClass_c target,
			boolean loadComponent) {
		return getOneV_INSOnR819(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static InstanceSet_c getOneV_INSOnR819(ModelClass_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneV_INSOnR819(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static InstanceSet_c getOneV_INSOnR819(ModelRoot modelRoot,
			ModelClass_c target, ClassQueryInterface_c test) {
		return getOneV_INSOnR819(modelRoot, target, test, true);
	}

	public static InstanceSet_c getOneV_INSOnR819(ModelRoot modelRoot,
			ModelClass_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneV_INSOnR819(modelRoot, target, test);
	}
	private static InstanceSet_c find_getOneV_INSOnR819(ModelRoot modelRoot,
			ModelClass_c target, ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_InstanceSet_R819) {
				for (int i = 0; i < target.backPointer_InstanceSet_R819.size(); ++i) {
					InstanceSet_c source = (InstanceSet_c) target.backPointer_InstanceSet_R819
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

	public static InstanceSet_c[] getManyV_INSsOnR819(ModelClass_c[] targets) {
		return getManyV_INSsOnR819(targets, null);
	}
	public static InstanceSet_c[] getManyV_INSsOnR819(ModelClass_c[] targets,
			boolean loadComponent) {
		return getManyV_INSsOnR819(targets, null, loadComponent);
	}
	public static InstanceSet_c[] getManyV_INSsOnR819(ModelClass_c[] targets,
			ClassQueryInterface_c test) {
		return getManyV_INSsOnR819(targets, test, true);
	}

	public static InstanceSet_c[] getManyV_INSsOnR819(ModelClass_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new InstanceSet_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot.getInstanceList(InstanceSet_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_InstanceSet_R819) {
				for (int j = 0; j < targets[i].backPointer_InstanceSet_R819
						.size(); ++j) {
					InstanceSet_c source = (InstanceSet_c) targets[i].backPointer_InstanceSet_R819
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			InstanceSet_c[] ret_set = new InstanceSet_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new InstanceSet_c[0];
		}
	}

	public static InstanceSet_c[] getManyV_INSsOnR819(ModelClass_c target) {
		return getManyV_INSsOnR819(target, null);
	}

	public static InstanceSet_c[] getManyV_INSsOnR819(ModelClass_c target,
			boolean loadComponent) {
		return getManyV_INSsOnR819(target, null, loadComponent);
	}

	public static InstanceSet_c[] getManyV_INSsOnR819(ModelClass_c target,
			ClassQueryInterface_c test) {
		return getManyV_INSsOnR819(target, test, true);
	}

	public static InstanceSet_c[] getManyV_INSsOnR819(ModelClass_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		if (target == null)
			return new InstanceSet_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		Vector matches = new Vector();
		synchronized (target.backPointer_InstanceSet_R819) {
			for (int i = 0; i < target.backPointer_InstanceSet_R819.size(); ++i) {
				InstanceSet_c source = (InstanceSet_c) target.backPointer_InstanceSet_R819
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			InstanceSet_c[] ret_set = new InstanceSet_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new InstanceSet_c[0];
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

		// R814
		Variable_c relInst37607 = (Variable_c) baseRoot.getInstanceList(
				Variable_c.class).get(new Object[]{m_var_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst37607 == null) {
			relInst37607 = (Variable_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Variable_c.class)
					.get(new Object[]{m_var_id});
		}
		if (relInst37607 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst37607 = (Variable_c) roots[i].getInstanceList(
						Variable_c.class).get(new Object[]{m_var_id});
				if (relInst37607 != null)
					break;
			}
		}
		//synchronized
		if (relInst37607 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst37607) && !isProxy())) {
				relInst37607.relateAcrossR814To(this, notifyChanges);
			}
		}

		if (RefersToModelClass == null) {
			// R819
			ModelClass_c relInst37608 = (ModelClass_c) baseRoot
					.getInstanceList(ModelClass_c.class).get(
							new Object[]{m_obj_id});
			// if there was no local element, check for any global elements
			// failing that proceed to check other model roots
			if (relInst37608 == null) {
				relInst37608 = (ModelClass_c) Ooaofooa.getDefaultInstance()
						.getInstanceList(ModelClass_c.class)
						.get(new Object[]{m_obj_id});
			}
			if (relInst37608 == null && searchAllRoots
					&& !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
					if (roots[i].isCompareRoot()) {
						// never use elements from any compare root
						continue;
					}
					relInst37608 = (ModelClass_c) roots[i].getInstanceList(
							ModelClass_c.class).get(new Object[]{m_obj_id});
					if (relInst37608 != null)
						break;
				}
			}
			//synchronized
			if (relInst37608 != null) {
				if (relateProxies || !isProxy()
						|| (inSameComponent(this, relInst37608) && !isProxy())) {
					relInst37608.relateAcrossR819To(this, notifyChanges);
				}
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R814
		// V_VAR
		inst = IsSupertypeVariable;
		unrelateAcrossR814From(IsSupertypeVariable, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// R819
		// O_OBJ
		inst = RefersToModelClass;
		unrelateAcrossR819From(RefersToModelClass, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(InstanceSet_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final InstanceSet_c inst = (InstanceSet_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot.getInstanceList(InstanceSet_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static InstanceSet_c InstanceSetInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		InstanceSet_c result = findInstanceSetInstance(modelRoot, test,
				loadComponent);
		return result;
	}
	private static InstanceSet_c findInstanceSetInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		InstanceList instances = modelRoot.getInstanceList(InstanceSet_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				InstanceSet_c x = (InstanceSet_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static InstanceSet_c InstanceSetInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return InstanceSetInstance(modelRoot, test, true);
	}

	public static InstanceSet_c InstanceSetInstance(ModelRoot modelRoot) {
		return InstanceSetInstance(modelRoot, null, true);
	}

	public static InstanceSet_c[] InstanceSetInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		InstanceList instances = modelRoot.getInstanceList(InstanceSet_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				InstanceSet_c x = (InstanceSet_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				InstanceSet_c[] ret_set = new InstanceSet_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new InstanceSet_c[0];
			}
		}
	}
	public static InstanceSet_c[] InstanceSetInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return InstanceSetInstances(modelRoot, test, true);
	}
	public static InstanceSet_c[] InstanceSetInstances(ModelRoot modelRoot) {
		return InstanceSetInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Instance Set.dispose call: ";
		Variable_c testR814Inst2 = Variable_c.getOneV_VAROnR814(this, false);

		if (testR814Inst2 != null) {
			delete_error = true;
			errorMsg = errorMsg + "814 ";
		}
		ModelClass_c testR819Inst = ModelClass_c.getOneO_OBJOnR819(this, false);

		if (testR819Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "819 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Instance Set", errorMsg);
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
		if (attributeName.equals("var_id")) {
			return true;
		}
		if (attributeName.equals("obj_id")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getVar_idLongBased() {
		if (IsSupertypeVariable != null) {
			return IsSupertypeVariable.getVar_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getVar_id() {
		if (IsSupertypeVariable != null) {
			return IsSupertypeVariable.getVar_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeVariable != null);

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
	public long getObj_idLongBased() {
		if (RefersToModelClass != null) {
			return RefersToModelClass.getObj_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getObj_id() {
		if (RefersToModelClass != null) {
			return RefersToModelClass.getObj_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getObj_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_obj_id))
			return m_obj_id;
		else
			return getObj_id();
	}

	public void setObj_id(java.util.UUID newValue) {
		m_obj_id = IdAssigner.preprocessUUID(newValue);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log.println(ILogger.OPERATION, "Instance Set", //$NON-NLS-1$
				" Operation entered: Instance Set::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		InstanceSet_c[] objs = InstanceSet_c.InstanceSetInstances(modelRoot,
				null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Instance Set", //$NON-NLS-1$
				" Operation entered: Instance Set::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class InstanceSet_c_test37610_c implements ClassQueryInterface_c {
			InstanceSet_c_test37610_c(java.util.UUID p37611) {
				m_p37611 = p37611;
			}
			private java.util.UUID m_p37611;
			public boolean evaluate(Object candidate) {
				InstanceSet_c selected = (InstanceSet_c) candidate;
				boolean retval = false;
				retval = (selected.getVar_id().equals(m_p37611));
				return retval;
			}
		}

		InstanceSet_c[] objs37609 = InstanceSet_c.InstanceSetInstances(
				modelRoot, new InstanceSet_c_test37610_c(getVar_id()));

		if (((objs37609.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Instance Set", //$NON-NLS-1$
								"Consistency: Object: Instance Set: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs37609.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin.logError(
						"Consistency: Object: Instance Set: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
								+ "Actual Value: " //$NON-NLS-1$
								+ Integer.toString(objs37609.length), e);
			}
			retval = false;

		}

		if (((objs37609.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Instance Set", //$NON-NLS-1$
								"Consistency: Object: Instance Set: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs37609.length)
										+ " Var_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Instance Set: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37609.length)
										+ " Var_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Instance Set is a subtype in association: rel.Numb = 814
		// The supertype class is: Variable
		class Variable_c_test37615_c implements ClassQueryInterface_c {
			Variable_c_test37615_c(java.util.UUID p37616) {
				m_p37616 = p37616;
			}
			private java.util.UUID m_p37616;
			public boolean evaluate(Object candidate) {
				Variable_c selected = (Variable_c) candidate;
				boolean retval = false;
				retval = (selected.getVar_id().equals(m_p37616));
				return retval;
			}
		}

		Variable_c[] objs37614 = Variable_c.VariableInstances(modelRoot,
				new Variable_c_test37615_c(getVar_id()));

		if (((objs37614.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Instance Set", //$NON-NLS-1$
								"Consistency: Object: Instance Set: Association: 814: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs37614.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Instance Set: Association: 814: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37614.length), e);
			}
			retval = false;

		}

		// Instance Set is a referring class in association: rel.Numb = 819
		// The participating class is: Model Class
		class ModelClass_c_test37618_c implements ClassQueryInterface_c {
			ModelClass_c_test37618_c(java.util.UUID p37619) {
				m_p37619 = p37619;
			}
			private java.util.UUID m_p37619;
			public boolean evaluate(Object candidate) {
				ModelClass_c selected = (ModelClass_c) candidate;
				boolean retval = false;
				retval = (selected.getObj_id().equals(m_p37619));
				return retval;
			}
		}

		ModelClass_c[] objs37617 = ModelClass_c.ModelClassInstances(modelRoot,
				new ModelClass_c_test37618_c(getObj_id()));

		// The participant is unconditional
		// The multiplicity of the participant is one
		if (((objs37617.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Instance Set", //$NON-NLS-1$
								"Consistency: Object: Instance Set: Association: 819: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs37617.length)
										+ " Obj_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Instance Set: Association: 819: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37617.length)
										+ " Obj_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public boolean Isempty(final java.util.UUID p_Stack_frame_id) {
		Ooaofooa.log.println(ILogger.OPERATION, "Instance Set",
				" Operation entered: InstanceSet::Isempty");
		final ModelRoot modelRoot = getModelRoot();
		return true;

	} // End isEmpty
	public int Getcardinality(final java.util.UUID p_Stack_frame_id) {
		Ooaofooa.log.println(ILogger.OPERATION, "Instance Set",
				" Operation entered: InstanceSet::Getcardinality");
		final ModelRoot modelRoot = getModelRoot();
		return 0;

	} // End getCardinality
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Instance Set",
				" Operation entered: InstanceSet::Dispose");
		final ModelRoot modelRoot = getModelRoot();

	} // End dispose

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Instance Set
