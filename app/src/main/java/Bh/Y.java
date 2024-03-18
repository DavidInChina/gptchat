package Bh;

import wh.AbstractC6250o;

/* loaded from: classes2.dex */
public final class Y implements X {

    /* renamed from: a  reason: collision with root package name */
    public final Hh.b f2305a;

    public Y(Hh.b bVar) {
        this.f2305a = bVar;
    }

    @Override // Bh.X
    public final c1 a(AbstractC6250o abstractC6250o, Fh.B b10, xh.e eVar) {
        return new Z0(abstractC6250o, this.f2305a, b10, eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y.class != obj.getClass()) {
            return false;
        }
        if (this.f2305a.equals(((Y) obj).f2305a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2305a.hashCode() + (Y.class.hashCode() * 31);
    }
}
