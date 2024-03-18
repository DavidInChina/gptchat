package I9;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class N extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f8214Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8215Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C0758g0 c0758g0, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f8215Z = c0758g0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new N(this.f8215Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((N) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8214Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f8214Y = 1;
            if (C0758g0.p(this.f8215Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
