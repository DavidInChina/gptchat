package N3;

import M3.C0934c;
import M3.D;
import M3.w;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import m.RunnableC4517N;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final C0934c f12705a;

    /* renamed from: b  reason: collision with root package name */
    public final D f12706b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12707c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12708d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f12709e = new LinkedHashMap();

    public d(C0934c c0934c, D d10) {
        AbstractC3557B.c0("runnableScheduler", c0934c);
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f12705a = c0934c;
        this.f12706b = d10;
        this.f12707c = millis;
    }

    public final void a(w wVar) {
        Runnable runnable;
        AbstractC3557B.c0("token", wVar);
        synchronized (this.f12708d) {
            runnable = (Runnable) this.f12709e.remove(wVar);
        }
        if (runnable != null) {
            this.f12705a.f11565a.removeCallbacks(runnable);
        }
    }

    public final void b(w wVar) {
        RunnableC4517N runnableC4517N = new RunnableC4517N(this, 21, wVar);
        synchronized (this.f12708d) {
            Runnable runnable = (Runnable) this.f12709e.put(wVar, runnableC4517N);
        }
        C0934c c0934c = this.f12705a;
        c0934c.f11565a.postDelayed(runnableC4517N, this.f12707c);
    }
}
