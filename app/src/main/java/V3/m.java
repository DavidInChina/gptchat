package V3;

import L3.C0889a;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import id.AbstractC3557B;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18355a;

    static {
        String f6 = L3.s.f("ProcessUtils");
        AbstractC3557B.b0("tagWithPrefix(\"ProcessUtils\")", f6);
        f18355a = f6;
    }

    public static final boolean a(Context context, C0889a c0889a) {
        String str;
        Object obj;
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("configuration", c0889a);
        if (Build.VERSION.SDK_INT >= 28) {
            str = a.f18332a.a();
        } else {
            str = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, r.f.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                AbstractC3557B.Z(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th2) {
                if (L3.s.d().f10731a <= 3) {
                    Log.d(f18355a, "Unable to check ActivityThread for processName", th2);
                }
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            AbstractC3557B.a0("null cannot be cast to non-null type android.app.ActivityManager", systemService);
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
        }
        return AbstractC3557B.K(str, context.getApplicationInfo().processName);
    }
}
