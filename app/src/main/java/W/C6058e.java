package w;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: w.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6058e implements Collection {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C6059f f47580Y;

    public C6058e(C6059f c6059f) {
        this.f47580Y = c6059f;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f47580Y.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f47580Y.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f47580Y.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6055b(this.f47580Y, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C6059f c6059f = this.f47580Y;
        int a5 = c6059f.a(obj);
        if (a5 >= 0) {
            c6059f.h(a5);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C6059f c6059f = this.f47580Y;
        int i10 = c6059f.f47560h0;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (collection.contains(c6059f.j(i11))) {
                c6059f.h(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C6059f c6059f = this.f47580Y;
        int i10 = c6059f.f47560h0;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (!collection.contains(c6059f.j(i11))) {
                c6059f.h(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f47580Y.f47560h0;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C6059f c6059f = this.f47580Y;
        int i10 = c6059f.f47560h0;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c6059f.j(i11);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C6059f c6059f = this.f47580Y;
        int i10 = c6059f.f47560h0;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c6059f.j(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
