package I9;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: I9.c0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0750c0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f8312Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8313Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0750c0(C0758g0 c0758g0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8313Z = c0758g0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0750c0(this.f8313Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0750c0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8312Y;
        C0758g0 c0758g0 = this.f8313Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Va.e eVar = c0758g0.f8349m;
            this.f8312Y = 1;
            obj = ((Ya.r) eVar).c(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        wd.v0 v0Var = (wd.v0) obj;
        if (v0Var instanceof wd.q0) {
            c0758g0.f(new C0776p0((wd.q0) v0Var));
        }
        return jf.y.f36177a;
    }
}
