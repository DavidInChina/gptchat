package Jb;

import Mb.X0;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes2.dex */
public final class y extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f9030Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ X0 f9031Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f9032h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ p0.f f9033i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ p0.l f9034j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(X0 x02, Tc.f fVar, p0.f fVar2, p0.l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9031Z = x02;
        this.f9032h0 = fVar;
        this.f9033i0 = fVar2;
        this.f9034j0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new y(this.f9031Z, this.f9032h0, this.f9033i0, this.f9034j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9030Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5426p c5426p = this.f9031Z.f812i;
            x xVar = new x(this.f9032h0, this.f9033i0, this.f9034j0, null);
            this.f9030Y = 1;
            if (L4.a.b0(c5426p, xVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
