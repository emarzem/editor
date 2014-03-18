//======================================================================
//
// File: Modeleventnotification_c.java
//
// WARNING:      Do not edit this generated file
// Generated by: ../MC-Java/enums.inc
// Version:      $Revision: 1.11 $
//
// (c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.
//
//======================================================================

package com.mentor.nucleus.bp.core;

public class Modeleventnotification_c {
	public final static int OOA_UNINITIALIZED_ENUM = -1;

	public final static int MASK_NO_EVENTS = 0;
	public final static int MASK_ALL_EVENTS = 127;
	public final static int UNKNOWN = 1;
	public final static int MODEL_ELEMENT_UNLOADED = 2;
	public final static int MODEL_ELEMENT_PRE_DELETE = 4;
	public final static int MODEL_ELEMENT_LOADED = 8;
	public final static int MODEL_ELEMENT_PRE_RELOAD = 16;
	public final static int MODEL_ELEMENT_RELOAD = 32;
	public final static int MODEL_ELEMENT_CHANGED = 64;
	public final static int MASK_NO_DELTAS = 255;
	public final static int MASK_ALL_DELTAS = 7936;
	public final static int DELTA_NEW = 4096;
	public final static int DELTA_DELETE = 2048;
	public final static int DELTA_ATTRIBUTE_CHANGE = 1024;
	public final static int DELTA_ELEMENT_RELATED = 512;
	public final static int DELTA_ELEMENT_UNRELATED = 256;
	public final static int MODEL_EXECUTION_STOPPED = 128;
}
