package w;

import A.AbstractC0015e0;
import A.C0019g0;
import A.C0041s;
import A.C0043t;
import A.C0047v;
import A.C0049w;
import A.I;
import A.Z0;
import E0.AbstractC0461u;
import E0.d0;
import E0.g0;
import E0.l0;
import F.J;
import G.M;
import H.C0659h;
import H.F;
import L.N0;
import Ng.AbstractC1070k;
import Ng.AbstractC1073l0;
import Z.C1718j0;
import Z.C1720k0;
import Z.C1744x;
import Z.E0;
import Z.EnumC1747y0;
import Z.G;
import Z.l1;
import android.view.Choreographer;
import com.google.android.gms.internal.play_billing.N;
import h.C3277c;
import id.AbstractC3557B;
import j0.AbstractC3883H;
import j0.C3876A;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import l8.AbstractC4344b;
import n0.C4703b;
import n0.C4708g;
import nf.AbstractC4828h;
import o0.C4869d;
import q0.C5251c;
import q0.C5253e;
import q0.C5254f;
import r0.AbstractC5350n;
import r0.C5335B;
import r0.C5336C;
import r0.C5344h;
import s0.AbstractC5502d;
import s0.C5503e;
import t0.C5653l;
import t0.C5654m;
import v0.AbstractC5939C;
import v0.C5950c;
import y.C6460A;
import y.Z;
import z.C6724t;

/* renamed from: w.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6077x extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f47640Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f47641Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6077x(int i10, Object obj) {
        super(1);
        this.f47640Y = i10;
        this.f47641Z = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
        if ((r8 % 2) != 1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Float a(float f6) {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        float f11;
        int i10;
        float f12;
        boolean z13;
        int i11;
        boolean z14;
        float f13 = f6;
        jf.y yVar = jf.y.f36177a;
        int i12 = this.f47640Y;
        Object obj = this.f47641Z;
        switch (i12) {
            case 6:
                float f14 = f13;
                Z0 z02 = (Z0) obj;
                float h10 = z02.f151a.h() + f14 + z02.f155e;
                float o10 = N.o(h10, 0.0f, z02.f154d.h());
                if (h10 == o10) {
                    z11 = true;
                    z10 = true;
                } else {
                    z11 = true;
                    z10 = false;
                }
                boolean z15 = z11 ^ z10;
                C1720k0 c1720k0 = z02.f151a;
                float h11 = o10 - c1720k0.h();
                int Y02 = AbstractC4344b.Y0(h11);
                c1720k0.i(c1720k0.h() + Y02);
                z02.f155e = h11 - Y02;
                if (z15) {
                    f14 = h11;
                }
                return Float.valueOf(f14);
            case 10:
                J j6 = (J) obj;
                float f15 = -f6;
                if ((f15 < 0.0f && !j6.d()) || (f15 > 0.0f && !j6.b())) {
                    f10 = 0.0f;
                } else if (Math.abs(j6.f4877g) <= 0.5f) {
                    float f16 = j6.f4877g + f15;
                    j6.f4877g = f16;
                    if (Math.abs(f16) > 0.5f) {
                        F.z zVar = (F.z) j6.f4875e.getValue();
                        float f17 = j6.f4877g;
                        int Y03 = AbstractC4344b.Y0(f17);
                        F.z zVar2 = j6.f4872b;
                        boolean c10 = zVar.c(Y03, !j6.f4871a);
                        if (c10 && zVar2 != null) {
                            c10 = zVar2.c(Y03, true);
                        }
                        if (c10) {
                            j6.f(zVar, j6.f4871a, true);
                            j6.f4893w.setValue(yVar);
                            j6.i(f17 - j6.f4877g, zVar);
                        } else {
                            g0 g0Var = j6.f4884n;
                            if (g0Var != null) {
                                ((androidx.compose.ui.node.a) g0Var).k();
                            }
                            j6.i(f17 - j6.f4877g, j6.h());
                        }
                    }
                    if (Math.abs(j6.f4877g) > 0.5f) {
                        f15 -= j6.f4877g;
                        j6.f4877g = 0.0f;
                    }
                    f10 = f15;
                } else {
                    throw new IllegalStateException(("entered drag with non-zero pending scroll: " + j6.f4877g).toString());
                }
                return Float.valueOf(-f10);
            case 13:
                F f18 = (F) obj;
                H.A a5 = f18.f6549d;
                C1718j0 c1718j0 = a5.f6528c;
                float h12 = c1718j0.h() + a5.f6527b.h();
                F f19 = a5.f6526a;
                float Y04 = AbstractC4344b.Y0(h12 * (f19.j() + f19.i()));
                float f20 = Y04 + f13 + f18.f6553h;
                float o11 = N.o(f20, 0.0f, f18.f6552g);
                if (f20 == o11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z16 = !z12;
                float f21 = o11 - Y04;
                f18.f6554i = f21;
                if (Math.abs(f21) != 0.0f) {
                    if (f21 > 0.0f) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    f18.f6548c.setValue(Boolean.valueOf(z14));
                }
                int Y05 = AbstractC4344b.Y0(f21);
                H.x xVar = (H.x) f18.f6560o.getValue();
                int i13 = -Y05;
                int i14 = xVar.f6695b + xVar.f6696c;
                if (!xVar.f6707n) {
                    List list = xVar.f6694a;
                    if (!list.isEmpty() && xVar.f6702i != null && (i10 = xVar.f6705l - i13) >= 0 && i10 < i14) {
                        if (i14 != 0) {
                            f12 = i13 / i14;
                        } else {
                            f12 = 0.0f;
                        }
                        float f22 = xVar.f6704k - f12;
                        if (xVar.f6703j != null && f22 < 0.5f && f22 > -0.5f) {
                            C0659h c0659h = (C0659h) kf.t.f2(list);
                            C0659h c0659h2 = (C0659h) kf.t.o2(list);
                            int i15 = xVar.f6700g;
                            int i16 = xVar.f6699f;
                            if (i13 >= 0 ? Math.min(i16 - c0659h.f6635m, i15 - c0659h2.f6635m) > i13 : Math.min((c0659h.f6635m + i14) - i16, (c0659h2.f6635m + i14) - i15) > (-i13)) {
                                xVar.f6704k -= f12;
                                xVar.f6705l -= i13;
                                int size = list.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    C0659h c0659h3 = (C0659h) list.get(i17);
                                    c0659h3.f6635m += i13;
                                    int[] iArr = c0659h3.f6634l;
                                    int length = iArr.length;
                                    int i18 = 0;
                                    while (i18 < length) {
                                        boolean z17 = c0659h3.f6632j;
                                        if (z17) {
                                            i11 = size;
                                            break;
                                        } else {
                                            i11 = size;
                                        }
                                        if (!z17) {
                                            if (i18 % 2 != 0) {
                                            }
                                            iArr[i18] = iArr[i18] + i13;
                                        }
                                        i18++;
                                        size = i11;
                                    }
                                }
                                if (!xVar.f6706m && i13 > 0) {
                                    z13 = true;
                                    xVar.f6706m = true;
                                } else {
                                    z13 = true;
                                }
                                f18.f(xVar, z13);
                                f18.f6543A.setValue(yVar);
                                f18.f6553h = f21 - Y05;
                                if (!z16) {
                                    f21 = f6;
                                }
                                return Float.valueOf(f21);
                            }
                        }
                    }
                }
                if (f19.j() + f19.i() == 0) {
                    f11 = 0.0f;
                } else {
                    f11 = Y05 / (f19.j() + f19.i());
                }
                c1718j0.i(c1718j0.h() + f11);
                g0 g0Var2 = (g0) f18.f6568w.getValue();
                if (g0Var2 != null) {
                    ((androidx.compose.ui.node.a) g0Var2).k();
                }
                f18.f6553h = f21 - Y05;
                if (!z16) {
                }
                return Float.valueOf(f21);
            default:
                N0 n02 = (N0) obj;
                float h13 = n02.f10005a.h() + f13;
                C1718j0 c1718j02 = n02.f10006b;
                int i19 = (h13 > c1718j02.h() ? 1 : (h13 == c1718j02.h() ? 0 : -1));
                C1718j0 c1718j03 = n02.f10005a;
                if (i19 > 0) {
                    f13 = c1718j02.h() - c1718j03.h();
                } else if (h13 < 0.0f) {
                    f13 = -c1718j03.h();
                }
                c1718j03.i(c1718j03.h() + f13);
                return Float.valueOf(f13);
        }
    }

    public final void c(Object obj) {
        switch (this.f47640Y) {
            case 21:
                ((C1744x) ((Z.D) this.f47641Z)).b(obj);
                return;
            case 22:
                if (obj instanceof AbstractC3883H) {
                    ((AbstractC3883H) obj).g(4);
                }
                ((C6074u) this.f47641Z).c(obj);
                return;
            default:
                C3876A c3876a = (C3876A) this.f47641Z;
                if (!c3876a.f35833h) {
                    synchronized (c3876a.f35831f) {
                        j0.z zVar = c3876a.f35834i;
                        AbstractC3557B.Z(zVar);
                        Object obj2 = zVar.f35943b;
                        AbstractC3557B.Z(obj2);
                        int i10 = zVar.f35945d;
                        C6072s c6072s = zVar.f35944c;
                        if (c6072s == null) {
                            c6072s = new C6072s();
                            zVar.f35944c = c6072s;
                            zVar.f35947f.l(obj2, c6072s);
                        }
                        zVar.c(obj, i10, obj2, c6072s);
                    }
                    return;
                }
                return;
        }
    }

    public final void e(Throwable th2) {
        AbstractC1070k abstractC1070k;
        AbstractC1070k abstractC1070k2 = null;
        switch (this.f47640Y) {
            case 19:
                G.f22491Z.removeFrameCallback((Choreographer.FrameCallback) this.f47641Z);
                return;
            case 20:
                CancellationException g10 = A7.b.g("Recomposer effect job completed", th2);
                E0 e02 = (E0) this.f47641Z;
                synchronized (e02.f22466c) {
                    try {
                        AbstractC1073l0 abstractC1073l0 = e02.f22467d;
                        if (abstractC1073l0 != null) {
                            e02.f22483t.setValue(EnumC1747y0.f22771Z);
                            if (!e02.f22480q) {
                                abstractC1073l0.k(g10);
                            } else {
                                abstractC1070k = e02.f22479p;
                                if (abstractC1070k != null) {
                                    e02.f22479p = null;
                                    abstractC1073l0.V(new C0043t(e02, 13, th2));
                                    abstractC1070k2 = abstractC1070k;
                                }
                            }
                            abstractC1070k = null;
                            e02.f22479p = null;
                            abstractC1073l0.V(new C0043t(e02, 13, th2));
                            abstractC1070k2 = abstractC1070k;
                        } else {
                            e02.f22468e = g10;
                            e02.f22483t.setValue(EnumC1747y0.f22770Y);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (abstractC1070k2 != null) {
                    abstractC1070k2.resumeWith(jf.y.f36177a);
                    return;
                }
                return;
            default:
                B0.N n10 = (B0.N) this.f47641Z;
                AbstractC1070k abstractC1070k3 = n10.f1612h0;
                if (abstractC1070k3 != null) {
                    abstractC1070k3.s(th2);
                }
                n10.f1612h0 = null;
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long j6;
        boolean z10;
        C5653l c5653l;
        jf.y yVar = jf.y.f36177a;
        float f6 = 1.0f;
        boolean z11 = true;
        wf.k kVar = null;
        Object obj2 = this.f47641Z;
        int i10 = this.f47640Y;
        switch (i10) {
            case 0:
                if (obj == ((AbstractC6078y) obj2)) {
                    return "(this)";
                }
                return String.valueOf(obj);
            case 1:
                l1 l1Var = (l1) ((C6460A) obj2).f50082e.get(obj);
                if (l1Var != null) {
                    j6 = ((Z0.k) l1Var.getValue()).f22804a;
                } else {
                    j6 = 0;
                }
                return new Z0.k(j6);
            case 2:
                C6724t c6724t = (C6724t) obj;
                return new r0.r(r0.r.a(androidx.compose.ui.graphics.a.a(N.o(c6724t.f51374b, 0.0f, 1.0f), N.o(c6724t.f51375c, -0.5f, 0.5f), N.o(c6724t.f51376d, -0.5f, 0.5f), N.o(c6724t.f51373a, 0.0f, 1.0f), C5503e.f45045t), (AbstractC5502d) obj2));
            case 3:
                C4869d c4869d = (C4869d) obj;
                C0049w c0049w = (C0049w) obj2;
                if (c4869d.b() * c0049w.f316v0 >= 0.0f && C5254f.c(c4869d.f40415Y.g()) > 0.0f) {
                    if (!Z0.e.a(c0049w.f316v0, 0.0f)) {
                        f6 = (float) Math.ceil(c4869d.b() * c0049w.f316v0);
                    }
                    float f10 = 2;
                    float min = Math.min(f6, (float) Math.ceil(C5254f.c(c4869d.f40415Y.g()) / f10));
                    float f11 = min / f10;
                    long r10 = R4.b.r(f11, f11);
                    long i11 = AbstractC4828h.i(C5254f.d(c4869d.f40415Y.g()) - min, C5254f.b(c4869d.f40415Y.g()) - min);
                    if (f10 * min > C5254f.c(c4869d.f40415Y.g())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r0.G c10 = c0049w.f318x0.c(c4869d.f40415Y.g(), c4869d.f40415Y.getLayoutDirection(), c4869d);
                    if (c10 instanceof r0.D) {
                        AbstractC5350n abstractC5350n = c0049w.f317w0;
                        C5253e c5253e = ((r0.D) c10).f44169k;
                        if (r9.y.H0(c5253e)) {
                            return c4869d.a(new C0047v(z10, abstractC5350n, c5253e.f43633e, f11, min, r10, i11, new C5654m(min, 0.0f, 0, 0, 30)));
                        }
                        if (c0049w.f315u0 == null) {
                            c0049w.f315u0 = new A.r();
                        }
                        A.r rVar = c0049w.f315u0;
                        AbstractC3557B.Z(rVar);
                        r0.E e10 = rVar.f288d;
                        if (e10 == null) {
                            e10 = androidx.compose.ui.graphics.a.g();
                            rVar.f288d = e10;
                        }
                        C5344h c5344h = (C5344h) e10;
                        c5344h.d();
                        c5344h.a(c5253e);
                        if (!z10) {
                            C5344h g10 = androidx.compose.ui.graphics.a.g();
                            g10.a(new C5253e(min, min, c5253e.b() - min, c5253e.a() - min, androidx.compose.foundation.a.m(min, c5253e.f43633e), androidx.compose.foundation.a.m(min, c5253e.f43634f), androidx.compose.foundation.a.m(min, c5253e.f43635g), androidx.compose.foundation.a.m(min, c5253e.f43636h)));
                            c5344h.c(c5344h, g10, 0);
                        }
                        return c4869d.a(new C0043t(c5344h, 1, abstractC5350n));
                    } else if (c10 instanceof C5336C) {
                        AbstractC5350n abstractC5350n2 = c0049w.f317w0;
                        if (z10) {
                            r10 = C5251c.f43619b;
                        }
                        long j10 = r10;
                        if (z10) {
                            i11 = c4869d.f40415Y.g();
                        }
                        long j11 = i11;
                        if (z10) {
                            c5653l = C5653l.f45622a;
                        } else {
                            c5653l = new C5654m(min, 0.0f, 0, 0, 30);
                        }
                        return c4869d.a(new Z(1, j10, j11, abstractC5350n2, c5653l));
                    } else {
                        throw new RuntimeException();
                    }
                }
                return c4869d.a(C0041s.f289Z);
            case 4:
                long j12 = ((C5251c) obj).f43623a;
                I i12 = (I) obj2;
                if (i12.f193u0) {
                    i12.f195w0.mo122invoke();
                }
                return yVar;
            case 5:
                AbstractC0461u abstractC0461u = (AbstractC0461u) obj;
                C0019g0 c0019g0 = (C0019g0) obj2;
                if (c0019g0.f37732r0) {
                    c0019g0.f206s0.invoke(abstractC0461u);
                    if (c0019g0.f37732r0) {
                        kVar = (wf.k) E9.f.a(c0019g0, AbstractC0015e0.f192a);
                    }
                    if (kVar != null) {
                        kVar.invoke(abstractC0461u);
                    }
                }
                return yVar;
            case 6:
                return a(((Number) obj).floatValue());
            case 7:
            case 9:
            case 18:
            case 26:
            default:
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                l0 l0Var = (l0) entry.getValue();
                E0.J j13 = (E0.J) obj2;
                int j14 = j13.f4024r0.j(key);
                if (j14 >= 0 && j14 < j13.f4016j0) {
                    z11 = false;
                } else {
                    l0Var.dispose();
                }
                return Boolean.valueOf(z11);
            case 8:
                ((d0[]) obj2)[0] = (d0) obj;
                return yVar;
            case 10:
                return a(((Number) obj).floatValue());
            case 11:
                Z.N n10 = (Z.N) obj;
                switch (i10) {
                    case 11:
                        return new C3277c(2, (G.C) obj2);
                    default:
                        return new C3277c(3, (M) obj2);
                }
            case 12:
                Z.N n11 = (Z.N) obj;
                switch (i10) {
                    case 11:
                        return new C3277c(2, (G.C) obj2);
                    default:
                        return new C3277c(3, (M) obj2);
                }
            case 13:
                return a(((Number) obj).floatValue());
            case 14:
                ((H.N) obj2).f6589b.f6547b.i(((Number) obj).floatValue());
                return yVar;
            case 15:
                Df.v[] vVarArr = L0.t.f10472a;
                L0.u uVar = L0.r.f10441C;
                Df.v vVar = L0.t.f10472a[20];
                uVar.a((L0.v) obj, (M0.a) obj2);
                return yVar;
            case 16:
                AbstractC0461u abstractC0461u2 = (AbstractC0461u) obj2;
                androidx.compose.ui.layout.a.d(abstractC0461u2).Q(abstractC0461u2, ((C5335B) obj).f44167a);
                return yVar;
            case 17:
                return a(((Number) obj).floatValue());
            case 19:
                e((Throwable) obj);
                return yVar;
            case 20:
                e((Throwable) obj);
                return yVar;
            case 21:
                c(obj);
                return yVar;
            case 22:
                c(obj);
                return yVar;
            case 23:
                c(obj);
                return yVar;
            case 24:
                ((C4708g) obj).C0((C4703b) obj2);
                return Boolean.TRUE;
            case 25:
                r0.M m10 = (r0.M) obj2;
                r0.I i13 = (r0.I) ((r0.x) obj);
                i13.e(m10.f44215s0);
                i13.f(m10.f44216t0);
                i13.a(m10.f44217u0);
                i13.m(m10.f44218v0);
                i13.o(m10.f44219w0);
                i13.h(m10.f44220x0);
                float f12 = m10.f44221y0;
                if (i13.f44190o0 != f12) {
                    i13.f44181Y |= 256;
                    i13.f44190o0 = f12;
                }
                float f13 = m10.f44222z0;
                if (i13.f44191p0 != f13) {
                    i13.f44181Y |= 512;
                    i13.f44191p0 = f13;
                }
                i13.d(m10.f44206A0);
                float f14 = m10.f44207B0;
                if (i13.f44193r0 != f14) {
                    i13.f44181Y |= 2048;
                    i13.f44193r0 = f14;
                }
                i13.l(m10.f44208C0);
                i13.i(m10.f44209D0);
                boolean z12 = m10.f44210E0;
                if (i13.f44196u0 != z12) {
                    i13.f44181Y |= 16384;
                    i13.f44196u0 = z12;
                }
                if (!AbstractC3557B.K(null, null)) {
                    i13.f44181Y |= 131072;
                }
                i13.c(m10.f44211F0);
                i13.j(m10.f44212G0);
                int i14 = m10.f44213H0;
                if (!r0.G.c(i13.f44197v0, i14)) {
                    i13.f44181Y |= 32768;
                    i13.f44197v0 = i14;
                }
                return yVar;
            case 27:
                AbstractC5939C abstractC5939C = (AbstractC5939C) obj;
                C5950c c5950c = (C5950c) obj2;
                c5950c.g(abstractC5939C);
                wf.k kVar2 = c5950c.f46906i;
                if (kVar2 != null) {
                    kVar2.invoke(abstractC5939C);
                }
                return yVar;
            case 28:
                e((Throwable) obj);
                return yVar;
        }
    }
}
