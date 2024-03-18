package Vf;

import Bg.A;
import Jf.p;
import Mf.B;
import Mf.h0;
import Pf.c0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class d extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final d f18947Y = new o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        A a5;
        B b10 = (B) obj;
        AbstractC3557B.c0("module", b10);
        h0 W6 = N.W(c.f18944b, b10.j().i(p.f9187t));
        if (W6 != null) {
            a5 = ((c0) W6).getType();
        } else {
            a5 = null;
        }
        if (a5 == null) {
            return Dg.m.c(Dg.l.f3684H0, new String[0]);
        }
        return a5;
    }
}
