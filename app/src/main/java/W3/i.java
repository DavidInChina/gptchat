package W3;

/* loaded from: classes.dex */
public final class i extends g {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = g.f20717l0;
        }
        if (g.f20716k0.j(this, null, obj)) {
            g.c(this);
            return true;
        }
        return false;
    }

    public final boolean k(Throwable th2) {
        th2.getClass();
        if (g.f20716k0.j(this, null, new b(th2))) {
            g.c(this);
            return true;
        }
        return false;
    }

    public final boolean l(A8.a aVar) {
        b bVar;
        aVar.getClass();
        Object obj = this.f20718Y;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!g.f20716k0.j(this, null, g.f(aVar))) {
                    return false;
                }
                g.c(this);
            } else {
                e eVar = new e(this, aVar);
                if (g.f20716k0.j(this, null, eVar)) {
                    try {
                        aVar.a(eVar, h.f20721Y);
                    } catch (Throwable th2) {
                        try {
                            bVar = new b(th2);
                        } catch (Throwable unused) {
                            bVar = b.f20698b;
                        }
                        g.f20716k0.j(this, eVar, bVar);
                    }
                } else {
                    obj = this.f20718Y;
                }
            }
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        aVar.cancel(((a) obj).f20696a);
        return false;
    }
}
