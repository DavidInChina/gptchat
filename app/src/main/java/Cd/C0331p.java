package Cd;

import android.gov.nist.core.Separators;

/* renamed from: Cd.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331p implements y {

    /* renamed from: a  reason: collision with root package name */
    public final Ed.n f3066a;

    public C0331p(Ed.n nVar) {
        this.f3066a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0331p) && this.f3066a == ((C0331p) obj).f3066a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3066a.hashCode();
    }

    public final String toString() {
        return "Connect(surface=" + this.f3066a + Separators.RPAREN;
    }
}
