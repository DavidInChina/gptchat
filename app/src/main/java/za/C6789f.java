package za;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: za.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6789f implements AbstractC6790g {

    /* renamed from: a  reason: collision with root package name */
    public final Float f51787a;

    public C6789f(Float f6) {
        this.f51787a = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6789f) && AbstractC3557B.K(this.f51787a, ((C6789f) obj).f51787a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Float f6 = this.f51787a;
        if (f6 == null) {
            return 0;
        }
        return f6.hashCode();
    }

    public final String toString() {
        return "Uploading(progress=" + this.f51787a + Separators.RPAREN;
    }
}
