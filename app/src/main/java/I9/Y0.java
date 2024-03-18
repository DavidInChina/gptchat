package I9;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class Y0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f8258Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f8259Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8259Z = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        Y0 y02 = new Y0(this.f8259Z, abstractC4825e);
        y02.f8258Y = obj;
        return y02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((Y0) create((T0) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        T0 t02 = (T0) this.f8258Y;
        if (t02 instanceof S0) {
            Bi.c.r1(this.f8259Z.f17057b, ((S0) t02).f8232a);
        }
        return jf.y.f36177a;
    }
}
