package O3;

import L3.C0892d;
import L3.s;
import M3.AbstractC0935d;
import M3.D;
import M3.w;
import U3.l;
import U3.q;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import g.RunnableC3115h;
import id.AbstractC3557B;
import io.sentry.C1;
import io.sentry.L0;
import io.sentry.S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p.AbstractC5028d;
import x3.y;

/* loaded from: classes2.dex */
public final class c implements AbstractC0935d {

    /* renamed from: k0  reason: collision with root package name */
    public static final String f13344k0 = s.f("CommandHandler");

    /* renamed from: Y  reason: collision with root package name */
    public final Context f13345Y;

    /* renamed from: Z  reason: collision with root package name */
    public final HashMap f13346Z = new HashMap();

    /* renamed from: h0  reason: collision with root package name */
    public final Object f13347h0 = new Object();

    /* renamed from: i0  reason: collision with root package name */
    public final R4.a f13348i0;

    /* renamed from: j0  reason: collision with root package name */
    public final l f13349j0;

    public c(Context context, R4.a aVar, l lVar) {
        this.f13345Y = context;
        this.f13348i0 = aVar;
        this.f13349j0 = lVar;
    }

    public static U3.j d(Intent intent) {
        return new U3.j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void e(Intent intent, U3.j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f17418a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f17419b);
    }

    @Override // M3.AbstractC0935d
    public final void a(U3.j jVar, boolean z10) {
        synchronized (this.f13347h0) {
            try {
                g gVar = (g) this.f13346Z.remove(jVar);
                this.f13349j0.n(jVar);
                if (gVar != null) {
                    gVar.f(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f13347h0) {
            z10 = !this.f13346Z.isEmpty();
        }
        return z10;
    }

    public final void c(Intent intent, int i10, j jVar) {
        List<w> list;
        S s10;
        boolean z10;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            s.d().a(f13344k0, "Handling constraints changed " + intent);
            e eVar = new e(this.f13345Y, this.f13348i0, i10, jVar);
            ArrayList h10 = jVar.f13380j0.f11519h.u().h();
            String str = d.f13350a;
            Iterator it = h10.iterator();
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            while (it.hasNext()) {
                C0892d c0892d = ((q) it.next()).f17459j;
                z11 |= c0892d.f10702d;
                z12 |= c0892d.f10700b;
                z13 |= c0892d.f10703e;
                if (c0892d.f10699a != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z14 |= z10;
                if (z11 && z12 && z13 && z14) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f25532a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = eVar.f13352a;
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z12).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z13).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z14);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(h10.size());
            eVar.f13353b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = h10.iterator();
            while (it2.hasNext()) {
                q qVar = (q) it2.next();
                if (currentTimeMillis >= qVar.a() && (!qVar.b() || eVar.f13355d.d(qVar))) {
                    arrayList.add(qVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                q qVar2 = (q) it3.next();
                String str3 = qVar2.f17450a;
                U3.j y10 = Gi.e.y(qVar2);
                Intent intent3 = new Intent(context, SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                e(intent3, y10);
                s.d().a(e.f13351e, android.gov.nist.core.a.A("Creating a delay_met command for workSpec with id (", str3, Separators.RPAREN));
                jVar.f13377Z.f21782d.execute(new RunnableC3115h(jVar, intent3, eVar.f13354c));
            }
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            s.d().a(f13344k0, "Handling reschedule " + intent + ", " + i10);
            jVar.f13380j0.i0();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                if ("ACTION_SCHEDULE_WORK".equals(action)) {
                    U3.j d10 = d(intent);
                    String str4 = f13344k0;
                    s.d().a(str4, "Handling schedule work for " + d10);
                    WorkDatabase workDatabase = jVar.f13380j0.f11519h;
                    workDatabase.c();
                    try {
                        q l10 = workDatabase.u().l(d10.f17418a);
                        if (l10 == null) {
                            s.d().g(str4, "Skipping scheduling " + d10 + " because it's no longer in the DB");
                        } else if (E9.f.j(l10.f17451b)) {
                            s.d().g(str4, "Skipping scheduling " + d10 + "because it is finished.");
                        } else {
                            long a5 = l10.a();
                            boolean b10 = l10.b();
                            Context context2 = this.f13345Y;
                            if (!b10) {
                                s.d().a(str4, "Setting up Alarms for " + d10 + "at " + a5);
                                b.b(context2, workDatabase, d10, a5);
                            } else {
                                s.d().a(str4, "Opportunistically setting an alarm for " + d10 + "at " + a5);
                                b.b(context2, workDatabase, d10, a5);
                                Intent intent4 = new Intent(context2, SystemAlarmService.class);
                                intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                                jVar.f13377Z.f21782d.execute(new RunnableC3115h(jVar, intent4, i10));
                            }
                            workDatabase.n();
                        }
                        return;
                    } finally {
                        workDatabase.j();
                    }
                } else if ("ACTION_DELAY_MET".equals(action)) {
                    synchronized (this.f13347h0) {
                        try {
                            U3.j d11 = d(intent);
                            s d12 = s.d();
                            String str5 = f13344k0;
                            d12.a(str5, "Handing delay met for " + d11);
                            if (!this.f13346Z.containsKey(d11)) {
                                g gVar = new g(this.f13345Y, i10, jVar, this.f13349j0.p(d11));
                                this.f13346Z.put(d11, gVar);
                                gVar.d();
                            } else {
                                s.d().a(str5, "WorkSpec " + d11 + " is is already being handled for ACTION_DELAY_MET");
                            }
                        } finally {
                        }
                    }
                    return;
                } else if ("ACTION_STOP_WORK".equals(action)) {
                    Bundle extras2 = intent.getExtras();
                    String string = extras2.getString("KEY_WORKSPEC_ID");
                    boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
                    l lVar = this.f13349j0;
                    if (containsKey) {
                        int i11 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                        ArrayList arrayList2 = new ArrayList(1);
                        w n10 = lVar.n(new U3.j(string, i11));
                        list = arrayList2;
                        if (n10 != null) {
                            arrayList2.add(n10);
                            list = arrayList2;
                        }
                    } else {
                        list = lVar.o(string);
                    }
                    for (w wVar : list) {
                        s.d().a(f13344k0, R.a.r("Handing stopWork work for ", string));
                        D d13 = jVar.f13385o0;
                        d13.getClass();
                        AbstractC3557B.c0("workSpecId", wVar);
                        d13.a(wVar, -512);
                        WorkDatabase workDatabase2 = jVar.f13380j0.f11519h;
                        String str6 = b.f13343a;
                        U3.i r10 = workDatabase2.r();
                        U3.j jVar2 = wVar.f11607a;
                        U3.g B10 = r10.B(jVar2);
                        if (B10 != null) {
                            b.a(this.f13345Y, jVar2, B10.f17410c);
                            s.d().a(b.f13343a, "Removing SystemIdInfo for workSpecId (" + jVar2 + Separators.RPAREN);
                            S d14 = L0.d();
                            if (d14 != null) {
                                s10 = d14.v("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao");
                            } else {
                                s10 = null;
                            }
                            ((y) r10.f17414Y).b();
                            B3.i c10 = ((AbstractC5028d) r10.f17416h0).c();
                            String str7 = jVar2.f17418a;
                            if (str7 == null) {
                                c10.s0(1);
                            } else {
                                c10.b(1, str7);
                            }
                            c10.T(2, jVar2.f17419b);
                            ((y) r10.f17414Y).c();
                            try {
                                c10.w();
                                ((y) r10.f17414Y).n();
                                if (s10 != null) {
                                    s10.c(C1.OK);
                                }
                            } finally {
                                y yVar = (y) r10.f17414Y;
                                if (s10 != null) {
                                    s10.b();
                                }
                                ((AbstractC5028d) r10.f17416h0).g(c10);
                            }
                        }
                        jVar.a(jVar2, false);
                    }
                    return;
                } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                    U3.j d15 = d(intent);
                    boolean z15 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                    s.d().a(f13344k0, "Handling onExecutionCompleted " + intent + ", " + i10);
                    a(d15, z15);
                    return;
                } else {
                    s.d().g(f13344k0, "Ignoring intent " + intent);
                    return;
                }
            }
            s.d().b(f13344k0, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
        }
    }
}
