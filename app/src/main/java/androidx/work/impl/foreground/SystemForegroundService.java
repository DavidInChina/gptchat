package androidx.work.impl.foreground;

import L3.s;
import M3.F;
import T3.b;
import T3.c;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC2089y;
import java.util.UUID;
import q.RunnableC5216j;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC2089y implements b {

    /* renamed from: k0  reason: collision with root package name */
    public static final String f25543k0 = s.f("SystemFgService");

    /* renamed from: Z  reason: collision with root package name */
    public Handler f25544Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f25545h0;

    /* renamed from: i0  reason: collision with root package name */
    public c f25546i0;

    /* renamed from: j0  reason: collision with root package name */
    public NotificationManager f25547j0;

    public final void b() {
        this.f25544Z = new Handler(Looper.getMainLooper());
        this.f25547j0 = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f25546i0 = cVar;
        if (cVar.f16900n0 != null) {
            s.d().b(c.f16891o0, "A callback already exists.");
        } else {
            cVar.f16900n0 = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC2089y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
    }

    @Override // androidx.lifecycle.AbstractServiceC2089y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f25546i0.f();
    }

    @Override // androidx.lifecycle.AbstractServiceC2089y, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z10 = this.f25545h0;
        String str = f25543k0;
        if (z10) {
            s.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f25546i0.f();
            b();
            this.f25545h0 = false;
        }
        if (intent != null) {
            c cVar = this.f25546i0;
            cVar.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = c.f16891o0;
            if (equals) {
                s d10 = s.d();
                d10.e(str2, "Started foreground service " + intent);
                cVar.f16893Z.a(new RunnableC5216j(cVar, 11, intent.getStringExtra("KEY_WORKSPEC_ID")));
                cVar.d(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                cVar.d(intent);
                return 3;
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                s d11 = s.d();
                d11.e(str2, "Stopping foreground work for " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID fromString = UUID.fromString(stringExtra);
                    F f6 = cVar.f16892Y;
                    f6.getClass();
                    f6.f11520i.a(new V3.b(f6, fromString, 0));
                    return 3;
                }
                return 3;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                s.d().e(str2, "Stopping foreground service");
                b bVar = cVar.f16900n0;
                if (bVar != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
                    systemForegroundService.f25545h0 = true;
                    s.d().a(str, "All commands completed.");
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            } else {
                return 3;
            }
        }
        return 3;
    }
}
