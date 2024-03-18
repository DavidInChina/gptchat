package N3;

import L3.C0889a;
import L3.C0892d;
import M3.AbstractC0935d;
import M3.C0934c;
import M3.D;
import M3.q;
import M3.s;
import M3.w;
import Ng.AbstractC1073l0;
import Q3.e;
import Q3.j;
import S3.m;
import U3.l;
import U3.u;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import q.RunnableC5216j;
import z1.RunnableC6742a;

/* loaded from: classes2.dex */
public final class c implements s, e, AbstractC0935d {

    /* renamed from: t0  reason: collision with root package name */
    public static final String f12690t0 = L3.s.f("GreedyScheduler");

    /* renamed from: Y  reason: collision with root package name */
    public final Context f12691Y;

    /* renamed from: h0  reason: collision with root package name */
    public final a f12693h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f12694i0;

    /* renamed from: l0  reason: collision with root package name */
    public final q f12697l0;

    /* renamed from: m0  reason: collision with root package name */
    public final D f12698m0;

    /* renamed from: n0  reason: collision with root package name */
    public final C0889a f12699n0;

    /* renamed from: p0  reason: collision with root package name */
    public Boolean f12701p0;

    /* renamed from: q0  reason: collision with root package name */
    public final j f12702q0;

    /* renamed from: r0  reason: collision with root package name */
    public final X3.b f12703r0;

    /* renamed from: s0  reason: collision with root package name */
    public final d f12704s0;

    /* renamed from: Z  reason: collision with root package name */
    public final HashMap f12692Z = new HashMap();

    /* renamed from: j0  reason: collision with root package name */
    public final Object f12695j0 = new Object();

    /* renamed from: k0  reason: collision with root package name */
    public final l f12696k0 = new l(9, 0);

    /* renamed from: o0  reason: collision with root package name */
    public final HashMap f12700o0 = new HashMap();

    public c(Context context, C0889a c0889a, m mVar, q qVar, D d10, X3.b bVar) {
        this.f12691Y = context;
        C0934c c0934c = c0889a.f10689f;
        this.f12693h0 = new a(this, c0934c, c0889a.f10686c);
        this.f12704s0 = new d(c0934c, d10);
        this.f12703r0 = bVar;
        this.f12702q0 = new j(mVar);
        this.f12699n0 = c0889a;
        this.f12697l0 = qVar;
        this.f12698m0 = d10;
    }

    @Override // M3.AbstractC0935d
    public final void a(U3.j jVar, boolean z10) {
        w n10 = this.f12696k0.n(jVar);
        if (n10 != null) {
            this.f12704s0.a(n10);
        }
        f(jVar);
        if (!z10) {
            synchronized (this.f12695j0) {
                this.f12700o0.remove(jVar);
            }
        }
    }

    @Override // M3.s
    public final boolean b() {
        return false;
    }

    @Override // M3.s
    public final void c(String str) {
        Runnable runnable;
        if (this.f12701p0 == null) {
            this.f12701p0 = Boolean.valueOf(V3.m.a(this.f12691Y, this.f12699n0));
        }
        boolean booleanValue = this.f12701p0.booleanValue();
        String str2 = f12690t0;
        if (!booleanValue) {
            L3.s.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f12694i0) {
            this.f12697l0.a(this);
            this.f12694i0 = true;
        }
        L3.s d10 = L3.s.d();
        d10.a(str2, "Cancelling work ID " + str);
        a aVar = this.f12693h0;
        if (aVar != null && (runnable = (Runnable) aVar.f12687d.remove(str)) != null) {
            aVar.f12685b.f11565a.removeCallbacks(runnable);
        }
        for (w wVar : this.f12696k0.o(str)) {
            this.f12704s0.a(wVar);
            D d11 = this.f12698m0;
            d11.getClass();
            d11.a(wVar, -512);
        }
    }

    @Override // M3.s
    public final void d(U3.q... qVarArr) {
        if (this.f12701p0 == null) {
            this.f12701p0 = Boolean.valueOf(V3.m.a(this.f12691Y, this.f12699n0));
        }
        if (!this.f12701p0.booleanValue()) {
            L3.s.d().e(f12690t0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f12694i0) {
            this.f12697l0.a(this);
            this.f12694i0 = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (U3.q qVar : qVarArr) {
            if (!this.f12696k0.j(Gi.e.y(qVar))) {
                long max = Math.max(qVar.a(), g(qVar));
                this.f12699n0.f10686c.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (qVar.f17451b == 1) {
                    if (currentTimeMillis < max) {
                        a aVar = this.f12693h0;
                        if (aVar != null) {
                            HashMap hashMap = aVar.f12687d;
                            Runnable runnable = (Runnable) hashMap.remove(qVar.f17450a);
                            C0934c c0934c = aVar.f12685b;
                            if (runnable != null) {
                                c0934c.f11565a.removeCallbacks(runnable);
                            }
                            RunnableC5216j runnableC5216j = new RunnableC5216j(aVar, 10, qVar);
                            hashMap.put(qVar.f17450a, runnableC5216j);
                            aVar.f12686c.getClass();
                            c0934c.f11565a.postDelayed(runnableC5216j, max - System.currentTimeMillis());
                        }
                    } else if (qVar.b()) {
                        int i10 = Build.VERSION.SDK_INT;
                        C0892d c0892d = qVar.f17459j;
                        if (c0892d.f10701c) {
                            L3.s.d().a(f12690t0, "Ignoring " + qVar + ". Requires device idle.");
                        } else if (i10 >= 24 && c0892d.a()) {
                            L3.s.d().a(f12690t0, "Ignoring " + qVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(qVar);
                            hashSet2.add(qVar.f17450a);
                        }
                    } else if (!this.f12696k0.j(Gi.e.y(qVar))) {
                        L3.s.d().a(f12690t0, "Starting work for " + qVar.f17450a);
                        l lVar = this.f12696k0;
                        lVar.getClass();
                        w p10 = lVar.p(Gi.e.y(qVar));
                        this.f12704s0.b(p10);
                        D d10 = this.f12698m0;
                        d10.f11513b.a(new RunnableC6742a(d10.f11512a, p10, (u) null));
                    }
                }
            }
        }
        synchronized (this.f12695j0) {
            try {
                if (!hashSet.isEmpty()) {
                    String join = TextUtils.join(Separators.COMMA, hashSet2);
                    L3.s.d().a(f12690t0, "Starting tracking for " + join);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        U3.q qVar2 = (U3.q) it.next();
                        U3.j y10 = Gi.e.y(qVar2);
                        if (!this.f12692Z.containsKey(y10)) {
                            this.f12692Z.put(y10, Q3.l.a(this.f12702q0, qVar2, this.f12703r0.f21780b, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Q3.e
    public final void e(U3.q qVar, Q3.c cVar) {
        U3.j y10 = Gi.e.y(qVar);
        boolean z10 = cVar instanceof Q3.a;
        D d10 = this.f12698m0;
        d dVar = this.f12704s0;
        String str = f12690t0;
        l lVar = this.f12696k0;
        if (z10) {
            if (!lVar.j(y10)) {
                L3.s d11 = L3.s.d();
                d11.a(str, "Constraints met: Scheduling work ID " + y10);
                w p10 = lVar.p(y10);
                dVar.b(p10);
                d10.f11513b.a(new RunnableC6742a(d10.f11512a, p10, (u) null));
                return;
            }
            return;
        }
        L3.s d12 = L3.s.d();
        d12.a(str, "Constraints not met: Cancelling work ID " + y10);
        w n10 = lVar.n(y10);
        if (n10 != null) {
            dVar.a(n10);
            d10.a(n10, ((Q3.b) cVar).f14403a);
        }
    }

    public final void f(U3.j jVar) {
        AbstractC1073l0 abstractC1073l0;
        synchronized (this.f12695j0) {
            abstractC1073l0 = (AbstractC1073l0) this.f12692Z.remove(jVar);
        }
        if (abstractC1073l0 != null) {
            L3.s d10 = L3.s.d();
            String str = f12690t0;
            d10.a(str, "Stopping tracking for " + jVar);
            abstractC1073l0.k(null);
        }
    }

    public final long g(U3.q qVar) {
        long max;
        synchronized (this.f12695j0) {
            try {
                U3.j y10 = Gi.e.y(qVar);
                b bVar = (b) this.f12700o0.get(y10);
                if (bVar == null) {
                    int i10 = qVar.f17460k;
                    this.f12699n0.f10686c.getClass();
                    bVar = new b(i10, System.currentTimeMillis());
                    this.f12700o0.put(y10, bVar);
                }
                max = (Math.max((qVar.f17460k - bVar.f12688a) - 5, 0) * 30000) + bVar.f12689b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return max;
    }
}
