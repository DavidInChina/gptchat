package S0;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: S0.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1347h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f16021Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1348i f16022Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1356q f16023h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1347h(C1348i c1348i, AbstractC1356q abstractC1356q, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f16022Z = c1348i;
        this.f16023h0 = abstractC1356q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1347h(this.f16022Z, this.f16023h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1347h) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f16021Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            G g10 = this.f16022Z.f16028j0;
            this.f16021Y = 1;
            obj = ((C1341b) g10).a(this.f16023h0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
