package Mb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class r extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11973Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0981u f11974Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0981u c0981u, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11974Z = c0981u;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new r(this.f11974Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11973Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f11973Y = 1;
            if (C0981u.m(this.f11974Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
