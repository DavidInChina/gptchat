package livekit.org.webrtc;

/* loaded from: classes2.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z10);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
