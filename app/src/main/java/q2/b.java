package Q2;

import B1.m;
import Gi.e;
import I2.i;
import L2.p;
import L2.q;
import L2.r;
import L2.s;
import L2.z;
import s2.u;

/* loaded from: classes.dex */
public final class b implements q {

    /* renamed from: e  reason: collision with root package name */
    public final c f14381e;

    /* renamed from: f  reason: collision with root package name */
    public s f14382f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14384h;

    /* renamed from: i  reason: collision with root package name */
    public long f14385i;

    /* renamed from: j  reason: collision with root package name */
    public int f14386j;

    /* renamed from: k  reason: collision with root package name */
    public int f14387k;

    /* renamed from: l  reason: collision with root package name */
    public int f14388l;

    /* renamed from: m  reason: collision with root package name */
    public long f14389m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14390n;

    /* renamed from: o  reason: collision with root package name */
    public a f14391o;

    /* renamed from: p  reason: collision with root package name */
    public d f14392p;

    /* renamed from: a  reason: collision with root package name */
    public final u f14377a = new u(4);

    /* renamed from: b  reason: collision with root package name */
    public final u f14378b = new u(9);

    /* renamed from: c  reason: collision with root package name */
    public final u f14379c = new u(11);

    /* renamed from: d  reason: collision with root package name */
    public final u f14380d = new u();

    /* renamed from: g  reason: collision with root package name */
    public int f14383g = 1;

    /* JADX WARN: Type inference failed for: r0v4, types: [B1.m, Q2.c] */
    public b() {
        ?? mVar = new m(new p());
        mVar.f14393b = -9223372036854775807L;
        mVar.f14394c = new long[0];
        mVar.f14395d = new long[0];
        this.f14381e = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v7, types: [B1.m, Q2.a] */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(r rVar, i iVar) {
        long j6;
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        e.o(this.f14382f);
        while (true) {
            int i10 = this.f14383g;
            boolean z13 = false;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            boolean z14 = this.f14384h;
                            c cVar = this.f14381e;
                            if (z14) {
                                j6 = this.f14385i + this.f14389m;
                            } else if (cVar.f14393b == -9223372036854775807L) {
                                j6 = 0;
                            } else {
                                j6 = this.f14389m;
                            }
                            int i11 = this.f14387k;
                            if (i11 == 8 && this.f14391o != null) {
                                if (!this.f14390n) {
                                    this.f14382f.b(new L2.u(-9223372036854775807L));
                                    this.f14390n = true;
                                }
                                a aVar = this.f14391o;
                                u c10 = c(rVar);
                                aVar.c(c10);
                                z11 = aVar.d(j6, c10);
                            } else {
                                if (i11 == 9 && this.f14392p != null) {
                                    if (!this.f14390n) {
                                        this.f14382f.b(new L2.u(-9223372036854775807L));
                                        this.f14390n = true;
                                    }
                                    d dVar = this.f14392p;
                                    u c11 = c(rVar);
                                    if (dVar.c(c11) && dVar.d(j6, c11)) {
                                        z11 = true;
                                    }
                                } else if (i11 == 18 && !this.f14390n) {
                                    u c12 = c(rVar);
                                    cVar.getClass();
                                    cVar.c(j6, c12);
                                    long j11 = cVar.f14393b;
                                    if (j11 != -9223372036854775807L) {
                                        this.f14382f.b(new z(j11, cVar.f14395d, cVar.f14394c));
                                        this.f14390n = true;
                                    }
                                } else {
                                    rVar.l(this.f14388l);
                                    z11 = false;
                                    z10 = false;
                                    if (!this.f14384h && z11) {
                                        this.f14384h = true;
                                        if (cVar.f14393b != -9223372036854775807L) {
                                            j10 = -this.f14389m;
                                        } else {
                                            j10 = 0;
                                        }
                                        this.f14385i = j10;
                                    }
                                    this.f14386j = 4;
                                    this.f14383g = 2;
                                    if (!z10) {
                                        return 0;
                                    }
                                }
                                z11 = false;
                            }
                            z10 = true;
                            if (!this.f14384h) {
                                this.f14384h = true;
                                if (cVar.f14393b != -9223372036854775807L) {
                                }
                                this.f14385i = j10;
                            }
                            this.f14386j = 4;
                            this.f14383g = 2;
                            if (!z10) {
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        u uVar = this.f14379c;
                        if (!rVar.b(uVar.f45193a, 0, 11, true)) {
                            return -1;
                        }
                        uVar.F(0);
                        this.f14387k = uVar.u();
                        this.f14388l = uVar.w();
                        this.f14389m = uVar.w();
                        this.f14389m = ((uVar.u() << 24) | this.f14389m) * 1000;
                        uVar.G(3);
                        this.f14383g = 4;
                    }
                } else {
                    rVar.l(this.f14386j);
                    this.f14386j = 0;
                    this.f14383g = 3;
                }
            } else {
                u uVar2 = this.f14378b;
                if (!rVar.b(uVar2.f45193a, 0, 9, true)) {
                    return -1;
                }
                uVar2.F(0);
                uVar2.G(4);
                int u10 = uVar2.u();
                if ((u10 & 4) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((u10 & 1) != 0) {
                    z13 = true;
                }
                if (z12 && this.f14391o == null) {
                    this.f14391o = new m(this.f14382f.f(8, 1));
                }
                if (z13 && this.f14392p == null) {
                    this.f14392p = new d(this.f14382f.f(9, 2));
                }
                this.f14382f.d();
                this.f14386j = uVar2.g() - 5;
                this.f14383g = 2;
            }
        }
    }

    public final u c(r rVar) {
        int i10 = this.f14388l;
        u uVar = this.f14380d;
        byte[] bArr = uVar.f45193a;
        if (i10 > bArr.length) {
            uVar.D(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            uVar.F(0);
        }
        uVar.E(this.f14388l);
        rVar.readFully(uVar.f45193a, 0, this.f14388l);
        return uVar;
    }

    @Override // L2.q
    public final void d(s sVar) {
        this.f14382f = sVar;
    }

    @Override // L2.q
    public final boolean g(r rVar) {
        u uVar = this.f14377a;
        rVar.n(uVar.f45193a, 0, 3);
        uVar.F(0);
        if (uVar.w() != 4607062) {
            return false;
        }
        rVar.n(uVar.f45193a, 0, 2);
        uVar.F(0);
        if ((uVar.z() & 250) != 0) {
            return false;
        }
        rVar.n(uVar.f45193a, 0, 4);
        uVar.F(0);
        int g10 = uVar.g();
        rVar.k();
        rVar.e(g10);
        rVar.n(uVar.f45193a, 0, 4);
        uVar.F(0);
        if (uVar.g() != 0) {
            return false;
        }
        return true;
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        if (j6 == 0) {
            this.f14383g = 1;
            this.f14384h = false;
        } else {
            this.f14383g = 3;
        }
        this.f14386j = 0;
    }

    @Override // L2.q
    public final q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
