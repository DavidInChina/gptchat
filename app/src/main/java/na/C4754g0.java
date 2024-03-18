package na;

import F.AbstractC0528b;
import Z.AbstractC1708e0;
import Z.AbstractC1725n;
import Z.C1723m;
import ca.AbstractC2313e;
import ca.AbstractC2314f;
import ca.AbstractC2318j;
import cb.C2334C;
import fa.EnumC2971H;
import ja.C3930b;
import ja.C3931c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: na.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4754g0 extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ List f39980Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ D1 f39981Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f39982h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f39983i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1708e0 f39984j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4754g0(ArrayList arrayList, D1 d12, wf.k kVar, wf.k kVar2, AbstractC1708e0 abstractC1708e0) {
        super(4);
        this.f39980Y = arrayList;
        this.f39981Z = d12;
        this.f39982h0 = kVar;
        this.f39983i0 = kVar2;
        this.f39984j0 = abstractC1708e0;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        C3931c c3931c;
        boolean z10;
        boolean z11;
        wd.O o10;
        int i11;
        int i12;
        AbstractC0528b abstractC0528b = (AbstractC0528b) obj;
        int intValue = ((Number) obj2).intValue();
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 14) == 0) {
            if (((Z.r) abstractC1725n).g(abstractC0528b)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | intValue2;
        } else {
            i10 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (((Z.r) abstractC1725n).e(intValue)) {
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
        AbstractC2318j abstractC2318j = (AbstractC2318j) this.f39980Y.get(intValue);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("ConversationMessageList");
        if (abstractC2318j instanceof AbstractC2313e) {
            Z.r rVar2 = (Z.r) abstractC1725n;
            rVar2.W(1838127888);
            AbstractC2313e abstractC2313e = (AbstractC2313e) abstractC2318j;
            EnumC2971H e10 = abstractC2313e.e();
            EnumC2971H enumC2971H = EnumC2971H.f30046Y;
            C3931c c3931c2 = null;
            D1 d12 = this.f39981Z;
            if (e10 == enumC2971H) {
                c3931c = null;
            } else if (abstractC2313e.d().f30014g != null) {
                c3931c = abstractC2313e.d().f30014g;
            } else if (abstractC2313e.d().f30006A == null) {
                C3930b c3930b = C3931c.Companion;
                C2334C c2334c = d12.f39759N;
                c3930b.getClass();
                c3931c = C3930b.a(c2334c);
            } else if (abstractC2313e.d().f30006A != null) {
                C3930b c3930b2 = C3931c.Companion;
                Map map = d12.f39760O;
                String str = abstractC2313e.d().f30006A;
                if (str != null) {
                    o10 = new wd.O(str);
                } else {
                    o10 = null;
                }
                c3930b2.getClass();
                c3931c = C3930b.a((C2334C) map.get(o10));
                if (c3931c == null) {
                    c3931c = new C3931c((String) null, true, false, (String) null, true, 12);
                }
            } else {
                C3931c.Companion.getClass();
                c3931c = new C3931c((String) null, true, false, (String) null, true, 12);
            }
            C3931c c3931c3 = abstractC2313e.c().f30014g;
            if (c3931c3 == null) {
                C3930b c3930b3 = C3931c.Companion;
                wd.K0 k02 = d12.f39763b;
                if (abstractC2313e.c().f30028u != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c3930b3.getClass();
                if (k02 != null) {
                    c3931c2 = new C3931c(k02.f48354c, false, z11, k02.f48355d, false, 18);
                }
                c3931c3 = c3931c2;
            }
            zd.n nVar = d12.f39780s;
            if (nVar != null) {
                z10 = nVar.f51982a;
            } else {
                z10 = false;
            }
            boolean z12 = !z10;
            AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
            rVar2.W(1838128671);
            Object K10 = rVar2.K();
            if (K10 == C1723m.f22654Y) {
                K10 = new C4748e0(this.f39984j0, 0);
                rVar2.h0(K10);
            }
            rVar2.t(false);
            gb.D.g(c3931c, c3931c3, abstractC2313e, this.f39982h0, AbstractC4194d.a((G0.X) a5, androidx.compose.ui.layout.a.k(d10, (wf.k) K10)), z12, true, this.f39983i0, rVar2, 1597440, 0);
            rVar2.t(false);
        } else if (abstractC2318j instanceof AbstractC2314f) {
            Z.r rVar3 = (Z.r) abstractC1725n;
            rVar3.W(1838128780);
            L4.a.y((AbstractC2314f) abstractC2318j, this.f39982h0, androidx.compose.foundation.layout.e.d(c4323o, 1.0f), rVar3, 384, 0);
            rVar3.t(false);
        } else {
            Z.r rVar4 = (Z.r) abstractC1725n;
            rVar4.W(1838129030);
            rVar4.t(false);
        }
        return jf.y.f36177a;
    }
}
