package c6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* renamed from: c6.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2300e {

    /* renamed from: a  reason: collision with root package name */
    public final String f26300a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26301b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26302c;

    public C2300e(String str, String str2, String str3) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0(ParameterNames.VERSION, str3);
        this.f26300a = str;
        this.f26301b = str2;
        this.f26302c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2300e)) {
            return false;
        }
        C2300e c2300e = (C2300e) obj;
        if (AbstractC3557B.K(this.f26300a, c2300e.f26300a) && AbstractC3557B.K(this.f26301b, c2300e.f26301b) && AbstractC3557B.K(this.f26302c, c2300e.f26302c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f26300a.hashCode() * 31;
        String str = this.f26301b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f26302c.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Logger(name=");
        sb2.append(this.f26300a);
        sb2.append(", threadName=");
        sb2.append(this.f26301b);
        sb2.append(", version=");
        return R.a.t(sb2, this.f26302c, Separators.RPAREN);
    }
}
