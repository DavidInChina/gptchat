package q9;

import E.q0;
import G0.X;
import H0.AbstractC0701r0;
import Ng.H;
import W.AbstractC1530b3;
import W.C1525a3;
import W.I2;
import W.P0;
import W.R0;
import W.j4;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.r;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import k6.AbstractC4194d;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4323o;
import l8.AbstractC4344b;
import p9.q;
import q0.C5254f;
import r0.C5334A;
import wf.k;
import z.AbstractC6696f;
import z.C6671K;

/* renamed from: q9.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5290g extends o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44005Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f44006Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f44007h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5290g(int i10, boolean z10, boolean z11) {
        super(3);
        this.f44005Y = i10;
        this.f44006Z = z10;
        this.f44007h0 = z11;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4323o c4323o = C4323o.f37719b;
        int i10 = this.f44005Y;
        boolean z10 = this.f44007h0;
        boolean z11 = this.f44006Z;
        switch (i10) {
            case 0:
                AbstractC4326r abstractC4326r = (AbstractC4326r) obj;
                ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$composed", abstractC4326r);
                AbstractC4326r a5 = io.sentry.compose.b.a("shimmer");
                r rVar = (r) ((AbstractC1725n) obj2);
                rVar.W(-152416945);
                long j6 = ((P0) rVar.m(R0.f19593a)).f19493A;
                rVar.W(-1226460530);
                List G02 = AbstractC4344b.G0(new r0.r(r0.r.b(j6, r0.r.d(j6))), new r0.r(r0.r.b(j6, r0.r.d(j6) * 0.2f)), new r0.r(r0.r.b(j6, r0.r.d(j6))));
                C6671K f6 = AbstractC6696f.f(AbstractC6696f.t("ShimmerAnimation", rVar, 0), 0.0f, 2600.0f, AbstractC6696f.r(AbstractC6696f.v(2000, 0, null, 6), 1, 4), "ShimmerAnimation", rVar, 28728, 0);
                C5334A c5334a = new C5334A(G02, null, R4.b.r(((Number) f6.f51162i0.getValue()).floatValue() - 2000.0f, 0.0f), R4.b.r(((Number) f6.f51162i0.getValue()).floatValue() - (2000.0f / 2), 0.0f), 0);
                rVar.t(false);
                float a10 = ((C1525a3) rVar.m(AbstractC1530b3.f19940a)).f19905b.f9311Y.a(C5254f.f43638c, (Z0.b) rVar.m(AbstractC0701r0.f7002e));
                rVar.W(-1666781278);
                boolean h10 = rVar.h(z11) | rVar.g(c5334a) | rVar.h(z10) | rVar.d(a10);
                Object K10 = rVar.K();
                if (h10 || K10 == C1723m.f22654Y) {
                    K10 = new C5289f(z11, c5334a, z10, a10);
                    rVar.h0(K10);
                }
                rVar.t(false);
                AbstractC4326r a11 = AbstractC4194d.a((X) a5, androidx.compose.ui.draw.a.f(abstractC4326r, (k) K10));
                rVar.t(false);
                return a11;
            default:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$OutlinedButton", (q0) obj);
                AbstractC4326r a12 = io.sentry.compose.b.a("GizmoAccountListItem");
                if ((intValue & 81) == 16) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return y.f36177a;
                    }
                }
                if (z11) {
                    r rVar3 = (r) abstractC1725n;
                    rVar3.W(-1206348696);
                    I2.b(androidx.compose.foundation.layout.e.j(c4323o, q.f42832c), 0L, 0.0f, 0L, 0, rVar3, 0, 30);
                    rVar3.t(false);
                } else {
                    r rVar4 = (r) abstractC1725n;
                    rVar4.W(-1206348581);
                    if (z10) {
                        rVar4.W(-1206348529);
                        j4.b(H.v(R.string.gizmos_accounts_logout, rVar4), a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 0, 0, 131070);
                        rVar4.t(false);
                    } else if (!z10) {
                        rVar4.W(-1206348442);
                        j4.b(H.v(R.string.gizmos_accounts_logged_out, rVar4), a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 0, 0, 131070);
                        rVar4.t(false);
                    } else {
                        rVar4.W(-1206348363);
                        rVar4.t(false);
                    }
                    rVar4.t(false);
                }
                return y.f36177a;
        }
    }
}
