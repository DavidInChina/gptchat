package W;

import G0.C0571a;
import H0.AbstractC0701r0;
import L.C0863n0;
import L.C0865o0;
import L.C0871s;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import jf.AbstractC3953c;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class J1 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19249Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f19250Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f19251h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3953c f19252i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3953c f19253j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f19254k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f19255l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(p0.l lVar, wf.k kVar, wf.k kVar2, boolean z10, AbstractC6216a abstractC6216a, String str) {
        super(2);
        this.f19251h0 = lVar;
        this.f19252i0 = kVar;
        this.f19253j0 = kVar2;
        this.f19250Z = z10;
        this.f19254k0 = abstractC6216a;
        this.f19255l0 = str;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        long j6;
        long j10;
        long j11;
        int i11 = this.f19249Y;
        Object obj = this.f19255l0;
        Object obj2 = this.f19254k0;
        AbstractC3953c abstractC3953c = this.f19253j0;
        AbstractC3953c abstractC3953c2 = this.f19252i0;
        Object obj3 = this.f19251h0;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(1426260804);
                wf.n nVar = (wf.n) obj3;
                boolean z10 = this.f19250Z;
                if (nVar != null) {
                    Z.O o10 = Z0.f19875a;
                    I1 i12 = (I1) obj2;
                    i12.getClass();
                    rVar2.W(-395881771);
                    if (z10) {
                        j11 = i12.f19213b;
                    } else {
                        j11 = i12.f19216e;
                    }
                    rVar2.t(false);
                    A7.b.k(o10.b(new r0.r(j11)), R4.b.X(rVar2, 2035552199, new C1593o1(nVar, 2)), rVar2, 48);
                }
                rVar2.t(false);
                Z.O o11 = Z0.f19875a;
                I1 i13 = (I1) obj2;
                i13.getClass();
                rVar2.W(-1023108655);
                if (z10) {
                    j6 = i13.f19212a;
                } else {
                    j6 = i13.f19215d;
                }
                AbstractC1710f0 g02 = AbstractC4828h.g0(new r0.r(j6), rVar2);
                rVar2.t(false);
                wf.n nVar2 = (wf.n) abstractC3953c2;
                A7.b.k(o11.b(g02.getValue()), R4.b.X(rVar2, -1728894036, new y.U((E.q0) obj, nVar, nVar2, (wf.n) abstractC3953c, 1)), rVar2, 48);
                if (nVar2 != null) {
                    rVar2.W(-892832569);
                    if (z10) {
                        j10 = i13.f19214c;
                    } else {
                        j10 = i13.f19217f;
                    }
                    rVar2.t(false);
                    A7.b.k(o11.b(new r0.r(j10)), R4.b.X(rVar2, 580312062, new C1593o1(nVar2, 3)), rVar2, 48);
                    return;
                }
                return;
            default:
                C4323o c4323o = C4323o.f37719b;
                AbstractC4326r a5 = io.sentry.compose.b.a("SimpleSearchBar");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, r9.I.f44506Y, abstractC1725n, 6);
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(46626496);
                Object K10 = rVar4.K();
                Object obj4 = C1723m.f22654Y;
                if (K10 == obj4) {
                    K10 = kotlin.jvm.internal.m.d();
                    rVar4.h0(K10);
                }
                D.m mVar = (D.m) K10;
                rVar4.t(false);
                AbstractC4326r a10 = AbstractC4194d.a((G0.X) a5, androidx.compose.ui.focus.a.v(androidx.compose.ui.focus.a.j(c4323o, (p0.l) obj3), (wf.k) abstractC3953c2));
                String str = (String) abstractC1710f0.getValue();
                C0865o0 c0865o0 = new C0865o0(0, 3, 23);
                C0863n0 c0863n0 = new C0863n0(new C0571a(29, (p0.f) rVar4.m(AbstractC0701r0.f7003f)), null, 47);
                rVar4.W(46626798);
                wf.k kVar = (wf.k) abstractC3953c;
                boolean g10 = rVar4.g(abstractC1710f0) | rVar4.g(kVar);
                Object K11 = rVar4.K();
                if (g10 || K11 == obj4) {
                    K11 = new C0871s(kVar, abstractC1710f0, 5);
                    rVar4.h0(K11);
                }
                rVar4.t(false);
                A7.b.P(str, (wf.k) K11, a10, this.f19250Z, false, null, c0865o0, c0863n0, false, 1, 0, null, null, null, null, R4.b.X(rVar4, 2015806315, new r9.H((AbstractC6216a) obj2, mVar, abstractC1710f0, (String) obj, kVar)), rVar4, 806879232, 196608, 32048);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19249Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(wf.n nVar, I1 i12, boolean z10, wf.n nVar2, wf.n nVar3) {
        super(2);
        E.r0 r0Var = E.r0.f3944a;
        this.f19251h0 = nVar;
        this.f19254k0 = i12;
        this.f19250Z = z10;
        this.f19252i0 = nVar2;
        this.f19255l0 = r0Var;
        this.f19253j0 = nVar3;
    }
}
