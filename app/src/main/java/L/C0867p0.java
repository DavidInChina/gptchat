package L;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: L.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0867p0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f10261Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B0.A f10262Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ x0 f10263h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0867p0(B0.A a5, x0 x0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10262Z = a5;
        this.f10263h0 = x0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0867p0(this.f10262Z, this.f10263h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0867p0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f10261Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f10261Y = 1;
            Object q10 = Df.H.q(this.f10262Z, new u0(this.f10263h0, null), this);
            if (q10 != enumC5000a) {
                q10 = yVar;
            }
            if (q10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
