package ta;

import Df.AbstractC0408g;
import E.AbstractC0429m;
import E.AbstractC0440y;
import E.C0423g;
import E.C0426j;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0583l;
import I9.c1;
import L.C0863n0;
import L.C0865o0;
import W.AbstractC1617t1;
import W.G3;
import W.U2;
import Z.AbstractC1707e;
import Z.AbstractC1708e0;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import Z.m1;
import androidx.compose.material3.MinimumInteractiveModifier;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4323o;
import na.C4748e0;
import na.D1;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import za.C6783B;

/* renamed from: ta.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5687C extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45805Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6783B f45806Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0408g f45807h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ p0.l f45808i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f45809j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ D.m f45810k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f45811l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1708e0 f45812m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ D1 f45813n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0408g f45814o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5687C(C6783B c6783b, AbstractC0408g abstractC0408g, p0.l lVar, AbstractC6216a abstractC6216a, D.m mVar, AbstractC1710f0 abstractC1710f0, AbstractC1708e0 abstractC1708e0, D1 d12, AbstractC0408g abstractC0408g2, int i10) {
        super(2);
        this.f45805Y = i10;
        this.f45806Z = c6783b;
        this.f45807h0 = abstractC0408g;
        this.f45808i0 = lVar;
        this.f45809j0 = abstractC6216a;
        this.f45810k0 = mVar;
        this.f45811l0 = abstractC1710f0;
        this.f45812m0 = abstractC1708e0;
        this.f45813n0 = d12;
        this.f45814o0 = abstractC0408g2;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        AbstractC6216a abstractC6216a;
        C0581j c0581j;
        boolean z10;
        C6783B c6783b;
        boolean z11;
        C4323o c4323o = C4323o.f37719b;
        switch (this.f45805Y) {
            case 0:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-483455358);
                C0423g c0423g = AbstractC0429m.f3909c;
                C4316h c4316h = C4310b.f37705r0;
                E0.N a5 = AbstractC0440y.a(c0423g, c4316h, rVar2);
                rVar2.W(-1323940314);
                int i11 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                AbstractC6216a abstractC6216a2 = C0583l.f5804b;
                C3288a i12 = androidx.compose.ui.layout.a.i(c4323o);
                boolean z12 = rVar2.f22696a instanceof AbstractC1707e;
                if (z12) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(abstractC6216a2);
                    } else {
                        rVar2.k0();
                    }
                    C0581j c0581j2 = C0583l.f5808f;
                    U3.f.n0(rVar2, a5, c0581j2);
                    C0581j c0581j3 = C0583l.f5807e;
                    U3.f.n0(rVar2, p10, c0581j3);
                    C0581j c0581j4 = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                        AbstractC6463a.q(i11, rVar2, i11, c0581j4);
                    }
                    AbstractC6463a.r(0, i12, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("InputPanel");
                    rVar2.W(-602883070);
                    C6783B c6783b2 = this.f45806Z;
                    boolean z13 = !c6783b2.f51762e.isEmpty();
                    AbstractC0408g abstractC0408g = this.f45807h0;
                    if (z13) {
                        c0581j = c0581j2;
                        z10 = z12;
                        abstractC6216a = abstractC6216a2;
                        AbstractC5723w.a(c6783b2, (wf.k) abstractC0408g, androidx.compose.foundation.layout.a.s(c4323o, p9.r.f42841e, p9.r.f42840d), rVar2, 0, 0);
                    } else {
                        c0581j = c0581j2;
                        z10 = z12;
                        abstractC6216a = abstractC6216a2;
                    }
                    rVar2.t(false);
                    rVar2.W(-602882627);
                    List<Aa.f> list = c6783b2.f51763f;
                    if (!list.isEmpty()) {
                        C0426j g10 = AbstractC0429m.g(p9.r.f42839c);
                        c6783b = c6783b2;
                        AbstractC4326r a11 = AbstractC4194d.a((G0.X) a10, androidx.compose.foundation.layout.a.v(c4323o, p9.r.f42841e, p9.r.f42840d, 0.0f, 0.0f, 12));
                        rVar2.W(-483455358);
                        E0.N a12 = AbstractC0440y.a(g10, c4316h, rVar2);
                        rVar2.W(-1323940314);
                        int i13 = rVar2.P;
                        AbstractC1732q0 p11 = rVar2.p();
                        C3288a i14 = androidx.compose.ui.layout.a.i(a11);
                        if (z10) {
                            rVar2.Z();
                            if (rVar2.f22695O) {
                                rVar2.o(abstractC6216a);
                            } else {
                                rVar2.k0();
                            }
                            U3.f.n0(rVar2, a12, c0581j);
                            U3.f.n0(rVar2, p11, c0581j3);
                            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                                AbstractC6463a.q(i13, rVar2, i13, c0581j4);
                            }
                            z11 = false;
                            AbstractC6463a.r(0, i14, new L0(rVar2), rVar2, 2058660585);
                            rVar2.W(-602882257);
                            for (Aa.f fVar : list) {
                                r9.y.m(fVar, new s3.r(abstractC0408g, 28, fVar), rVar2, 0);
                            }
                            abstractC0408g = abstractC0408g;
                            AbstractC6463a.v(rVar2, false, false, true, false);
                            rVar2.t(false);
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    } else {
                        c6783b = c6783b2;
                        z11 = false;
                    }
                    rVar2.t(z11);
                    rVar2.W(-602881742);
                    boolean g11 = rVar2.g(abstractC0408g);
                    Object K10 = rVar2.K();
                    Object obj = C1723m.f22654Y;
                    if (g11 || K10 == obj) {
                        K10 = new c1(abstractC0408g, 4);
                        rVar2.h0(K10);
                    }
                    wf.k kVar = (wf.k) K10;
                    rVar2.t(z11);
                    AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
                    m1 m1Var = AbstractC1617t1.f20423a;
                    AbstractC4326r j6 = androidx.compose.ui.focus.a.j(d10.g(MinimumInteractiveModifier.f24779b), this.f45808i0);
                    float f6 = AbstractC5690F.f45817a;
                    boolean booleanValue = ((Boolean) this.f45811l0.getValue()).booleanValue();
                    C0865o0 c0865o0 = new C0865o0(3, 1, 22);
                    rVar2.W(-602881096);
                    AbstractC6216a abstractC6216a3 = this.f45809j0;
                    boolean g12 = rVar2.g(abstractC6216a3);
                    Object K11 = rVar2.K();
                    if (g12 || K11 == obj) {
                        K11 = new G.X(abstractC6216a3, 6);
                        rVar2.h0(K11);
                    }
                    rVar2.t(z11);
                    C0863n0 c0863n0 = new C0863n0(null, (wf.k) K11, 31);
                    rVar2.W(-602880972);
                    Object K12 = rVar2.K();
                    if (K12 == obj) {
                        K12 = new C4748e0(this.f45812m0, 1);
                        rVar2.h0(K12);
                    }
                    rVar2.t(z11);
                    C6783B c6783b3 = c6783b;
                    A7.b.O(c6783b3.f51758a, kVar, j6, false, booleanValue, null, c0865o0, c0863n0, false, 10, 0, null, (wf.k) K12, this.f45810k0, null, R4.b.X(rVar2, -2097105544, new Q8.i(c6783b3, this.f45813n0, this.f45814o0, 4)), rVar2, 805306368, 200064, 19752);
                    AbstractC6463a.v(rVar2, z11, true, z11, z11);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                G3.a(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), null, 0L, 0L, U2.f19717a, 0.0f, null, R4.b.X(abstractC1725n, 695523696, new C5687C(this.f45806Z, this.f45807h0, this.f45808i0, this.f45809j0, this.f45810k0, this.f45811l0, this.f45812m0, this.f45813n0, this.f45814o0, 0)), abstractC1725n, 12582918, 110);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f45805Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
