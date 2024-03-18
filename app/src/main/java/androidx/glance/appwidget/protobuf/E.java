package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class E extends AbstractC2043c implements F, RandomAccess {

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f25159Z;

    static {
        new E(10).f25202Y = false;
    }

    public E(int i10) {
        this(new ArrayList(i10));
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public final void a0(AbstractC2049i abstractC2049i) {
        f();
        this.f25159Z.add(abstractC2049i);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        f();
        this.f25159Z.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2043c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f25159Z.size(), collection);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2043c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        this.f25159Z.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public final List d() {
        return Collections.unmodifiableList(this.f25159Z);
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public final F e() {
        if (this.f25202Y) {
            return new h0(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f25159Z;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2049i) {
            AbstractC2049i abstractC2049i = (AbstractC2049i) obj;
            abstractC2049i.getClass();
            Charset charset = A.f25144a;
            if (abstractC2049i.size() == 0) {
                str = "";
            } else {
                C2050j c2050j = (C2050j) abstractC2049i;
                str = new String(c2050j.f25226i0, c2050j.T(), c2050j.size(), charset);
            }
            C2050j c2050j2 = (C2050j) abstractC2049i;
            int T = c2050j2.T();
            if (p0.f25264a.W1(T, c2050j2.size() + T, c2050j2.f25226i0) == 0) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, A.f25144a);
            if (p0.f25264a.W1(0, bArr.length, bArr) == 0) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2065z
    public final AbstractC2065z h(int i10) {
        ArrayList arrayList = this.f25159Z;
        if (i10 >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i10);
            arrayList2.addAll(arrayList);
            return new E(arrayList2);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public final Object j(int i10) {
        return this.f25159Z.get(i10);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2043c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        f();
        Object remove = this.f25159Z.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC2049i) {
            AbstractC2049i abstractC2049i = (AbstractC2049i) remove;
            abstractC2049i.getClass();
            Charset charset = A.f25144a;
            if (abstractC2049i.size() == 0) {
                return "";
            }
            C2050j c2050j = (C2050j) abstractC2049i;
            return new String(c2050j.f25226i0, c2050j.T(), c2050j.size(), charset);
        }
        return new String((byte[]) remove, A.f25144a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        f();
        Object obj2 = this.f25159Z.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC2049i) {
            AbstractC2049i abstractC2049i = (AbstractC2049i) obj2;
            abstractC2049i.getClass();
            Charset charset = A.f25144a;
            if (abstractC2049i.size() == 0) {
                return "";
            }
            C2050j c2050j = (C2050j) abstractC2049i;
            return new String(c2050j.f25226i0, c2050j.T(), c2050j.size(), charset);
        }
        return new String((byte[]) obj2, A.f25144a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25159Z.size();
    }

    public E(ArrayList arrayList) {
        this.f25159Z = arrayList;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2043c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        f();
        if (collection instanceof F) {
            collection = ((F) collection).d();
        }
        boolean addAll = this.f25159Z.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
