package a0;

import Z.AbstractC1707e;
import Z.C1742w;
import Z.Q0;

/* renamed from: a0.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1899E extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final C1899E f23790c = new AbstractC1901G(1, 0, 2);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        int a5 = c1902h.a(0);
        for (int i10 = 0; i10 < a5; i10++) {
            abstractC1707e.f();
        }
    }

    @Override // a0.AbstractC1901G
    public final String b(int i10) {
        if (R4.b.r0(i10, 0)) {
            return "count";
        }
        return super.b(i10);
    }
}
