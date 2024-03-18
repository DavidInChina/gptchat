package na;

import Z.AbstractC1710f0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4763j0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ p0.l f39997Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f39998Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4763j0(p0.l lVar, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39997Y = lVar;
        this.f39998Z = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4763j0(this.f39997Y, this.f39998Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C4763j0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        K8.d.N0(this.f39997Y);
        this.f39998Z.setValue(Boolean.FALSE);
        return jf.y.f36177a;
    }
}
