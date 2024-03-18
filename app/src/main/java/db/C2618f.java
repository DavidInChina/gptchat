package db;

import E.AbstractC0429m;
import E.C0424h;
import E.p0;
import E0.N;
import F.AbstractC0528b;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import L0.u;
import Ng.H;
import W.AbstractC1607r1;
import W.P0;
import W.R0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import Z.r;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import io.sentry.hints.i;
import jf.y;
import k6.AbstractC4194d;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import p9.q;
import u0.AbstractC5824b;
import wf.AbstractC6216a;
import wf.k;
import wf.n;
import y.AbstractC6463a;

/* renamed from: db.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2618f extends o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28190Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f28191Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f28192h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2618f(int i10, int i11, k kVar) {
        super(3);
        this.f28190Y = i11;
        this.f28191Z = kVar;
        this.f28192h0 = i10;
    }

    public final void a(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f28190Y;
        int i12 = this.f28192h0;
        Object obj = this.f28191Z;
        switch (i11) {
            case 0:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a5 = io.sentry.compose.b.a("StarRatingBar");
                if ((i10 & 81) == 16) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC5824b F10 = m.F(R.drawable.star_filled, abstractC1725n);
                String v10 = H.v(R.string.gizmo_rating_filled_star_cd, abstractC1725n);
                r rVar2 = (r) abstractC1725n;
                long j6 = ((P0) rVar2.m(R0.f19593a)).f19533q;
                AbstractC4326r j10 = androidx.compose.foundation.layout.e.j(c4323o, q.f42833d);
                rVar2.W(-1968604259);
                k kVar = (k) obj;
                boolean g10 = rVar2.g(kVar) | rVar2.e(i12);
                Object K10 = rVar2.K();
                if (g10 || K10 == iVar) {
                    K10 = new C2617e(i12, 0, kVar);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                AbstractC1607r1.a(F10, v10, AbstractC4194d.a((X) a5, androidx.compose.foundation.a.h(j10, (AbstractC6216a) K10)), j6, rVar2, 8, 0);
                return;
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a10 = io.sentry.compose.b.a("StarRatingBar");
                if ((i10 & 81) == 16) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC5824b F11 = m.F(R.drawable.star_filled, abstractC1725n);
                String v11 = H.v(R.string.gizmo_rating_empty_star_cd, abstractC1725n);
                r rVar4 = (r) abstractC1725n;
                long j11 = ((P0) rVar4.m(R0.f19593a)).f19534r;
                AbstractC4326r j12 = androidx.compose.foundation.layout.e.j(c4323o, q.f42833d);
                rVar4.W(-1968603680);
                k kVar2 = (k) obj;
                boolean g11 = rVar4.g(kVar2) | rVar4.e(i12);
                Object K11 = rVar4.K();
                if (g11 || K11 == iVar) {
                    K11 = new C2617e(i12, 1, kVar2);
                    rVar4.h0(K11);
                }
                rVar4.t(false);
                AbstractC1607r1.a(F11, v11, AbstractC4194d.a((X) a10, androidx.compose.foundation.a.h(j12, (AbstractC6216a) K11)), j11, rVar4, 8, 0);
                return;
        }
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        char c10;
        int i10;
        y yVar = y.f36177a;
        switch (this.f28190Y) {
            case 0:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                n nVar = (n) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("innerTextField", nVar);
                C4323o c4323o = C4323o.f37719b;
                u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 14) == 0) {
                    if (((r) abstractC1725n).i(nVar)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 91) == 18) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                nVar.invoke(abstractC1725n, Integer.valueOf(intValue & 14));
                AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
                C0424h c0424h = AbstractC0429m.f3912f;
                String str = (String) this.f28191Z;
                r rVar2 = (r) abstractC1725n;
                rVar2.W(693286680);
                N a5 = p0.a(c0424h, C4310b.f37702o0, rVar2);
                rVar2.W(-1323940314);
                int i11 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i12 = androidx.compose.ui.layout.a.i(d10);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a5, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                        AbstractC6463a.q(i11, rVar2, i11, c0581j);
                    }
                    AbstractC6463a.r(0, i12, new L0(rVar2), rVar2, 2058660585);
                    rVar2.W(-431109736);
                    int i13 = 0;
                    while (true) {
                        boolean z10 = true;
                        if (i13 < this.f28192h0) {
                            if (i13 >= 0 && i13 <= Lg.n.g2(str)) {
                                c10 = str.charAt(i13);
                            } else {
                                c10 = ' ';
                            }
                            if (i13 != str.length()) {
                                z10 = false;
                            }
                            K8.d.g0(c10, z10, rVar2, 0, 0);
                            i13++;
                        } else {
                            AbstractC6463a.v(rVar2, false, false, true, false);
                            rVar2.t(false);
                            return yVar;
                        }
                    }
                } else {
                    R4.b.r1();
                    throw null;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2618f(int i10, String str) {
        super(3);
        this.f28190Y = 2;
        this.f28192h0 = i10;
        this.f28191Z = str;
    }
}
