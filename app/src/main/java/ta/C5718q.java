package ta;

import A.AbstractC0044t0;
import E.AbstractC0429m;
import E.p0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0583l;
import W.AbstractC1523a1;
import W.P0;
import W.R0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1735s0;
import Z.C1723m;
import Z.L0;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import y.C6480s;

/* renamed from: ta.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5718q extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f45991Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f45992Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f45993h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f45994i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f45995j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f45996k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5718q(boolean z10, boolean z11, wf.k kVar, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3) {
        super(4);
        this.f45991Y = z10;
        this.f45992Z = z11;
        this.f45993h0 = kVar;
        this.f45994i0 = abstractC6216a;
        this.f45995j0 = abstractC6216a2;
        this.f45996k0 = abstractC6216a3;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
        ((Number) obj4).intValue();
        AbstractC3557B.c0("$this$AnimatedContent", (C6480s) obj);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("FileUploadControl");
        Object obj5 = C1723m.f22654Y;
        boolean z10 = this.f45992Z;
        boolean z11 = this.f45991Y;
        wf.k kVar = this.f45993h0;
        if (!booleanValue && (!z11 || z10)) {
            Z.r rVar = (Z.r) abstractC1725n;
            rVar.W(695494282);
            rVar.W(695494331);
            boolean g10 = rVar.g(kVar);
            Object K10 = rVar.K();
            if (g10 || K10 == obj5) {
                K10 = AbstractC0044t0.t(19, kVar, rVar);
            }
            rVar.t(false);
            R4.b.l((AbstractC6216a) K10, a5, false, null, null, null, AbstractC5707f.f45946d, rVar, 1572864, 62);
            rVar.t(false);
        } else {
            Z.r rVar2 = (Z.r) abstractC1725n;
            rVar2.W(695491383);
            rVar2.W(693286680);
            E0.N a10 = p0.a(AbstractC0429m.f3907a, C4310b.f37702o0, rVar2);
            rVar2.W(-1323940314);
            int i10 = rVar2.P;
            AbstractC1732q0 p10 = rVar2.p();
            AbstractC0584m.f5811i.getClass();
            AbstractC6216a abstractC6216a = C0583l.f5804b;
            C3288a i11 = androidx.compose.ui.layout.a.i(c4323o);
            if (rVar2.f22696a instanceof AbstractC1707e) {
                rVar2.Z();
                if (rVar2.f22695O) {
                    rVar2.o(abstractC6216a);
                } else {
                    rVar2.k0();
                }
                U3.f.n0(rVar2, a10, C0583l.f5808f);
                U3.f.n0(rVar2, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i10))) {
                    AbstractC6463a.q(i10, rVar2, i10, c0581j);
                }
                AbstractC6463a.r(0, i11, new L0(rVar2), rVar2, 2058660585);
                rVar2.W(-2126714770);
                if (z10) {
                    rVar2.W(-2126714683);
                    boolean g11 = rVar2.g(kVar);
                    AbstractC6216a abstractC6216a2 = this.f45994i0;
                    boolean g12 = g11 | rVar2.g(abstractC6216a2);
                    Object K11 = rVar2.K();
                    if (g12 || K11 == obj5) {
                        K11 = new C5717p(kVar, abstractC6216a2, 0);
                        rVar2.h0(K11);
                    }
                    rVar2.t(false);
                    float f6 = AbstractC5719s.f46007a;
                    AbstractC4326r m10 = androidx.compose.foundation.layout.e.m(c4323o, f6);
                    AbstractC1735s0 abstractC1735s0 = R0.f19593a;
                    R4.b.o((AbstractC6216a) K11, m10, false, AbstractC1523a1.g(0L, ((P0) rVar2.m(abstractC1735s0)).f19515a, 0L, rVar2, 0, 13), null, AbstractC5707f.f45943a, rVar2, 196656, 20);
                    rVar2.W(-2126713676);
                    boolean g13 = rVar2.g(kVar);
                    AbstractC6216a abstractC6216a3 = this.f45995j0;
                    boolean g14 = g13 | rVar2.g(abstractC6216a3);
                    Object K12 = rVar2.K();
                    if (g14 || K12 == obj5) {
                        K12 = new C5717p(kVar, abstractC6216a3, 1);
                        rVar2.h0(K12);
                    }
                    rVar2.t(false);
                    R4.b.o((AbstractC6216a) K12, androidx.compose.foundation.layout.e.m(c4323o, f6), false, AbstractC1523a1.g(0L, ((P0) rVar2.m(abstractC1735s0)).f19515a, 0L, rVar2, 0, 13), null, AbstractC5707f.f45944b, rVar2, 196656, 20);
                }
                rVar2.t(false);
                rVar2.W(695493482);
                if (z11) {
                    rVar2.W(-2126712607);
                    boolean g15 = rVar2.g(kVar);
                    AbstractC6216a abstractC6216a4 = this.f45996k0;
                    boolean g16 = g15 | rVar2.g(abstractC6216a4);
                    Object K13 = rVar2.K();
                    if (g16 || K13 == obj5) {
                        K13 = new C5717p(kVar, abstractC6216a4, 2);
                        rVar2.h0(K13);
                    }
                    rVar2.t(false);
                    R4.b.o((AbstractC6216a) K13, androidx.compose.foundation.layout.e.m(c4323o, AbstractC5719s.f46007a), false, AbstractC1523a1.g(0L, ((P0) rVar2.m(R0.f19593a)).f19515a, 0L, rVar2, 0, 13), null, AbstractC5707f.f45945c, rVar2, 196656, 20);
                }
                AbstractC6463a.v(rVar2, false, false, true, false);
                rVar2.t(false);
                rVar2.t(false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        return jf.y.f36177a;
    }
}
