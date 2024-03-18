package Mb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class S0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11840Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f11841Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ X0 f11842h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(X0 x02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11842h0 = x02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        S0 s02 = new S0(this.f11842h0, abstractC4825e);
        s02.f11841Z = obj;
        return s02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((S0) create((String) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11840Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            bb.B0 b02 = new bb.B0((String) this.f11841Z, 5);
            X0 x02 = this.f11842h0;
            x02.l(b02);
            this.f11840Y = 1;
            if (X0.n(x02, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
