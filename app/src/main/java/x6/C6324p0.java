package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6324p0 {

    /* renamed from: a  reason: collision with root package name */
    public final Number f49412a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f49413b;

    public C6324p0(Number number, Number number2) {
        this.f49412a = number;
        this.f49413b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6324p0)) {
            return false;
        }
        C6324p0 c6324p0 = (C6324p0) obj;
        if (AbstractC3557B.K(this.f49412a, c6324p0.f49412a) && AbstractC3557B.K(this.f49413b, c6324p0.f49413b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f49412a.hashCode() * 31;
        Number number = this.f49413b;
        if (number == null) {
            i10 = 0;
        } else {
            i10 = number.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.f49412a + ", sessionReplaySampleRate=" + this.f49413b + Separators.RPAREN;
    }
}
