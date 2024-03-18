package y;

import H0.AbstractC0701r0;
import Z.AbstractC1725n;
import Z.C1723m;
import android.view.ViewConfiguration;
import z.C6736z;

/* loaded from: classes2.dex */
public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f50282a = ViewConfiguration.getScrollFriction();

    public static final C6736z a(AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(904445851);
        Z0.b bVar = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
        Float valueOf = Float.valueOf(bVar.b());
        rVar.W(1157296644);
        boolean g10 = rVar.g(valueOf);
        Object K10 = rVar.K();
        if (g10 || K10 == C1723m.f22654Y) {
            K10 = new C6736z(new r0(bVar));
            rVar.h0(K10);
        }
        rVar.t(false);
        C6736z c6736z = (C6736z) K10;
        rVar.t(false);
        return c6736z;
    }
}
