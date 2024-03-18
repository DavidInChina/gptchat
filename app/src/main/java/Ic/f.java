package Ic;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public final float f8541a;

    public f(float f6) {
        this.f8541a = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && Float.compare(this.f8541a, ((f) obj).f8541a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8541a);
    }

    public final String toString() {
        return "Uploading(progress=" + this.f8541a + Separators.RPAREN;
    }
}
