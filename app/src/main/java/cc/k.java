package cc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a  reason: collision with root package name */
    public final xd.e f26578a;

    public k(xd.e eVar) {
        AbstractC3557B.c0("accountUserState", eVar);
        this.f26578a = eVar;
    }

    @Override // cc.n
    public final xd.e a() {
        return this.f26578a;
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
        if ((obj instanceof k) && AbstractC3557B.K(this.f26578a, ((k) obj).f26578a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26578a.hashCode();
    }

    public final String toString() {
        return "Loaded(accountUserState=" + this.f26578a + Separators.RPAREN;
    }
}
