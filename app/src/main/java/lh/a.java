package Lh;

import Eh.AbstractC0510i;
import Eh.AbstractC0511j;
import Nh.r;
import yh.l1;

/* loaded from: classes2.dex */
public final class a implements Hh.n {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f11155Y;

    public a(l1 l1Var) {
        this.f11155Y = l1Var;
    }

    @Override // Hh.n
    public final boolean b() {
        return true;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        boolean d10 = ((AbstractC0510i) abstractC0511j).f4794b.d(ph.f.f43189k0);
        l1 l1Var = this.f11155Y;
        if (d10 && l1Var.m0(((AbstractC0510i) abstractC0511j).f4793a)) {
            lVar.t(r.u(l1Var.getDescriptor()));
        } else {
            lVar.t(l1Var.getName());
            lVar.z(184, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
        }
        return b.f11165p0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        if (this.f11155Y.equals(((a) obj).f11155Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11155Y.hashCode() + (a.class.hashCode() * 31);
    }
}
