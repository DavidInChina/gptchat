package Z;

import Qg.AbstractC1206i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class e1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22614Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f22615Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1733r0 f22616h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(AbstractC1206i abstractC1206i, C1733r0 c1733r0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22615Z = abstractC1206i;
        this.f22616h0 = c1733r0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new e1(this.f22615Z, this.f22616h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22614Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            d1 d1Var = new d1(this.f22616h0, 1);
            this.f22614Y = 1;
            if (this.f22615Z.b(d1Var, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
