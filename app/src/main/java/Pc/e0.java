package pc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5463l;

/* loaded from: classes.dex */
public final class e0 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f42977Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ h0 f42978Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f42978Z = h0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new e0(this.f42978Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((e0) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f42977Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f42977Y = 1;
            Object f6 = ((C5463l) this.f42978Z.f42995j.f43045c).f(this);
            if (f6 != enumC5000a) {
                f6 = yVar;
            }
            if (f6 != enumC5000a) {
                f6 = yVar;
            }
            if (f6 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
