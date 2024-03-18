package papa;

import Hi.b;
import Hi.c;
import Ii.AbstractC0804i;
import Ii.v;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import com.pairip.StartupLauncher;
import id.AbstractC3557B;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lpapa/PerfAppComponentFactory;", "Landroid/app/AppComponentFactory;", "ei/l", "papa_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PerfAppComponentFactory extends AppComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AppComponentFactory f42870a = new AppComponentFactory();

    public static void a(String str) {
        if (!v.f8695g) {
            v.f8695g = true;
            AbstractC3557B.c0("componentName", str);
            AbstractC0804i.a();
            if (v.f8690b) {
                c cVar = v.f8691c;
                if (cVar != null) {
                    if (v.f8691c != null) {
                        SystemClock.uptimeMillis();
                        v.f8691c = c.a(cVar, null, null, null, null, new b(str), null, null, null, null, null, null, null, null, null, -1048577);
                        return;
                    }
                    AbstractC3557B.C2("appStartData");
                    throw null;
                }
                AbstractC3557B.C2("appStartData");
                throw null;
            }
        }
    }

    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        Activity instantiateActivity;
        AbstractC3557B.c0("cl", classLoader);
        AbstractC3557B.c0("className", str);
        a(str);
        instantiateActivity = this.f42870a.instantiateActivity(classLoader, str, intent);
        AbstractC3557B.b0("delegate.instantiateActi\u2026ty(cl, className, intent)", instantiateActivity);
        return instantiateActivity;
    }

    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        Application instantiateApplication;
        AbstractC3557B.c0("cl", classLoader);
        AbstractC3557B.c0("className", str);
        instantiateApplication = this.f42870a.instantiateApplication(classLoader, str);
        AbstractC3557B.b0("delegate.instantiateApplication(cl, className)", instantiateApplication);
        boolean z10 = v.f8689a;
        v.f8694f = Long.valueOf(SystemClock.uptimeMillis());
        return instantiateApplication;
    }

    public final ClassLoader instantiateClassLoader(ClassLoader classLoader, ApplicationInfo applicationInfo) {
        ClassLoader instantiateClassLoader;
        AbstractC3557B.c0("cl", classLoader);
        AbstractC3557B.c0("aInfo", applicationInfo);
        instantiateClassLoader = this.f42870a.instantiateClassLoader(classLoader, applicationInfo);
        AbstractC3557B.b0("delegate.instantiateClassLoader(cl, aInfo)", instantiateClassLoader);
        boolean z10 = v.f8689a;
        v.f8693e = Long.valueOf(SystemClock.uptimeMillis());
        return instantiateClassLoader;
    }

    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        ContentProvider instantiateProvider;
        AbstractC3557B.c0("cl", classLoader);
        AbstractC3557B.c0("className", str);
        instantiateProvider = this.f42870a.instantiateProvider(classLoader, str);
        AbstractC3557B.b0("delegate.instantiateProvider(cl, className)", instantiateProvider);
        return instantiateProvider;
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        BroadcastReceiver instantiateReceiver;
        AbstractC3557B.c0("cl", classLoader);
        AbstractC3557B.c0("className", str);
        a(str);
        instantiateReceiver = this.f42870a.instantiateReceiver(classLoader, str, intent);
        AbstractC3557B.b0("delegate.instantiateRece\u2026er(cl, className, intent)", instantiateReceiver);
        return instantiateReceiver;
    }

    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        Service instantiateService;
        AbstractC3557B.c0("cl", classLoader);
        AbstractC3557B.c0("className", str);
        a(str);
        instantiateService = this.f42870a.instantiateService(classLoader, str, intent);
        AbstractC3557B.b0("delegate.instantiateService(cl, className, intent)", instantiateService);
        return instantiateService;
    }

    static {
        StartupLauncher.launch();
        boolean z10 = v.f8689a;
    }
}
