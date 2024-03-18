package ec;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: ec.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2861m implements AbstractC2868t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29239a;

    public C2861m(boolean z10) {
        this.f29239a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2861m) && this.f29239a == ((C2861m) obj).f29239a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29239a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("AllowTraining(active="), this.f29239a, Separators.RPAREN);
    }
}
