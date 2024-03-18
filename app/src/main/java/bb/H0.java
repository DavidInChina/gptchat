package bb;

import android.gov.nist.core.Separators;
import cb.C2350T;
import cb.C2353W;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a  reason: collision with root package name */
    public final wd.o0 f25720a;

    /* renamed from: b  reason: collision with root package name */
    public final wd.o0 f25721b;

    /* renamed from: c  reason: collision with root package name */
    public final C2350T f25722c;

    public H0(wd.o0 o0Var, int i10) {
        this((i10 & 1) != 0 ? wd.m0.f48443a : o0Var, new wd.n0(jf.y.f36177a));
    }

    public final H0 a(C2350T c2350t) {
        String str;
        wd.o0 o0Var;
        C2353W c2353w;
        AbstractC3557B.c0("moreResults", c2350t);
        C2350T c2350t2 = this.f25722c;
        if (c2350t2 != null && (c2353w = c2350t2.f26486a) != null) {
            str = c2353w.f26493a;
        } else {
            str = null;
        }
        C2353W c2353w2 = c2350t.f26486a;
        if (!AbstractC3557B.K(str, c2353w2.f26493a)) {
            return this;
        }
        if (c2350t2 != null) {
            C2353W c2353w3 = c2350t2.f26486a;
            if (AbstractC3557B.K(c2353w3.f26493a, c2353w2.f26493a)) {
                c2350t2 = new C2350T(c2353w3, kf.t.w2(c2350t.f26487b, c2350t2.f26487b), c2350t.f26488c);
            }
            o0Var = new wd.n0(c2350t2);
        } else {
            o0Var = this.f25720a;
        }
        wd.n0 n0Var = new wd.n0(jf.y.f36177a);
        AbstractC3557B.c0("categoryResult", o0Var);
        return new H0(o0Var, n0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        if (AbstractC3557B.K(this.f25720a, h02.f25720a) && AbstractC3557B.K(this.f25721b, h02.f25721b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25721b.hashCode() + (this.f25720a.hashCode() * 31);
    }

    public final String toString() {
        return "PaginatedGizmoCategory(categoryResult=" + this.f25720a + ", loadingMore=" + this.f25721b + Separators.RPAREN;
    }

    public H0(wd.o0 o0Var, wd.o0 o0Var2) {
        AbstractC3557B.c0("categoryResult", o0Var);
        AbstractC3557B.c0("loadingMore", o0Var2);
        this.f25720a = o0Var;
        this.f25721b = o0Var2;
        C2350T c2350t = null;
        wd.n0 n0Var = o0Var instanceof wd.n0 ? (wd.n0) o0Var : null;
        this.f25722c = n0Var != null ? (C2350T) n0Var.f48446a : c2350t;
    }
}
