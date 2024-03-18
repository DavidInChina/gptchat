package zc;

import Cd.C0327l;
import Qg.F0;
import Uc.C1422g;
import Uc.EnumC1421f;
import Z8.Y0;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class x extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public Q f51950Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f51951Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Q f51952h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Q q10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51952h0 = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new x(this.f51952h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((x) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51951Z;
        jf.y yVar = jf.y.f36177a;
        Q q10 = this.f51952h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    q10 = this.f51950Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    q10.f(new C0327l((Ed.m) obj));
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f51951Z = 1;
            q10.f51871w = true;
            q10.o(Y0.f23287D, kf.w.f37484Y);
            C1422g c1422g = C1422g.f17674i;
            androidx.lifecycle.P p10 = q10.f51864p;
            AbstractC3557B.c0("savedStateHandle", p10);
            p10.c("entryPoint", EnumC1421f.f17672j0);
            Object d10 = q10.f51860l.d(this);
            if (d10 != enumC5000a) {
                d10 = yVar;
            }
            if (d10 == enumC5000a) {
                return enumC5000a;
            }
        }
        F0 f02 = q10.f51860l.f9676G;
        this.f51950Y = q10;
        this.f51951Z = 2;
        obj = L4.a.m0(f02, this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        q10.f(new C0327l((Ed.m) obj));
        return yVar;
    }
}
