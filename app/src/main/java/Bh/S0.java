package Bh;

import vh.AbstractC6048a;

/* loaded from: classes.dex */
public final class S0 implements T0 {

    /* renamed from: a  reason: collision with root package name */
    public final vh.g f2275a;

    public S0(vh.g gVar) {
        this.f2275a = gVar;
    }

    public final void a(io.sentry.vendor.b bVar, Fh.n nVar) {
        vh.g gVar = this.f2275a;
        io.sentry.vendor.b j6 = bVar.j(((AbstractC6048a) gVar).j1(), null, ((AbstractC6048a) gVar).getName(), ((AbstractC6048a) gVar).getDescriptor(), gVar.N0());
        if (j6 != null) {
            Fh.p pVar = Fh.p.f5396Y;
            Fh.m mVar = (Fh.m) nVar;
            mVar.getClass();
            pVar.a(j6, gVar, mVar);
            j6.g();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S0.class != obj.getClass()) {
            return false;
        }
        if (this.f2275a.equals(((S0) obj).f2275a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2275a.hashCode() + (S0.class.hashCode() * 31);
    }
}
