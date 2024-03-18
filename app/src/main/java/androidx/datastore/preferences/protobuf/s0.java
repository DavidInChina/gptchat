package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class s0 extends AbstractList implements H, RandomAccess {

    /* renamed from: Y  reason: collision with root package name */
    public final H f25112Y;

    public s0(H h10) {
        this.f25112Y = h10;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final void b0(AbstractC2025j abstractC2025j) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final List d() {
        return this.f25112Y.d();
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final H e() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f25112Y.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new r0(this);
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final Object j(int i10) {
        return this.f25112Y.j(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new q0(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25112Y.size();
    }
}
