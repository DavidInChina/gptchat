package na;

import a9.AbstractC1936a;
import h0.C3288a;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y9.C6551b;
import ya.AbstractC6563k;
import ya.AbstractC6572t;
import ya.C6560h;
import ya.C6561i;
import ya.C6562j;

/* renamed from: na.s0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4789s0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f40107Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f40108Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1936a f40109h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f40110i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6572t f40111j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4789s0(AbstractActivityC4532l abstractActivityC4532l, AbstractC1936a abstractC1936a, AbstractC6572t abstractC6572t, Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f40108Z = fVar;
        this.f40109h0 = abstractC1936a;
        this.f40110i0 = abstractActivityC4532l;
        this.f40111j0 = abstractC6572t;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4789s0 c4789s0 = new C4789s0(this.f40110i0, this.f40109h0, this.f40111j0, this.f40108Z, abstractC4825e);
        c4789s0.f40107Y = obj;
        return c4789s0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C4789s0) create((AbstractC6563k) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        AbstractC6563k abstractC6563k = (AbstractC6563k) this.f40107Y;
        boolean z10 = abstractC6563k instanceof C6562j;
        Tc.f fVar = this.f40108Z;
        if (z10) {
            C3288a c3288a = new C3288a(new N.D(abstractC6563k, this.f40111j0, fVar, 14), true, 883840681);
            fVar.getClass();
            x8.W.M(Pc.e.a(), "Showing custom snackbar", null, 6);
            Ad.l.O0(fVar.f17060e, null, null, new Tc.b(fVar, 1, c3288a, null), 3);
        } else if (abstractC6563k instanceof C6560h) {
            AbstractC1936a abstractC1936a = this.f40109h0;
            if (abstractC1936a != null) {
                ((C6551b) abstractC1936a).a(this.f40110i0);
            }
        } else if (abstractC6563k instanceof C6561i) {
            Bi.c.r1(fVar.f17057b, Uc.X.f17634k.o1());
        }
        return jf.y.f36177a;
    }
}
