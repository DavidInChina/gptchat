package za;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* renamed from: za.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6795l implements AbstractC6806w {

    /* renamed from: a  reason: collision with root package name */
    public final String f51791a;

    /* renamed from: b  reason: collision with root package name */
    public final Aa.c f51792b;

    public C6795l(String str, Aa.c cVar) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("action", cVar);
        this.f51791a = str;
        this.f51792b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6795l)) {
            return false;
        }
        C6795l c6795l = (C6795l) obj;
        if (AbstractC3557B.K(this.f51791a, c6795l.f51791a) && AbstractC3557B.K(this.f51792b, c6795l.f51792b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51792b.hashCode() + (this.f51791a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("DecorationAction(id=", R.a.t(new StringBuilder("InputDecorationId(value="), this.f51791a, Separators.RPAREN), ", action=");
        s10.append(this.f51792b);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
