package io.sentry;

import A2.C0063g;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class z1 implements S {

    /* renamed from: a  reason: collision with root package name */
    public R0 f34859a;

    /* renamed from: b  reason: collision with root package name */
    public R0 f34860b;

    /* renamed from: c  reason: collision with root package name */
    public final A1 f34861c;

    /* renamed from: d  reason: collision with root package name */
    public final w1 f34862d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f34863e;

    /* renamed from: f  reason: collision with root package name */
    public final G f34864f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f34865g;

    /* renamed from: h  reason: collision with root package name */
    public final C0063g f34866h;

    /* renamed from: i  reason: collision with root package name */
    public t1 f34867i;

    /* renamed from: j  reason: collision with root package name */
    public final ConcurrentHashMap f34868j;

    /* renamed from: k  reason: collision with root package name */
    public final ConcurrentHashMap f34869k;

    public z1(io.sentry.protocol.s sVar, B1 b1, w1 w1Var, String str, G g10, R0 r02, C0063g c0063g, t1 t1Var) {
        this.f34865g = new AtomicBoolean(false);
        this.f34868j = new ConcurrentHashMap();
        this.f34869k = new ConcurrentHashMap();
        this.f34861c = new A1(sVar, new B1(), str, b1, w1Var.f34803b.f34861c.f33717i0);
        this.f34862d = w1Var;
        Ad.l.Z0("hub is required", g10);
        this.f34864f = g10;
        this.f34866h = c0063g;
        this.f34867i = t1Var;
        if (r02 != null) {
            this.f34859a = r02;
        } else {
            this.f34859a = g10.s().getDateProvider().e();
        }
    }

    @Override // io.sentry.S
    public final C1 a() {
        return this.f34861c.f33720l0;
    }

    @Override // io.sentry.S
    public final void b() {
        j(this.f34861c.f33720l0);
    }

    @Override // io.sentry.S
    public final void c(C1 c12) {
        this.f34861c.f33720l0 = c12;
    }

    @Override // io.sentry.S
    public final void e(String str, Object obj) {
        this.f34868j.put(str, obj);
    }

    @Override // io.sentry.S
    public final boolean f() {
        return this.f34865g.get();
    }

    @Override // io.sentry.S
    public final String getDescription() {
        return this.f34861c.f33719k0;
    }

    @Override // io.sentry.S
    public final boolean h(R0 r02) {
        if (this.f34860b != null) {
            this.f34860b = r02;
            return true;
        }
        return false;
    }

    @Override // io.sentry.S
    public final void i(Number number, String str) {
        if (this.f34865g.get()) {
            this.f34864f.s().getLogger().f(EnumC3642e1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f34869k.put(str, new io.sentry.protocol.j(number, null));
        w1 w1Var = this.f34862d;
        z1 z1Var = w1Var.f34803b;
        if (z1Var != this && !z1Var.f34869k.containsKey(str)) {
            w1Var.i(number, str);
        }
    }

    @Override // io.sentry.S
    public final void j(C1 c12) {
        u(c12, this.f34864f.s().getDateProvider().e());
    }

    @Override // io.sentry.S
    public final void m(String str) {
        this.f34861c.f33719k0 = str;
    }

    @Override // io.sentry.S
    public final void o(Exception exc) {
        this.f34863e = exc;
    }

    @Override // io.sentry.S
    public final S p(String str) {
        return v(str, null);
    }

    @Override // io.sentry.S
    public final void r(String str, Long l10, EnumC3665m0 enumC3665m0) {
        if (this.f34865g.get()) {
            this.f34864f.s().getLogger().f(EnumC3642e1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f34869k.put(str, new io.sentry.protocol.j(l10, enumC3665m0.apiName()));
        w1 w1Var = this.f34862d;
        z1 z1Var = w1Var.f34803b;
        if (z1Var != this && !z1Var.f34869k.containsKey(str)) {
            w1Var.r(str, l10, enumC3665m0);
        }
    }

    @Override // io.sentry.S
    public final A1 s() {
        return this.f34861c;
    }

    @Override // io.sentry.S
    public final R0 t() {
        return this.f34860b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.S
    public final void u(C1 c12, R0 r02) {
        R0 r03;
        R0 r04;
        if (!this.f34865g.compareAndSet(false, true)) {
            return;
        }
        A1 a12 = this.f34861c;
        a12.f33720l0 = c12;
        G g10 = this.f34864f;
        if (r02 == null) {
            r02 = g10.s().getDateProvider().e();
        }
        this.f34860b = r02;
        C0063g c0063g = this.f34866h;
        boolean z10 = c0063g.f551a;
        w1 w1Var = this.f34862d;
        if (z10 || c0063g.f552b) {
            B1 b1 = w1Var.f34803b.f34861c.f33715Z;
            B1 b12 = a12.f33715Z;
            boolean equals = b1.equals(b12);
            CopyOnWriteArrayList<z1> copyOnWriteArrayList = w1Var.f34804c;
            if (!equals) {
                ArrayList arrayList = new ArrayList();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    z1 z1Var = (z1) it.next();
                    B1 b13 = z1Var.f34861c.f33716h0;
                    if (b13 != null && b13.equals(b12)) {
                        arrayList.add(z1Var);
                    }
                }
                copyOnWriteArrayList = arrayList;
            }
            R0 r05 = null;
            R0 r06 = null;
            for (z1 z1Var2 : copyOnWriteArrayList) {
                if (r05 == null || z1Var2.f34859a.b(r05) < 0) {
                    r05 = z1Var2.f34859a;
                }
                if (r06 == null || ((r04 = z1Var2.f34860b) != null && r04.b(r06) > 0)) {
                    r06 = z1Var2.f34860b;
                }
            }
            if (c0063g.f551a && r05 != null && this.f34859a.b(r05) < 0) {
                this.f34859a = r05;
            }
            if (c0063g.f552b && r06 != null && ((r03 = this.f34860b) == null || r03.b(r06) > 0)) {
                h(r06);
            }
        }
        Throwable th2 = this.f34863e;
        if (th2 != null) {
            g10.r(th2, this, w1Var.f34806e);
        }
        t1 t1Var = this.f34867i;
        if (t1Var != null) {
            w1 w1Var2 = t1Var.f34725Y;
            K1 k12 = w1Var2.f34818q;
            if (k12 != null) {
                k12.a(this);
            }
            v1 v1Var = w1Var2.f34807f;
            J1 j12 = w1Var2.f34819r;
            if (j12.f33812g != null) {
                if (!j12.f33811f || w1Var2.C()) {
                    w1Var2.q();
                }
            } else if (v1Var.f34784a) {
                w1Var2.u(v1Var.f34785b, null);
            }
        }
    }

    @Override // io.sentry.S
    public final S v(String str, String str2) {
        if (this.f34865g.get()) {
            return C3685t0.f34724a;
        }
        B1 b1 = this.f34861c.f33715Z;
        w1 w1Var = this.f34862d;
        w1Var.getClass();
        return w1Var.A(b1, str, str2, null, W.SENTRY, new C0063g(1));
    }

    @Override // io.sentry.S
    public final R0 x() {
        return this.f34859a;
    }

    public z1(I1 i12, w1 w1Var, G g10, R0 r02, C0063g c0063g) {
        this.f34865g = new AtomicBoolean(false);
        this.f34868j = new ConcurrentHashMap();
        this.f34869k = new ConcurrentHashMap();
        this.f34861c = i12;
        Ad.l.Z0("sentryTracer is required", w1Var);
        this.f34862d = w1Var;
        Ad.l.Z0("hub is required", g10);
        this.f34864f = g10;
        this.f34867i = null;
        if (r02 != null) {
            this.f34859a = r02;
        } else {
            this.f34859a = g10.s().getDateProvider().e();
        }
        this.f34866h = c0063g;
    }
}
