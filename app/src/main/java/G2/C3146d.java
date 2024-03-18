package g2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.pairip.VMRunner;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;
import wf.AbstractC6216a;

/* renamed from: g2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3146d extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static final List f31079b;

    /* renamed from: c  reason: collision with root package name */
    public static final IntentFilter f31080c;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6216a f31081a;

    static {
        List<String> G02 = AbstractC4344b.G0("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        f31079b = G02;
        IntentFilter intentFilter = new IntentFilter();
        for (String str : G02) {
            intentFilter.addAction(str);
        }
        f31080c = intentFilter;
    }

    public C3146d(C3148f c3148f) {
        this.f31081a = c3148f;
    }

    public final void a(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        Object systemService = context.getSystemService("power");
        AbstractC3557B.a0("null cannot be cast to non-null type android.os.PowerManager", systemService);
        PowerManager powerManager = (PowerManager) systemService;
        boolean a5 = C3143a.f31072a.a(powerManager);
        if (i10 >= 33) {
            if (!a5 && !C3144b.f31073a.a(powerManager)) {
                return;
            }
        } else if (!a5) {
            return;
        }
        this.f31081a.mo122invoke();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("p0e6KGm9Dm2GgEK4", new Object[]{this, context, intent});
    }
}
