package a0;

import Z.AbstractC1707e;
import Z.C1742w;
import Z.Q0;

/* renamed from: a0.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1896B extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final C1896B f23787c = new AbstractC1901G(0, 1, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        q02.M(c1902h.b(0));
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "data";
        }
        return super.c(i10);
    }
}
