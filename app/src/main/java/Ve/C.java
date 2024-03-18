package Ve;

import cf.AbstractC2408g;
import id.AbstractC3557B;
import j$.util.Objects;
import livekit.org.webrtc.CandidatePairChangeEvent;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.IceCandidateErrorEvent;
import livekit.org.webrtc.MediaStream;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.RtpTransceiver;
import ud.C5902a;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class C implements PeerConnection.Observer, AbstractC1494e {

    /* renamed from: a  reason: collision with root package name */
    public final C1503i0 f18615a;

    /* renamed from: b  reason: collision with root package name */
    public final E0 f18616b;

    /* renamed from: c  reason: collision with root package name */
    public wf.k f18617c;

    public C(C1503i0 c1503i0, E0 e02) {
        AbstractC3557B.c0("engine", c1503i0);
        AbstractC3557B.c0("client", e02);
        this.f18615a = c1503i0;
        this.f18616b = e02;
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        AbstractC3557B.c0("newState", peerConnectionState);
        ef.e.b(new B(this, peerConnectionState));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onIceCandidate(IceCandidate iceCandidate) {
        ef.e.b(new C5902a(iceCandidate, 5, this));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onIceCandidateError(IceCandidateErrorEvent iceCandidateErrorEvent) {
        livekit.org.webrtc.n.c(this, iceCandidateErrorEvent);
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Objects.toString(iceConnectionState);
            Mi.a.e(new Object[0]);
        }
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onRemoveTrack(RtpReceiver rtpReceiver) {
        livekit.org.webrtc.n.d(this, rtpReceiver);
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onRenegotiationNeeded() {
        ef.e.b(new zc.u(13, this));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onAddStream(MediaStream mediaStream) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onDataChannel(DataChannel dataChannel) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onIceConnectionReceivingChange(boolean z10) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onRemoveStream(MediaStream mediaStream) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onSignalingChange(PeerConnection.SignalingState signalingState) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onTrack(RtpTransceiver rtpTransceiver) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public final void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
    }
}
