package O3;

import L3.s;
import M3.w;
import Ng.C1057d0;
import Ng.C1079o0;
import Q3.l;
import S3.m;
import U3.q;
import V3.n;
import V3.p;
import V3.u;
import V3.v;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import g.RunnableC3115h;

/* loaded from: classes2.dex */
public final class g implements Q3.e, u {

    /* renamed from: t0  reason: collision with root package name */
    public static final String f13358t0 = s.f("DelayMetCommandHandler");

    /* renamed from: Y  reason: collision with root package name */
    public final Context f13359Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f13360Z;

    /* renamed from: h0  reason: collision with root package name */
    public final U3.j f13361h0;

    /* renamed from: i0  reason: collision with root package name */
    public final j f13362i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Q3.j f13363j0;

    /* renamed from: m0  reason: collision with root package name */
    public final n f13366m0;

    /* renamed from: n0  reason: collision with root package name */
    public final X3.a f13367n0;

    /* renamed from: o0  reason: collision with root package name */
    public PowerManager.WakeLock f13368o0;

    /* renamed from: q0  reason: collision with root package name */
    public final w f13370q0;

    /* renamed from: r0  reason: collision with root package name */
    public final C1057d0 f13371r0;

    /* renamed from: s0  reason: collision with root package name */
    public volatile C1079o0 f13372s0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f13369p0 = false;

    /* renamed from: l0  reason: collision with root package name */
    public int f13365l0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f13364k0 = new Object();

    public g(Context context, int i10, j jVar, w wVar) {
        this.f13359Y = context;
        this.f13360Z = i10;
        this.f13362i0 = jVar;
        this.f13361h0 = wVar.f11607a;
        this.f13370q0 = wVar;
        m mVar = jVar.f13380j0.f11526o;
        X3.b bVar = jVar.f13377Z;
        this.f13366m0 = bVar.f21779a;
        this.f13367n0 = bVar.f21782d;
        this.f13371r0 = bVar.f21780b;
        this.f13363j0 = new Q3.j(mVar);
    }

    public static void a(g gVar) {
        U3.j jVar = gVar.f13361h0;
        String str = jVar.f17418a;
        int i10 = gVar.f13365l0;
        String str2 = f13358t0;
        if (i10 < 2) {
            gVar.f13365l0 = 2;
            s d10 = s.d();
            d10.a(str2, "Stopping work for WorkSpec " + str);
            Context context = gVar.f13359Y;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_STOP_WORK");
            c.e(intent, jVar);
            j jVar2 = gVar.f13362i0;
            int i11 = gVar.f13360Z;
            RunnableC3115h runnableC3115h = new RunnableC3115h(jVar2, intent, i11);
            X3.a aVar = gVar.f13367n0;
            aVar.execute(runnableC3115h);
            if (jVar2.f13379i0.g(jVar.f17418a)) {
                s d11 = s.d();
                d11.a(str2, "WorkSpec " + str + " needs to be rescheduled");
                Intent intent2 = new Intent(context, SystemAlarmService.class);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                c.e(intent2, jVar);
                aVar.execute(new RunnableC3115h(jVar2, intent2, i11));
                return;
            }
            s d12 = s.d();
            d12.a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        s d13 = s.d();
        d13.a(str2, "Already stopped work for " + str);
    }

    public static void b(g gVar) {
        if (gVar.f13365l0 == 0) {
            gVar.f13365l0 = 1;
            s d10 = s.d();
            String str = f13358t0;
            d10.a(str, "onAllConstraintsMet for " + gVar.f13361h0);
            if (gVar.f13362i0.f13379i0.j(gVar.f13370q0, null)) {
                V3.w wVar = gVar.f13362i0.f13378h0;
                U3.j jVar = gVar.f13361h0;
                synchronized (wVar.f18383d) {
                    s d11 = s.d();
                    String str2 = V3.w.f18379e;
                    d11.a(str2, "Starting timer for " + jVar);
                    wVar.a(jVar);
                    v vVar = new v(wVar, jVar);
                    wVar.f18381b.put(jVar, vVar);
                    wVar.f18382c.put(jVar, gVar);
                    wVar.f18380a.f11565a.postDelayed(vVar, 600000L);
                }
                return;
            }
            gVar.c();
            return;
        }
        s d12 = s.d();
        String str3 = f13358t0;
        d12.a(str3, "Already started work for " + gVar.f13361h0);
    }

    public final void c() {
        synchronized (this.f13364k0) {
            try {
                if (this.f13372s0 != null) {
                    this.f13372s0.k(null);
                }
                this.f13362i0.f13378h0.a(this.f13361h0);
                PowerManager.WakeLock wakeLock = this.f13368o0;
                if (wakeLock != null && wakeLock.isHeld()) {
                    s d10 = s.d();
                    String str = f13358t0;
                    d10.a(str, "Releasing wakelock " + this.f13368o0 + "for WorkSpec " + this.f13361h0);
                    this.f13368o0.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        String str = this.f13361h0.f17418a;
        Context context = this.f13359Y;
        StringBuilder r10 = android.gov.nist.core.a.r(str, " (");
        r10.append(this.f13360Z);
        r10.append(Separators.RPAREN);
        this.f13368o0 = p.a(context, r10.toString());
        s d10 = s.d();
        String str2 = f13358t0;
        d10.a(str2, "Acquiring wakelock " + this.f13368o0 + "for WorkSpec " + str);
        this.f13368o0.acquire();
        q l10 = this.f13362i0.f13380j0.f11519h.u().l(str);
        if (l10 == null) {
            this.f13366m0.execute(new f(this, 0));
            return;
        }
        boolean b10 = l10.b();
        this.f13369p0 = b10;
        if (!b10) {
            s d11 = s.d();
            d11.a(str2, "No constraints for " + str);
            this.f13366m0.execute(new f(this, 1));
            return;
        }
        this.f13372s0 = l.a(this.f13363j0, l10, this.f13371r0, this);
    }

    @Override // Q3.e
    public final void e(q qVar, Q3.c cVar) {
        boolean z10 = cVar instanceof Q3.a;
        n nVar = this.f13366m0;
        if (z10) {
            nVar.execute(new f(this, 2));
        } else {
            nVar.execute(new f(this, 3));
        }
    }

    public final void f(boolean z10) {
        s d10 = s.d();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        U3.j jVar = this.f13361h0;
        sb2.append(jVar);
        sb2.append(", ");
        sb2.append(z10);
        d10.a(f13358t0, sb2.toString());
        c();
        int i10 = this.f13360Z;
        j jVar2 = this.f13362i0;
        X3.a aVar = this.f13367n0;
        Context context = this.f13359Y;
        if (z10) {
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.e(intent, jVar);
            aVar.execute(new RunnableC3115h(jVar2, intent, i10));
        }
        if (this.f13369p0) {
            Intent intent2 = new Intent(context, SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            aVar.execute(new RunnableC3115h(jVar2, intent2, i10));
        }
    }
}
