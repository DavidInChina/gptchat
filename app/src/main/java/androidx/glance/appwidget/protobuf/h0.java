package androidx.glance.appwidget.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r0;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class h0 extends AbstractList implements F, RandomAccess {

    /* renamed from: Y  reason: collision with root package name */
    public final F f25222Y;

    public h0(F f6) {
        this.f25222Y = f6;
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public final void a0(AbstractC2049i abstractC2049i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public final List d() {
        return this.f25222Y.d();
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public final F e() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f25222Y.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new r0(this);
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public final Object j(int i10) {
        return this.f25222Y.j(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new q0(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25222Y.size();
    }
}
