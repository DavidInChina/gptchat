package rc;

import Qg.r0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.K0;
import wd.u0;

/* loaded from: classes2.dex */
public final class e0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44863Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44864Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ h0 f44865h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44865h0 = h0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        e0 e0Var = new e0(this.f44865h0, abstractC4825e);
        e0Var.f44864Z = obj;
        return e0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((K0) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44863Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            r0 r0Var = this.f44865h0.f44885d;
            u0 u0Var = new u0((K0) this.f44864Z);
            this.f44863Y = 1;
            if (r0Var.c(u0Var, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
