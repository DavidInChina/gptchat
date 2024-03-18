package Jc;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class A implements B {

    /* renamed from: a  reason: collision with root package name */
    public final float f9037a;

    public A(float f6) {
        this.f9037a = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof A) && Float.compare(this.f9037a, ((A) obj).f9037a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9037a);
    }

    public final String toString() {
        return "Progress(progress=" + this.f9037a + Separators.RPAREN;
    }
}
