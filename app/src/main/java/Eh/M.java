package Eh;

import wh.AbstractC6226B;
import wh.AbstractC6250o;
import yh.l1;

/* loaded from: classes.dex */
public final class M implements S {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6226B f4755a;

    public M(AbstractC6226B abstractC6226B) {
        this.f4755a = abstractC6226B;
    }

    @Override // Eh.S
    public final l1 a() {
        return this.f4755a.getType().l0();
    }

    @Override // Eh.S
    public final Hh.j b(AbstractC6250o abstractC6250o, Ih.a aVar, int i10) {
        AbstractC6226B abstractC6226B = this.f4755a;
        Hh.n a5 = aVar.a(abstractC6226B.getType(), abstractC6250o.mo118a().w0(), i10);
        if (a5.b()) {
            return new Hh.j(new Mh.n(Mh.o.a(abstractC6226B.getType()), abstractC6226B.s()), a5);
        }
        throw new IllegalStateException("Cannot invoke " + abstractC6250o + " on " + abstractC6226B.getType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        if (this.f4755a.equals(((M) obj).f4755a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4755a.hashCode() + (M.class.hashCode() * 31);
    }
}
