package Lg;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f11145a;

    /* renamed from: b  reason: collision with root package name */
    public final Cf.g f11146b;

    public d(String str, Cf.g gVar) {
        this.f11145a = str;
        this.f11146b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3557B.K(this.f11145a, dVar.f11145a) && AbstractC3557B.K(this.f11146b, dVar.f11146b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11146b.hashCode() + (this.f11145a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f11145a + ", range=" + this.f11146b + ')';
    }
}
