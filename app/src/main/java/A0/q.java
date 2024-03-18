package a0;

import Z.AbstractC1707e;
import Z.C1705d;
import Z.C1742w;
import Z.N0;
import Z.Q0;

/* loaded from: classes2.dex */
public final class q extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final q f23834c = new AbstractC1901G(0, 2, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        N0 n02 = (N0) c1902h.b(1);
        C1705d c1705d = (C1705d) c1902h.b(0);
        q02.d();
        c1705d.getClass();
        q02.u(n02, n02.r(c1705d));
        q02.j();
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "anchor";
        }
        if (A7.b.A0(i10, 1)) {
            return "from";
        }
        return super.c(i10);
    }
}
