package Nf;

import id.AbstractC3557B;
import java.util.Iterator;
import kf.u;
import kg.C4291c;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class g implements i {
    @Override // Nf.i
    public final boolean G(C4291c c4291c) {
        return AbstractC4344b.x0(this, c4291c);
    }

    @Override // Nf.i
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return u.f37482Y;
    }

    @Override // Nf.i
    public final c l(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        return null;
    }

    public final String toString() {
        return "EMPTY";
    }
}
