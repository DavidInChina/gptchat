package U3;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f17398a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f17399b;

    public d(String str, Long l10) {
        this.f17398a = str;
        this.f17399b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3557B.K(this.f17398a, dVar.f17398a) && AbstractC3557B.K(this.f17399b, dVar.f17399b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f17398a.hashCode() * 31;
        Long l10 = this.f17399b;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "Preference(key=" + this.f17398a + ", value=" + this.f17399b + ')';
    }
}
