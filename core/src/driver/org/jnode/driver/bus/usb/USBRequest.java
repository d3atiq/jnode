/*
 * $Id$
 *
 * Copyright (C) 2003-2015 JNode.org
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public 
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; If not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
 
package org.jnode.driver.bus.usb;

/**
 * @author Ewout Prangsma (epr@users.sourceforge.net)
 */
public interface USBRequest {

    /**
     * Gets the actual transfered data length.
     *
     * @return Returns the actualLength.
     */
    public int getActualLength();

    /**
     * Has this request bee completed.
     */
    public boolean isCompleted();

    /**
     * Gets the status of as this request.
     */
    public int getStatus();

    /**
     * Wait for this request to complete, or until a timeout occurs.
     *
     * @param timeout
     */
    public void waitUntilComplete(long timeout);
}
