package V3;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.PowerManager;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18364a;

    static {
        String f6 = L3.s.f("WakeLocks");
        AbstractC3557B.b0("tagWithPrefix(\"WakeLocks\")", f6);
        f18364a = f6;
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0(ParameterNames.TAG, str);
        Object systemService = context.getApplicationContext().getSystemService("power");
        AbstractC3557B.a0("null cannot be cast to non-null type android.os.PowerManager", systemService);
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (q.f18365a) {
            String str2 = (String) q.f18366b.put(newWakeLock, concat);
        }
        AbstractC3557B.b0("wakeLock", newWakeLock);
        return newWakeLock;
    }
}
