package N7;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: Y  reason: collision with root package name */
    public final H7.d f12734Y = new H7.d(Looper.getMainLooper(), 2);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12734Y.post(runnable);
    }
}
