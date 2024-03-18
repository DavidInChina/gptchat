package ic;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* renamed from: ic.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3555z extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f33072Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3523A f33073Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3549t f33074h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3555z(C3523A c3523a, AbstractC3549t abstractC3549t, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f33073Z = c3523a;
        this.f33074h0 = abstractC3549t;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C3555z(this.f33073Z, this.f33074h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C3555z) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33072Y;
        AbstractC3549t abstractC3549t = this.f33074h0;
        C3523A c3523a = this.f33073Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            xd.g gVar = c3523a.f32941j;
            boolean z10 = ((r) abstractC3549t).f33063a;
            this.f33072Y = 1;
            obj = ((C5451O) gVar).c(z10, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof u0) {
            jf.y yVar = (jf.y) ((u0) v0Var).f48468a;
            c3523a.l(new nb.d(15, abstractC3549t));
        } else if (v0Var instanceof q0) {
            c3523a.f(new C3544n((q0) v0Var));
        } else if (!(v0Var instanceof p0)) {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}
