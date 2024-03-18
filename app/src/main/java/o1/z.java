package o1;

import android.app.Notification;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class z {
    public static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
        return builder.setExtras(bundle);
    }
}
