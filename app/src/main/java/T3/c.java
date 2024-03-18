package T3;

import L3.i;
import L3.s;
import M3.AbstractC0935d;
import M3.F;
import M3.w;
import Ng.AbstractC1073l0;
import Q3.j;
import U3.q;
import V3.o;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import g.RunnableC3115h;
import id.AbstractC3557B;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c implements Q3.e, AbstractC0935d {

    /* renamed from: o0  reason: collision with root package name */
    public static final String f16891o0 = s.f("SystemFgDispatcher");

    /* renamed from: Y  reason: collision with root package name */
    public final F f16892Y;

    /* renamed from: Z  reason: collision with root package name */
    public final X3.b f16893Z;

    /* renamed from: m0  reason: collision with root package name */
    public final j f16899m0;

    /* renamed from: n0  reason: collision with root package name */
    public b f16900n0;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f16894h0 = new Object();

    /* renamed from: i0  reason: collision with root package name */
    public U3.j f16895i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public final LinkedHashMap f16896j0 = new LinkedHashMap();

    /* renamed from: l0  reason: collision with root package name */
    public final HashMap f16898l0 = new HashMap();

    /* renamed from: k0  reason: collision with root package name */
    public final HashMap f16897k0 = new HashMap();

    public c(Context context) {
        F g02 = F.g0(context);
        this.f16892Y = g02;
        this.f16893Z = g02.f11520i;
        this.f16899m0 = new j(g02.f11526o);
        g02.f11522k.a(this);
    }

    public static Intent b(Context context, U3.j jVar, i iVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f10718a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f10719b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f10720c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f17418a);
        intent.putExtra("KEY_GENERATION", jVar.f17419b);
        return intent;
    }

    public static Intent c(Context context, U3.j jVar, i iVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f17418a);
        intent.putExtra("KEY_GENERATION", jVar.f17419b);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f10718a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f10719b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f10720c);
        return intent;
    }

    @Override // M3.AbstractC0935d
    public final void a(U3.j jVar, boolean z10) {
        AbstractC1073l0 abstractC1073l0;
        Map.Entry entry;
        synchronized (this.f16894h0) {
            try {
                if (((q) this.f16897k0.remove(jVar)) != null) {
                    abstractC1073l0 = (AbstractC1073l0) this.f16898l0.remove(jVar);
                } else {
                    abstractC1073l0 = null;
                }
                if (abstractC1073l0 != null) {
                    abstractC1073l0.k(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i iVar = (i) this.f16896j0.remove(jVar);
        if (jVar.equals(this.f16895i0)) {
            if (this.f16896j0.size() > 0) {
                Iterator it = this.f16896j0.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                }
                this.f16895i0 = (U3.j) entry.getKey();
                if (this.f16900n0 != null) {
                    i iVar2 = (i) entry.getValue();
                    b bVar = this.f16900n0;
                    SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
                    systemForegroundService.f25544Z.post(new d(systemForegroundService, iVar2.f10718a, iVar2.f10720c, iVar2.f10719b));
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f16900n0;
                    systemForegroundService2.f25544Z.post(new e(systemForegroundService2, iVar2.f10718a, 0));
                }
            } else {
                this.f16895i0 = null;
            }
        }
        b bVar2 = this.f16900n0;
        if (iVar != null && bVar2 != null) {
            s.d().a(f16891o0, "Removing Notification (id: " + iVar.f10718a + ", workSpecId: " + jVar + ", notificationType: " + iVar.f10719b);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) bVar2;
            systemForegroundService3.f25544Z.post(new e(systemForegroundService3, iVar.f10718a, 0));
        }
    }

    public final void d(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        U3.j jVar = new U3.j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        s d10 = s.d();
        StringBuilder sb2 = new StringBuilder("Notifying with (id:");
        sb2.append(intExtra);
        sb2.append(", workSpecId: ");
        sb2.append(stringExtra);
        sb2.append(", notificationType :");
        d10.a(f16891o0, android.gov.nist.core.a.l(sb2, intExtra2, Separators.RPAREN));
        if (notification != null && this.f16900n0 != null) {
            i iVar = new i(intExtra, intExtra2, notification);
            LinkedHashMap linkedHashMap = this.f16896j0;
            linkedHashMap.put(jVar, iVar);
            if (this.f16895i0 == null) {
                this.f16895i0 = jVar;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f16900n0;
                systemForegroundService.f25544Z.post(new d(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f16900n0;
            systemForegroundService2.f25544Z.post(new RunnableC3115h(systemForegroundService2, intExtra, notification, 7));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    i10 |= ((i) entry.getValue()).f10719b;
                }
                i iVar2 = (i) linkedHashMap.get(this.f16895i0);
                if (iVar2 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f16900n0;
                    systemForegroundService3.f25544Z.post(new d(systemForegroundService3, iVar2.f10718a, iVar2.f10720c, i10));
                }
            }
        }
    }

    @Override // Q3.e
    public final void e(q qVar, Q3.c cVar) {
        if (cVar instanceof Q3.b) {
            String str = qVar.f17450a;
            s.d().a(f16891o0, R.a.r("Constraints unmet for WorkSpec ", str));
            U3.j y10 = Gi.e.y(qVar);
            F f6 = this.f16892Y;
            f6.getClass();
            w wVar = new w(y10);
            M3.q qVar2 = f6.f11522k;
            AbstractC3557B.c0("processor", qVar2);
            f6.f11520i.a(new o(qVar2, wVar, true, -512));
        }
    }

    public final void f() {
        this.f16900n0 = null;
        synchronized (this.f16894h0) {
            try {
                for (AbstractC1073l0 abstractC1073l0 : this.f16898l0.values()) {
                    abstractC1073l0.k(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16892Y.f11522k.h(this);
    }
}
