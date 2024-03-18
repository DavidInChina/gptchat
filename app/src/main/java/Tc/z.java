package Tc;

import com.google.android.gms.internal.play_billing.N;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class z extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f17173Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f17174Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ f f17175h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f17176i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AbstractActivityC4532l abstractActivityC4532l, f fVar, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17174Z = abstractActivityC4532l;
        this.f17175h0 = fVar;
        this.f17176i0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        z zVar = new z(this.f17174Z, this.f17175h0, this.f17176i0, abstractC4825e);
        zVar.f17173Y = obj;
        return zVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((z) create((Ad.y) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        Ad.y yVar = (Ad.y) this.f17173Y;
        if (yVar instanceof Ad.x) {
            Ad.r rVar = ((Ad.x) yVar).f829a;
            boolean z10 = rVar instanceof Ad.n;
            f fVar = this.f17175h0;
            if (z10) {
                K8.d.O0(this.f17174Z, fVar, ((Ad.n) rVar).f824a);
            } else if (rVar instanceof Ad.p) {
                Bi.c.r1(fVar.f17057b, ((Ad.p) rVar).f826a);
            } else if (rVar instanceof Ad.o) {
                fVar.f17057b.p();
            } else if (rVar instanceof Ad.q) {
                f.c(fVar, A7.b.G1(((Ad.q) rVar).f827a, fVar.f17059d, fVar.f17056a), 0, 14);
            }
        } else if (yVar instanceof Ad.w) {
            this.f17176i0.invoke(((Ad.w) yVar).f828a);
        }
        return jf.y.f36177a;
    }
}
