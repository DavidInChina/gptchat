package yh;

import sh.AbstractC5641m;
import th.AbstractC5806n;
import th.C5805m;

/* loaded from: classes.dex */
public final class u1 extends H0 {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5641m f51085Z;

    /* renamed from: h0  reason: collision with root package name */
    public final I1 f51086h0;

    /* renamed from: i0  reason: collision with root package name */
    public final k1 f51087i0;

    public u1(AbstractC5641m abstractC5641m, I1 i12, k1 k1Var) {
        this.f51085Z = abstractC5641m;
        this.f51086h0 = i12;
        this.f51087i0 = k1Var;
    }

    @Override // yh.l1.a
    public final String A0() {
        return this.f51086h0.f50947a;
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        return this.f51085Z;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        I1 i12 = this.f51086h0;
        i12.getClass();
        return new C5805m(0, i12.f50949c);
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        I1 i12 = this.f51086h0;
        i12.getClass();
        return new t1(i12.f50948b).k(this.f51087i0);
    }
}
