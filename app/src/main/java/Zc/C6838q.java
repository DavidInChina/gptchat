package zc;

import Cd.V;
import Cd.W;
import Cd.X;
import Z8.Y0;
import Z8.Z0;
import Z8.a1;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: zc.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6838q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f51926Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51927Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6838q(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51927Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6838q c6838q = new C6838q(this.f51927Z, abstractC4825e);
        c6838q.f51926Y = obj;
        return c6838q;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C6838q) create((X) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        U3.f fVar = ((X) this.f51926Y).f3027b;
        kf.w wVar = kf.w.f37484Y;
        Q q10 = this.f51927Z;
        q10.getClass();
        a1 a1Var = null;
        if (AbstractC3557B.K(fVar, Cd.M.f3017g)) {
            if (!q10.f51871w) {
                a1Var = Y0.f23286C;
            }
        } else if (AbstractC3557B.K(fVar, Cd.N.f3018g)) {
            a1Var = Y0.f23288E;
        } else if (AbstractC3557B.K(fVar, Cd.K.f3015g)) {
            a1Var = Y0.f23285B;
        } else if (AbstractC3557B.K(fVar, Cd.P.f3020g)) {
            if (!q10.f51870v) {
                a1Var = Z0.f23317d;
            } else {
                q10.f51870v = false;
            }
        } else if (AbstractC3557B.K(fVar, W.f3025g)) {
            a1Var = Z0.f23320g;
        } else if (AbstractC3557B.K(fVar, V.f3024g)) {
            a1Var = Z0.f23318e;
        } else if (AbstractC3557B.K(fVar, Cd.O.f3019g)) {
            a1Var = Z0.f23315b;
        }
        if (a1Var != null) {
            q10.o(a1Var, wVar);
        }
        return jf.y.f36177a;
    }
}
