package la;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f37913Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f37914Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f37915h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AbstractActivityC4532l abstractActivityC4532l, Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37914Z = abstractActivityC4532l;
        this.f37915h0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        n nVar = new n(this.f37914Z, this.f37915h0, abstractC4825e);
        nVar.f37913Y = obj;
        return nVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((n) create((AbstractC4358b) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        AbstractC4358b abstractC4358b = (AbstractC4358b) this.f37913Y;
        if (abstractC4358b instanceof C4357a) {
            K8.d.O0(this.f37914Z, this.f37915h0, ((C4357a) abstractC4358b).f37897a);
        }
        return y.f36177a;
    }
}
