package w;

import id.AbstractC3557B;
import java.util.Arrays;
import x.AbstractC6262a;

/* renamed from: w.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6066m implements Cloneable {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ boolean f47597Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ long[] f47598Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object[] f47599h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ int f47600i0;

    public C6066m() {
        this((Object) null);
    }

    public final void a(long j6, Long l10) {
        int i10 = this.f47600i0;
        if (i10 != 0 && j6 <= this.f47598Z[i10 - 1]) {
            h(j6, l10);
            return;
        }
        if (this.f47597Y) {
            long[] jArr = this.f47598Z;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f47599h0;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != AbstractC6067n.f47601a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f47597Y = false;
                this.f47600i0 = i11;
            }
        }
        int i13 = this.f47600i0;
        if (i13 >= this.f47598Z.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] copyOf = Arrays.copyOf(this.f47598Z, i17);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f47598Z = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f47599h0, i17);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
            this.f47599h0 = copyOf2;
        }
        this.f47598Z[i13] = j6;
        this.f47599h0[i13] = l10;
        this.f47600i0 = i13 + 1;
    }

    public final void b() {
        int i10 = this.f47600i0;
        Object[] objArr = this.f47599h0;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f47600i0 = 0;
        this.f47597Y = false;
    }

    /* renamed from: c */
    public final C6066m clone() {
        Object clone = super.clone();
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>", clone);
        C6066m c6066m = (C6066m) clone;
        c6066m.f47598Z = (long[]) this.f47598Z.clone();
        c6066m.f47599h0 = (Object[]) this.f47599h0.clone();
        return c6066m;
    }

    public final Object d(long j6) {
        Object obj;
        int b10 = AbstractC6262a.b(this.f47598Z, this.f47600i0, j6);
        if (b10 < 0 || (obj = this.f47599h0[b10]) == AbstractC6067n.f47601a) {
            return null;
        }
        return obj;
    }

    public final Object e(long j6) {
        Object obj;
        int b10 = AbstractC6262a.b(this.f47598Z, this.f47600i0, j6);
        if (b10 < 0 || (obj = this.f47599h0[b10]) == AbstractC6067n.f47601a) {
            return -1L;
        }
        return obj;
    }

    public final int f(long j6) {
        if (this.f47597Y) {
            int i10 = this.f47600i0;
            long[] jArr = this.f47598Z;
            Object[] objArr = this.f47599h0;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC6067n.f47601a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f47597Y = false;
            this.f47600i0 = i11;
        }
        return AbstractC6262a.b(this.f47598Z, this.f47600i0, j6);
    }

    public final long g(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f47600i0)) {
            if (this.f47597Y) {
                long[] jArr = this.f47598Z;
                Object[] objArr = this.f47599h0;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != AbstractC6067n.f47601a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f47597Y = false;
                this.f47600i0 = i12;
            }
            return this.f47598Z[i10];
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public final void h(long j6, Object obj) {
        int b10 = AbstractC6262a.b(this.f47598Z, this.f47600i0, j6);
        if (b10 >= 0) {
            this.f47599h0[b10] = obj;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f47600i0;
        if (i10 < i11) {
            Object[] objArr = this.f47599h0;
            if (objArr[i10] == AbstractC6067n.f47601a) {
                this.f47598Z[i10] = j6;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f47597Y) {
            long[] jArr = this.f47598Z;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f47599h0;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr2[i13];
                    if (obj2 != AbstractC6067n.f47601a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj2;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f47597Y = false;
                this.f47600i0 = i12;
                i10 = ~AbstractC6262a.b(this.f47598Z, i12, j6);
            }
        }
        int i14 = this.f47600i0;
        if (i14 >= this.f47598Z.length) {
            int i15 = (i14 + 1) * 8;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 8;
            long[] copyOf = Arrays.copyOf(this.f47598Z, i18);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f47598Z = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f47599h0, i18);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
            this.f47599h0 = copyOf2;
        }
        int i19 = this.f47600i0 - i10;
        if (i19 != 0) {
            long[] jArr2 = this.f47598Z;
            int i20 = i10 + 1;
            AbstractC3557B.c0("<this>", jArr2);
            System.arraycopy(jArr2, i10, jArr2, i20, i19);
            Object[] objArr3 = this.f47599h0;
            kf.q.W2(i20, i10, this.f47600i0, objArr3, objArr3);
        }
        this.f47598Z[i10] = j6;
        this.f47599h0[i10] = obj;
        this.f47600i0++;
    }

    public final int i() {
        if (this.f47597Y) {
            int i10 = this.f47600i0;
            long[] jArr = this.f47598Z;
            Object[] objArr = this.f47599h0;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC6067n.f47601a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f47597Y = false;
            this.f47600i0 = i11;
        }
        return this.f47600i0;
    }

    public final Object j(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f47600i0)) {
            if (this.f47597Y) {
                long[] jArr = this.f47598Z;
                Object[] objArr = this.f47599h0;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != AbstractC6067n.f47601a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f47597Y = false;
                this.f47600i0 = i12;
            }
            return this.f47599h0[i10];
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Expected index to be within 0..size()-1, but was ", i10).toString());
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f47600i0 * 28);
        sb2.append('{');
        int i10 = this.f47600i0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i11));
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

    public /* synthetic */ C6066m(Object obj) {
        this(10);
    }

    public C6066m(int i10) {
        if (i10 == 0) {
            this.f47598Z = AbstractC6262a.f48622b;
            this.f47599h0 = AbstractC6262a.f48623c;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f47598Z = new long[i14];
        this.f47599h0 = new Object[i14];
    }
}
