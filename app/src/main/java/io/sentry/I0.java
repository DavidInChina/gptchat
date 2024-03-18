package io.sentry;

import V1.C1465f;
import io.sentry.android.core.C3622m;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;

/* loaded from: classes2.dex */
public final class I0 implements H0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f33799a;

    /* renamed from: b  reason: collision with root package name */
    public final G0 f33800b;

    public I0(C3622m c3622m, int i10) {
        this.f33799a = i10;
        if (i10 != 1) {
            this.f33800b = c3622m;
        } else {
            this.f33800b = c3622m;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1465f a(G g10, SentryAndroidOptions sentryAndroidOptions) {
        String cacheDirPath;
        C1465f c1465f;
        String cacheDirPath2;
        C1465f c1465f2;
        int i10 = this.f33799a;
        G0 g02 = this.f33800b;
        switch (i10) {
            case 0:
                Ad.l.Z0("Hub is required", g10);
                C3622m c3622m = (C3622m) g02;
                int i11 = c3622m.f34197a;
                SentryAndroidOptions sentryAndroidOptions2 = c3622m.f34198b;
                switch (i11) {
                    case 0:
                        cacheDirPath = sentryAndroidOptions2.getCacheDirPath();
                        break;
                    default:
                        cacheDirPath = sentryAndroidOptions2.getOutboxPath();
                        break;
                }
                String str = cacheDirPath;
                if (str != null) {
                    H logger = sentryAndroidOptions.getLogger();
                    switch (i10) {
                        case 0:
                            if (str.isEmpty()) {
                                logger.f(EnumC3642e1.INFO, "No cached dir path is defined in options.", new Object[0]);
                                break;
                            }
                            C3679q c3679q = new C3679q(g10, sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize());
                            H logger2 = sentryAndroidOptions.getLogger();
                            switch (i10) {
                                case 0:
                                    c1465f = new C1465f(logger2, str, c3679q, new File(str), 4);
                                    break;
                                default:
                                    c1465f = new C1465f(logger2, str, c3679q, new File(str), 4);
                                    break;
                            }
                            return c1465f;
                        default:
                            if (str.isEmpty()) {
                                logger.f(EnumC3642e1.INFO, "No cached dir path is defined in options.", new Object[0]);
                                break;
                            }
                            C3679q c3679q2 = new C3679q(g10, sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize());
                            H logger22 = sentryAndroidOptions.getLogger();
                            switch (i10) {
                            }
                            return c1465f;
                    }
                }
                sentryAndroidOptions.getLogger().f(EnumC3642e1.ERROR, "No cache dir path is defined in options.", new Object[0]);
                return null;
            default:
                Ad.l.Z0("Hub is required", g10);
                C3622m c3622m2 = (C3622m) g02;
                int i12 = c3622m2.f34197a;
                SentryAndroidOptions sentryAndroidOptions3 = c3622m2.f34198b;
                switch (i12) {
                    case 0:
                        cacheDirPath2 = sentryAndroidOptions3.getCacheDirPath();
                        break;
                    default:
                        cacheDirPath2 = sentryAndroidOptions3.getOutboxPath();
                        break;
                }
                String str2 = cacheDirPath2;
                if (str2 != null) {
                    H logger3 = sentryAndroidOptions.getLogger();
                    switch (i10) {
                        case 0:
                            if (str2.isEmpty()) {
                                logger3.f(EnumC3642e1.INFO, "No cached dir path is defined in options.", new Object[0]);
                                break;
                            }
                            C3695y0 c3695y0 = new C3695y0(g10, sentryAndroidOptions.getEnvelopeReader(), sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize());
                            H logger4 = sentryAndroidOptions.getLogger();
                            switch (i10) {
                                case 0:
                                    c1465f2 = new C1465f(logger4, str2, c3695y0, new File(str2), 4);
                                    break;
                                default:
                                    c1465f2 = new C1465f(logger4, str2, c3695y0, new File(str2), 4);
                                    break;
                            }
                            return c1465f2;
                        default:
                            if (str2.isEmpty()) {
                                logger3.f(EnumC3642e1.INFO, "No cached dir path is defined in options.", new Object[0]);
                                break;
                            }
                            C3695y0 c3695y02 = new C3695y0(g10, sentryAndroidOptions.getEnvelopeReader(), sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize());
                            H logger42 = sentryAndroidOptions.getLogger();
                            switch (i10) {
                            }
                            return c1465f2;
                    }
                }
                sentryAndroidOptions.getLogger().f(EnumC3642e1.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                return null;
        }
    }
}
