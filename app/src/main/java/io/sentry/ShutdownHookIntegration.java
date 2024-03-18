package io.sentry;

import java.io.Closeable;
import u5.RunnableC5841a;

/* loaded from: classes.dex */
public final class ShutdownHookIntegration implements X, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final Runtime f33859Y;

    /* renamed from: Z  reason: collision with root package name */
    public Thread f33860Z;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        Ad.l.Z0("Runtime is required", runtime);
        this.f33859Y = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Thread thread = this.f33860Z;
        if (thread != null) {
            try {
                this.f33859Y.removeShutdownHook(thread);
            } catch (IllegalStateException e10) {
                String message = e10.getMessage();
                if (message == null || !message.equals("Shutdown in progress")) {
                    throw e10;
                }
            }
        }
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        A a5 = A.f33710a;
        if (r1Var.isEnableShutdownHook()) {
            Thread thread = new Thread(new RunnableC5841a(a5, 14, r1Var));
            this.f33860Z = thread;
            this.f33859Y.addShutdownHook(thread);
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            r.f.e(ShutdownHookIntegration.class);
            return;
        }
        r1Var.getLogger().f(EnumC3642e1.INFO, "enableShutdownHook is disabled.", new Object[0]);
    }
}
