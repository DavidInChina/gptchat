package Bh;

import yh.AbstractC6600d;
import yh.AbstractC6612h;

/* loaded from: classes2.dex */
public final class d1 implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6612h f2322a;

    public d1(AbstractC6612h abstractC6612h) {
        this.f2322a = abstractC6612h;
    }

    public final void a(io.sentry.vendor.b bVar, Fh.n nVar) {
        AbstractC6612h abstractC6612h = this.f2322a;
        io.sentry.vendor.b v10 = bVar.v(abstractC6612h.f1(), ((AbstractC6600d) abstractC6612h).getDescriptor(), abstractC6612h.N0());
        if (v10 != null) {
            Fh.C c10 = Fh.C.f5375Y;
            Fh.m mVar = (Fh.m) nVar;
            mVar.getClass();
            c10.a(v10, abstractC6612h, mVar);
            v10.g();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        if (this.f2322a.equals(((d1) obj).f2322a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2322a.hashCode() + (d1.class.hashCode() * 31);
    }
}
