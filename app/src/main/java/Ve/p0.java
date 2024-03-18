package Ve;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class p0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18845Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f18846Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r0 f18847h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kotlin.jvm.internal.B b10, r0 r0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18846Z = b10;
        this.f18847h0 = r0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new p0(this.f18846Z, this.f18847h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((p0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18845Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Qg.m0 m0Var = ((We.C) this.f18846Z.f37622Y).f21063e.f17185b;
            m0 m0Var2 = new m0(this.f18847h0, 1);
            this.f18845Y = 1;
            if (m0Var.f14878Y.b(m0Var2, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        throw new RuntimeException();
    }
}
