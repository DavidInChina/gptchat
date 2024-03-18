package a0;

import Z.AbstractC1707e;
import Z.C1714h0;
import Z.C1742w;
import Z.Q0;
import h0.C3289b;

/* renamed from: a0.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1908e extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final C1908e f23822c = new AbstractC1901G(0, 2, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        int i10;
        C3289b c3289b = (C3289b) c1902h.b(1);
        if (c3289b != null) {
            i10 = c3289b.f31682a;
        } else {
            i10 = 0;
        }
        C1904a c1904a = (C1904a) c1902h.b(0);
        if (i10 > 0) {
            abstractC1707e = new C1714h0(abstractC1707e, i10);
        }
        c1904a.a(abstractC1707e, q02, c1742w);
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "changes";
        }
        if (A7.b.A0(i10, 1)) {
            return "effectiveNodeIndex";
        }
        return super.c(i10);
    }
}
