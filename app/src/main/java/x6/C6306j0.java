package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6306j0 {

    /* renamed from: a  reason: collision with root package name */
    public final Number f49340a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f49341b;

    public C6306j0(Number number, Number number2) {
        this.f49340a = number;
        this.f49341b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6306j0)) {
            return false;
        }
        C6306j0 c6306j0 = (C6306j0) obj;
        if (AbstractC3557B.K(this.f49340a, c6306j0.f49340a) && AbstractC3557B.K(this.f49341b, c6306j0.f49341b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49341b.hashCode() + (this.f49340a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.f49340a + ", height=" + this.f49341b + Separators.RPAREN;
    }
}
