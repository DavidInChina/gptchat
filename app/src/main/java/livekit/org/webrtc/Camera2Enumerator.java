package livekit.org.webrtc;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.SystemClock;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import livekit.org.webrtc.CameraEnumerationAndroid;
import livekit.org.webrtc.CameraVideoCapturer;

/* loaded from: classes2.dex */
public class Camera2Enumerator implements CameraEnumerator {
    private static final double NANO_SECONDS_PER_SECOND = 1.0E9d;
    private static final String TAG = "Camera2Enumerator";
    private static final Map<String, List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats = new HashMap();
    final CameraManager cameraManager;
    final Context context;

    public Camera2Enumerator(Context context) {
        this.context = context;
        this.cameraManager = (CameraManager) context.getSystemService("camera");
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(Range<Integer>[] rangeArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (Range<Integer> range : rangeArr) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(range.getLower().intValue() * i10, range.getUpper().intValue() * i10));
        }
        return arrayList;
    }

    private static List<Size> convertSizes(android.util.Size[] sizeArr) {
        if (sizeArr != null && sizeArr.length != 0) {
            ArrayList arrayList = new ArrayList(sizeArr.length);
            for (android.util.Size size : sizeArr) {
                arrayList.add(new Size(size.getWidth(), size.getHeight()));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            return this.cameraManager.getCameraCharacteristics(str);
        } catch (CameraAccessException | RuntimeException e10) {
            Logging.e(TAG, "Camera access exception", e10);
            return null;
        }
    }

    public static int getFpsUnitFactor(Range<Integer>[] rangeArr) {
        if (rangeArr.length == 0 || rangeArr[0].getUpper().intValue() < 1000) {
            return 1000;
        }
        return 1;
    }

    public static List<Size> getSupportedSizes(CameraCharacteristics cameraCharacteristics) {
        ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        return convertSizes(((StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class));
    }

    public static boolean isSupported(Context context) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            for (String str : cameraManager.getCameraIdList()) {
                if (((Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    return false;
                }
            }
            return true;
        } catch (CameraAccessException | RuntimeException e10) {
            Logging.e(TAG, "Failed to check if camera2 is supported", e10);
            return false;
        }
    }

    @Override // livekit.org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera2Capturer(this.context, str, cameraEventsHandler);
    }

    @Override // livekit.org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        try {
            return this.cameraManager.getCameraIdList();
        } catch (CameraAccessException e10) {
            Logging.e(TAG, "Camera access exception", e10);
            return new String[0];
        }
    }

    @Override // livekit.org.webrtc.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(this.context, str);
    }

    @Override // livekit.org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // livekit.org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return true;
        }
        return false;
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(Context context, String str) {
        return getSupportedFormats((CameraManager) context.getSystemService("camera"), str);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager, String str) {
        long j6;
        Map<String, List<CameraEnumerationAndroid.CaptureFormat>> map = cachedSupportedFormats;
        synchronized (map) {
            try {
                if (!map.containsKey(str)) {
                    Logging.d(TAG, "Get supported formats for camera index " + str + Separators.DOT);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = convertFramerates(rangeArr, getFpsUnitFactor(rangeArr));
                        List<Size> supportedSizes = getSupportedSizes(cameraCharacteristics);
                        int i10 = 0;
                        for (CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange : convertFramerates) {
                            i10 = Math.max(i10, framerateRange.max);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Size size : supportedSizes) {
                            try {
                                j6 = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, new android.util.Size(size.width, size.height));
                            } catch (Exception unused) {
                                j6 = 0;
                            }
                            int round = j6 == 0 ? i10 : ((int) Math.round(NANO_SECONDS_PER_SECOND / j6)) * 1000;
                            arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, 0, round));
                            Logging.d(TAG, "Format: " + size.width + "x" + size.height + Separators.AT + round);
                        }
                        cachedSupportedFormats.put(str, arrayList);
                        Logging.d(TAG, "Get supported formats for camera index " + str + " done. Time spent: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms.");
                        return arrayList;
                    } catch (Exception e10) {
                        Logging.e(TAG, "getCameraCharacteristics()", e10);
                        return new ArrayList();
                    }
                }
                return map.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
