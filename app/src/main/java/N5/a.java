package N5;

import Df.H;
import id.AbstractC3557B;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p5.AbstractC5091c;

/* loaded from: classes2.dex */
public final class a extends ScheduledThreadPoolExecutor {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5091c f12711Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractC5091c abstractC5091c) {
        super(1);
        AbstractC3557B.c0("logger", abstractC5091c);
        this.f12711Y = abstractC5091c;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        super.afterExecute(runnable, th2);
        H.e0(runnable, th2, this.f12711Y);
    }
}
