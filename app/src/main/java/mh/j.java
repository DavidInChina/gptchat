package Mh;

import Bh.V0;
import wh.AbstractC6226B;
import wh.AbstractC6250o;
import yh.l1;

/* loaded from: classes2.dex */
public final class j implements l {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC6250o f12167Y;

    public j(V0 v02) {
        this.f12167Y = v02;
    }

    @Override // Mh.l
    public final Hh.n a(l1 l1Var, int i10) {
        l1 l02 = ((AbstractC6226B) this.f12167Y.getParameters().get(i10)).getType().l0();
        if (l1Var.equals(l02)) {
            return Hh.m.f7819Y;
        }
        return Ih.b.h(l02);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        if (this.f12167Y.equals(((j) obj).f12167Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12167Y.hashCode() + (j.class.hashCode() * 31);
    }
}
