package O3;

import L3.C0889a;
import L3.s;
import M3.AbstractC0935d;
import M3.D;
import M3.F;
import M3.q;
import U3.l;
import V3.p;
import V3.w;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import g.RunnableC3115h;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class j implements AbstractC0935d {

    /* renamed from: p0  reason: collision with root package name */
    public static final String f13375p0 = s.f("SystemAlarmDispatcher");

    /* renamed from: Y  reason: collision with root package name */
    public final Context f13376Y;

    /* renamed from: Z  reason: collision with root package name */
    public final X3.b f13377Z;

    /* renamed from: h0  reason: collision with root package name */
    public final w f13378h0;

    /* renamed from: i0  reason: collision with root package name */
    public final q f13379i0;

    /* renamed from: j0  reason: collision with root package name */
    public final F f13380j0;

    /* renamed from: k0  reason: collision with root package name */
    public final c f13381k0;

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f13382l0 = new ArrayList();

    /* renamed from: m0  reason: collision with root package name */
    public Intent f13383m0 = null;

    /* renamed from: n0  reason: collision with root package name */
    public i f13384n0;

    /* renamed from: o0  reason: collision with root package name */
    public final D f13385o0;

    public j(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f13376Y = applicationContext;
        l lVar = new l(9, 0);
        F g02 = F.g0(context);
        this.f13380j0 = g02;
        C0889a c0889a = g02.f11518g;
        this.f13381k0 = new c(applicationContext, c0889a.f10686c, lVar);
        this.f13378h0 = new w(c0889a.f10689f);
        q qVar = g02.f11522k;
        this.f13379i0 = qVar;
        X3.b bVar = g02.f11520i;
        this.f13377Z = bVar;
        this.f13385o0 = new D(qVar, bVar);
        qVar.a(this);
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    @Override // M3.AbstractC0935d
    public final void a(U3.j jVar, boolean z10) {
        X3.a aVar = this.f13377Z.f21782d;
        String str = c.f13344k0;
        Intent intent = new Intent(this.f13376Y, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        c.e(intent, jVar);
        aVar.execute(new RunnableC3115h(this, intent, 0));
    }

    public final void b(Intent intent, int i10) {
        s d10 = s.d();
        String str = f13375p0;
        d10.a(str, "Adding command " + intent + " (" + i10 + Separators.RPAREN);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            s.d().g(str, "Unknown command. Ignoring");
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f13382l0) {
                try {
                    boolean z10 = !this.f13382l0.isEmpty();
                    this.f13382l0.add(intent);
                    if (!z10) {
                        e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final boolean d() {
        c();
        synchronized (this.f13382l0) {
            try {
                Iterator it = this.f13382l0.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        c();
        PowerManager.WakeLock a5 = p.a(this.f13376Y, "ProcessCommand");
        try {
            a5.acquire();
            this.f13380j0.f11520i.a(new h(this, 0));
        } finally {
            a5.release();
        }
    }
}
