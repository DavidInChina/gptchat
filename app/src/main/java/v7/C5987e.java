package v7;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.C3636c1;
import io.sentry.android.core.AbstractC3612c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k6.AbstractC4194d;
import t7.C5680b;
import t7.C5682d;
import u7.C5850f;
import w.C6055b;
import w.C6060g;
import w7.AbstractC6134f;
import w7.C6136h;
import w7.C6138j;
import w7.C6139k;

/* renamed from: v7.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5987e implements Handler.Callback {

    /* renamed from: t0  reason: collision with root package name */
    public static final Status f47297t0 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: u0  reason: collision with root package name */
    public static final Status f47298u0 = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: v0  reason: collision with root package name */
    public static final Object f47299v0 = new Object();

    /* renamed from: w0  reason: collision with root package name */
    public static C5987e f47300w0;

    /* renamed from: h0  reason: collision with root package name */
    public w7.l f47303h0;

    /* renamed from: i0  reason: collision with root package name */
    public y7.c f47304i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Context f47305j0;

    /* renamed from: k0  reason: collision with root package name */
    public final t7.e f47306k0;

    /* renamed from: r0  reason: collision with root package name */
    public final H7.d f47313r0;

    /* renamed from: s0  reason: collision with root package name */
    public volatile boolean f47314s0;

    /* renamed from: Y  reason: collision with root package name */
    public long f47301Y = 10000;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f47302Z = false;

    /* renamed from: m0  reason: collision with root package name */
    public final AtomicInteger f47308m0 = new AtomicInteger(1);

    /* renamed from: n0  reason: collision with root package name */
    public final AtomicInteger f47309n0 = new AtomicInteger(0);

    /* renamed from: o0  reason: collision with root package name */
    public final ConcurrentHashMap f47310o0 = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: p0  reason: collision with root package name */
    public final C6060g f47311p0 = new C6060g(0);

    /* renamed from: q0  reason: collision with root package name */
    public final C6060g f47312q0 = new C6060g(0);

    /* renamed from: l0  reason: collision with root package name */
    public final C3636c1 f47307l0 = new C3636c1();

    public C5987e(Context context, Looper looper) {
        t7.e eVar = t7.e.f45771d;
        boolean z10 = true;
        this.f47314s0 = true;
        this.f47305j0 = context;
        H7.d dVar = new H7.d(looper, this, 0);
        this.f47313r0 = dVar;
        this.f47306k0 = eVar;
        PackageManager packageManager = context.getPackageManager();
        if (A7.b.f727l == null) {
            A7.b.f727l = Boolean.valueOf((Build.VERSION.SDK_INT < 26 || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z10);
        }
        if (A7.b.f727l.booleanValue()) {
            this.f47314s0 = false;
        }
        dVar.sendMessage(dVar.obtainMessage(6));
    }

    public static Status c(C5983a c5983a, C5680b c5680b) {
        return new Status(17, android.gov.nist.core.a.k("API: ", (String) c5983a.f47289b.f17494i0, " is not available on this device. Connection failed with: ", String.valueOf(c5680b)), c5680b.f45762h0, c5680b);
    }

    public static C5987e e(Context context) {
        C5987e c5987e;
        synchronized (f47299v0) {
            try {
                if (f47300w0 == null) {
                    Looper looper = w7.I.a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = t7.e.f45770c;
                    f47300w0 = new C5987e(applicationContext, looper);
                }
                c5987e = f47300w0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5987e;
    }

    public final boolean a() {
        if (this.f47302Z) {
            return false;
        }
        C6139k c6139k = C6138j.a().f48175a;
        if (c6139k != null && !c6139k.f48177Z) {
            return false;
        }
        int i10 = ((SparseIntArray) this.f47307l0.f34285Z).get(203400000, -1);
        if (i10 != -1 && i10 != 0) {
            return false;
        }
        return true;
    }

    public final boolean b(C5680b c5680b, int i10) {
        PendingIntent pendingIntent;
        boolean z10;
        PendingIntent pendingIntent2;
        boolean isInstantApp;
        Boolean bool;
        t7.e eVar = this.f47306k0;
        Context context = this.f47305j0;
        eVar.getClass();
        synchronized (A7.b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = A7.b.f716a;
            pendingIntent = null;
            if (context2 != null && (bool = A7.b.f717b) != null && context2 == applicationContext) {
                z10 = bool.booleanValue();
            }
            A7.b.f717b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                A7.b.f717b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    A7.b.f717b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    A7.b.f717b = Boolean.FALSE;
                }
            }
            A7.b.f716a = applicationContext;
            z10 = A7.b.f717b.booleanValue();
        }
        if (z10) {
            return false;
        }
        int i11 = c5680b.f45761Z;
        if (i11 == 0 || (pendingIntent2 = c5680b.f45762h0) == null) {
            Intent a5 = eVar.a(i11, context, null);
            if (a5 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a5, 201326592);
            }
            pendingIntent2 = pendingIntent;
        }
        if (pendingIntent2 == null) {
            return false;
        }
        int i12 = c5680b.f45761Z;
        int i13 = GoogleApiActivity.f26798Z;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent2);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", true);
        eVar.f(context, i12, PendingIntent.getActivity(context, 0, intent, H7.c.f7477a | 134217728));
        return true;
    }

    public final s d(u7.g gVar) {
        ConcurrentHashMap concurrentHashMap = this.f47310o0;
        C5983a c5983a = gVar.f46460e;
        s sVar = (s) concurrentHashMap.get(c5983a);
        if (sVar == null) {
            sVar = new s(this, gVar);
            concurrentHashMap.put(c5983a, sVar);
        }
        if (sVar.f47329b.g()) {
            this.f47312q0.add(c5983a);
        }
        sVar.l();
        return sVar;
    }

    public final void f(C5680b c5680b, int i10) {
        if (!b(c5680b, i10)) {
            H7.d dVar = this.f47313r0;
            dVar.sendMessage(dVar.obtainMessage(5, i10, 0, c5680b));
        }
    }

    /* JADX WARN: Type inference failed for: r2v22, types: [y7.c, u7.g] */
    /* JADX WARN: Type inference failed for: r2v37, types: [y7.c, u7.g] */
    /* JADX WARN: Type inference failed for: r3v14, types: [y7.c, u7.g] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        s sVar;
        Status status;
        C5682d[] g10;
        int i10 = message.what;
        long j6 = 300000;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j6 = 10000;
                }
                this.f47301Y = j6;
                this.f47313r0.removeMessages(12);
                for (C5983a c5983a : this.f47310o0.keySet()) {
                    H7.d dVar = this.f47313r0;
                    dVar.sendMessageDelayed(dVar.obtainMessage(12, c5983a), this.f47301Y);
                }
                break;
            case 2:
                AbstractC2469q0.p(message.obj);
                throw null;
            case 3:
                for (s sVar2 : this.f47310o0.values()) {
                    A7.b.h0(sVar2.f47340m.f47313r0);
                    sVar2.f47338k = null;
                    sVar2.l();
                }
                break;
            case 4:
            case 8:
            case 13:
                C5980A c5980a = (C5980A) message.obj;
                s sVar3 = (s) this.f47310o0.get(c5980a.f47264c.f46460e);
                if (sVar3 == null) {
                    sVar3 = d(c5980a.f47264c);
                }
                if (sVar3.f47329b.g() && this.f47309n0.get() != c5980a.f47263b) {
                    c5980a.f47262a.a(f47297t0);
                    sVar3.p();
                    break;
                } else {
                    sVar3.m(c5980a.f47262a);
                    break;
                }
                break;
            case 5:
                int i11 = message.arg1;
                C5680b c5680b = (C5680b) message.obj;
                Iterator it = this.f47310o0.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        sVar = (s) it.next();
                        if (sVar.f47334g == i11) {
                        }
                    } else {
                        sVar = null;
                    }
                }
                if (sVar != null) {
                    int i12 = c5680b.f45761Z;
                    if (i12 == 13) {
                        this.f47306k0.getClass();
                        AtomicBoolean atomicBoolean = t7.i.f45775a;
                        sVar.b(new Status(17, android.gov.nist.core.a.k("Error resolution was canceled by the user, original error message: ", C5680b.c(i12), ": ", c5680b.f45763i0), null, null));
                        break;
                    } else {
                        sVar.b(c(sVar.f47330c, c5680b));
                        break;
                    }
                } else {
                    AbstractC3612c.u("GoogleApiManager", AbstractC4194d.v("Could not find API instance ", i11, " while trying to fail enqueued calls."), new Exception());
                    break;
                }
            case 6:
                if (this.f47305j0.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f47305j0.getApplicationContext();
                    ComponentCallbacks2C5984b componentCallbacks2C5984b = ComponentCallbacks2C5984b.f47292j0;
                    synchronized (componentCallbacks2C5984b) {
                        try {
                            if (!componentCallbacks2C5984b.f47296i0) {
                                application.registerActivityLifecycleCallbacks(componentCallbacks2C5984b);
                                application.registerComponentCallbacks(componentCallbacks2C5984b);
                                componentCallbacks2C5984b.f47296i0 = true;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    componentCallbacks2C5984b.a(new q(this));
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C5984b.f47294Z;
                    boolean z10 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = componentCallbacks2C5984b.f47293Y;
                    if (!z10) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f47301Y = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                d((u7.g) message.obj);
                break;
            case 9:
                if (this.f47310o0.containsKey(message.obj)) {
                    s sVar4 = (s) this.f47310o0.get(message.obj);
                    A7.b.h0(sVar4.f47340m.f47313r0);
                    if (sVar4.f47336i) {
                        sVar4.l();
                        break;
                    }
                }
                break;
            case 10:
                C6060g c6060g = this.f47312q0;
                c6060g.getClass();
                C6055b c6055b = new C6055b(c6060g);
                while (c6055b.hasNext()) {
                    s sVar5 = (s) this.f47310o0.remove((C5983a) c6055b.next());
                    if (sVar5 != null) {
                        sVar5.p();
                    }
                }
                this.f47312q0.clear();
                break;
            case 11:
                if (this.f47310o0.containsKey(message.obj)) {
                    s sVar6 = (s) this.f47310o0.get(message.obj);
                    C5987e c5987e = sVar6.f47340m;
                    A7.b.h0(c5987e.f47313r0);
                    boolean z11 = sVar6.f47336i;
                    if (z11) {
                        if (z11) {
                            C5987e c5987e2 = sVar6.f47340m;
                            H7.d dVar2 = c5987e2.f47313r0;
                            C5983a c5983a2 = sVar6.f47330c;
                            dVar2.removeMessages(11, c5983a2);
                            c5987e2.f47313r0.removeMessages(9, c5983a2);
                            sVar6.f47336i = false;
                        }
                        if (c5987e.f47306k0.b(c5987e.f47305j0, t7.f.f45772a) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null);
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.", null, null);
                        }
                        sVar6.b(status);
                        sVar6.f47329b.c("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (this.f47310o0.containsKey(message.obj)) {
                    s sVar7 = (s) this.f47310o0.get(message.obj);
                    A7.b.h0(sVar7.f47340m.f47313r0);
                    AbstractC6134f abstractC6134f = sVar7.f47329b;
                    if (abstractC6134f.p() && sVar7.f47333f.isEmpty()) {
                        C3636c1 c3636c1 = sVar7.f47331d;
                        if (((Map) c3636c1.f34285Z).isEmpty() && ((Map) c3636c1.f34286h0).isEmpty()) {
                            abstractC6134f.c("Timing out service connection.");
                            break;
                        } else {
                            sVar7.i();
                            break;
                        }
                    }
                }
                break;
            case 14:
                AbstractC2469q0.p(message.obj);
                throw null;
            case 15:
                t tVar = (t) message.obj;
                if (this.f47310o0.containsKey(tVar.f47341a)) {
                    s sVar8 = (s) this.f47310o0.get(tVar.f47341a);
                    if (sVar8.f47337j.contains(tVar) && !sVar8.f47336i) {
                        if (!sVar8.f47329b.p()) {
                            sVar8.l();
                            break;
                        } else {
                            sVar8.d();
                            break;
                        }
                    }
                }
                break;
            case 16:
                t tVar2 = (t) message.obj;
                if (this.f47310o0.containsKey(tVar2.f47341a)) {
                    s sVar9 = (s) this.f47310o0.get(tVar2.f47341a);
                    if (sVar9.f47337j.remove(tVar2)) {
                        C5987e c5987e3 = sVar9.f47340m;
                        c5987e3.f47313r0.removeMessages(15, tVar2);
                        c5987e3.f47313r0.removeMessages(16, tVar2);
                        C5682d c5682d = tVar2.f47342b;
                        LinkedList<G> linkedList = sVar9.f47328a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (G g11 : linkedList) {
                            if ((g11 instanceof x) && (g10 = ((x) g11).g(sVar9)) != null) {
                                int length = g10.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length) {
                                        break;
                                    } else if (M3.H.P(g10[i13], c5682d)) {
                                        if (i13 >= 0) {
                                            arrayList.add(g11);
                                        }
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            G g12 = (G) arrayList.get(i14);
                            linkedList.remove(g12);
                            g12.b(new u7.n(c5682d));
                        }
                        break;
                    }
                }
                break;
            case 17:
                w7.l lVar = this.f47303h0;
                if (lVar != null) {
                    if (lVar.f48181Y > 0 || a()) {
                        if (this.f47304i0 == null) {
                            this.f47304i0 = new u7.g(this.f47305j0, y7.c.f50832k, w7.m.f48183Z, C5850f.f46453c);
                        }
                        y7.c cVar = this.f47304i0;
                        cVar.getClass();
                        l lVar2 = new l();
                        lVar2.f47316b = new C5682d[]{H7.b.f7475a};
                        lVar2.f47317c = false;
                        lVar2.f47319e = new y7.b(0, lVar);
                        cVar.b(2, lVar2.a());
                    }
                    this.f47303h0 = null;
                    break;
                }
                break;
            case 18:
                z zVar = (z) message.obj;
                if (zVar.f47360c == 0) {
                    w7.l lVar3 = new w7.l(zVar.f47359b, Arrays.asList(zVar.f47358a));
                    if (this.f47304i0 == null) {
                        this.f47304i0 = new u7.g(this.f47305j0, y7.c.f50832k, w7.m.f48183Z, C5850f.f46453c);
                    }
                    y7.c cVar2 = this.f47304i0;
                    cVar2.getClass();
                    l lVar4 = new l();
                    lVar4.f47316b = new C5682d[]{H7.b.f7475a};
                    lVar4.f47317c = false;
                    lVar4.f47319e = new y7.b(0, lVar3);
                    cVar2.b(2, lVar4.a());
                    break;
                } else {
                    w7.l lVar5 = this.f47303h0;
                    if (lVar5 != null) {
                        List list = lVar5.f48182Z;
                        if (lVar5.f48181Y == zVar.f47359b && (list == null || list.size() < zVar.f47361d)) {
                            w7.l lVar6 = this.f47303h0;
                            C6136h c6136h = zVar.f47358a;
                            if (lVar6.f48182Z == null) {
                                lVar6.f48182Z = new ArrayList();
                            }
                            lVar6.f48182Z.add(c6136h);
                        } else {
                            this.f47313r0.removeMessages(17);
                            w7.l lVar7 = this.f47303h0;
                            if (lVar7 != null) {
                                if (lVar7.f48181Y > 0 || a()) {
                                    if (this.f47304i0 == null) {
                                        this.f47304i0 = new u7.g(this.f47305j0, y7.c.f50832k, w7.m.f48183Z, C5850f.f46453c);
                                    }
                                    y7.c cVar3 = this.f47304i0;
                                    cVar3.getClass();
                                    l lVar8 = new l();
                                    lVar8.f47316b = new C5682d[]{H7.b.f7475a};
                                    lVar8.f47317c = false;
                                    lVar8.f47319e = new y7.b(0, lVar7);
                                    cVar3.b(2, lVar8.a());
                                }
                                this.f47303h0 = null;
                            }
                        }
                    }
                    if (this.f47303h0 == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(zVar.f47358a);
                        this.f47303h0 = new w7.l(zVar.f47359b, arrayList2);
                        H7.d dVar3 = this.f47313r0;
                        dVar3.sendMessageDelayed(dVar3.obtainMessage(17), zVar.f47360c);
                        break;
                    }
                }
                break;
            case 19:
                this.f47302Z = false;
                break;
            default:
                AbstractC3612c.r("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
        return true;
    }
}
