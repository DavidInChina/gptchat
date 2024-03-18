package Ve;

import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RtpReceiver;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class Q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f18689Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ RtpReceiver f18690Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ RTCStatsCollectorCallback f18691h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(RtpReceiver rtpReceiver, RTCStatsCollectorCallback rTCStatsCollectorCallback, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18690Z = rtpReceiver;
        this.f18691h0 = rTCStatsCollectorCallback;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        Q q10 = new Q(this.f18690Z, this.f18691h0, abstractC4825e);
        q10.f18689Y = obj;
        return q10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((Q) create((PeerConnection) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        ((PeerConnection) this.f18689Y).getStats(this.f18690Z, this.f18691h0);
        return jf.y.f36177a;
    }
}
