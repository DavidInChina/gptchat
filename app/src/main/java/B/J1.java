package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class J1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1114Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1115Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B0.A f1116h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.o f1117i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f1118j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C0115c1 f1119k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(B0.A a5, wf.o oVar, wf.k kVar, C0115c1 c0115c1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1116h0 = a5;
        this.f1117i0 = oVar;
        this.f1118j0 = kVar;
        this.f1119k0 = c0115c1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        J1 j12 = new J1(this.f1116h0, this.f1117i0, this.f1118j0, this.f1119k0, abstractC4825e);
        j12.f1115Z = obj;
        return j12;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((J1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1114Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            I1 i12 = new I1((Ng.F) this.f1115Z, this.f1117i0, this.f1118j0, this.f1119k0, null);
            this.f1114Y = 1;
            if (Df.H.q(this.f1116h0, i12, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
