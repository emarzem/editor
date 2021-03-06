//========================================================================
//
// File: src/com/mentor/nucleus/bp/ui/canvas/cells/FloatingTextCellProvider.java
//
// WARNING:      Do not edit this generated file
// Generated by: ../com.mentor.nucleus.bp.core/arc/generate_cell_modifiers.arc
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

package com.mentor.nucleus.bp.ui.canvas.cells.providers;

import java.util.Vector;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.widgets.Composite;

  import com.mentor.nucleus.bp.ui.canvas.*;
import com.mentor.nucleus.bp.core.common.NonRootModelElement;
import com.mentor.nucleus.bp.core.inspector.ObjectElement;
import com.mentor.nucleus.bp.core.ui.cells.ICellProvider;
import com.mentor.nucleus.bp.core.ui.cells.editors.*;
import com.mentor.nucleus.bp.core.util.*;

public class FloatingTextCellProvider implements ICellProvider {
    private String[] end_vals = {  };
    
	@Override
	public CellEditor getCellEditor(final NonRootModelElement element,
			Composite parent, ObjectElement data) {
                if(data.getName().equals("end")) {
                	CellEditor editor = new EnumCellEditor(parent, end_vals);
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
		if(data.getName().equals("end")) {
	        Integer end_value = (Integer) data.getValue();
			if(end_value >= 0 && end_value < end_vals.length) {
				return end_vals[end_value];
			}
		}
		return null;
	}
	
	@Override
	public void setValue(NonRootModelElement element, ObjectElement data, Object value) {
        if(data.getName().equals("end"))
        {
            int new_val = Integer.parseInt(value.toString());
            if ( new_val != ((FloatingText_c) element).getEnd() )
            {
                ((FloatingText_c) element).setEnd(new_val);
            }
        }

	}
	
}
