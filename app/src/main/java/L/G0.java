package L;

import Z.AbstractC1710f0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class G0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC1710f0 f9940Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f9941Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f9942h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f9943i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ D.m f9944j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(AbstractC1710f0 abstractC1710f0, boolean z10, D.m mVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9942h0 = abstractC1710f0;
        this.f9943i0 = z10;
        this.f9944j0 = mVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new G0(this.f9942h0, this.f9943i0, this.f9944j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((G0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        AbstractC1710f0 abstractC1710f0;
        AbstractC1710f0 abstractC1710f02;
        D.k kVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9941Z;
        if (i10 != 0) {
            if (i10 == 1) {
                abstractC1710f02 = this.f9940Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            abstractC1710f0 = this.f9942h0;
            D.p pVar = (D.p) abstractC1710f0.getValue();
            if (pVar != null) {
                if (this.f9943i0) {
                    kVar = new D.q(pVar);
                } else {
                    kVar = new D.o(pVar);
                }
                D.m mVar = this.f9944j0;
                if (mVar != null) {
                    this.f9940Y = abstractC1710f0;
                    this.f9941Z = 1;
                    if (mVar.b(kVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    abstractC1710f02 = abstractC1710f0;
                }
                abstractC1710f0.setValue(null);
            }
            return jf.y.f36177a;
        }
        abstractC1710f0 = abstractC1710f02;
        abstractC1710f0.setValue(null);
        return jf.y.f36177a;
    }
}
