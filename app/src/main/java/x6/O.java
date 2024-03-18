package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final int f49049a;

    /* renamed from: b  reason: collision with root package name */
    public final List f49050b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49051c;

    /* renamed from: d  reason: collision with root package name */
    public final L f49052d;

    public O(int i10, List list, int i11, L l10) {
        AbstractC2469q0.q("status", i10);
        this.f49049a = i10;
        this.f49050b = list;
        this.f49051c = i11;
        this.f49052d = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        if (this.f49049a == o10.f49049a && AbstractC3557B.K(this.f49050b, o10.f49050b) && this.f49051c == o10.f49051c && AbstractC3557B.K(this.f49052d, o10.f49052d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int f6 = AbstractC6708l.f(this.f49049a) * 31;
        int i12 = 0;
        List list = this.f49050b;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i13 = (f6 + i10) * 31;
        int i14 = this.f49051c;
        if (i14 == 0) {
            i11 = 0;
        } else {
            i11 = AbstractC6708l.f(i14);
        }
        int i15 = (i13 + i11) * 31;
        L l10 = this.f49052d;
        if (l10 != null) {
            i12 = l10.hashCode();
        }
        return i15 + i12;
    }

    public final String toString() {
        return "Connectivity(status=" + AbstractC6287d.N(this.f49049a) + ", interfaces=" + this.f49050b + ", effectiveType=" + AbstractC6287d.h0(this.f49051c) + ", cellular=" + this.f49052d + Separators.RPAREN;
    }
}
