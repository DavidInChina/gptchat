package N;

import B.Z1;
import B0.EnumC0195l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;
import q0.C5251c;

/* loaded from: classes2.dex */
public final class a0 extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int f12278Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f12279h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f12280i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12280i0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        a0 a0Var = new a0(this.f12280i0, abstractC4825e);
        a0Var.f12279h0 = obj;
        return a0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f12278Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f12278Z = 1;
            obj = Z1.e((B0.N) this.f12279h0, EnumC0195l.f1657Z, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        B0.u uVar = (B0.u) obj;
        if (uVar != null) {
            this.f12280i0.invoke(new C5251c(uVar.f1672c));
        }
        return jf.y.f36177a;
    }
}
