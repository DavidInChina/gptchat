package cc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: a  reason: collision with root package name */
    public final xd.e f26579a;

    public l(xd.e eVar) {
        AbstractC3557B.c0("accountUserState", eVar);
        this.f26579a = eVar;
    }

    @Override // cc.n
    public final xd.e a() {
        return this.f26579a;
    }

    @Override // cc.n
    public final boolean b() {
        return Ad.l.y0(this);
    }

    @Override // cc.o
    public final int c() {
        return A7.b.J0(this);
    }

    @Override // cc.o
    public final String d() {
        return A7.b.H0(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && AbstractC3557B.K(this.f26579a, ((l) obj).f26579a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26579a.hashCode();
    }

    public final String toString() {
        return "Processing(accountUserState=" + this.f26579a + Separators.RPAREN;
    }
}
