package a0;

import Z.AbstractC1702b0;
import Z.AbstractC1704c0;
import Z.AbstractC1707e;
import Z.AbstractC1734s;
import Z.AbstractC1738u;
import Z.C1742w;
import Z.Q0;

/* renamed from: a0.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1910g extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final C1910g f23824c = new AbstractC1901G(0, 4, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        AbstractC1704c0 abstractC1704c0 = (AbstractC1704c0) c1902h.b(3);
        AbstractC1738u abstractC1738u = (AbstractC1738u) c1902h.b(1);
        AbstractC1702b0 abstractC1702b0 = (AbstractC1702b0) c1902h.b(0);
        abstractC1738u.i((AbstractC1704c0) c1902h.b(2));
        AbstractC1734s.j("Could not resolve state for movable content");
        throw null;
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "resolvedState";
        }
        if (A7.b.A0(i10, 1)) {
            return "resolvedCompositionContext";
        }
        if (A7.b.A0(i10, 2)) {
            return "from";
        }
        if (A7.b.A0(i10, 3)) {
            return "to";
        }
        return super.c(i10);
    }
}
