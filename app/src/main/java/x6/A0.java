package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class A0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f48909a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48910b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f48911c;

    public A0(String str, int i10, Boolean bool) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC2469q0.q("type", i10);
        this.f48909a = str;
        this.f48910b = i10;
        this.f48911c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        if (AbstractC3557B.K(this.f48909a, a02.f48909a) && this.f48910b == a02.f48910b && AbstractC3557B.K(this.f48911c, a02.f48911c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int d10 = AbstractC6708l.d(this.f48910b, this.f48909a.hashCode() * 31, 31);
        Boolean bool = this.f48911c;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        return d10 + i10;
    }

    public final String toString() {
        return "LongTaskEventSession(id=" + this.f48909a + ", type=" + AbstractC6287d.R(this.f48910b) + ", hasReplay=" + this.f48911c + Separators.RPAREN;
    }
}
