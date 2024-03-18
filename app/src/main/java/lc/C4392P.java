package lc;

import E.C0436u;
import E.g0;
import F.AbstractC0539m;
import Z.AbstractC1725n;
import android.content.Context;
import id.AbstractC3557B;
import l0.C4323o;

/* renamed from: lc.P  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4392P extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Tc.f f38108Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f38109Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4394S f38110h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Context f38111i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4392P(Tc.f fVar, String str, AbstractC4394S abstractC4394S, Context context) {
        super(5);
        this.f38108Y = fVar;
        this.f38109Z = str;
        this.f38110h0 = abstractC4394S;
        this.f38111i0 = context;
    }

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        g0 g0Var = (g0) obj;
        C4393Q c4393q = (C4393Q) obj2;
        wf.k kVar = (wf.k) obj3;
        AbstractC3557B.c0("paddings", g0Var);
        AbstractC3557B.c0("state", c4393q);
        AbstractC3557B.c0("onIntent", kVar);
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        AbstractC0539m.a(androidx.compose.foundation.layout.a.q(c4323o, g0Var).g(androidx.compose.foundation.layout.e.f24739c), null, null, false, null, null, null, false, new C0436u(c4393q, this.f38108Y, kVar, this.f38109Z, this.f38110h0, this.f38111i0, 3), (AbstractC1725n) obj4, 0, 254);
        return jf.y.f36177a;
    }
}
