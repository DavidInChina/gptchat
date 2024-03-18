package I9;

import E.AbstractC0429m;
import E.AbstractC0434s;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.AbstractC1607r1;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import cb.C2334C;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8156Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l1 f8157Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(l1 l1Var, int i10) {
        super(2);
        this.f8156Y = i10;
        this.f8157Z = l1Var;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f8156Y;
        l1 l1Var = this.f8157Z;
        switch (i11) {
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
                rVar2.W(693286680);
                E0.N a5 = E.p0.a(AbstractC0429m.f3907a, C4310b.f37702o0, rVar2);
                rVar2.W(-1323940314);
                int i12 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a5, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar2, i12, c0581j);
                    }
                    AbstractC6463a.t(rVar2, i13, rVar2, 0, 2058660585);
                    L4.a.T(Ng.H.w(R.string.conversations_side_bar_more_gizmos, new Object[]{Integer.valueOf(l1Var.f8411a)}, rVar2), io.sentry.compose.b.a("MoreGizmosItem"), 1, 2, rVar2, 3456, 2);
                    AbstractC1607r1.b(r.f.G(), "", androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b), 0L, rVar2, 48, 8);
                    AbstractC6463a.v(rVar2, false, true, false, false);
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
                AbstractC4326r j6 = androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b);
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(733328855);
                E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar4);
                rVar4.W(-1323940314);
                int i14 = rVar4.P;
                AbstractC1732q0 p11 = rVar4.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(j6);
                if (rVar4.f22696a instanceof AbstractC1707e) {
                    rVar4.Z();
                    if (rVar4.f22695O) {
                        rVar4.o(c0582k2);
                    } else {
                        rVar4.k0();
                    }
                    U3.f.n0(rVar4, c10, C0583l.f5808f);
                    U3.f.n0(rVar4, p11, C0583l.f5807e);
                    C0581j c0581j2 = C0583l.f5809g;
                    if (rVar4.f22695O || !AbstractC3557B.K(rVar4.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar4, i14, c0581j2);
                    }
                    AbstractC6463a.t(rVar4, i15, rVar4, 0, 2058660585);
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
                    AbstractC4326r a10 = io.sentry.compose.b.a("MoreGizmosItem");
                    C2334C c2334c = (C2334C) kf.t.i2(0, l1Var.f8412b);
                    float f6 = p9.q.f42830a;
                    G0.X x10 = (G0.X) a10;
                    K8.d.z(c2334c, AbstractC4194d.a(x10, androidx.compose.foundation.layout.e.j(c4323o, f6)), null, rVar4, 384, 0);
                    K8.d.z((C2334C) kf.t.i2(1, l1Var.f8412b), AbstractC4194d.a(x10, bVar.a(androidx.compose.foundation.layout.e.j(c4323o, f6), C4310b.f37701n0)), null, rVar4, 384, 0);
                    AbstractC6463a.v(rVar4, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8156Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
