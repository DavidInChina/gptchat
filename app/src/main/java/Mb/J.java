package Mb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class J extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11801Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ S f11802Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(S s10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11802Z = s10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new J(this.f11802Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11801Y;
        S s10 = this.f11802Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ia.j jVar = ((Cb.S) s10.f11835j).f2910c;
            this.f11801Y = 1;
            obj = L4.a.m0(jVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        s10.l(new Ra.l(s10, 13, (Cb.Y) obj));
        return jf.y.f36177a;
    }
}
