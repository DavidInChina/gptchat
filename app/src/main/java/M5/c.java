package M5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.pairip.VMRunner;
import id.AbstractC3557B;
import java.util.Set;
import p5.AbstractC5091c;

/* loaded from: classes.dex */
public final class c extends L5.a implements j {

    /* renamed from: i0  reason: collision with root package name */
    public static final Set f11619i0 = R4.b.X1(h.f11642Z, h.f11645j0);

    /* renamed from: j0  reason: collision with root package name */
    public static final Set f11620j0 = R4.b.X1(1, 4, 2);

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5091c f11621Z;

    /* renamed from: h0  reason: collision with root package name */
    public i f11622h0 = new i();

    public c(AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f11621Z = abstractC5091c;
    }

    public final void F(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        Intent b10 = b(context, intentFilter);
        if (b10 != null) {
            onReceive(context, b10);
        }
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        Intent b11 = b(context, intentFilter2);
        if (b11 != null) {
            onReceive(context, b11);
        }
    }

    @Override // M5.j
    public final void a(Context context) {
        if (this.f10744Y.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }

    @Override // M5.j
    public final i l() {
        return this.f11622h0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("NWyOb2o2npEumdaw", new Object[]{this, context, intent});
    }
}
