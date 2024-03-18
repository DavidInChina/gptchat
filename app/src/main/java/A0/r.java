package a0;

import Z.AbstractC1707e;
import Z.AbstractC1734s;
import Z.C1705d;
import Z.C1742w;
import Z.N0;
import Z.Q0;

/* loaded from: classes2.dex */
public final class r extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final r f23835c = new AbstractC1901G(0, 3, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        N0 n02 = (N0) c1902h.b(1);
        C1705d c1705d = (C1705d) c1902h.b(0);
        C1906c c1906c = (C1906c) c1902h.b(2);
        Q0 y10 = n02.y();
        try {
            if (c1906c.f23820b.d()) {
                c1906c.f23819a.c(abstractC1707e, y10, c1742w);
                y10.e();
                q02.d();
                c1705d.getClass();
                q02.u(n02, n02.r(c1705d));
                q02.j();
                return;
            }
            AbstractC1734s.j("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?".toString());
            throw null;
        } catch (Throwable th2) {
            y10.e();
            throw th2;
        }
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "anchor";
        }
        if (A7.b.A0(i10, 1)) {
            return "from";
        }
        if (A7.b.A0(i10, 2)) {
            return "fixups";
        }
        return super.c(i10);
    }
}
