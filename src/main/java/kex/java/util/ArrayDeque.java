/*
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

/*
 * This file is available under and governed by the GNU General Public
 * License version 2 only, as published by the Free Software Foundation.
 * However, the following notice accompanied the original version of this
 * file:
 *
 * Written by Josh Bloch of Google Inc. and released to the public domain,
 * as explained at http://creativecommons.org/publicdomain/zero/1.0/.
 */

package kex.java.util;

import org.jetbrains.research.kex.UnknownIntrinsics;

import java.io.Serializable;
import java.util.*;

public class ArrayDeque<E>
        extends AbstractCollection<E>
        implements Deque<E>, Cloneable, Serializable {
    private static final int MIN_INITIAL_CAPACITY = 8;

    private ArrayList<E> inner;

    public ArrayDeque() {
        inner = new ArrayList<>();
    }

    public ArrayDeque(int numElements) {
        inner = new ArrayList<>(numElements);
    }

    public ArrayDeque(Collection<? extends E> c) {
        inner = new ArrayList<>(c);
    }

    @Override
    public void addFirst(E e) {
        inner.add(0, e);
    }

    @Override
    public void addLast(E e) {
        inner.add(e);
    }

    @Override
    public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        addLast(e);
        return true;
    }

    @Override
    public E removeFirst() {
        return inner.remove(0);
    }

    @Override
    public E removeLast() {
        return inner.remove(inner.size() - 1);
    }

    @Override
    public E pollFirst() {
        return removeFirst();
    }

    @Override
    public E pollLast() {
        return removeLast();
    }

    @Override
    public E getFirst() {
        return inner.get(0);
    }

    @Override
    public E getLast() {
        return inner.get(inner.size() - 1);
    }

    @Override
    public E peekFirst() {
        return getFirst();
    }

    @Override
    public E peekLast() {
        return getLast();
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return inner.remove(o);
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return UnknownIntrinsics.kexUnknownBoolean();
    }

    @Override
    public boolean add(E e) {
        return inner.add(e);
    }

    @Override
    public boolean offer(E e) {
        return offerLast(e);
    }

    @Override
    public E remove() {
        return removeFirst();
    }

    @Override
    public E poll() {
        return pollFirst();
    }

    @Override
    public E element() {
        return getFirst();
    }

    @Override
    public E peek() {
        return peekFirst();
    }

    @Override
    public void push(E e) {
        addFirst(e);
    }

    @Override
    public E pop() {
        return removeFirst();
    }

    @Override
    public int size() {
        return inner.size();
    }

    @Override
    public boolean isEmpty() {
        return inner.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return inner.iterator();
    }

    @Override
    public Iterator<E> descendingIterator() {
        return inner.iterator();
    }

    @Override
    public boolean contains(Object o) {
        return inner.contains(o);
    }

    @Override
    public boolean remove(Object o) {
        return removeFirstOccurrence(o);
    }

    @Override
    public void clear() {
        inner.clear();
    }

    @Override
    public Object[] toArray() {
        return inner.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return inner.toArray(a);
    }

    @Override
    public ArrayDeque<E> clone() {
        ArrayDeque<E> v = new ArrayDeque<>();
        v.inner = (ArrayList<E>) inner.clone();
        return v;
    }

    @Override
    public Spliterator<E> spliterator() {
        return inner.spliterator();
    }
}