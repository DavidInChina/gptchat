package ta;

import A.AbstractC0040r0;
import A.AbstractC0044t0;
import A.AbstractC0048v0;
import E.AbstractC0434s;
import F.AbstractC0528b;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import I9.C0780s;
import W.AbstractC1523a1;
import W.AbstractC1530b3;
import W.AbstractC1607r1;
import W.AbstractC1617t1;
import W.C1525a3;
import W.E1;
import W.G3;
import W.I2;
import W.P0;
import W.R0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.m1;
import android.net.Uri;
import androidx.compose.material3.MinimumInteractiveModifier;
import cb.C2334C;
import cb.C2364e;
import com.openai.chatgpt.R;
import h0.C3288a;
import ic.C3536f;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jc.C3942j;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4323o;
import nf.AbstractC4828h;
import p9.C5100b;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import wd.AbstractC6211y;
import wd.C6174I;
import wd.C6208v;
import wd.C6209w;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import y.C6473k;
import za.AbstractC6790g;
import za.C6786c;
import za.C6787d;
import za.C6788e;
import za.C6789f;

/* renamed from: ta.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5721u extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46011Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f46012Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f46013h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5721u(List list, wf.k kVar, int i10) {
        super(4);
        this.f46011Y = i10;
        this.f46012Z = list;
        this.f46013h0 = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x02f5, code lost:
        if (id.AbstractC3557B.K(r3.K(), java.lang.Integer.valueOf(r9)) == false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AbstractC0528b abstractC0528b, int i10, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        C6788e c6788e;
        AbstractC6211y abstractC6211y;
        C0581j c0581j;
        String str;
        C6786c c6786c;
        Uri uri;
        C0582k c0582k;
        C4323o c4323o;
        Integer num;
        boolean z10;
        boolean z11;
        Integer num2;
        Uri uri2;
        io.sentry.hints.i iVar;
        boolean z12;
        boolean z13;
        boolean z14;
        C5953f c5953f;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        AbstractC4326r i22;
        int i23;
        int i24;
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        C4323o c4323o2 = C4323o.f37719b;
        int i25 = this.f46011Y;
        wf.k kVar = this.f46013h0;
        List list = this.f46012Z;
        int i26 = 2;
        switch (i25) {
            case 0:
                if ((i11 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(abstractC0528b)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i12 = i11 | i15;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((Z.r) abstractC1725n).e(i10)) {
                        i14 = 32;
                    } else {
                        i14 = 16;
                    }
                    i12 |= i14;
                }
                if ((i12 & 731) == 146) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Map.Entry entry = (Map.Entry) list.get(i10);
                L0.u uVar = io.sentry.compose.b.f34309a;
                Uri uri3 = (Uri) entry.getKey();
                C6786c c6786c2 = (C6786c) entry.getValue();
                AbstractC6790g abstractC6790g = c6786c2.f51784b;
                if (abstractC6790g instanceof C6788e) {
                    c6788e = (C6788e) abstractC6790g;
                } else {
                    c6788e = null;
                }
                if (c6788e != null) {
                    abstractC6211y = c6788e.f51786a;
                } else {
                    abstractC6211y = null;
                }
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(733328855);
                C4318j c4318j = C4310b.f37693Y;
                E0.N c10 = AbstractC0434s.c(c4318j, false, rVar2);
                rVar2.W(-1323940314);
                int i27 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i28 = androidx.compose.ui.layout.a.i(c4323o2);
                boolean z15 = rVar2.f22696a instanceof AbstractC1707e;
                if (z15) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k2);
                    } else {
                        rVar2.k0();
                    }
                    C0581j c0581j2 = C0583l.f5808f;
                    U3.f.n0(rVar2, c10, c0581j2);
                    C0581j c0581j3 = C0583l.f5807e;
                    U3.f.n0(rVar2, p10, c0581j3);
                    C0581j c0581j4 = C0583l.f5809g;
                    if (!rVar2.f22695O) {
                        c0581j = c0581j3;
                        break;
                    } else {
                        c0581j = c0581j3;
                    }
                    AbstractC6463a.q(i27, rVar2, i27, c0581j4);
                    AbstractC6463a.t(rVar2, i28, rVar2, 0, 2058660585);
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
                    AbstractC4326r a5 = io.sentry.compose.b.a("InputAttachmentsView");
                    boolean z16 = abstractC6211y instanceof C6174I;
                    Jc.E e10 = c6786c2.f51783a;
                    if (z16) {
                        str = ((C6174I) abstractC6211y).f48346e;
                        if (str == null) {
                            if (e10 == Jc.E.f9042i0) {
                                C6208v c6208v = C6209w.Companion;
                                String uri4 = uri3.toString();
                                AbstractC3557B.b0("toString(...)", uri4);
                                c6208v.getClass();
                                str = C6208v.a(uri4);
                            }
                            str = null;
                        }
                        C4318j c4318j2 = C4310b.f37697j0;
                        if (str == null) {
                            rVar2.W(2096580905);
                            uri = uri3;
                            c6786c = c6786c2;
                            r9.y.b(str, Ng.H.v(R.string.conversation_attachment_content_description, rVar2), androidx.compose.foundation.a.h(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.j(c4323o2, AbstractC5723w.f46020a), ((C1525a3) rVar2.m(AbstractC1530b3.f19940a)).f19905b), new I9.B(kVar, 3, abstractC6211y)), rVar2, 1572864);
                            rVar2.t(false);
                            num = 0;
                            c4323o = c4323o2;
                            c0582k = c0582k2;
                        } else {
                            c6786c = c6786c2;
                            uri = uri3;
                            rVar2.W(2096581534);
                            c4323o = c4323o2;
                            AbstractC4326r d10 = androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.j(c4323o2, AbstractC5723w.f46020a), ((C1525a3) rVar2.m(AbstractC1530b3.f19940a)).f19905b), ((P0) rVar2.m(R0.f19593a)).f19532p, r0.G.f44171a);
                            rVar2.W(733328855);
                            E0.N c11 = AbstractC0434s.c(c4318j, false, rVar2);
                            rVar2.W(-1323940314);
                            int i29 = rVar2.P;
                            AbstractC1732q0 p11 = rVar2.p();
                            C3288a i30 = androidx.compose.ui.layout.a.i(d10);
                            if (z15) {
                                rVar2.Z();
                                if (rVar2.f22695O) {
                                    rVar2.o(c0582k2);
                                } else {
                                    rVar2.k0();
                                }
                                U3.f.n0(rVar2, c11, c0581j2);
                                C0581j c0581j5 = c0581j;
                                U3.f.n0(rVar2, p11, c0581j5);
                                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i29))) {
                                    AbstractC6463a.q(i29, rVar2, i29, c0581j4);
                                }
                                AbstractC6463a.t(rVar2, i30, rVar2, 0, 2058660585);
                                C5953f c5953f2 = AbstractC4828h.f40333o;
                                if (c5953f2 != null) {
                                    c5953f = c5953f2;
                                    num = 0;
                                    c0581j = c0581j5;
                                    c0582k = c0582k2;
                                    i13 = R.string.conversation_attachment_content_description;
                                } else {
                                    num = 0;
                                    c0581j = c0581j5;
                                    float f6 = (float) 24.0d;
                                    C5952e c5952e = new C5952e("Folder", f6, f6, 24.0f, 24.0f, 0L, 0, false, 224);
                                    int i31 = AbstractC5944H.f46870a;
                                    kf.v vVar = kf.v.f37483Y;
                                    c5952e.a("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, vVar);
                                    c5952e.d();
                                    c5952e.a("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, vVar);
                                    r0.N n10 = new r0.N(androidx.compose.ui.graphics.a.b(0));
                                    r0.N n11 = new r0.N(androidx.compose.ui.graphics.a.c(4278190080L));
                                    Wh.p p12 = R.a.p(0, 5.0f, 4.0f);
                                    p12.g(3.8954f, 4.0f, 3.0f, 4.8954f, 3.0f, 6.0f);
                                    p12.w(17.0f);
                                    p12.g(3.0f, 18.1046f, 3.8954f, 19.0f, 5.0f, 19.0f);
                                    p12.l(19.0f);
                                    p12.g(20.1046f, 19.0f, 21.0f, 18.1046f, 21.0f, 17.0f);
                                    p12.w(8.0f);
                                    p12.g(21.0f, 6.8954f, 20.1046f, 6.0f, 19.0f, 6.0f);
                                    p12.l(12.8284f);
                                    p12.g(12.298f, 6.0f, 11.7893f, 5.7893f, 11.4142f, 5.4142f);
                                    p12.n(10.5858f, 4.5858f);
                                    p12.g(10.2107f, 4.2107f, 9.702f, 4.0f, 9.1716f, 4.0f);
                                    p12.l(5.0f);
                                    p12.f();
                                    C5952e.b(c5952e, p12.f21239a, 0, n10, n11, 2.0f, 1, 0, 4.0f);
                                    r0.N n12 = new r0.N(androidx.compose.ui.graphics.a.b(0));
                                    r0.N n13 = new r0.N(androidx.compose.ui.graphics.a.c(4278190080L));
                                    ArrayList arrayList = new ArrayList(32);
                                    c0582k = c0582k2;
                                    arrayList.add(new v0.n(3.0f, 11.0f));
                                    arrayList.add(new v0.l(21.0f));
                                    C5952e.b(c5952e, arrayList, 0, n12, n13, 2.0f, 0, 0, 4.0f);
                                    c5952e.d();
                                    C5953f c12 = c5952e.c();
                                    AbstractC4828h.f40333o = c12;
                                    c5953f = c12;
                                    i13 = R.string.conversation_attachment_content_description;
                                }
                                AbstractC1607r1.b(c5953f, Ng.H.v(i13, rVar2), bVar.a(c4323o, c4318j2), 0L, rVar2, 0, 8);
                                AbstractC6463a.v(rVar2, false, true, false, false);
                                rVar2.t(false);
                            } else {
                                R4.b.r1();
                                throw null;
                            }
                        }
                        rVar2.W(2096582291);
                        C6786c c6786c3 = c6786c;
                        AbstractC6790g abstractC6790g2 = c6786c3.f51784b;
                        z10 = abstractC6790g2 instanceof C6788e;
                        if (!z10) {
                            G3.a(androidx.compose.foundation.layout.e.j(c4323o, AbstractC5723w.f46020a), ((C1525a3) rVar2.m(AbstractC1530b3.f19940a)).f19905b, r0.r.b(((P0) rVar2.m(R0.f19593a)).f19495C, 0.38f), 0L, 0.0f, 0.0f, null, AbstractC5708g.f45947a, rVar2, 12582918, 120);
                        }
                        rVar2.t(false);
                        z11 = abstractC6790g2 instanceof C6789f;
                        if (!z11) {
                            rVar2.W(2096582776);
                            Float f10 = ((C6789f) abstractC6790g2).f51787a;
                            if (f10 != null) {
                                rVar2.W(2096582884);
                                rVar2.W(2096582954);
                                boolean g10 = rVar2.g(f10);
                                Object K10 = rVar2.K();
                                iVar = iVar2;
                                if (g10 || K10 == iVar) {
                                    K10 = new d9.h(11, f10);
                                    rVar2.h0(K10);
                                }
                                rVar2.t(false);
                                I2.a((AbstractC6216a) K10, bVar.a(c4323o, c4318j2), ((P0) rVar2.m(R0.f19593a)).f19532p, 0.0f, 0L, 0, rVar2, 0, 56);
                                rVar2.t(false);
                                z14 = false;
                            } else {
                                iVar = iVar2;
                                rVar2.W(2096583211);
                                I2.b(bVar.a(c4323o, c4318j2), ((P0) rVar2.m(R0.f19593a)).f19532p, 0.0f, 0L, 0, rVar2, 0, 28);
                                z14 = false;
                                rVar2.t(false);
                            }
                            rVar2.t(z14);
                            num2 = num;
                            uri2 = uri;
                        } else {
                            iVar = iVar2;
                            if (abstractC6790g2 instanceof C6787d) {
                                rVar2.W(2096583528);
                                uri2 = uri;
                                num2 = num;
                                R4.b.l(new F.s(kVar, uri2, c6786c3, 12), bVar.a(c4323o, c4318j2), false, null, AbstractC1523a1.e(((P0) rVar2.m(R0.f19593a)).f19541y, rVar2, 0, 14), null, AbstractC5708g.f45948b, rVar2, 1572864, 44);
                                rVar2.t(false);
                            } else {
                                num2 = num;
                                uri2 = uri;
                                if (z10) {
                                    rVar2.W(2096584221);
                                    rVar2.t(false);
                                } else {
                                    rVar2.W(2096584241);
                                    rVar2.t(false);
                                }
                            }
                        }
                        rVar2.W(1914522785);
                        if (z11) {
                            AbstractC4326r a10 = bVar.a(c4323o, C4310b.f37695h0);
                            float f11 = p9.r.f42838b;
                            AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(a10, f11);
                            float f12 = p9.q.f42832c;
                            AbstractC4326r j6 = androidx.compose.foundation.layout.e.j(r10, f12);
                            rVar2.W(2096584700);
                            Object K11 = rVar2.K();
                            if (K11 == iVar) {
                                K11 = kotlin.jvm.internal.m.d();
                                rVar2.h0(K11);
                            }
                            rVar2.t(false);
                            AbstractC4326r g11 = androidx.compose.foundation.a.g(j6, (D.m) K11, V.v.a(false, (f12 / 2) - f11, rVar2, 6, 4), false, null, new I9.B(kVar, 4, uri2), 28);
                            m1 m1Var = AbstractC1617t1.f20423a;
                            AbstractC4326r a11 = AbstractC4194d.a((G0.X) a5, g11.g(MinimumInteractiveModifier.f24779b));
                            rVar2.W(733328855);
                            E0.N c13 = AbstractC0434s.c(c4318j2, false, rVar2);
                            rVar2.W(-1323940314);
                            int i32 = rVar2.P;
                            AbstractC1732q0 p13 = rVar2.p();
                            C3288a i33 = androidx.compose.ui.layout.a.i(a11);
                            if (z15) {
                                rVar2.Z();
                                if (rVar2.f22695O) {
                                    rVar2.o(c0582k);
                                } else {
                                    rVar2.k0();
                                }
                                U3.f.n0(rVar2, c13, c0581j2);
                                U3.f.n0(rVar2, p13, c0581j);
                                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i32))) {
                                    AbstractC6463a.q(i32, rVar2, i32, c0581j4);
                                }
                                AbstractC6463a.t(rVar2, i33, rVar2, num2, 2058660585);
                                G3.a(io.sentry.compose.b.a("InputAttachmentsView"), K.f.f9317a, 0L, 0L, 0.0f, 0.0f, null, AbstractC5708g.f45949c, rVar2, 12582912, 125);
                                z13 = false;
                                z12 = true;
                                AbstractC6463a.v(rVar2, false, true, false, false);
                            } else {
                                R4.b.r1();
                                throw null;
                            }
                        } else {
                            z13 = false;
                            z12 = true;
                        }
                        AbstractC6463a.v(rVar2, z13, z13, z12, z13);
                        rVar2.t(z13);
                        return;
                    }
                    if (abstractC6211y instanceof wd.Y) {
                        str = ((wd.Y) abstractC6211y).f48372a;
                    } else {
                        if (e10 == Jc.E.f9042i0) {
                            C6208v c6208v2 = C6209w.Companion;
                            String uri5 = uri3.toString();
                            AbstractC3557B.b0("toString(...)", uri5);
                            c6208v2.getClass();
                            str = C6208v.a(uri5);
                        }
                        str = null;
                    }
                    C4318j c4318j22 = C4310b.f37697j0;
                    if (str == null) {
                    }
                    rVar2.W(2096582291);
                    C6786c c6786c32 = c6786c;
                    AbstractC6790g abstractC6790g22 = c6786c32.f51784b;
                    z10 = abstractC6790g22 instanceof C6788e;
                    if (!z10) {
                    }
                    rVar2.t(false);
                    z11 = abstractC6790g22 instanceof C6789f;
                    if (!z11) {
                    }
                    rVar2.W(1914522785);
                    if (z11) {
                    }
                    AbstractC6463a.v(rVar2, z13, z13, z12, z13);
                    rVar2.t(z13);
                    return;
                }
                R4.b.r1();
                throw null;
            case 1:
                if ((i11 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(abstractC0528b)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i16 = i11 | i18;
                } else {
                    i16 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((Z.r) abstractC1725n).e(i10)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i16 |= i17;
                }
                if ((i16 & 731) == 146) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                C2364e c2364e = (C2364e) list.get(i10);
                AbstractC4326r a12 = io.sentry.compose.b.a("InputGizmoActionsView");
                C3288a X10 = R4.b.X(abstractC1725n, -1857161473, new C6473k(20, c2364e));
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(1333237372);
                boolean g12 = rVar4.g(kVar) | rVar4.g(c2364e);
                Object K12 = rVar4.K();
                if (g12 || K12 == iVar2) {
                    K12 = new I9.B(kVar, 5, c2364e);
                    rVar4.h0(K12);
                }
                rVar4.t(false);
                Df.H.g(X10, (AbstractC6216a) K12, a12, null, null, false, null, null, null, rVar4, 6, 508);
                return;
            case 2:
                if ((i11 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(abstractC0528b)) {
                        i26 = 4;
                    }
                    i19 = i11 | i26;
                } else {
                    i19 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((Z.r) abstractC1725n).e(i10)) {
                        i20 = 32;
                    } else {
                        i20 = 16;
                    }
                    i19 |= i20;
                }
                if ((i19 & 731) == 146) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                C2334C c2334c = (C2334C) list.get(i10);
                AbstractC4326r a13 = io.sentry.compose.b.a("InputGizmoMentionsView");
                C3288a X11 = R4.b.X(abstractC1725n, 1046329524, new G9.n(c2334c, 3));
                Z.r rVar6 = (Z.r) abstractC1725n;
                rVar6.W(-1479318867);
                boolean g13 = rVar6.g(kVar) | rVar6.g(c2334c);
                Object K13 = rVar6.K();
                if (g13 || K13 == iVar2) {
                    K13 = new G9.l(3, c2334c, kVar);
                    rVar6.h0(K13);
                }
                rVar6.t(false);
                Df.H.g(X11, (AbstractC6216a) K13, a13, R4.b.X(rVar6, 1982648145, new G9.n(c2334c, 4)), R4.b.X(rVar6, -2000212944, new G9.n(c2334c, 5)), false, null, null, null, rVar6, 27654, 484);
                return;
            default:
                if ((i11 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(abstractC0528b)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i21 = i11 | i24;
                } else {
                    i21 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((Z.r) abstractC1725n).e(i10)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i21 |= i23;
                }
                if ((i21 & 731) == 146) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                C3942j c3942j = (C3942j) list.get(i10);
                AbstractC4326r a14 = io.sentry.compose.b.a("<anonymous>");
                Z.r rVar8 = (Z.r) abstractC1725n;
                rVar8.W(1256091994);
                Object K14 = rVar8.K();
                if (K14 == iVar2) {
                    K14 = new w9.j(null, 3);
                    rVar8.h0(K14);
                }
                w9.j jVar = (w9.j) K14;
                Object w10 = AbstractC0044t0.w(rVar8, false, 1256092076);
                if (w10 == iVar2) {
                    w10 = new C5100b();
                    rVar8.h0(w10);
                }
                C5100b c5100b = (C5100b) w10;
                rVar8.t(false);
                C3288a X12 = R4.b.X(rVar8, 1896146271, new Jb.c(6, c3942j));
                i22 = androidx.compose.foundation.a.i(c4323o2, c5100b, (AbstractC0040r0) rVar8.m(AbstractC0048v0.f314a), true, null, null, null, new C0780s(c5100b, jVar, 2), null, C3536f.f33023Z);
                E1.a(X12, i22, null, null, null, null, null, 0.0f, 0.0f, rVar8, 6, 508);
                rVar8.W(1256093058);
                boolean g14 = rVar8.g(kVar) | rVar8.g(c3942j);
                Object K15 = rVar8.K();
                if (g14 || K15 == iVar2) {
                    K15 = new I9.B(kVar, 24, c3942j);
                    rVar8.h0(K15);
                }
                rVar8.t(false);
                K8.d.c0(jVar, (AbstractC6216a) K15, a14, rVar8, 0, 4);
                return;
        }
    }

    @Override // wf.p
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f46011Y) {
            case 0:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 1:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 2:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            default:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
        }
    }
}
