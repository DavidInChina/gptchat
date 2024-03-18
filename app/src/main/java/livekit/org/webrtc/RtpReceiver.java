package livekit.org.webrtc;

import livekit.org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public class RtpReceiver {
    private MediaStreamTrack cachedTrack;
    private long nativeObserver;
    private long nativeRtpReceiver;

    /* loaded from: classes2.dex */
    public interface Observer {
        @CalledByNative("Observer")
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);
    }

    @CalledByNative
    public RtpReceiver(long j6) {
        this.nativeRtpReceiver = j6;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j6));
    }

    private void checkRtpReceiverExists() {
        if (this.nativeRtpReceiver != 0) {
            return;
        }
        throw new IllegalStateException("RtpReceiver has been disposed.");
    }

    private static native String nativeGetId(long j6);

    private static native RtpParameters nativeGetParameters(long j6);

    private static native long nativeGetTrack(long j6);

    private static native void nativeSetFrameDecryptor(long j6, long j10);

    private static native long nativeSetObserver(long j6, Observer observer);

    private static native void nativeUnsetObserver(long j6, long j10);

    public void SetObserver(Observer observer) {
        checkRtpReceiverExists();
        long j6 = this.nativeObserver;
        if (j6 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j6);
        }
        this.nativeObserver = nativeSetObserver(this.nativeRtpReceiver, observer);
    }

    @CalledByNative
    public void dispose() {
        checkRtpReceiverExists();
        this.cachedTrack.dispose();
        long j6 = this.nativeObserver;
        if (j6 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j6);
            this.nativeObserver = 0L;
        }
        JniCommon.nativeReleaseRef(this.nativeRtpReceiver);
        this.nativeRtpReceiver = 0L;
    }

    public long getNativeRtpReceiver() {
        checkRtpReceiverExists();
        return this.nativeRtpReceiver;
    }

    public RtpParameters getParameters() {
        checkRtpReceiverExists();
        return nativeGetParameters(this.nativeRtpReceiver);
    }

    public String id() {
        checkRtpReceiverExists();
        return nativeGetId(this.nativeRtpReceiver);
    }

    public void setFrameDecryptor(FrameDecryptor frameDecryptor) {
        checkRtpReceiverExists();
        nativeSetFrameDecryptor(this.nativeRtpReceiver, frameDecryptor.getNativeFrameDecryptor());
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
