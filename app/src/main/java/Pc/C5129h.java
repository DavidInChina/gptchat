package pc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: pc.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5129h {

    /* renamed from: d  reason: collision with root package name */
    public static final C5129h f42991d = new C5129h("", EnumC5127f.f42981h0, "$19.99");

    /* renamed from: a  reason: collision with root package name */
    public final String f42992a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC5127f f42993b;

    /* renamed from: c  reason: collision with root package name */
    public final String f42994c;

    public C5129h(String str, EnumC5127f enumC5127f, String str2) {
        AbstractC3557B.c0("localizedPrice", str2);
        this.f42992a = str;
        this.f42993b = enumC5127f;
        this.f42994c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5129h)) {
            return false;
        }
        C5129h c5129h = (C5129h) obj;
        if (AbstractC3557B.K(this.f42992a, c5129h.f42992a) && this.f42993b == c5129h.f42993b && AbstractC3557B.K(this.f42994c, c5129h.f42994c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f42993b.hashCode();
        return this.f42994c.hashCode() + ((hashCode + (this.f42992a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("PurchasePackage(id=", C5128g.a(this.f42992a), ", duration=");
        s10.append(this.f42993b);
        s10.append(", localizedPrice=");
        return R.a.t(s10, this.f42994c, Separators.RPAREN);
    }
}
