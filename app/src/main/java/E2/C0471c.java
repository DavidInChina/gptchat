package E2;

import p2.C5065s;
import s2.AbstractC5530A;
import y2.C6513P;
import y2.l0;

/* renamed from: E2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471c implements AbstractC0490w, AbstractC0489v {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC0490w f4294Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC0489v f4295Z;

    /* renamed from: h0  reason: collision with root package name */
    public C0470b[] f4296h0 = new C0470b[0];

    /* renamed from: i0  reason: collision with root package name */
    public long f4297i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f4298j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f4299k0;

    /* renamed from: l0  reason: collision with root package name */
    public C0473e f4300l0;

    public C0471c(AbstractC0490w abstractC0490w, boolean z10, long j6, long j10) {
        long j11;
        this.f4294Y = abstractC0490w;
        if (z10) {
            j11 = j6;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f4297i0 = j11;
        this.f4298j0 = j6;
        this.f4299k0 = j10;
    }

    @Override // E2.Z
    public final void C(long j6) {
        this.f4294Y.C(j6);
    }

    @Override // E2.AbstractC0489v
    public final void a(AbstractC0490w abstractC0490w) {
        if (this.f4300l0 != null) {
            return;
        }
        AbstractC0489v abstractC0489v = this.f4295Z;
        abstractC0489v.getClass();
        abstractC0489v.a(this);
    }

    @Override // E2.AbstractC0489v
    public final void b(Z z10) {
        AbstractC0490w abstractC0490w = (AbstractC0490w) z10;
        AbstractC0489v abstractC0489v = this.f4295Z;
        abstractC0489v.getClass();
        abstractC0489v.b(this);
    }

    @Override // E2.Z
    public final long c() {
        long c10 = this.f4294Y.c();
        if (c10 != Long.MIN_VALUE) {
            long j6 = this.f4299k0;
            if (j6 == Long.MIN_VALUE || c10 < j6) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean d() {
        if (this.f4297i0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // E2.AbstractC0490w
    public final void e() {
        C0473e c0473e = this.f4300l0;
        if (c0473e == null) {
            this.f4294Y.e();
            return;
        }
        throw c0473e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 > r6) goto L17;
     */
    @Override // E2.AbstractC0490w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j(long j6) {
        C0470b[] c0470bArr;
        this.f4297i0 = -9223372036854775807L;
        boolean z10 = false;
        for (C0470b c0470b : this.f4296h0) {
            if (c0470b != null) {
                c0470b.f4286Z = false;
            }
        }
        long j10 = this.f4294Y.j(j6);
        if (j10 != j6) {
            if (j10 >= this.f4298j0) {
                long j11 = this.f4299k0;
                if (j11 != Long.MIN_VALUE) {
                }
            }
            Gi.e.n(z10);
            return j10;
        }
        z10 = true;
        Gi.e.n(z10);
        return j10;
    }

    @Override // E2.AbstractC0490w
    public final void k(long j6) {
        this.f4294Y.k(j6);
    }

    @Override // E2.Z
    public final boolean l() {
        return this.f4294Y.l();
    }

    @Override // E2.Z
    public final boolean m(C6513P c6513p) {
        return this.f4294Y.m(c6513p);
    }

    @Override // E2.AbstractC0490w
    public final long p(long j6, l0 l0Var) {
        long j10;
        long j11 = this.f4298j0;
        if (j6 == j11) {
            return j11;
        }
        long j12 = AbstractC5530A.j(l0Var.f50652a, 0L, j6 - j11);
        long j13 = this.f4299k0;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j6;
        }
        long j14 = AbstractC5530A.j(l0Var.f50653b, 0L, j10);
        if (j12 != l0Var.f50652a || j14 != l0Var.f50653b) {
            l0Var = new l0(j12, j14);
        }
        return this.f4294Y.p(j6, l0Var);
    }

    @Override // E2.AbstractC0490w
    public final void q(AbstractC0489v abstractC0489v, long j6) {
        this.f4295Z = abstractC0489v;
        this.f4294Y.q(this, j6);
    }

    @Override // E2.AbstractC0490w
    public final long r() {
        boolean z10;
        if (d()) {
            long j6 = this.f4297i0;
            this.f4297i0 = -9223372036854775807L;
            long r10 = r();
            if (r10 != -9223372036854775807L) {
                return r10;
            }
            return j6;
        }
        long r11 = this.f4294Y.r();
        if (r11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = false;
        if (r11 >= this.f4298j0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        long j10 = this.f4299k0;
        if (j10 == Long.MIN_VALUE || r11 <= j10) {
            z11 = true;
        }
        Gi.e.n(z11);
        return r11;
    }

    @Override // E2.AbstractC0490w
    public final i0 u() {
        return this.f4294Y.u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r1 > r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    @Override // E2.AbstractC0490w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long v(H2.s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j6) {
        long j10;
        boolean z10;
        this.f4296h0 = new C0470b[yArr.length];
        Y[] yArr2 = new Y[yArr.length];
        int i10 = 0;
        while (true) {
            Y y10 = null;
            if (i10 >= yArr.length) {
                break;
            }
            C0470b[] c0470bArr = this.f4296h0;
            C0470b c0470b = (C0470b) yArr[i10];
            c0470bArr[i10] = c0470b;
            if (c0470b != null) {
                y10 = c0470b.f4285Y;
            }
            yArr2[i10] = y10;
            i10++;
        }
        long v10 = this.f4294Y.v(sVarArr, zArr, yArr2, zArr2, j6);
        if (d()) {
            long j11 = this.f4298j0;
            if (j6 == j11 && j11 != 0) {
                for (H2.s sVar : sVarArr) {
                    if (sVar != null) {
                        C5065s g10 = sVar.g();
                        if (!p2.N.a(g10.f42319q0, g10.f42316n0)) {
                            j10 = v10;
                            break;
                        }
                    }
                }
            }
        }
        j10 = -9223372036854775807L;
        this.f4297i0 = j10;
        if (v10 != j6) {
            if (v10 >= this.f4298j0) {
                long j12 = this.f4299k0;
                if (j12 != Long.MIN_VALUE) {
                }
            }
            z10 = false;
            Gi.e.n(z10);
            for (int i11 = 0; i11 < yArr.length; i11++) {
                Y y11 = yArr2[i11];
                if (y11 == null) {
                    this.f4296h0[i11] = null;
                } else {
                    C0470b[] c0470bArr2 = this.f4296h0;
                    C0470b c0470b2 = c0470bArr2[i11];
                    if (c0470b2 == null || c0470b2.f4285Y != y11) {
                        c0470bArr2[i11] = new C0470b(this, y11);
                    }
                }
                yArr[i11] = this.f4296h0[i11];
            }
            return v10;
        }
        z10 = true;
        Gi.e.n(z10);
        while (i11 < yArr.length) {
        }
        return v10;
    }

    @Override // E2.Z
    public final long x() {
        long x10 = this.f4294Y.x();
        if (x10 != Long.MIN_VALUE) {
            long j6 = this.f4299k0;
            if (j6 == Long.MIN_VALUE || x10 < j6) {
                return x10;
            }
        }
        return Long.MIN_VALUE;
    }
}
