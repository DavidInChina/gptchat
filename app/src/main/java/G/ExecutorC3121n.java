package g;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* renamed from: g.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC3121n implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: Z  reason: collision with root package name */
    public Runnable f30963Z;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC3122o f30965i0;

    /* renamed from: Y  reason: collision with root package name */
    public final long f30962Y = SystemClock.uptimeMillis() + 10000;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f30964h0 = false;

    public ExecutorC3121n(AbstractActivityC3122o abstractActivityC3122o) {
        this.f30965i0 = abstractActivityC3122o;
    }

    public final void a(View view) {
        if (!this.f30964h0) {
            this.f30964h0 = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f30963Z = runnable;
        View decorView = this.f30965i0.getWindow().getDecorView();
        if (this.f30964h0) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new RunnableC3111d(1, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f30963Z;
        if (runnable != null) {
            runnable.run();
            this.f30963Z = null;
            C3124q c3124q = this.f30965i0.f30974o0;
            synchronized (c3124q.f30987a) {
                z10 = c3124q.f30988b;
            }
            if (z10) {
                this.f30964h0 = false;
                this.f30965i0.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.f30962Y) {
            this.f30964h0 = false;
            this.f30965i0.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30965i0.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
