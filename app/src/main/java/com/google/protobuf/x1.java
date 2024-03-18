package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class x1 extends AbstractList implements AbstractC2546w0, RandomAccess {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC2546w0 f27641Y;

    public x1(AbstractC2546w0 abstractC2546w0) {
        this.f27641Y = abstractC2546w0;
    }

    @Override // com.google.protobuf.AbstractC2546w0
    public final void J(AbstractC2534q abstractC2534q) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.AbstractC2546w0
    public final List d() {
        return this.f27641Y.d();
    }

    @Override // com.google.protobuf.AbstractC2546w0
    public final AbstractC2546w0 e() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f27641Y.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.r0(this);
    }

    @Override // com.google.protobuf.AbstractC2546w0
    public final Object j(int i10) {
        return this.f27641Y.j(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new androidx.datastore.preferences.protobuf.q0(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27641Y.size();
    }
}
