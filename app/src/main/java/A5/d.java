package A5;

import M3.H;
import id.AbstractC3557B;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p5.AbstractC5091c;
import y5.AbstractC6542a;
import z5.C6774a;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: Y  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f677Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5091c f678Z;

    /* renamed from: h0  reason: collision with root package name */
    public final c f679h0;

    public d(AbstractC5091c abstractC5091c, AbstractC6542a abstractC6542a, C6774a c6774a, b bVar, E5.e eVar, F5.l lVar, M5.j jVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        AbstractC3557B.c0("storage", lVar);
        AbstractC3557B.c0("contextProvider", abstractC6542a);
        AbstractC3557B.c0("networkInfoProvider", eVar);
        AbstractC3557B.c0("systemInfoProvider", jVar);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f677Y = scheduledThreadPoolExecutor;
        this.f678Z = abstractC5091c;
        this.f679h0 = new c(abstractC5091c, abstractC6542a, c6774a, bVar, eVar, lVar, jVar, scheduledThreadPoolExecutor);
    }

    @Override // A5.j
    public final void H() {
        this.f677Y.remove(this.f679h0);
    }

    @Override // A5.j
    public final void p() {
        c cVar = this.f679h0;
        H.n0(this.f677Y, "Data upload", cVar.f673m0, TimeUnit.MILLISECONDS, this.f678Z, cVar);
    }
}
