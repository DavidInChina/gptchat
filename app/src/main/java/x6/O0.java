package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f49053a;

    /* renamed from: b  reason: collision with root package name */
    public final List f49054b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49055c;

    /* renamed from: d  reason: collision with root package name */
    public final K0 f49056d;

    public O0(int i10, List list, int i11, K0 k02) {
        AbstractC2469q0.q("status", i10);
        this.f49053a = i10;
        this.f49054b = list;
        this.f49055c = i11;
        this.f49056d = k02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        if (this.f49053a == o02.f49053a && AbstractC3557B.K(this.f49054b, o02.f49054b) && this.f49055c == o02.f49055c && AbstractC3557B.K(this.f49056d, o02.f49056d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int f6 = AbstractC6708l.f(this.f49053a) * 31;
        int i12 = 0;
        List list = this.f49054b;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i13 = (f6 + i10) * 31;
        int i14 = this.f49055c;
        if (i14 == 0) {
            i11 = 0;
        } else {
            i11 = AbstractC6708l.f(i14);
        }
        int i15 = (i13 + i11) * 31;
        K0 k02 = this.f49056d;
        if (k02 != null) {
            i12 = k02.hashCode();
        }
        return i15 + i12;
    }

    public final String toString() {
        return "Connectivity(status=" + AbstractC6301h1.n(this.f49053a) + ", interfaces=" + this.f49054b + ", effectiveType=" + AbstractC6287d.W(this.f49055c) + ", cellular=" + this.f49056d + Separators.RPAREN;
    }
}
