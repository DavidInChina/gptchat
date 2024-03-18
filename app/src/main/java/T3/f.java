package T3;

import android.app.Notification;
import android.app.Service;

/* loaded from: classes2.dex */
public abstract class f {
    public static void a(Service service, int i10, Notification notification, int i11) {
        service.startForeground(i10, notification, i11);
    }
}
