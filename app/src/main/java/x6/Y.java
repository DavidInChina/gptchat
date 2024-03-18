package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public final String f49151a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49152b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f49153c;

    public Y(String str, int i10, Boolean bool) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC2469q0.q("type", i10);
        this.f49151a = str;
        this.f49152b = i10;
        this.f49153c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        if (AbstractC3557B.K(this.f49151a, y10.f49151a) && this.f49152b == y10.f49152b && AbstractC3557B.K(this.f49153c, y10.f49153c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int d10 = AbstractC6708l.d(this.f49152b, this.f49151a.hashCode() * 31, 31);
        Boolean bool = this.f49153c;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        return d10 + i10;
    }

    public final String toString() {
        return "ErrorEventSession(id=" + this.f49151a + ", type=" + AbstractC6287d.G(this.f49152b) + ", hasReplay=" + this.f49153c + Separators.RPAREN;
    }
}
