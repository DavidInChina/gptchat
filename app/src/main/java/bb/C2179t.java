package bb;

import Uc.C1422g;
import Z8.AbstractC1809m0;
import android.content.Intent;
import id.AbstractC3557B;
import jf.C3959i;

/* renamed from: bb.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2179t extends r {
    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC2174n abstractC2174n = (AbstractC2174n) iVar;
        AbstractC3557B.c0("intent", abstractC2174n);
        boolean z10 = abstractC2174n instanceof C2173m;
        Qg.F0 f02 = this.f808e;
        if (z10) {
            C1422g c1422g = C1422g.f17674i;
            g(new Ad.p(C1422g.q1(((C2177q) f02.getValue()).f25888a, ((C2173m) abstractC2174n).f25871a)));
        } else if (abstractC2174n instanceof C2172l) {
            AbstractC1809m0.a().b(Z8.B0.f23239c, P4.a.o0(new C3959i("gizmo_id", new wd.O(((C2177q) f02.getValue()).f25888a))));
            Intent intent = new Intent();
            A7.b.G0(intent, ((C2172l) abstractC2174n).f25867a.f26531c);
            g(new Ad.n(intent));
        } else {
            throw new RuntimeException();
        }
    }
}
