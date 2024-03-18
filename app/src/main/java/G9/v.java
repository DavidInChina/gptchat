package G9;

import Z8.AbstractC1809m0;
import Z8.B0;
import android.content.Intent;
import cb.C2334C;
import id.AbstractC3557B;
import jf.C3959i;
import x9.C6383b;

/* loaded from: classes2.dex */
public final class v extends r {
    @Override // Ad.g
    public final void i(Ad.i iVar) {
        C2334C c2334c;
        String str;
        g gVar = (g) iVar;
        AbstractC3557B.c0("intent", gVar);
        if (gVar instanceof f) {
            l(new C6383b(3, gVar));
        } else if ((gVar instanceof e) && (c2334c = ((q) this.f808e.getValue()).f6156c) != null && (str = c2334c.f26442e) != null) {
            AbstractC1809m0.a().b(B0.f23239c, P4.a.o0(new C3959i("gizmo_id", c2334c.f26438a)));
            Intent intent = new Intent();
            A7.b.G0(intent, str);
            g(new Ad.n(intent));
        }
    }
}
