package A6;

import A.AbstractC0044t0;
import E9.f;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f713a;

    /* renamed from: b  reason: collision with root package name */
    public final String f714b;

    /* renamed from: c  reason: collision with root package name */
    public final String f715c;

    public d(int i10, String str, String str2) {
        AbstractC2469q0.q("type", i10);
        AbstractC3557B.c0("message", str);
        this.f713a = i10;
        this.f714b = str;
        this.f715c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f713a == dVar.f713a && AbstractC3557B.K(this.f714b, dVar.f714b) && AbstractC3557B.K(this.f715c, dVar.f715c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = f.v(this.f714b, AbstractC6708l.f(this.f713a) * 31, 31);
        String str = this.f715c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TelemetryEventId(type=");
        sb2.append(AbstractC0044t0.G(this.f713a));
        sb2.append(", message=");
        sb2.append(this.f714b);
        sb2.append(", kind=");
        return R.a.t(sb2, this.f715c, Separators.RPAREN);
    }
}
