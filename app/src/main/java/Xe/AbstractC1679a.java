package Xe;

import id.AbstractC3557B;
import livekit.org.webrtc.AudioTrack;
import livekit.org.webrtc.MediaStreamTrack;

/* renamed from: Xe.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1679a extends z {

    /* renamed from: h  reason: collision with root package name */
    public final AudioTrack f21883h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1679a(String str, AudioTrack audioTrack) {
        super(str, 1, audioTrack);
        AbstractC3557B.c0("rtcTrack", audioTrack);
        this.f21883h = audioTrack;
    }

    @Override // Xe.z
    public final MediaStreamTrack b() {
        return this.f21883h;
    }
}
