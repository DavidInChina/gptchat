package P2;

import Gi.e;
import I2.i;
import K4.J;
import L2.B;
import L2.G;
import L2.j;
import L2.q;
import L2.r;
import L2.s;
import L2.v;
import N.C1025i;
import h.C3276b;
import java.util.Arrays;
import p2.M;
import p2.O;
import r9.y;
import s2.AbstractC5530A;
import s2.t;
import s2.u;
import x8.N;

/* loaded from: classes.dex */
public final class b implements q {

    /* renamed from: e  reason: collision with root package name */
    public s f13791e;

    /* renamed from: f  reason: collision with root package name */
    public G f13792f;

    /* renamed from: h  reason: collision with root package name */
    public M f13794h;

    /* renamed from: i  reason: collision with root package name */
    public v f13795i;

    /* renamed from: j  reason: collision with root package name */
    public int f13796j;

    /* renamed from: k  reason: collision with root package name */
    public int f13797k;

    /* renamed from: l  reason: collision with root package name */
    public a f13798l;

    /* renamed from: m  reason: collision with root package name */
    public int f13799m;

    /* renamed from: n  reason: collision with root package name */
    public long f13800n;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13787a = new byte[42];

    /* renamed from: b  reason: collision with root package name */
    public final u f13788b = new u(0, new byte[32768]);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13789c = false;

    /* renamed from: d  reason: collision with root package name */
    public final i f13790d = new i(0);

    /* renamed from: g  reason: collision with root package name */
    public int f13793g = 0;

    /* JADX WARN: Type inference failed for: r3v29, types: [P2.a, L2.j] */
    @Override // L2.q
    public final int a(r rVar, i iVar) {
        A9.a aVar;
        v vVar;
        B b10;
        long j6;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        int i10 = this.f13793g;
        M m10 = null;
        int i11 = 0;
        boolean z12 = true;
        if (i10 != 0) {
            byte[] bArr = this.f13787a;
            if (i10 != 1) {
                int i12 = 3;
                if (i10 != 2) {
                    int i13 = 7;
                    if (i10 != 3) {
                        long j13 = 0;
                        if (i10 != 4) {
                            if (i10 == 5) {
                                this.f13792f.getClass();
                                this.f13795i.getClass();
                                a aVar2 = this.f13798l;
                                if (aVar2 != null && aVar2.f10608c != null) {
                                    return aVar2.a(rVar, iVar);
                                }
                                if (this.f13800n == -1) {
                                    v vVar2 = this.f13795i;
                                    rVar.k();
                                    rVar.e(1);
                                    byte[] bArr2 = new byte[1];
                                    rVar.n(bArr2, 0, 1);
                                    if ((bArr2[0] & 1) == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    rVar.e(2);
                                    if (!z11) {
                                        i13 = 6;
                                    }
                                    u uVar = new u(i13);
                                    byte[] bArr3 = uVar.f45193a;
                                    int i14 = 0;
                                    while (i14 < i13) {
                                        int i15 = rVar.i(bArr3, i14, i13 - i14);
                                        if (i15 == -1) {
                                            break;
                                        }
                                        i14 += i15;
                                    }
                                    uVar.E(i14);
                                    rVar.k();
                                    try {
                                        long A10 = uVar.A();
                                        if (!z11) {
                                            A10 *= vVar2.f10643b;
                                        }
                                        j13 = A10;
                                    } catch (NumberFormatException unused) {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        this.f13800n = j13;
                                        return 0;
                                    }
                                    throw O.a(null, null);
                                }
                                u uVar2 = this.f13788b;
                                int i16 = uVar2.f45195c;
                                if (i16 < 32768) {
                                    int read = rVar.read(uVar2.f45193a, i16, 32768 - i16);
                                    if (read != -1) {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                        uVar2.E(i16 + read);
                                    } else if (uVar2.a() == 0) {
                                        v vVar3 = this.f13795i;
                                        int i17 = AbstractC5530A.f45131a;
                                        this.f13792f.e((this.f13800n * 1000000) / vVar3.f10646e, 1, this.f13799m, 0, null);
                                        return -1;
                                    }
                                } else {
                                    z12 = false;
                                }
                                int i18 = uVar2.f45194b;
                                int i19 = this.f13799m;
                                int i20 = this.f13796j;
                                if (i19 < i20) {
                                    uVar2.G(Math.min(i20 - i19, uVar2.a()));
                                }
                                this.f13795i.getClass();
                                int i21 = uVar2.f45194b;
                                while (true) {
                                    int i22 = uVar2.f45195c - 16;
                                    i iVar2 = this.f13790d;
                                    if (i21 <= i22) {
                                        uVar2.F(i21);
                                        if (e.j(uVar2, this.f13795i, this.f13797k, iVar2)) {
                                            uVar2.F(i21);
                                            j12 = iVar2.f7995b;
                                            break;
                                        }
                                        i21++;
                                    } else {
                                        if (z12) {
                                            while (true) {
                                                int i23 = uVar2.f45195c;
                                                if (i21 <= i23 - this.f13796j) {
                                                    uVar2.F(i21);
                                                    try {
                                                        z10 = e.j(uVar2, this.f13795i, this.f13797k, iVar2);
                                                    } catch (IndexOutOfBoundsException unused2) {
                                                        z10 = false;
                                                    }
                                                    if (uVar2.f45194b <= uVar2.f45195c && z10) {
                                                        uVar2.F(i21);
                                                        j12 = iVar2.f7995b;
                                                        break;
                                                    }
                                                    i21++;
                                                } else {
                                                    uVar2.F(i23);
                                                    break;
                                                }
                                            }
                                        } else {
                                            uVar2.F(i21);
                                        }
                                        j12 = -1;
                                    }
                                }
                                int i24 = uVar2.f45194b - i18;
                                uVar2.F(i18);
                                this.f13792f.a(i24, uVar2);
                                int i25 = this.f13799m + i24;
                                this.f13799m = i25;
                                if (j12 != -1) {
                                    v vVar4 = this.f13795i;
                                    int i26 = AbstractC5530A.f45131a;
                                    this.f13792f.e((this.f13800n * 1000000) / vVar4.f10646e, 1, i25, 0, null);
                                    this.f13799m = 0;
                                    this.f13800n = j12;
                                }
                                if (uVar2.a() >= 16) {
                                    return 0;
                                }
                                int a5 = uVar2.a();
                                byte[] bArr4 = uVar2.f45193a;
                                System.arraycopy(bArr4, uVar2.f45194b, bArr4, 0, a5);
                                uVar2.F(0);
                                uVar2.E(a5);
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        rVar.k();
                        u uVar3 = new u(2);
                        rVar.n(uVar3.f45193a, 0, 2);
                        int z13 = uVar3.z();
                        if ((z13 >> 2) == 16382) {
                            rVar.k();
                            this.f13797k = z13;
                            s sVar = this.f13791e;
                            int i27 = AbstractC5530A.f45131a;
                            long o10 = rVar.o();
                            long h10 = rVar.h();
                            this.f13795i.getClass();
                            v vVar5 = this.f13795i;
                            if (vVar5.f10652k != null) {
                                b10 = new L2.u(vVar5, o10, 0);
                            } else if (h10 != -1 && vVar5.f10651j > 0) {
                                int i28 = this.f13797k;
                                C3276b c3276b = new C3276b(15, vVar5);
                                C1025i c1025i = new C1025i(vVar5, i28);
                                long b11 = vVar5.b();
                                int i29 = vVar5.f10644c;
                                int i30 = vVar5.f10645d;
                                if (i30 > 0) {
                                    j10 = (i30 + i29) / 2;
                                    j11 = 1;
                                } else {
                                    int i31 = vVar5.f10643b;
                                    int i32 = vVar5.f10642a;
                                    if (i32 == i31 && i32 > 0) {
                                        j6 = i32;
                                    } else {
                                        j6 = 4096;
                                    }
                                    j10 = ((j6 * vVar5.f10648g) * vVar5.f10649h) / 8;
                                    j11 = 64;
                                }
                                ?? jVar = new j(c3276b, c1025i, b11, vVar5.f10651j, o10, h10, j10 + j11, Math.max(6, i29));
                                this.f13798l = jVar;
                                b10 = jVar.f10606a;
                            } else {
                                b10 = new L2.u(vVar5.b());
                            }
                            sVar.b(b10);
                            this.f13793g = 5;
                            return 0;
                        }
                        rVar.k();
                        throw O.a("First frame does not start with sync code.", null);
                    }
                    v vVar6 = this.f13795i;
                    while (true) {
                        rVar.k();
                        t tVar = new t(new byte[4], i11);
                        rVar.n(tVar.f45186b, i11, 4);
                        boolean h11 = tVar.h();
                        int i33 = tVar.i(i13);
                        int i34 = tVar.i(24) + 4;
                        if (i33 == 0) {
                            byte[] bArr5 = new byte[38];
                            rVar.readFully(bArr5, i11, 38);
                            vVar6 = new v(4, bArr5);
                        } else if (vVar6 != null) {
                            if (i33 == i12) {
                                u uVar4 = new u(i34);
                                rVar.readFully(uVar4.f45193a, i11, i34);
                                vVar = new v(vVar6.f10642a, vVar6.f10643b, vVar6.f10644c, vVar6.f10645d, vVar6.f10646e, vVar6.f10648g, vVar6.f10649h, vVar6.f10651j, J.R(uVar4), vVar6.f10653l);
                            } else {
                                M m11 = vVar6.f10653l;
                                if (i33 == 4) {
                                    u uVar5 = new u(i34);
                                    rVar.readFully(uVar5.f45193a, 0, i34);
                                    uVar5.G(4);
                                    M P02 = y.P0(Arrays.asList((String[]) y.V0(uVar5, false, false).f12352i0));
                                    if (m11 != null) {
                                        P02 = m11.c(P02);
                                    }
                                    vVar = new v(vVar6.f10642a, vVar6.f10643b, vVar6.f10644c, vVar6.f10645d, vVar6.f10646e, vVar6.f10648g, vVar6.f10649h, vVar6.f10651j, vVar6.f10652k, P02);
                                } else if (i33 == 6) {
                                    u uVar6 = new u(i34);
                                    rVar.readFully(uVar6.f45193a, 0, i34);
                                    uVar6.G(4);
                                    M m12 = new M(N.u0(W2.a.a(uVar6)));
                                    if (m11 != null) {
                                        m12 = m11.c(m12);
                                    }
                                    vVar = new v(vVar6.f10642a, vVar6.f10643b, vVar6.f10644c, vVar6.f10645d, vVar6.f10646e, vVar6.f10648g, vVar6.f10649h, vVar6.f10651j, vVar6.f10652k, m12);
                                } else {
                                    rVar.l(i34);
                                }
                            }
                            vVar6 = vVar;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i35 = AbstractC5530A.f45131a;
                        this.f13795i = vVar6;
                        if (!h11) {
                            i11 = 0;
                            i12 = 3;
                            i13 = 7;
                        } else {
                            this.f13796j = Math.max(vVar6.f10644c, 6);
                            this.f13792f.b(this.f13795i.c(bArr, this.f13794h));
                            this.f13793g = 4;
                            return 0;
                        }
                    }
                } else {
                    u uVar7 = new u(4);
                    rVar.readFully(uVar7.f45193a, 0, 4);
                    if (uVar7.v() == 1716281667) {
                        this.f13793g = 3;
                        return 0;
                    }
                    throw O.a("Failed to read FLAC stream marker.", null);
                }
            } else {
                rVar.n(bArr, 0, bArr.length);
                rVar.k();
                this.f13793g = 2;
                return 0;
            }
        } else {
            boolean z14 = !this.f13789c;
            rVar.k();
            long d10 = rVar.d();
            if (z14) {
                aVar = null;
            } else {
                aVar = Y2.i.f22080g;
            }
            M a10 = new L2.y(0).a(rVar, aVar);
            if (a10 != null && a10.f41915Y.length != 0) {
                m10 = a10;
            }
            rVar.l((int) (rVar.d() - d10));
            this.f13794h = m10;
            this.f13793g = 1;
            return 0;
        }
    }

    @Override // L2.q
    public final void d(s sVar) {
        this.f13791e = sVar;
        this.f13792f = sVar.f(0, 1);
        sVar.d();
    }

    @Override // L2.q
    public final boolean g(r rVar) {
        M a5 = new L2.y(0).a(rVar, Y2.i.f22080g);
        if (a5 != null) {
            int length = a5.f41915Y.length;
        }
        u uVar = new u(4);
        rVar.n(uVar.f45193a, 0, 4);
        if (uVar.v() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        long j11 = 0;
        if (j6 == 0) {
            this.f13793g = 0;
        } else {
            a aVar = this.f13798l;
            if (aVar != null) {
                aVar.c(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.f13800n = j11;
        this.f13799m = 0;
        this.f13788b.C(0);
    }

    @Override // L2.q
    public final q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
