package p1;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: p1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5040e {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        if ((i10 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, AbstractC5042g.c(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
