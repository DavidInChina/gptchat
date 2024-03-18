package C2;

import android.media.MediaCodecInfo;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, String str, int i10, int i11, double d10) {
        List supportedPerformancePoints;
        int i12;
        boolean covers;
        boolean covers2;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        A1.a.k();
        MediaCodecInfo.VideoCapabilities.PerformancePoint e10 = A1.a.e(i10, i11, (int) d10);
        int i13 = 0;
        while (true) {
            if (i13 < supportedPerformancePoints.size()) {
                covers2 = A1.a.f(supportedPerformancePoints.get(i13)).covers(e10);
                if (covers2) {
                    i12 = 2;
                    break;
                }
                i13++;
            } else {
                i12 = 1;
                break;
            }
        }
        if (i12 == 1 && str.equals("video/avc")) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint d11 = A1.a.d();
            for (int i14 = 0; i14 < supportedPerformancePoints.size(); i14++) {
                covers = A1.a.f(supportedPerformancePoints.get(i14)).covers(d11);
                if (!covers) {
                }
            }
            return 0;
        }
        return i12;
    }
}
