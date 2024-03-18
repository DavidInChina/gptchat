package d9;

import Z.AbstractC1725n;
import Z.r;
import jf.y;
import l0.AbstractC4326r;

/* renamed from: d9.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2606a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final C2606a f28126Y = new kotlin.jvm.internal.o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
        if ((intValue & 11) == 2) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        q.b(a5, abstractC1725n, 0, 1);
        return y.f36177a;
    }
}
