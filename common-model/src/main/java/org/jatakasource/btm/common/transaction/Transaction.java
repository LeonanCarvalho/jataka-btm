package org.jatakasource.btm.common.transaction;

import org.jatakasource.btm.common.event.Event;

/**
 * Define business units of work. A transaction is associated with an <tt>Application</tt> and is
 * usually instantiated if <tt>Event</tt> root is null.
 * 
 * @since 0.1.0
 */
public class Transaction extends Event {
	private static final long serialVersionUID = -924319603188744640L;

	private Boolean desktop;

	public Boolean getDesktop() {
		return desktop;
	}

	public void setDesktop(Boolean desktop) {
		this.desktop = desktop;
	}

}
