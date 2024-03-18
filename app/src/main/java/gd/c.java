package Gd;

import Ad.l;
import Cd.K;
import Cd.L;
import Cd.M;
import Cd.O;
import Cd.P;
import Cd.Q;
import Cd.S;
import Cd.U;
import Cd.V;
import Cd.W;
import Cd.X;
import Ng.D0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import u9.EnumC5869a;
import wf.n;

/* loaded from: classes.dex */
public final class c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f6278Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f6279Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6279Z = gVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        c cVar = new c(this.f6279Z, abstractC4825e);
        cVar.f6278Y = obj;
        return cVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((c) create((X) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        X x10 = (X) this.f6278Y;
        U3.f fVar = x10.f3027b;
        g gVar = this.f6279Z;
        if (!AbstractC3557B.K(gVar.f6303m, fVar)) {
            h hVar = gVar.f6296f;
            gVar.f6298h = hVar.f6304a;
            D0 d02 = gVar.f6302l;
            if (d02 != null) {
                d02.k(null);
            }
            U3.f fVar2 = gVar.f6303m;
            gVar.f6303m = fVar;
            boolean K10 = AbstractC3557B.K(fVar, Cd.N.f3018g);
            u9.b bVar = gVar.f6295e;
            if (K10) {
                hVar.f6320q = hVar.f6304a;
                hVar.f6316m = Float.MAX_VALUE;
                bVar.h(EnumC5869a.f46502Z);
            } else if (AbstractC3557B.K(fVar, M.f3017g)) {
                hVar.f6316m = Float.MAX_VALUE;
            } else if (AbstractC3557B.K(fVar, K.f3015g)) {
                if (hVar.f6316m == Float.MAX_VALUE) {
                    hVar.f6316m = hVar.f6304a;
                }
            } else if (AbstractC3557B.K(fVar, Q.f3021g)) {
                if (hVar.f6316m == Float.MAX_VALUE) {
                    hVar.f6316m = hVar.f6304a;
                }
                hVar.f6309f = hVar.f6304a;
                hVar.f6311h = Float.MAX_VALUE;
                bVar.a();
            } else if (AbstractC3557B.K(fVar, P.f3020g)) {
                if (!(fVar2 instanceof S)) {
                    hVar.f6311h = hVar.f6304a;
                }
            } else if (fVar instanceof S) {
                float k10 = (float) Mg.b.k(((S) fVar).f3022g, Mg.d.f12134i0);
                float f6 = hVar.f6304a;
                hVar.f6322s = f6;
                hVar.f6323t = f6 + k10;
                bVar.g();
            } else if (AbstractC3557B.K(fVar, W.f3025g)) {
                hVar.f6313j = hVar.f6304a;
                gVar.f6302l = l.O0(gVar.f6291a, null, null, new e(gVar, null), 3);
            } else if (AbstractC3557B.K(fVar, V.f3024g)) {
                hVar.f6315l = hVar.f6304a;
                hVar.f6311h = Float.MAX_VALUE;
            } else if (AbstractC3557B.K(fVar, O.f3019g)) {
                hVar.f6318o = hVar.f6304a;
                hVar.f6311h = Float.MAX_VALUE;
            } else if (AbstractC3557B.K(fVar, L.f3016g)) {
                hVar.f6320q = Float.MAX_VALUE;
            } else {
                AbstractC3557B.K(fVar, U.f3023g);
            }
        }
        gVar.f6299i = x10.f3030e;
        return y.f36177a;
    }
}
