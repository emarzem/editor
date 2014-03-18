package com.mentor.nucleus.bp.ui.canvas;
//====================================================================
//
// File:      com.mentor.nucleus.bp.ui.canvas.NoncontainingShapeSpecification_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

import com.mentor.nucleus.bp.core.*;
import org.eclipse.swt.graphics.GC;
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
abstract class EV_NONCONTAINING_SHAPE_SPECIFICATION extends genericEvent_c {
	public abstract int getEvtcode();
}

public class NoncontainingShapeSpecification_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public NoncontainingShapeSpecification_c(ModelRoot modelRoot,
			int p_m_ooa_type) {
		super(modelRoot);
		m_ooa_type = p_m_ooa_type;

	}
	static public NoncontainingShapeSpecification_c createProxy(
			ModelRoot modelRoot, int p_m_ooa_type, String p_contentPath,
			IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(NoncontainingShapeSpecification_c.class);
		NoncontainingShapeSpecification_c new_inst = null;
		synchronized (instances) {
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
				new_inst.m_ooa_type = p_m_ooa_type;

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new NoncontainingShapeSpecification_c(modelRoot,
					p_m_ooa_type);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public NoncontainingShapeSpecification_c resolveInstance(
			ModelRoot modelRoot, int p_m_ooa_type) {
		InstanceList instances = modelRoot
				.getInstanceList(NoncontainingShapeSpecification_c.class);
		NoncontainingShapeSpecification_c source = null;
		synchronized (instances) {
			Object[] key = {new UUID(0, new Long(p_m_ooa_type))};
			source = (NoncontainingShapeSpecification_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				source.m_ooa_type = p_m_ooa_type;

				return source;
			}
		}
		// there is no instance matching the id
		NoncontainingShapeSpecification_c new_inst = new NoncontainingShapeSpecification_c(
				modelRoot, p_m_ooa_type);
		return new_inst;
	}
	public NoncontainingShapeSpecification_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_ooa_type = Ooatype_c.OOA_UNINITIALIZED_ENUM;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof NoncontainingShapeSpecification_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof NoncontainingShapeSpecification_c)) {
			return false;
		}

		NoncontainingShapeSpecification_c me = (NoncontainingShapeSpecification_c) elem;
		if (getOoa_type() != ((NoncontainingShapeSpecification_c) elem)
				.getOoa_type())
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof NoncontainingShapeSpecification_c)) {
			return false;
		}

		NoncontainingShapeSpecification_c me = (NoncontainingShapeSpecification_c) elem;
		if (getOoa_typeCachedValue() != ((NoncontainingShapeSpecification_c) elem)
				.getOoa_typeCachedValue())
			return false;
		return true;
	}

	// Attributes
	private int m_ooa_type;

	// declare association references from this class

	// referring navigation

	ShapeSpecification_c IsSupertypeShapeSpecification;
	public void relateAcrossR208To(ShapeSpecification_c target) {
		relateAcrossR208To(target, true);
	}
	public void relateAcrossR208To(ShapeSpecification_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeShapeSpecification)
			return; // already related

		if (IsSupertypeShapeSpecification != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeShapeSpecification != null) {

				IsSupertypeShapeSpecification.clearBackPointerR208To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofgraphics.log
							.println(
									ILogger.CONSISTENCY,
									"NoncontainingShapeSpecification_c.relateAcrossR208To(ShapeSpecification_c target)",
									"Relate performed across R208 from NonContaining Shape Specification to Shape Specification without unrelate of prior instance.");
				}
			}

			IsSupertypeShapeSpecification = target;
			if (target.getOoa_type() == 0) {
				// do not update cached value
			} else {
				// update cached value
				m_ooa_type = target.getOoa_typeCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR208To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR208From(ShapeSpecification_c target) {
		unrelateAcrossR208From(target, true);
	}
	public void unrelateAcrossR208From(ShapeSpecification_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeShapeSpecification == null)
			return; // already unrelated

		if (target != IsSupertypeShapeSpecification) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CanvasPlugin.logError(
					"Tried to unrelate from non-related instance across R208",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR208To(this);
		}

		if (IsSupertypeShapeSpecification != null) {

			m_ooa_type = IsSupertypeShapeSpecification.getOoa_type();
			if (m_ooa_type == 0) {
				m_ooa_type = IsSupertypeShapeSpecification
						.getOoa_typeCachedValue();
			}
			IsSupertypeShapeSpecification = null;
			target.removeRef();
		}
	}

	public static NoncontainingShapeSpecification_c getOneTS_NCSOnR208(
			ShapeSpecification_c[] targets) {
		return getOneTS_NCSOnR208(targets, null);
	}

	public static NoncontainingShapeSpecification_c getOneTS_NCSOnR208(
			ShapeSpecification_c[] targets, ClassQueryInterface_c test) {
		NoncontainingShapeSpecification_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneTS_NCSOnR208(targets[i], test);
			}
		}

		return ret_val;
	}

	public static NoncontainingShapeSpecification_c getOneTS_NCSOnR208(
			ShapeSpecification_c target) {
		return getOneTS_NCSOnR208(target, null);
	}

	public static NoncontainingShapeSpecification_c getOneTS_NCSOnR208(
			ShapeSpecification_c target, boolean loadComponent) {
		return getOneTS_NCSOnR208(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static NoncontainingShapeSpecification_c getOneTS_NCSOnR208(
			ShapeSpecification_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneTS_NCSOnR208(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static NoncontainingShapeSpecification_c getOneTS_NCSOnR208(
			ModelRoot modelRoot, ShapeSpecification_c target,
			ClassQueryInterface_c test) {
		return getOneTS_NCSOnR208(modelRoot, target, test, true);
	}

	public static NoncontainingShapeSpecification_c getOneTS_NCSOnR208(
			ModelRoot modelRoot, ShapeSpecification_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneTS_NCSOnR208(modelRoot, target, test);
	}
	private static NoncontainingShapeSpecification_c find_getOneTS_NCSOnR208(
			ModelRoot modelRoot, ShapeSpecification_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			NoncontainingShapeSpecification_c source = (NoncontainingShapeSpecification_c) target.backPointer_IsSubtypeNoncontainingShapeSpecificationIsSubtype_R208;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static NoncontainingShapeSpecification_c[] getManyTS_NCSsOnR208(
			ShapeSpecification_c[] targets) {
		return getManyTS_NCSsOnR208(targets, null);
	}
	public static NoncontainingShapeSpecification_c[] getManyTS_NCSsOnR208(
			ShapeSpecification_c[] targets, boolean loadComponent) {
		return getManyTS_NCSsOnR208(targets, null, loadComponent);
	}
	public static NoncontainingShapeSpecification_c[] getManyTS_NCSsOnR208(
			ShapeSpecification_c[] targets, ClassQueryInterface_c test) {
		return getManyTS_NCSsOnR208(targets, test, true);
	}

	public static NoncontainingShapeSpecification_c[] getManyTS_NCSsOnR208(
			ShapeSpecification_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new NoncontainingShapeSpecification_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(NoncontainingShapeSpecification_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			NoncontainingShapeSpecification_c source = (NoncontainingShapeSpecification_c) targets[i].backPointer_IsSubtypeNoncontainingShapeSpecificationIsSubtype_R208;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			NoncontainingShapeSpecification_c[] ret_set = new NoncontainingShapeSpecification_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new NoncontainingShapeSpecification_c[0];
		}
	}

	public static NoncontainingShapeSpecification_c[] getManyTS_NCSsOnR208(
			ShapeSpecification_c target) {
		if (target != null) {
			ShapeSpecification_c[] targetArray = new ShapeSpecification_c[1];
			targetArray[0] = target;
			return getManyTS_NCSsOnR208(targetArray);
		} else {
			NoncontainingShapeSpecification_c[] result = new NoncontainingShapeSpecification_c[0];
			return result;
		}
	}

	public static NoncontainingShapeSpecification_c[] getManyTS_NCSsOnR208(
			ShapeSpecification_c target, boolean loadComponent) {
		if (target != null) {
			ShapeSpecification_c[] targetArray = new ShapeSpecification_c[1];
			targetArray[0] = target;
			return getManyTS_NCSsOnR208(targetArray, loadComponent);
		} else {
			NoncontainingShapeSpecification_c[] result = new NoncontainingShapeSpecification_c[0];
			return result;
		}
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies, boolean notifyChanges, boolean searchAllRoots)
  {
        InstanceList instances=null;
        ModelRoot baseRoot = modelRoot;

      // R208
      baseRoot = Ooaofgraphics.getDefaultInstance();
      if(baseRoot != modelRoot && modelRoot.isCompareRoot()) {
        baseRoot = modelRoot; 
      }
	  instances = baseRoot.getInstanceList(ShapeSpecification_c.class);
      ShapeSpecification_c relInst22003 = null;
      synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
        while (cursor.hasNext())
        {
           ShapeSpecification_c source = (ShapeSpecification_c)cursor.next() ;
           if (     source.getOoa_typeCachedValue() == m_ooa_type 		){
  		relInst22003 = source;
			break;
		  }
	  }
     }//synchronized
			//synchronized
      if ( relInst22003 != null )
      {
          if (relateProxies || !isProxy() || (inSameComponent(this, relInst22003) && !isProxy())) {
	      relInst22003.relateAcrossR208To(this, notifyChanges);
	  }
	  }
          baseRoot = modelRoot;
	          
	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R208
		// TS_SSP
		inst = IsSupertypeShapeSpecification;
		unrelateAcrossR208From(IsSupertypeShapeSpecification, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(NoncontainingShapeSpecification_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final NoncontainingShapeSpecification_c inst = (NoncontainingShapeSpecification_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(NoncontainingShapeSpecification_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static NoncontainingShapeSpecification_c NoncontainingShapeSpecificationInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		NoncontainingShapeSpecification_c result = findNoncontainingShapeSpecificationInstance(
				modelRoot, test, loadComponent);
		return result;
	}
	private static NoncontainingShapeSpecification_c findNoncontainingShapeSpecificationInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(NoncontainingShapeSpecification_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				NoncontainingShapeSpecification_c x = (NoncontainingShapeSpecification_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static NoncontainingShapeSpecification_c NoncontainingShapeSpecificationInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return NoncontainingShapeSpecificationInstance(modelRoot, test, true);
	}

	public static NoncontainingShapeSpecification_c NoncontainingShapeSpecificationInstance(
			ModelRoot modelRoot) {
		return NoncontainingShapeSpecificationInstance(modelRoot, null, true);
	}

	public static NoncontainingShapeSpecification_c[] NoncontainingShapeSpecificationInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(NoncontainingShapeSpecification_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				NoncontainingShapeSpecification_c x = (NoncontainingShapeSpecification_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				NoncontainingShapeSpecification_c[] ret_set = new NoncontainingShapeSpecification_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new NoncontainingShapeSpecification_c[0];
			}
		}
	}
	public static NoncontainingShapeSpecification_c[] NoncontainingShapeSpecificationInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return NoncontainingShapeSpecificationInstances(modelRoot, test, true);
	}
	public static NoncontainingShapeSpecification_c[] NoncontainingShapeSpecificationInstances(
			ModelRoot modelRoot) {
		return NoncontainingShapeSpecificationInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the NonContaining Shape Specification.dispose call: ";
		ShapeSpecification_c testR208Inst1 = ShapeSpecification_c
				.getOneTS_SSPOnR208(this, false);

		if (testR208Inst1 != null) {
			delete_error = true;
			errorMsg = errorMsg + "208 ";
		}
		if (delete_error == true) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log.println(ILogger.DELETE,
						"NonContaining Shape Specification", errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CanvasPlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		return false;
	}
	// declare attribute accessors
	public int getOoa_type() {
		if (IsSupertypeShapeSpecification != null) {
			return IsSupertypeShapeSpecification.getOoa_type();
		}
		return 0;
	}

	public boolean hasSuperType() {
		return (IsSupertypeShapeSpecification != null);

	}

	public int getOoa_typeCachedValue() {
		return m_ooa_type;
	}

	public void setOoa_type(int newValue) {
		m_ooa_type = newValue;
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION,
						"NonContaining Shape Specification", //$NON-NLS-1$
						" Operation entered: NonContaining Shape Specification::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		NoncontainingShapeSpecification_c[] objs = NoncontainingShapeSpecification_c
				.NoncontainingShapeSpecificationInstances(modelRoot, null,
						false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log
				.println(ILogger.OPERATION,
						"NonContaining Shape Specification", //$NON-NLS-1$
						" Operation entered: NonContaining Shape Specification::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class NoncontainingShapeSpecification_c_test22005_c
				implements
					ClassQueryInterface_c {
			NoncontainingShapeSpecification_c_test22005_c(int p22006) {
				m_p22006 = p22006;
			}
			private int m_p22006;
			public boolean evaluate(Object candidate) {
				NoncontainingShapeSpecification_c selected = (NoncontainingShapeSpecification_c) candidate;
				boolean retval = false;
				retval = (selected.getOoa_type() == (m_p22006));
				return retval;
			}
		}

		NoncontainingShapeSpecification_c[] objs22004 = NoncontainingShapeSpecification_c
				.NoncontainingShapeSpecificationInstances(modelRoot,
						new NoncontainingShapeSpecification_c_test22005_c(
								getOoa_type()));

		if (((objs22004.length) == 0)) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log
						.println(
								ILogger.CONSISTENCY,
								"NonContaining Shape Specification", //$NON-NLS-1$
								"Consistency: Object: NonContaining Shape Specification: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs22004.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CanvasPlugin
						.logError(
								"Consistency: Object: NonContaining Shape Specification: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs22004.length), e);
			}
			retval = false;

		}

		if (((objs22004.length) > 1)) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log
						.println(
								ILogger.CONSISTENCY,
								"NonContaining Shape Specification", //$NON-NLS-1$
								"Consistency: Object: NonContaining Shape Specification: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs22004.length)
										+ " OOA_Type: " + Integer.toString(getOoa_type())); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CanvasPlugin
						.logError(
								"Consistency: Object: NonContaining Shape Specification: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs22004.length)
										+ " OOA_Type: " + Integer.toString(getOoa_type()), e); //$NON-NLS-1$
			}
			retval = false;

		}

		// NonContaining Shape Specification is a subtype in association: rel.Numb = 208
		// The supertype class is: Shape Specification
		class ShapeSpecification_c_test22010_c implements ClassQueryInterface_c {
			ShapeSpecification_c_test22010_c(int p22011) {
				m_p22011 = p22011;
			}
			private int m_p22011;
			public boolean evaluate(Object candidate) {
				ShapeSpecification_c selected = (ShapeSpecification_c) candidate;
				boolean retval = false;
				retval = (selected.getOoa_type() == (m_p22011));
				return retval;
			}
		}

		ShapeSpecification_c[] objs22009 = ShapeSpecification_c
				.ShapeSpecificationInstances(
						Ooaofgraphics.getDefaultInstance(),
						new ShapeSpecification_c_test22010_c(getOoa_type()));

		if (((objs22009.length) != 1)) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log
						.println(
								ILogger.CONSISTENCY,
								"NonContaining Shape Specification", //$NON-NLS-1$
								"Consistency: Object: NonContaining Shape Specification: Association: 208: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs22009.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CanvasPlugin
						.logError(
								"Consistency: Object: NonContaining Shape Specification: Association: 208: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs22009.length), e);
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
} // end NonContaining Shape Specification
