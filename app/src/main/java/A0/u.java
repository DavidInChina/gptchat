package a0;

import Z.AbstractC1707e;
import Z.C1705d;
import Z.C1742w;
import Z.Q0;

/* loaded from: classes2.dex */
public final class u extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final u f23838c = new AbstractC1901G(1, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        C1705d c1705d = (C1705d) c1902h.b(0);
        int a5 = c1902h.a(0);
        abstractC1707e.f();
        c1705d.getClass();
        abstractC1707e.b(a5, q02.x(q02.c(c1705d)));
    }

    @Override // a0.AbstractC1901G
    public final String b(int i10) {
        if (R4.b.r0(i10, 0)) {
            return "insertIndex";
        }
        return super.b(i10);
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "groupAnchor";
        }
        return super.c(i10);
    }
}
