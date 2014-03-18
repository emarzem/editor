//========================================================================
//
// File: src/com/mentor/nucleus/bp/core/ui/cells/ClassAsLinkCellProvider.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/generate_cell_modifiers.arc
// Version:      $Revision: 1.2 $
//
// Copyright 2005-2014 Mentor Graphics Corporation.  All rights reserved.
//
//========================================================================
// Licensed under the Apache License, Version 2.0 (the "License"); you may not 
// use this file except in compliance with the License.  You may obtain a copy 
// of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   See the 
// License for the specific language governing permissions and limitations under
// the License.
//======================================================================== 
//
//  Optional Comments about the generated java file
//

package com.mentor.nucleus.bp.core.ui.cells.providers;

import java.util.Vector;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.widgets.Composite;

  import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.NonRootModelElement;
import com.mentor.nucleus.bp.core.inspector.ObjectElement;
import com.mentor.nucleus.bp.core.ui.cells.ICellProvider;
import com.mentor.nucleus.bp.core.ui.cells.editors.*;
import com.mentor.nucleus.bp.core.util.*;

public class ClassAsLinkCellProvider implements ICellProvider {
    private String[] Mult_vals = { "One",
        "Many" };
    private String[] validMult_vals(ClassAsLink_c element)
    {
        String [] onlyOne = { "One" };
        if ( element.Manymultallowed() )
        {
            return Mult_vals;
        }
        return onlyOne;
    }

    
	@Override
	public CellEditor getCellEditor(final NonRootModelElement element,
			Composite parent, ObjectElement data) {
                if(data.getName().equals("Mult")) {
                	CellEditor editor = new EnumCellEditor(parent, validMult_vals((ClassAsLink_c) element));
                	return editor;
                }

		return null;
	}

	@Override
	public boolean supportsEdit(NonRootModelElement element,
			ObjectElement data, Composite parent) {
		CellEditor editor = getCellEditor(element, parent, data);
		if(editor != null) {
			editor.dispose();
			return true;
		}
		return false;
	}
	
	@Override
	public String getValue(NonRootModelElement element, ObjectElement data) {
		if(data.getName().equals("Mult")) {
	        Integer Mult_value = (Integer) data.getValue();
			if(Mult_value >= 0 && Mult_value < Mult_vals.length) {
				return Mult_vals[Mult_value];
			}
		}
		return null;
	}
	
	@Override
	public void setValue(NonRootModelElement element, ObjectElement data, Object value) {
        if(data.getName().equals("Mult"))
        {
            int new_val = Integer.parseInt(value.toString());
            if ( new_val != ((ClassAsLink_c) element).getMult() )
            {
                ((ClassAsLink_c) element).setMult(new_val);
            }
        }

	}
	
}
