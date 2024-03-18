package Jh;

import Hh.k;
import Hh.m;
import Hh.n;
import yh.l1;

/* loaded from: classes.dex */
public final class j implements Ih.a {

    /* renamed from: Y  reason: collision with root package name */
    public final Ih.a f9285Y;

    public j(c cVar) {
        this.f9285Y = cVar;
    }

    @Override // Ih.a
    public final n a(l1.a aVar, l1.a aVar2, int i10) {
        Class cls = Void.TYPE;
        if (aVar.H(cls) && aVar2.H(cls)) {
            return m.f7819Y;
        }
        if (aVar.H(cls)) {
            if (E9.f.l(i10)) {
                return Lh.c.h(aVar2);
            }
            return k.f7814Y;
        } else if (aVar2.H(cls)) {
            return Hh.h.h(aVar);
        } else {
            return this.f9285Y.a(aVar, aVar2, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        if (this.f9285Y.equals(((j) obj).f9285Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9285Y.hashCode() + (j.class.hashCode() * 31);
    }
}
