package bb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class r0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f25892Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f25893Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ F0 f25894h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(F0 f02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f25894h0 = f02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        r0 r0Var = new r0(this.f25894h0, abstractC4825e);
        r0Var.f25893Z = obj;
        return r0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((String) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f25892Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f25892Y = 1;
            if (F0.o(this.f25894h0, (String) this.f25893Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}