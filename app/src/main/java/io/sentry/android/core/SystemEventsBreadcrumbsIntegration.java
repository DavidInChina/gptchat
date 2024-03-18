package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class SystemEventsBreadcrumbsIntegration implements X, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f34039Y;

    /* renamed from: Z  reason: collision with root package name */
    public v7.w f34040Z;

    /* renamed from: h0  reason: collision with root package name */
    public SentryAndroidOptions f34041h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f34042i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f34043j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f34044k0 = new Object();

    public SystemEventsBreadcrumbsIntegration(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.appwidget.action.APPWIDGET_DELETED");
        arrayList.add("android.appwidget.action.APPWIDGET_DISABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_ENABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_HOST_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
        arrayList.add("android.intent.action.ACTION_POWER_CONNECTED");
        arrayList.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        arrayList.add("android.intent.action.ACTION_SHUTDOWN");
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        arrayList.add("android.intent.action.BATTERY_LOW");
        arrayList.add("android.intent.action.BATTERY_OKAY");
        arrayList.add("android.intent.action.BOOT_COMPLETED");
        arrayList.add("android.intent.action.CAMERA_BUTTON");
        arrayList.add("android.intent.action.CONFIGURATION_CHANGED");
        arrayList.add("android.intent.action.CONTENT_CHANGED");
        arrayList.add("android.intent.action.DATE_CHANGED");
        arrayList.add("android.intent.action.DEVICE_STORAGE_LOW");
        arrayList.add("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add("android.intent.action.DOCK_EVENT");
        arrayList.add("android.intent.action.DREAMING_STARTED");
        arrayList.add("android.intent.action.DREAMING_STOPPED");
        arrayList.add("android.intent.action.INPUT_METHOD_CHANGED");
        arrayList.add("android.intent.action.LOCALE_CHANGED");
        arrayList.add("android.intent.action.REBOOT");
        arrayList.add("android.intent.action.SCREEN_OFF");
        arrayList.add("android.intent.action.SCREEN_ON");
        arrayList.add("android.intent.action.TIMEZONE_CHANGED");
        arrayList.add("android.intent.action.TIME_SET");
        arrayList.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        arrayList.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        arrayList.add("android.intent.action.APP_ERROR");
        arrayList.add("android.intent.action.BUG_REPORT");
        arrayList.add("android.intent.action.MEDIA_BAD_REMOVAL");
        arrayList.add("android.intent.action.MEDIA_MOUNTED");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTABLE");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTED");
        this.f34039Y = context;
        this.f34042i0 = arrayList;
    }

    public final void a(io.sentry.G g10, SentryAndroidOptions sentryAndroidOptions) {
        this.f34040Z = new v7.w(g10, sentryAndroidOptions.getLogger());
        IntentFilter intentFilter = new IntentFilter();
        for (String str : this.f34042i0) {
            intentFilter.addAction(str);
        }
        try {
            Context context = this.f34039Y;
            v7.w wVar = this.f34040Z;
            Ad.l.Z0("The ILogger object is required.", sentryAndroidOptions.getLogger());
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(wVar, intentFilter, 2);
            } else {
                context.registerReceiver(wVar, intentFilter);
            }
            sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
            r.f.e(SystemEventsBreadcrumbsIntegration.class);
        } catch (Throwable th2) {
            sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
            sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f34044k0) {
            this.f34043j0 = true;
        }
        v7.w wVar = this.f34040Z;
        if (wVar != null) {
            this.f34039Y.unregisterReceiver(wVar);
            this.f34040Z = null;
            SentryAndroidOptions sentryAndroidOptions = this.f34041h0;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        SentryAndroidOptions sentryAndroidOptions;
        if (r1Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) r1Var;
        } else {
            sentryAndroidOptions = null;
        }
        Ad.l.Z0("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f34041h0 = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f34041h0.isEnableSystemEventBreadcrumbs()));
        if (this.f34041h0.isEnableSystemEventBreadcrumbs()) {
            try {
                r1Var.getExecutorService().submit(new Q(this, r1Var, 4));
            } catch (Throwable th2) {
                r1Var.getLogger().d(EnumC3642e1.DEBUG, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", th2);
            }
        }
    }
}
