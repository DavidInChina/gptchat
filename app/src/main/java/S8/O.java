package S8;

import E.g0;
import E.i0;
import Z.AbstractC1725n;
import Z.C1737t0;
import Z.C1741v0;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import u7.C5848d;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    public static final Z.O f16257a = A7.b.o0(r.f16364j0);

    /* renamed from: b  reason: collision with root package name */
    public static final long f16258b = M3.H.V(8);

    public static final void a(M m10, N n10, wf.o oVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        U8.q qVar;
        N0.y yVar;
        N0.y yVar2;
        N0.y yVar3;
        N0.y yVar4;
        N0.y yVar5;
        N0.y yVar6;
        N0.y yVar7;
        int i12;
        int i13;
        int i14;
        AbstractC3557B.c0("<this>", m10);
        AbstractC3557B.c0("children", oVar);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1634189773);
        if ((i10 & 14) == 0) {
            if (rVar.g(m10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.g(n10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar.i(oVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && rVar.B()) {
            rVar.P();
        } else if (n10 == null) {
            rVar.W(1904236957);
            oVar.invoke(m10, rVar, Integer.valueOf((i11 & 14) | ((i11 >> 3) & 112)));
            rVar.t(false);
        } else {
            rVar.W(1904236983);
            Z.O o10 = f16257a;
            N n11 = (N) rVar.m(o10);
            AbstractC3557B.c0("<this>", n11);
            Z0.n nVar = n10.f16249a;
            if (nVar == null) {
                nVar = n11.f16249a;
            }
            Z0.n nVar2 = nVar;
            wf.n nVar3 = n10.f16250b;
            if (nVar3 == null) {
                nVar3 = n11.f16250b;
            }
            wf.n nVar4 = nVar3;
            B b10 = n10.f16251c;
            if (b10 == null) {
                b10 = n11.f16251c;
            }
            B b11 = b10;
            AbstractC1360d abstractC1360d = n10.f16252d;
            if (abstractC1360d == null) {
                abstractC1360d = n11.f16252d;
            }
            AbstractC1360d abstractC1360d2 = abstractC1360d;
            C1367k c1367k = n10.f16253e;
            if (c1367k == null) {
                c1367k = n11.f16253e;
            }
            C1367k c1367k2 = c1367k;
            c0 c0Var = n10.f16254f;
            if (c0Var == null) {
                c0Var = n11.f16254f;
            }
            c0 c0Var2 = c0Var;
            C1381z c1381z = n10.f16255g;
            if (c1381z == null) {
                c1381z = n11.f16255g;
            }
            C1381z c1381z2 = c1381z;
            U8.q qVar2 = n10.f16256h;
            U8.q qVar3 = n11.f16256h;
            if (qVar3 != null) {
                if (qVar2 != null) {
                    N0.y b12 = C5848d.b(U8.q.f17548i, qVar3.f17550a, qVar2.f17550a);
                    N0.y yVar8 = qVar3.f17551b;
                    N0.y yVar9 = qVar2.f17551b;
                    if (yVar8 != null) {
                        yVar = yVar8.c(yVar9);
                    } else {
                        yVar = yVar9;
                    }
                    N0.y yVar10 = qVar3.f17552c;
                    N0.y yVar11 = qVar2.f17552c;
                    if (yVar10 != null) {
                        yVar2 = yVar10.c(yVar11);
                    } else {
                        yVar2 = yVar11;
                    }
                    N0.y yVar12 = qVar3.f17553d;
                    N0.y yVar13 = qVar2.f17553d;
                    if (yVar12 != null) {
                        yVar3 = yVar12.c(yVar13);
                    } else {
                        yVar3 = yVar13;
                    }
                    N0.y yVar14 = qVar3.f17554e;
                    N0.y yVar15 = qVar2.f17554e;
                    if (yVar14 != null) {
                        yVar4 = yVar14.c(yVar15);
                    } else {
                        yVar4 = yVar15;
                    }
                    N0.y yVar16 = qVar3.f17555f;
                    N0.y yVar17 = qVar2.f17555f;
                    if (yVar16 != null) {
                        yVar5 = yVar16.c(yVar17);
                    } else {
                        yVar5 = yVar17;
                    }
                    N0.y yVar18 = qVar3.f17556g;
                    N0.y yVar19 = qVar2.f17556g;
                    if (yVar18 != null) {
                        yVar6 = yVar18.c(yVar19);
                    } else {
                        yVar6 = yVar19;
                    }
                    N0.y yVar20 = qVar3.f17557h;
                    N0.y yVar21 = qVar2.f17557h;
                    if (yVar20 != null) {
                        yVar7 = yVar20.c(yVar21);
                    } else {
                        yVar7 = yVar21;
                    }
                    qVar3 = new U8.q(b12, yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7);
                }
                qVar = qVar3;
            } else {
                qVar = qVar2;
            }
            A7.b.l(new C1737t0[]{o10.b(new N(nVar2, nVar4, b11, abstractC1360d2, c1367k2, c0Var2, c1381z2, qVar))}, R4.b.X(rVar, -1349356393, new C1364h(oVar, m10, 2)), rVar, 56);
            rVar.t(false);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new G.U(m10, n10, oVar, i10, 10);
        }
    }

    public static final N b(M m10, AbstractC1725n abstractC1725n) {
        AbstractC3557B.c0("<this>", m10);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(1277159346);
        N n10 = (N) rVar.m(f16257a);
        rVar.t(false);
        return n10;
    }

    public static final N c(N n10) {
        long j6;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z10;
        long j14;
        long j15;
        float f6;
        AbstractC3557B.c0("<this>", n10);
        Z0.n nVar = n10.f16249a;
        if (nVar != null) {
            j6 = nVar.f22811a;
        } else {
            j6 = f16258b;
        }
        Z0.n nVar2 = new Z0.n(j6);
        wf.n nVar3 = n10.f16250b;
        if (nVar3 == null) {
            nVar3 = C1378w.f16388Z;
        }
        wf.n nVar4 = nVar3;
        B b10 = n10.f16251c;
        if (b10 == null) {
            b10 = B.f16205f;
        }
        C1358b c1358b = AbstractC1377v.f16385d;
        Z0.n nVar5 = b10.f16206a;
        if (nVar5 != null) {
            j10 = nVar5.f22811a;
        } else {
            j10 = AbstractC1377v.f16382a;
        }
        Z0.n nVar6 = new Z0.n(j10);
        Z0.n nVar7 = b10.f16207b;
        if (nVar7 != null) {
            j11 = nVar7.f22811a;
        } else {
            j11 = AbstractC1377v.f16383b;
        }
        Z0.n nVar8 = new Z0.n(j11);
        Z0.n nVar9 = b10.f16208c;
        if (nVar9 != null) {
            j12 = nVar9.f22811a;
        } else {
            j12 = AbstractC1377v.f16384c;
        }
        Z0.n nVar10 = new Z0.n(j12);
        wf.k kVar = b10.f16209d;
        if (kVar == null) {
            kVar = AbstractC1377v.f16385d;
        }
        wf.k kVar2 = kVar;
        wf.k kVar3 = b10.f16210e;
        if (kVar3 == null) {
            kVar3 = AbstractC1377v.f16386e;
        }
        B b11 = new B(nVar6, nVar8, nVar10, kVar2, kVar3);
        AbstractC1360d abstractC1360d = n10.f16252d;
        if (abstractC1360d == null) {
            abstractC1360d = AbstractC1362f.f16320a;
        }
        AbstractC1360d abstractC1360d2 = abstractC1360d;
        C1367k c1367k = n10.f16253e;
        if (c1367k == null) {
            c1367k = C1367k.f16334e;
        }
        N0.E e10 = AbstractC1366j.f16330a;
        N0.E e11 = c1367k.f16335a;
        if (e11 == null) {
            e11 = AbstractC1366j.f16330a;
        }
        AbstractC4326r abstractC4326r = c1367k.f16336b;
        if (abstractC4326r == null) {
            abstractC4326r = AbstractC1366j.f16332c;
        }
        Z0.n nVar11 = c1367k.f16337c;
        if (nVar11 != null) {
            j13 = nVar11.f22811a;
        } else {
            j13 = AbstractC1366j.f16333d;
        }
        Z0.n nVar12 = new Z0.n(j13);
        Boolean bool = c1367k.f16338d;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = true;
        }
        C1367k c1367k2 = new C1367k(e11, abstractC4326r, nVar12, Boolean.valueOf(z10));
        c0 c0Var = n10.f16254f;
        if (c0Var == null) {
            c0Var = c0.f16313e;
        }
        N0.E e12 = Z.f16288a;
        N0.E e13 = c0Var.f16314a;
        if (e13 == null) {
            e13 = Z.f16288a;
        }
        Z0.n nVar13 = c0Var.f16315b;
        if (nVar13 != null) {
            j14 = nVar13.f22811a;
        } else {
            j14 = Z.f16289b;
        }
        Z0.n nVar14 = new Z0.n(j14);
        r0.r rVar = c0Var.f16316c;
        if (rVar != null) {
            j15 = rVar.f44265a;
        } else {
            j15 = Z.f16290c;
        }
        r0.r rVar2 = new r0.r(j15);
        Float f10 = c0Var.f16317d;
        if (f10 != null) {
            f6 = f10.floatValue();
        } else {
            f6 = 1.0f;
        }
        c0 c0Var2 = new c0(e13, nVar14, rVar2, Float.valueOf(f6));
        C1381z c1381z = n10.f16255g;
        if (c1381z == null) {
            c1381z = C1381z.f16398d;
        }
        i0 i0Var = AbstractC1380y.f16395a;
        g0 g0Var = c1381z.f16399a;
        if (g0Var == null) {
            g0Var = AbstractC1380y.f16395a;
        }
        wf.o oVar = c1381z.f16400b;
        if (oVar == null) {
            oVar = AbstractC1380y.f16396b;
        }
        wf.o oVar2 = c1381z.f16401c;
        if (oVar2 == null) {
            oVar2 = AbstractC1380y.f16397c;
        }
        C1381z c1381z2 = new C1381z(g0Var, oVar, oVar2);
        U8.q qVar = n10.f16256h;
        if (qVar == null) {
            U8.q.f17548i.getClass();
            qVar = U8.q.f17549j;
        }
        return new N(nVar2, nVar4, b11, abstractC1360d2, c1367k2, c0Var2, c1381z2, qVar.a());
    }
}
