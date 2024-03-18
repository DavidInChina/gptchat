package S0;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: S0.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1345f extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f16014Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1348i f16015Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1356q f16016h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1345f(C1348i c1348i, AbstractC1356q abstractC1356q, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f16015Z = c1348i;
        this.f16016h0 = abstractC1356q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C1345f(this.f16015Z, this.f16016h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C1345f) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f16014Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f16014Y = 1;
            obj = this.f16015Z.d(this.f16016h0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
