package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6278a {

    /* renamed from: a  reason: collision with root package name */
    public final int f49208a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49209b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f49210c;

    /* renamed from: d  reason: collision with root package name */
    public final C6281b f49211d;

    /* renamed from: e  reason: collision with root package name */
    public final C6340v f49212e;

    /* renamed from: f  reason: collision with root package name */
    public final C6337u f49213f;

    /* renamed from: g  reason: collision with root package name */
    public final C6317n f49214g;

    /* renamed from: h  reason: collision with root package name */
    public final C6346x f49215h;

    /* renamed from: i  reason: collision with root package name */
    public final B f49216i;

    public C6278a(int i10, String str, Long l10, C6281b c6281b, C6340v c6340v, C6337u c6337u, C6317n c6317n, C6346x c6346x, B b10) {
        AbstractC2469q0.q("type", i10);
        this.f49208a = i10;
        this.f49209b = str;
        this.f49210c = l10;
        this.f49211d = c6281b;
        this.f49212e = c6340v;
        this.f49213f = c6337u;
        this.f49214g = c6317n;
        this.f49215h = c6346x;
        this.f49216i = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6278a)) {
            return false;
        }
        C6278a c6278a = (C6278a) obj;
        if (this.f49208a == c6278a.f49208a && AbstractC3557B.K(this.f49209b, c6278a.f49209b) && AbstractC3557B.K(this.f49210c, c6278a.f49210c) && AbstractC3557B.K(this.f49211d, c6278a.f49211d) && AbstractC3557B.K(this.f49212e, c6278a.f49212e) && AbstractC3557B.K(this.f49213f, c6278a.f49213f) && AbstractC3557B.K(this.f49214g, c6278a.f49214g) && AbstractC3557B.K(this.f49215h, c6278a.f49215h) && AbstractC3557B.K(this.f49216i, c6278a.f49216i)) {
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
        int i15;
        int i16;
        int f6 = AbstractC6708l.f(this.f49208a) * 31;
        int i17 = 0;
        String str = this.f49209b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i18 = (f6 + i10) * 31;
        Long l10 = this.f49210c;
        if (l10 == null) {
            i11 = 0;
        } else {
            i11 = l10.hashCode();
        }
        int i19 = (i18 + i11) * 31;
        C6281b c6281b = this.f49211d;
        if (c6281b == null) {
            i12 = 0;
        } else {
            i12 = c6281b.f49254a.hashCode();
        }
        int i20 = (i19 + i12) * 31;
        C6340v c6340v = this.f49212e;
        if (c6340v == null) {
            i13 = 0;
        } else {
            i13 = c6340v.f49451a.hashCode();
        }
        int i21 = (i20 + i13) * 31;
        C6337u c6337u = this.f49213f;
        if (c6337u == null) {
            i14 = 0;
        } else {
            i14 = c6337u.hashCode();
        }
        int i22 = (i21 + i14) * 31;
        C6317n c6317n = this.f49214g;
        if (c6317n == null) {
            i15 = 0;
        } else {
            i15 = c6317n.hashCode();
        }
        int i23 = (i22 + i15) * 31;
        C6346x c6346x = this.f49215h;
        if (c6346x == null) {
            i16 = 0;
        } else {
            i16 = c6346x.hashCode();
        }
        int i24 = (i23 + i16) * 31;
        B b10 = this.f49216i;
        if (b10 != null) {
            i17 = b10.hashCode();
        }
        return i24 + i17;
    }

    public final String toString() {
        return "ActionEventAction(type=" + AbstractC6287d.Q(this.f49208a) + ", id=" + this.f49209b + ", loadingTime=" + this.f49210c + ", target=" + this.f49211d + ", frustration=" + this.f49212e + ", error=" + this.f49213f + ", crash=" + this.f49214g + ", longTask=" + this.f49215h + ", resource=" + this.f49216i + Separators.RPAREN;
    }
}
