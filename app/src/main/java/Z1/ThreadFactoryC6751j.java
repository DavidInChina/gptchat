package z1;

import java.util.concurrent.ThreadFactory;

/* renamed from: z1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC6751j implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public String f51459a;

    /* renamed from: b  reason: collision with root package name */
    public int f51460b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C6750i(runnable, this.f51459a, this.f51460b);
    }
}
