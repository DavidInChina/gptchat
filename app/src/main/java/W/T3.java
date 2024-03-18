package W;

import E.AbstractC0434s;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class T3 extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f19704Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f19705Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19706h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T3(float f6, long j6, wf.n nVar) {
        super(3);
        this.f19704Y = f6;
        this.f19705Z = j6;
        this.f19706h0 = nVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        AbstractC4326r abstractC4326r = (AbstractC4326r) obj;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((Z.r) abstractC1725n).g(abstractC4326r)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        if ((intValue & 19) == 18) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        AbstractC4326r a5 = androidx.compose.ui.draw.a.a(abstractC4326r, this.f19704Y);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(733328855);
        E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
        rVar2.W(-1323940314);
        int i11 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i12 = androidx.compose.ui.layout.a.i(a5);
        if (rVar2.f22696a instanceof AbstractC1707e) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            U3.f.n0(rVar2, c10, C0583l.f5808f);
            U3.f.n0(rVar2, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                AbstractC6463a.q(i11, rVar2, i11, c0581j);
            }
            AbstractC6463a.r(0, i12, new Z.L0(rVar2), rVar2, 2058660585);
            X3.b(this.f19705Z, ((p4) rVar2.m(q4.f20361a)).f20309j, this.f19706h0, rVar2, 0, 0);
            AbstractC6463a.v(rVar2, false, true, false, false);
            return jf.y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
