package kd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: kd.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4243g {

    /* renamed from: a  reason: collision with root package name */
    public final String f37303a;

    /* renamed from: b  reason: collision with root package name */
    public final Yg.p f37304b;

    public C4243g(String str, Yg.p pVar) {
        AbstractC3557B.c0("url", str);
        AbstractC3557B.c0("expiresAt", pVar);
        this.f37303a = str;
        this.f37304b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4243g)) {
            return false;
        }
        C4243g c4243g = (C4243g) obj;
        if (AbstractC3557B.K(this.f37303a, c4243g.f37303a) && AbstractC3557B.K(this.f37304b, c4243g.f37304b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37304b.f22419Y.hashCode() + (this.f37303a.hashCode() * 31);
    }

    public final String toString() {
        return "WebSocketConnectionInfo(url=" + this.f37303a + ", expiresAt=" + this.f37304b + Separators.RPAREN;
    }
}
