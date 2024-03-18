package androidx.work.impl;

import B3.d;
import B3.f;
import M3.B;
import M3.C;
import U3.b;
import U3.c;
import U3.e;
import U3.h;
import U3.i;
import U3.l;
import U3.m;
import U3.n;
import U3.s;
import U3.u;
import android.content.Context;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x3.C6269A;
import x3.y;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: l  reason: collision with root package name */
    public volatile s f25525l;

    /* renamed from: m  reason: collision with root package name */
    public volatile c f25526m;

    /* renamed from: n  reason: collision with root package name */
    public volatile u f25527n;

    /* renamed from: o  reason: collision with root package name */
    public volatile i f25528o;

    /* renamed from: p  reason: collision with root package name */
    public volatile l f25529p;

    /* renamed from: q  reason: collision with root package name */
    public volatile n f25530q;

    /* renamed from: r  reason: collision with root package name */
    public volatile e f25531r;

    @Override // x3.y
    public final x3.n d() {
        return new x3.n(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.h, java.lang.Object] */
    @Override // x3.y
    public final f e(x3.e eVar) {
        ?? obj = new Object();
        obj.f38770Z = this;
        obj.f38769Y = 20;
        C6269A c6269a = new C6269A(eVar, obj);
        Context context = eVar.f48671a;
        AbstractC3557B.c0("context", context);
        return eVar.f48673c.P(new d(context, eVar.f48672b, c6269a, false, false));
    }

    @Override // x3.y
    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new B(0), new C(0), new B(1), new B(2), new B(3), new C(1));
    }

    @Override // x3.y
    public final Set h() {
        return new HashSet();
    }

    @Override // x3.y
    public final Map i() {
        HashMap hashMap = new HashMap();
        hashMap.put(s.class, Collections.emptyList());
        hashMap.put(c.class, Collections.emptyList());
        hashMap.put(u.class, Collections.emptyList());
        hashMap.put(i.class, Collections.emptyList());
        hashMap.put(l.class, Collections.emptyList());
        hashMap.put(n.class, Collections.emptyList());
        hashMap.put(e.class, Collections.emptyList());
        hashMap.put(U3.f.class, Collections.emptyList());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c p() {
        c cVar;
        if (this.f25526m != null) {
            return this.f25526m;
        }
        synchronized (this) {
            try {
                if (this.f25526m == null) {
                    this.f25526m = new c(this);
                }
                cVar = this.f25526m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [U3.e, java.lang.Object] */
    @Override // androidx.work.impl.WorkDatabase
    public final e q() {
        e eVar;
        if (this.f25531r != null) {
            return this.f25531r;
        }
        synchronized (this) {
            try {
                if (this.f25531r == null) {
                    ?? obj = new Object();
                    obj.f17400Y = this;
                    obj.f17401Z = new b(obj, this, 1);
                    this.f25531r = obj;
                }
                eVar = this.f25531r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, U3.i] */
    @Override // androidx.work.impl.WorkDatabase
    public final i r() {
        i iVar;
        if (this.f25528o != null) {
            return this.f25528o;
        }
        synchronized (this) {
            try {
                if (this.f25528o == null) {
                    ?? obj = new Object();
                    obj.f17414Y = this;
                    obj.f17415Z = new b(obj, this, 2);
                    obj.f17416h0 = new h(obj, this, 0);
                    obj.f17417i0 = new h(obj, this, 1);
                    this.f25528o = obj;
                }
                iVar = this.f25528o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l s() {
        l lVar;
        if (this.f25529p != null) {
            return this.f25529p;
        }
        synchronized (this) {
            try {
                if (this.f25529p == null) {
                    this.f25529p = new l((y) this);
                }
                lVar = this.f25529p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [U3.n, java.lang.Object] */
    @Override // androidx.work.impl.WorkDatabase
    public final n t() {
        n nVar;
        if (this.f25530q != null) {
            return this.f25530q;
        }
        synchronized (this) {
            try {
                if (this.f25530q == null) {
                    ?? obj = new Object();
                    obj.f17426Y = this;
                    obj.f17427Z = new b(obj, this, 4);
                    obj.f17428h0 = new m(this, 0);
                    obj.f17429i0 = new m(this, 1);
                    this.f25530q = obj;
                }
                nVar = this.f25530q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s u() {
        s sVar;
        if (this.f25525l != null) {
            return this.f25525l;
        }
        synchronized (this) {
            try {
                if (this.f25525l == null) {
                    this.f25525l = new s(this);
                }
                sVar = this.f25525l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final u v() {
        u uVar;
        if (this.f25527n != null) {
            return this.f25527n;
        }
        synchronized (this) {
            try {
                if (this.f25527n == null) {
                    this.f25527n = new u(this);
                }
                uVar = this.f25527n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }
}
