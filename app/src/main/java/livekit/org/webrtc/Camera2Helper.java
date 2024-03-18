package livekit.org.webrtc;

import android.hardware.camera2.CameraManager;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.org.webrtc.CameraEnumerationAndroid;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Llivekit/org/webrtc/Camera2Helper;", "", "()V", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = r9.y.f44626f)
/* loaded from: classes.dex */
public final class Camera2Helper {
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ \u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\u000f"}, d2 = {"Llivekit/org/webrtc/Camera2Helper$Companion;", "", "()V", "findClosestCaptureFormat", "Llivekit/org/webrtc/Size;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "cameraId", "", "width", "", "height", "getSupportedFormats", "", "Llivekit/org/webrtc/CameraEnumerationAndroid$CaptureFormat;", "livekit-android-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Size findClosestCaptureFormat(CameraManager cameraManager, String str, int i10, int i11) {
            List list;
            AbstractC3557B.c0("cameraManager", cameraManager);
            List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = getSupportedFormats(cameraManager, str);
            if (supportedFormats != null) {
                list = new ArrayList(AbstractC6583a.H1(supportedFormats, 10));
                for (CameraEnumerationAndroid.CaptureFormat captureFormat : supportedFormats) {
                    list.add(new Size(captureFormat.width, captureFormat.height));
                }
            } else {
                list = kf.v.f37483Y;
            }
            Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(list, i10, i11);
            AbstractC3557B.b0("getClosestSupportedSize(sizes, width, height)", closestSupportedSize);
            return closestSupportedSize;
        }

        public final List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager, String str) {
            AbstractC3557B.c0("cameraManager", cameraManager);
            return Camera2Enumerator.getSupportedFormats(cameraManager, str);
        }
    }
}
