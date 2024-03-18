package O3;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* loaded from: classes2.dex */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i10, long j6, PendingIntent pendingIntent) {
        alarmManager.setExact(i10, j6, pendingIntent);
    }
}
