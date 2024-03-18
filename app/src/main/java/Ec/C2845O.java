package ec;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;
import wd.q0;
import wd.v0;

/* renamed from: ec.O  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2845O extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f29166Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2847Q f29167Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2868t f29168h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2845O(AbstractC2868t abstractC2868t, C2847Q c2847q, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f29167Z = c2847q;
        this.f29168h0 = abstractC2868t;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C2845O(this.f29168h0, this.f29167Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C2845O) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29166Y;
        C2847Q c2847q = this.f29167Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            xd.g gVar = c2847q.f29175m;
            boolean z10 = ((C2861m) this.f29168h0).f29239a;
            this.f29166Y = 1;
            obj = ((C5451O) gVar).d(z10, this);
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
