package a0;

import Z.AbstractC1707e;
import Z.C1705d;
import Z.C1742w;
import Z.Q0;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class p extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final p f23833c = new AbstractC1901G(1, 2);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        Object mo122invoke = ((AbstractC6216a) c1902h.b(0)).mo122invoke();
        C1705d c1705d = (C1705d) c1902h.b(1);
        int a5 = c1902h.a(0);
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>", abstractC1707e);
        c1705d.getClass();
        q02.O(q02.c(c1705d), mo122invoke);
        abstractC1707e.g(a5, mo122invoke);
        abstractC1707e.c(mo122invoke);
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
            return "factory";
        }
        if (A7.b.A0(i10, 1)) {
            return "groupAnchor";
        }
        return super.c(i10);
    }
}
