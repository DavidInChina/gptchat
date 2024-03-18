package N5;

import Df.H;
import id.AbstractC3557B;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p5.AbstractC5091c;

/* loaded from: classes2.dex */
public final class b extends ThreadPoolExecutor {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5091c f12712Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, long j6, TimeUnit timeUnit, LinkedBlockingDeque linkedBlockingDeque, AbstractC5091c abstractC5091c) {
        super(1, i10, j6, timeUnit, linkedBlockingDeque);
        AbstractC3557B.c0("logger", abstractC5091c);
        this.f12712Y = abstractC5091c;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        super.afterExecute(runnable, th2);
        H.e0(runnable, th2, this.f12712Y);
    }
}
