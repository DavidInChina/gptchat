package d9;

import E.B0;
import E.D0;
import E.G;
import I9.d1;
import L0.u;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.r;
import java.util.WeakHashMap;
import jf.y;
import l0.AbstractC4326r;
import l0.C4323o;
import va.C6000a;
import va.C6004e;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28147Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f28148Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6004e f28149h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Tc.f fVar, C6004e c6004e, int i10) {
        super(2);
        this.f28147Y = i10;
        this.f28148Z = fVar;
        this.f28149h0 = c6004e;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f28147Y;
        C6004e c6004e = this.f28149h0;
        switch (i11) {
            case 0:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                boolean booleanValue = ((Boolean) c6004e.f47427a.f1085e.getValue()).booleanValue();
                r rVar2 = (r) abstractC1725n;
                rVar2.W(-282936756);
                WeakHashMap weakHashMap = B0.f3736v;
                B0 c10 = G.c(rVar2);
                rVar2.t(false);
                d1.a(this.f28148Z, booleanValue, D0.a(c4323o, c10.f3743g), null, null, abstractC1725n, 8, 24);
                return;
            default:
                AbstractC4326r a5 = io.sentry.compose.b.a("MainScreen");
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                boolean booleanValue2 = ((Boolean) c6004e.f47427a.f1085e.getValue()).booleanValue();
                r rVar4 = (r) abstractC1725n;
                rVar4.W(1942519045);
                boolean g10 = rVar4.g(c6004e);
                Object K10 = rVar4.K();
                if (g10 || K10 == C1723m.f22654Y) {
                    K10 = new C6000a(c6004e, null);
                    rVar4.h0(K10);
                }
                rVar4.t(false);
                A7.b.s(this.f28148Z, booleanValue2, (wf.k) K10, a5, null, null, null, null, rVar4, 520, 248);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f28147Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
