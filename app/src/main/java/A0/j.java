package a0;

import Z.AbstractC1707e;
import Z.C1742w;
import Z.Q0;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class j extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final j f23827c = new AbstractC1901G(0, 1, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>", abstractC1707e);
        for (Object obj : (Object[]) c1902h.b(0)) {
            abstractC1707e.c(obj);
        }
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "nodes";
        }
        return super.c(i10);
    }
}
