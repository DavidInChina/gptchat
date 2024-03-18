package o1;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final NotificationManager f40446a;

    static {
        new HashSet();
    }

    public M(Context context) {
        this.f40446a = (NotificationManager) context.getSystemService("notification");
    }
}
