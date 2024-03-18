package M3;

import L3.C0889a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p1.AbstractC5040e;
import p1.AbstractC5042g;

/* loaded from: classes2.dex */
public final class q implements T3.a {

    /* renamed from: l  reason: collision with root package name */
    public static final String f11583l = L3.s.f("Processor");

    /* renamed from: b  reason: collision with root package name */
    public final Context f11585b;

    /* renamed from: c  reason: collision with root package name */
    public final C0889a f11586c;

    /* renamed from: d  reason: collision with root package name */
    public final X3.b f11587d;

    /* renamed from: e  reason: collision with root package name */
    public final WorkDatabase f11588e;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f11590g = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f11589f = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final HashSet f11592i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f11593j = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public PowerManager.WakeLock f11584a = null;

    /* renamed from: k  reason: collision with root package name */
    public final Object f11594k = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f11591h = new HashMap();

    public q(Context context, C0889a c0889a, X3.b bVar, WorkDatabase workDatabase) {
        this.f11585b = context;
        this.f11586c = c0889a;
        this.f11587d = bVar;
        this.f11588e = workDatabase;
    }

    public static boolean e(String str, J j6, int i10) {
        if (j6 != null) {
            j6.f11562v0 = i10;
            j6.h();
            j6.f11561u0.cancel(true);
            if (j6.f11549i0 != null && (j6.f11561u0.f20718Y instanceof W3.a)) {
                j6.f11549i0.d(i10);
            } else {
                L3.s.d().a(J.f11545w0, "WorkSpec " + j6.f11548h0 + " is already done. Not interrupting.");
            }
            L3.s d10 = L3.s.d();
            String str2 = f11583l;
            d10.a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        L3.s d11 = L3.s.d();
        String str3 = f11583l;
        d11.a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(AbstractC0935d abstractC0935d) {
        synchronized (this.f11594k) {
            this.f11593j.add(abstractC0935d);
        }
    }

    public final J b(String str) {
        boolean z10;
        J j6 = (J) this.f11589f.remove(str);
        if (j6 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            j6 = (J) this.f11590g.remove(str);
        }
        this.f11591h.remove(str);
        if (z10) {
            synchronized (this.f11594k) {
                try {
                    if (!(true ^ this.f11589f.isEmpty())) {
                        Context context = this.f11585b;
                        String str2 = T3.c.f16891o0;
                        Intent intent = new Intent(context, SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        this.f11585b.startService(intent);
                        PowerManager.WakeLock wakeLock = this.f11584a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f11584a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return j6;
    }

    public final U3.q c(String str) {
        synchronized (this.f11594k) {
            try {
                J d10 = d(str);
                if (d10 != null) {
                    return d10.f11548h0;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final J d(String str) {
        J j6 = (J) this.f11589f.get(str);
        if (j6 == null) {
            return (J) this.f11590g.get(str);
        }
        return j6;
    }

    public final boolean f(String str) {
        boolean contains;
        synchronized (this.f11594k) {
            contains = this.f11592i.contains(str);
        }
        return contains;
    }

    public final boolean g(String str) {
        boolean z10;
        synchronized (this.f11594k) {
            if (d(str) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void h(AbstractC0935d abstractC0935d) {
        synchronized (this.f11594k) {
            this.f11593j.remove(abstractC0935d);
        }
    }

    public final void i(String str, L3.i iVar) {
        synchronized (this.f11594k) {
            try {
                L3.s d10 = L3.s.d();
                String str2 = f11583l;
                d10.e(str2, "Moving WorkSpec (" + str + ") to the foreground");
                J j6 = (J) this.f11590g.remove(str);
                if (j6 != null) {
                    if (this.f11584a == null) {
                        PowerManager.WakeLock a5 = V3.p.a(this.f11585b, "ProcessorForegroundLck");
                        this.f11584a = a5;
                        a5.acquire();
                    }
                    this.f11589f.put(str, j6);
                    Intent c10 = T3.c.c(this.f11585b, Gi.e.y(j6.f11548h0), iVar);
                    Context context = this.f11585b;
                    Object obj = AbstractC5042g.f41723a;
                    if (Build.VERSION.SDK_INT >= 26) {
                        AbstractC5040e.b(context, c10);
                    } else {
                        context.startService(c10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(w wVar, U3.u uVar) {
        final U3.j jVar = wVar.f11607a;
        String str = jVar.f17418a;
        ArrayList arrayList = new ArrayList();
        U3.q qVar = (U3.q) this.f11588e.m(new o(this, arrayList, str, 0));
        if (qVar == null) {
            L3.s d10 = L3.s.d();
            String str2 = f11583l;
            d10.g(str2, "Didn't find WorkSpec for id " + jVar);
            this.f11587d.f21782d.execute(new Runnable() { // from class: M3.p

                /* renamed from: h0  reason: collision with root package name */
                public final /* synthetic */ boolean f11582h0 = false;

                @Override // java.lang.Runnable
                public final void run() {
                    q qVar2 = q.this;
                    U3.j jVar2 = jVar;
                    boolean z10 = this.f11582h0;
                    synchronized (qVar2.f11594k) {
                        try {
                            Iterator it = qVar2.f11593j.iterator();
                            while (it.hasNext()) {
                                ((AbstractC0935d) it.next()).a(jVar2, z10);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            });
            return false;
        }
        synchronized (this.f11594k) {
            try {
                if (g(str)) {
                    Set set = (Set) this.f11591h.get(str);
                    if (((w) set.iterator().next()).f11607a.f17419b == jVar.f17419b) {
                        set.add(wVar);
                        L3.s d11 = L3.s.d();
                        String str3 = f11583l;
                        d11.a(str3, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        this.f11587d.f21782d.execute(new Runnable() { // from class: M3.p

                            /* renamed from: h0  reason: collision with root package name */
                            public final /* synthetic */ boolean f11582h0 = false;

                            @Override // java.lang.Runnable
                            public final void run() {
                                q qVar2 = q.this;
                                U3.j jVar2 = jVar;
                                boolean z10 = this.f11582h0;
                                synchronized (qVar2.f11594k) {
                                    try {
                                        Iterator it = qVar2.f11593j.iterator();
                                        while (it.hasNext()) {
                                            ((AbstractC0935d) it.next()).a(jVar2, z10);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        });
                    }
                    return false;
                } else if (qVar.f17469t != jVar.f17419b) {
                    this.f11587d.f21782d.execute(new Runnable() { // from class: M3.p

                        /* renamed from: h0  reason: collision with root package name */
                        public final /* synthetic */ boolean f11582h0 = false;

                        @Override // java.lang.Runnable
                        public final void run() {
                            q qVar2 = q.this;
                            U3.j jVar2 = jVar;
                            boolean z10 = this.f11582h0;
                            synchronized (qVar2.f11594k) {
                                try {
                                    Iterator it = qVar2.f11593j.iterator();
                                    while (it.hasNext()) {
                                        ((AbstractC0935d) it.next()).a(jVar2, z10);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    });
                    return false;
                } else {
                    I i10 = new I(this.f11585b, this.f11586c, this.f11587d, this, this.f11588e, qVar, arrayList);
                    if (uVar != null) {
                        i10.f11544i = uVar;
                    }
                    J j6 = new J(i10);
                    W3.i iVar = j6.f11560t0;
                    iVar.a(new Q1.n(this, iVar, j6, 13), this.f11587d.f21782d);
                    this.f11590g.put(str, j6);
                    HashSet hashSet = new HashSet();
                    hashSet.add(wVar);
                    this.f11591h.put(str, hashSet);
                    this.f11587d.f21779a.execute(j6);
                    L3.s d12 = L3.s.d();
                    String str4 = f11583l;
                    d12.a(str4, q.class.getSimpleName() + ": processing " + jVar);
                    return true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k(w wVar, int i10) {
        String str = wVar.f11607a.f17418a;
        synchronized (this.f11594k) {
            try {
                if (this.f11589f.get(str) != null) {
                    L3.s d10 = L3.s.d();
                    String str2 = f11583l;
                    d10.a(str2, "Ignored stopWork. WorkerWrapper " + str + " is in foreground");
                    return false;
                }
                Set set = (Set) this.f11591h.get(str);
                if (set != null && set.contains(wVar)) {
                    return e(str, b(str), i10);
                }
                return false;
            } finally {
            }
        }
    }
}
