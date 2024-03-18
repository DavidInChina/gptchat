package fb;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* renamed from: fb.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2995n {

    /* renamed from: a  reason: collision with root package name */
    public final String f30101a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30102b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30103c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30104d;

    public C2995n(String str, String str2, String str3, String str4) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f30101a = str;
        this.f30102b = str2;
        this.f30103c = str3;
        this.f30104d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2995n)) {
            return false;
        }
        C2995n c2995n = (C2995n) obj;
        if (AbstractC3557B.K(this.f30101a, c2995n.f30101a) && AbstractC3557B.K(this.f30102b, c2995n.f30102b) && AbstractC3557B.K(this.f30103c, c2995n.f30103c) && AbstractC3557B.K(this.f30104d, c2995n.f30104d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30104d.hashCode() + E9.f.v(this.f30103c, E9.f.v(this.f30102b, this.f30101a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Item(id=");
        sb2.append(this.f30101a);
        sb2.append(", name=");
        sb2.append(this.f30102b);
        sb2.append(", licenseName=");
        sb2.append(this.f30103c);
        sb2.append(", licenseUrl=");
        return R.a.t(sb2, this.f30104d, Separators.RPAREN);
    }
}
