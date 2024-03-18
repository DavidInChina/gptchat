package L;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5252d;

/* loaded from: classes.dex */
public final class H extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f9945Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ I.f f9946Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ T0.z f9947h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ P0 f9948i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Q0 f9949j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ T0.s f9950k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I.f fVar, T0.z zVar, P0 p02, Q0 q02, T0.s sVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9946Z = fVar;
        this.f9947h0 = zVar;
        this.f9948i0 = p02;
        this.f9949j0 = q02;
        this.f9950k0 = sVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new H(this.f9946Z, this.f9947h0, this.f9948i0, this.f9949j0, this.f9950k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C5252d c5252d;
        long a5;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9945Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            w0 w0Var = this.f9948i0.f10029a;
            N0.C c10 = this.f9949j0.f10054a;
            this.f9945Y = 1;
            int b10 = this.f9950k0.b(N0.D.d(this.f9947h0.f16831b));
            if (b10 < c10.f12477a.f12467a.f12512Y.length()) {
                c5252d = c10.b(b10);
            } else if (b10 == 0) {
                a5 = B0.a(w0Var.f10340b, w0Var.f10345g, w0Var.f10346h, B0.f9858a, 1);
                c5252d = new C5252d(0.0f, 0.0f, 1.0f, (int) (a5 & 4294967295L));
            } else {
                c5252d = c10.b(b10 - 1);
            }
            Object a10 = this.f9946Z.a(c5252d, this);
            if (a10 != enumC5000a) {
                a10 = yVar;
            }
            if (a10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
