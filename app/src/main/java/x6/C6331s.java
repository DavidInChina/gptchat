package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6331s {

    /* renamed from: a  reason: collision with root package name */
    public final int f49429a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49430b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49431c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49432d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49433e;

    public C6331s(int i10, String str, String str2, String str3, String str4) {
        AbstractC2469q0.q("type", i10);
        this.f49429a = i10;
        this.f49430b = str;
        this.f49431c = str2;
        this.f49432d = str3;
        this.f49433e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6331s)) {
            return false;
        }
        C6331s c6331s = (C6331s) obj;
        if (this.f49429a == c6331s.f49429a && AbstractC3557B.K(this.f49430b, c6331s.f49430b) && AbstractC3557B.K(this.f49431c, c6331s.f49431c) && AbstractC3557B.K(this.f49432d, c6331s.f49432d) && AbstractC3557B.K(this.f49433e, c6331s.f49433e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int f6 = AbstractC6708l.f(this.f49429a) * 31;
        int i13 = 0;
        String str = this.f49430b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = (f6 + i10) * 31;
        String str2 = this.f49431c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f49432d;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.f49433e;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(type=");
        sb2.append(AbstractC6287d.c0(this.f49429a));
        sb2.append(", name=");
        sb2.append(this.f49430b);
        sb2.append(", model=");
        sb2.append(this.f49431c);
        sb2.append(", brand=");
        sb2.append(this.f49432d);
        sb2.append(", architecture=");
        return R.a.t(sb2, this.f49433e, Separators.RPAREN);
    }
}
