package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6300h0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49321a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f49322b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49323c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49324d;

    public C6300h0(String str, String str2, boolean z10, String str3) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("stack", str2);
        this.f49321a = str;
        this.f49322b = z10;
        this.f49323c = str2;
        this.f49324d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6300h0)) {
            return false;
        }
        C6300h0 c6300h0 = (C6300h0) obj;
        if (AbstractC3557B.K(this.f49321a, c6300h0.f49321a) && this.f49322b == c6300h0.f49322b && AbstractC3557B.K(this.f49323c, c6300h0.f49323c) && AbstractC3557B.K(this.f49324d, c6300h0.f49324d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f49321a.hashCode() * 31;
        boolean z10 = this.f49322b;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int v10 = E9.f.v(this.f49323c, (hashCode + i11) * 31, 31);
        String str = this.f49324d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Thread(name=");
        sb2.append(this.f49321a);
        sb2.append(", crashed=");
        sb2.append(this.f49322b);
        sb2.append(", stack=");
        sb2.append(this.f49323c);
        sb2.append(", state=");
        return R.a.t(sb2, this.f49324d, Separators.RPAREN);
    }
}
