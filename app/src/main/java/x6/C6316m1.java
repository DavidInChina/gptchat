package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.m1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6316m1 {

    /* renamed from: a  reason: collision with root package name */
    public final Number f49379a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f49380b;

    public C6316m1(Number number, Number number2) {
        this.f49379a = number;
        this.f49380b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6316m1)) {
            return false;
        }
        C6316m1 c6316m1 = (C6316m1) obj;
        if (AbstractC3557B.K(this.f49379a, c6316m1.f49379a) && AbstractC3557B.K(this.f49380b, c6316m1.f49380b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49380b.hashCode() + (this.f49379a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.f49379a + ", height=" + this.f49380b + Separators.RPAREN;
    }
}
