package B;

import Z.C1724m0;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;

/* renamed from: B.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108a0 implements AbstractC0168u1 {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f1254a;

    /* renamed from: b  reason: collision with root package name */
    public final Z f1255b = new Z(this);

    /* renamed from: c  reason: collision with root package name */
    public final A.F0 f1256c = new A.F0();

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f1257d = AbstractC4828h.Z(Boolean.FALSE, Z.o1.f22665a);

    public C0108a0(wf.k kVar) {
        this.f1254a = kVar;
    }

    @Override // B.AbstractC0168u1
    public final boolean a() {
        return ((Boolean) this.f1257d.getValue()).booleanValue();
    }

    @Override // B.AbstractC0168u1
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // B.AbstractC0168u1
    public final Object c(A.B0 b02, wf.n nVar, AbstractC4825e abstractC4825e) {
        Object e02 = Ad.l.e0(new Y(this, b02, nVar, null), abstractC4825e);
        if (e02 == EnumC5000a.f41328Y) {
            return e02;
        }
        return jf.y.f36177a;
    }

    @Override // B.AbstractC0168u1
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // B.AbstractC0168u1
    public final float e(float f6) {
        return ((Number) this.f1254a.invoke(Float.valueOf(f6))).floatValue();
    }
}
