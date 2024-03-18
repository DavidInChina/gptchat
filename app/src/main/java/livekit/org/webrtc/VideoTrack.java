package livekit.org.webrtc;

import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap<VideoSink, Long> sinks = new IdentityHashMap<>();

    public VideoTrack(long j6) {
        super(j6);
    }

    private static native void nativeAddSink(long j6, long j10);

    private static native void nativeFreeSink(long j6);

    private static native boolean nativeGetShouldReceive(long j6);

    private static native void nativeRemoveSink(long j6, long j10);

    private static native void nativeSetShouldReceive(long j6, boolean z10);

    private static native long nativeWrapSink(VideoSink videoSink);

    public void addSink(VideoSink videoSink) {
        if (videoSink != null) {
            if (!this.sinks.containsKey(videoSink)) {
                long nativeWrapSink = nativeWrapSink(videoSink);
                this.sinks.put(videoSink, Long.valueOf(nativeWrapSink));
                nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The VideoSink is not allowed to be null");
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

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(VideoSink videoSink) {
        Long remove = this.sinks.remove(videoSink);
        if (remove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), remove.longValue());
            nativeFreeSink(remove.longValue());
        }
    }

    public void setShouldReceive(boolean z10) {
        nativeSetShouldReceive(getNativeMediaStreamTrack(), z10);
    }

    public boolean shouldReceive() {
        return nativeGetShouldReceive(getNativeMediaStreamTrack());
    }
}
