package y;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6714o;
import z.C6694e;
import z.C6710m;

/* loaded from: classes2.dex */
public final class n0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f50249Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ m0 f50250Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f50251h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ o0 f50252i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(m0 m0Var, long j6, o0 o0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f50250Z = m0Var;
        this.f50251h0 = j6;
        this.f50252i0 = o0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new n0(this.f50250Z, this.f50251h0, this.f50252i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        wf.n nVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f50249Y;
        o0 o0Var = this.f50252i0;
        m0 m0Var = this.f50250Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C6694e c6694e = m0Var.f50240a;
            Z0.k kVar = new Z0.k(this.f50251h0);
            AbstractC6714o abstractC6714o = o0Var.f50262s0;
            this.f50249Y = 1;
            obj = C6694e.c(c6694e, kVar, abstractC6714o, null, this, 12);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        C6710m c6710m = (C6710m) obj;
        if (c6710m.f51319b == 2 && (nVar = o0Var.f50263t0) != null) {
            nVar.invoke(new Z0.k(m0Var.f50241b), c6710m.f51318a.f51346Z.getValue());
        }
        return jf.y.f36177a;
    }
}
