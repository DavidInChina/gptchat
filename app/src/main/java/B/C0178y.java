package B;

import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178y extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f1561Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H f1562Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.o f1563h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178y(H h10, AbstractC4825e abstractC4825e, wf.o oVar) {
        super(1, abstractC4825e);
        this.f1562Z = h10;
        this.f1563h0 = oVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C0178y(this.f1562Z, abstractC4825e, this.f1563h0);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C0178y) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1561Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            H h10 = this.f1562Z;
            G g10 = new G(h10, 1);
            C0175x c0175x = new C0175x(h10, null, this.f1563h0);
            this.f1561Y = 1;
            if (AbstractC4828h.o(g10, c0175x, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
