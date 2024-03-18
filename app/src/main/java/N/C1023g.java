package N;

import Z.AbstractC1725n;
import Z.C1723m;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import na.C4805z0;
import wf.AbstractC6216a;

/* renamed from: N.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1023g extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12334Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f12335Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f12336h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1023g(AbstractC6216a abstractC6216a, boolean z10, int i10) {
        super(3);
        this.f12334Y = i10;
        this.f12335Z = abstractC6216a;
        this.f12336h0 = z10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f12334Y;
        boolean z10 = this.f12336h0;
        switch (i10) {
            case 0:
                AbstractC4326r abstractC4326r = (AbstractC4326r) obj;
                ((Number) obj3).intValue();
                Z.r rVar = (Z.r) ((AbstractC1725n) obj2);
                rVar.W(-196777734);
                long j6 = ((y0) rVar.m(z0.f12460a)).f12455a;
                rVar.W(-433018279);
                boolean f6 = rVar.f(j6);
                AbstractC6216a abstractC6216a = this.f12335Z;
                boolean i11 = f6 | rVar.i(abstractC6216a) | rVar.h(z10);
                Object K10 = rVar.K();
                if (i11 || K10 == C1723m.f22654Y) {
                    K10 = new C1022f(j6, abstractC6216a, z10);
                    rVar.h0(K10);
                }
                rVar.t(false);
                AbstractC4326r e10 = androidx.compose.ui.draw.a.e(abstractC4326r, (wf.k) K10);
                rVar.t(false);
                return e10;
            default:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$CenterAlignedTopAppBar", (E.q0) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("SettingsTopBar");
                if ((intValue & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return jf.y.f36177a;
                    }
                }
                R4.b.o(this.f12335Z, a5, false, null, null, R4.b.X(abstractC1725n, -958452276, new C4805z0(4, z10)), abstractC1725n, 196608, 30);
                return jf.y.f36177a;
        }
    }
}
