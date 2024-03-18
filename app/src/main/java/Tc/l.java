package Tc;

import E.AbstractC0441z;
import E.q0;
import W.AbstractC1649z3;
import W.B3;
import W.C1585m3;
import W.j4;
import Z.AbstractC1725n;
import id.AbstractC3557B;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final l f17086Z = new l(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final l f17087h0 = new l(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final l f17088i0 = new l(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final l f17089j0 = new l(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final l f17090k0 = new l(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17091Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10) {
        super(3);
        this.f17091Y = i10;
    }

    public final void a(AbstractC0441z abstractC0441z, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f17091Y) {
            case 2:
                AbstractC3557B.c0("$this$ScrollableContentScreen", abstractC0441z);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b("More Onboarding Content", a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 6, 0, 131070);
                return;
            case 3:
                AbstractC3557B.c0("$this$null", abstractC0441z);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                    return;
                }
                return;
            default:
                AbstractC3557B.c0("$this$null", abstractC0441z);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        jf.y yVar = jf.y.f36177a;
        switch (this.f17091Y) {
            case 0:
                C1585m3 c1585m3 = (C1585m3) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("it", c1585m3);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(c1585m3)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                B3 b32 = c1585m3.f20227a;
                if (b32 instanceof p) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    rVar2.W(1991983498);
                    ((p) b32).f17115b.invoke(rVar2, 0);
                    rVar2.t(false);
                } else {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    rVar3.W(1991983525);
                    AbstractC1649z3.b(c1585m3, a5, false, null, 0L, 0L, 0L, 0L, 0L, rVar3, intValue & 14, 510);
                    rVar3.t(false);
                }
                return yVar;
            case 1:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$Button", (q0) obj);
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue2 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n2;
                    if (rVar4.B()) {
                        rVar4.P();
                        return yVar;
                    }
                }
                j4.b("Footer Button", a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n2, 6, 0, 131070);
                return yVar;
            case 2:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 3:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
