package B;

import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class B extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f1029Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H f1030Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f1031h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.p f1032i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(H h10, Object obj, wf.p pVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f1030Z = h10;
        this.f1031h0 = obj;
        this.f1032i0 = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new B(this.f1030Z, this.f1031h0, this.f1032i0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((B) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1029Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            H h10 = this.f1030Z;
            h10.f1090j.setValue(this.f1031h0);
            G g10 = new G(h10, 2);
            A a5 = new A(this.f1032i0, h10, null);
            this.f1029Y = 1;
            if (AbstractC4828h.o(g10, a5, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
