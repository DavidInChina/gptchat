package ec;

import Uc.C1422g;
import Uc.EnumC1421f;
import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import Z8.C1784a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;
import wd.q0;
import wd.u0;
import wd.v0;

/* renamed from: ec.J  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2840J extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f29155Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC2868t f29156Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2847Q f29157h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2840J(AbstractC2868t abstractC2868t, C2847Q c2847q, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f29156Z = abstractC2868t;
        this.f29157h0 = c2847q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C2840J(this.f29156Z, this.f29157h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C2840J) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v0 v0Var;
        C1784a c1784a;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29155Y;
        AbstractC2868t abstractC2868t = this.f29156Z;
        C2847Q c2847q = this.f29157h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    v0Var = (v0) obj;
                    if (v0Var instanceof q0) {
                        c2847q.f(new C2859k((q0) v0Var));
                    }
                    if (v0Var instanceof u0) {
                        jf.y yVar = (jf.y) ((u0) v0Var).f48468a;
                        C1422g c1422g = C1422g.f17674i;
                        c2847q.f(new C2854f(C1422g.r1(EnumC1421f.f17672j0)));
                    }
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC1805k0 a5 = AbstractC1809m0.a();
            if (((C2866r) abstractC2868t).f29244a) {
                c1784a = C1784a.f23330k;
            } else {
                c1784a = C1784a.f23331l;
            }
            a5.b(c1784a, kf.w.f37484Y);
            xd.h hVar = c2847q.f29173k;
            nb.d dVar = new nb.d(13, abstractC2868t);
            this.f29155Y = 1;
            if (((rc.Q) hVar).a(dVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        if (((C2866r) abstractC2868t).f29244a) {
            xd.g gVar = c2847q.f29175m;
            this.f29155Y = 2;
            obj = ((C5451O) gVar).g(false, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            v0Var = (v0) obj;
            if (v0Var instanceof q0) {
            }
            if (v0Var instanceof u0) {
            }
            return jf.y.f36177a;
        }
        C1422g c1422g2 = C1422g.f17674i;
        c2847q.f(new C2854f(C1422g.r1(EnumC1421f.f17672j0)));
        return jf.y.f36177a;
    }
}
