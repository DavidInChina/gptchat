package a0;

import Z.AbstractC1707e;
import Z.C1742w;
import Z.Q0;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class z extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final z f23843c = new AbstractC1901G(0, 1, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        c1742w.f22746d.add((AbstractC6216a) c1902h.b(0));
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "effect";
        }
        return super.c(i10);
    }
}
