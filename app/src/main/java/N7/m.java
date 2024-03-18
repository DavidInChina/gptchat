package N7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import n2.C4711b;
import v7.n;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12735a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final C4711b f12736b = new C4711b(5);

    /* renamed from: c  reason: collision with root package name */
    public boolean f12737c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f12738d;

    /* renamed from: e  reason: collision with root package name */
    public Object f12739e;

    /* renamed from: f  reason: collision with root package name */
    public Exception f12740f;

    public final void a(n nVar) {
        this.f12736b.i(new i(g.f12724a, nVar));
        i();
    }

    public final void b(Executor executor, d dVar) {
        this.f12736b.i(new i(executor, dVar));
        i();
    }

    public final Exception c() {
        Exception exc;
        synchronized (this.f12735a) {
            exc = this.f12740f;
        }
        return exc;
    }

    public final Object d() {
        Object obj;
        synchronized (this.f12735a) {
            try {
                A7.b.m0("Task is not yet complete", this.f12737c);
                if (!this.f12738d) {
                    Exception exc = this.f12740f;
                    if (exc == null) {
                        obj = this.f12739e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f12735a) {
            try {
                z10 = false;
                if (this.f12737c && !this.f12738d && this.f12740f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final void f(Exception exc) {
        A7.b.l0(exc, "Exception must not be null");
        synchronized (this.f12735a) {
            h();
            this.f12737c = true;
            this.f12740f = exc;
        }
        this.f12736b.j(this);
    }

    public final void g(Object obj) {
        synchronized (this.f12735a) {
            h();
            this.f12737c = true;
            this.f12739e = obj;
        }
        this.f12736b.j(this);
    }

    public final void h() {
        boolean z10;
        String str;
        if (this.f12737c) {
            int i10 = a.f12722Y;
            synchronized (this.f12735a) {
                z10 = this.f12737c;
            }
            if (z10) {
                Exception c10 = c();
                if (c10 == null) {
                    if (!e()) {
                        if (this.f12738d) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(d()));
                    }
                } else {
                    str = "failure";
                }
                throw new a(0, "Complete with: ".concat(str), c10);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void i() {
        synchronized (this.f12735a) {
            try {
                if (!this.f12737c) {
                    return;
                }
                this.f12736b.j(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
