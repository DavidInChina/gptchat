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
import l0.C4318j;
import l0.C4323o;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class U3 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19718Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f19719Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f19720h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ N0.E f19721i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19722j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U3(float f6, long j6, N0.E e10, wf.n nVar, int i10) {
        super(2);
        this.f19718Y = i10;
        this.f19719Z = f6;
        this.f19720h0 = j6;
        this.f19721i0 = e10;
        this.f19722j0 = nVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4318j c4318j = C4310b.f37693Y;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f19718Y;
        float f6 = this.f19719Z;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC4326r a5 = androidx.compose.ui.draw.a.a(c4323o, f6);
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(733328855);
                E0.N c10 = AbstractC0434s.c(c4318j, false, rVar2);
                rVar2.W(-1323940314);
                int i12 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(a5);
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
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar2, i12, c0581j);
                    }
                    AbstractC6463a.t(rVar2, i13, rVar2, 0, 2058660585);
                    X3.b(this.f19720h0, this.f19721i0, this.f19722j0, rVar2, 0, 0);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                if ((i10 & 3) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC4326r a10 = androidx.compose.ui.draw.a.a(c4323o, f6);
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(733328855);
                E0.N c11 = AbstractC0434s.c(c4318j, false, rVar4);
                rVar4.W(-1323940314);
                int i14 = rVar4.P;
                AbstractC1732q0 p11 = rVar4.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(a10);
                if (rVar4.f22696a instanceof AbstractC1707e) {
                    rVar4.Z();
                    if (rVar4.f22695O) {
                        rVar4.o(c0582k2);
                    } else {
                        rVar4.k0();
                    }
                    U3.f.n0(rVar4, c11, C0583l.f5808f);
                    U3.f.n0(rVar4, p11, C0583l.f5807e);
                    C0581j c0581j2 = C0583l.f5809g;
                    if (rVar4.f22695O || !AbstractC3557B.K(rVar4.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar4, i14, c0581j2);
                    }
                    AbstractC6463a.t(rVar4, i15, rVar4, 0, 2058660585);
                    X3.b(this.f19720h0, this.f19721i0, this.f19722j0, rVar4, 0, 0);
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
        switch (this.f19718Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
