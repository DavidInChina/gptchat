package lb;

import com.google.android.gms.internal.play_billing.N;
import gb.T;
import gb.k0;
import ha.C3370m;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class G extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f37938Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f37939Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k0 f37940h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(k0 k0Var, K k10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f37939Z = k10;
        this.f37940h0 = k0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new G(this.f37940h0, this.f37939Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((G) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37938Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            k0 k0Var = this.f37940h0;
            String str = ((T) k0Var).f31373a;
            C3370m c3370m = ((T) k0Var).f31374b;
            this.f37938Y = 1;
            K k10 = this.f37939Z;
            k10.getClass();
            k10.f(new gb.F(c3370m.f32071a));
            if (k10.u(str, c3370m, Z8.r.f23404b, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
