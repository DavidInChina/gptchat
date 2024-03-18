package livekit.org.webrtc;

/* loaded from: classes2.dex */
public class MediaSource {
    private long nativeSource;
    private final RefCountDelegate refCountDelegate;

    /* loaded from: classes2.dex */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        @CalledByNative("State")
        public static State fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    public MediaSource(final long j6) {
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: livekit.org.webrtc.l
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeReleaseRef(j6);
            }
        });
        this.nativeSource = j6;
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource != 0) {
            return;
        }
        throw new IllegalStateException("MediaSource has been disposed.");
    }

    private static native State nativeGetState(long j6);

    public void dispose() {
        checkMediaSourceExists();
        this.refCountDelegate.release();
        this.nativeSource = 0L;
    }

    public long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
    }

    public void runWithReference(Runnable runnable) {
        if (this.refCountDelegate.safeRetain()) {
            try {
                runnable.run();
            } finally {
                this.refCountDelegate.release();
            }
        }
    }

    public State state() {
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}
