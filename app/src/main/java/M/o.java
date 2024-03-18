package M;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f11349a;

    /* renamed from: b  reason: collision with root package name */
    public String f11350b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11351c = false;

    /* renamed from: d  reason: collision with root package name */
    public e f11352d = null;

    public o(String str, String str2) {
        this.f11349a = str;
        this.f11350b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3557B.K(this.f11349a, oVar.f11349a) && AbstractC3557B.K(this.f11350b, oVar.f11350b) && this.f11351c == oVar.f11351c && AbstractC3557B.K(this.f11352d, oVar.f11352d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int v10 = E9.f.v(this.f11350b, this.f11349a.hashCode() * 31, 31);
        if (this.f11351c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (v10 + i10) * 31;
        e eVar = this.f11352d;
        if (eVar == null) {
            i11 = 0;
        } else {
            i11 = eVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + this.f11349a + ", substitution=" + this.f11350b + ", isShowingSubstitution=" + this.f11351c + ", layoutCache=" + this.f11352d + ')';
    }
}
