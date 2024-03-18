package q5;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import z.AbstractC6708l;

/* renamed from: q5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5274d {

    /* renamed from: a  reason: collision with root package name */
    public final int f43924a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43925b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f43926c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f43927d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f43928e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f43929f;

    /* renamed from: g  reason: collision with root package name */
    public final String f43930g;

    public C5274d(int i10, String str, Long l10, Long l11, Long l12, Long l13, String str2) {
        AbstractC2469q0.q("connectivity", i10);
        this.f43924a = i10;
        this.f43925b = str;
        this.f43926c = l10;
        this.f43927d = l11;
        this.f43928e = l12;
        this.f43929f = l13;
        this.f43930g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5274d)) {
            return false;
        }
        C5274d c5274d = (C5274d) obj;
        if (this.f43924a == c5274d.f43924a && AbstractC3557B.K(this.f43925b, c5274d.f43925b) && AbstractC3557B.K(this.f43926c, c5274d.f43926c) && AbstractC3557B.K(this.f43927d, c5274d.f43927d) && AbstractC3557B.K(this.f43928e, c5274d.f43928e) && AbstractC3557B.K(this.f43929f, c5274d.f43929f) && AbstractC3557B.K(this.f43930g, c5274d.f43930g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int f6 = AbstractC6708l.f(this.f43924a) * 31;
        int i15 = 0;
        String str = this.f43925b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i16 = (f6 + i10) * 31;
        Long l10 = this.f43926c;
        if (l10 == null) {
            i11 = 0;
        } else {
            i11 = l10.hashCode();
        }
        int i17 = (i16 + i11) * 31;
        Long l11 = this.f43927d;
        if (l11 == null) {
            i12 = 0;
        } else {
            i12 = l11.hashCode();
        }
        int i18 = (i17 + i12) * 31;
        Long l12 = this.f43928e;
        if (l12 == null) {
            i13 = 0;
        } else {
            i13 = l12.hashCode();
        }
        int i19 = (i18 + i13) * 31;
        Long l13 = this.f43929f;
        if (l13 == null) {
            i14 = 0;
        } else {
            i14 = l13.hashCode();
        }
        int i20 = (i19 + i14) * 31;
        String str2 = this.f43930g;
        if (str2 != null) {
            i15 = str2.hashCode();
        }
        return i20 + i15;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkInfo(connectivity=");
        sb2.append(AbstractC4194d.J(this.f43924a));
        sb2.append(", carrierName=");
        sb2.append(this.f43925b);
        sb2.append(", carrierId=");
        sb2.append(this.f43926c);
        sb2.append(", upKbps=");
        sb2.append(this.f43927d);
        sb2.append(", downKbps=");
        sb2.append(this.f43928e);
        sb2.append(", strength=");
        sb2.append(this.f43929f);
        sb2.append(", cellularTechnology=");
        return R.a.t(sb2, this.f43930g, Separators.RPAREN);
    }

    public /* synthetic */ C5274d(int i10, String str, Long l10, Long l11, Long l12, Long l13, String str2, int i11) {
        this((i11 & 1) != 0 ? 1 : i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : l10, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : l12, (i11 & 32) != 0 ? null : l13, (i11 & 64) == 0 ? str2 : null);
    }
}
