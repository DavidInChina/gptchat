package Id;

import E.AbstractC0429m;
import E.AbstractC0440y;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import L0.u;
import Ng.H;
import W.AbstractC1607r1;
import W.P0;
import W.R0;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import Z.r;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4323o;
import p9.AbstractC5102d;
import wf.n;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class d extends o implements n {

    /* renamed from: Z  reason: collision with root package name */
    public static final d f8547Z = new d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final d f8548h0 = new d(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8549Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(2);
        this.f8549Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f8549Y) {
            case 0:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C4316h c4316h = C4310b.f37706s0;
                r rVar2 = (r) abstractC1725n;
                rVar2.W(-483455358);
                N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar2);
                rVar2.W(-1323940314);
                int i11 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i12 = androidx.compose.ui.layout.a.i(c4323o);
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
                    AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                    j4.b(H.v(R.string.voice_settings_title, rVar2), a10, AbstractC5102d.f42765b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131066);
                    j4.b(H.v(R.string.voice_settings_subtitle, rVar2), a10, ((P0) rVar2.m(R0.f19593a)).f19493A, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(q4.f20361a)).f20314o, rVar2, 0, 0, 65530);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 1:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC1607r1.a(m.F(R.drawable.arrow_left, abstractC1725n), H.v(R.string.design_up_button, abstractC1725n), a11, 0L, abstractC1725n, 8, 12);
                return;
            default:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar4 = (r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                Tc.f W02 = Ad.l.W0(null, abstractC1725n, 31);
                int i13 = Y.b.f22007c;
                f.a(W02, a12, null, false, io.sentry.hints.i.c(Z0.g.f22792b), null, abstractC1725n, 3080, 38);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f8549Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
