package Ng;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class S implements T {

    /* renamed from: Y  reason: collision with root package name */
    public final Future f12909Y;

    public S(ScheduledFuture scheduledFuture) {
        this.f12909Y = scheduledFuture;
    }

    @Override // Ng.T
    public final void dispose() {
        this.f12909Y.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f12909Y + ']';
    }
}
