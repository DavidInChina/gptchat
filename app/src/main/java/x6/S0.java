package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a  reason: collision with root package name */
    public final T0 f49074a;

    /* renamed from: b  reason: collision with root package name */
    public final M0 f49075b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49076c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49077d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49078e;

    /* renamed from: f  reason: collision with root package name */
    public final Number f49079f;

    /* renamed from: g  reason: collision with root package name */
    public final Boolean f49080g;

    public S0(T0 t02, M0 m02, String str, String str2, String str3, Number number, Boolean bool) {
        this.f49074a = t02;
        this.f49075b = m02;
        this.f49076c = str;
        this.f49077d = str2;
        this.f49078e = str3;
        this.f49079f = number;
        this.f49080g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0)) {
            return false;
        }
        S0 s02 = (S0) obj;
        if (AbstractC3557B.K(this.f49074a, s02.f49074a) && AbstractC3557B.K(this.f49075b, s02.f49075b) && AbstractC3557B.K(this.f49076c, s02.f49076c) && AbstractC3557B.K(this.f49077d, s02.f49077d) && AbstractC3557B.K(this.f49078e, s02.f49078e) && AbstractC3557B.K(this.f49079f, s02.f49079f) && AbstractC3557B.K(this.f49080g, s02.f49080g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        T0 t02 = this.f49074a;
        if (t02 == null) {
            i10 = 0;
        } else {
            i10 = t02.hashCode();
        }
        int i17 = i10 * 31;
        M0 m02 = this.f49075b;
        if (m02 == null) {
            i11 = 0;
        } else {
            i11 = m02.hashCode();
        }
        int i18 = (i17 + i11) * 31;
        String str = this.f49076c;
        if (str == null) {
            i12 = 0;
        } else {
            i12 = str.hashCode();
        }
        int i19 = (i18 + i12) * 31;
        String str2 = this.f49077d;
        if (str2 == null) {
            i13 = 0;
        } else {
            i13 = str2.hashCode();
        }
        int i20 = (i19 + i13) * 31;
        String str3 = this.f49078e;
        if (str3 == null) {
            i14 = 0;
        } else {
            i14 = str3.hashCode();
        }
        int i21 = (i20 + i14) * 31;
        Number number = this.f49079f;
        if (number == null) {
            i15 = 0;
        } else {
            i15 = number.hashCode();
        }
        int i22 = (i21 + i15) * 31;
        Boolean bool = this.f49080g;
        if (bool != null) {
            i16 = bool.hashCode();
        }
        return i22 + i16;
    }

    public final String toString() {
        return "Dd(session=" + this.f49074a + ", configuration=" + this.f49075b + ", browserSdkVersion=" + this.f49076c + ", spanId=" + this.f49077d + ", traceId=" + this.f49078e + ", rulePsr=" + this.f49079f + ", discarded=" + this.f49080g + Separators.RPAREN;
    }
}
