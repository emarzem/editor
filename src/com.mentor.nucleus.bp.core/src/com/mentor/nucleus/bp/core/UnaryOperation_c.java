package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.UnaryOperation_c.java
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
abstract class EV_UNARY_OPERATION extends genericEvent_c {
	public abstract int getEvtcode();
}

public class UnaryOperation_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public UnaryOperation_c(ModelRoot modelRoot, java.util.UUID p_m_value_id,
			java.util.UUID p_m_operand_value_id, String p_m_operator) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_value_id = IdAssigner.preprocessUUID(p_m_value_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_operand_value_id = IdAssigner.preprocessUUID(p_m_operand_value_id);
		m_operator = p_m_operator;

		Object[] key = {m_value_id};
		addInstanceToMap(key);
	}
	static public UnaryOperation_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_value_id, java.util.UUID p_m_operand_value_id,
			String p_m_operator, String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(UnaryOperation_c.class);
		UnaryOperation_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_value_id};
			new_inst = (UnaryOperation_c) instances.get(key);
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
				new_inst.m_operand_value_id = IdAssigner
						.preprocessUUID(p_m_operand_value_id);
				new_inst.m_operator = p_m_operator;

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new UnaryOperation_c(modelRoot, p_m_value_id,
					p_m_operand_value_id, p_m_operator);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public UnaryOperation_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_value_id, java.util.UUID p_m_operand_value_id,
			String p_m_operator) {
		InstanceList instances = modelRoot
				.getInstanceList(UnaryOperation_c.class);
		UnaryOperation_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_value_id};
			source = (UnaryOperation_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_value_id = IdAssigner.preprocessUUID(p_m_value_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_operand_value_id = IdAssigner
						.preprocessUUID(p_m_operand_value_id);
				source.m_operator = p_m_operator;

				return source;
			}
		}
		// there is no instance matching the id
		UnaryOperation_c new_inst = new UnaryOperation_c(modelRoot,
				p_m_value_id, p_m_operand_value_id, p_m_operator);
		return new_inst;
	}
	public UnaryOperation_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_value_id = IdAssigner.NULL_UUID;
		m_operand_value_id = IdAssigner.NULL_UUID;
		m_operator = "";
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
		if (!(elem instanceof UnaryOperation_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof UnaryOperation_c)) {
			return false;
		}

		UnaryOperation_c me = (UnaryOperation_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getValue_id()) || IdAssigner.NULL_UUID
				.equals(((UnaryOperation_c) elem).getValue_id()))
				&& this != elem) {
			return false;
		}
		if (!getValue_id().equals(((UnaryOperation_c) elem).getValue_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof UnaryOperation_c)) {
			return false;
		}

		UnaryOperation_c me = (UnaryOperation_c) elem;
		if (!getValue_idCachedValue().equals(
				((UnaryOperation_c) elem).getValue_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_value_id;
	private java.util.UUID m_operand_value_id;
	private String m_operator;

	// declare association references from this class

	// referring navigation

	Value_c HasOperandValue;
	public void relateAcrossR804To(Value_c target) {
		relateAcrossR804To(target, true);
	}
	public void relateAcrossR804To(Value_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == HasOperandValue)
			return; // already related

		if (HasOperandValue != target) {

			Object oldKey = getInstanceKey();

			if (HasOperandValue != null) {

				HasOperandValue.clearBackPointerR804To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"UnaryOperation_c.relateAcrossR804To(Value_c target)",
									"Relate performed across R804 from Unary Operation to Value without unrelate of prior instance.");
				}
			}

			HasOperandValue = target;
			m_operand_value_id = target.getValue_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR804To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR804From(Value_c target) {
		unrelateAcrossR804From(target, true);
	}
	public void unrelateAcrossR804From(Value_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (HasOperandValue == null)
			return; // already unrelated

		if (target != HasOperandValue) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R804",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR804To(this);
		}

		if (HasOperandValue != null) {

			m_operand_value_id = HasOperandValue.getValue_id();
			HasOperandValue = null;
			target.removeRef();
		}
	}

	public static UnaryOperation_c getOneV_UNYOnR804(Value_c[] targets) {
		return getOneV_UNYOnR804(targets, null);
	}

	public static UnaryOperation_c getOneV_UNYOnR804(Value_c[] targets,
			ClassQueryInterface_c test) {
		UnaryOperation_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneV_UNYOnR804(targets[i], test);
			}
		}

		return ret_val;
	}

	public static UnaryOperation_c getOneV_UNYOnR804(Value_c target) {
		return getOneV_UNYOnR804(target, null);
	}

	public static UnaryOperation_c getOneV_UNYOnR804(Value_c target,
			boolean loadComponent) {
		return getOneV_UNYOnR804(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static UnaryOperation_c getOneV_UNYOnR804(Value_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneV_UNYOnR804(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static UnaryOperation_c getOneV_UNYOnR804(ModelRoot modelRoot,
			Value_c target, ClassQueryInterface_c test) {
		return getOneV_UNYOnR804(modelRoot, target, test, true);
	}

	public static UnaryOperation_c getOneV_UNYOnR804(ModelRoot modelRoot,
			Value_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneV_UNYOnR804(modelRoot, target, test);
	}
	private static UnaryOperation_c find_getOneV_UNYOnR804(ModelRoot modelRoot,
			Value_c target, ClassQueryInterface_c test) {
		if (target != null) {
			UnaryOperation_c source = (UnaryOperation_c) target.backPointer_IsOperandToUnaryOperationIsOperandTo_R804;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static UnaryOperation_c[] getManyV_UNYsOnR804(Value_c[] targets) {
		return getManyV_UNYsOnR804(targets, null);
	}
	public static UnaryOperation_c[] getManyV_UNYsOnR804(Value_c[] targets,
			boolean loadComponent) {
		return getManyV_UNYsOnR804(targets, null, loadComponent);
	}
	public static UnaryOperation_c[] getManyV_UNYsOnR804(Value_c[] targets,
			ClassQueryInterface_c test) {
		return getManyV_UNYsOnR804(targets, test, true);
	}

	public static UnaryOperation_c[] getManyV_UNYsOnR804(Value_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new UnaryOperation_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(UnaryOperation_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			UnaryOperation_c source = (UnaryOperation_c) targets[i].backPointer_IsOperandToUnaryOperationIsOperandTo_R804;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			UnaryOperation_c[] ret_set = new UnaryOperation_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new UnaryOperation_c[0];
		}
	}

	public static UnaryOperation_c[] getManyV_UNYsOnR804(Value_c target) {
		if (target != null) {
			Value_c[] targetArray = new Value_c[1];
			targetArray[0] = target;
			return getManyV_UNYsOnR804(targetArray);
		} else {
			UnaryOperation_c[] result = new UnaryOperation_c[0];
			return result;
		}
	}

	public static UnaryOperation_c[] getManyV_UNYsOnR804(Value_c target,
			boolean loadComponent) {
		if (target != null) {
			Value_c[] targetArray = new Value_c[1];
			targetArray[0] = target;
			return getManyV_UNYsOnR804(targetArray, loadComponent);
		} else {
			UnaryOperation_c[] result = new UnaryOperation_c[0];
			return result;
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
									"UnaryOperation_c.relateAcrossR801To(Value_c target)",
									"Relate performed across R801 from Unary Operation to Value without unrelate of prior instance.");
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

	public static UnaryOperation_c getOneV_UNYOnR801(Value_c[] targets) {
		return getOneV_UNYOnR801(targets, null);
	}

	public static UnaryOperation_c getOneV_UNYOnR801(Value_c[] targets,
			ClassQueryInterface_c test) {
		UnaryOperation_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneV_UNYOnR801(targets[i], test);
			}
		}

		return ret_val;
	}

	public static UnaryOperation_c getOneV_UNYOnR801(Value_c target) {
		return getOneV_UNYOnR801(target, null);
	}

	public static UnaryOperation_c getOneV_UNYOnR801(Value_c target,
			boolean loadComponent) {
		return getOneV_UNYOnR801(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static UnaryOperation_c getOneV_UNYOnR801(Value_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneV_UNYOnR801(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static UnaryOperation_c getOneV_UNYOnR801(ModelRoot modelRoot,
			Value_c target, ClassQueryInterface_c test) {
		return getOneV_UNYOnR801(modelRoot, target, test, true);
	}

	public static UnaryOperation_c getOneV_UNYOnR801(ModelRoot modelRoot,
			Value_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneV_UNYOnR801(modelRoot, target, test);
	}
	private static UnaryOperation_c find_getOneV_UNYOnR801(ModelRoot modelRoot,
			Value_c target, ClassQueryInterface_c test) {
		if (target != null) {
			UnaryOperation_c source = (UnaryOperation_c) target.backPointer_IsSubtypeUnaryOperationIsSubtype_R801;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static UnaryOperation_c[] getManyV_UNYsOnR801(Value_c[] targets) {
		return getManyV_UNYsOnR801(targets, null);
	}
	public static UnaryOperation_c[] getManyV_UNYsOnR801(Value_c[] targets,
			boolean loadComponent) {
		return getManyV_UNYsOnR801(targets, null, loadComponent);
	}
	public static UnaryOperation_c[] getManyV_UNYsOnR801(Value_c[] targets,
			ClassQueryInterface_c test) {
		return getManyV_UNYsOnR801(targets, test, true);
	}

	public static UnaryOperation_c[] getManyV_UNYsOnR801(Value_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new UnaryOperation_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(UnaryOperation_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			UnaryOperation_c source = (UnaryOperation_c) targets[i].backPointer_IsSubtypeUnaryOperationIsSubtype_R801;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			UnaryOperation_c[] ret_set = new UnaryOperation_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new UnaryOperation_c[0];
		}
	}

	public static UnaryOperation_c[] getManyV_UNYsOnR801(Value_c target) {
		if (target != null) {
			Value_c[] targetArray = new Value_c[1];
			targetArray[0] = target;
			return getManyV_UNYsOnR801(targetArray);
		} else {
			UnaryOperation_c[] result = new UnaryOperation_c[0];
			return result;
		}
	}

	public static UnaryOperation_c[] getManyV_UNYsOnR801(Value_c target,
			boolean loadComponent) {
		if (target != null) {
			Value_c[] targetArray = new Value_c[1];
			targetArray[0] = target;
			return getManyV_UNYsOnR801(targetArray, loadComponent);
		} else {
			UnaryOperation_c[] result = new UnaryOperation_c[0];
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

		if (HasOperandValue == null) {
			// R804
			Value_c relInst37390 = (Value_c) baseRoot.getInstanceList(
					Value_c.class).get(new Object[]{m_operand_value_id});
			// if there was no local element, check for any global elements
			// failing that proceed to check other model roots
			if (relInst37390 == null) {
				relInst37390 = (Value_c) Ooaofooa.getDefaultInstance()
						.getInstanceList(Value_c.class)
						.get(new Object[]{m_operand_value_id});
			}
			if (relInst37390 == null && searchAllRoots
					&& !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
					if (roots[i].isCompareRoot()) {
						// never use elements from any compare root
						continue;
					}
					relInst37390 = (Value_c) roots[i].getInstanceList(
							Value_c.class)
							.get(new Object[]{m_operand_value_id});
					if (relInst37390 != null)
						break;
				}
			}
			//synchronized
			if (relInst37390 != null) {
				if (relateProxies || !isProxy()
						|| (inSameComponent(this, relInst37390) && !isProxy())) {
					relInst37390.relateAcrossR804To(this, notifyChanges);
				}
			}
		}

		// R801
		Value_c relInst37391 = (Value_c) baseRoot
				.getInstanceList(Value_c.class).get(new Object[]{m_value_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst37391 == null) {
			relInst37391 = (Value_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Value_c.class)
					.get(new Object[]{m_value_id});
		}
		if (relInst37391 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst37391 = (Value_c) roots[i]
						.getInstanceList(Value_c.class).get(
								new Object[]{m_value_id});
				if (relInst37391 != null)
					break;
			}
		}
		//synchronized
		if (relInst37391 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst37391) && !isProxy())) {
				relInst37391.relateAcrossR801To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R804
		// V_VAL
		inst = HasOperandValue;
		unrelateAcrossR804From(HasOperandValue, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(UnaryOperation_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final UnaryOperation_c inst = (UnaryOperation_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(UnaryOperation_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static UnaryOperation_c UnaryOperationInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		UnaryOperation_c result = findUnaryOperationInstance(modelRoot, test,
				loadComponent);
		return result;
	}
	private static UnaryOperation_c findUnaryOperationInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(UnaryOperation_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				UnaryOperation_c x = (UnaryOperation_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static UnaryOperation_c UnaryOperationInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return UnaryOperationInstance(modelRoot, test, true);
	}

	public static UnaryOperation_c UnaryOperationInstance(ModelRoot modelRoot) {
		return UnaryOperationInstance(modelRoot, null, true);
	}

	public static UnaryOperation_c[] UnaryOperationInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(UnaryOperation_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				UnaryOperation_c x = (UnaryOperation_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				UnaryOperation_c[] ret_set = new UnaryOperation_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new UnaryOperation_c[0];
			}
		}
	}
	public static UnaryOperation_c[] UnaryOperationInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return UnaryOperationInstances(modelRoot, test, true);
	}
	public static UnaryOperation_c[] UnaryOperationInstances(ModelRoot modelRoot) {
		return UnaryOperationInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Unary Operation.dispose call: ";
		Value_c testR804Inst = Value_c.getOneV_VALOnR804(this, false);

		if (testR804Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "804 ";
		}
		Value_c testR801Inst9 = Value_c.getOneV_VALOnR801(this, false);

		if (testR801Inst9 != null) {
			delete_error = true;
			errorMsg = errorMsg + "801 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Unary Operation",
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
		if (attributeName.equals("value_id")) {
			return true;
		}
		if (attributeName.equals("operand_value_id")) {
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
	public long getOperand_value_idLongBased() {
		if (HasOperandValue != null) {
			return HasOperandValue.getValue_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getOperand_value_id() {
		if (HasOperandValue != null) {
			return HasOperandValue.getValue_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getOperand_value_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_operand_value_id))
			return m_operand_value_id;
		else
			return getOperand_value_id();
	}

	public void setOperand_value_id(java.util.UUID newValue) {
		m_operand_value_id = IdAssigner.preprocessUUID(newValue);
	}
	public String getOperator() {
		return m_operator;
	}

	public void setOperator(String newValue) {
		m_operator = newValue;
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log.println(ILogger.OPERATION, "Unary Operation", //$NON-NLS-1$
				" Operation entered: Unary Operation::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		UnaryOperation_c[] objs = UnaryOperation_c.UnaryOperationInstances(
				modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Unary Operation", //$NON-NLS-1$
				" Operation entered: Unary Operation::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class UnaryOperation_c_test37393_c implements ClassQueryInterface_c {
			UnaryOperation_c_test37393_c(java.util.UUID p37394) {
				m_p37394 = p37394;
			}
			private java.util.UUID m_p37394;
			public boolean evaluate(Object candidate) {
				UnaryOperation_c selected = (UnaryOperation_c) candidate;
				boolean retval = false;
				retval = (selected.getValue_id().equals(m_p37394));
				return retval;
			}
		}

		UnaryOperation_c[] objs37392 = UnaryOperation_c
				.UnaryOperationInstances(modelRoot,
						new UnaryOperation_c_test37393_c(getValue_id()));

		if (((objs37392.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Unary Operation", //$NON-NLS-1$
								"Consistency: Object: Unary Operation: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs37392.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin.logError(
						"Consistency: Object: Unary Operation: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
								+ "Actual Value: " //$NON-NLS-1$
								+ Integer.toString(objs37392.length), e);
			}
			retval = false;

		}

		if (((objs37392.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Unary Operation", //$NON-NLS-1$
								"Consistency: Object: Unary Operation: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs37392.length)
										+ " Value_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Unary Operation: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37392.length)
										+ " Value_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Unary Operation is a subtype in association: rel.Numb = 801
		// The supertype class is: Value
		class Value_c_test37398_c implements ClassQueryInterface_c {
			Value_c_test37398_c(java.util.UUID p37399) {
				m_p37399 = p37399;
			}
			private java.util.UUID m_p37399;
			public boolean evaluate(Object candidate) {
				Value_c selected = (Value_c) candidate;
				boolean retval = false;
				retval = (selected.getValue_id().equals(m_p37399));
				return retval;
			}
		}

		Value_c[] objs37397 = Value_c.ValueInstances(modelRoot,
				new Value_c_test37398_c(getValue_id()));

		if (((objs37397.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Unary Operation", //$NON-NLS-1$
								"Consistency: Object: Unary Operation: Association: 801: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs37397.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Unary Operation: Association: 801: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37397.length), e);
			}
			retval = false;

		}

		// Unary Operation is a referring class in association: rel.Numb = 804
		// The participating class is: Value
		class Value_c_test37401_c implements ClassQueryInterface_c {
			Value_c_test37401_c(java.util.UUID p37402) {
				m_p37402 = p37402;
			}
			private java.util.UUID m_p37402;
			public boolean evaluate(Object candidate) {
				Value_c selected = (Value_c) candidate;
				boolean retval = false;
				retval = (selected.getValue_id().equals(m_p37402));
				return retval;
			}
		}

		Value_c[] objs37400 = Value_c.ValueInstances(modelRoot,
				new Value_c_test37401_c(getOperand_value_id()));

		// The participant is unconditional
		// The multiplicity of the participant is one
		if (((objs37400.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Unary Operation", //$NON-NLS-1$
								"Consistency: Object: Unary Operation: Association: 804: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs37400.length)
										+ " Operand_Value_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Unary Operation: Association: 804: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37400.length)
										+ " Operand_Value_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Unary Operation",
				" Operation entered: UnaryOperation::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		Value_c v_op = Value_c.getOneV_VALOnR804(this);

		if (((v_op != null))) {

			if (v_op != null) {
				v_op.unrelateAcrossR804From(this);
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin.logError(
						"Unrelate attempted on null left hand instance.", t);
			}

			if (v_op != null) {
				v_op.Dispose();
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

		}

		delete();

	} // End dispose
	public Object Getvalue(final java.util.UUID p_Stack_frame_id) {
		Ooaofooa.log.println(ILogger.OPERATION, "Unary Operation",
				" Operation entered: UnaryOperation::Getvalue");
		final ModelRoot modelRoot = getModelRoot();
		Body_c v_body = Body_c.getOneACT_ACTOnR601(Block_c
				.getOneACT_BLKOnR826(Value_c.getOneV_VALOnR801(this)));

		DataType_c v_dt = DataType_c.getOneS_DTOnR820(Value_c
				.getOneV_VALOnR801(this));

		String v_coreDataTypeName = v_dt.Getcoredatatypename();

		if ((v_coreDataTypeName.equals("boolean"))) {

			return Gd_c.Boolean_to_instance(Getboolean(p_Stack_frame_id));

		}

		else if ((v_coreDataTypeName.equals("integer"))) {

			return Gd_c.Int_to_instance(Getinteger(p_Stack_frame_id));

		}

		else if ((v_coreDataTypeName.equals("real"))) {

			return Gd_c.Real_to_instance(Getreal(p_Stack_frame_id));

		}

		else {

			String v_error_message = "Error: Did not find a supported data type "
					+ v_coreDataTypeName
					+ " in attempt to retrieve value in unary operation.";

			User_c.Logerror(v_error_message, v_body.Getpath());

		}

		return Gd_c.String_to_instance("Error");

	} // End getValue
	public boolean Getboolean(final java.util.UUID p_Stack_frame_id) {
		Ooaofooa.log.println(ILogger.OPERATION, "Unary Operation",
				" Operation entered: UnaryOperation::Getboolean");
		final ModelRoot modelRoot = getModelRoot();
		return false;

	} // End getBoolean
	public int Getinteger(final java.util.UUID p_Stack_frame_id) {
		Ooaofooa.log.println(ILogger.OPERATION, "Unary Operation",
				" Operation entered: UnaryOperation::Getinteger");
		final ModelRoot modelRoot = getModelRoot();
		return 0;

	} // End getInteger
	public float Getreal(final java.util.UUID p_Stack_frame_id) {
		Ooaofooa.log.println(ILogger.OPERATION, "Unary Operation",
				" Operation entered: UnaryOperation::Getreal");
		final ModelRoot modelRoot = getModelRoot();
		return 0;

	} // End getReal

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Unary Operation
