package Cd;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class S extends T {

    /* renamed from: g  reason: collision with root package name */
    public final long f3022g;

    public S(long j6) {
        this.f3022g = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof S) && Mg.b.d(this.f3022g, ((S) obj).f3022g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Mg.b.g(this.f3022g);
    }

    public final String toString() {
        return android.gov.nist.core.a.A("WithGracePeriod(duration=", Mg.b.m(this.f3022g), Separators.RPAREN);
    }
}
