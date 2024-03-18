package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class G extends AbstractC2013c implements H, RandomAccess {

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f24981Z;

    static {
        new G(10).f25029Y = false;
    }

    public G(int i10) {
        this(new ArrayList(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        f();
        this.f24981Z.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2013c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f24981Z.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final void b0(AbstractC2025j abstractC2025j) {
        f();
        this.f24981Z.add(abstractC2025j);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2013c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        this.f24981Z.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final List d() {
        return Collections.unmodifiableList(this.f24981Z);
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final H e() {
        if (this.f25029Y) {
            return new s0(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f24981Z;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2025j) {
            AbstractC2025j abstractC2025j = (AbstractC2025j) obj;
            abstractC2025j.getClass();
            Charset charset = B.f24959a;
            if (abstractC2025j.size() == 0) {
                str = "";
            } else {
                C2026k c2026k = (C2026k) abstractC2025j;
                str = new String(c2026k.f25069i0, c2026k.T(), c2026k.size(), charset);
            }
            C2026k c2026k2 = (C2026k) abstractC2025j;
            int T = c2026k2.T();
            if (A0.f24958a.m(T, c2026k2.size() + T, c2026k2.f25069i0) == 0) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, B.f24959a);
            if (A0.f24958a.m(0, bArr.length, bArr) == 0) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.A
    public final A h(int i10) {
        ArrayList arrayList = this.f24981Z;
        if (i10 >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i10);
            arrayList2.addAll(arrayList);
            return new G(arrayList2);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final Object j(int i10) {
        return this.f24981Z.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        f();
        Object remove = this.f24981Z.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC2025j) {
            AbstractC2025j abstractC2025j = (AbstractC2025j) remove;
            abstractC2025j.getClass();
            Charset charset = B.f24959a;
            if (abstractC2025j.size() == 0) {
                return "";
            }
            C2026k c2026k = (C2026k) abstractC2025j;
            return new String(c2026k.f25069i0, c2026k.T(), c2026k.size(), charset);
        }
        return new String((byte[]) remove, B.f24959a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        f();
        Object obj2 = this.f24981Z.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC2025j) {
            AbstractC2025j abstractC2025j = (AbstractC2025j) obj2;
            abstractC2025j.getClass();
            Charset charset = B.f24959a;
            if (abstractC2025j.size() == 0) {
                return "";
            }
            C2026k c2026k = (C2026k) abstractC2025j;
            return new String(c2026k.f25069i0, c2026k.T(), c2026k.size(), charset);
        }
        return new String((byte[]) obj2, B.f24959a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24981Z.size();
    }

    public G(ArrayList arrayList) {
        this.f24981Z = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2013c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        f();
        if (collection instanceof H) {
            collection = ((H) collection).d();
        }
        boolean addAll = this.f24981Z.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
