package Hb;

import Mg.b;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import r0.r;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f7590a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7591b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7592c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7593d;

    public a(String str, long j6, long j10, long j11) {
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        this.f7590a = str;
        this.f7591b = j6;
        this.f7592c = j10;
        this.f7593d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3557B.K(this.f7590a, aVar.f7590a) && r.c(this.f7591b, aVar.f7591b) && r.c(this.f7592c, aVar.f7592c) && b.d(this.f7593d, aVar.f7593d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r.f44264l;
        return b.g(this.f7593d) + R.a.n(this.f7592c, R.a.n(this.f7591b, this.f7590a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String i10 = r.i(this.f7591b);
        String i11 = r.i(this.f7592c);
        String m10 = b.m(this.f7593d);
        StringBuilder sb2 = new StringBuilder("OnboardingHeroAnimationState(text=");
        android.gov.nist.core.a.y(sb2, this.f7590a, ", textColor=", i10, ", backgroundColor=");
        sb2.append(i11);
        sb2.append(", colorTransitionTime=");
        sb2.append(m10);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
