package M;

import N0.C1046e;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final C1046e f11328a;

    /* renamed from: b  reason: collision with root package name */
    public C1046e f11329b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11330c = false;

    /* renamed from: d  reason: collision with root package name */
    public d f11331d = null;

    public l(C1046e c1046e, C1046e c1046e2) {
        this.f11328a = c1046e;
        this.f11329b = c1046e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f11328a, lVar.f11328a) && AbstractC3557B.K(this.f11329b, lVar.f11329b) && this.f11330c == lVar.f11330c && AbstractC3557B.K(this.f11331d, lVar.f11331d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (this.f11329b.hashCode() + (this.f11328a.hashCode() * 31)) * 31;
        if (this.f11330c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        d dVar = this.f11331d;
        if (dVar == null) {
            i11 = 0;
        } else {
            i11 = dVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f11328a) + ", substitution=" + ((Object) this.f11329b) + ", isShowingSubstitution=" + this.f11330c + ", layoutCache=" + this.f11331d + ')';
    }
}
