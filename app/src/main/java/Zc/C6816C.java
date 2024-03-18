package zc;

import Z8.AbstractC1809m0;
import Z8.Y0;
import fa.C2969F;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* renamed from: zc.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6816C extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f51820Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2969F f51821Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Q f51822h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6816C(C2969F c2969f, Q q10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51821Z = c2969f;
        this.f51822h0 = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C6816C(this.f51821Z, this.f51822h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C6816C) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51820Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC1809m0.a().b(Y0.f23290c, kf.w.f37484Y);
            Pc.c a5 = Pc.e.a();
            StringBuilder sb2 = new StringBuilder("Relay message to webrtc data stream : ");
            C2969F c2969f = this.f51821Z;
            sb2.append(c2969f);
            W.F(a5, sb2.toString(), null, 6);
            Kd.I i11 = this.f51822h0.f51860l;
            this.f51820Y = 1;
            if (i11.g(c2969f, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
