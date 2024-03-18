package gb;

import A.AbstractC0040r0;
import A.AbstractC0044t0;
import A.AbstractC0048v0;
import Df.AbstractC0405d;
import E.AbstractC0434s;
import E0.C0452k;
import E0.C0453l;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0696o0;
import H0.AbstractC0701r0;
import H0.E0;
import I9.C0780s;
import S8.C1372p;
import W.AbstractC1530b3;
import W.C1525a3;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.m1;
import Z.o1;
import android.content.Context;
import com.openai.chatgpt.R;
import f4.C2936a;
import g4.AbstractC3181i;
import g4.C3177e;
import g4.C3180h;
import gd.AbstractC3256b;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import p9.C5100b;
import wd.C6209w;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: gb.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3242t {

    /* renamed from: a  reason: collision with root package name */
    public static final float f31514a = 64;

    /* renamed from: b  reason: collision with root package name */
    public static final float f31515b = 280;

    /* renamed from: c  reason: collision with root package name */
    public static final float f31516c = 192;

    /* JADX WARN: Removed duplicated region for block: B:122:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC3237n abstractC3237n, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        Z.r rVar;
        AbstractC4326r abstractC4326r3;
        AbstractC4326r abstractC4326r4;
        String str;
        C6209w c6209w;
        String str2;
        String str3;
        boolean z10;
        C6209w c6209w2;
        boolean z11;
        AbstractC4326r i13;
        int i14;
        int i15;
        int i16;
        AbstractC3557B.c0("data", abstractC3237n);
        AbstractC3557B.c0("onClick", abstractC6216a);
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageImage");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-742432745);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(abstractC3237n)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.i(abstractC6216a)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
            if ((i12 & 731) != 146 && rVar2.B()) {
                rVar2.P();
                abstractC4326r3 = abstractC4326r2;
                rVar = rVar2;
            } else {
                if (i17 == 0) {
                    abstractC4326r4 = a5;
                } else {
                    abstractC4326r4 = abstractC4326r2;
                }
                rVar2.W(733328855);
                E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
                rVar2.W(-1323940314);
                int i18 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i19 = androidx.compose.ui.layout.a.i(abstractC4326r4);
                if (!(rVar2.f22696a instanceof AbstractC1707e)) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, c10, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i18))) {
                        AbstractC6463a.q(i18, rVar2, i18, c0581j);
                    }
                    AbstractC6463a.r(0, i19, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("MessageImage");
                    rVar2.W(-1079671000);
                    Object K10 = rVar2.K();
                    io.sentry.hints.i iVar = C1723m.f22654Y;
                    if (K10 == iVar) {
                        K10 = new C5100b();
                        rVar2.h0(K10);
                    }
                    C5100b c5100b = (C5100b) K10;
                    Object w10 = AbstractC0044t0.w(rVar2, false, -1079670929);
                    if (w10 == iVar) {
                        w10 = new w9.j(null, 3);
                        rVar2.h0(w10);
                    }
                    w9.j jVar = (w9.j) w10;
                    rVar2.t(false);
                    if (abstractC3237n instanceof C3235l) {
                        str = ((C3235l) abstractC3237n).f31474c;
                    } else if (abstractC3237n instanceof C3236m) {
                        str = null;
                    } else {
                        throw new RuntimeException();
                    }
                    rVar2.W(-1079670691);
                    if (str != null) {
                        c6209w = new C6209w(str);
                    } else {
                        c6209w = null;
                    }
                    boolean g10 = rVar2.g(c6209w);
                    Object K11 = rVar2.K();
                    if (g10 || K11 == iVar) {
                        K11 = AbstractC4828h.Z(C3177e.f31218a, o1.f22665a);
                        rVar2.h0(K11);
                    }
                    AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K11;
                    rVar2.t(false);
                    if (str == null) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    String c11 = abstractC3237n.c();
                    rVar2.W(-1079670504);
                    if (c11 == null) {
                        str3 = Ng.H.v(R.string.conversation_image_content_description, rVar2);
                    } else {
                        str3 = c11;
                    }
                    rVar2.t(false);
                    f4.q a11 = C2936a.a((Context) rVar2.m(H0.Z.f6888b));
                    AbstractC4326r b10 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.f24739c, ((C1525a3) rVar2.m(AbstractC1530b3.f19940a)).f19905b);
                    if (str != null && (((AbstractC3181i) abstractC1710f0.getValue()) instanceof C3180h)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    AbstractC4326r a12 = AbstractC4194d.a((G0.X) a10, Bi.c.I1(b10, z10, false));
                    AbstractC0040r0 abstractC0040r0 = (AbstractC0040r0) rVar2.m(AbstractC0048v0.f314a);
                    C0780s c0780s = new C0780s(c5100b, jVar, 1);
                    rVar2.W(-1079669976);
                    if (str != null) {
                        c6209w2 = new C6209w(str);
                    } else {
                        c6209w2 = null;
                    }
                    boolean g11 = rVar2.g(c6209w2);
                    if ((i12 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z12 = g11 | z11;
                    Object K12 = rVar2.K();
                    if (z12 || K12 == iVar) {
                        K12 = new I9.B(str, 13, abstractC6216a);
                        rVar2.h0(K12);
                    }
                    rVar2.t(false);
                    i13 = androidx.compose.foundation.a.i(a12, c5100b, abstractC0040r0, true, null, null, null, c0780s, null, (AbstractC6216a) K12);
                    C0452k c0452k = C0453l.f4073a;
                    rVar2.W(-1079669563);
                    boolean g12 = rVar2.g(abstractC1710f0);
                    Object K13 = rVar2.K();
                    if (g12 || K13 == iVar) {
                        K13 = AbstractC6463a.h(abstractC1710f0, 5, rVar2);
                    }
                    wf.k kVar = (wf.k) K13;
                    rVar2.t(false);
                    rVar2.W(-1079669603);
                    boolean g13 = rVar2.g(abstractC1710f0);
                    Object K14 = rVar2.K();
                    if (g13 || K14 == iVar) {
                        K14 = AbstractC6463a.h(abstractC1710f0, 6, rVar2);
                    }
                    wf.k kVar2 = (wf.k) K14;
                    rVar2.t(false);
                    rVar2.W(-1079669643);
                    boolean g14 = rVar2.g(abstractC1710f0);
                    Object K15 = rVar2.K();
                    if (g14 || K15 == iVar) {
                        K15 = AbstractC6463a.h(abstractC1710f0, 7, rVar2);
                    }
                    rVar2.t(false);
                    A7.b.c(str2, str3, a11, i13, null, null, null, kVar, kVar2, (wf.k) K15, null, c0452k, 0.0f, null, 0, false, null, rVar2, 512, 48, 128112);
                    rVar2.W(1395698804);
                    if (abstractC3237n.c() != null) {
                        rVar = rVar2;
                        c(jVar, abstractC3237n, a10, null, rVar2, (i12 << 3) & 112, 12);
                    } else {
                        rVar = rVar2;
                    }
                    AbstractC6463a.v(rVar, false, false, true, false);
                    rVar.t(false);
                    abstractC4326r3 = abstractC4326r4;
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new bb.j0(abstractC3237n, abstractC6216a, abstractC4326r3, i10, i11, 2);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i17 == 0) {
        }
        rVar2.W(733328855);
        E0.N c102 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
        rVar2.W(-1323940314);
        int i182 = rVar2.P;
        AbstractC1732q0 p102 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i192 = androidx.compose.ui.layout.a.i(abstractC4326r4);
        if (!(rVar2.f22696a instanceof AbstractC1707e)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC3237n abstractC3237n, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        float b10;
        float a5;
        float R10;
        float R11;
        float f6;
        int i13;
        boolean z10;
        boolean z11;
        Object K10;
        int i14;
        int i15;
        int i16;
        AbstractC3557B.c0("data", abstractC3237n);
        AbstractC3557B.c0("onClick", kVar);
        AbstractC4326r a10 = io.sentry.compose.b.a("MessageImageContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-150448797);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(abstractC3237n)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(kVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
            if ((i12 & 731) != 146 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i17 == 0) {
                    abstractC4326r4 = a10;
                } else {
                    abstractC4326r4 = abstractC4326r2;
                }
                b10 = abstractC3237n.b();
                a5 = abstractC3237n.a();
                Z0.b bVar = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                float R12 = bVar.R(f31514a);
                R10 = bVar.R(f31515b);
                R11 = bVar.R(f31516c);
                if (b10 > R10 && a5 <= R11) {
                    if (b10 >= R12 && a5 >= R12) {
                        f6 = 1.0f;
                    } else {
                        f6 = Math.min(b10 / R12, abstractC3237n.a() / R12);
                    }
                } else {
                    f6 = Math.max(b10 / R10, a5 / R11);
                }
                float K11 = bVar.K(b10 / f6);
                float K12 = bVar.K(a5 / f6);
                rVar.W(477890955);
                i13 = i12 & 14;
                boolean z12 = true;
                if (i13 != 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 112) != 32) {
                    z12 = false;
                }
                z11 = z10 | z12;
                K10 = rVar.K();
                if (!z11 || K10 == C1723m.f22654Y) {
                    K10 = new C3239p(abstractC3237n, kVar, 0);
                    rVar.h0(K10);
                }
                rVar.t(false);
                a(abstractC3237n, (AbstractC6216a) K10, androidx.compose.foundation.layout.e.k(abstractC4326r4, K11, K12), rVar, i13, 0);
                abstractC4326r3 = abstractC4326r4;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new bb.j0(abstractC3237n, kVar, abstractC4326r3, i10, i11, 3);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i17 == 0) {
        }
        b10 = abstractC3237n.b();
        a5 = abstractC3237n.a();
        Z0.b bVar2 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
        float R122 = bVar2.R(f31514a);
        R10 = bVar2.R(f31515b);
        R11 = bVar2.R(f31516c);
        if (b10 > R10) {
        }
        f6 = Math.max(b10 / R10, a5 / R11);
        float K112 = bVar2.K(b10 / f6);
        float K122 = bVar2.K(a5 / f6);
        rVar.W(477890955);
        i13 = i12 & 14;
        boolean z122 = true;
        if (i13 != 4) {
        }
        if ((i12 & 112) != 32) {
        }
        z11 = z10 | z122;
        K10 = rVar.K();
        if (!z11) {
        }
        K10 = new C3239p(abstractC3237n, kVar, 0);
        rVar.h0(K10);
        rVar.t(false);
        a(abstractC3237n, (AbstractC6216a) K10, androidx.compose.foundation.layout.e.k(abstractC4326r4, K112, K122), rVar, i13, 0);
        abstractC4326r3 = abstractC4326r4;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(w9.j jVar, AbstractC3237n abstractC3237n, AbstractC4326r abstractC4326r, sb.x xVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        sb.x xVar2;
        sb.x xVar3;
        AbstractC4326r abstractC4326r3;
        Ad.g y02;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageImageContextMenu");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1746565247);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(jVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(abstractC3237n)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
            if ((i10 & 7168) != 0) {
                if ((i11 & 8) == 0) {
                    xVar2 = xVar;
                    if (rVar.g(xVar2)) {
                        i13 = 2048;
                        i12 |= i13;
                    }
                } else {
                    xVar2 = xVar;
                }
                i13 = 1024;
                i12 |= i13;
            } else {
                xVar2 = xVar;
            }
            if ((i12 & 5851) != 1170 && rVar.B()) {
                rVar.P();
            } else {
                rVar.R();
                if ((i10 & 1) == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    abstractC4326r3 = abstractC4326r2;
                } else {
                    if (i17 == 0) {
                        a5 = abstractC4326r2;
                    }
                    if ((i11 & 8) == 0) {
                        rVar.W(-490350905);
                        Context context = (Context) rVar.m(H0.Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar.m(E0.f6720a)).booleanValue();
                        List list = (List) rVar.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar.m(Ad.k.f814a);
                        androidx.lifecycle.e0 a10 = m2.b.a(rVar);
                        if (a10 != null) {
                            Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                            AbstractC0405d b10 = d10.b(sb.x.class);
                            AbstractC4326r abstractC4326r4 = a5;
                            AbstractC0405d b11 = d10.b(sb.w.class);
                            rVar.W(608026872);
                            boolean g10 = rVar.g(b11) | rVar.g(b10) | rVar.g(list) | rVar.g(vVar) | rVar.h(booleanValue);
                            Object K10 = rVar.K();
                            if (g10 || K10 == C1723m.f22654Y) {
                                if (booleanValue) {
                                    y02 = AbstractC4344b.z0(d10.b(sb.w.class), d10.b(sb.x.class), context, list2);
                                } else if (!booleanValue) {
                                    y02 = AbstractC4344b.y0(d10.b(sb.x.class), a10, vVar, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K10 = y02;
                                rVar.h0(K10);
                            }
                            rVar.t(false);
                            rVar.t(false);
                            sb.x xVar4 = (sb.x) ((Ad.g) K10);
                            i12 &= -7169;
                            abstractC4326r3 = abstractC4326r4;
                            xVar3 = xVar4;
                            rVar.u();
                            int i18 = (i12 & 14) | 384 | ((i12 >> 3) & 112);
                            K8.d.Q(jVar, abstractC4326r3, R4.b.X(rVar, -1453632237, new Q8.i(abstractC3237n, new F.s(abstractC3237n, jVar, (AbstractC0696o0) rVar.m(AbstractC0701r0.f7001d), 20), new C3240q(xVar3, jVar, 0), 7)), rVar, i18, 0);
                            abstractC4326r2 = abstractC4326r3;
                            xVar2 = xVar3;
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        abstractC4326r3 = a5;
                    }
                }
                xVar3 = xVar2;
                rVar.u();
                int i182 = (i12 & 14) | 384 | ((i12 >> 3) & 112);
                K8.d.Q(jVar, abstractC4326r3, R4.b.X(rVar, -1453632237, new Q8.i(abstractC3237n, new F.s(abstractC3237n, jVar, (AbstractC0696o0) rVar.m(AbstractC0701r0.f7001d), 20), new C3240q(xVar3, jVar, 0), 7)), rVar, i182, 0);
                abstractC4326r2 = abstractC4326r3;
                xVar2 = xVar3;
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new G.I(jVar, abstractC3237n, abstractC4326r2, xVar2, i10, i11, 13);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 7168) != 0) {
        }
        if ((i12 & 5851) != 1170) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i17 == 0) {
        }
        if ((i11 & 8) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(C3238o c3238o, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("listData", c3238o);
        AbstractC3557B.c0("onClick", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageImageListContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1847578017);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(c3238o)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(kVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 731) != 146 && rVar.B()) {
                rVar.P();
            } else {
                if (i16 == 0) {
                    a5 = abstractC4326r2;
                }
                m1 m1Var = AbstractC0701r0.f7002e;
                int i17 = ((i12 >> 6) & 14) | 3072;
                androidx.compose.foundation.layout.a.a(a5, null, false, R4.b.X(rVar, -2065964855, new C1372p(((Z0.b) rVar.m(m1Var)).a0(p9.r.f42840d), ((Z0.b) rVar.m(m1Var)).a0(f31515b), c3238o, kVar)), rVar, i17, 6);
                abstractC4326r2 = a5;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new bb.j0(c3238o, kVar, abstractC4326r2, i10, i11, 4);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        m1 m1Var2 = AbstractC0701r0.f7002e;
        int i172 = ((i12 >> 6) & 14) | 3072;
        androidx.compose.foundation.layout.a.a(a5, null, false, R4.b.X(rVar, -2065964855, new C1372p(((Z0.b) rVar.m(m1Var2)).a0(p9.r.f42840d), ((Z0.b) rVar.m(m1Var2)).a0(f31515b), c3238o, kVar)), rVar, i172, 6);
        abstractC4326r2 = a5;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
