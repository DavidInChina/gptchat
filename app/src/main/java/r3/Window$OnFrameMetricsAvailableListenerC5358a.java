package r3;

import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: r3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class Window$OnFrameMetricsAvailableListenerC5358a implements Window$OnFrameMetricsAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final List f44378a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f44379b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f44380c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f44381d = new ArrayList();

    public Window$OnFrameMetricsAvailableListenerC5358a(ArrayList arrayList) {
        this.f44378a = arrayList;
    }

    public final void a(m mVar) {
        AbstractC3557B.c0("delegate", mVar);
        synchronized (this) {
            try {
                if (this.f44379b) {
                    this.f44380c.add(mVar);
                } else {
                    this.f44378a.add(mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        View decorView;
        synchronized (this) {
            try {
                this.f44379b = true;
                for (Object obj : this.f44378a) {
                    livekit.org.webrtc.audio.a.l(obj).onFrameMetricsAvailable(window, frameMetrics, i10);
                }
                if (!this.f44380c.isEmpty()) {
                    Iterator it = this.f44380c.iterator();
                    while (it.hasNext()) {
                        this.f44378a.add(livekit.org.webrtc.audio.a.l(it.next()));
                    }
                    this.f44380c.clear();
                }
                if (!this.f44381d.isEmpty()) {
                    boolean z10 = !this.f44378a.isEmpty();
                    Iterator it2 = this.f44381d.iterator();
                    while (it2.hasNext()) {
                        this.f44378a.remove(livekit.org.webrtc.audio.a.l(it2.next()));
                    }
                    this.f44381d.clear();
                    if (z10 && this.f44378a.isEmpty()) {
                        if (window != null) {
                            window.removeOnFrameMetricsAvailableListener(livekit.org.webrtc.audio.a.l(this));
                        }
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            decorView.setTag(R.id.metricsDelegator, null);
                        }
                    }
                }
                this.f44379b = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            AbstractC3557B.b0("window.decorView", decorView2);
            ViewParent parent = decorView2.getParent();
            while (parent instanceof View) {
                decorView2 = (View) parent;
                parent = decorView2.getParent();
            }
            Object tag = decorView2.getTag(R.id.metricsStateHolder);
            if (tag == null) {
                tag = new Object();
                decorView2.setTag(R.id.metricsStateHolder, tag);
            }
            r rVar = ((q) tag).f44424a;
            if (rVar != null) {
                rVar.b();
            }
        }
    }
}
