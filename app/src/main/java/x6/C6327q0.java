package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import z.AbstractC6708l;

/* renamed from: x6.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6327q0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f49418a;

    /* renamed from: b  reason: collision with root package name */
    public final List f49419b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49420c;

    /* renamed from: d  reason: collision with root package name */
    public final C6318n0 f49421d;

    public C6327q0(int i10, List list, int i11, C6318n0 c6318n0) {
        AbstractC2469q0.q("status", i10);
        this.f49418a = i10;
        this.f49419b = list;
        this.f49420c = i11;
        this.f49421d = c6318n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6327q0)) {
            return false;
        }
        C6327q0 c6327q0 = (C6327q0) obj;
        if (this.f49418a == c6327q0.f49418a && AbstractC3557B.K(this.f49419b, c6327q0.f49419b) && this.f49420c == c6327q0.f49420c && AbstractC3557B.K(this.f49421d, c6327q0.f49421d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int f6 = AbstractC6708l.f(this.f49418a) * 31;
        int i12 = 0;
        List list = this.f49419b;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i13 = (f6 + i10) * 31;
        int i14 = this.f49420c;
        if (i14 == 0) {
            i11 = 0;
        } else {
            i11 = AbstractC6708l.f(i14);
        }
        int i15 = (i13 + i11) * 31;
        C6318n0 c6318n0 = this.f49421d;
        if (c6318n0 != null) {
            i12 = c6318n0.hashCode();
        }
        return i15 + i12;
    }

    public final String toString() {
        return "Connectivity(status=" + AbstractC6287d.U(this.f49418a) + ", interfaces=" + this.f49419b + ", effectiveType=" + AbstractC6287d.P(this.f49420c) + ", cellular=" + this.f49421d + Separators.RPAREN;
    }
}
