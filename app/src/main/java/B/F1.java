package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;

/* loaded from: classes2.dex */
public final class F1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1073Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.o f1074Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0115c1 f1075h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ B0.u f1076i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(wf.o oVar, C0115c1 c0115c1, B0.u uVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1074Z = oVar;
        this.f1075h0 = c0115c1;
        this.f1076i0 = uVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new F1(this.f1074Z, this.f1075h0, this.f1076i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((F1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1073Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C5251c c5251c = new C5251c(this.f1076i0.f1672c);
            this.f1073Y = 1;
            if (this.f1074Z.invoke(this.f1075h0, c5251c, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
