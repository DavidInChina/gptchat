package y2;

import E2.AbstractC0469a;
import E2.AbstractC0490w;
import E2.AbstractC0493z;
import E2.C0485q;
import E2.C0487t;
import N.C1025i;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import s2.AbstractC5530A;
import z2.AbstractC6756a;
import z2.C6755D;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6755D f50523a;

    /* renamed from: e  reason: collision with root package name */
    public final C6510M f50527e;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC6756a f50530h;

    /* renamed from: i  reason: collision with root package name */
    public final s2.j f50531i;

    /* renamed from: k  reason: collision with root package name */
    public boolean f50533k;

    /* renamed from: l  reason: collision with root package name */
    public v2.F f50534l;

    /* renamed from: j  reason: collision with root package name */
    public E2.a0 f50532j = new E2.a0();

    /* renamed from: c  reason: collision with root package name */
    public final IdentityHashMap f50525c = new IdentityHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f50526d = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f50524b = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f50528f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f50529g = new HashSet();

    public c0(C6510M c6510m, AbstractC6756a abstractC6756a, s2.y yVar, C6755D c6755d) {
        this.f50523a = c6755d;
        this.f50527e = c6510m;
        this.f50530h = abstractC6756a;
        this.f50531i = yVar;
    }

    public final p2.g0 a(int i10, List list, E2.a0 a0Var) {
        if (!list.isEmpty()) {
            this.f50532j = a0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                b0 b0Var = (b0) list.get(i11 - i10);
                ArrayList arrayList = this.f50524b;
                if (i11 > 0) {
                    b0 b0Var2 = (b0) arrayList.get(i11 - 1);
                    b0Var.f50519d = b0Var2.f50516a.f4408o.f4386j0.q() + b0Var2.f50519d;
                    b0Var.f50520e = false;
                    b0Var.f50518c.clear();
                } else {
                    b0Var.f50519d = 0;
                    b0Var.f50520e = false;
                    b0Var.f50518c.clear();
                }
                int q10 = b0Var.f50516a.f4408o.f4386j0.q();
                for (int i12 = i11; i12 < arrayList.size(); i12++) {
                    ((b0) arrayList.get(i12)).f50519d += q10;
                }
                arrayList.add(i11, b0Var);
                this.f50526d.put(b0Var.f50517b, b0Var);
                if (this.f50533k) {
                    e(b0Var);
                    if (this.f50525c.isEmpty()) {
                        this.f50529g.add(b0Var);
                    } else {
                        a0 a0Var2 = (a0) this.f50528f.get(b0Var);
                        if (a0Var2 != null) {
                            a0Var2.f50513a.b(a0Var2.f50514b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final p2.g0 b() {
        ArrayList arrayList = this.f50524b;
        if (arrayList.isEmpty()) {
            return p2.g0.f42063Y;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            b0 b0Var = (b0) arrayList.get(i11);
            b0Var.f50519d = i10;
            i10 += b0Var.f50516a.f4408o.f4386j0.q();
        }
        return new h0(arrayList, this.f50532j);
    }

    public final void c() {
        Iterator it = this.f50529g.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (b0Var.f50518c.isEmpty()) {
                a0 a0Var = (a0) this.f50528f.get(b0Var);
                if (a0Var != null) {
                    a0Var.f50513a.b(a0Var.f50514b);
                }
                it.remove();
            }
        }
    }

    public final void d(b0 b0Var) {
        if (b0Var.f50520e && b0Var.f50518c.isEmpty()) {
            a0 a0Var = (a0) this.f50528f.remove(b0Var);
            a0Var.getClass();
            AbstractC0469a abstractC0469a = a0Var.f50513a;
            abstractC0469a.n(a0Var.f50514b);
            U3.c cVar = a0Var.f50515c;
            abstractC0469a.q(cVar);
            abstractC0469a.p(cVar);
            this.f50529g.remove(b0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [y2.W, E2.z] */
    /* JADX WARN: Type inference failed for: r4v2, types: [B2.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [E2.B, java.lang.Object] */
    public final void e(b0 b0Var) {
        C0487t c0487t = b0Var.f50516a;
        ?? r12 = new AbstractC0493z() { // from class: y2.W
            @Override // E2.AbstractC0493z
            public final void a(AbstractC0469a abstractC0469a, p2.g0 g0Var) {
                c0.this.f50527e.f50437m0.d(22);
            }
        };
        U3.c cVar = new U3.c(this, b0Var, 6);
        this.f50528f.put(b0Var, new a0(c0487t, r12, cVar));
        int i10 = AbstractC5530A.f45131a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        C1025i c1025i = c0487t.f4277c;
        c1025i.getClass();
        ?? obj = new Object();
        obj.f4126a = handler;
        obj.f4127b = cVar;
        ((CopyOnWriteArrayList) c1025i.f12352i0).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        B2.n nVar = c0487t.f4278d;
        nVar.getClass();
        ?? obj2 = new Object();
        obj2.f1811a = handler2;
        obj2.f1812b = cVar;
        nVar.f1815c.add(obj2);
        c0487t.j(r12, this.f50534l, this.f50523a);
    }

    public final void f(AbstractC0490w abstractC0490w) {
        IdentityHashMap identityHashMap = this.f50525c;
        b0 b0Var = (b0) identityHashMap.remove(abstractC0490w);
        b0Var.getClass();
        b0Var.f50516a.m(abstractC0490w);
        b0Var.f50518c.remove(((C0485q) abstractC0490w).f4394Y);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(b0Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f50524b;
            b0 b0Var = (b0) arrayList.remove(i12);
            this.f50526d.remove(b0Var.f50517b);
            int i13 = -b0Var.f50516a.f4408o.f4386j0.q();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((b0) arrayList.get(i14)).f50519d += i13;
            }
            b0Var.f50520e = true;
            if (this.f50533k) {
                d(b0Var);
            }
        }
    }
}
