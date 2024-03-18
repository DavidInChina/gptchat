package Xe;

import id.AbstractC3557B;
import livekit.org.webrtc.AudioTrack;
import livekit.org.webrtc.RtpReceiver;

/* loaded from: classes.dex */
public final class o extends AbstractC1679a {

    /* renamed from: i  reason: collision with root package name */
    public final RtpReceiver f21913i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AudioTrack audioTrack, RtpReceiver rtpReceiver) {
        super("", audioTrack);
        AbstractC3557B.c0("rtcTrack", audioTrack);
        AbstractC3557B.c0("receiver", rtpReceiver);
        this.f21913i = rtpReceiver;
    }
}
