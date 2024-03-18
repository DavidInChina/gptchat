package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.s1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6333s1 {

    /* renamed from: a  reason: collision with root package name */
    public final Number f49435a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f49436b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f49437c;

    public C6333s1(Number number, Number number2, Boolean bool) {
        this.f49435a = number;
        this.f49436b = number2;
        this.f49437c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6333s1)) {
            return false;
        }
        C6333s1 c6333s1 = (C6333s1) obj;
        if (AbstractC3557B.K(this.f49435a, c6333s1.f49435a) && AbstractC3557B.K(this.f49436b, c6333s1.f49436b) && AbstractC3557B.K(this.f49437c, c6333s1.f49437c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f49435a.hashCode() * 31;
        int i11 = 0;
        Number number = this.f49436b;
        if (number == null) {
            i10 = 0;
        } else {
            i10 = number.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        Boolean bool = this.f49437c;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.f49435a + ", sessionReplaySampleRate=" + this.f49436b + ", startSessionReplayRecordingManually=" + this.f49437c + Separators.RPAREN;
    }
}
