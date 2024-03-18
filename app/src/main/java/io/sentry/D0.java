package io.sentry;

import V1.C1464e;
import i7.C3482a;
import io.sentry.protocol.C3676c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class D0 implements N {

    /* renamed from: a  reason: collision with root package name */
    public EnumC3642e1 f33762a;

    /* renamed from: b  reason: collision with root package name */
    public T f33763b;

    /* renamed from: c  reason: collision with root package name */
    public String f33764c;

    /* renamed from: d  reason: collision with root package name */
    public io.sentry.protocol.C f33765d;

    /* renamed from: e  reason: collision with root package name */
    public io.sentry.protocol.n f33766e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f33767f;

    /* renamed from: g  reason: collision with root package name */
    public final E1 f33768g;

    /* renamed from: h  reason: collision with root package name */
    public final ConcurrentHashMap f33769h;

    /* renamed from: i  reason: collision with root package name */
    public final ConcurrentHashMap f33770i;

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArrayList f33771j;

    /* renamed from: k  reason: collision with root package name */
    public final r1 f33772k;

    /* renamed from: l  reason: collision with root package name */
    public volatile y1 f33773l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f33774m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f33775n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f33776o;

    /* renamed from: p  reason: collision with root package name */
    public final C3676c f33777p;

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList f33778q;

    /* renamed from: r  reason: collision with root package name */
    public s3.z f33779r;

    public D0(r1 r1Var) {
        this.f33767f = new ArrayList();
        this.f33769h = new ConcurrentHashMap();
        this.f33770i = new ConcurrentHashMap();
        this.f33771j = new CopyOnWriteArrayList();
        this.f33774m = new Object();
        this.f33775n = new Object();
        this.f33776o = new Object();
        this.f33777p = new C3676c();
        this.f33778q = new CopyOnWriteArrayList();
        this.f33772k = r1Var;
        this.f33768g = new E1(new C3646g(r1Var.getMaxBreadcrumbs()));
        this.f33779r = new s3.z(7);
    }

    public final void a() {
        synchronized (this.f33775n) {
            this.f33763b = null;
        }
        this.f33764c = null;
        for (O o10 : this.f33772k.getScopeObservers()) {
            o10.e(null);
            o10.d(null);
        }
    }

    public final void b(T t10) {
        synchronized (this.f33775n) {
            try {
                this.f33763b = t10;
                for (O o10 : this.f33772k.getScopeObservers()) {
                    if (t10 != null) {
                        o10.e(t10.getName());
                        o10.d(t10.s());
                    } else {
                        o10.e(null);
                        o10.d(null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final s3.z c(C1464e c1464e) {
        s3.z zVar;
        synchronized (this.f33776o) {
            c1464e.h(this.f33779r);
            zVar = new s3.z(this.f33779r);
        }
        return zVar;
    }

    public final Object clone() {
        return new D0(this);
    }

    public final y1 d(C3482a c3482a) {
        y1 y1Var;
        synchronized (this.f33774m) {
            try {
                c3482a.a(this.f33773l);
                if (this.f33773l != null) {
                    y1Var = this.f33773l.clone();
                } else {
                    y1Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y1Var;
    }

    public final void e(C1464e c1464e) {
        synchronized (this.f33775n) {
            c1464e.g(this.f33763b);
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, io.sentry.protocol.n] */
    /* JADX WARN: Type inference failed for: r2v30, types: [io.sentry.protocol.C, java.lang.Object] */
    public D0(D0 d02) {
        io.sentry.protocol.C c10;
        this.f33767f = new ArrayList();
        this.f33769h = new ConcurrentHashMap();
        this.f33770i = new ConcurrentHashMap();
        this.f33771j = new CopyOnWriteArrayList();
        this.f33774m = new Object();
        this.f33775n = new Object();
        this.f33776o = new Object();
        this.f33777p = new C3676c();
        this.f33778q = new CopyOnWriteArrayList();
        this.f33763b = d02.f33763b;
        this.f33764c = d02.f33764c;
        this.f33773l = d02.f33773l;
        this.f33772k = d02.f33772k;
        this.f33762a = d02.f33762a;
        io.sentry.protocol.C c11 = d02.f33765d;
        io.sentry.protocol.n nVar = null;
        if (c11 != null) {
            ?? obj = new Object();
            obj.f34470Y = c11.f34470Y;
            obj.f34472h0 = c11.f34472h0;
            obj.f34471Z = c11.f34471Z;
            obj.f34474j0 = c11.f34474j0;
            obj.f34473i0 = c11.f34473i0;
            obj.f34475k0 = c11.f34475k0;
            obj.f34476l0 = c11.f34476l0;
            obj.f34477m0 = P4.a.p0(c11.f34477m0);
            obj.f34478n0 = P4.a.p0(c11.f34478n0);
            c10 = obj;
        } else {
            c10 = null;
        }
        this.f33765d = c10;
        io.sentry.protocol.n nVar2 = d02.f33766e;
        if (nVar2 != null) {
            ?? obj2 = new Object();
            obj2.f34584Y = nVar2.f34584Y;
            obj2.f34588j0 = nVar2.f34588j0;
            obj2.f34585Z = nVar2.f34585Z;
            obj2.f34586h0 = nVar2.f34586h0;
            obj2.f34589k0 = P4.a.p0(nVar2.f34589k0);
            obj2.f34590l0 = P4.a.p0(nVar2.f34590l0);
            obj2.f34592n0 = P4.a.p0(nVar2.f34592n0);
            obj2.f34595q0 = P4.a.p0(nVar2.f34595q0);
            obj2.f34587i0 = nVar2.f34587i0;
            obj2.f34593o0 = nVar2.f34593o0;
            obj2.f34591m0 = nVar2.f34591m0;
            obj2.f34594p0 = nVar2.f34594p0;
            nVar = obj2;
        }
        this.f33766e = nVar;
        this.f33767f = new ArrayList(d02.f33767f);
        this.f33771j = new CopyOnWriteArrayList(d02.f33771j);
        C3640e[] c3640eArr = (C3640e[]) d02.f33768g.toArray(new C3640e[0]);
        E1 e12 = new E1(new C3646g(d02.f33772k.getMaxBreadcrumbs()));
        for (C3640e c3640e : c3640eArr) {
            e12.add(new C3640e(c3640e));
        }
        this.f33768g = e12;
        ConcurrentHashMap concurrentHashMap = d02.f33769h;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f33769h = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = d02.f33770i;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.f33770i = concurrentHashMap4;
        this.f33777p = new C3676c(d02.f33777p);
        this.f33778q = new CopyOnWriteArrayList(d02.f33778q);
        this.f33779r = new s3.z(d02.f33779r);
    }
}
