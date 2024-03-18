package L5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class a extends BroadcastReceiver {

    /* renamed from: Y  reason: collision with root package name */
    public final AtomicBoolean f10744Y = new AtomicBoolean(false);

    public final Intent b(Context context, IntentFilter intentFilter) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 33) {
            intent = context.registerReceiver(this, intentFilter, 4);
        } else {
            intent = context.registerReceiver(this, intentFilter);
        }
        this.f10744Y.set(true);
        return intent;
    }
}
