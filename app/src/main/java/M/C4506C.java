package m;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.PowerManager;
import android.util.Log;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.Calendar;

/* renamed from: m.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4506C extends AbstractC4508E {

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f38587h0 = 1;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ LayoutInflater$Factory2C4511H f38588i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Object f38589j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4506C(LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H, U3.u uVar) {
        super(layoutInflater$Factory2C4511H);
        this.f38588i0 = layoutInflater$Factory2C4511H;
        this.f38589j0 = uVar;
    }

    @Override // m.AbstractC4508E
    public final IntentFilter d() {
        switch (this.f38587h0) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
        if (r1 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
        if (r1 < 22) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return 1;
     */
    /* JADX WARN: Type inference failed for: r6v9, types: [m.S, java.lang.Object] */
    @Override // m.AbstractC4508E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e() {
        boolean z10;
        Location location;
        boolean z11;
        long j6;
        int i10 = this.f38587h0;
        Object obj = this.f38589j0;
        switch (i10) {
            case 0:
                if (!((PowerManager) obj).isPowerSaveMode()) {
                    return 1;
                }
                return 2;
            default:
                U3.u uVar = (U3.u) obj;
                T t10 = (T) uVar.f17494i0;
                if (t10.f38693b > System.currentTimeMillis()) {
                    z10 = t10.f38692a;
                    break;
                } else {
                    Location location2 = null;
                    if (Ng.H.n((Context) uVar.f17492Z, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        location = uVar.y("network");
                    } else {
                        location = null;
                    }
                    if (Ng.H.n((Context) uVar.f17492Z, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        location2 = uVar.y("gps");
                    }
                    if (location2 == null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                        location = location2;
                    }
                    if (location != null) {
                        T t11 = (T) uVar.f17494i0;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (S.f38688d == null) {
                            S.f38688d = new Object();
                        }
                        S s10 = S.f38688d;
                        s10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        s10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        if (s10.f38691c == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        long j10 = s10.f38690b;
                        long j11 = s10.f38689a;
                        s10.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j12 = s10.f38690b;
                        if (j10 != -1 && j11 != -1) {
                            if (currentTimeMillis > j11) {
                                j10 = j12;
                            } else if (currentTimeMillis > j10) {
                                j10 = j11;
                            }
                            j6 = j10 + StatsigLoggerKt.FLUSH_TIMER_MS;
                        } else {
                            j6 = 43200000 + currentTimeMillis;
                        }
                        t11.f38692a = z11;
                        t11.f38693b = j6;
                        z10 = t10.f38692a;
                        break;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i11 = Calendar.getInstance().get(11);
                        if (i11 >= 6) {
                            break;
                        }
                        return 2;
                    }
                }
        }
    }

    @Override // m.AbstractC4508E
    public final void i() {
        int i10 = this.f38587h0;
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = this.f38588i0;
        switch (i10) {
            case 0:
                layoutInflater$Factory2C4511H.m(true, true);
                return;
            default:
                layoutInflater$Factory2C4511H.m(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4506C(LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H, Context context) {
        super(layoutInflater$Factory2C4511H);
        this.f38588i0 = layoutInflater$Factory2C4511H;
        this.f38589j0 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
