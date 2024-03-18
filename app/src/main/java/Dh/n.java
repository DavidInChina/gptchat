package Dh;

import Bh.K;
import Eh.AbstractC0522v;
import Eh.EnumC0521u;
import yh.l1;

/* loaded from: classes.dex */
public final class n extends AbstractC0522v {

    /* renamed from: d  reason: collision with root package name */
    public final m f3727d;

    public n(l1 l1Var, K k10, EnumC0521u enumC0521u, m mVar) {
        super(l1Var, k10, enumC0521u);
        this.f3727d = mVar;
    }

    @Override // Eh.AbstractC0522v
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        if (!this.f3727d.equals(((n) obj).f3727d)) {
            return false;
        }
        return true;
    }

    @Override // Eh.AbstractC0522v
    public final int hashCode() {
        return this.f3727d.hashCode() + (super.hashCode() * 31);
    }
}
