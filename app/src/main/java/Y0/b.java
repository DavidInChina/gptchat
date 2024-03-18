package Y0;

import id.AbstractC3557B;
import r0.AbstractC5350n;
import r0.J;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a  reason: collision with root package name */
    public final J f22015a;

    /* renamed from: b  reason: collision with root package name */
    public final float f22016b;

    public b(J j6, float f6) {
        this.f22015a = j6;
        this.f22016b = f6;
    }

    @Override // Y0.o
    public final float a() {
        return this.f22016b;
    }

    @Override // Y0.o
    public final long b() {
        int i10 = r0.r.f44264l;
        return r0.r.f44263k;
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
        return this.f22015a;
    }

    @Override // Y0.o
    public final /* synthetic */ o e(o oVar) {
        return R.a.a(this, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3557B.K(this.f22015a, bVar.f22015a) && Float.compare(this.f22016b, bVar.f22016b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22016b) + (this.f22015a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f22015a);
        sb2.append(", alpha=");
        return AbstractC6463a.k(sb2, this.f22016b, ')');
    }
}
