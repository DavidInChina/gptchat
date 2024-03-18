package L;

import A.AbstractC0044t0;
import E0.AbstractC0459s;
import E0.AbstractC0466z;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import wf.AbstractC6216a;
import z.C6672L;

/* renamed from: L.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843d0 implements AbstractC0466z {

    /* renamed from: b  reason: collision with root package name */
    public final N0 f10114b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10115c;

    /* renamed from: d  reason: collision with root package name */
    public final T0.G f10116d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC6216a f10117e;

    public C0843d0(N0 n02, int i10, T0.G g10, C6672L c6672l) {
        this.f10114b = n02;
        this.f10115c = i10;
        this.f10116d = g10;
        this.f10117e = c6672l;
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
        long j10;
        if (m10.m(Z0.a.g(j6)) < Z0.a.h(j6)) {
            j10 = j6;
        } else {
            j10 = Z0.a.a(j6, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        E0.d0 o10 = m10.o(j10);
        int min = Math.min(o10.f4053Y, Z0.a.h(j6));
        return p10.j0(min, o10.f4054Z, kf.w.f37484Y, new C0841c0(p10, this, o10, min, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0843d0)) {
            return false;
        }
        C0843d0 c0843d0 = (C0843d0) obj;
        if (AbstractC3557B.K(this.f10114b, c0843d0.f10114b) && this.f10115c == c0843d0.f10115c && AbstractC3557B.K(this.f10116d, c0843d0.f10116d) && AbstractC3557B.K(this.f10117e, c0843d0.f10117e)) {
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
        int hashCode = this.f10116d.hashCode();
        return this.f10117e.hashCode() + ((hashCode + (((this.f10114b.hashCode() * 31) + this.f10115c) * 31)) * 31);
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
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f10114b + ", cursorOffset=" + this.f10115c + ", transformedText=" + this.f10116d + ", textLayoutResultProvider=" + this.f10117e + ')';
    }
}
