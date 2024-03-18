package S8;

import E.AbstractC0434s;
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
import y.AbstractC6463a;

/* renamed from: S8.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365i extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f16326Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f16327Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ N0.E f16328h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.o f16329i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365i(AbstractC4326r abstractC4326r, float f6, N0.E e10, wf.o oVar) {
        super(4);
        this.f16326Y = abstractC4326r;
        this.f16327Z = f6;
        this.f16328h0 = e10;
        this.f16329i0 = oVar;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        int i12;
        M m10 = (M) obj;
        AbstractC4326r abstractC4326r = (AbstractC4326r) obj2;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
        int intValue = ((Number) obj4).intValue();
        AbstractC3557B.c0("$this$CodeBlockLayout", m10);
        AbstractC3557B.c0("layoutModifier", abstractC4326r);
        if ((intValue & 14) == 0) {
            if (((Z.r) abstractC1725n).g(m10)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | intValue;
        } else {
            i10 = intValue;
        }
        if ((intValue & 112) == 0) {
            if (((Z.r) abstractC1725n).g(abstractC4326r)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 731) == 146) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(abstractC4326r.g(this.f16326Y), this.f16327Z);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(733328855);
        E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
        rVar2.W(-1323940314);
        int i13 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i14 = androidx.compose.ui.layout.a.i(r10);
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
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                AbstractC6463a.q(i13, rVar2, i13, c0581j);
            }
            AbstractC6463a.r(0, i14, new L0(rVar2), rVar2, 2058660585);
            Q.a(m10, rVar2).h(this.f16328h0, R4.b.X(rVar2, 206168572, new C1364h(this.f16329i0, m10, 0)), rVar2, 48);
            AbstractC6463a.v(rVar2, false, true, false, false);
            return jf.y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
