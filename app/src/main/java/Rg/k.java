package Rg;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f15547Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f15548Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f15549h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f15550i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, AbstractC1207j abstractC1207j, Object obj, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15548Z = oVar;
        this.f15549h0 = abstractC1207j;
        this.f15550i0 = obj;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new k(this.f15548Z, this.f15549h0, this.f15550i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15547Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            wf.o oVar = this.f15548Z.f15564j0;
            this.f15547Y = 1;
            if (oVar.invoke(this.f15549h0, this.f15550i0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
