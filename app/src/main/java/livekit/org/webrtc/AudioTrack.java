package livekit.org.webrtc;

import java.util.IdentityHashMap;

/* loaded from: classes2.dex */
public class AudioTrack extends MediaStreamTrack {
    private final IdentityHashMap<AudioTrackSink, Long> sinks = new IdentityHashMap<>();

    public AudioTrack(long j6) {
        super(j6);
    }

    private static native void nativeAddSink(long j6, long j10);

    private static native void nativeFreeSink(long j6);

    private static native void nativeRemoveSink(long j6, long j10);

    private static native void nativeSetVolume(long j6, double d10);

    private static native long nativeWrapSink(AudioTrackSink audioTrackSink);

    public void addSink(AudioTrackSink audioTrackSink) {
        if (audioTrackSink != null) {
            if (!this.sinks.containsKey(audioTrackSink)) {
                long nativeWrapSink = nativeWrapSink(audioTrackSink);
                this.sinks.put(audioTrackSink, Long.valueOf(nativeWrapSink));
                nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The AudioTrackSink is not allowed to be null");
    }

    @Override // livekit.org.webrtc.MediaStreamTrack
    public void dispose() {
        for (Long l10 : this.sinks.values()) {
            long longValue = l10.longValue();
            nativeRemoveSink(getNativeMediaStreamTrack(), longValue);
            nativeFreeSink(longValue);
        }
        this.sinks.clear();
        super.dispose();
    }

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(AudioTrackSink audioTrackSink) {
        Long remove = this.sinks.remove(audioTrackSink);
        if (remove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), remove.longValue());
            nativeFreeSink(remove.longValue());
        }
    }

    public void setVolume(double d10) {
        nativeSetVolume(getNativeAudioTrack(), d10);
    }
}
