package com.auth0.android.request.internal;

import android.os.Handler;
import android.os.Looper;
import id.AbstractC3557B;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m.RunnableC4517N;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f26728a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Handler f26729b;

    public d() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(4);
        AbstractC3557B.b0("newFixedThreadPool(MAX_CONCURRENT_THREADS)", newFixedThreadPool);
        this.f26728a = newFixedThreadPool;
    }

    @Override // com.auth0.android.request.internal.m
    public final void a(Runnable runnable) {
        this.f26728a.execute(runnable);
    }

    @Override // com.auth0.android.request.internal.m
    public final void b(RunnableC4517N runnableC4517N) {
        if (this.f26729b == null) {
            synchronized (this) {
                if (this.f26729b == null) {
                    Looper mainLooper = Looper.getMainLooper();
                    AbstractC3557B.b0("getMainLooper()", mainLooper);
                    Handler m10 = AbstractC5260f.m(mainLooper);
                    AbstractC3557B.b0("createAsync(looper)", m10);
                    this.f26729b = m10;
                }
            }
        }
        Handler handler = this.f26729b;
        if (handler != null) {
            handler.post(runnableC4517N);
        }
    }
}
