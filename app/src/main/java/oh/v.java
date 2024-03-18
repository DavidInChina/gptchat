package oh;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41466Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41467Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B0.A f41468h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ x f41469i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(B0.A a5, x xVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41468h0 = a5;
        this.f41469i0 = xVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        v vVar = new v(this.f41468h0, this.f41469i0, abstractC4825e);
        vVar.f41467Z = obj;
        return vVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        u uVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41466Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Ng.G g10 = Ng.G.f12870i0;
            x xVar = this.f41469i0;
            u uVar2 = null;
            Ad.l.O0((Ng.F) this.f41467Z, null, g10, new t(xVar, null), 1);
            u uVar3 = new u(xVar, 0);
            if (xVar.f41477v0 != null) {
                uVar = new u(xVar, 1);
            } else {
                uVar = null;
            }
            if (xVar.f41478w0 != null) {
                uVar2 = new u(xVar, 2);
            }
            u uVar4 = new u(xVar, 3);
            u uVar5 = new u(xVar, 4);
            this.f41466Y = 1;
            B0.A a5 = this.f41468h0;
            Object q10 = Df.H.q(a5, new r(a5, null, uVar3, uVar2, uVar, uVar5, uVar4), this);
            if (q10 != enumC5000a) {
                q10 = yVar;
            }
            if (q10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
