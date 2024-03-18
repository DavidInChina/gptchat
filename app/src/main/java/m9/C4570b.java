package m9;

import android.gov.nist.core.Separators;

/* renamed from: m9.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4570b extends A7.b {

    /* renamed from: m  reason: collision with root package name */
    public final EnumC4572d f38999m = EnumC4572d.f39001Y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4570b) && this.f38999m == ((C4570b) obj).f38999m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38999m.hashCode();
    }

    public final String toString() {
        return "LogCompliance(reason=" + this.f38999m + Separators.RPAREN;
    }
}
