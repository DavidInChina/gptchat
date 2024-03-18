package L;

import B.AbstractC0170v0;
import B.C0123f0;
import B.C0150o0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.C6473k;

/* renamed from: L.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0869q0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f10279Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B0.A f10280Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ x0 f10281h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0869q0(B0.A a5, x0 x0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10280Z = a5;
        this.f10281h0 = x0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0869q0(this.f10280Z, this.f10281h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0869q0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC5000a.f41328Y;
        int i10 = this.f10279Y;
        Object obj3 = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f10279Y = 1;
            x0 x0Var = this.f10281h0;
            C0872s0 c0872s0 = new C0872s0(x0Var, 0);
            t0 t0Var = new t0(x0Var, 0);
            t0 t0Var2 = new t0(x0Var, 1);
            C6473k c6473k = new C6473k(5, x0Var);
            C0123f0 c0123f0 = AbstractC0170v0.f1534a;
            Object q10 = Df.H.q(this.f10280Z, new C0150o0(c0872s0, c6473k, t0Var2, t0Var, null), this);
            Object obj4 = q10;
            if (q10 != obj2) {
                obj4 = obj3;
            }
            if (obj4 != obj2) {
                obj4 = obj3;
            }
            if (obj4 == obj2) {
                return obj2;
            }
        }
        return obj3;
    }
}
