package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x9.C6383b;

/* loaded from: classes2.dex */
public final class K0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39817Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39818Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39818Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        K0 k02 = new K0(this.f39818Z, abstractC4825e);
        k02.f39817Y = obj;
        return k02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((K0) create((T9.c) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        T9.f fVar;
        wd.q0 q0Var;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        T9.c cVar = (T9.c) this.f39817Y;
        C6383b c6383b = new C6383b(10, cVar);
        B1 b1 = this.f39818Z;
        b1.l(c6383b);
        T9.k kVar = cVar.f16968c;
        if (kVar instanceof T9.f) {
            fVar = (T9.f) kVar;
        } else {
            fVar = null;
        }
        if (fVar != null && (q0Var = fVar.f16974a) != null) {
            b1.f(new C4788s(q0Var));
        }
        return jf.y.f36177a;
    }
}
