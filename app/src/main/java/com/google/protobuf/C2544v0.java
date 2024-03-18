package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.v0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2544v0 extends AbstractC2496d implements AbstractC2546w0, RandomAccess {

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f27626Z;

    static {
        new C2544v0(10).f27534Y = false;
    }

    public C2544v0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.protobuf.AbstractC2546w0
    public final void J(AbstractC2534q abstractC2534q) {
        f();
        this.f27626Z.add(abstractC2534q);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        f();
        this.f27626Z.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f27626Z.size(), collection);
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        this.f27626Z.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2546w0
    public final List d() {
        return Collections.unmodifiableList(this.f27626Z);
    }

    @Override // com.google.protobuf.AbstractC2546w0
    public final AbstractC2546w0 e() {
        if (this.f27534Y) {
            return new x1(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f27626Z;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2534q) {
            AbstractC2534q abstractC2534q = (AbstractC2534q) obj;
            str = abstractC2534q.q0();
            if (abstractC2534q.T()) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC2536r0.f27584a);
            if (F1.f27398a.Z(0, bArr.length, bArr) == 0) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.AbstractC2535q0
    public final AbstractC2535q0 h(int i10) {
        ArrayList arrayList = this.f27626Z;
        if (i10 >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i10);
            arrayList2.addAll(arrayList);
            return new C2544v0(arrayList2);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2546w0
    public final Object j(int i10) {
        return this.f27626Z.get(i10);
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        f();
        Object remove = this.f27626Z.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC2534q) {
            return ((AbstractC2534q) remove).q0();
        }
        return new String((byte[]) remove, AbstractC2536r0.f27584a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        f();
        Object obj2 = this.f27626Z.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC2534q) {
            return ((AbstractC2534q) obj2).q0();
        }
        return new String((byte[]) obj2, AbstractC2536r0.f27584a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27626Z.size();
    }

    public C2544v0(ArrayList arrayList) {
        this.f27626Z = arrayList;
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        f();
        if (collection instanceof AbstractC2546w0) {
            collection = ((AbstractC2546w0) collection).d();
        }
        boolean addAll = this.f27626Z.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
