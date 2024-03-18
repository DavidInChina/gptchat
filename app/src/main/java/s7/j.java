package s7;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static j f45438b;

    /* renamed from: a  reason: collision with root package name */
    public final C5581b f45439a;

    public j(Context context) {
        C5581b a5 = C5581b.a(context);
        this.f45439a = a5;
        a5.b();
        a5.c();
    }

    public static synchronized j a(Context context) {
        j c10;
        synchronized (j.class) {
            c10 = c(context.getApplicationContext());
        }
        return c10;
    }

    public static synchronized j c(Context context) {
        synchronized (j.class) {
            j jVar = f45438b;
            if (jVar != null) {
                return jVar;
            }
            j jVar2 = new j(context);
            f45438b = jVar2;
            return jVar2;
        }
    }

    public final synchronized void b() {
        C5581b c5581b = this.f45439a;
        ReentrantLock reentrantLock = c5581b.f45426a;
        reentrantLock.lock();
        c5581b.f45427b.edit().clear().apply();
        reentrantLock.unlock();
    }
}
