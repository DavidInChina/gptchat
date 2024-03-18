package Cd;

import B.Z1;
import L.C0871s;
import Z.AbstractC1710f0;
import bb.C2162e0;
import na.L0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class G extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f3000Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f3001Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f3002h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f3003i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(AbstractC1710f0 abstractC1710f0, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f3002h0 = abstractC1710f0;
        this.f3003i0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        G g10 = new G(this.f3002h0, this.f3003i0, abstractC4825e);
        g10.f3001Z = obj;
        return g10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f3000Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            B0.A a5 = (B0.A) this.f3001Z;
            AbstractC1710f0 abstractC1710f0 = this.f3002h0;
            wf.k kVar = this.f3003i0;
            C0871s c0871s = new C0871s(abstractC1710f0, kVar, 9);
            L0 l02 = new L0(abstractC1710f0, kVar, null, 4);
            C2162e0 c2162e0 = new C2162e0(29, kVar);
            this.f3000Y = 1;
            if (Z1.d(a5, c0871s, l02, c2162e0, this, 1) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
