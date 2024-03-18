package B;

import Ng.AbstractC1073l0;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class Q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1151Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1152Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ S f1153h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1153h0 = s10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        Q q10 = new Q(this.f1153h0, abstractC4825e);
        q10.f1152Z = obj;
        return q10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1151Y;
        S s10 = this.f1153h0;
        try {
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC1073l0 v02 = Ad.l.v0(((Ng.F) this.f1152Z).i());
                    s10.f1164C0 = true;
                    AbstractC0168u1 abstractC0168u1 = s10.f1167t0;
                    P p10 = new P(s10, v02, null);
                    this.f1151Y = 1;
                    if (abstractC0168u1.c(A.B0.f14Y, p10, this) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                s10.f1170w0.b();
                s10.f1164C0 = false;
                s10.f1170w0.a(null);
                s10.f1162A0 = false;
                return jf.y.f36177a;
            } catch (CancellationException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            s10.f1164C0 = false;
            s10.f1170w0.a(null);
            s10.f1162A0 = false;
            throw th2;
        }
    }
}
