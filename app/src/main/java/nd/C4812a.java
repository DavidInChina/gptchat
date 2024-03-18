package nd;

import Lg.n;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6205s;

/* renamed from: nd.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4812a {

    /* renamed from: a  reason: collision with root package name */
    public final h f40274a;

    /* renamed from: b  reason: collision with root package name */
    public final C6205s f40275b;

    /* renamed from: c  reason: collision with root package name */
    public final String f40276c;

    /* renamed from: d  reason: collision with root package name */
    public final String f40277d;

    /* renamed from: e  reason: collision with root package name */
    public final String f40278e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f40279f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f40280g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f40281h;

    public C4812a(h hVar, C6205s c6205s, String str) {
        AbstractC3557B.c0("authSession", hVar);
        AbstractC3557B.c0("accountUser", c6205s);
        AbstractC3557B.c0("accountId", str);
        this.f40274a = hVar;
        this.f40275b = c6205s;
        this.f40276c = str;
        String str2 = hVar.f40288a;
        this.f40277d = str2;
        this.f40278e = android.gov.nist.core.a.j(str2, "__", str);
        this.f40279f = n.c2(c6205s.f48458b.f48353b, "@openai.com", false);
        this.f40280g = c6205s.e();
        this.f40281h = c6205s.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4812a)) {
            return false;
        }
        C4812a c4812a = (C4812a) obj;
        if (AbstractC3557B.K(this.f40274a, c4812a.f40274a) && AbstractC3557B.K(this.f40275b, c4812a.f40275b) && AbstractC3557B.K(this.f40276c, c4812a.f40276c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f40275b.hashCode();
        return this.f40276c.hashCode() + ((hashCode + (this.f40274a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccountSession(authSession=");
        sb2.append(this.f40274a);
        sb2.append(", accountUser=");
        sb2.append(this.f40275b);
        sb2.append(", accountId=");
        return R.a.t(sb2, this.f40276c, Separators.RPAREN);
    }
}
