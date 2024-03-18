package r3;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class n extends l {

    /* renamed from: t  reason: collision with root package name */
    public static Handler f44416t;

    /* renamed from: n  reason: collision with root package name */
    public final Window f44417n;

    /* renamed from: o  reason: collision with root package name */
    public long f44418o;

    /* renamed from: p  reason: collision with root package name */
    public long f44419p;

    /* renamed from: q  reason: collision with root package name */
    public long f44420q;

    /* renamed from: r  reason: collision with root package name */
    public final C5363f f44421r = new C5363f(this.f44410k);

    /* renamed from: s  reason: collision with root package name */
    public final m f44422s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, View view, Window window) {
        super(iVar, view);
        AbstractC3557B.c0("jankStats", iVar);
        this.f44417n = window;
        this.f44422s = new m(this, 0, iVar);
    }

    public static Window$OnFrameMetricsAvailableListenerC5358a V2(Window window) {
        Window$OnFrameMetricsAvailableListenerC5358a window$OnFrameMetricsAvailableListenerC5358a = (Window$OnFrameMetricsAvailableListenerC5358a) window.getDecorView().getTag(R.id.metricsDelegator);
        if (window$OnFrameMetricsAvailableListenerC5358a == null) {
            Window$OnFrameMetricsAvailableListenerC5358a window$OnFrameMetricsAvailableListenerC5358a2 = new Window$OnFrameMetricsAvailableListenerC5358a(new ArrayList());
            if (f44416t == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                handlerThread.start();
                f44416t = new Handler(handlerThread.getLooper());
            }
            window.addOnFrameMetricsAvailableListener(window$OnFrameMetricsAvailableListenerC5358a2, f44416t);
            window.getDecorView().setTag(R.id.metricsDelegator, window$OnFrameMetricsAvailableListenerC5358a2);
            return window$OnFrameMetricsAvailableListenerC5358a2;
        }
        return window$OnFrameMetricsAvailableListenerC5358a;
    }

    public static void W2(m mVar, Window window) {
        Window$OnFrameMetricsAvailableListenerC5358a window$OnFrameMetricsAvailableListenerC5358a = (Window$OnFrameMetricsAvailableListenerC5358a) window.getDecorView().getTag(R.id.metricsDelegator);
        if (window$OnFrameMetricsAvailableListenerC5358a != null) {
            AbstractC3557B.c0("delegate", mVar);
            synchronized (window$OnFrameMetricsAvailableListenerC5358a) {
                try {
                    if (window$OnFrameMetricsAvailableListenerC5358a.f44379b) {
                        window$OnFrameMetricsAvailableListenerC5358a.f44381d.add(mVar);
                    } else {
                        boolean z10 = !window$OnFrameMetricsAvailableListenerC5358a.f44378a.isEmpty();
                        window$OnFrameMetricsAvailableListenerC5358a.f44378a.remove(mVar);
                        if (z10 && window$OnFrameMetricsAvailableListenerC5358a.f44378a.isEmpty()) {
                            window.removeOnFrameMetricsAvailableListener(window$OnFrameMetricsAvailableListenerC5358a);
                            window.getDecorView().setTag(R.id.metricsDelegator, null);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // r3.k
    public final void R2(boolean z10) {
        synchronized (this.f44417n) {
            try {
                if (z10) {
                    if (this.f44419p == 0) {
                        V2(this.f44417n).a(this.f44422s);
                        this.f44419p = System.nanoTime();
                    }
                } else {
                    W2(this.f44422s, this.f44417n);
                    this.f44419p = 0L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long S2(FrameMetrics frameMetrics) {
        AbstractC3557B.c0("metrics", frameMetrics);
        Field field = AbstractViewTreeObserver$OnPreDrawListenerC5361d.f44386m0;
        return P5.c.C((View) this.f44407h.get());
    }

    public C5363f T2(long j6, long j10, FrameMetrics frameMetrics) {
        AbstractC3557B.c0("frameMetrics", frameMetrics);
        boolean z10 = false;
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j11 = j6 + metric;
        this.f44420q = j11;
        r rVar = this.f44409j.f44424a;
        if (rVar != null) {
            rVar.c(j6, j11, this.f44410k);
        }
        if (metric > j10) {
            z10 = true;
        }
        long metric2 = frameMetrics.getMetric(8);
        C5363f c5363f = this.f44421r;
        c5363f.f44395b = j6;
        c5363f.f44396c = metric;
        c5363f.f44397d = z10;
        c5363f.f44398e = metric2;
        return c5363f;
    }

    public long U2(FrameMetrics frameMetrics) {
        AbstractC3557B.c0("frameMetrics", frameMetrics);
        Object obj = AbstractViewTreeObserver$OnPreDrawListenerC5361d.f44386m0.get(this.f44408i);
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Long", obj);
        return ((Long) obj).longValue();
    }
}
