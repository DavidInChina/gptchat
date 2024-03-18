package s7;

import android.content.Context;
import java.util.Iterator;
import s2.s;
import v7.C5987e;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final s f45437a = new s("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        j.a(context).b();
        Iterator it = u7.j.a().iterator();
        if (!it.hasNext()) {
            synchronized (C5987e.f47299v0) {
                try {
                    C5987e c5987e = C5987e.f47300w0;
                    if (c5987e != null) {
                        c5987e.f47309n0.incrementAndGet();
                        H7.d dVar = c5987e.f47313r0;
                        dVar.sendMessageAtFrontOfQueue(dVar.obtainMessage(10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        ((u7.j) it.next()).getClass();
        throw new UnsupportedOperationException();
    }
}
