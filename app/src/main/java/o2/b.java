package o2;

import android.os.AsyncTask;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import s7.C5583d;
import u7.j;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public int f40512a;

    /* renamed from: b  reason: collision with root package name */
    public c f40513b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f40514c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f40515d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f40516e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f40517f;

    /* renamed from: g  reason: collision with root package name */
    public Executor f40518g;

    /* renamed from: h  reason: collision with root package name */
    public volatile RunnableC4904a f40519h;

    /* renamed from: i  reason: collision with root package name */
    public volatile RunnableC4904a f40520i;

    public final void a() {
        if (this.f40519h != null) {
            boolean z10 = this.f40514c;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f40517f = true;
                }
            }
            if (this.f40520i != null) {
                this.f40519h.getClass();
                this.f40519h = null;
                return;
            }
            this.f40519h.getClass();
            RunnableC4904a runnableC4904a = this.f40519h;
            runnableC4904a.f40509h0.set(true);
            if (runnableC4904a.f40507Y.cancel(false)) {
                this.f40520i = this.f40519h;
            }
            this.f40519h = null;
        }
    }

    public final void b() {
        if (this.f40520i == null && this.f40519h != null) {
            this.f40519h.getClass();
            if (this.f40518g == null) {
                this.f40518g = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            RunnableC4904a runnableC4904a = this.f40519h;
            Executor executor = this.f40518g;
            if (runnableC4904a.f40508Z != 1) {
                int f6 = AbstractC6708l.f(runnableC4904a.f40508Z);
                if (f6 != 1) {
                    if (f6 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            runnableC4904a.f40508Z = 2;
            executor.execute(runnableC4904a.f40507Y);
        }
    }

    public final void c() {
        a();
        this.f40519h = new RunnableC4904a(this);
        b();
    }

    public final void d() {
        C5583d c5583d = (C5583d) this;
        Iterator it = c5583d.f45432k.iterator();
        if (!it.hasNext()) {
            try {
                c5583d.f45431j.tryAcquire(0, 5L, TimeUnit.SECONDS);
                return;
            } catch (InterruptedException e10) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
                Thread.currentThread().interrupt();
                return;
            }
        }
        ((j) it.next()).getClass();
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        return android.gov.nist.core.a.l(sb2, this.f40512a, "}");
    }
}
