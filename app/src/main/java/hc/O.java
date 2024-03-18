package hc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.q0;
import wd.v0;

/* loaded from: classes.dex */
public final class O extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f32162Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U f32163Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(U u10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32163Z = u10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new O(this.f32163Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f32162Y;
        U u10 = this.f32163Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ba.j jVar = u10.f32173j;
            this.f32162Y = 1;
            obj = jVar.a(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof q0) {
            u10.f(new C3383A((q0) v0Var));
        }
        u10.l(C3406v.f32228l0);
        return jf.y.f36177a;
    }
}
