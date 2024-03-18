package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: W.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1620u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f20448Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f20449Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.o f20450h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C f20451i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620u(C c10, AbstractC4825e abstractC4825e, wf.o oVar) {
        super(2, abstractC4825e);
        this.f20450h0 = oVar;
        this.f20451i0 = c10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1620u c1620u = new C1620u(this.f20451i0, abstractC4825e, this.f20450h0);
        c1620u.f20449Z = obj;
        return c1620u;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1620u) create((F1) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20448Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C1645z c1645z = this.f20451i0.f19004m;
            this.f20448Y = 1;
            if (this.f20450h0.invoke(c1645z, (F1) this.f20449Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
