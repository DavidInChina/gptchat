package Y0;

import id.AbstractC3557B;
import jf.C3970t;
import r0.AbstractC5350n;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a  reason: collision with root package name */
    public final long f22017a;

    public c(long j6) {
        this.f22017a = j6;
        if (j6 != r0.r.f44263k) {
            return;
        }
        throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
    }

    @Override // Y0.o
    public final float a() {
        return r0.r.d(this.f22017a);
    }

    @Override // Y0.o
    public final long b() {
        return this.f22017a;
    }

    @Override // Y0.o
    public final o c(AbstractC6216a abstractC6216a) {
        if (!AbstractC3557B.K(this, m.f22036a)) {
            return this;
        }
        return (o) abstractC6216a.mo122invoke();
    }

    @Override // Y0.o
    public final AbstractC5350n d() {
        return null;
    }

    @Override // Y0.o
    public final /* synthetic */ o e(o oVar) {
        return R.a.a(this, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && r0.r.c(this.f22017a, ((c) obj).f22017a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return C3970t.a(this.f22017a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) r0.r.i(this.f22017a)) + ')';
    }
}
