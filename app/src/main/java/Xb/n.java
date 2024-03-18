package Xb;

import Z8.AbstractC1809m0;
import Z8.C1785a0;
import android.app.Application;
import android.content.Intent;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import kf.w;
import nf.AbstractC4828h;
import pd.t;
import rb.C5426p;

/* loaded from: classes.dex */
public final class n extends j {

    /* renamed from: j  reason: collision with root package name */
    public final t f21835j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(Application application, t tVar) {
        super(new p(r1, null, null));
        String string = application.getString(R.string.failwhale_default_error_message);
        AbstractC3557B.b0("getString(...)", string);
        this.f21835j = tVar;
        AbstractC1809m0.a().b(C1785a0.f23332c, w.f37484Y);
        L4.a.E0(L4.a.I0(new k(application, this, null), new C5426p(((Ub.e) tVar).f17604c, 3)), AbstractC4828h.Q(this));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        g gVar = (g) iVar;
        AbstractC3557B.c0("intent", gVar);
        if (gVar instanceof f) {
            Intent intent = ((p) e()).f21840c;
            if (intent != null) {
                f(new c(intent));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (gVar instanceof e) {
            h(new l(this, null));
        }
    }
}
