package Ec;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.q0;

/* loaded from: classes2.dex */
public final class p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f4633Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f4634Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f4635h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Tc.f fVar, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f4634Z = fVar;
        this.f4635h0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        p pVar = new p(this.f4634Z, this.f4635h0, abstractC4825e);
        pVar.f4633Y = obj;
        return pVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((p) create((AbstractC0501h) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        AbstractC0501h abstractC0501h = (AbstractC0501h) this.f4633Y;
        if (abstractC0501h instanceof C0499f) {
            q0 q0Var = ((C0499f) abstractC0501h).f4620a;
            Tc.f fVar = this.f4634Z;
            Tc.f.c(fVar, A7.b.G1(q0Var, fVar.f17059d, fVar.f17056a), 0, 14);
        } else if (abstractC0501h instanceof C0500g) {
            this.f4635h0.invoke(((C0500g) abstractC0501h).f4621a);
        }
        return jf.y.f36177a;
    }
}
