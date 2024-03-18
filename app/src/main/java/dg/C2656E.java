package dg;

import id.AbstractC3557B;

/* renamed from: dg.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2656E {

    /* renamed from: a  reason: collision with root package name */
    public final String f28291a;

    public C2656E(String str) {
        this.f28291a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2656E) && AbstractC3557B.K(this.f28291a, ((C2656E) obj).f28291a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28291a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("MemberSignature(signature="), this.f28291a, ')');
    }
}
