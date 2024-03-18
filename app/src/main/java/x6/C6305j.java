package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import z.AbstractC6708l;

/* renamed from: x6.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6305j {

    /* renamed from: a  reason: collision with root package name */
    public final int f49336a;

    /* renamed from: b  reason: collision with root package name */
    public final List f49337b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49338c;

    /* renamed from: d  reason: collision with root package name */
    public final C6296g f49339d;

    public C6305j(int i10, List list, int i11, C6296g c6296g) {
        AbstractC2469q0.q("status", i10);
        this.f49336a = i10;
        this.f49337b = list;
        this.f49338c = i11;
        this.f49339d = c6296g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6305j)) {
            return false;
        }
        C6305j c6305j = (C6305j) obj;
        if (this.f49336a == c6305j.f49336a && AbstractC3557B.K(this.f49337b, c6305j.f49337b) && this.f49338c == c6305j.f49338c && AbstractC3557B.K(this.f49339d, c6305j.f49339d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int f6 = AbstractC6708l.f(this.f49336a) * 31;
        int i12 = 0;
        List list = this.f49337b;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i13 = (f6 + i10) * 31;
        int i14 = this.f49338c;
        if (i14 == 0) {
            i11 = 0;
        } else {
            i11 = AbstractC6708l.f(i14);
        }
        int i15 = (i13 + i11) * 31;
        C6296g c6296g = this.f49339d;
        if (c6296g != null) {
            i12 = c6296g.hashCode();
        }
        return i15 + i12;
    }

    public final String toString() {
        return "Connectivity(status=" + AbstractC6287d.f0(this.f49336a) + ", interfaces=" + this.f49337b + ", effectiveType=" + AbstractC6287d.d0(this.f49338c) + ", cellular=" + this.f49339d + Separators.RPAREN;
    }
}
