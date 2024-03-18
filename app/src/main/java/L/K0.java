package L;

import B.AbstractC0168u1;
import nf.AbstractC4825e;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class K0 implements AbstractC0168u1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC0168u1 f9983a;

    /* renamed from: b  reason: collision with root package name */
    public final Z.I f9984b;

    /* renamed from: c  reason: collision with root package name */
    public final Z.I f9985c;

    public K0(AbstractC0168u1 abstractC0168u1, N0 n02) {
        this.f9983a = abstractC0168u1;
        this.f9984b = AbstractC4828h.E(new J0(n02, 1));
        this.f9985c = AbstractC4828h.E(new J0(n02, 0));
    }

    @Override // B.AbstractC0168u1
    public final boolean a() {
        return this.f9983a.a();
    }

    @Override // B.AbstractC0168u1
    public final boolean b() {
        return ((Boolean) this.f9985c.getValue()).booleanValue();
    }

    @Override // B.AbstractC0168u1
    public final Object c(A.B0 b02, wf.n nVar, AbstractC4825e abstractC4825e) {
        return this.f9983a.c(b02, nVar, abstractC4825e);
    }

    @Override // B.AbstractC0168u1
    public final boolean d() {
        return ((Boolean) this.f9984b.getValue()).booleanValue();
    }

    @Override // B.AbstractC0168u1
    public final float e(float f6) {
        return this.f9983a.e(f6);
    }
}
