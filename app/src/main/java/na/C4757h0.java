package na;

import k6.AbstractC4194d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4757h0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f39987Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p0.f f39988Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4757h0(boolean z10, p0.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39987Y = z10;
        this.f39988Z = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4757h0(this.f39987Y, this.f39988Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C4757h0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        if (this.f39987Y) {
            AbstractC4194d.d(this.f39988Z);
        }
        return jf.y.f36177a;
    }
}
