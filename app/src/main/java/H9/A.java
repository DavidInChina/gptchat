package H9;

import Ng.F;
import Z.l1;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class A extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ l1 f7497Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f7498Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f7499h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(l1 l1Var, o oVar, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f7497Y = l1Var;
        this.f7498Z = oVar;
        this.f7499h0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new A(this.f7497Y, this.f7498Z, this.f7499h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((A) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        if (((Boolean) this.f7497Y.getValue()).booleanValue() && !this.f7498Z.f7530a) {
            this.f7499h0.invoke(g.f7516a);
        }
        return jf.y.f36177a;
    }
}
