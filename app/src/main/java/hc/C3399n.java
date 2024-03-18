package hc;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: hc.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3399n implements AbstractC3402q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32213a;

    public C3399n(boolean z10) {
        this.f32213a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3399n) && this.f32213a == ((C3399n) obj).f32213a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f32213a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("ConfirmClose(close="), this.f32213a, Separators.RPAREN);
    }
}
