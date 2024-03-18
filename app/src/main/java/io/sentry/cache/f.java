package io.sentry.cache;

import io.sentry.A1;
import io.sentry.E1;
import io.sentry.EnumC3642e1;
import io.sentry.F0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.C;
import io.sentry.protocol.C3676c;
import io.sentry.r1;
import j$.util.concurrent.ConcurrentHashMap;
import u5.RunnableC5841a;

/* loaded from: classes.dex */
public final class f extends F0 {

    /* renamed from: a  reason: collision with root package name */
    public final r1 f34296a;

    public f(r1 r1Var) {
        this.f34296a = r1Var;
    }

    public static Object g(SentryAndroidOptions sentryAndroidOptions, String str, Class cls) {
        return a.b(sentryAndroidOptions, ".scope-cache", str, cls, null);
    }

    @Override // io.sentry.F0, io.sentry.O
    public final void b(ConcurrentHashMap concurrentHashMap) {
        j(new RunnableC5841a(this, 22, concurrentHashMap));
    }

    @Override // io.sentry.F0, io.sentry.O
    public final void c(C3676c c3676c) {
        j(new RunnableC5841a(this, 26, c3676c));
    }

    @Override // io.sentry.F0, io.sentry.O
    public final void d(A1 a12) {
        j(new RunnableC5841a(this, 23, a12));
    }

    @Override // io.sentry.F0, io.sentry.O
    public final void e(String str) {
        j(new RunnableC5841a(this, 21, str));
    }

    @Override // io.sentry.F0, io.sentry.O
    public final void f(E1 e12) {
        j(new RunnableC5841a(this, 24, e12));
    }

    @Override // io.sentry.O
    public final void h(C c10) {
        j(new RunnableC5841a(this, 20, c10));
    }

    public final void j(RunnableC5841a runnableC5841a) {
        r1 r1Var = this.f34296a;
        try {
            r1Var.getExecutorService().submit(new RunnableC5841a(this, 25, runnableC5841a));
        } catch (Throwable th2) {
            r1Var.getLogger().d(EnumC3642e1.ERROR, "Serialization task could not be scheduled", th2);
        }
    }

    public final void k(String str, Object obj) {
        a.c(this.f34296a, obj, ".scope-cache", str);
    }
}
