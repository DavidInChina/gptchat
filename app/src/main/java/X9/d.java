package x9;

import B.AbstractC0170v0;
import B0.A;
import G0.f0;
import N.D;
import Z.AbstractC1710f0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import mh.P;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.C6686a;

/* loaded from: classes2.dex */
public final class d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f49646Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f49647Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l f49648h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ P f49649i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f49650j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f49651k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, P p10, wf.k kVar, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f49648h0 = lVar;
        this.f49649i0 = p10;
        this.f49650j0 = kVar;
        this.f49651k0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        d dVar = new d(this.f49648h0, this.f49649i0, this.f49650j0, this.f49651k0, abstractC4825e);
        dVar.f49647Z = obj;
        return dVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((A) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f49646Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            A a5 = (A) this.f49647Z;
            l lVar = this.f49648h0;
            P p10 = this.f49649i0;
            wf.k kVar = this.f49650j0;
            AbstractC1710f0 abstractC1710f0 = this.f49651k0;
            C6686a c6686a = new C6686a(lVar, p10, kVar, abstractC1710f0, 9);
            f0 f0Var = new f0(1, kVar);
            D d10 = new D(lVar, p10, abstractC1710f0, 8);
            this.f49646Y = 1;
            if (AbstractC0170v0.f(a5, c6686a, f0Var, d10, this, 4) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
