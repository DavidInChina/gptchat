package X3;

import Ng.C1057d0;
import V3.n;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final n f21779a;

    /* renamed from: b  reason: collision with root package name */
    public final C1057d0 f21780b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f21781c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public final a f21782d = new a(0, this);

    public b(ExecutorService executorService) {
        n nVar = new n(executorService);
        this.f21779a = nVar;
        this.f21780b = new C1057d0(nVar);
    }

    public final void a(Runnable runnable) {
        this.f21779a.execute(runnable);
    }
}
