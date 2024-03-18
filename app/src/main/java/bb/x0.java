package bb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class x0 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f25919Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F0 f25920Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ T f25921h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(F0 f02, T t10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f25920Z = f02;
        this.f25921h0 = t10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new x0(this.f25920Z, this.f25921h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((x0) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f25919Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Qg.F0 f02 = this.f25920Z.f25712l;
            String str = ((Q) this.f25921h0).f25740a;
            this.f25919Y = 1;
            f02.setValue(str);
            if (yVar == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
