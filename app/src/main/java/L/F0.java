package L;

import Z.AbstractC1710f0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class F0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Object f9933Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f9934Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f9935h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f9936i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ D.m f9937j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(AbstractC1710f0 abstractC1710f0, long j6, D.m mVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9935h0 = abstractC1710f0;
        this.f9936i0 = j6;
        this.f9937j0 = mVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new F0(this.f9935h0, this.f9936i0, this.f9937j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((F0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        D.p pVar;
        D.p pVar2;
        AbstractC1710f0 abstractC1710f0;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9934Z;
        D.m mVar = this.f9937j0;
        AbstractC1710f0 abstractC1710f02 = this.f9935h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    pVar2 = (D.p) this.f9933Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    pVar = pVar2;
                    abstractC1710f02.setValue(pVar);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC1710f0 = (AbstractC1710f0) this.f9933Y;
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            D.p pVar3 = (D.p) abstractC1710f02.getValue();
            if (pVar3 != null) {
                D.o oVar = new D.o(pVar3);
                if (mVar != null) {
                    this.f9933Y = abstractC1710f02;
                    this.f9934Z = 1;
                    if (mVar.b(oVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                abstractC1710f0 = abstractC1710f02;
            }
            pVar = new D.p(this.f9936i0);
            if (mVar != null) {
                this.f9933Y = pVar;
                this.f9934Z = 2;
                if (mVar.b(pVar, this) == enumC5000a) {
                    return enumC5000a;
                }
                pVar2 = pVar;
                pVar = pVar2;
            }
            abstractC1710f02.setValue(pVar);
            return jf.y.f36177a;
        }
        abstractC1710f0.setValue(null);
        pVar = new D.p(this.f9936i0);
        if (mVar != null) {
        }
        abstractC1710f02.setValue(pVar);
        return jf.y.f36177a;
    }
}
