package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class X1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1232Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1233Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B0.A f1234h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.o f1235i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f1236j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.k f1237k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.k f1238l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1(B0.A a5, AbstractC4825e abstractC4825e, wf.k kVar, wf.k kVar2, wf.k kVar3, wf.o oVar) {
        super(2, abstractC4825e);
        this.f1234h0 = a5;
        this.f1235i0 = oVar;
        this.f1236j0 = kVar;
        this.f1237k0 = kVar2;
        this.f1238l0 = kVar3;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        X1 x12 = new X1(this.f1234h0, abstractC4825e, this.f1236j0, this.f1237k0, this.f1238l0, this.f1235i0);
        x12.f1233Z = obj;
        return x12;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((X1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1232Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ng.F f6 = (Ng.F) this.f1233Z;
            B0.A a5 = this.f1234h0;
            C0115c1 c0115c1 = new C0115c1(a5);
            W1 w12 = new W1(f6, this.f1235i0, this.f1236j0, this.f1237k0, this.f1238l0, c0115c1, null);
            this.f1232Y = 1;
            if (Df.H.q(a5, w12, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
