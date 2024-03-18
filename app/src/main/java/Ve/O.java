package Ve;

import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RtpSender;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class O extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f18682Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ RtpSender f18683Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ RTCStatsCollectorCallback f18684h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(RtpSender rtpSender, RTCStatsCollectorCallback rTCStatsCollectorCallback, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18683Z = rtpSender;
        this.f18684h0 = rTCStatsCollectorCallback;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        O o10 = new O(this.f18683Z, this.f18684h0, abstractC4825e);
        o10.f18682Y = obj;
        return o10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((O) create((PeerConnection) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        ((PeerConnection) this.f18682Y).getStats(this.f18683Z, this.f18684h0);
        return jf.y.f36177a;
    }
}
