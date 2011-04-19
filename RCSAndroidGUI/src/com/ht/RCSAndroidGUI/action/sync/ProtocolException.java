/* *******************************************
 * Copyright (c) 2011
 * HT srl,   All rights reserved.
 * Project      : RCS, RCSAndroid
 * File         : ProtocolException.java
 * Created      : Apr 9, 2011
 * Author		: zeno
 * *******************************************/
package com.ht.RCSAndroidGUI.action.sync;

import com.ht.RCSAndroidGUI.Debug;

// TODO: Auto-generated Javadoc
/**
 * The Class ProtocolException.
 */
public class ProtocolException extends Exception {

	/** The debug. */
	static Debug debug = new Debug("ProtocolEx");

	/** The bye. */
	public boolean bye;

	/**
	 * Instantiates a new protocol exception.
	 * 
	 * @param bye_
	 *            the bye_
	 */
	public ProtocolException(final boolean bye_) {
		bye = bye_;
	}

	/**
	 * Instantiates a new protocol exception.
	 */
	public ProtocolException() {
		this(false);
	}

	/**
	 * Instantiates a new protocol exception.
	 * 
	 * @param i
	 *            the i
	 */
	public ProtocolException(final int i) {
		this(false);
	}
}
