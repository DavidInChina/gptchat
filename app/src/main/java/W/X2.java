package W;

import Z.AbstractC1710f0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.C6694e;

/* loaded from: classes2.dex */
public final class X2 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f19828Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6694e f19829Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f19830h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f19831i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ D.k f19832j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f19833k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(C6694e c6694e, float f6, boolean z10, D.k kVar, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f19829Z = c6694e;
        this.f19830h0 = f6;
        this.f19831i0 = z10;
        this.f19832j0 = kVar;
        this.f19833k0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new X2(this.f19829Z, this.f19830h0, this.f19831i0, this.f19832j0, this.f19833k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((X2) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f19828Y;
        D.k kVar = this.f19832j0;
        AbstractC1710f0 abstractC1710f0 = this.f19833k0;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C6694e c6694e = this.f19829Z;
            float f6 = ((Z0.e) c6694e.f51232e.getValue()).f22788Y;
            float f10 = this.f19830h0;
            if (!Z0.e.a(f6, f10)) {
                if (!this.f19831i0) {
                    Z0.e eVar = new Z0.e(f10);
                    this.f19828Y = 1;
                    if (c6694e.f(eVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                } else {
                    this.f19828Y = 2;
                    if (AbstractC1553g1.a(c6694e, f10, (D.k) abstractC1710f0.getValue(), kVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                }
            }
            return jf.y.f36177a;
        }
        abstractC1710f0.setValue(kVar);
        return jf.y.f36177a;
    }
}
