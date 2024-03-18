package Pf;

import Mf.AbstractC0993b;
import Mf.h0;
import id.AbstractC3557B;
import jf.C3963m;
import kg.C4294f;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class a0 extends b0 {

    /* renamed from: q0  reason: collision with root package name */
    public final C3963m f14076q0;

    public a0(AbstractC0993b abstractC0993b, h0 h0Var, int i10, Nf.i iVar, C4294f c4294f, Bg.A a5, boolean z10, boolean z11, boolean z12, Bg.A a10, Mf.V v10, AbstractC6216a abstractC6216a) {
        super(abstractC0993b, h0Var, i10, iVar, c4294f, a5, z10, z11, z12, a10, v10);
        this.f14076q0 = R4.b.D1(abstractC6216a);
    }

    @Override // Pf.b0, Mf.h0
    public final h0 s(Kf.f fVar, C4294f c4294f, int i10) {
        Nf.i annotations = getAnnotations();
        AbstractC3557B.b0("<get-annotations>(...)", annotations);
        Bg.A type = getType();
        AbstractC3557B.b0("getType(...)", type);
        boolean w02 = w0();
        Mf.U u10 = Mf.V.f12075a;
        F f6 = new F(this, 2);
        return new a0(fVar, null, i10, annotations, c4294f, type, w02, this.f14083m0, this.f14084n0, this.f14085o0, u10, f6);
    }
}
