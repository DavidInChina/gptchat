package kb;

import Df.AbstractC0408g;
import E.AbstractC0434s;
import E.B0;
import E.D0;
import E.g0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import androidx.compose.foundation.layout.FillElement;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import java.util.WeakHashMap;
import l0.AbstractC4326r;
import l0.C4310b;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C4209C f37275Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H.F f37276Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ x9.l f37277h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0408g f37278i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ List f37279j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C4209C c4209c, H.I i10, x9.l lVar, AbstractC0408g abstractC0408g, List list) {
        super(5);
        this.f37275Y = c4209c;
        this.f37276Z = i10;
        this.f37277h0 = lVar;
        this.f37278i0 = abstractC0408g;
        this.f37279j0 = list;
    }

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        AbstractC3557B.c0("$anonymous$parameter$0$", (g0) obj);
        AbstractC3557B.c0("$anonymous$parameter$1$", (C4209C) obj2);
        AbstractC3557B.c0("$anonymous$parameter$2$", (wf.k) obj3);
        L0.u uVar = io.sentry.compose.b.f34309a;
        FillElement fillElement = androidx.compose.foundation.layout.e.f24739c;
        Z.r rVar = (Z.r) ((AbstractC1725n) obj4);
        rVar.W(-49441252);
        WeakHashMap weakHashMap = B0.f3736v;
        B0 c10 = E.G.c(rVar);
        rVar.t(false);
        AbstractC4326r a5 = D0.a(fillElement, c10.f3747k);
        rVar.W(733328855);
        N c11 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
        rVar.W(-1323940314);
        int i10 = rVar.P;
        AbstractC1732q0 p10 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i11 = androidx.compose.ui.layout.a.i(a5);
        if (rVar.f22696a instanceof AbstractC1707e) {
            rVar.Z();
            if (rVar.f22695O) {
                rVar.o(c0582k);
            } else {
                rVar.k0();
            }
            U3.f.n0(rVar, c11, C0583l.f5808f);
            U3.f.n0(rVar, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i10))) {
                AbstractC6463a.q(i10, rVar, i10, c0581j);
            }
            AbstractC6463a.r(0, i11, new L0(rVar), rVar, 2058660585);
            H.F f6 = this.f37276Z;
            AbstractC4208B.d(this.f37275Y, f6, this.f37277h0, (wf.k) this.f37278i0, this.f37279j0, rVar, 33288);
            AbstractC6463a.v(rVar, false, true, false, false);
            return jf.y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
