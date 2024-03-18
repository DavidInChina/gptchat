package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.w0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6344w0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f49463a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49464b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49465c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49466d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49467e;

    public C6344w0(int i10, String str, String str2, String str3, String str4) {
        AbstractC2469q0.q("type", i10);
        this.f49463a = i10;
        this.f49464b = str;
        this.f49465c = str2;
        this.f49466d = str3;
        this.f49467e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6344w0)) {
            return false;
        }
        C6344w0 c6344w0 = (C6344w0) obj;
        if (this.f49463a == c6344w0.f49463a && AbstractC3557B.K(this.f49464b, c6344w0.f49464b) && AbstractC3557B.K(this.f49465c, c6344w0.f49465c) && AbstractC3557B.K(this.f49466d, c6344w0.f49466d) && AbstractC3557B.K(this.f49467e, c6344w0.f49467e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int f6 = AbstractC6708l.f(this.f49463a) * 31;
        int i13 = 0;
        String str = this.f49464b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = (f6 + i10) * 31;
        String str2 = this.f49465c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f49466d;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.f49467e;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(type=");
        sb2.append(AbstractC6287d.O(this.f49463a));
        sb2.append(", name=");
        sb2.append(this.f49464b);
        sb2.append(", model=");
        sb2.append(this.f49465c);
        sb2.append(", brand=");
        sb2.append(this.f49466d);
        sb2.append(", architecture=");
        return R.a.t(sb2, this.f49467e, Separators.RPAREN);
    }
}
