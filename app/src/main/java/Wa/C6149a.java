package wa;

import F.AbstractC0528b;
import L0.u;
import Z.AbstractC1725n;
import Z.r;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;
import l0.C4323o;

/* renamed from: wa.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6149a extends o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public static final C6149a f48258Y = new o(3);

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("$this$item", (AbstractC0528b) obj);
        C4323o c4323o = C4323o.f37719b;
        u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 81) == 16) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        U3.f.c(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), 0.0f, 0L, abstractC1725n, 6, 6);
        return y.f36177a;
    }
}
