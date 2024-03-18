package fe;

import id.AbstractC3557B;

/* renamed from: fe.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3026d {

    /* renamed from: a  reason: collision with root package name */
    public final String f30249a;

    public C3026d(String str) {
        this.f30249a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3026d) && AbstractC3557B.K(this.f30249a, ((C3026d) obj).f30249a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30249a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("Scm(url="), this.f30249a, ')');
    }
}
