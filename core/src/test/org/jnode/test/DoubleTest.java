/*
 * $Id$
 *
 * JNode.org
 * Copyright (C) 2003-2006 JNode.org
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

package org.jnode.test;

/**
 * @author Ewout Prangsma (epr@users.sourceforge.net)
 */
public class DoubleTest {

    public static void main(String[] args) {
        d2i(0.0);
        d2i(0.4);
        d2i(0.5);
        d2i(0.6);
        d2i(1.0);
        d2i(1.1);
        d2i(1.4);
        d2i(1.5);
        d2i(1.6);
        d2i(1.9);
        d2i(2.0);
    }

    public static void d2i(double d) {
        final int i = (int) d;
        System.out.println("d=" + d + ", i=" + i);
    }
}
