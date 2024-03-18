package Eh;

import wh.AbstractC6250o;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class V extends Y {
    public V() {
        super("RETURNING", 0);
    }

    @Override // Eh.Z
    public final Hh.n a(AbstractC6250o abstractC6250o, AbstractC6250o abstractC6250o2, Ih.a aVar, int i10) {
        l1.a aVar2;
        if (abstractC6250o.W0()) {
            aVar2 = abstractC6250o.mo118a().w0();
        } else {
            aVar2 = abstractC6250o.getReturnType();
        }
        Hh.n a5 = aVar.a(aVar2, abstractC6250o2.getReturnType(), i10);
        if (a5.b()) {
            return new Hh.j(a5, Mh.i.h(abstractC6250o2.getReturnType()));
        }
        throw new IllegalStateException("Cannot return " + abstractC6250o.getReturnType() + " from " + abstractC6250o2);
    }
}
