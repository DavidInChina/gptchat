package w6;

import K4.J;
import M3.H;
import id.AbstractC3557B;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m6.C4562a;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final r5.d f48067Y;

    /* renamed from: Z  reason: collision with root package name */
    public final n f48068Z;

    /* renamed from: h0  reason: collision with root package name */
    public final m f48069h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ScheduledExecutorService f48070i0;

    /* renamed from: j0  reason: collision with root package name */
    public final long f48071j0;

    public o(r5.d dVar, n nVar, m mVar, ScheduledExecutorService scheduledExecutorService, long j6) {
        AbstractC3557B.c0("sdkCore", dVar);
        AbstractC3557B.c0("observer", mVar);
        AbstractC3557B.c0("executor", scheduledExecutorService);
        this.f48067Y = dVar;
        this.f48068Z = nVar;
        this.f48069h0 = mVar;
        this.f48070i0 = scheduledExecutorService;
        this.f48071j0 = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Double a5;
        String str = C4562a.f38944m;
        r5.d dVar = this.f48067Y;
        if (J.v(dVar.a("rum")).f38954j == 2 && (a5 = this.f48068Z.a()) != null) {
            this.f48069h0.a(a5.doubleValue());
        }
        H.n0(this.f48070i0, "Vitals monitoring", this.f48071j0, TimeUnit.MILLISECONDS, dVar.l(), this);
    }
}
