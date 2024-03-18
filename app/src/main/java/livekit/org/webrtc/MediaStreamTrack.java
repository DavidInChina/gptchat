package livekit.org.webrtc;

/* loaded from: classes.dex */
public class MediaStreamTrack {
    public static final String AUDIO_TRACK_KIND = "audio";
    public static final String VIDEO_TRACK_KIND = "video";
    private long nativeTrack;

    /* loaded from: classes2.dex */
    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);
        
        private final int nativeIndex;

        MediaType(int i10) {
            this.nativeIndex = i10;
        }

        @CalledByNative("MediaType")
        public static MediaType fromNativeIndex(int i10) {
            MediaType[] values;
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i10) {
                    return mediaType;
                }
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unknown native media type: ", i10));
        }

        @CalledByNative("MediaType")
        public int getNative() {
            return this.nativeIndex;
        }
    }

    /* loaded from: classes2.dex */
    public enum State {
        LIVE,
        ENDED;

        @CalledByNative("State")
        public static State fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    public MediaStreamTrack(long j6) {
        if (j6 != 0) {
            this.nativeTrack = j6;
            return;
        }
        throw new IllegalArgumentException("nativeTrack may not be null");
    }

    private void checkMediaStreamTrackExists() {
        if (this.nativeTrack != 0) {
            return;
        }
        throw new IllegalStateException("MediaStreamTrack has been disposed.");
    }

    public static MediaStreamTrack createMediaStreamTrack(long j6) {
        if (j6 == 0) {
            return null;
        }
        String nativeGetKind = nativeGetKind(j6);
        if (nativeGetKind.equals(AUDIO_TRACK_KIND)) {
            return new AudioTrack(j6);
        }
        if (!nativeGetKind.equals(VIDEO_TRACK_KIND)) {
            return null;
        }
        return new VideoTrack(j6);
    }

    private static native boolean nativeGetEnabled(long j6);

    private static native String nativeGetId(long j6);

    private static native String nativeGetKind(long j6);

    private static native State nativeGetState(long j6);

    private static native boolean nativeSetEnabled(long j6, boolean z10);

    public void dispose() {
        checkMediaStreamTrackExists();
        JniCommon.nativeReleaseRef(this.nativeTrack);
        this.nativeTrack = 0L;
    }

    public boolean enabled() {
        checkMediaStreamTrackExists();
        return nativeGetEnabled(this.nativeTrack);
    }

    public long getNativeMediaStreamTrack() {
        checkMediaStreamTrackExists();
        return this.nativeTrack;
    }

    public String id() {
        checkMediaStreamTrackExists();
        return nativeGetId(this.nativeTrack);
    }

    public String kind() {
        checkMediaStreamTrackExists();
        return nativeGetKind(this.nativeTrack);
    }

    public boolean setEnabled(boolean z10) {
        checkMediaStreamTrackExists();
        return nativeSetEnabled(this.nativeTrack, z10);
    }

    public State state() {
        checkMediaStreamTrackExists();
        return nativeGetState(this.nativeTrack);
    }
}
