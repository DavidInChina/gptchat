package bb;

import E.AbstractC0429m;
import E.AbstractC0440y;
import E.C0421f;
import E.C0426j;
import F.AbstractC0528b;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import cb.C2334C;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4323o;
import y.AbstractC6463a;

/* renamed from: bb.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2157c extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25789Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2334C f25790Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f25791h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2157c(int i10, C2334C c2334c, wf.k kVar) {
        super(3);
        this.f25789Y = i10;
        this.f25790Z = c2334c;
        this.f25791h0 = kVar;
    }

    public final void a(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        io.sentry.hints.i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f25789Y;
        wf.k kVar = this.f25791h0;
        switch (i11) {
            case 0:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
                float f6 = p9.r.f42841e;
                AbstractC4326r v10 = androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.a.t(d10, f6, 0.0f, 2), 0.0f, 0.0f, 0.0f, f6, 7);
                C0421f c0421f = AbstractC0429m.f3907a;
                C0426j g10 = AbstractC0429m.g(p9.r.f42840d);
                C4316h c4316h = C4310b.f37706s0;
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-483455358);
                E0.N a5 = AbstractC0440y.a(g10, c4316h, rVar2);
                rVar2.W(-1323940314);
                int i12 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(v10);
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
                    AbstractC6463a.r(0, i13, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                    AbstractC4326r j6 = androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42835f);
                    C2334C c2334c = this.f25790Z;
                    K8.d.z(c2334c, j6, null, rVar2, 0, 4);
                    j4.b(c2334c.f26439b, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(q4.f20361a)).f20306g, rVar2, 0, 0, 65534);
                    rVar2.W(-112635591);
                    boolean g11 = rVar2.g(kVar);
                    Object K10 = rVar2.K();
                    if (g11 || K10 == iVar) {
                        K10 = new y.Y(25, kVar);
                        rVar2.h0(K10);
                    }
                    rVar2.t(false);
                    Bi.c.f(0, 2, rVar2, a10, c2334c, (wf.k) K10);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                List list = this.f25790Z.f26460w;
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(2106510622);
                boolean g12 = rVar4.g(kVar);
                Object K11 = rVar4.K();
                if (g12 || K11 == iVar) {
                    K11 = new y.Y(26, kVar);
                    rVar4.h0(K11);
                }
                rVar4.t(false);
                K8.d.U(list, (wf.k) K11, a11, rVar4, 8, 4);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f25789Y) {
            case 0:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
