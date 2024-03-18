package hb;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f32119Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f32120Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32120Z = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        p pVar = new p(this.f32120Z, abstractC4825e);
        pVar.f32119Y = obj;
        return pVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((p) create((e) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        e eVar = (e) this.f32119Y;
        if (eVar instanceof d) {
            Tc.f.c(this.f32120Z, ((d) eVar).f32104a, 0, 14);
        }
        return jf.y.f36177a;
    }
}
