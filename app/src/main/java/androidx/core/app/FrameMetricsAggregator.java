package androidx.core.app;

import a1.C1915c;
import android.os.Build;
import o1.C4900o;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a  reason: collision with root package name */
    public final C1915c f24909a;

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f24909a = new C4900o(i10);
        } else {
            this.f24909a = new C1915c(1);
        }
    }
}
