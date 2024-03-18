package y;

import Qg.C1209l;
import Z.C1733r0;
import Z.l1;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.C6729v0;

/* loaded from: classes.dex */
public final class G extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f50096Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f50097Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6729v0 f50098h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l1 f50099i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C6729v0 c6729v0, l1 l1Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f50098h0 = c6729v0;
        this.f50099i0 = l1Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        G g10 = new G(this.f50098h0, this.f50099i0, abstractC4825e);
        g10.f50097Z = obj;
        return g10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((C1733r0) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f50096Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C6729v0 c6729v0 = this.f50098h0;
            C1209l o02 = AbstractC4828h.o0(new E(c6729v0, 0));
            F f6 = new F((C1733r0) this.f50097Z, c6729v0, this.f50099i0, 0);
            this.f50096Y = 1;
            if (o02.b(f6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
