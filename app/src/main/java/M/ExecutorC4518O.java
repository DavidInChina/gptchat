package m;

import id.AbstractC3557B;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: m.O  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC4518O implements Executor {

    /* renamed from: Z  reason: collision with root package name */
    public final Executor f38683Z;

    /* renamed from: h0  reason: collision with root package name */
    public Runnable f38684h0;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38682Y = 0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f38685i0 = new Object();

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayDeque f38686j0 = new ArrayDeque();

    public ExecutorC4518O(ExecutorC4519P executorC4519P) {
        this.f38683Z = executorC4519P;
    }

    private void a(Runnable runnable) {
        synchronized (this.f38685i0) {
            try {
                this.f38686j0.add(new RunnableC4517N(this, 0, runnable));
                if (this.f38684h0 == null) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void c() {
        synchronized (this.f38685i0) {
            try {
                Runnable runnable = (Runnable) this.f38686j0.poll();
                this.f38684h0 = runnable;
                if (runnable != null) {
                    this.f38683Z.execute(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        switch (this.f38682Y) {
            case 0:
                c();
                return;
            default:
                synchronized (this.f38685i0) {
                    Object poll = this.f38686j0.poll();
                    Runnable runnable = (Runnable) poll;
                    this.f38684h0 = runnable;
                    if (poll != null) {
                        this.f38683Z.execute(runnable);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f38682Y) {
            case 0:
                a(runnable);
                return;
            default:
                AbstractC3557B.c0("command", runnable);
                synchronized (this.f38685i0) {
                    this.f38686j0.offer(new RunnableC4517N(this, runnable));
                    if (this.f38684h0 == null) {
                        b();
                    }
                }
                return;
        }
    }
}
