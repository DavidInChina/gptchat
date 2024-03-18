package io.sentry.android.core.cache;

import Ad.l;
import V1.C1464e;
import id.AbstractC3557B;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.H;
import io.sentry.M1;
import io.sentry.T0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.b;
import io.sentry.android.core.x;
import io.sentry.cache.c;
import io.sentry.r1;
import io.sentry.transport.g;
import java.io.File;

/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ int f34088n0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final g f34089m0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(SentryAndroidOptions sentryAndroidOptions) {
        super(sentryAndroidOptions, r1, sentryAndroidOptions.getMaxCacheItems());
        b bVar = b.f34155Y;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        l.Z0("cacheDirPath must not be null", cacheDirPath);
        this.f34089m0 = bVar;
    }

    @Override // io.sentry.cache.c, io.sentry.cache.d
    public final void X(T0 t02, C3686u c3686u) {
        super.X(t02, c3686u);
        r1 r1Var = this.f34289Y;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) r1Var;
        io.sentry.android.core.performance.c cVar = io.sentry.android.core.performance.b.b().f34210c;
        if (M1.class.isInstance(AbstractC3557B.v1(c3686u)) && cVar.b()) {
            long currentTimeMillis = this.f34089m0.getCurrentTimeMillis() - cVar.f34217Z;
            if (currentTimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                H logger = sentryAndroidOptions.getLogger();
                EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
                logger.f(enumC3642e1, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(currentTimeMillis));
                String outboxPath = r1Var.getOutboxPath();
                if (outboxPath == null) {
                    r1Var.getLogger().f(enumC3642e1, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th2) {
                        r1Var.getLogger().d(EnumC3642e1.ERROR, "Error writing the startup crash marker file to the disk", th2);
                    }
                }
            }
        }
        AbstractC3557B.q2(c3686u, x.class, new C1464e(this, 19, sentryAndroidOptions));
    }
}
