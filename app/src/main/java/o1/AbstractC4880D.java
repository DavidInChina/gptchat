package o1;

import android.app.Notification;
import android.widget.RemoteViews;

/* renamed from: o1.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4880D {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
        return builder.setAllowGeneratedReplies(z10);
    }

    public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }

    public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }
}
