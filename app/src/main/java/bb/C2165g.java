package bb;

import A.AbstractC0044t0;
import F.AbstractC0528b;
import W.AbstractC1577l0;
import W.C1572k0;
import Z.AbstractC1725n;
import Z.C1723m;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import wf.AbstractC6216a;

/* renamed from: bb.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2165g extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2165g f25819Z = new C2165g(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2165g f25820h0 = new C2165g(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25821Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2165g(int i10) {
        super(4);
        this.f25821Y = i10;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        int i12;
        jf.y yVar = jf.y.f36177a;
        C4323o c4323o = C4323o.f37719b;
        switch (this.f25821Y) {
            case 0:
                C2152D c2152d = (C2152D) obj;
                wf.k kVar = (wf.k) obj2;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
                int intValue = ((Number) obj4).intValue();
                AbstractC3557B.c0("state", c2152d);
                AbstractC3557B.c0("onIntent", kVar);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(c2152d)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i10 = i12 | intValue;
                } else {
                    i10 = intValue;
                }
                if ((intValue & 112) == 0) {
                    if (((Z.r) abstractC1725n).i(kVar)) {
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
                        return yVar;
                    }
                }
                AbstractC4326r a10 = AbstractC4194d.a((G0.X) a5, androidx.compose.foundation.layout.e.d(c4323o, 1.0f));
                boolean z10 = true;
                boolean z11 = !AbstractC3557B.K(c2152d.f25695c, c2152d.f25696d);
                C1572k0 a11 = AbstractC1577l0.a(abstractC1725n);
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(634063628);
                if ((i10 & 112) != 32) {
                    z10 = false;
                }
                Object K10 = rVar2.K();
                if (z10 || K10 == C1723m.f22654Y) {
                    K10 = AbstractC0044t0.t(22, kVar, rVar2);
                }
                rVar2.t(false);
                x8.W.q((AbstractC6216a) K10, a10, a11, c2152d.f25701i, z11, AbstractC2169i.f25831b, rVar2, 196656, 0);
                return yVar;
            default:
                ((Number) obj2).intValue();
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj3;
                int intValue2 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$this$items", (AbstractC0528b) obj);
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue2 & 641) == 128) {
                    Z.r rVar3 = (Z.r) abstractC1725n2;
                    if (rVar3.B()) {
                        rVar3.P();
                        return yVar;
                    }
                }
                L4.a.u(AbstractC4194d.a((G0.X) a12, androidx.compose.foundation.layout.a.v(c4323o, p9.r.f42841e, 0.0f, 0.0f, 0.0f, 14)), p9.q.f42833d, false, abstractC1725n2, 384, 0);
                return yVar;
        }
    }
}
