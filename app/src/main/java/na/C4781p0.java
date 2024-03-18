package na;

import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4781p0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f40085Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f40086Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f40087h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4781p0(AbstractActivityC4532l abstractActivityC4532l, Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f40086Z = fVar;
        this.f40087h0 = abstractActivityC4532l;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4781p0 c4781p0 = new C4781p0(this.f40087h0, this.f40086Z, abstractC4825e);
        c4781p0.f40085Y = obj;
        return c4781p0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C4781p0) create((AbstractC4791t) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        AbstractC4791t abstractC4791t = (AbstractC4791t) this.f40085Y;
        boolean z10 = abstractC4791t instanceof r;
        Tc.f fVar = this.f40086Z;
        if (z10) {
            r rVar = (r) abstractC4791t;
            if (rVar.f40099b) {
                fVar.f17057b.p();
            }
            Bi.c.r1(fVar.f17057b, rVar.f40098a);
        } else if (abstractC4791t instanceof C4788s) {
            Tc.f.c(fVar, A7.b.G1(((C4788s) abstractC4791t).f40106a, fVar.f17059d, fVar.f17056a), 0, 14);
        } else if (abstractC4791t instanceof C4783q) {
            K8.d.O0(this.f40087h0, fVar, ((C4783q) abstractC4791t).f40091a);
        }
        return jf.y.f36177a;
    }
}
