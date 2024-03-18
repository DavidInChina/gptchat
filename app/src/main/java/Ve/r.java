package Ve;

import af.C1988e;
import cf.AbstractC2406e;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class r extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f18855Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f18856Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1519y f18857h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ SessionDescription f18858i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z10, C1519y c1519y, SessionDescription sessionDescription, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f18856Z = z10;
        this.f18857h0 = c1519y;
        this.f18858i0 = sessionDescription;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new r(this.f18856Z, this.f18857h0, this.f18858i0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((r) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18855Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return (AbstractC2406e) obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
            return (AbstractC2406e) obj;
        }
        com.google.android.gms.internal.play_billing.N.B0(obj);
        boolean z10 = this.f18856Z;
        SessionDescription sessionDescription = this.f18858i0;
        C1519y c1519y = this.f18857h0;
        if (z10) {
            PeerConnection peerConnection = c1519y.f18921c;
            this.f18855Y = 1;
            C1988e c1988e = new C1988e();
            peerConnection.setRemoteDescription(c1988e, sessionDescription);
            obj = c1988e.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            return (AbstractC2406e) obj;
        }
        PeerConnection peerConnection2 = c1519y.f18921c;
        this.f18855Y = 2;
        C1988e c1988e2 = new C1988e();
        peerConnection2.setLocalDescription(c1988e2, sessionDescription);
        obj = c1988e2.b(this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        return (AbstractC2406e) obj;
    }
}
