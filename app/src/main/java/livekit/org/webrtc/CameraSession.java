package livekit.org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface CameraSession {

    /* loaded from: classes.dex */
    public interface CreateSessionCallback {
        void onDone(CameraSession cameraSession);

        void onFailure(FailureType failureType, String str);
    }

    /* loaded from: classes.dex */
    public interface Events {
        void onCameraClosed(CameraSession cameraSession);

        void onCameraDisconnected(CameraSession cameraSession);

        void onCameraError(CameraSession cameraSession, String str);

        void onCameraOpening();

        void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame);
    }

    /* loaded from: classes2.dex */
    public enum FailureType {
        ERROR,
        DISCONNECTED
    }

    void stop();
}
