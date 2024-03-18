package Z1;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class F0 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f22830a = new AtomicBoolean(false);

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29 && f22830a.get()) {
            G0.f22833a.b("GlanceAppWidget::update", 0);
        }
    }
}
