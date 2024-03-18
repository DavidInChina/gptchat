package g2;

import Z.E0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class y extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31156Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0 f31157Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(E0 e02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31157Z = e02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new y(this.f31157Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31156Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f31156Y = 1;
            if (this.f31157Z.I(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
