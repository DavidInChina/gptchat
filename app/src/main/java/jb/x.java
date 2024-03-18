package Jb;

import Mb.H0;
import Mb.I0;
import Mb.J0;
import Mb.K0;
import com.google.android.gms.internal.play_billing.N;
import k6.AbstractC4194d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class x extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f9026Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f9027Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ p0.f f9028h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ p0.l f9029i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Tc.f fVar, p0.f fVar2, p0.l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9027Z = fVar;
        this.f9028h0 = fVar2;
        this.f9029i0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        x xVar = new x(this.f9027Z, this.f9028h0, this.f9029i0, abstractC4825e);
        xVar.f9026Y = obj;
        return xVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((x) create((K0) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        K0 k02 = (K0) this.f9026Y;
        boolean z10 = k02 instanceof H0;
        Tc.f fVar = this.f9027Z;
        if (z10) {
            H0 h02 = (H0) k02;
            if (h02.f11797b) {
                fVar.f17057b.p();
            }
            AbstractC4194d.d(this.f9028h0);
            Bi.c.r1(fVar.f17057b, h02.f11796a);
        } else if (k02 instanceof J0) {
            Tc.f.c(fVar, ((J0) k02).f11803a, 0, 14);
        } else if (k02 instanceof I0) {
            K8.d.N0(this.f9029i0);
        }
        return jf.y.f36177a;
    }
}
