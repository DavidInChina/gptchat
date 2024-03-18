package L;

import Qg.C1209l;
import Z.l1;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: L.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0879z extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f10359Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ P0 f10360Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l1 f10361h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ T0.A f10362i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ N.t0 f10363j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ T0.o f10364k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ T0.s f10365l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0879z(P0 p02, l1 l1Var, T0.A a5, N.t0 t0Var, T0.o oVar, T0.s sVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10360Z = p02;
        this.f10361h0 = l1Var;
        this.f10362i0 = a5;
        this.f10363j0 = t0Var;
        this.f10364k0 = oVar;
        this.f10365l0 = sVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0879z(this.f10360Z, this.f10361h0, this.f10362i0, this.f10363j0, this.f10364k0, this.f10365l0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0879z) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f10359Y;
        P0 p02 = this.f10360Z;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                C1209l o02 = AbstractC4828h.o0(new F.r(this.f10361h0, 2));
                C0878y c0878y = new C0878y(this.f10360Z, this.f10362i0, this.f10363j0, this.f10364k0, this.f10365l0, 0);
                this.f10359Y = 1;
                if (o02.b(c0878y, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            kotlin.jvm.internal.m.j(p02);
            return jf.y.f36177a;
        } catch (Throwable th2) {
            kotlin.jvm.internal.m.j(p02);
            throw th2;
        }
    }
}
