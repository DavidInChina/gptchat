package Ze;

import android.content.Context;
import android.media.MediaRecorder;
import livekit.org.webrtc.Camera1Capturer;
import livekit.org.webrtc.Camera1Helper;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.Size;
import livekit.org.webrtc.SurfaceTextureHelper;

/* loaded from: classes.dex */
public final class a extends h implements CameraVideoCapturer {

    /* renamed from: Y  reason: collision with root package name */
    public final Camera1Capturer f23698Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f23699Z;

    public a(Camera1Capturer camera1Capturer, String str, i iVar) {
        this.f23698Y = camera1Capturer;
        this.f23699Z = str;
    }

    @Override // Ze.h
    public final Size a(int i10, int i11) {
        Camera1Helper.Companion companion = Camera1Helper.Companion;
        return companion.findClosestCaptureFormat(companion.getCameraId(this.f23699Z), i10, i11);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        livekit.org.webrtc.d.a(this, mediaRecorder, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void changeCaptureFormat(int i10, int i11, int i12) {
        this.f23698Y.changeCaptureFormat(i10, i11, i12);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void dispose() {
        this.f23698Y.dispose();
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.f23698Y.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final boolean isScreencast() {
        return this.f23698Y.isScreencast();
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        livekit.org.webrtc.d.b(this, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void startCapture(int i10, int i11, int i12) {
        this.f23698Y.startCapture(i10, i11, i12);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void stopCapture() {
        this.f23698Y.stopCapture();
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        this.f23698Y.switchCamera(cameraSwitchHandler);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        this.f23698Y.switchCamera(cameraSwitchHandler, str);
    }
}
