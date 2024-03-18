package A7;

import android.content.Context;
import t7.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f728b;

    /* renamed from: a  reason: collision with root package name */
    public j f729a;

    /* JADX WARN: Type inference failed for: r0v0, types: [A7.c, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f729a = null;
        f728b = obj;
    }

    public static j a(Context context) {
        j jVar;
        c cVar = f728b;
        synchronized (cVar) {
            try {
                if (cVar.f729a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f729a = new j(context, 3);
                }
                jVar = cVar.f729a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
