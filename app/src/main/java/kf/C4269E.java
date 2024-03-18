package kf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: kf.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4269E extends AbstractC4283h {

    /* renamed from: Y  reason: collision with root package name */
    public final List f37440Y;

    public C4269E(ArrayList arrayList) {
        this.f37440Y = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f37440Y.add(s.M1(i10, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f37440Y.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f37440Y.get(s.L1(i10, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new j0.J(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new j0.J(this, 0);
    }

    @Override // kf.AbstractC4283h
    public final int r() {
        return this.f37440Y.size();
    }

    @Override // kf.AbstractC4283h
    public final Object s(int i10) {
        return this.f37440Y.remove(s.L1(i10, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return this.f37440Y.set(s.L1(i10, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new j0.J(this, i10);
    }
}
