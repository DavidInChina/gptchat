package S0;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class w extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f16055Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1348i f16056Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C1348i c1348i, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f16056Z = c1348i;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new w(this.f16056Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f16055Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f16055Y = 1;
            if (this.f16056Z.b(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
