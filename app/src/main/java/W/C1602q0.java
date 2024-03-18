package W;

import Z.AbstractC1725n;
import Z.C1723m;
import wf.AbstractC6216a;

/* renamed from: W.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1602q0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20320Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f20321Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f20322h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f20323i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1602q0(long j6, Object obj, Object obj2, int i10) {
        super(2);
        this.f20320Y = i10;
        this.f20321Z = j6;
        this.f20322h0 = obj;
        this.f20323i0 = obj2;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f20320Y;
        Object obj = this.f20323i0;
        Object obj2 = this.f20322h0;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                r9.y.s(this.f20321Z, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20312m, R4.b.X(abstractC1725n, 1327513942, new C1581m((E.g0) obj2, 3, (wf.o) obj)), abstractC1725n, 384);
                return;
            case 1:
                if ((i10 & 3) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                E.i0 i0Var = AbstractC1577l0.f20203a;
                C1572k0 i12 = AbstractC1577l0.i(this.f20321Z, abstractC1725n);
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(-2057496839);
                C1585m3 c1585m3 = (C1585m3) obj2;
                boolean g10 = rVar3.g(c1585m3);
                Object K10 = rVar3.K();
                if (g10 || K10 == C1723m.f22654Y) {
                    K10 = new C1560h3(1, c1585m3);
                    rVar3.h0(K10);
                }
                rVar3.t(false);
                Ng.H.f((AbstractC6216a) K10, null, false, null, i12, null, null, null, null, R4.b.X(rVar3, 521110564, new C1644y3((String) obj)), rVar3, 805306368, 494);
                return;
            default:
                if ((i10 & 3) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                X3.b(this.f20321Z, (N0.E) obj2, (wf.n) obj, abstractC1725n, 0, 0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f20320Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
