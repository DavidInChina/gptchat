package livekit.org.webrtc;

/* loaded from: classes2.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j6) {
        super(j6);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
