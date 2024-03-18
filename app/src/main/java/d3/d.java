package d3;

import I2.i;
import L2.AbstractC0881b;
import L2.C0882c;
import L2.G;
import L2.p;
import L2.q;
import L2.r;
import L2.s;
import L2.x;
import L2.y;
import Y2.l;
import Y2.o;
import java.io.EOFException;
import java.math.RoundingMode;
import p2.C5065s;
import p2.L;
import p2.M;
import p2.O;
import s2.AbstractC5530A;
import s2.u;

/* loaded from: classes2.dex */
public final class d implements q {

    /* renamed from: t  reason: collision with root package name */
    public static final A9.a f27959t = new A9.a(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f27960a;

    /* renamed from: b  reason: collision with root package name */
    public final u f27961b;

    /* renamed from: c  reason: collision with root package name */
    public final C0882c f27962c;

    /* renamed from: d  reason: collision with root package name */
    public final x f27963d;

    /* renamed from: e  reason: collision with root package name */
    public final y f27964e;

    /* renamed from: f  reason: collision with root package name */
    public final p f27965f;

    /* renamed from: g  reason: collision with root package name */
    public s f27966g;

    /* renamed from: h  reason: collision with root package name */
    public G f27967h;

    /* renamed from: i  reason: collision with root package name */
    public G f27968i;

    /* renamed from: j  reason: collision with root package name */
    public int f27969j;

    /* renamed from: k  reason: collision with root package name */
    public M f27970k;

    /* renamed from: l  reason: collision with root package name */
    public long f27971l;

    /* renamed from: m  reason: collision with root package name */
    public long f27972m;

    /* renamed from: n  reason: collision with root package name */
    public long f27973n;

    /* renamed from: o  reason: collision with root package name */
    public int f27974o;

    /* renamed from: p  reason: collision with root package name */
    public f f27975p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f27976q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f27977r;

    /* renamed from: s  reason: collision with root package name */
    public long f27978s;

    /* JADX WARN: Type inference failed for: r3v3, types: [L2.c, java.lang.Object] */
    public d(int i10) {
        this.f27960a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f27961b = new u(10);
        this.f27962c = new Object();
        this.f27963d = new x();
        this.f27971l = -9223372036854775807L;
        this.f27964e = new y(0);
        p pVar = new p();
        this.f27965f = pVar;
        this.f27968i = pVar;
    }

    public static long e(M m10) {
        if (m10 != null) {
            int g10 = m10.g();
            for (int i10 = 0; i10 < g10; i10++) {
                L f6 = m10.f(i10);
                if (f6 instanceof o) {
                    o oVar = (o) f6;
                    if (oVar.f22082Y.equals("TLEN")) {
                        return AbstractC5530A.C(Long.parseLong((String) oVar.f22095h0.get(0)));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r9 != 1231971951) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0258  */
    /* JADX WARN: Type inference failed for: r0v52, types: [L2.u] */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(r rVar, i iVar) {
        d dVar;
        C0882c c0882c;
        int i10;
        int i11;
        u uVar;
        r rVar2;
        int i12;
        int i13;
        int i14;
        u uVar2;
        f fVar;
        x xVar;
        C0882c c0882c2;
        M m10;
        C0882c c0882c3;
        x xVar2;
        c cVar;
        boolean z10;
        int i15;
        f fVar2;
        M m11;
        boolean z11;
        long e10;
        L[] lArr;
        l lVar;
        int g10;
        int i16;
        u uVar3;
        int x10;
        f hVar;
        x xVar3;
        int i17;
        int i18;
        long[] jArr;
        Gi.e.o(this.f27967h);
        int i19 = AbstractC5530A.f45131a;
        int i20 = this.f27969j;
        C0882c c0882c4 = this.f27962c;
        if (i20 == 0) {
            try {
                i(rVar, false);
            } catch (EOFException unused) {
                dVar = this;
                c0882c = c0882c4;
                i10 = -1;
                i11 = -1;
            }
        }
        f fVar3 = this.f27975p;
        u uVar4 = this.f27961b;
        if (fVar3 == null) {
            u uVar5 = new u(c0882c4.f10571c);
            rVar.n(uVar5.f45193a, 0, c0882c4.f10571c);
            if ((c0882c4.f10569a & 1) != 0) {
                if (c0882c4.f10573e != 1) {
                    i13 = 36;
                    if (uVar5.f45195c >= i13 + 4) {
                        uVar5.F(i13);
                        i14 = uVar5.g();
                        if (i14 != 1483304551) {
                        }
                        x xVar4 = this.f27963d;
                        long j6 = -1;
                        if (i14 != 1483304551 || i14 == 1231971951) {
                            rVar2 = rVar;
                            c0882c2 = c0882c4;
                            long h10 = rVar.h();
                            long o10 = rVar.o();
                            int i21 = c0882c2.f10575g;
                            int i22 = c0882c2.f10572d;
                            g10 = uVar5.g();
                            if ((g10 & 1) == 1 || (x10 = uVar5.x()) == 0) {
                                uVar3 = uVar4;
                                i16 = i13;
                                fVar = null;
                            } else {
                                uVar3 = uVar4;
                                i16 = i13;
                                long I10 = AbstractC5530A.I(x10, i21 * 1000000, i22, RoundingMode.FLOOR);
                                if ((g10 & 6) != 6) {
                                    hVar = new h(o10, c0882c2.f10571c, I10, -1L, null);
                                } else {
                                    long v10 = uVar5.v();
                                    long[] jArr2 = new long[100];
                                    for (int i23 = 0; i23 < 100; i23++) {
                                        jArr2[i23] = uVar5.u();
                                    }
                                    if (h10 != -1) {
                                        long j10 = o10 + v10;
                                        if (h10 != j10) {
                                            s2.p.g("XingSeeker", "XING data size mismatch: " + h10 + ", " + j10);
                                        }
                                    }
                                    hVar = new h(o10, c0882c2.f10571c, I10, v10, jArr2);
                                }
                                fVar = hVar;
                            }
                            if (fVar == null) {
                                xVar = xVar4;
                                if (xVar.f10656a != -1 && xVar.f10657b != -1) {
                                    uVar2 = uVar3;
                                } else {
                                    rVar.k();
                                    rVar2.e(i16 + 141);
                                    uVar2 = uVar3;
                                    rVar2.n(uVar2.f45193a, 0, 3);
                                    uVar2.F(0);
                                    int w10 = uVar2.w();
                                    int i24 = w10 >> 12;
                                    int i25 = w10 & 4095;
                                    if (i24 > 0 || i25 > 0) {
                                        xVar.f10656a = i24;
                                        xVar.f10657b = i25;
                                    }
                                }
                            } else {
                                uVar2 = uVar3;
                                xVar = xVar4;
                            }
                            rVar2.l(c0882c2.f10571c);
                            if (fVar == null && !fVar.e() && i14 == 1231971951) {
                                dVar = this;
                                fVar = dVar.c(rVar2, false);
                            } else {
                                dVar = this;
                            }
                        } else if (i14 == 1447187017) {
                            long h11 = rVar.h();
                            long o11 = rVar.o();
                            uVar5.G(10);
                            int g11 = uVar5.g();
                            if (g11 <= 0) {
                                c0882c2 = c0882c4;
                                xVar3 = xVar4;
                            } else {
                                int i26 = c0882c4.f10572d;
                                long j11 = g11;
                                if (i26 >= 32000) {
                                    i17 = 1152;
                                } else {
                                    i17 = 576;
                                }
                                long I11 = AbstractC5530A.I(j11, i17 * 1000000, i26, RoundingMode.FLOOR);
                                int z12 = uVar5.z();
                                int z13 = uVar5.z();
                                int z14 = uVar5.z();
                                uVar5.G(2);
                                C0882c c0882c5 = c0882c4;
                                long j12 = o11 + c0882c5.f10571c;
                                long[] jArr3 = new long[z12];
                                long[] jArr4 = new long[z12];
                                long j13 = o11;
                                int i27 = 0;
                                while (i27 < z12) {
                                    C0882c c0882c6 = c0882c5;
                                    xVar3 = xVar4;
                                    long j14 = h11;
                                    jArr3[i27] = (i27 * I11) / z12;
                                    jArr4[i27] = Math.max(j13, j12);
                                    if (z14 != 1) {
                                        if (z14 != 2) {
                                            if (z14 != 3) {
                                                jArr = jArr3;
                                                if (z14 != 4) {
                                                    c0882c2 = c0882c6;
                                                } else {
                                                    i18 = uVar5.x();
                                                }
                                            } else {
                                                jArr = jArr3;
                                                i18 = uVar5.w();
                                            }
                                        } else {
                                            jArr = jArr3;
                                            i18 = uVar5.z();
                                        }
                                    } else {
                                        jArr = jArr3;
                                        i18 = uVar5.u();
                                    }
                                    j13 += i18 * z13;
                                    i27++;
                                    jArr3 = jArr;
                                    xVar4 = xVar3;
                                    z14 = z14;
                                    h11 = j14;
                                    c0882c5 = c0882c6;
                                }
                                C0882c c0882c7 = c0882c5;
                                xVar3 = xVar4;
                                long j15 = h11;
                                long[] jArr5 = jArr3;
                                if (j15 != -1 && j15 != j13) {
                                    s2.p.g("VbriSeeker", "VBRI data size mismatch: " + j15 + ", " + j13);
                                }
                                fVar = new g(jArr5, jArr4, I11, j13);
                                c0882c2 = c0882c7;
                                rVar2 = rVar;
                                rVar2.l(c0882c2.f10571c);
                                dVar = this;
                                uVar2 = uVar4;
                                xVar = xVar3;
                            }
                            fVar = null;
                            rVar2 = rVar;
                            rVar2.l(c0882c2.f10571c);
                            dVar = this;
                            uVar2 = uVar4;
                            xVar = xVar3;
                        } else {
                            rVar2 = rVar;
                            c0882c2 = c0882c4;
                            rVar.k();
                            dVar = this;
                            uVar2 = uVar4;
                            xVar = xVar4;
                            fVar = null;
                        }
                        m10 = dVar.f27970k;
                        long o12 = rVar.o();
                        if (m10 != null) {
                            for (L l10 : m10.f41915Y) {
                                if (l10 instanceof l) {
                                    long e11 = e(m10);
                                    int length = ((l) l10).f22089j0.length;
                                    int i28 = length + 1;
                                    long[] jArr6 = new long[i28];
                                    long[] jArr7 = new long[i28];
                                    jArr6[0] = o12;
                                    jArr7[0] = 0;
                                    int i29 = 1;
                                    long j16 = 0;
                                    while (i29 <= length) {
                                        int i30 = i29 - 1;
                                        o12 += lVar.f22087h0 + lVar.f22089j0[i30];
                                        j16 += lVar.f22088i0 + lVar.f22090k0[i30];
                                        jArr6[i29] = o12;
                                        jArr7[i29] = j16;
                                        i29++;
                                        length = length;
                                        uVar2 = uVar2;
                                        xVar = xVar;
                                        c0882c2 = c0882c2;
                                    }
                                    c0882c3 = c0882c2;
                                    xVar2 = xVar;
                                    uVar = uVar2;
                                    cVar = new c(e11, jArr6, jArr7);
                                    z10 = dVar.f27976q;
                                    i15 = dVar.f27960a;
                                    if (z10) {
                                        fVar2 = new L2.u(-9223372036854775807L);
                                    } else {
                                        if ((i15 & 4) != 0) {
                                            if (cVar != null) {
                                                e10 = cVar.f27958c;
                                            } else if (fVar != null) {
                                                e10 = fVar.j();
                                                j6 = fVar.c();
                                            } else {
                                                e10 = e(dVar.f27970k);
                                            }
                                            fVar = new b(e10, rVar.o(), j6);
                                        } else if (cVar != null) {
                                            fVar = cVar;
                                        } else if (fVar == null) {
                                            fVar = null;
                                        }
                                        if (fVar != null && (fVar.e() || (i15 & 1) == 0)) {
                                            fVar2 = fVar;
                                        } else {
                                            if ((i15 & 2) != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            fVar2 = dVar.c(rVar2, z11);
                                        }
                                    }
                                    dVar.f27975p = fVar2;
                                    dVar.f27966g.b(fVar2);
                                    G g12 = dVar.f27968i;
                                    p2.r rVar3 = new p2.r();
                                    c0882c = c0882c3;
                                    rVar3.f42237k = (String) c0882c.f10570b;
                                    rVar3.f42238l = 4096;
                                    rVar3.f42250x = c0882c.f10573e;
                                    rVar3.f42251y = c0882c.f10572d;
                                    x xVar5 = xVar2;
                                    rVar3.f42220A = xVar5.f10656a;
                                    rVar3.f42221B = xVar5.f10657b;
                                    if ((i15 & 8) != 0) {
                                        m11 = null;
                                    } else {
                                        m11 = dVar.f27970k;
                                    }
                                    rVar3.f42235i = m11;
                                    g12.b(new C5065s(rVar3));
                                    dVar.f27973n = rVar.o();
                                }
                            }
                        }
                        c0882c3 = c0882c2;
                        xVar2 = xVar;
                        uVar = uVar2;
                        cVar = null;
                        z10 = dVar.f27976q;
                        i15 = dVar.f27960a;
                        if (z10) {
                        }
                        dVar.f27975p = fVar2;
                        dVar.f27966g.b(fVar2);
                        G g122 = dVar.f27968i;
                        p2.r rVar32 = new p2.r();
                        c0882c = c0882c3;
                        rVar32.f42237k = (String) c0882c.f10570b;
                        rVar32.f42238l = 4096;
                        rVar32.f42250x = c0882c.f10573e;
                        rVar32.f42251y = c0882c.f10572d;
                        x xVar52 = xVar2;
                        rVar32.f42220A = xVar52.f10656a;
                        rVar32.f42221B = xVar52.f10657b;
                        if ((i15 & 8) != 0) {
                        }
                        rVar32.f42235i = m11;
                        g122.b(new C5065s(rVar32));
                        dVar.f27973n = rVar.o();
                    }
                    if (uVar5.f45195c >= 40) {
                        uVar5.F(36);
                        if (uVar5.g() == 1447187017) {
                            i14 = 1447187017;
                            x xVar42 = this.f27963d;
                            long j62 = -1;
                            if (i14 != 1483304551) {
                            }
                            rVar2 = rVar;
                            c0882c2 = c0882c4;
                            long h102 = rVar.h();
                            long o102 = rVar.o();
                            int i212 = c0882c2.f10575g;
                            int i222 = c0882c2.f10572d;
                            g10 = uVar5.g();
                            if ((g10 & 1) == 1) {
                            }
                            uVar3 = uVar4;
                            i16 = i13;
                            fVar = null;
                            if (fVar == null) {
                            }
                            rVar2.l(c0882c2.f10571c);
                            if (fVar == null) {
                            }
                            dVar = this;
                            m10 = dVar.f27970k;
                            long o122 = rVar.o();
                            if (m10 != null) {
                            }
                            c0882c3 = c0882c2;
                            xVar2 = xVar;
                            uVar = uVar2;
                            cVar = null;
                            z10 = dVar.f27976q;
                            i15 = dVar.f27960a;
                            if (z10) {
                            }
                            dVar.f27975p = fVar2;
                            dVar.f27966g.b(fVar2);
                            G g1222 = dVar.f27968i;
                            p2.r rVar322 = new p2.r();
                            c0882c = c0882c3;
                            rVar322.f42237k = (String) c0882c.f10570b;
                            rVar322.f42238l = 4096;
                            rVar322.f42250x = c0882c.f10573e;
                            rVar322.f42251y = c0882c.f10572d;
                            x xVar522 = xVar2;
                            rVar322.f42220A = xVar522.f10656a;
                            rVar322.f42221B = xVar522.f10657b;
                            if ((i15 & 8) != 0) {
                            }
                            rVar322.f42235i = m11;
                            g1222.b(new C5065s(rVar322));
                            dVar.f27973n = rVar.o();
                        }
                    }
                    i14 = 0;
                    x xVar422 = this.f27963d;
                    long j622 = -1;
                    if (i14 != 1483304551) {
                    }
                    rVar2 = rVar;
                    c0882c2 = c0882c4;
                    long h1022 = rVar.h();
                    long o1022 = rVar.o();
                    int i2122 = c0882c2.f10575g;
                    int i2222 = c0882c2.f10572d;
                    g10 = uVar5.g();
                    if ((g10 & 1) == 1) {
                    }
                    uVar3 = uVar4;
                    i16 = i13;
                    fVar = null;
                    if (fVar == null) {
                    }
                    rVar2.l(c0882c2.f10571c);
                    if (fVar == null) {
                    }
                    dVar = this;
                    m10 = dVar.f27970k;
                    long o1222 = rVar.o();
                    if (m10 != null) {
                    }
                    c0882c3 = c0882c2;
                    xVar2 = xVar;
                    uVar = uVar2;
                    cVar = null;
                    z10 = dVar.f27976q;
                    i15 = dVar.f27960a;
                    if (z10) {
                    }
                    dVar.f27975p = fVar2;
                    dVar.f27966g.b(fVar2);
                    G g12222 = dVar.f27968i;
                    p2.r rVar3222 = new p2.r();
                    c0882c = c0882c3;
                    rVar3222.f42237k = (String) c0882c.f10570b;
                    rVar3222.f42238l = 4096;
                    rVar3222.f42250x = c0882c.f10573e;
                    rVar3222.f42251y = c0882c.f10572d;
                    x xVar5222 = xVar2;
                    rVar3222.f42220A = xVar5222.f10656a;
                    rVar3222.f42221B = xVar5222.f10657b;
                    if ((i15 & 8) != 0) {
                    }
                    rVar3222.f42235i = m11;
                    g12222.b(new C5065s(rVar3222));
                    dVar.f27973n = rVar.o();
                }
                i13 = 21;
                if (uVar5.f45195c >= i13 + 4) {
                }
                if (uVar5.f45195c >= 40) {
                }
                i14 = 0;
                x xVar4222 = this.f27963d;
                long j6222 = -1;
                if (i14 != 1483304551) {
                }
                rVar2 = rVar;
                c0882c2 = c0882c4;
                long h10222 = rVar.h();
                long o10222 = rVar.o();
                int i21222 = c0882c2.f10575g;
                int i22222 = c0882c2.f10572d;
                g10 = uVar5.g();
                if ((g10 & 1) == 1) {
                }
                uVar3 = uVar4;
                i16 = i13;
                fVar = null;
                if (fVar == null) {
                }
                rVar2.l(c0882c2.f10571c);
                if (fVar == null) {
                }
                dVar = this;
                m10 = dVar.f27970k;
                long o12222 = rVar.o();
                if (m10 != null) {
                }
                c0882c3 = c0882c2;
                xVar2 = xVar;
                uVar = uVar2;
                cVar = null;
                z10 = dVar.f27976q;
                i15 = dVar.f27960a;
                if (z10) {
                }
                dVar.f27975p = fVar2;
                dVar.f27966g.b(fVar2);
                G g122222 = dVar.f27968i;
                p2.r rVar32222 = new p2.r();
                c0882c = c0882c3;
                rVar32222.f42237k = (String) c0882c.f10570b;
                rVar32222.f42238l = 4096;
                rVar32222.f42250x = c0882c.f10573e;
                rVar32222.f42251y = c0882c.f10572d;
                x xVar52222 = xVar2;
                rVar32222.f42220A = xVar52222.f10656a;
                rVar32222.f42221B = xVar52222.f10657b;
                if ((i15 & 8) != 0) {
                }
                rVar32222.f42235i = m11;
                g122222.b(new C5065s(rVar32222));
                dVar.f27973n = rVar.o();
            } else {
                if (c0882c4.f10573e == 1) {
                    i13 = 13;
                    if (uVar5.f45195c >= i13 + 4) {
                    }
                    if (uVar5.f45195c >= 40) {
                    }
                    i14 = 0;
                    x xVar42222 = this.f27963d;
                    long j62222 = -1;
                    if (i14 != 1483304551) {
                    }
                    rVar2 = rVar;
                    c0882c2 = c0882c4;
                    long h102222 = rVar.h();
                    long o102222 = rVar.o();
                    int i212222 = c0882c2.f10575g;
                    int i222222 = c0882c2.f10572d;
                    g10 = uVar5.g();
                    if ((g10 & 1) == 1) {
                    }
                    uVar3 = uVar4;
                    i16 = i13;
                    fVar = null;
                    if (fVar == null) {
                    }
                    rVar2.l(c0882c2.f10571c);
                    if (fVar == null) {
                    }
                    dVar = this;
                    m10 = dVar.f27970k;
                    long o122222 = rVar.o();
                    if (m10 != null) {
                    }
                    c0882c3 = c0882c2;
                    xVar2 = xVar;
                    uVar = uVar2;
                    cVar = null;
                    z10 = dVar.f27976q;
                    i15 = dVar.f27960a;
                    if (z10) {
                    }
                    dVar.f27975p = fVar2;
                    dVar.f27966g.b(fVar2);
                    G g1222222 = dVar.f27968i;
                    p2.r rVar322222 = new p2.r();
                    c0882c = c0882c3;
                    rVar322222.f42237k = (String) c0882c.f10570b;
                    rVar322222.f42238l = 4096;
                    rVar322222.f42250x = c0882c.f10573e;
                    rVar322222.f42251y = c0882c.f10572d;
                    x xVar522222 = xVar2;
                    rVar322222.f42220A = xVar522222.f10656a;
                    rVar322222.f42221B = xVar522222.f10657b;
                    if ((i15 & 8) != 0) {
                    }
                    rVar322222.f42235i = m11;
                    g1222222.b(new C5065s(rVar322222));
                    dVar.f27973n = rVar.o();
                }
                i13 = 21;
                if (uVar5.f45195c >= i13 + 4) {
                }
                if (uVar5.f45195c >= 40) {
                }
                i14 = 0;
                x xVar422222 = this.f27963d;
                long j622222 = -1;
                if (i14 != 1483304551) {
                }
                rVar2 = rVar;
                c0882c2 = c0882c4;
                long h1022222 = rVar.h();
                long o1022222 = rVar.o();
                int i2122222 = c0882c2.f10575g;
                int i2222222 = c0882c2.f10572d;
                g10 = uVar5.g();
                if ((g10 & 1) == 1) {
                }
                uVar3 = uVar4;
                i16 = i13;
                fVar = null;
                if (fVar == null) {
                }
                rVar2.l(c0882c2.f10571c);
                if (fVar == null) {
                }
                dVar = this;
                m10 = dVar.f27970k;
                long o1222222 = rVar.o();
                if (m10 != null) {
                }
                c0882c3 = c0882c2;
                xVar2 = xVar;
                uVar = uVar2;
                cVar = null;
                z10 = dVar.f27976q;
                i15 = dVar.f27960a;
                if (z10) {
                }
                dVar.f27975p = fVar2;
                dVar.f27966g.b(fVar2);
                G g12222222 = dVar.f27968i;
                p2.r rVar3222222 = new p2.r();
                c0882c = c0882c3;
                rVar3222222.f42237k = (String) c0882c.f10570b;
                rVar3222222.f42238l = 4096;
                rVar3222222.f42250x = c0882c.f10573e;
                rVar3222222.f42251y = c0882c.f10572d;
                x xVar5222222 = xVar2;
                rVar3222222.f42220A = xVar5222222.f10656a;
                rVar3222222.f42221B = xVar5222222.f10657b;
                if ((i15 & 8) != 0) {
                }
                rVar3222222.f42235i = m11;
                g12222222.b(new C5065s(rVar3222222));
                dVar.f27973n = rVar.o();
            }
        } else {
            dVar = this;
            rVar2 = rVar;
            c0882c = c0882c4;
            uVar = uVar4;
            if (dVar.f27973n != 0) {
                long o13 = rVar.o();
                long j17 = dVar.f27973n;
                if (o13 < j17) {
                    rVar2.l((int) (j17 - o13));
                }
            }
        }
        if (dVar.f27974o == 0) {
            rVar.k();
            if (!f(rVar)) {
                u uVar6 = uVar;
                uVar6.F(0);
                int g13 = uVar6.g();
                if (((-128000) & g13) == (dVar.f27969j & (-128000)) && AbstractC0881b.c(g13) != -1) {
                    c0882c.a(g13);
                    if (dVar.f27971l == -9223372036854775807L) {
                        dVar.f27971l = dVar.f27975p.f(rVar.o());
                    }
                    dVar.f27974o = c0882c.f10571c;
                    f fVar4 = dVar.f27975p;
                    if (fVar4 instanceof b) {
                        b bVar = (b) fVar4;
                        long j18 = (((dVar.f27972m + c0882c.f10575g) * 1000000) / c0882c.f10572d) + dVar.f27971l;
                        long o14 = rVar.o() + c0882c.f10571c;
                        if (!bVar.a(j18)) {
                            bVar.f27953b.g(j18);
                            bVar.f27954c.g(o14);
                        }
                        if (dVar.f27977r && bVar.a(dVar.f27978s)) {
                            dVar.f27977r = false;
                            dVar.f27968i = dVar.f27967h;
                        }
                    }
                } else {
                    rVar2.l(1);
                    dVar.f27969j = 0;
                    i12 = 0;
                    i11 = i12;
                    i10 = -1;
                    if (i11 == i10) {
                        f fVar5 = dVar.f27975p;
                        if (fVar5 instanceof b) {
                            long j19 = ((dVar.f27972m * 1000000) / c0882c.f10572d) + dVar.f27971l;
                            if (fVar5.j() != j19) {
                                f fVar6 = dVar.f27975p;
                                ((b) fVar6).f27955d = j19;
                                dVar.f27966g.b(fVar6);
                            }
                        }
                    }
                    return i11;
                }
            }
            i12 = -1;
            i11 = i12;
            i10 = -1;
            if (i11 == i10) {
            }
            return i11;
        }
        int c10 = dVar.f27968i.c(rVar2, dVar.f27974o, true);
        if (c10 != -1) {
            int i31 = dVar.f27974o - c10;
            dVar.f27974o = i31;
            if (i31 <= 0) {
                dVar.f27968i.e(((dVar.f27972m * 1000000) / c0882c.f10572d) + dVar.f27971l, 1, c0882c.f10571c, 0, null);
                dVar.f27972m += c0882c.f10575g;
                dVar.f27974o = 0;
                i12 = 0;
                i11 = i12;
                i10 = -1;
                if (i11 == i10) {
                }
                return i11;
            }
            i12 = 0;
            i11 = i12;
            i10 = -1;
            if (i11 == i10) {
            }
            return i11;
        }
        i12 = -1;
        i11 = i12;
        i10 = -1;
        if (i11 == i10) {
        }
        return i11;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [L2.l, d3.a] */
    public final C2591a c(r rVar, boolean z10) {
        u uVar = this.f27961b;
        rVar.n(uVar.f45193a, 0, 4);
        uVar.F(0);
        int g10 = uVar.g();
        C0882c c0882c = this.f27962c;
        c0882c.a(g10);
        return new L2.l(c0882c.f10574f, c0882c.f10571c, rVar.h(), rVar.o(), z10);
    }

    @Override // L2.q
    public final void d(s sVar) {
        this.f27966g = sVar;
        G f6 = sVar.f(0, 1);
        this.f27967h = f6;
        this.f27968i = f6;
        this.f27966g.d();
    }

    public final boolean f(r rVar) {
        f fVar = this.f27975p;
        if (fVar != null) {
            long c10 = fVar.c();
            if (c10 != -1 && rVar.d() > c10 - 4) {
                return true;
            }
        }
        try {
            return !rVar.c(this.f27961b.f45193a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // L2.q
    public final boolean g(r rVar) {
        return i(rVar, true);
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        this.f27969j = 0;
        this.f27971l = -9223372036854775807L;
        this.f27972m = 0L;
        this.f27974o = 0;
        this.f27978s = j10;
        f fVar = this.f27975p;
        if ((fVar instanceof b) && !((b) fVar).a(j10)) {
            this.f27977r = true;
            this.f27968i = this.f27965f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r19 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r18.l(r3 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
        r18.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        r17.f27969j = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(r rVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int c10;
        A9.a aVar;
        if (z10) {
            i10 = 32768;
        } else {
            i10 = 131072;
        }
        rVar.k();
        if (rVar.o() == 0) {
            if ((this.f27960a & 8) == 0) {
                aVar = null;
            } else {
                aVar = f27959t;
            }
            M a5 = this.f27964e.a(rVar, aVar);
            this.f27970k = a5;
            if (a5 != null) {
                this.f27963d.b(a5);
            }
            i11 = (int) rVar.d();
            if (!z10) {
                rVar.l(i11);
            }
            i12 = 0;
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i13 = i12;
        int i14 = i13;
        while (true) {
            if (f(rVar)) {
                if (i13 <= 0) {
                    throw new EOFException();
                }
            } else {
                u uVar = this.f27961b;
                uVar.F(0);
                int g10 = uVar.g();
                if ((i12 != 0 && ((-128000) & g10) != (i12 & (-128000))) || (c10 = AbstractC0881b.c(g10)) == -1) {
                    int i15 = i14 + 1;
                    if (i14 == i10) {
                        if (z10) {
                            return false;
                        }
                        throw O.a("Searched too many bytes.", null);
                    }
                    if (z10) {
                        rVar.k();
                        rVar.e(i11 + i15);
                    } else {
                        rVar.l(1);
                    }
                    i13 = 0;
                    i14 = i15;
                    i12 = 0;
                } else {
                    i13++;
                    if (i13 == 1) {
                        this.f27962c.a(g10);
                        i12 = g10;
                    } else if (i13 == 4) {
                        break;
                    }
                    rVar.e(c10 - 4);
                }
            }
        }
    }

    @Override // L2.q
    public final q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
