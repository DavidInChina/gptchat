package N7;

import java.util.concurrent.Executor;
import m.ExecutorC4519P;
import q.RunnableC5216j;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: Z  reason: collision with root package name */
    public final Executor f12728Z;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f12730i0;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12727Y = 1;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f12729h0 = new Object();

    public i(Executor executor, b bVar) {
        this.f12728Z = executor;
        this.f12730i0 = bVar;
    }

    private final void a(m mVar) {
        if (mVar.f12738d) {
            synchronized (this.f12729h0) {
                try {
                    if (((j) this.f12730i0) == null) {
                        return;
                    }
                    this.f12728Z.execute(new h(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final void c(m mVar) {
        synchronized (this.f12729h0) {
            try {
                if (((b) this.f12730i0) == null) {
                    return;
                }
                this.f12728Z.execute(new RunnableC5216j(this, 24, mVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d(m mVar) {
        if (!mVar.e() && !mVar.f12738d) {
            synchronized (this.f12729h0) {
                try {
                    if (((c) this.f12730i0) == null) {
                        return;
                    }
                    this.f12728Z.execute(new RunnableC5216j(this, 25, mVar));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // N7.k
    public final void b(m mVar) {
        switch (this.f12727Y) {
            case 0:
                a(mVar);
                return;
            case 1:
                c(mVar);
                return;
            case 2:
                d(mVar);
                return;
            default:
                if (mVar.e()) {
                    synchronized (this.f12729h0) {
                        try {
                            if (((d) this.f12730i0) != null) {
                                this.f12728Z.execute(new RunnableC5216j(this, 26, mVar));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }

    public i(Executor executor, c cVar) {
        this.f12728Z = executor;
        this.f12730i0 = cVar;
    }

    public i(Executor executor, d dVar) {
        this.f12728Z = executor;
        this.f12730i0 = dVar;
    }

    public i(ExecutorC4519P executorC4519P, j jVar) {
        this.f12728Z = executorC4519P;
        this.f12730i0 = jVar;
    }
}
