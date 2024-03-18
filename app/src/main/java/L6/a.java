package L6;

import M6.f;
import M6.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final WeakReference f10745Y;

    /* renamed from: Z  reason: collision with root package name */
    public final b f10746Z;

    /* renamed from: h0  reason: collision with root package name */
    public volatile ScheduledFuture f10747h0 = null;

    public a(Object obj) {
        g gVar = g.f11696Y;
        this.f10745Y = new WeakReference(obj);
        this.f10746Z = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f10745Y.get();
        if (obj != null) {
            ((g) this.f10746Z).getClass();
            ((f) obj).run();
        } else if (this.f10747h0 != null) {
            this.f10747h0.cancel(false);
        }
    }
}
