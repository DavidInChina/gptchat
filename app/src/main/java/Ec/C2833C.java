package ec;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;
import wd.q0;
import wd.v0;

/* renamed from: ec.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2833C extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f29126Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2847Q f29127Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2833C(C2847Q c2847q, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f29127Z = c2847q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C2833C(this.f29127Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C2833C) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29126Y;
        C2847Q c2847q = this.f29127Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            xd.g gVar = c2847q.f29175m;
            this.f29126Y = 1;
            obj = ((C5451O) gVar).b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof q0) {
            c2847q.f(new C2859k((q0) v0Var));
        }
        return jf.y.f36177a;
    }
}
