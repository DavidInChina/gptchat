package pc;

import Z.AbstractC1708e0;
import Z.AbstractC1710f0;
import Z.U0;
import id.AbstractC3557B;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class M extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f42917Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f42918Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f42919h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1708e0 f42920i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f42921j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Tc.f fVar, AbstractActivityC4532l abstractActivityC4532l, AbstractC1708e0 abstractC1708e0, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f42918Z = fVar;
        this.f42919h0 = abstractActivityC4532l;
        this.f42920i0 = abstractC1708e0;
        this.f42921j0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        M m10 = new M(this.f42918Z, this.f42919h0, this.f42920i0, this.f42921j0, abstractC4825e);
        m10.f42917Y = obj;
        return m10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((M) create((X) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        X x10 = (X) this.f42917Y;
        boolean K10 = AbstractC3557B.K(x10, U.f42948a);
        Tc.f fVar = this.f42918Z;
        if (K10) {
            fVar.f17057b.p();
        } else if (x10 instanceof W) {
            W w10 = (W) x10;
            ((U0) this.f42920i0).i(w10.f42950a);
            this.f42921j0.setValue(Boolean.valueOf(w10.f42951b));
        } else if (x10 instanceof V) {
            K8.d.O0(this.f42919h0, fVar, ((V) x10).f42949a);
        }
        return jf.y.f36177a;
    }
}
