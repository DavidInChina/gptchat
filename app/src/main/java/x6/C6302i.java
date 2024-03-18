package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6302i {

    /* renamed from: a  reason: collision with root package name */
    public final Number f49325a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f49326b;

    public C6302i(Number number, Number number2) {
        this.f49325a = number;
        this.f49326b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6302i)) {
            return false;
        }
        C6302i c6302i = (C6302i) obj;
        if (AbstractC3557B.K(this.f49325a, c6302i.f49325a) && AbstractC3557B.K(this.f49326b, c6302i.f49326b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f49325a.hashCode() * 31;
        Number number = this.f49326b;
        if (number == null) {
            i10 = 0;
        } else {
            i10 = number.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.f49325a + ", sessionReplaySampleRate=" + this.f49326b + Separators.RPAREN;
    }
}
