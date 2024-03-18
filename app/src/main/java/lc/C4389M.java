package lc;

import E.AbstractC0438w;
import F.AbstractC0528b;
import W.AbstractC1547f0;
import W.E1;
import Z.AbstractC1725n;
import id.AbstractC3557B;
import l0.AbstractC4326r;

/* renamed from: lc.M  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4389M extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38102Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4393Q f38103Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4389M(C4393Q c4393q, int i10) {
        super(3);
        this.f38102Y = i10;
        this.f38103Z = c4393q;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f38102Y;
        C4393Q c4393q = this.f38103Z;
        switch (i10) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$BadgedBox", (AbstractC0438w) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("SettingsScreen");
                if ((intValue & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                if (c4393q.f38118g) {
                    AbstractC1547f0.a(a5, 0L, 0L, null, abstractC1725n, 0, 15);
                }
                return yVar;
            default:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$item", (AbstractC0528b) obj);
                AbstractC4326r a10 = io.sentry.compose.b.a("SettingsScreen");
                if ((intValue2 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                E1.a(AbstractC4407f.f38244j, a10, null, R4.b.X(abstractC1725n2, 453959834, new C4390N(c4393q, 2)), AbstractC4407f.f38245k, null, null, 0.0f, 0.0f, abstractC1725n2, 27654, 486);
                return yVar;
        }
    }
}
