package r6;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class c extends r.f {

    /* renamed from: f  reason: collision with root package name */
    public final int f44454f;

    public c(int i10) {
        this.f44454f = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f44454f == ((c) obj).f44454f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44454f;
    }

    public final String toString() {
        return android.gov.nist.core.a.l(new StringBuilder("Action(frustrationCount="), this.f44454f, Separators.RPAREN);
    }
}
