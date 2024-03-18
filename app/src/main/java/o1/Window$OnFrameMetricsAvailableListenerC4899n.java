package o1;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import id.AbstractC3557B;

/* renamed from: o1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class Window$OnFrameMetricsAvailableListenerC4899n implements Window$OnFrameMetricsAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f40466a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f40467b;

    public /* synthetic */ Window$OnFrameMetricsAvailableListenerC4899n(int i10, Object obj) {
        this.f40466a = i10;
        this.f40467b = obj;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        switch (this.f40466a) {
            case 0:
                C4900o c4900o = (C4900o) this.f40467b;
                if ((c4900o.f40470Z & 1) != 0) {
                    C4900o.y(c4900o.f40471h0[0], frameMetrics.getMetric(8));
                }
                C4900o c4900o2 = (C4900o) this.f40467b;
                if ((c4900o2.f40470Z & 2) != 0) {
                    C4900o.y(c4900o2.f40471h0[1], frameMetrics.getMetric(1));
                }
                C4900o c4900o3 = (C4900o) this.f40467b;
                if ((c4900o3.f40470Z & 4) != 0) {
                    C4900o.y(c4900o3.f40471h0[2], frameMetrics.getMetric(3));
                }
                C4900o c4900o4 = (C4900o) this.f40467b;
                if ((c4900o4.f40470Z & 8) != 0) {
                    C4900o.y(c4900o4.f40471h0[3], frameMetrics.getMetric(4));
                }
                C4900o c4900o5 = (C4900o) this.f40467b;
                if ((c4900o5.f40470Z & 16) != 0) {
                    C4900o.y(c4900o5.f40471h0[4], frameMetrics.getMetric(5));
                }
                C4900o c4900o6 = (C4900o) this.f40467b;
                if ((c4900o6.f40470Z & 64) != 0) {
                    C4900o.y(c4900o6.f40471h0[6], frameMetrics.getMetric(7));
                }
                C4900o c4900o7 = (C4900o) this.f40467b;
                if ((c4900o7.f40470Z & 32) != 0) {
                    C4900o.y(c4900o7.f40471h0[5], frameMetrics.getMetric(6));
                }
                C4900o c4900o8 = (C4900o) this.f40467b;
                if ((c4900o8.f40470Z & 128) != 0) {
                    C4900o.y(c4900o8.f40471h0[7], frameMetrics.getMetric(0));
                }
                C4900o c4900o9 = (C4900o) this.f40467b;
                if ((c4900o9.f40470Z & 256) != 0) {
                    C4900o.y(c4900o9.f40471h0[8], frameMetrics.getMetric(2));
                    return;
                }
                return;
            default:
                AbstractC3557B.c0("window", window);
                AbstractC3557B.c0("frameMetrics", frameMetrics);
                ((w6.f) this.f40467b).f48056o0 = frameMetrics.getMetric(13);
                return;
        }
    }
}
