package b0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kf.q;
import kf.t;
import kotlin.jvm.internal.m;
import w.C6053E;
import xf.AbstractC6438a;

/* renamed from: b0.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2099c implements Set, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public int f25558Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object[] f25559Z = new Object[16];

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        int i11 = this.f25558Y;
        Object[] objArr = this.f25559Z;
        if (i11 > 0) {
            i10 = s(obj);
            if (i10 >= 0) {
                return false;
            }
        } else {
            i10 = -1;
        }
        int i12 = -(i10 + 1);
        if (i11 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            q.W2(i12 + 1, i12, i11, objArr, objArr2);
            q.a3(objArr, objArr2, 0, i12, 6);
            this.f25559Z = objArr2;
        } else {
            q.W2(i12 + 1, i12, i11, objArr, objArr);
        }
        this.f25559Z[i12] = obj;
        this.f25558Y++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        q.d3(0, r0.length, null, this.f25559Z);
        this.f25558Y = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null || s(obj) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection<Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        if (this.f25558Y == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6053E(1, this);
    }

    public final void r(C2099c c2099c) {
        boolean z10;
        boolean z11;
        Object[] objArr;
        int i10;
        Object obj;
        int i11;
        if (c2099c.isEmpty()) {
            return;
        }
        Object[] objArr2 = this.f25559Z;
        Object[] objArr3 = c2099c.f25559Z;
        int i12 = this.f25558Y;
        int i13 = c2099c.f25558Y;
        int i14 = i12 + i13;
        if (objArr2.length < i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 != 0 && System.identityHashCode(objArr2[i12 - 1]) >= System.identityHashCode(objArr3[0])) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && z11) {
            q.W2(i12, 0, i13, objArr3, objArr2);
            this.f25558Y += i13;
            return;
        }
        if (z10) {
            if (i12 > i13) {
                i11 = i12 * 2;
            } else {
                i11 = i13 * 2;
            }
            objArr = new Object[i11];
        } else {
            objArr = objArr2;
        }
        int i15 = i12 - 1;
        int i16 = i13 - 1;
        int i17 = i14 - 1;
        while (true) {
            if (i15 < 0 && i16 < 0) {
                break;
            }
            if (i15 < 0) {
                i10 = i16 - 1;
                obj = objArr3[i16];
            } else if (i16 < 0) {
                i10 = i16;
                obj = objArr2[i15];
                i15--;
            } else {
                Object obj2 = objArr2[i15];
                Object obj3 = objArr3[i16];
                int identityHashCode = System.identityHashCode(obj2);
                int identityHashCode2 = System.identityHashCode(obj3);
                if (identityHashCode > identityHashCode2) {
                    i15--;
                } else {
                    if (identityHashCode >= identityHashCode2) {
                        if (obj2 == obj3) {
                            i15--;
                            i16--;
                        } else {
                            int i18 = i15 - 1;
                            while (i18 >= 0) {
                                int i19 = i18 - 1;
                                Object obj4 = objArr2[i18];
                                if (System.identityHashCode(obj4) != identityHashCode2) {
                                    break;
                                } else if (obj3 == obj4) {
                                    i16--;
                                    break;
                                } else {
                                    i18 = i19;
                                }
                            }
                        }
                    }
                    i10 = i16 - 1;
                    obj = obj3;
                }
                i10 = i16;
                obj = obj2;
            }
            objArr[i17] = obj;
            i16 = i10;
            i17--;
        }
        if (i17 >= 0) {
            q.W2(0, i17 + 1, i14, objArr, objArr);
        }
        int i20 = i14 - (i17 + 1);
        q.d3(i20, i14, null, objArr);
        this.f25559Z = objArr;
        this.f25558Y = i20;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        int s10 = s(obj);
        Object[] objArr = this.f25559Z;
        int i10 = this.f25558Y;
        if (s10 < 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (s10 < i11) {
            q.W2(s10, s10 + 1, i10, objArr, objArr);
        }
        objArr[i11] = null;
        this.f25558Y--;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int s(Object obj) {
        int i10 = this.f25558Y - 1;
        int identityHashCode = System.identityHashCode(obj);
        Object[] objArr = this.f25559Z;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = objArr[i12];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i11 = i12 + 1;
            } else if (identityHashCode2 <= identityHashCode) {
                if (obj2 == obj) {
                    return i12;
                } else {
                    Object[] objArr2 = this.f25559Z;
                    int i13 = this.f25558Y;
                    for (int i14 = i12 - 1; -1 < i14; i14--) {
                        Object obj3 = objArr2[i14];
                        if (obj3 != obj) {
                            if (System.identityHashCode(obj3) != identityHashCode) {
                                break;
                            }
                        } else {
                            return i14;
                        }
                    }
                    for (int i15 = i12 + 1; i15 < i13; i15++) {
                        Object obj4 = objArr2[i15];
                        if (obj4 != obj) {
                            if (System.identityHashCode(obj4) != identityHashCode) {
                                return -(i15 + 1);
                            }
                        } else {
                            return i15;
                        }
                    }
                    return -(i13 + 1);
                }
            } else {
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f25558Y;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return m.J(this);
    }

    public final String toString() {
        return t.m2(this, null, "[", "]", C2098b.f25557Y, 25);
    }

    public final boolean y() {
        if (this.f25558Y > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return m.K(this, objArr);
    }
}
