package ec;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;
import wd.q0;
import wd.v0;

/* renamed from: ec.P  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2846P extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f29169Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2847Q f29170Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2868t f29171h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2846P(AbstractC2868t abstractC2868t, C2847Q c2847q, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f29170Z = c2847q;
        this.f29171h0 = abstractC2868t;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C2846P(this.f29171h0, this.f29170Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C2846P) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29169Y;
        C2847Q c2847q = this.f29170Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            xd.g gVar = c2847q.f29175m;
            boolean z10 = ((C2862n) this.f29171h0).f29240a;
            this.f29169Y = 1;
            obj = ((C5451O) gVar).g(z10, this);
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
