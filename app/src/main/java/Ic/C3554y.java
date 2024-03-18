package ic;

import na.V0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* renamed from: ic.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3554y extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f33070Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3523A f33071Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3554y(C3523A c3523a, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f33071Z = c3523a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C3554y(this.f33071Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C3554y) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33070Y;
        C3523A c3523a = this.f33071Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            xd.g gVar = c3523a.f32941j;
            this.f33070Y = 1;
            obj = ((C5451O) gVar).b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof u0) {
            c3523a.l(new V0((zd.g) ((u0) v0Var).f48468a, 1));
        } else if (v0Var instanceof q0) {
            c3523a.f(new C3544n((q0) v0Var));
        } else if (!(v0Var instanceof p0)) {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}
