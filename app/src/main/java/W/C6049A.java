package w;

import id.AbstractC3557B;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import x.AbstractC6262a;

/* renamed from: w.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6049A {

    /* renamed from: Y  reason: collision with root package name */
    public int[] f47558Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object[] f47559Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f47560h0;

    public C6049A() {
        this(0);
    }

    public final int a(Object obj) {
        int i10 = this.f47560h0 * 2;
        Object[] objArr = this.f47559Z;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (AbstractC3557B.K(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f47560h0;
        int[] iArr = this.f47558Y;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, i10);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f47558Y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f47559Z, i10 * 2);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
            this.f47559Z = copyOf2;
        }
        if (this.f47560h0 == i11) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f47560h0;
        if (i11 == 0) {
            return -1;
        }
        int a5 = AbstractC6262a.a(i11, i10, this.f47558Y);
        if (a5 < 0) {
            return a5;
        }
        if (AbstractC3557B.K(obj, this.f47559Z[a5 << 1])) {
            return a5;
        }
        int i12 = a5 + 1;
        while (i12 < i11 && this.f47558Y[i12] == i10) {
            if (AbstractC3557B.K(obj, this.f47559Z[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a5 - 1; i13 >= 0 && this.f47558Y[i13] == i10; i13--) {
            if (AbstractC3557B.K(obj, this.f47559Z[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final void clear() {
        if (this.f47560h0 > 0) {
            this.f47558Y = AbstractC6262a.f48621a;
            this.f47559Z = AbstractC6262a.f48623c;
            this.f47560h0 = 0;
        }
        if (this.f47560h0 <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i10 = this.f47560h0;
        if (i10 == 0) {
            return -1;
        }
        int a5 = AbstractC6262a.a(i10, 0, this.f47558Y);
        if (a5 < 0) {
            return a5;
        }
        if (this.f47559Z[a5 << 1] == null) {
            return a5;
        }
        int i11 = a5 + 1;
        while (i11 < i10 && this.f47558Y[i11] == 0) {
            if (this.f47559Z[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a5 - 1; i12 >= 0 && this.f47558Y[i12] == 0; i12--) {
            if (this.f47559Z[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C6049A) {
                int i10 = this.f47560h0;
                if (i10 != ((C6049A) obj).f47560h0) {
                    return false;
                }
                C6049A c6049a = (C6049A) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object g10 = g(i11);
                    Object j6 = j(i11);
                    Object obj2 = c6049a.get(g10);
                    if (j6 == null) {
                        if (obj2 != null || !c6049a.containsKey(g10)) {
                            return false;
                        }
                    } else if (!AbstractC3557B.K(j6, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f47560h0 != ((Map) obj).size()) {
                return false;
            } else {
                int i12 = this.f47560h0;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object g11 = g(i13);
                    Object j10 = j(i13);
                    Object obj3 = ((Map) obj).get(g11);
                    if (j10 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(g11)) {
                            return false;
                        }
                    } else if (!AbstractC3557B.K(j10, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object g(int i10) {
        if (i10 >= 0 && i10 < this.f47560h0) {
            return this.f47559Z[i10 << 1];
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public Object get(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f47559Z[(d10 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f47559Z[(d10 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f47560h0)) {
            Object[] objArr = this.f47559Z;
            int i12 = i10 << 1;
            Object obj = objArr[i12 + 1];
            if (i11 <= 1) {
                clear();
            } else {
                int i13 = i11 - 1;
                int[] iArr = this.f47558Y;
                int i14 = 8;
                if (iArr.length > 8 && i11 < iArr.length / 3) {
                    if (i11 > 8) {
                        i14 = i11 + (i11 >> 1);
                    }
                    int[] copyOf = Arrays.copyOf(iArr, i14);
                    AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
                    this.f47558Y = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.f47559Z, i14 << 1);
                    AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
                    this.f47559Z = copyOf2;
                    if (i11 == this.f47560h0) {
                        if (i10 > 0) {
                            kf.q.V2(0, 0, i10, iArr, this.f47558Y);
                            kf.q.W2(0, 0, i12, objArr, this.f47559Z);
                        }
                        if (i10 < i13) {
                            int i15 = i10 + 1;
                            kf.q.V2(i10, i15, i11, iArr, this.f47558Y);
                            kf.q.W2(i12, i15 << 1, i11 << 1, objArr, this.f47559Z);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                } else {
                    if (i10 < i13) {
                        int i16 = i10 + 1;
                        kf.q.V2(i10, i16, i11, iArr, iArr);
                        Object[] objArr2 = this.f47559Z;
                        kf.q.W2(i12, i16 << 1, i11 << 1, objArr2, objArr2);
                    }
                    Object[] objArr3 = this.f47559Z;
                    int i17 = i13 << 1;
                    objArr3[i17] = null;
                    objArr3[i17 + 1] = null;
                }
                if (i11 == this.f47560h0) {
                    this.f47560h0 = i13;
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            return obj;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public final int hashCode() {
        int i10;
        int[] iArr = this.f47558Y;
        Object[] objArr = this.f47559Z;
        int i11 = this.f47560h0;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            int i15 = iArr[i13];
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i14 += i10 ^ i15;
            i13++;
            i12 += 2;
        }
        return i14;
    }

    public final Object i(int i10, Object obj) {
        if (i10 >= 0 && i10 < this.f47560h0) {
            int i11 = (i10 << 1) + 1;
            Object[] objArr = this.f47559Z;
            Object obj2 = objArr[i11];
            objArr[i11] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public final boolean isEmpty() {
        if (this.f47560h0 <= 0) {
            return true;
        }
        return false;
    }

    public final Object j(int i10) {
        if (i10 >= 0 && i10 < this.f47560h0) {
            return this.f47559Z[(i10 << 1) + 1];
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public final Object put(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12 = this.f47560h0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        if (obj != null) {
            i11 = c(i10, obj);
        } else {
            i11 = e();
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            Object[] objArr = this.f47559Z;
            Object obj3 = objArr[i13];
            objArr[i13] = obj2;
            return obj3;
        }
        int i14 = ~i11;
        int[] iArr = this.f47558Y;
        if (i12 >= iArr.length) {
            int i15 = 8;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i15 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i15);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f47558Y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f47559Z, i15 << 1);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
            this.f47559Z = copyOf2;
            if (i12 != this.f47560h0) {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr2 = this.f47558Y;
            int i16 = i14 + 1;
            kf.q.V2(i16, i14, i12, iArr2, iArr2);
            Object[] objArr2 = this.f47559Z;
            kf.q.W2(i16 << 1, i14 << 1, this.f47560h0 << 1, objArr2, objArr2);
        }
        int i17 = this.f47560h0;
        if (i12 == i17) {
            int[] iArr3 = this.f47558Y;
            if (i14 < iArr3.length) {
                iArr3[i14] = i10;
                Object[] objArr3 = this.f47559Z;
                int i18 = i14 << 1;
                objArr3[i18] = obj;
                objArr3[i18 + 1] = obj2;
                this.f47560h0 = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return h(d10);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return i(d10, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f47560h0;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f47560h0 * 28);
        sb2.append('{');
        int i10 = this.f47560h0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object g10 = g(i11);
            if (g10 != sb2) {
                sb2.append(g10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object j6 = j(i11);
            if (j6 != sb2) {
                sb2.append(j6);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder(capacity).\u2026builderAction).toString()", sb3);
        return sb3;
    }

    public C6049A(int i10) {
        int[] iArr;
        Object[] objArr;
        if (i10 == 0) {
            iArr = AbstractC6262a.f48621a;
        } else {
            iArr = new int[i10];
        }
        this.f47558Y = iArr;
        if (i10 == 0) {
            objArr = AbstractC6262a.f48623c;
        } else {
            objArr = new Object[i10 << 1];
        }
        this.f47559Z = objArr;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 < 0 || !AbstractC3557B.K(obj2, j(d10))) {
            return false;
        }
        h(d10);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d10 = d(obj);
        if (d10 < 0 || !AbstractC3557B.K(obj2, j(d10))) {
            return false;
        }
        i(d10, obj3);
        return true;
    }
}
