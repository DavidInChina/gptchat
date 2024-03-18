package Y9;

import A.C0033n0;
import E.AbstractC0429m;
import E.p0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import L0.u;
import Ng.H;
import U3.f;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import Z.r;
import h0.C3288a;
import id.AbstractC3557B;
import io.sentry.hints.i;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import wf.AbstractC6216a;
import wf.n;
import y.AbstractC6463a;
import ya.AbstractC6558f;

/* loaded from: classes.dex */
public final class c extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22139Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f22140Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f22141h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, int i10) {
        super(2);
        this.f22139Y = i10;
        this.f22140Z = abstractC6216a;
        this.f22141h0 = abstractC6216a2;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f22139Y;
        AbstractC6216a abstractC6216a = this.f22141h0;
        AbstractC6216a abstractC6216a2 = this.f22140Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("DeleteConfirmationDialog");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                r rVar2 = (r) abstractC1725n;
                rVar2.W(-175124525);
                boolean g10 = rVar2.g(abstractC6216a2) | rVar2.g(abstractC6216a);
                Object K10 = rVar2.K();
                if (g10 || K10 == iVar) {
                    K10 = new r9.o(abstractC6216a2, abstractC6216a, 1);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                H.f((AbstractC6216a) K10, a5, false, null, null, null, null, null, null, b.f22137a, rVar2, 805306368, 510);
                return;
            default:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                r rVar4 = (r) abstractC1725n;
                rVar4.W(693286680);
                N a10 = p0.a(AbstractC0429m.f3907a, C4310b.f37702o0, rVar4);
                rVar4.W(-1323940314);
                int i12 = rVar4.P;
                AbstractC1732q0 p10 = rVar4.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar4.f22696a instanceof AbstractC1707e) {
                    rVar4.Z();
                    if (rVar4.f22695O) {
                        rVar4.o(c0582k);
                    } else {
                        rVar4.k0();
                    }
                    f.n0(rVar4, a10, C0583l.f5808f);
                    f.n0(rVar4, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar4.f22695O || !AbstractC3557B.K(rVar4.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar4, i12, c0581j);
                    }
                    AbstractC6463a.r(0, i13, new L0(rVar4), rVar4, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("VoiceFeedbackSnackbar");
                    rVar4.W(-1327788277);
                    boolean g11 = rVar4.g(abstractC6216a2);
                    Object K11 = rVar4.K();
                    if (g11 || K11 == iVar) {
                        K11 = new C0033n0(abstractC6216a2, 24);
                        rVar4.h0(K11);
                    }
                    rVar4.t(false);
                    R4.b.o((AbstractC6216a) K11, a11, false, null, null, AbstractC6558f.f50860a, rVar4, 196608, 30);
                    rVar4.W(-1327787894);
                    boolean g12 = rVar4.g(abstractC6216a);
                    Object K12 = rVar4.K();
                    if (g12 || K12 == iVar) {
                        K12 = new C0033n0(abstractC6216a, 25);
                        rVar4.h0(K12);
                    }
                    rVar4.t(false);
                    R4.b.o((AbstractC6216a) K12, a11, false, null, null, AbstractC6558f.f50861b, rVar4, 196608, 30);
                    AbstractC6463a.v(rVar4, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f22139Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
