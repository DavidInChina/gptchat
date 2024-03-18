package a0;

import Z.AbstractC1707e;
import Z.AbstractC1743w0;
import Z.C1741v0;
import Z.C1742w;
import Z.H0;
import Z.Q0;

/* renamed from: a0.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1898D extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final C1898D f23789c = new AbstractC1901G(1, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        Object b10 = c1902h.b(0);
        int a5 = c1902h.a(0);
        if (b10 instanceof H0) {
            c1742w.f22744b.add(((H0) b10).f22498a);
        }
        Object D6 = q02.D(q02.f22560r, b10, a5);
        if (D6 instanceof H0) {
            c1742w.f22745c.add(((H0) D6).f22498a);
        } else if (D6 instanceof C1741v0) {
            C1741v0 c1741v0 = (C1741v0) D6;
            AbstractC1743w0 abstractC1743w0 = c1741v0.f22737b;
            if (abstractC1743w0 != null) {
                abstractC1743w0.a();
            }
            c1741v0.f22737b = null;
            c1741v0.f22741f = null;
            c1741v0.f22742g = null;
        }
    }

    @Override // a0.AbstractC1901G
    public final String b(int i10) {
        if (R4.b.r0(i10, 0)) {
            return "groupSlotIndex";
        }
        return super.b(i10);
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "value";
        }
        return super.c(i10);
    }
}
