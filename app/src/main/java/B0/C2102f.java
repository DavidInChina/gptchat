package b0;

import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import xf.AbstractC6440c;

/* renamed from: b0.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2102f implements List, AbstractC6440c {

    /* renamed from: Y  reason: collision with root package name */
    public final List f25562Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f25563Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f25564h0;

    public C2102f(List list, int i10, int i11) {
        this.f25562Y = list;
        this.f25563Z = i10;
        this.f25564h0 = i11;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10 = this.f25564h0;
        this.f25564h0 = i10 + 1;
        this.f25562Y.add(i10, obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        this.f25562Y.addAll(i10 + this.f25563Z, collection);
        this.f25564h0 = collection.size() + this.f25564h0;
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10 = this.f25564h0 - 1;
        int i11 = this.f25563Z;
        if (i11 <= i10) {
            while (true) {
                this.f25562Y.remove(i10);
                if (i10 == i11) {
                    break;
                }
                i10--;
            }
        }
        this.f25564h0 = i11;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f25564h0;
        for (int i11 = this.f25563Z; i11 < i10; i11++) {
            if (AbstractC3557B.K(this.f25562Y.get(i11), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m.g(i10, this);
        return this.f25562Y.get(i10 + this.f25563Z);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i10 = this.f25564h0;
        int i11 = this.f25563Z;
        for (int i12 = i11; i12 < i10; i12++) {
            if (AbstractC3557B.K(this.f25562Y.get(i12), obj)) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.f25564h0 == this.f25563Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2103g(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i10 = this.f25564h0 - 1;
        int i11 = this.f25563Z;
        if (i11 <= i10) {
            while (!AbstractC3557B.K(this.f25562Y.get(i10), obj)) {
                if (i10 != i11) {
                    i10--;
                } else {
                    return -1;
                }
            }
            return i10 - i11;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2103g(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10 = this.f25564h0;
        for (int i11 = this.f25563Z; i11 < i10; i11++) {
            List list = this.f25562Y;
            if (AbstractC3557B.K(list.get(i11), obj)) {
                list.remove(i11);
                this.f25564h0--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10 = this.f25564h0;
        for (Object obj : collection) {
            remove(obj);
        }
        if (i10 != this.f25564h0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10 = this.f25564h0;
        int i11 = i10 - 1;
        int i12 = this.f25563Z;
        if (i12 <= i11) {
            while (true) {
                List list = this.f25562Y;
                if (!collection.contains(list.get(i11))) {
                    list.remove(i11);
                    this.f25564h0--;
                }
                if (i11 == i12) {
                    break;
                }
                i11--;
            }
        }
        if (i10 != this.f25564h0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        m.g(i10, this);
        return this.f25562Y.set(i10 + this.f25563Z, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f25564h0 - this.f25563Z;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        m.h(this, i10, i11);
        return new C2102f(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return m.J(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f25562Y.add(i10 + this.f25563Z, obj);
        this.f25564h0++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C2103g(i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return m.K(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f25562Y.addAll(this.f25564h0, collection);
        this.f25564h0 = collection.size() + this.f25564h0;
        return collection.size() > 0;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        m.g(i10, this);
        this.f25564h0--;
        return this.f25562Y.remove(i10 + this.f25563Z);
    }
}
