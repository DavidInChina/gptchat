package L;

import A.AbstractC0044t0;
import E0.AbstractC0459s;
import E0.AbstractC0466z;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import wf.AbstractC6216a;
import z.C6672L;

/* loaded from: classes2.dex */
public final class S0 implements AbstractC0466z {

    /* renamed from: b  reason: collision with root package name */
    public final N0 f10066b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10067c;

    /* renamed from: d  reason: collision with root package name */
    public final T0.G f10068d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC6216a f10069e;

    public S0(N0 n02, int i10, T0.G g10, C6672L c6672l) {
        this.f10066b = n02;
        this.f10067c = i10;
        this.f10068d = g10;
        this.f10069e = c6672l;
    }

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // E0.AbstractC0466z
    public final /* synthetic */ int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC0044t0.e(this, abstractC0459s, rVar, i10);
    }

    @Override // E0.AbstractC0466z
    public final /* synthetic */ int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC0044t0.g(this, abstractC0459s, rVar, i10);
    }

    @Override // E0.AbstractC0466z
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        E0.d0 o10 = m10.o(Z0.a.a(j6, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(o10.f4054Z, Z0.a.g(j6));
        return p10.j0(o10.f4053Y, min, kf.w.f37484Y, new C0841c0(p10, this, o10, min, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0)) {
            return false;
        }
        S0 s02 = (S0) obj;
        if (AbstractC3557B.K(this.f10066b, s02.f10066b) && this.f10067c == s02.f10067c && AbstractC3557B.K(this.f10068d, s02.f10068d) && AbstractC3557B.K(this.f10069e, s02.f10069e)) {
            return true;
        }
        return false;
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    @Override // E0.AbstractC0466z
    public final /* synthetic */ int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC0044t0.c(this, abstractC0459s, rVar, i10);
    }

    public final int hashCode() {
        int hashCode = this.f10068d.hashCode();
        return this.f10069e.hashCode() + ((hashCode + (((this.f10066b.hashCode() * 31) + this.f10067c) * 31)) * 31);
    }

    @Override // E0.AbstractC0466z
    public final /* synthetic */ int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC0044t0.a(this, abstractC0459s, rVar, i10);
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f10066b + ", cursorOffset=" + this.f10067c + ", transformedText=" + this.f10068d + ", textLayoutResultProvider=" + this.f10069e + ')';
    }
}
