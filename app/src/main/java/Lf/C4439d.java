package lf;

import id.AbstractC3557B;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import xf.AbstractC6442e;

/* renamed from: lf.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4439d implements Map, Serializable, AbstractC6442e {

    /* renamed from: s0  reason: collision with root package name */
    public static final C4439d f38311s0;

    /* renamed from: Y  reason: collision with root package name */
    public Object[] f38312Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object[] f38313Z;

    /* renamed from: h0  reason: collision with root package name */
    public int[] f38314h0;

    /* renamed from: i0  reason: collision with root package name */
    public int[] f38315i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f38316j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f38317k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f38318l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f38319m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f38320n0;

    /* renamed from: o0  reason: collision with root package name */
    public C4440e f38321o0;

    /* renamed from: p0  reason: collision with root package name */
    public C4441f f38322p0;

    /* renamed from: q0  reason: collision with root package name */
    public C4440e f38323q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f38324r0;

    static {
        C4439d c4439d = new C4439d(0);
        c4439d.f38324r0 = true;
        f38311s0 = c4439d;
    }

    public C4439d() {
        this(8);
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int i10 = i(obj);
            int i11 = this.f38316j0 * 2;
            int length = this.f38315i0.length / 2;
            if (i11 > length) {
                i11 = length;
            }
            int i12 = 0;
            while (true) {
                int[] iArr = this.f38315i0;
                int i13 = iArr[i10];
                if (i13 <= 0) {
                    int i14 = this.f38317k0;
                    Object[] objArr = this.f38312Y;
                    if (i14 >= objArr.length) {
                        e(1);
                    } else {
                        int i15 = i14 + 1;
                        this.f38317k0 = i15;
                        objArr[i14] = obj;
                        this.f38314h0[i14] = i10;
                        iArr[i10] = i15;
                        this.f38320n0++;
                        this.f38319m0++;
                        if (i12 > this.f38316j0) {
                            this.f38316j0 = i12;
                        }
                        return i14;
                    }
                } else if (AbstractC3557B.K(this.f38312Y[i13 - 1], obj)) {
                    return -i13;
                } else {
                    i12++;
                    if (i12 > i11) {
                        j(this.f38315i0.length * 2);
                        break;
                    }
                    int i16 = i10 - 1;
                    if (i10 == 0) {
                        i10 = this.f38315i0.length - 1;
                    } else {
                        i10 = i16;
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.f38324r0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean c(Collection collection) {
        AbstractC3557B.c0("m", collection);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!d((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        Cf.f it = new Cf.e(0, this.f38317k0 - 1, 1).iterator();
        while (it.f3111h0) {
            int a5 = it.a();
            int[] iArr = this.f38314h0;
            int i10 = iArr[a5];
            if (i10 >= 0) {
                this.f38315i0[i10] = 0;
                iArr[a5] = -1;
            }
        }
        AbstractC3557B.p2(0, this.f38317k0, this.f38312Y);
        Object[] objArr = this.f38313Z;
        if (objArr != null) {
            AbstractC3557B.p2(0, this.f38317k0, objArr);
        }
        this.f38320n0 = 0;
        this.f38317k0 = 0;
        this.f38319m0++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean d(Map.Entry entry) {
        AbstractC3557B.c0("entry", entry);
        int g10 = g(entry.getKey());
        if (g10 < 0) {
            return false;
        }
        Object[] objArr = this.f38313Z;
        AbstractC3557B.Z(objArr);
        return AbstractC3557B.K(objArr[g10], entry.getValue());
    }

    public final void e(int i10) {
        Object[] objArr;
        Object[] objArr2 = this.f38312Y;
        int length = objArr2.length;
        int i11 = this.f38317k0;
        int i12 = length - i11;
        int i13 = i11 - this.f38320n0;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr2.length / 4) {
            j(this.f38315i0.length);
            return;
        }
        int i14 = i11 + i10;
        if (i14 >= 0) {
            if (i14 > objArr2.length) {
                int length2 = objArr2.length;
                int i15 = length2 + (length2 >> 1);
                if (i15 - i14 < 0) {
                    i15 = i14;
                }
                if (i15 - 2147483639 > 0) {
                    if (i14 > 2147483639) {
                        i15 = Integer.MAX_VALUE;
                    } else {
                        i15 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i15);
                AbstractC3557B.b0("copyOf(...)", copyOf);
                this.f38312Y = copyOf;
                Object[] objArr3 = this.f38313Z;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i15);
                    AbstractC3557B.b0("copyOf(...)", objArr);
                } else {
                    objArr = null;
                }
                this.f38313Z = objArr;
                int[] copyOf2 = Arrays.copyOf(this.f38314h0, i15);
                AbstractC3557B.b0("copyOf(...)", copyOf2);
                this.f38314h0 = copyOf2;
                if (i15 < 1) {
                    i15 = 1;
                }
                int highestOneBit = Integer.highestOneBit(i15 * 3);
                if (highestOneBit > this.f38315i0.length) {
                    j(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C4440e c4440e = this.f38323q0;
        if (c4440e == null) {
            C4440e c4440e2 = new C4440e(this, 0);
            this.f38323q0 = c4440e2;
            return c4440e2;
        }
        return c4440e;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f38320n0 != map.size() || !c(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final int g(Object obj) {
        int i10 = i(obj);
        int i11 = this.f38316j0;
        while (true) {
            int i12 = this.f38315i0[i10];
            if (i12 == 0) {
                return -1;
            }
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (AbstractC3557B.K(this.f38312Y[i13], obj)) {
                    return i13;
                }
            }
            i11--;
            if (i11 < 0) {
                return -1;
            }
            int i14 = i10 - 1;
            if (i10 == 0) {
                i10 = this.f38315i0.length - 1;
            } else {
                i10 = i14;
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g10 = g(obj);
        if (g10 < 0) {
            return null;
        }
        Object[] objArr = this.f38313Z;
        AbstractC3557B.Z(objArr);
        return objArr[g10];
    }

    public final int h(Object obj) {
        int i10 = this.f38317k0;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f38314h0[i10] >= 0) {
                Object[] objArr = this.f38313Z;
                AbstractC3557B.Z(objArr);
                if (AbstractC3557B.K(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i10;
        int i11;
        C4437b c4437b = new C4437b(this, 0);
        int i12 = 0;
        while (c4437b.hasNext()) {
            int i13 = c4437b.f3221Y;
            C4439d c4439d = (C4439d) c4437b.f3224i0;
            if (i13 < c4439d.f38317k0) {
                c4437b.f3221Y = i13 + 1;
                c4437b.f3222Z = i13;
                Object obj = c4439d.f38312Y[i13];
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                Object[] objArr = c4439d.f38313Z;
                AbstractC3557B.Z(objArr);
                Object obj2 = objArr[c4437b.f3222Z];
                if (obj2 != null) {
                    i11 = obj2.hashCode();
                } else {
                    i11 = 0;
                }
                c4437b.e();
                i12 += i10 ^ i11;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i12;
    }

    public final int i(Object obj) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return (i10 * (-1640531527)) >>> this.f38318l0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f38320n0 == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        r3[r0] = r7;
        r6.f38314h0[r2] = r0;
        r2 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i10) {
        int i11;
        this.f38319m0++;
        int i12 = 0;
        if (this.f38317k0 > this.f38320n0) {
            Object[] objArr = this.f38313Z;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i11 = this.f38317k0;
                if (i13 >= i11) {
                    break;
                }
                if (this.f38314h0[i13] >= 0) {
                    Object[] objArr2 = this.f38312Y;
                    objArr2[i14] = objArr2[i13];
                    if (objArr != null) {
                        objArr[i14] = objArr[i13];
                    }
                    i14++;
                }
                i13++;
            }
            AbstractC3557B.p2(i14, i11, this.f38312Y);
            if (objArr != null) {
                AbstractC3557B.p2(i14, this.f38317k0, objArr);
            }
            this.f38317k0 = i14;
        }
        int[] iArr = this.f38315i0;
        if (i10 != iArr.length) {
            this.f38315i0 = new int[i10];
            this.f38318l0 = Integer.numberOfLeadingZeros(i10) + 1;
        } else {
            Arrays.fill(iArr, 0, iArr.length, 0);
        }
        while (i12 < this.f38317k0) {
            int i15 = i12 + 1;
            int i16 = i(this.f38312Y[i12]);
            int i17 = this.f38316j0;
            while (true) {
                int[] iArr2 = this.f38315i0;
                if (iArr2[i16] == 0) {
                    break;
                }
                i17--;
                if (i17 >= 0) {
                    int i18 = i16 - 1;
                    if (i16 == 0) {
                        i16 = iArr2.length - 1;
                    } else {
                        i16 = i18;
                    }
                } else {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i10) {
        Object[] objArr = this.f38312Y;
        AbstractC3557B.c0("<this>", objArr);
        objArr[i10] = null;
        int i11 = this.f38314h0[i10];
        int i12 = this.f38316j0 * 2;
        int length = this.f38315i0.length / 2;
        if (i12 > length) {
            i12 = length;
        }
        int i13 = i12;
        int i14 = 0;
        int i15 = i11;
        while (true) {
            int i16 = i11 - 1;
            if (i11 == 0) {
                i11 = this.f38315i0.length - 1;
            } else {
                i11 = i16;
            }
            i14++;
            if (i14 > this.f38316j0) {
                this.f38315i0[i15] = 0;
                break;
            }
            int[] iArr = this.f38315i0;
            int i17 = iArr[i11];
            if (i17 == 0) {
                iArr[i15] = 0;
                break;
            }
            if (i17 < 0) {
                iArr[i15] = -1;
            } else {
                int i18 = i17 - 1;
                int[] iArr2 = this.f38315i0;
                if (((i(this.f38312Y[i18]) - i11) & (iArr2.length - 1)) >= i14) {
                    iArr2[i15] = i17;
                    this.f38314h0[i18] = i15;
                }
                i13--;
                if (i13 < 0) {
                    this.f38315i0[i15] = -1;
                    break;
                }
            }
            i15 = i11;
            i14 = 0;
            i13--;
            if (i13 < 0) {
            }
        }
        this.f38314h0[i10] = -1;
        this.f38320n0--;
        this.f38319m0++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C4440e c4440e = this.f38321o0;
        if (c4440e == null) {
            C4440e c4440e2 = new C4440e(this, 1);
            this.f38321o0 = c4440e2;
            return c4440e2;
        }
        return c4440e;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a5 = a(obj);
        Object[] objArr = this.f38313Z;
        if (objArr == null) {
            int length = this.f38312Y.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.f38313Z = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
        }
        if (a5 < 0) {
            int i10 = (-a5) - 1;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        objArr[a5] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        AbstractC3557B.c0("from", map);
        b();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            e(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a5 = a(entry.getKey());
                Object[] objArr = this.f38313Z;
                if (objArr == null) {
                    int length = this.f38312Y.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.f38313Z = objArr;
                    } else {
                        throw new IllegalArgumentException("capacity must be non-negative.".toString());
                    }
                }
                if (a5 >= 0) {
                    objArr[a5] = entry.getValue();
                } else {
                    int i10 = (-a5) - 1;
                    if (!AbstractC3557B.K(entry.getValue(), objArr[i10])) {
                        objArr[i10] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int g10 = g(obj);
        if (g10 < 0) {
            g10 = -1;
        } else {
            k(g10);
        }
        if (g10 < 0) {
            return null;
        }
        Object[] objArr = this.f38313Z;
        AbstractC3557B.Z(objArr);
        Object obj2 = objArr[g10];
        objArr[g10] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f38320n0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f38320n0 * 3) + 2);
        sb2.append("{");
        int i10 = 0;
        C4437b c4437b = new C4437b(this, 0);
        while (c4437b.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = c4437b.f3221Y;
            C4439d c4439d = (C4439d) c4437b.f3224i0;
            if (i11 < c4439d.f38317k0) {
                c4437b.f3221Y = i11 + 1;
                c4437b.f3222Z = i11;
                Object obj = c4439d.f38312Y[i11];
                if (obj == c4439d) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = c4439d.f38313Z;
                AbstractC3557B.Z(objArr);
                Object obj2 = objArr[c4437b.f3222Z];
                if (obj2 == c4439d) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                c4437b.e();
                i10++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    @Override // java.util.Map
    public final Collection values() {
        C4441f c4441f = this.f38322p0;
        if (c4441f == null) {
            C4441f c4441f2 = new C4441f(this);
            this.f38322p0 = c4441f2;
            return c4441f2;
        }
        return c4441f;
    }

    public C4439d(int i10) {
        if (i10 >= 0) {
            Object[] objArr = new Object[i10];
            int[] iArr = new int[i10];
            int highestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
            this.f38312Y = objArr;
            this.f38313Z = null;
            this.f38314h0 = iArr;
            this.f38315i0 = new int[highestOneBit];
            this.f38316j0 = 2;
            this.f38317k0 = 0;
            this.f38318l0 = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
}
