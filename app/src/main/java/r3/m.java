package r3;

import android.os.Build;
import android.view.Choreographer;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import id.AbstractC3557B;
import io.sentry.android.core.B;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Window$OnFrameMetricsAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f44413a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f44414b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f44415c;

    public /* synthetic */ m(Object obj, int i10, Object obj2) {
        this.f44413a = i10;
        this.f44414b = obj;
        this.f44415c = obj2;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        float f6;
        long metric;
        long metric2;
        long metric3;
        long metric4;
        long metric5;
        long metric6;
        long j6;
        boolean z10;
        boolean z11;
        Field field;
        Display display;
        switch (this.f44413a) {
            case 0:
                n nVar = (n) this.f44414b;
                i iVar = (i) this.f44415c;
                AbstractC3557B.c0("this$0", nVar);
                AbstractC3557B.c0("$jankStats", iVar);
                AbstractC3557B.b0("frameMetrics", frameMetrics);
                long max = Math.max(nVar.U2(frameMetrics), nVar.f44420q);
                if (max >= nVar.f44419p && max != nVar.f44418o) {
                    iVar.a(nVar.T2(max, ((float) nVar.S2(frameMetrics)) * iVar.f44404d, frameMetrics));
                    nVar.f44418o = max;
                    return;
                }
                return;
            default:
                io.sentry.android.core.internal.util.k kVar = (io.sentry.android.core.internal.util.k) this.f44414b;
                int i11 = io.sentry.android.core.internal.util.k.f34181u0;
                kVar.getClass();
                long nanoTime = System.nanoTime();
                ((B) this.f44415c).getClass();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    display = window.getContext().getDisplay();
                    f6 = display.getRefreshRate();
                } else {
                    f6 = window.getWindowManager().getDefaultDisplay().getRefreshRate();
                }
                float f10 = (float) io.sentry.android.core.internal.util.k.f34179s0;
                metric = frameMetrics.getMetric(0);
                metric2 = frameMetrics.getMetric(1);
                long j10 = metric2 + metric;
                metric3 = frameMetrics.getMetric(2);
                long j11 = metric3 + j10;
                metric4 = frameMetrics.getMetric(3);
                long j12 = metric4 + j11;
                metric5 = frameMetrics.getMetric(4);
                long j13 = metric5 + j12;
                metric6 = frameMetrics.getMetric(5);
                long j14 = metric6 + j13;
                long max2 = Math.max(0L, j14 - (f10 / f6));
                kVar.f34182Y.getClass();
                if (i12 >= 26) {
                    j6 = frameMetrics.getMetric(10);
                } else {
                    Choreographer choreographer = kVar.f34191o0;
                    if (choreographer != null && (field = kVar.f34192p0) != null) {
                        try {
                            Long l10 = (Long) field.get(choreographer);
                            if (l10 != null) {
                                j6 = l10.longValue();
                            }
                        } catch (IllegalAccessException unused) {
                        }
                    }
                    j6 = -1;
                }
                if (j6 < 0) {
                    j6 = nanoTime - j14;
                }
                long max3 = Math.max(j6, kVar.f34194r0);
                if (max3 != kVar.f34193q0) {
                    kVar.f34193q0 = max3;
                    kVar.f34194r0 = max3 + j14;
                    if (j14 > f10 / (f6 - 1.0f)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && j14 > io.sentry.android.core.internal.util.k.f34180t0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    for (io.sentry.android.core.internal.util.j jVar : kVar.f34187k0.values()) {
                        jVar.b(max3, kVar.f34194r0, j14, max2, z10, z11, f6);
                    }
                    return;
                }
                return;
        }
    }
}
