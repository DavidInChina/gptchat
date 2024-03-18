package Mh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public final class n extends Hh.i {

    /* renamed from: Y  reason: collision with root package name */
    public final int f12172Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f12173Z;

    public n(o oVar, int i10) {
        this.f12173Z = oVar;
        this.f12172Y = i10;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        o oVar = this.f12173Z;
        lVar.I(oVar.f12181Y, this.f12172Y);
        return oVar.f12182Z.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f12172Y == nVar.f12172Y && this.f12173Z.equals(nVar.f12173Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12173Z.hashCode() + (((n.class.hashCode() * 31) + this.f12172Y) * 31);
    }
}
