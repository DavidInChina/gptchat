package Fd;

import Cd.J;
import com.google.android.gms.internal.play_billing.N;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f5263Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f5264Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ J f5265h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AbstractActivityC4532l abstractActivityC4532l, J j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5264Z = abstractActivityC4532l;
        this.f5265h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        p pVar = new p(this.f5264Z, this.f5265h0, abstractC4825e);
        pVar.f5263Y = obj;
        return pVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((p) create((g) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        g gVar = (g) this.f5263Y;
        boolean z10 = gVar instanceof e;
        AbstractActivityC4532l abstractActivityC4532l = this.f5264Z;
        if (z10) {
            abstractActivityC4532l.finish();
        } else if (gVar instanceof f) {
            this.f5265h0.j(Cd.r.f3069a);
            abstractActivityC4532l.finish();
        }
        return jf.y.f36177a;
    }
}
