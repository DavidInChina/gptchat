package w;

import Ng.H;
import id.AbstractC3557B;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import x.AbstractC6262a;
import xf.AbstractC6439b;
import xf.AbstractC6443f;

/* renamed from: w.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6060g implements Collection, Set, AbstractC6439b, AbstractC6443f {

    /* renamed from: Y  reason: collision with root package name */
    public int[] f47584Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object[] f47585Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f47586h0;

    public C6060g() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int i11;
        boolean z10;
        int i12 = this.f47586h0;
        if (obj == null) {
            i11 = H.r(this, null, 0);
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            i11 = H.r(this, obj, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i13 = ~i11;
        int[] iArr = this.f47584Y;
        if (i12 >= iArr.length) {
            int i14 = 8;
            if (i12 >= 8) {
                i14 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i14 = 4;
            }
            Object[] objArr = this.f47585Z;
            H.j(this, i14);
            if (i12 == this.f47586h0) {
                int[] iArr2 = this.f47584Y;
                if (iArr2.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    kf.q.Z2(iArr, iArr2, iArr.length, 6);
                    kf.q.a3(objArr, this.f47585Z, 0, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i12) {
            int[] iArr3 = this.f47584Y;
            int i15 = i13 + 1;
            kf.q.V2(i15, i13, i12, iArr3, iArr3);
            Object[] objArr2 = this.f47585Z;
            kf.q.W2(i15, i13, i12, objArr2, objArr2);
        }
        int i16 = this.f47586h0;
        if (i12 == i16) {
            int[] iArr4 = this.f47584Y;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                this.f47585Z[i13] = obj;
                this.f47586h0 = i16 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        int size = collection.size() + this.f47586h0;
        int i10 = this.f47586h0;
        int[] iArr = this.f47584Y;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f47585Z;
            H.j(this, size);
            int i11 = this.f47586h0;
            if (i11 > 0) {
                kf.q.Z2(iArr, this.f47584Y, i11, 6);
                kf.q.a3(objArr, this.f47585Z, 0, this.f47586h0, 6);
            }
        }
        if (this.f47586h0 == i10) {
            for (Object obj : collection) {
                z10 |= add(obj);
            }
            return z10;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f47586h0 != 0) {
            this.f47584Y = AbstractC6262a.f48621a;
            this.f47585Z = AbstractC6262a.f48623c;
            this.f47586h0 = 0;
        }
        if (this.f47586h0 == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10;
        if (obj == null) {
            i10 = H.r(this, null, 0);
        } else {
            i10 = H.r(this, obj, obj.hashCode());
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f47586h0 == ((Set) obj).size()) {
            try {
                int i10 = this.f47586h0;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (((Set) obj).contains(this.f47585Z[i11])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f47584Y;
        int i10 = this.f47586h0;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f47586h0 <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6055b(this);
    }

    public final Object r(int i10) {
        int i11 = this.f47586h0;
        Object[] objArr = this.f47585Z;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f47584Y;
            int i13 = 8;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                if (i11 > 8) {
                    i13 = i11 + (i11 >> 1);
                }
                H.j(this, i13);
                if (i10 > 0) {
                    kf.q.Z2(iArr, this.f47584Y, i10, 6);
                    kf.q.a3(objArr, this.f47585Z, 0, i10, 6);
                }
                if (i10 < i12) {
                    int i14 = i10 + 1;
                    kf.q.V2(i10, i14, i11, iArr, this.f47584Y);
                    kf.q.W2(i10, i14, i11, objArr, this.f47585Z);
                }
            } else {
                if (i10 < i12) {
                    int i15 = i10 + 1;
                    kf.q.V2(i10, i15, i11, iArr, iArr);
                    Object[] objArr2 = this.f47585Z;
                    kf.q.W2(i10, i15, i11, objArr2, objArr2);
                }
                this.f47585Z[i12] = null;
            }
            if (i11 == this.f47586h0) {
                this.f47586h0 = i12;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10;
        if (obj == null) {
            i10 = H.r(this, null, 0);
        } else {
            i10 = H.r(this, obj, obj.hashCode());
        }
        if (i10 < 0) {
            return false;
        }
        r(i10);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        boolean z10 = false;
        for (Object obj : collection) {
            z10 |= remove(obj);
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        boolean z10 = false;
        for (int i10 = this.f47586h0 - 1; -1 < i10; i10--) {
            if (!kf.t.X1(collection, this.f47585Z[i10])) {
                r(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f47586h0;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        AbstractC3557B.c0("array", objArr);
        int i10 = this.f47586h0;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        } else if (objArr.length > i10) {
            objArr[i10] = null;
        }
        kf.q.W2(0, 0, this.f47586h0, this.f47585Z, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f47586h0 * 14);
        sb2.append('{');
        int i10 = this.f47586h0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f47585Z[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder(capacity).\u2026builderAction).toString()", sb3);
        return sb3;
    }

    public C6060g(int i10) {
        this.f47584Y = AbstractC6262a.f48621a;
        this.f47585Z = AbstractC6262a.f48623c;
        if (i10 > 0) {
            H.j(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return kf.q.c3(0, this.f47586h0, this.f47585Z);
    }
}
