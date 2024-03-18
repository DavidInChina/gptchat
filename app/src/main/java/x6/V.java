package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a  reason: collision with root package name */
    public final int f49109a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49110b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49111c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49112d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49113e;

    public V(int i10, String str, String str2, String str3, String str4) {
        AbstractC2469q0.q("type", i10);
        this.f49109a = i10;
        this.f49110b = str;
        this.f49111c = str2;
        this.f49112d = str3;
        this.f49113e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        if (this.f49109a == v10.f49109a && AbstractC3557B.K(this.f49110b, v10.f49110b) && AbstractC3557B.K(this.f49111c, v10.f49111c) && AbstractC3557B.K(this.f49112d, v10.f49112d) && AbstractC3557B.K(this.f49113e, v10.f49113e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int f6 = AbstractC6708l.f(this.f49109a) * 31;
        int i13 = 0;
        String str = this.f49110b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = (f6 + i10) * 31;
        String str2 = this.f49111c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f49112d;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.f49113e;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(type=");
        sb2.append(AbstractC6287d.g0(this.f49109a));
        sb2.append(", name=");
        sb2.append(this.f49110b);
        sb2.append(", model=");
        sb2.append(this.f49111c);
        sb2.append(", brand=");
        sb2.append(this.f49112d);
        sb2.append(", architecture=");
        return R.a.t(sb2, this.f49113e, Separators.RPAREN);
    }
}
