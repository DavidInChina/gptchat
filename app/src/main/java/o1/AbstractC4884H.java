package o1;

import android.app.Notification;

/* renamed from: o1.H  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4884H {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
        return builder.setAuthenticationRequired(z10);
    }

    public static Notification.Builder b(Notification.Builder builder, int i10) {
        return builder.setForegroundServiceBehavior(i10);
    }
}
