package kh;

import H0.p1;
import Ng.F;
import Ng.Q;
import Qg.AbstractC1206i;
import Sg.C1394f;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import lh.AbstractC4471A;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;
import re.C5487e;

/* loaded from: classes.dex */
public final class s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37585Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F f37586Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4471A f37587h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ e f37588i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f37589j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ l f37590k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(F f6, AbstractC4471A abstractC4471A, e eVar, AbstractC1206i abstractC1206i, l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37586Z = f6;
        this.f37587h0 = abstractC4471A;
        this.f37588i0 = eVar;
        this.f37589j0 = abstractC1206i;
        this.f37590k0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new s(this.f37586Z, this.f37587h0, this.f37588i0, this.f37589j0, this.f37590k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37585Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Tg.d dVar = Q.f12906c;
            lh.q qVar = new lh.q(new C1394f(this.f37586Z.i().plus(dVar)), this.f37587h0);
            e eVar = this.f37588i0;
            AbstractC1206i r02 = L4.a.r0(L4.a.i0(L4.a.V0(new C5426p(L4.a.l0(AbstractC4828h.o0(new d(eVar, 2))), 24), new C5487e(null, this.f37587h0, this.f37589j0, qVar, this.f37590k0))), dVar);
            p1 p1Var = new p1(3, eVar);
            this.f37585Y = 1;
            if (r02.b(p1Var, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
