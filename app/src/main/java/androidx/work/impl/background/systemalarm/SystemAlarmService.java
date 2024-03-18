package androidx.work.impl.background.systemalarm;

import L3.s;
import O3.i;
import O3.j;
import V3.p;
import V3.q;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC2089y;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC2089y implements i {

    /* renamed from: i0  reason: collision with root package name */
    public static final String f25534i0 = s.f("SystemAlarmService");

    /* renamed from: Z  reason: collision with root package name */
    public j f25535Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f25536h0;

    public final void b() {
        this.f25536h0 = true;
        s.d().a(f25534i0, "All commands completed in dispatcher");
        String str = p.f18364a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (q.f18365a) {
            linkedHashMap.putAll(q.f18366b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                s d10 = s.d();
                String str3 = p.f18364a;
                d10.g(str3, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC2089y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        j jVar = new j(this);
        this.f25535Z = jVar;
        if (jVar.f13384n0 != null) {
            s.d().b(j.f13375p0, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            jVar.f13384n0 = this;
        }
        this.f25536h0 = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC2089y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f25536h0 = true;
        j jVar = this.f25535Z;
        jVar.getClass();
        s.d().a(j.f13375p0, "Destroying SystemAlarmDispatcher");
        jVar.f13379i0.h(jVar);
        jVar.f13384n0 = null;
    }

    @Override // androidx.lifecycle.AbstractServiceC2089y, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f25536h0) {
            s.d().e(f25534i0, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            j jVar = this.f25535Z;
            jVar.getClass();
            s d10 = s.d();
            String str = j.f13375p0;
            d10.a(str, "Destroying SystemAlarmDispatcher");
            jVar.f13379i0.h(jVar);
            jVar.f13384n0 = null;
            j jVar2 = new j(this);
            this.f25535Z = jVar2;
            if (jVar2.f13384n0 != null) {
                s.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                jVar2.f13384n0 = this;
            }
            this.f25536h0 = false;
        }
        if (intent != null) {
            this.f25535Z.b(intent, i11);
            return 3;
        }
        return 3;
    }
}
