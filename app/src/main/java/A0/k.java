package a0;

import Z.AbstractC1707e;
import Z.AbstractC1736t;
import Z.C1742w;
import Z.Q0;

/* loaded from: classes2.dex */
public final class k extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final k f23828c = new AbstractC1901G(0, 2, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        ((wf.k) c1902h.b(0)).invoke((AbstractC1736t) c1902h.b(1));
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "anchor";
        }
        if (A7.b.A0(i10, 1)) {
            return "composition";
        }
        return super.c(i10);
    }
}
