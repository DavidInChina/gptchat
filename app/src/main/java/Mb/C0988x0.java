package Mb;

import jf.C3963m;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Mb.x0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0988x0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public F0 f12000Y;

    /* renamed from: Z  reason: collision with root package name */
    public Cb.g0 f12001Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f12002h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ F0 f12003i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0988x0(F0 f02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12003i0 = f02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0988x0(this.f12003i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0988x0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Cb.g0 g0Var;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f12002h0;
        F0 f02 = this.f12003i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        g0Var = this.f12001Z;
                        f02 = this.f12000Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        C0973p0 c0973p0 = new C0973p0(L4.a.H0(g0Var, (Cb.F) obj));
                        C3963m c3963m = F0.f11772o;
                        f02.f(c0973p0);
                        return jf.y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                return jf.y.f36177a;
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ia.j jVar = ((Cb.S) f02.f11775l).f2910c;
            this.f12002h0 = 1;
            obj = L4.a.m0(jVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        Cb.Y y10 = (Cb.Y) obj;
        Cb.g0 g0Var2 = y10.f2919a;
        if (g0Var2 == Cb.g0.f2942Z) {
            nb.d dVar = new nb.d(8, y10);
            C3963m c3963m2 = F0.f11772o;
            f02.l(dVar);
            this.f12002h0 = 2;
            if (F0.m(f02, false, this) == enumC5000a) {
                return enumC5000a;
            }
            return jf.y.f36177a;
        }
        Cb.G g10 = f02.f11775l;
        this.f12000Y = f02;
        this.f12001Z = g0Var2;
        this.f12002h0 = 3;
        obj = ((Cb.S) g10).b(this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        g0Var = g0Var2;
        C0973p0 c0973p02 = new C0973p0(L4.a.H0(g0Var, (Cb.F) obj));
        C3963m c3963m3 = F0.f11772o;
        f02.f(c0973p02);
        return jf.y.f36177a;
    }
}
