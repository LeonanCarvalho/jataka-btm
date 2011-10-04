/**
 * Copyright (C) 2011 JatakaSource <support@jatakasource.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
