package o1;

import android.app.Notification;
import android.content.LocusId;

/* renamed from: o1.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4883G {
    public static Notification.Builder a(Notification.Builder builder, boolean z10) {
        return builder.setAllowSystemGeneratedContextualActions(z10);
    }

    public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
        return builder.setContextual(z10);
    }

    public static Notification.Builder d(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }
}
