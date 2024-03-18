package W4;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.io.Serializable;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f20723a;

    /* renamed from: b  reason: collision with root package name */
    public int f20724b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Object f20725c;

    public a(int i10, Serializable serializable) {
        AbstractC2469q0.q("valeType", i10);
        this.f20723a = i10;
        this.f20725c = serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f20723a == aVar.f20723a && this.f20724b == aVar.f20724b && AbstractC3557B.K(this.f20725c, aVar.f20725c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f6 = ((AbstractC6708l.f(this.f20723a) * 31) + this.f20724b) * 31;
        Object obj = this.f20725c;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return f6 + i10;
    }

    public final String toString() {
        int i10 = this.f20724b;
        Object obj = this.f20725c;
        return "Param(valeType=" + R.a.I(this.f20723a) + ", location=" + i10 + ", value=" + obj + Separators.RPAREN;
    }
}
