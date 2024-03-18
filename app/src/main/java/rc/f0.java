package rc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes2.dex */
public final class f0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44870Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ h0 f44871Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44871Z = h0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new f0(this.f44871Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44870Y;
        h0 h0Var = this.f44871Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f44870Y = 1;
            if (h0Var.a(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        C5426p l02 = L4.a.l0(h0Var.f44882a.f44961e);
        e0 e0Var = new e0(h0Var, null);
        this.f44870Y = 2;
        if (L4.a.b0(l02, e0Var, this) == enumC5000a) {
            return enumC5000a;
        }
        return jf.y.f36177a;
    }
}
