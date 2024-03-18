package T3;

import L3.s;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;
import io.sentry.android.core.AbstractC3612c;

/* loaded from: classes2.dex */
public abstract class g {
    public static void a(Service service, int i10, Notification notification, int i11) {
        try {
            service.startForeground(i10, notification, i11);
        } catch (ForegroundServiceStartNotAllowedException e10) {
            s d10 = s.d();
            String str = SystemForegroundService.f25543k0;
            if (d10.f10731a <= 5) {
                AbstractC3612c.s(str, "Unable to start foreground service", e10);
            }
        }
    }
}
