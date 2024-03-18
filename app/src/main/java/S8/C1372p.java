package S8;

import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1737t0;
import Z.L0;
import gb.AbstractC3237n;
import gb.AbstractC3242t;
import gb.C3238o;
import gb.C3239p;
import gb.C3241s;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4323o;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: S8.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1372p extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16351Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f16352Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f16353h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f16354i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f16355j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1372p(int i10, int i11, C3238o c3238o, wf.k kVar) {
        super(3);
        this.f16352Z = i10;
        this.f16353h0 = i11;
        this.f16354i0 = c3238o;
        this.f16355j0 = kVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z10;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f16351Y;
        int i11 = this.f16352Z;
        Object obj4 = this.f16355j0;
        Object obj5 = this.f16354i0;
        int i12 = 2;
        switch (i10) {
            case 0:
                M m10 = (M) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$BasicRichText", m10);
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(m10)) {
                        i12 = 4;
                    }
                    intValue |= i12;
                }
                if ((intValue & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                A7.b.l(new C1737t0[]{AbstractC1377v.f16387f.b(Integer.valueOf(i11 + 1))}, R4.b.X(abstractC1725n, -860837632, new G.U((wf.p) obj5, m10, (List) obj4, this.f16353h0, 9)), abstractC1725n, 56);
                return yVar;
            default:
                androidx.compose.foundation.layout.d dVar = (androidx.compose.foundation.layout.d) obj;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$BoxWithConstraints", dVar);
                C4323o c4323o = C4323o.f37719b;
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue2 & 14) == 0) {
                    if (((Z.r) abstractC1725n2).g(dVar)) {
                        i12 = 4;
                    }
                    intValue2 |= i12;
                }
                if ((intValue2 & 91) == 18) {
                    Z.r rVar2 = (Z.r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                C3238o c3238o = (C3238o) obj5;
                wf.k kVar = (wf.k) obj4;
                Z.r rVar3 = (Z.r) abstractC1725n2;
                rVar3.W(305903921);
                if ((intValue2 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean e10 = z10 | rVar3.e(i11);
                int i13 = this.f16353h0;
                boolean e11 = e10 | rVar3.e(i13);
                Object K10 = rVar3.K();
                Object obj6 = C1723m.f22654Y;
                if (e11 || K10 == obj6) {
                    K10 = new C3241s(dVar, i11, i13);
                    rVar3.h0(K10);
                }
                E0.N n10 = (E0.N) K10;
                rVar3.t(false);
                rVar3.W(-1323940314);
                int i14 = rVar3.P;
                AbstractC1732q0 p10 = rVar3.p();
                AbstractC0584m.f5811i.getClass();
                AbstractC6216a abstractC6216a = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar3.f22696a instanceof AbstractC1707e) {
                    rVar3.Z();
                    if (rVar3.f22695O) {
                        rVar3.o(abstractC6216a);
                    } else {
                        rVar3.k0();
                    }
                    U3.f.n0(rVar3, n10, C0583l.f5808f);
                    U3.f.n0(rVar3, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar3, i14, c0581j);
                    }
                    AbstractC6463a.r(0, i15, new L0(rVar3), rVar3, 2058660585);
                    AbstractC4326r a5 = io.sentry.compose.b.a("MessageImageListContent");
                    rVar3.W(305903517);
                    for (AbstractC3237n abstractC3237n : c3238o.f31494a) {
                        rVar3.W(423199429);
                        boolean g10 = rVar3.g(abstractC3237n) | rVar3.g(kVar);
                        Object K11 = rVar3.K();
                        if (g10 || K11 == obj6) {
                            K11 = new C3239p(abstractC3237n, kVar, 3);
                            rVar3.h0(K11);
                        }
                        rVar3.t(false);
                        AbstractC3242t.a(abstractC3237n, (AbstractC6216a) K11, a5, rVar3, 0, 4);
                    }
                    AbstractC6463a.v(rVar3, false, false, true, false);
                    return yVar;
                }
                R4.b.r1();
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1372p(int i10, wf.p pVar, List list, int i11) {
        super(3);
        this.f16352Z = i10;
        this.f16354i0 = pVar;
        this.f16355j0 = list;
        this.f16353h0 = i11;
    }
}
