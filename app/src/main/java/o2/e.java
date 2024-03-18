package o2;

import io.sentry.android.core.AbstractC3612c;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import v4.o;
import v4.p;

/* loaded from: classes2.dex */
public final class e extends FutureTask {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40523Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public Object f40524Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RunnableC4904a runnableC4904a, d dVar) {
        super(dVar);
        this.f40524Z = runnableC4904a;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.f40523Y) {
            case 0:
                try {
                    Object obj = get();
                    RunnableC4904a runnableC4904a = (RunnableC4904a) this.f40524Z;
                    if (!runnableC4904a.f40510i0.get()) {
                        runnableC4904a.a(obj);
                        return;
                    }
                    return;
                } catch (InterruptedException e10) {
                    AbstractC3612c.t("AsyncTask", e10);
                    return;
                } catch (CancellationException unused) {
                    RunnableC4904a runnableC4904a2 = (RunnableC4904a) this.f40524Z;
                    if (!runnableC4904a2.f40510i0.get()) {
                        runnableC4904a2.a(null);
                        return;
                    }
                    return;
                } catch (ExecutionException e11) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
                } catch (Throwable th2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th2);
                }
            default:
                try {
                    if (!isCancelled()) {
                        try {
                            ExecutorService executorService = p.f47237e;
                            ((p) this.f40524Z).e((o) get());
                        } catch (InterruptedException | ExecutionException e12) {
                            o oVar = new o(e12);
                            ExecutorService executorService2 = p.f47237e;
                            ((p) this.f40524Z).e(oVar);
                        }
                    }
                    return;
                } finally {
                    this.f40524Z = null;
                }
        }
    }

    public e(p pVar, Callable callable) {
        super(callable);
        this.f40524Z = pVar;
    }
}
