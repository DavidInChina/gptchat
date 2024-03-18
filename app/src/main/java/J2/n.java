package J2;

import android.view.Surface;

/* loaded from: classes.dex */
public abstract class n {
    public static void a(Surface surface, float f6) {
        int i10;
        if (f6 == 0.0f) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        try {
            surface.setFrameRate(f6, i10);
        } catch (IllegalStateException e10) {
            s2.p.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
