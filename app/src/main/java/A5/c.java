package A5;

import M3.H;
import id.AbstractC3557B;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import q5.C5271a;
import y5.AbstractC6542a;
import z5.C6774a;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f666Y;

    /* renamed from: Z  reason: collision with root package name */
    public final F5.l f667Z;

    /* renamed from: h0  reason: collision with root package name */
    public final e f668h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC6542a f669i0;

    /* renamed from: j0  reason: collision with root package name */
    public final E5.e f670j0;

    /* renamed from: k0  reason: collision with root package name */
    public final M5.j f671k0;

    /* renamed from: l0  reason: collision with root package name */
    public final AbstractC5091c f672l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f673m0;

    /* renamed from: n0  reason: collision with root package name */
    public final long f674n0;

    /* renamed from: o0  reason: collision with root package name */
    public final long f675o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f676p0;

    public c(AbstractC5091c abstractC5091c, AbstractC6542a abstractC6542a, C6774a c6774a, b bVar, E5.e eVar, F5.l lVar, M5.j jVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        AbstractC3557B.c0("storage", lVar);
        AbstractC3557B.c0("contextProvider", abstractC6542a);
        AbstractC3557B.c0("networkInfoProvider", eVar);
        AbstractC3557B.c0("systemInfoProvider", jVar);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f666Y = scheduledThreadPoolExecutor;
        this.f667Z = lVar;
        this.f668h0 = bVar;
        this.f669i0 = abstractC6542a;
        this.f670j0 = eVar;
        this.f671k0 = jVar;
        this.f672l0 = abstractC5091c;
        this.f673m0 = c6774a.f51740e;
        this.f674n0 = c6774a.f51738c;
        this.f675o0 = c6774a.f51739d;
        this.f676p0 = c6774a.f51737b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar;
        H h10;
        if (this.f670j0.R().f43924a != 1) {
            M5.i l10 = this.f671k0.l();
            if ((l10.f11647a || l10.f11650d || l10.f11648b > 10) && !l10.f11649c) {
                C5271a context = this.f669i0.getContext();
                int i10 = this.f676p0;
                do {
                    i10--;
                    F5.l lVar = this.f667Z;
                    F5.c w10 = lVar.w();
                    if (w10 != null) {
                        tVar = this.f668h0.i(context, w10.f5035b, w10.f5036c);
                        if (tVar instanceof p) {
                            h10 = C5.e.f2693j;
                        } else {
                            h10 = new C5.d(tVar.f693b);
                        }
                        lVar.c(w10.f5034a, h10, !tVar.f692a);
                    } else {
                        tVar = null;
                    }
                    if (i10 <= 0) {
                        break;
                    }
                } while (tVar instanceof q);
                long j6 = this.f675o0;
                if (tVar != null) {
                    if (tVar.f692a) {
                        this.f673m0 = Math.min(j6, AbstractC4344b.Z0(this.f673m0 * 1.1d));
                    } else {
                        this.f673m0 = Math.max(this.f674n0, AbstractC4344b.Z0(this.f673m0 * 0.9d));
                    }
                } else {
                    this.f673m0 = Math.min(j6, AbstractC4344b.Z0(this.f673m0 * 1.1d));
                }
            }
        }
        this.f666Y.remove(this);
        H.n0(this.f666Y, "Data upload", this.f673m0, TimeUnit.MILLISECONDS, this.f672l0, this);
    }
}
