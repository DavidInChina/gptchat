package bb;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: bb.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2149A implements AbstractC2151C {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25679a;

    public C2149A(boolean z10) {
        this.f25679a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2149A) && this.f25679a == ((C2149A) obj).f25679a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f25679a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("UpdateEmailAttached(emailWillBeSent="), this.f25679a, Separators.RPAREN);
    }
}
