package A;

import Z.AbstractC1708e0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import gb.C3223A;
import id.AbstractC3557B;
import jf.AbstractC3953c;
import l0.AbstractC4326r;
import l0.C4323o;
import wf.AbstractC6216a;

/* renamed from: A.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0055z extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f331Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f332Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f333h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f334i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3953c f335j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055z(fa.n nVar, wf.k kVar, String str, boolean z10) {
        super(3);
        this.f334i0 = nVar;
        this.f335j0 = kVar;
        this.f332Z = str;
        this.f333h0 = z10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        Object obj4 = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f331Y;
        AbstractC3953c abstractC3953c = this.f335j0;
        Object obj5 = this.f334i0;
        switch (i11) {
            case 0:
                AbstractC4326r abstractC4326r = (AbstractC4326r) obj;
                ((Number) obj3).intValue();
                Z.r rVar = (Z.r) ((AbstractC1725n) obj2);
                rVar.W(-756081143);
                AbstractC0040r0 abstractC0040r0 = (AbstractC0040r0) rVar.m(AbstractC0048v0.f314a);
                rVar.W(-492369756);
                Object K10 = rVar.K();
                if (K10 == obj4) {
                    K10 = kotlin.jvm.internal.m.d();
                    rVar.h0(K10);
                }
                rVar.t(false);
                AbstractC4326r f6 = androidx.compose.foundation.a.f(c4323o, (D.m) K10, abstractC0040r0, this.f333h0, this.f332Z, (L0.g) obj5, (AbstractC6216a) abstractC3953c);
                rVar.t(false);
                return f6;
            default:
                S8.M m10 = (S8.M) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$RichText", m10);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(m10)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 91) == 18) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return jf.y.f36177a;
                    }
                }
                u9.b C02 = r9.y.C0();
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(1451327966);
                fa.n nVar = (fa.n) obj5;
                Object K11 = rVar3.K();
                if (K11 == obj4) {
                    K11 = U3.f.h0(nVar.f30070b.length());
                    rVar3.h0(K11);
                }
                rVar3.t(false);
                AbstractC1734s.e(Integer.valueOf(nVar.f30070b.length()), new C3223A(nVar, C02, (AbstractC1708e0) K11, null), rVar3);
                wi.s a5 = nVar.a();
                rVar3.W(1451328331);
                wf.k kVar = (wf.k) abstractC3953c;
                boolean g10 = rVar3.g(kVar);
                String str = this.f332Z;
                boolean g11 = g10 | rVar3.g(str);
                Object K12 = rVar3.K();
                if (g11 || K12 == obj4) {
                    K12 = new gb.B(kVar, str);
                    rVar3.h0(K12);
                }
                rVar3.t(false);
                Q8.m.b(m10, a5, (wf.k) K12, new gb.C(0, this.f333h0), null, rVar3, (intValue & 14) | 64, 8);
                return jf.y.f36177a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055z(boolean z10, String str, L0.g gVar, AbstractC6216a abstractC6216a) {
        super(3);
        this.f333h0 = z10;
        this.f332Z = str;
        this.f334i0 = gVar;
        this.f335j0 = abstractC6216a;
    }
}
