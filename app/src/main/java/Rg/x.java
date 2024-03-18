package Rg;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class x extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f15590Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f15591Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.o f15592h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f15593i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(wf.o oVar, AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15592h0 = oVar;
        this.f15593i0 = abstractC1207j;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        x xVar = new x(this.f15592h0, this.f15593i0, abstractC4825e);
        xVar.f15591Z = obj;
        return xVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15590Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f15590Y = 1;
            if (this.f15592h0.invoke((Ng.F) this.f15591Z, this.f15593i0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
