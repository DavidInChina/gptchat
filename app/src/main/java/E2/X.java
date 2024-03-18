package E2;

import N.C1025i;
import android.util.SparseArray;
import io.sentry.C3636c1;
import java.io.EOFException;
import p2.AbstractC5060m;
import p2.C5063p;
import p2.C5065s;
import s2.AbstractC5530A;
import s2.AbstractC5535e;

/* loaded from: classes.dex */
public final class X implements L2.G {

    /* renamed from: B  reason: collision with root package name */
    public boolean f4248B;

    /* renamed from: a  reason: collision with root package name */
    public final T f4249a;

    /* renamed from: d  reason: collision with root package name */
    public final B2.q f4252d;

    /* renamed from: e  reason: collision with root package name */
    public final B2.n f4253e;

    /* renamed from: f  reason: collision with root package name */
    public W f4254f;

    /* renamed from: g  reason: collision with root package name */
    public C5065s f4255g;

    /* renamed from: h  reason: collision with root package name */
    public B2.k f4256h;

    /* renamed from: p  reason: collision with root package name */
    public int f4264p;

    /* renamed from: q  reason: collision with root package name */
    public int f4265q;

    /* renamed from: r  reason: collision with root package name */
    public int f4266r;

    /* renamed from: s  reason: collision with root package name */
    public int f4267s;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4271w;

    /* renamed from: z  reason: collision with root package name */
    public C5065s f4274z;

    /* renamed from: b  reason: collision with root package name */
    public final U f4250b = new Object();

    /* renamed from: i  reason: collision with root package name */
    public int f4257i = 1000;

    /* renamed from: j  reason: collision with root package name */
    public long[] f4258j = new long[1000];

    /* renamed from: k  reason: collision with root package name */
    public long[] f4259k = new long[1000];

    /* renamed from: n  reason: collision with root package name */
    public long[] f4262n = new long[1000];

    /* renamed from: m  reason: collision with root package name */
    public int[] f4261m = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    public int[] f4260l = new int[1000];

    /* renamed from: o  reason: collision with root package name */
    public L2.F[] f4263o = new L2.F[1000];

    /* renamed from: c  reason: collision with root package name */
    public final C1025i f4251c = new C1025i(new p2.Y(25));

    /* renamed from: t  reason: collision with root package name */
    public long f4268t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    public long f4269u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    public long f4270v = Long.MIN_VALUE;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4273y = true;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4272x = true;

    /* renamed from: A  reason: collision with root package name */
    public boolean f4247A = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [E2.U, java.lang.Object] */
    public X(I2.d dVar, B2.q qVar, B2.n nVar) {
        this.f4252d = qVar;
        this.f4253e = nVar;
        this.f4249a = new T(dVar);
    }

    @Override // L2.G
    public final void a(int i10, s2.u uVar) {
        d(i10, 0, uVar);
    }

    @Override // L2.G
    public final void b(C5065s c5065s) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            try {
                this.f4273y = false;
                if (!AbstractC5530A.a(c5065s, this.f4274z)) {
                    if (((SparseArray) this.f4251c.f12351h0).size() != 0) {
                        Object obj = this.f4251c.f12351h0;
                        if (((V) ((SparseArray) obj).valueAt(((SparseArray) obj).size() - 1)).f4245a.equals(c5065s)) {
                            Object obj2 = this.f4251c.f12351h0;
                            this.f4274z = ((V) ((SparseArray) obj2).valueAt(((SparseArray) obj2).size() - 1)).f4245a;
                            boolean z11 = this.f4247A;
                            C5065s c5065s2 = this.f4274z;
                            this.f4247A = z11 & p2.N.a(c5065s2.f42319q0, c5065s2.f42316n0);
                            this.f4248B = false;
                            z10 = true;
                        }
                    }
                    this.f4274z = c5065s;
                    boolean z112 = this.f4247A;
                    C5065s c5065s22 = this.f4274z;
                    this.f4247A = z112 & p2.N.a(c5065s22.f42319q0, c5065s22.f42316n0);
                    this.f4248B = false;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        W w10 = this.f4254f;
        if (w10 != null && z10) {
            N n10 = (N) w10;
            n10.f4207u0.post(n10.f4205s0);
        }
    }

    @Override // L2.G
    public final int c(AbstractC5060m abstractC5060m, int i10, boolean z10) {
        return s(abstractC5060m, i10, z10);
    }

    @Override // L2.G
    public final void d(int i10, int i11, s2.u uVar) {
        while (true) {
            T t10 = this.f4249a;
            if (i10 > 0) {
                int b10 = t10.b(i10);
                S s10 = t10.f4240f;
                uVar.e(((I2.a) s10.f4233c).f7957a, s10.a(t10.f4241g), b10);
                i10 -= b10;
                long j6 = t10.f4241g + b10;
                t10.f4241g = j6;
                S s11 = t10.f4240f;
                if (j6 == s11.f4232b) {
                    t10.f4240f = (S) s11.f4234d;
                }
            } else {
                t10.getClass();
                return;
            }
        }
    }

    @Override // L2.G
    public final void e(long j6, int i10, int i11, int i12, L2.F f6) {
        boolean z10;
        int i13 = i10 & 1;
        if (i13 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f4272x) {
            if (!z10) {
                return;
            }
            this.f4272x = false;
        }
        if (this.f4247A) {
            if (j6 < this.f4268t) {
                return;
            }
            if (i13 == 0) {
                if (!this.f4248B) {
                    s2.p.g("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f4274z);
                    this.f4248B = true;
                }
                i10 |= 1;
            }
        }
        f(j6, i10, (this.f4249a.f4241g - i11) - i12, i11, f6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (((E2.V) ((android.util.SparseArray) r9).valueAt(((android.util.SparseArray) r9).size() - 1)).f4245a.equals(r8.f4274z) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(long j6, int i10, long j10, int i11, L2.F f6) {
        boolean z10;
        B2.p pVar;
        int l10;
        boolean z11;
        try {
            int i12 = this.f4264p;
            if (i12 > 0) {
                if (this.f4259k[l(i12 - 1)] + this.f4260l[l10] <= j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Gi.e.l(z11);
            }
            if ((536870912 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4271w = z10;
            this.f4270v = Math.max(this.f4270v, j6);
            int l11 = l(this.f4264p);
            this.f4262n[l11] = j6;
            this.f4259k[l11] = j10;
            this.f4260l[l11] = i11;
            this.f4261m[l11] = i10;
            this.f4263o[l11] = f6;
            this.f4258j[l11] = 0;
            if (((SparseArray) this.f4251c.f12351h0).size() != 0) {
                Object obj = this.f4251c.f12351h0;
            }
            C5065s c5065s = this.f4274z;
            c5065s.getClass();
            B2.q qVar = this.f4252d;
            if (qVar != null) {
                pVar = qVar.E(this.f4253e, c5065s);
            } else {
                pVar = B2.p.f1816b;
            }
            this.f4251c.a(this.f4265q + this.f4264p, new V(c5065s, pVar));
            int i13 = this.f4264p + 1;
            this.f4264p = i13;
            int i14 = this.f4257i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                L2.F[] fArr = new L2.F[i15];
                int i16 = this.f4266r;
                int i17 = i14 - i16;
                System.arraycopy(this.f4259k, i16, jArr2, 0, i17);
                System.arraycopy(this.f4262n, this.f4266r, jArr3, 0, i17);
                System.arraycopy(this.f4261m, this.f4266r, iArr, 0, i17);
                System.arraycopy(this.f4260l, this.f4266r, iArr2, 0, i17);
                System.arraycopy(this.f4263o, this.f4266r, fArr, 0, i17);
                System.arraycopy(this.f4258j, this.f4266r, jArr, 0, i17);
                int i18 = this.f4266r;
                System.arraycopy(this.f4259k, 0, jArr2, i17, i18);
                System.arraycopy(this.f4262n, 0, jArr3, i17, i18);
                System.arraycopy(this.f4261m, 0, iArr, i17, i18);
                System.arraycopy(this.f4260l, 0, iArr2, i17, i18);
                System.arraycopy(this.f4263o, 0, fArr, i17, i18);
                System.arraycopy(this.f4258j, 0, jArr, i17, i18);
                this.f4259k = jArr2;
                this.f4262n = jArr3;
                this.f4261m = iArr;
                this.f4260l = iArr2;
                this.f4263o = fArr;
                this.f4258j = jArr;
                this.f4266r = 0;
                this.f4257i = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final long g(int i10) {
        int i11;
        this.f4269u = Math.max(this.f4269u, k(i10));
        this.f4264p -= i10;
        int i12 = this.f4265q + i10;
        this.f4265q = i12;
        int i13 = this.f4266r + i10;
        this.f4266r = i13;
        int i14 = this.f4257i;
        if (i13 >= i14) {
            this.f4266r = i13 - i14;
        }
        int i15 = this.f4267s - i10;
        this.f4267s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f4267s = 0;
        }
        while (true) {
            C1025i c1025i = this.f4251c;
            if (i16 >= ((SparseArray) c1025i.f12351h0).size() - 1) {
                break;
            }
            int i17 = i16 + 1;
            if (i12 < ((SparseArray) c1025i.f12351h0).keyAt(i17)) {
                break;
            }
            ((AbstractC5535e) c1025i.f12352i0).accept(((SparseArray) c1025i.f12351h0).valueAt(i16));
            ((SparseArray) c1025i.f12351h0).removeAt(i16);
            int i18 = c1025i.f12350Z;
            if (i18 > 0) {
                c1025i.f12350Z = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f4264p == 0) {
            int i19 = this.f4266r;
            if (i19 == 0) {
                i19 = this.f4257i;
            }
            return this.f4259k[i19 - 1] + this.f4260l[i11];
        }
        return this.f4259k[this.f4266r];
    }

    public final void h() {
        long j6;
        T t10 = this.f4249a;
        synchronized (this) {
            int i10 = this.f4264p;
            if (i10 == 0) {
                j6 = -1;
            } else {
                j6 = g(i10);
            }
        }
        t10.a(j6);
    }

    public final int i(int i10, int i11, long j6, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f4262n[i10] > j6 ? 1 : (this.f4262n[i10] == j6 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f4261m[i10] & 1) != 0) {
                i12 = i13;
                if (i14 == 0) {
                    break;
                }
            }
            i10++;
            if (i10 == this.f4257i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long j() {
        return this.f4270v;
    }

    public final long k(int i10) {
        long j6 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int l10 = l(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j6 = Math.max(j6, this.f4262n[l10]);
            if ((this.f4261m[l10] & 1) != 0) {
                break;
            }
            l10--;
            if (l10 == -1) {
                l10 = this.f4257i - 1;
            }
        }
        return j6;
    }

    public final int l(int i10) {
        int i11 = this.f4266r + i10;
        int i12 = this.f4257i;
        if (i11 >= i12) {
            return i11 - i12;
        }
        return i11;
    }

    public final synchronized C5065s m() {
        C5065s c5065s;
        if (this.f4273y) {
            c5065s = null;
        } else {
            c5065s = this.f4274z;
        }
        return c5065s;
    }

    public final synchronized boolean n(boolean z10) {
        boolean z11;
        C5065s c5065s;
        int i10 = this.f4267s;
        boolean z12 = false;
        if (i10 != this.f4264p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (z10 || this.f4271w || ((c5065s = this.f4274z) != null && c5065s != this.f4255g)) {
                z12 = true;
            }
            return z12;
        } else if (((V) this.f4251c.f(this.f4265q + i10)).f4245a != this.f4255g) {
            return true;
        } else {
            return o(l(this.f4267s));
        }
    }

    public final boolean o(int i10) {
        B2.k kVar = this.f4256h;
        if (kVar != null && kVar.getState() != 4 && ((this.f4261m[i10] & 1073741824) != 0 || !this.f4256h.d())) {
            return false;
        }
        return true;
    }

    public final void p(C5065s c5065s, C3636c1 c3636c1) {
        boolean z10;
        C5063p c5063p;
        C5065s c5065s2;
        C5065s c5065s3 = this.f4255g;
        if (c5065s3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c5065s3 == null) {
            c5063p = null;
        } else {
            c5063p = c5065s3.f42322t0;
        }
        this.f4255g = c5065s;
        C5063p c5063p2 = c5065s.f42322t0;
        B2.q qVar = this.f4252d;
        if (qVar != null) {
            int M10 = qVar.M(c5065s);
            p2.r b10 = c5065s.b();
            b10.f42226G = M10;
            c5065s2 = b10.a();
        } else {
            c5065s2 = c5065s;
        }
        c3636c1.f34286h0 = c5065s2;
        c3636c1.f34285Z = this.f4256h;
        if (qVar == null) {
            return;
        }
        if (!z10 && AbstractC5530A.a(c5063p, c5063p2)) {
            return;
        }
        B2.k kVar = this.f4256h;
        B2.n nVar = this.f4253e;
        B2.k Q = qVar.Q(nVar, c5065s);
        this.f4256h = Q;
        c3636c1.f34285Z = Q;
        if (kVar != null) {
            kVar.c(nVar);
        }
    }

    public final void q(boolean z10) {
        boolean z11;
        T t10 = this.f4249a;
        S s10 = t10.f4238d;
        if (((I2.a) s10.f4233c) != null) {
            I2.d dVar = t10.f4235a;
            synchronized (dVar) {
                S s11 = s10;
                while (s11 != null) {
                    try {
                        I2.a[] aVarArr = dVar.f7967f;
                        int i10 = dVar.f7966e;
                        dVar.f7966e = i10 + 1;
                        I2.a aVar = (I2.a) s11.f4233c;
                        aVar.getClass();
                        aVarArr[i10] = aVar;
                        dVar.f7965d--;
                        Object obj = s11.f4234d;
                        if (((S) obj) != null && ((I2.a) ((S) obj).f4233c) != null) {
                            s11 = (S) obj;
                        }
                        s11 = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                dVar.notifyAll();
            }
            s10.f4233c = null;
            s10.f4234d = null;
        }
        S s12 = t10.f4238d;
        int i11 = t10.f4236b;
        if (((I2.a) s12.f4233c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Gi.e.n(z11);
        s12.f4231a = 0L;
        s12.f4232b = i11;
        S s13 = t10.f4238d;
        t10.f4239e = s13;
        t10.f4240f = s13;
        t10.f4241g = 0L;
        t10.f4235a.b();
        this.f4264p = 0;
        this.f4265q = 0;
        this.f4266r = 0;
        this.f4267s = 0;
        this.f4272x = true;
        this.f4268t = Long.MIN_VALUE;
        this.f4269u = Long.MIN_VALUE;
        this.f4270v = Long.MIN_VALUE;
        this.f4271w = false;
        C1025i c1025i = this.f4251c;
        for (int i12 = 0; i12 < ((SparseArray) c1025i.f12351h0).size(); i12++) {
            ((AbstractC5535e) c1025i.f12352i0).accept(((SparseArray) c1025i.f12351h0).valueAt(i12));
        }
        c1025i.f12350Z = -1;
        ((SparseArray) c1025i.f12351h0).clear();
        if (z10) {
            this.f4274z = null;
            this.f4273y = true;
            this.f4247A = true;
        }
    }

    public final synchronized void r() {
        this.f4267s = 0;
        T t10 = this.f4249a;
        t10.f4239e = t10.f4238d;
    }

    public final int s(AbstractC5060m abstractC5060m, int i10, boolean z10) {
        T t10 = this.f4249a;
        int b10 = t10.b(i10);
        S s10 = t10.f4240f;
        int read = abstractC5060m.read(((I2.a) s10.f4233c).f7957a, s10.a(t10.f4241g), b10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j6 = t10.f4241g + read;
        t10.f4241g = j6;
        S s11 = t10.f4240f;
        if (j6 == s11.f4232b) {
            t10.f4240f = (S) s11.f4234d;
            return read;
        }
        return read;
    }

    public final synchronized boolean t(long j6, boolean z10) {
        boolean z11;
        int i10;
        r();
        int l10 = l(this.f4267s);
        int i11 = this.f4267s;
        int i12 = this.f4264p;
        if (i11 != i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && j6 >= this.f4262n[l10] && (j6 <= this.f4270v || z10)) {
            if (this.f4247A) {
                int i13 = i12 - i11;
                i10 = 0;
                while (true) {
                    if (i10 < i13) {
                        if (this.f4262n[l10] >= j6) {
                            break;
                        }
                        l10++;
                        if (l10 == this.f4257i) {
                            l10 = 0;
                        }
                        i10++;
                    } else {
                        if (!z10) {
                            i13 = -1;
                        }
                        i10 = i13;
                    }
                }
            } else {
                i10 = i(l10, i12 - i11, j6, true);
            }
            if (i10 == -1) {
                return false;
            }
            this.f4268t = j6;
            this.f4267s += i10;
            return true;
        }
        return false;
    }

    public final synchronized void u(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f4267s + i10 <= this.f4264p) {
                    z10 = true;
                    Gi.e.l(z10);
                    this.f4267s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        Gi.e.l(z10);
        this.f4267s += i10;
    }
}
