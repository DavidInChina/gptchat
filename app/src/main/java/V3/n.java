package V3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import q.RunnableC5216j;

/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: Z  reason: collision with root package name */
    public final Executor f18357Z;

    /* renamed from: h0  reason: collision with root package name */
    public Runnable f18358h0;

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayDeque f18356Y = new ArrayDeque();

    /* renamed from: i0  reason: collision with root package name */
    public final Object f18359i0 = new Object();

    public n(ExecutorService executorService) {
        this.f18357Z = executorService;
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f18359i0) {
            z10 = !this.f18356Y.isEmpty();
        }
        return z10;
    }

    public final void b() {
        Runnable runnable = (Runnable) this.f18356Y.poll();
        this.f18358h0 = runnable;
        if (runnable != null) {
            this.f18357Z.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f18359i0) {
            try {
                this.f18356Y.add(new RunnableC5216j(this, runnable, 12));
                if (this.f18358h0 == null) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
