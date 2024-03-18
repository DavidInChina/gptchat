package H0;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class w1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f7062Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ y1 f7063Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(y1 y1Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f7063Z = y1Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new w1(this.f7063Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f7062Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C0714y c0714y = this.f7063Z.f7144Y;
            this.f7062Y = 1;
            Object m10 = c0714y.f7127t0.m(this);
            if (m10 != enumC5000a) {
                m10 = yVar;
            }
            if (m10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
