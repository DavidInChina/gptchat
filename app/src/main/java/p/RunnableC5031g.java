package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;

/* renamed from: p.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5031g implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41556Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f41557Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f41558h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f41559i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f41560j0;

    public /* synthetic */ RunnableC5031g(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f41556Y = i10;
        this.f41560j0 = obj;
        this.f41557Z = obj2;
        this.f41558h0 = obj3;
        this.f41559i0 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f41556Y;
        Object obj = this.f41557Z;
        Object obj2 = this.f41558h0;
        Object obj3 = this.f41559i0;
        switch (i10) {
            case 0:
                C5032h c5032h = (C5032h) obj;
                if (c5032h != null) {
                    J0.a aVar = (J0.a) this.f41560j0;
                    ((View$OnKeyListenerC5033i) aVar.f8729Y).f41569F0 = true;
                    c5032h.f41562b.c(false);
                    ((View$OnKeyListenerC5033i) aVar.f8729Y).f41569F0 = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((o) obj3).q(menuItem, null, 4);
                    return;
                }
                return;
            default:
                try {
                    boolean booleanExtra = ((Intent) obj).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) obj).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) obj).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) obj).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    L3.s.d().a(ConstraintProxyUpdateReceiver.f25532a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    V3.l.a((Context) obj2, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    V3.l.a((Context) obj2, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    V3.l.a((Context) obj2, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    V3.l.a((Context) obj2, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) obj3).finish();
                }
        }
    }
}
