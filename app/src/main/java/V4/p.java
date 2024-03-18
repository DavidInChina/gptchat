package v4;

import android.os.Handler;
import android.os.Looper;
import g.RunnableC3111d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: e  reason: collision with root package name */
    public static final ExecutorService f47237e = Executors.newCachedThreadPool(new I4.c());

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f47238a = new LinkedHashSet(1);

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f47239b = new LinkedHashSet(1);

    /* renamed from: c  reason: collision with root package name */
    public final Handler f47240c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public volatile o f47241d = null;

    public p(C5971a c5971a) {
        e(new o(c5971a));
    }

    public final synchronized void a(n nVar) {
        Throwable th2;
        try {
            o oVar = this.f47241d;
            if (oVar != null && (th2 = oVar.f47236b) != null) {
                nVar.a(th2);
            }
            this.f47239b.add(nVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b(n nVar) {
        Object obj;
        try {
            o oVar = this.f47241d;
            if (oVar != null && (obj = oVar.f47235a) != null) {
                nVar.a(obj);
            }
            this.f47238a.add(nVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f47239b);
        if (arrayList.isEmpty()) {
            I4.b.b("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(th2);
        }
    }

    public final void d() {
        o oVar = this.f47241d;
        if (oVar == null) {
            return;
        }
        Object obj = oVar.f47235a;
        if (obj != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f47238a).iterator();
                while (it.hasNext()) {
                    ((n) it.next()).a(obj);
                }
            }
            return;
        }
        c(oVar.f47236b);
    }

    public final void e(o oVar) {
        if (this.f47241d == null) {
            this.f47241d = oVar;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                d();
                return;
            }
            this.f47240c.post(new RunnableC3111d(25, this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public p(Callable callable) {
        f47237e.execute(new o2.e(this, callable));
    }
}
