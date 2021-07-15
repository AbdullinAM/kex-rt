/*
 * Copyright (c) 2003, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package kex.sun.misc;

public class DoubleConsts {
    private DoubleConsts() {
    }

    public static final double POSITIVE_INFINITY = java.lang.Double.POSITIVE_INFINITY;
    public static final double NEGATIVE_INFINITY = java.lang.Double.NEGATIVE_INFINITY;
    public static final double NaN = java.lang.Double.NaN;
    public static final double MAX_VALUE = java.lang.Double.MAX_VALUE;
    public static final double MIN_VALUE = java.lang.Double.MIN_VALUE;
    public static final double MIN_NORMAL = 2.2250738585072014E-308;
    public static final int SIGNIFICAND_WIDTH = 53;
    public static final int MAX_EXPONENT = 1023;
    public static final int MIN_EXPONENT = -1022;
    public static final int MIN_SUB_EXPONENT = MIN_EXPONENT - (SIGNIFICAND_WIDTH - 1);
    public static final int EXP_BIAS = 1023;
    public static final long SIGN_BIT_MASK = 0x8000000000000000L;
    public static final long EXP_BIT_MASK = 0x7FF0000000000000L;
    public static final long SIGNIF_BIT_MASK = 0x000FFFFFFFFFFFFFL;

}

