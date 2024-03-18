package Ve;

import livekit.org.webrtc.PeerConnection;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class X extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18711Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18712Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C1503i0 c1503i0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18712Z = c1503i0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new X(this.f18712Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18711Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C1519y c1519y = this.f18712Z.f18790p;
            if (c1519y != null) {
                this.f18711Y = 1;
                obj = c1519y.g(this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                return null;
            }
        }
        return (PeerConnection.SignalingState) obj;
    }
}
