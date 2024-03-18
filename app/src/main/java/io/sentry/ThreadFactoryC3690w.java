package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.concurrent.ThreadFactory;

/* renamed from: io.sentry.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC3690w implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f34799a;

    /* renamed from: b  reason: collision with root package name */
    public int f34800b;

    public /* synthetic */ ThreadFactoryC3690w(int i10) {
        this.f34799a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f34799a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SentryHostnameCache-");
                int i10 = this.f34800b;
                this.f34800b = i10 + 1;
                sb2.append(i10);
                Thread thread = new Thread(runnable, sb2.toString());
                thread.setDaemon(true);
                return thread;
            case 1:
                StringBuilder sb3 = new StringBuilder("SentryExecutorServiceThreadFactory-");
                int i11 = this.f34800b;
                this.f34800b = i11 + 1;
                sb3.append(i11);
                Thread thread2 = new Thread(runnable, sb3.toString());
                thread2.setDaemon(true);
                return thread2;
            default:
                StringBuilder sb4 = new StringBuilder("SentryAsyncConnection-");
                int i12 = this.f34800b;
                this.f34800b = i12 + 1;
                sb4.append(i12);
                Thread thread3 = new Thread(runnable, sb4.toString());
                thread3.setDaemon(true);
                return thread3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreadFactoryC3690w(AbstractC2469q0 abstractC2469q0) {
        this(2);
        this.f34799a = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreadFactoryC3690w(Object obj) {
        this(1);
        this.f34799a = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreadFactoryC3690w() {
        this(0);
        this.f34799a = 0;
    }
}
