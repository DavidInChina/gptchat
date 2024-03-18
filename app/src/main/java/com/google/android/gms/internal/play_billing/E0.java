package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class E0 extends AbstractList implements RandomAccess, AbstractC2443d0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC2443d0 f26841Y;

    public E0(AbstractC2443d0 abstractC2443d0) {
        this.f26841Y = abstractC2443d0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443d0
    public final List E() {
        return this.f26841Y.E();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443d0
    public final Object O(int i10) {
        return this.f26841Y.O(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443d0
    public final void R(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((C2441c0) this.f26841Y).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.r0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new androidx.datastore.preferences.protobuf.q0(this, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443d0
    public final AbstractC2443d0 q() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26841Y.size();
    }
}
