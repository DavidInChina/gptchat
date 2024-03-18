package r3;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public class o extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, View view, Window window) {
        super(iVar, view, window);
        AbstractC3557B.c0("jankStats", iVar);
    }

    @Override // r3.n
    public final long U2(FrameMetrics frameMetrics) {
        AbstractC3557B.c0("frameMetrics", frameMetrics);
        return frameMetrics.getMetric(10);
    }
}
