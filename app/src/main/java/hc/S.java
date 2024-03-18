package hc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.q0;
import wd.v0;

/* loaded from: classes.dex */
public final class S extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f32168Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U f32169Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ E f32170h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u10, E e10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f32169Z = u10;
        this.f32170h0 = e10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new S(this.f32169Z, this.f32170h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((S) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f32168Y;
        U u10 = this.f32169Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ba.j jVar = u10.f32173j;
            boolean z10 = ((D) this.f32170h0).f32143a;
            this.f32168Y = 1;
            obj = jVar.b(z10, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof q0) {
            u10.f(new C3383A((q0) v0Var));
        }
        return jf.y.f36177a;
    }
}
