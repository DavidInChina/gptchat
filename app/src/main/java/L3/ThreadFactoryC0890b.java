package L3;

import id.AbstractC3557B;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: L3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0890b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f10694a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10695b;

    public ThreadFactoryC0890b(boolean z10) {
        this.f10695b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        AbstractC3557B.c0("runnable", runnable);
        if (this.f10695b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder p10 = android.gov.nist.core.a.p(str);
        p10.append(this.f10694a.incrementAndGet());
        return new Thread(runnable, p10.toString());
    }
}
