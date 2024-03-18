package D1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.UUID;

/* renamed from: D1.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0370p0 implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3282Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f3283Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f3284h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f3285i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f3286j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f3287k0;

    public /* synthetic */ RunnableC0370p0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f3282Y = i10;
        this.f3287k0 = obj;
        this.f3283Z = obj2;
        this.f3284h0 = obj3;
        this.f3285i0 = obj4;
        this.f3286j0 = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3282Y) {
            case 0:
                r0.h((View) this.f3283Z, (v0) this.f3284h0, (U3.l) this.f3285i0);
                ((ValueAnimator) this.f3286j0).start();
                return;
            default:
                try {
                    if (!(((W3.i) this.f3283Z).f20718Y instanceof W3.a)) {
                        String uuid = ((UUID) this.f3284h0).toString();
                        U3.q l10 = ((V3.s) this.f3287k0).f18376c.l(uuid);
                        if (l10 != null && !E9.f.j(l10.f17451b)) {
                            ((M3.q) ((V3.s) this.f3287k0).f18375b).i(uuid, (L3.i) this.f3285i0);
                            ((Context) this.f3286j0).startService(T3.c.b((Context) this.f3286j0, Gi.e.y(l10), (L3.i) this.f3285i0));
                        } else {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                    }
                    ((W3.i) this.f3283Z).j(null);
                    return;
                } catch (Throwable th2) {
                    ((W3.i) this.f3283Z).k(th2);
                    return;
                }
        }
    }
}
