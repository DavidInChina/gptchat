package W1;

import V1.AbstractComponentCallbacksC1480v;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import id.AbstractC3557B;
import java.util.Set;
import kf.t;
import m.RunnableC4517N;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f20682a = b.f20679c;

    public static b a(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        while (abstractComponentCallbacksC1480v != null) {
            if (abstractComponentCallbacksC1480v.s()) {
                abstractComponentCallbacksC1480v.o();
            }
            abstractComponentCallbacksC1480v = abstractComponentCallbacksC1480v.f18305z0;
        }
        return f20682a;
    }

    public static void b(b bVar, e eVar) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = eVar.f20683Y;
        String name = abstractComponentCallbacksC1480v.getClass().getName();
        a aVar = a.f20672Y;
        Set set = bVar.f20680a;
        if (set.contains(aVar)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), eVar);
        }
        if (set.contains(a.f20673Z)) {
            RunnableC4517N runnableC4517N = new RunnableC4517N(name, 5, eVar);
            if (abstractComponentCallbacksC1480v.s()) {
                Handler handler = abstractComponentCallbacksC1480v.o().f18064u.f18310h0;
                AbstractC3557B.b0("fragment.parentFragmentManager.host.handler", handler);
                if (AbstractC3557B.K(handler.getLooper(), Looper.myLooper())) {
                    runnableC4517N.run();
                    return;
                } else {
                    handler.post(runnableC4517N);
                    return;
                }
            }
            runnableC4517N.run();
        }
    }

    public static void c(e eVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(eVar.f20683Y.getClass().getName()), eVar);
        }
    }

    public static final void d(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v, String str) {
        AbstractC3557B.c0("fragment", abstractComponentCallbacksC1480v);
        AbstractC3557B.c0("previousFragmentId", str);
        e eVar = new e(abstractComponentCallbacksC1480v, "Attempting to reuse fragment " + abstractComponentCallbacksC1480v + " with previous ID " + str);
        c(eVar);
        b a5 = a(abstractComponentCallbacksC1480v);
        if (a5.f20680a.contains(a.f20674h0) && e(a5, abstractComponentCallbacksC1480v.getClass(), d.class)) {
            b(a5, eVar);
        }
    }

    public static boolean e(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f20681b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!AbstractC3557B.K(cls2.getSuperclass(), e.class) && t.X1(set, cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
