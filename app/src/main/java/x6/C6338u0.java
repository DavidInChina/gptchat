package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.u0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6338u0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6341v0 f49445a;

    /* renamed from: b  reason: collision with root package name */
    public final C6324p0 f49446b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49447c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f49448d;

    public C6338u0(C6341v0 c6341v0, C6324p0 c6324p0, String str, Boolean bool) {
        this.f49445a = c6341v0;
        this.f49446b = c6324p0;
        this.f49447c = str;
        this.f49448d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6338u0)) {
            return false;
        }
        C6338u0 c6338u0 = (C6338u0) obj;
        if (AbstractC3557B.K(this.f49445a, c6338u0.f49445a) && AbstractC3557B.K(this.f49446b, c6338u0.f49446b) && AbstractC3557B.K(this.f49447c, c6338u0.f49447c) && AbstractC3557B.K(this.f49448d, c6338u0.f49448d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        C6341v0 c6341v0 = this.f49445a;
        if (c6341v0 == null) {
            i10 = 0;
        } else {
            i10 = c6341v0.hashCode();
        }
        int i14 = i10 * 31;
        C6324p0 c6324p0 = this.f49446b;
        if (c6324p0 == null) {
            i11 = 0;
        } else {
            i11 = c6324p0.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str = this.f49447c;
        if (str == null) {
            i12 = 0;
        } else {
            i12 = str.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        Boolean bool = this.f49448d;
        if (bool != null) {
            i13 = bool.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "Dd(session=" + this.f49445a + ", configuration=" + this.f49446b + ", browserSdkVersion=" + this.f49447c + ", discarded=" + this.f49448d + Separators.RPAREN;
    }
}
