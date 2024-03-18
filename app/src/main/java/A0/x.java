package a0;

import Z.AbstractC1707e;
import Z.C1742w;
import Z.Q0;

/* loaded from: classes2.dex */
public final class x extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final x f23841c = new AbstractC1901G(2, 0, 2);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        abstractC1707e.e(c1902h.a(0), c1902h.a(1));
    }

    @Override // a0.AbstractC1901G
    public final String b(int i10) {
        if (R4.b.r0(i10, 0)) {
            return "removeIndex";
        }
        if (R4.b.r0(i10, 1)) {
            return "count";
        }
        return super.b(i10);
    }
}
