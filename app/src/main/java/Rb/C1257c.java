package Rb;

import E.AbstractC0429m;
import E.AbstractC0440y;
import E.g0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4323o;
import l8.AbstractC4344b;
import y.AbstractC6463a;

/* renamed from: Rb.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257c extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1257c f15330Z = new C1257c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1257c f15331h0 = new C1257c(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15332Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1257c(int i10) {
        super(3);
        this.f15332Y = i10;
    }

    public final void a(g0 g0Var, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        kf.v vVar = kf.v.f37483Y;
        E.A a5 = E.A.f3733a;
        C4316h c4316h = C4310b.f37705r0;
        C4323o c4323o = C4323o.f37719b;
        int i14 = 2;
        switch (this.f15332Y) {
            case 0:
                AbstractC3557B.c0("paddings", g0Var);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(g0Var)) {
                        i14 = 4;
                    }
                    i11 = i10 | i14;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(c4323o, g0Var);
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-483455358);
                E0.N a10 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar2);
                rVar2.W(-1323940314);
                int i15 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i16 = androidx.compose.ui.layout.a.i(q10);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a10, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i15))) {
                        AbstractC6463a.q(i15, rVar2, i15, c0581j);
                    }
                    AbstractC6463a.t(rVar2, i16, rVar2, 0, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                    Bi.c.I(a5, rVar2, 6);
                    U3.f.c(a11, 0.0f, 0L, rVar2, 0, 7);
                    Bi.c.L(a5, new C1272s("gizmoId", (String) null, (String) null, 6), new F("Header", "Header explanation text", AbstractC4344b.F0(new C("Call to Action", "details placeholder", "linkExplanation", "linkAttachment", null, vVar, 256))), C1256b.f15325Z, rVar2, 3078);
                    U3.f.c(a11, 0.0f, 0L, rVar2, 0, 7);
                    Bi.c.K(a5, new C1272s("gizmoId", (String) null, (String) null, 6), new C("cta", "detailsPlaceholder", "linkExplanation", "linkAttachment", null, AbstractC4344b.F0(new C1265k(EnumC1264j.f15354h0, "Single Line Text placeholder")), 256), new M(new F("header", "headerExplanation", vVar), 21), C1256b.f15326h0, rVar2, 27654);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                AbstractC3557B.c0("paddings", g0Var);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(g0Var)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i12 = i10 | i13;
                } else {
                    i12 = i10;
                }
                if ((i12 & 91) == 18) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC4326r q11 = androidx.compose.foundation.layout.a.q(c4323o, g0Var);
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(-483455358);
                E0.N a12 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar4);
                rVar4.W(-1323940314);
                int i17 = rVar4.P;
                AbstractC1732q0 p11 = rVar4.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i18 = androidx.compose.ui.layout.a.i(q11);
                if (rVar4.f22696a instanceof AbstractC1707e) {
                    rVar4.Z();
                    if (rVar4.f22695O) {
                        rVar4.o(c0582k2);
                    } else {
                        rVar4.k0();
                    }
                    U3.f.n0(rVar4, a12, C0583l.f5808f);
                    U3.f.n0(rVar4, p11, C0583l.f5807e);
                    C0581j c0581j2 = C0583l.f5809g;
                    if (rVar4.f22695O || !AbstractC3557B.K(rVar4.K(), Integer.valueOf(i17))) {
                        AbstractC6463a.q(i17, rVar4, i17, c0581j2);
                    }
                    i18.invoke(new L0(rVar4), rVar4, 0);
                    rVar4.W(2058660585);
                    Bi.c.K(a5, new C1272s("gizmoId", (String) null, (String) null, 6), new C("cta", "detailsPlaceholder", null, null, "this is a subtext", AbstractC4344b.G0(new C1265k(EnumC1264j.f15354h0, "Single Line Text placeholder"), new C1265k(EnumC1264j.f15353Z, "Multi Line Text placeholder"), new C1265k(EnumC1264j.f15355i0, "Email placeholder"), new C1265k(EnumC1264j.f15352Y, "URL placeholder")), 64), new M(new F("header", "headerExplanation", vVar), 21), C1256b.f15327i0, rVar4, 27654);
                    AbstractC6463a.v(rVar4, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f15332Y) {
            case 0:
                a((g0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((g0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
