package sh;

import sh.AbstractC5636h;

/* renamed from: sh.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5634f implements AbstractC5636h.a, AbstractC5636h.c, AbstractC5635g, AbstractC5636h {
    @Override // sh.AbstractC5636h.a
    public final boolean E0() {
        return h1(512);
    }

    @Override // sh.AbstractC5635g
    public boolean H0() {
        return h1(64);
    }

    @Override // sh.AbstractC5636h
    public boolean M() {
        return h1(4096);
    }

    @Override // sh.AbstractC5636h.a
    public boolean M0() {
        return h1(8192);
    }

    @Override // sh.AbstractC5636h.b
    public final boolean e1() {
        if (!h1(1) && !h1(4) && !h1(2)) {
            return true;
        }
        return false;
    }

    public String f1() {
        return toString();
    }

    public final xh.e g1() {
        int u02 = u0();
        int i10 = u02 & 7;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 4) {
                        return xh.e.PROTECTED;
                    }
                    throw new IllegalStateException(android.gov.nist.core.a.e("Unexpected modifiers: ", u02));
                }
                return xh.e.PRIVATE;
            }
            return xh.e.PUBLIC;
        }
        return xh.e.PACKAGE_PRIVATE;
    }

    public String getTypeName() {
        return toString();
    }

    public final boolean h1(int i10) {
        if ((u0() & i10) == i10) {
            return true;
        }
        return false;
    }

    @Override // sh.AbstractC5636h.b
    public final boolean i0() {
        return h1(1);
    }

    @Override // sh.AbstractC5636h
    public final boolean isFinal() {
        return h1(16);
    }

    @Override // sh.AbstractC5636h.c
    public final boolean q0() {
        return h1(16384);
    }

    @Override // sh.AbstractC5636h.b
    public final boolean r() {
        return h1(8);
    }
}
