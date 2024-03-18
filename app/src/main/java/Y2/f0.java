package y2;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import s2.AbstractC5532b;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f50580a;

    /* renamed from: b  reason: collision with root package name */
    public final C6510M f50581b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5532b f50582c;

    /* renamed from: d  reason: collision with root package name */
    public int f50583d;

    /* renamed from: e  reason: collision with root package name */
    public Object f50584e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f50585f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f50586g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f50587h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f50588i;

    public f0(C6510M c6510m, AbstractC6519f abstractC6519f, p2.g0 g0Var, int i10, AbstractC5532b abstractC5532b, Looper looper) {
        this.f50581b = c6510m;
        this.f50580a = abstractC6519f;
        this.f50585f = looper;
        this.f50582c = abstractC5532b;
    }

    public final synchronized void a(long j6) {
        boolean z10;
        boolean z11;
        Gi.e.n(this.f50586g);
        if (this.f50585f.getThread() != Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        ((s2.w) this.f50582c).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j6;
        while (true) {
            z11 = this.f50588i;
            if (z11 || j6 <= 0) {
                break;
            }
            this.f50582c.getClass();
            wait(j6);
            ((s2.w) this.f50582c).getClass();
            j6 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z11) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.f50587h = z10 | this.f50587h;
        this.f50588i = true;
        notifyAll();
    }

    public final void c() {
        Gi.e.n(!this.f50586g);
        this.f50586g = true;
        C6510M c6510m = this.f50581b;
        synchronized (c6510m) {
            if (!c6510m.f50412D0 && c6510m.f50439o0.getThread().isAlive()) {
                c6510m.f50437m0.a(14, this).b();
                return;
            }
            s2.p.g("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
