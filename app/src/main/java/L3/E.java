package L3;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10683a = s.f("WorkerFactory");

    public static r a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f10683a;
        r rVar = null;
        try {
            cls = Class.forName(str).asSubclass(r.class);
        } catch (Throwable th2) {
            s d10 = s.d();
            d10.c(str2, "Invalid class: " + str, th2);
            cls = null;
        }
        if (cls != null) {
            try {
                rVar = (r) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th3) {
                s d11 = s.d();
                d11.c(str2, "Could not instantiate " + str, th3);
            }
        }
        if (rVar != null && rVar.f10728i0) {
            String name = E.class.getName();
            throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        }
        return rVar;
    }
}
