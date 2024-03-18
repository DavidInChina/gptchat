package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import z.AbstractC6708l;

/* renamed from: x6.t1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6336t1 {

    /* renamed from: a  reason: collision with root package name */
    public final T1 f49440a;

    /* renamed from: b  reason: collision with root package name */
    public final List f49441b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49442c;

    /* renamed from: d  reason: collision with root package name */
    public final C6328q1 f49443d;

    public C6336t1(T1 t12, List list, int i10, C6328q1 c6328q1) {
        this.f49440a = t12;
        this.f49441b = list;
        this.f49442c = i10;
        this.f49443d = c6328q1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6336t1)) {
            return false;
        }
        C6336t1 c6336t1 = (C6336t1) obj;
        if (this.f49440a == c6336t1.f49440a && AbstractC3557B.K(this.f49441b, c6336t1.f49441b) && this.f49442c == c6336t1.f49442c && AbstractC3557B.K(this.f49443d, c6336t1.f49443d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f49440a.hashCode() * 31;
        int i12 = 0;
        List list = this.f49441b;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        int i14 = this.f49442c;
        if (i14 == 0) {
            i11 = 0;
        } else {
            i11 = AbstractC6708l.f(i14);
        }
        int i15 = (i13 + i11) * 31;
        C6328q1 c6328q1 = this.f49443d;
        if (c6328q1 != null) {
            i12 = c6328q1.hashCode();
        }
        return i15 + i12;
    }

    public final String toString() {
        return "Connectivity(status=" + this.f49440a + ", interfaces=" + this.f49441b + ", effectiveType=" + AbstractC6301h1.p(this.f49442c) + ", cellular=" + this.f49443d + Separators.RPAREN;
    }
}
