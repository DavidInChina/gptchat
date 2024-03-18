package Qb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class e {
    public static final d Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f14562a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14563b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14564c;

    public e(int i10, String str, String str2, String str3) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, c.f14561b);
            throw null;
        }
        this.f14562a = str;
        this.f14563b = str2;
        this.f14564c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3557B.K(this.f14562a, eVar.f14562a) && AbstractC3557B.K(this.f14563b, eVar.f14563b) && AbstractC3557B.K(this.f14564c, eVar.f14564c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14564c.hashCode() + E9.f.v(this.f14563b, this.f14562a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Prompt(title=");
        sb2.append(this.f14562a);
        sb2.append(", description=");
        sb2.append(this.f14563b);
        sb2.append(", prompt=");
        return R.a.t(sb2, this.f14564c, Separators.RPAREN);
    }

    public e(String str, String str2, String str3) {
        AbstractC3557B.c0("title", str);
        AbstractC3557B.c0("description", str2);
        AbstractC3557B.c0(SDPKeywords.PROMPT, str3);
        this.f14562a = str;
        this.f14563b = str2;
        this.f14564c = str3;
    }
}
