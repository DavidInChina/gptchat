package pc;

import Z8.AbstractC1809m0;
import Z8.C1817q0;
import Z8.C1818r0;
import Z8.C1820s0;
import android.app.Activity;
import bb.B0;
import bb.C2162e0;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class g0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f42987Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ h0 f42988Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Activity f42989h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f42990i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, Activity activity, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f42988Z = h0Var;
        this.f42989h0 = activity;
        this.f42990i0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new g0(this.f42988Z, this.f42989h0, this.f42990i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f42987Y;
        h0 h0Var = this.f42988Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            String str = this.f42990i0;
            B0 b02 = new B0(str, 6);
            h0Var.getClass();
            h0Var.l(new C2162e0(26, b02));
            this.f42987Y = 1;
            obj = h0Var.f42995j.c(this.f42989h0, str, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        r rVar = (r) obj;
        if (rVar instanceof C5138q) {
            AbstractC1809m0.a().b(C1820s0.f23409c, kf.w.f37484Y);
            h0Var.f(U.f42948a);
        } else if (AbstractC3557B.K(rVar, C5130i.f42996Y)) {
            AbstractC1809m0.a().b(C1817q0.f23402c, kf.w.f37484Y);
            P p10 = P.f42938k0;
            h0Var.getClass();
            h0Var.l(new C2162e0(26, p10));
        } else if (rVar instanceof AbstractC5137p) {
            AbstractC1809m0.a().b(C1818r0.f23408c, kf.w.f37484Y);
            int i11 = K.f42906h0;
            h0Var.m(k5.F.g((AbstractC5137p) rVar));
        }
        return jf.y.f36177a;
    }
}
