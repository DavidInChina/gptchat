package io.sentry;

import A2.C0063g;
import i8.C3493k;
import io.sentry.android.core.C3617h;
import io.sentry.protocol.C3676c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class w1 implements T {

    /* renamed from: b  reason: collision with root package name */
    public final z1 f34803b;

    /* renamed from: d  reason: collision with root package name */
    public final G f34805d;

    /* renamed from: e  reason: collision with root package name */
    public final String f34806e;

    /* renamed from: g  reason: collision with root package name */
    public volatile u1 f34808g;

    /* renamed from: h  reason: collision with root package name */
    public volatile u1 f34809h;

    /* renamed from: i  reason: collision with root package name */
    public volatile Timer f34810i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f34811j;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicBoolean f34813l;

    /* renamed from: m  reason: collision with root package name */
    public final C3634c f34814m;

    /* renamed from: n  reason: collision with root package name */
    public final io.sentry.protocol.B f34815n;

    /* renamed from: o  reason: collision with root package name */
    public final W f34816o;

    /* renamed from: q  reason: collision with root package name */
    public final K1 f34818q;

    /* renamed from: r  reason: collision with root package name */
    public final J1 f34819r;

    /* renamed from: a  reason: collision with root package name */
    public final io.sentry.protocol.s f34802a = new io.sentry.protocol.s((UUID) null);

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f34804c = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    public v1 f34807f = v1.f34783c;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicBoolean f34812k = new AtomicBoolean(false);

    /* renamed from: p  reason: collision with root package name */
    public final C3676c f34817p = new C3676c();

    public w1(I1 i12, G g10, J1 j12, K1 k12) {
        Boolean bool;
        this.f34810i = null;
        Object obj = new Object();
        this.f34811j = obj;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f34813l = atomicBoolean;
        Ad.l.Z0("hub is required", g10);
        z1 z1Var = new z1(i12, this, g10, j12.f33809d, j12);
        this.f34803b = z1Var;
        this.f34806e = i12.f33802p0;
        this.f34816o = i12.f33806t0;
        this.f34805d = g10;
        this.f34818q = k12;
        this.f34815n = i12.f33803q0;
        this.f34819r = j12;
        C3634c c3634c = i12.f33805s0;
        if (c3634c != null) {
            this.f34814m = c3634c;
        } else {
            this.f34814m = new C3634c(g10.s().getLogger());
        }
        if (k12 != null) {
            Boolean bool2 = Boolean.TRUE;
            U3.n nVar = z1Var.f34861c.f33717i0;
            if (nVar == null) {
                bool = null;
            } else {
                bool = (Boolean) nVar.f17428h0;
            }
            if (bool2.equals(bool)) {
                k12.i(this);
            }
        }
        if (j12.f33812g != null || j12.f33813h != null) {
            this.f34810i = new Timer(true);
            Long l10 = j12.f33813h;
            if (l10 != null) {
                synchronized (obj) {
                    try {
                        if (this.f34810i != null) {
                            y();
                            atomicBoolean.set(true);
                            this.f34809h = new u1(this, 1);
                            this.f34810i.schedule(this.f34809h, l10.longValue());
                        }
                    } finally {
                    }
                }
            }
            q();
        }
    }

    public final S A(B1 b1, String str, String str2, R0 r02, W w10, C0063g c0063g) {
        String str3;
        z1 z1Var = this.f34803b;
        boolean z10 = z1Var.f34865g.get();
        C3685t0 c3685t0 = C3685t0.f34724a;
        if (z10) {
            return c3685t0;
        }
        if (!this.f34816o.equals(w10)) {
            return c3685t0;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f34804c;
        int size = copyOnWriteArrayList.size();
        G g10 = this.f34805d;
        if (size < g10.s().getMaxSpans()) {
            Ad.l.Z0("parentSpanId is required", b1);
            z();
            z1 z1Var2 = new z1(z1Var.f34861c.f33714Y, b1, this, str, this.f34805d, r02, c0063g, new t1(this));
            z1Var2.f34861c.f33719k0 = str2;
            z1Var2.e("thread.id", String.valueOf(Thread.currentThread().getId()));
            if (g10.s().getMainThreadChecker().a()) {
                str3 = "main";
            } else {
                str3 = Thread.currentThread().getName();
            }
            z1Var2.e("thread.name", str3);
            copyOnWriteArrayList.add(z1Var2);
            K1 k12 = this.f34818q;
            if (k12 != null) {
                k12.d(z1Var2);
            }
            return z1Var2;
        }
        g10.s().getLogger().f(EnumC3642e1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return c3685t0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(C1 c12, R0 r02, boolean z10, C3686u c3686u) {
        List list;
        Boolean bool;
        B0 b02;
        C3617h c3617h;
        Boolean bool2;
        C1 c13;
        R0 r03 = this.f34803b.f34860b;
        if (r02 == null) {
            r02 = r03;
        }
        if (r02 == null) {
            r02 = this.f34805d.s().getDateProvider().e();
        }
        Iterator it = this.f34804c.iterator();
        while (it.hasNext()) {
            z1 z1Var = (z1) it.next();
            if (z1Var.f34866h.f553c) {
                if (c12 != null) {
                    c13 = c12;
                } else {
                    c13 = this.f34803b.f34861c.f33720l0;
                }
                z1Var.u(c13, r02);
            }
        }
        this.f34807f = new v1(true, c12);
        if (!this.f34803b.f34865g.get()) {
            if (!this.f34819r.f33811f || C()) {
                K1 k12 = this.f34818q;
                if (k12 != null) {
                    list = k12.g(this);
                } else {
                    list = null;
                }
                Boolean bool3 = Boolean.TRUE;
                U3.n nVar = this.f34803b.f34861c.f33717i0;
                if (nVar == null) {
                    bool = null;
                } else {
                    bool = (Boolean) nVar.f17426Y;
                }
                if (bool3.equals(bool)) {
                    U3.n nVar2 = this.f34803b.f34861c.f33717i0;
                    if (nVar2 == null) {
                        bool2 = null;
                    } else {
                        bool2 = (Boolean) nVar2.f17428h0;
                    }
                    if (bool3.equals(bool2)) {
                        b02 = this.f34805d.s().getTransactionProfiler().a(this, list, this.f34805d.s());
                        if (list != null) {
                            list.clear();
                        }
                        this.f34803b.u(this.f34807f.f34785b, r02);
                        this.f34805d.p(new t1(this));
                        io.sentry.protocol.z zVar = new io.sentry.protocol.z(this);
                        c3617h = this.f34819r.f33814i;
                        if (c3617h != null) {
                            c3617h.b(this);
                        }
                        if (this.f34810i != null) {
                            synchronized (this.f34811j) {
                                try {
                                    if (this.f34810i != null) {
                                        z();
                                        y();
                                        this.f34810i.cancel();
                                        this.f34810i = null;
                                    }
                                } finally {
                                }
                            }
                        }
                        if (!z10 && this.f34804c.isEmpty() && this.f34819r.f33812g != null) {
                            this.f34805d.s().getLogger().f(EnumC3642e1.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f34806e);
                            return;
                        }
                        zVar.f34679y0.putAll(this.f34803b.f34869k);
                        this.f34805d.y(zVar, d(), c3686u, b02);
                    }
                }
                b02 = null;
                if (list != null) {
                }
                this.f34803b.u(this.f34807f.f34785b, r02);
                this.f34805d.p(new t1(this));
                io.sentry.protocol.z zVar2 = new io.sentry.protocol.z(this);
                c3617h = this.f34819r.f33814i;
                if (c3617h != null) {
                }
                if (this.f34810i != null) {
                }
                if (!z10) {
                }
                zVar2.f34679y0.putAll(this.f34803b.f34869k);
                this.f34805d.y(zVar2, d(), c3686u, b02);
            }
        }
    }

    public final boolean C() {
        ArrayList arrayList = new ArrayList(this.f34804c);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((z1) it.next()).f34865g.get()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final S D(String str, String str2, R0 r02, W w10, C0063g c0063g) {
        z1 z1Var = this.f34803b;
        boolean z10 = z1Var.f34865g.get();
        C3685t0 c3685t0 = C3685t0.f34724a;
        if (!z10 && this.f34816o.equals(w10)) {
            int size = this.f34804c.size();
            G g10 = this.f34805d;
            if (size < g10.s().getMaxSpans()) {
                if (!z1Var.f34865g.get()) {
                    return z1Var.f34862d.A(z1Var.f34861c.f33715Z, str, str2, r02, w10, c0063g);
                }
                return c3685t0;
            }
            g10.s().getLogger().f(EnumC3642e1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return c3685t0;
        }
        return c3685t0;
    }

    @Override // io.sentry.S
    public final C1 a() {
        return this.f34803b.f34861c.f33720l0;
    }

    @Override // io.sentry.S
    public final void b() {
        u(a(), null);
    }

    @Override // io.sentry.S
    public final void c(C1 c12) {
        String str;
        z1 z1Var = this.f34803b;
        if (z1Var.f34865g.get()) {
            H logger = this.f34805d.s().getLogger();
            EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
            Object[] objArr = new Object[1];
            if (c12 == null) {
                str = "null";
            } else {
                str = c12.name();
            }
            objArr[0] = str;
            logger.f(enumC3642e1, "The transaction is already finished. Status %s cannot be set", objArr);
            return;
        }
        z1Var.f34861c.f33720l0 = c12;
    }

    @Override // io.sentry.S
    public final G1 d() {
        if (this.f34805d.s().isTraceSampling()) {
            synchronized (this) {
                try {
                    if (this.f34814m.f34281c) {
                        AtomicReference atomicReference = new AtomicReference();
                        this.f34805d.p(new C3493k(2, atomicReference));
                        this.f34814m.e(this, (io.sentry.protocol.C) atomicReference.get(), this.f34805d.s(), this.f34803b.f34861c.f33717i0);
                        this.f34814m.f34281c = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return this.f34814m.f();
        }
        return null;
    }

    @Override // io.sentry.S
    public final void e(String str, Object obj) {
        z1 z1Var = this.f34803b;
        if (z1Var.f34865g.get()) {
            this.f34805d.s().getLogger().f(EnumC3642e1.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            z1Var.e(str, obj);
        }
    }

    @Override // io.sentry.S
    public final boolean f() {
        return this.f34803b.f34865g.get();
    }

    @Override // io.sentry.T
    public final void g(C1 c12, boolean z10, C3686u c3686u) {
        if (f()) {
            return;
        }
        R0 e10 = this.f34805d.s().getDateProvider().e();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f34804c;
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            z1 z1Var = (z1) listIterator.previous();
            z1Var.f34867i = null;
            z1Var.u(c12, e10);
        }
        B(c12, e10, z10, c3686u);
    }

    @Override // io.sentry.S
    public final String getDescription() {
        return this.f34803b.f34861c.f33719k0;
    }

    @Override // io.sentry.T
    public final String getName() {
        return this.f34806e;
    }

    @Override // io.sentry.S
    public final boolean h(R0 r02) {
        return this.f34803b.h(r02);
    }

    @Override // io.sentry.S
    public final void i(Number number, String str) {
        this.f34803b.i(number, str);
    }

    @Override // io.sentry.S
    public final void j(C1 c12) {
        u(c12, null);
    }

    @Override // io.sentry.S
    public final S k(String str, String str2, R0 r02, W w10) {
        return D(str, str2, r02, w10, new C0063g(1));
    }

    @Override // io.sentry.T
    public final z1 l() {
        ArrayList arrayList = new ArrayList(this.f34804c);
        if (!arrayList.isEmpty()) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((z1) arrayList.get(size)).f34865g.get()) {
                    return (z1) arrayList.get(size);
                }
            }
            return null;
        }
        return null;
    }

    @Override // io.sentry.S
    public final void m(String str) {
        z1 z1Var = this.f34803b;
        if (z1Var.f34865g.get()) {
            this.f34805d.s().getLogger().f(EnumC3642e1.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            z1Var.f34861c.f33719k0 = str;
        }
    }

    @Override // io.sentry.T
    public final io.sentry.protocol.s n() {
        return this.f34802a;
    }

    @Override // io.sentry.S
    public final void o(Exception exc) {
        z1 z1Var = this.f34803b;
        if (z1Var.f34865g.get()) {
            this.f34805d.s().getLogger().f(EnumC3642e1.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            z1Var.f34863e = exc;
        }
    }

    @Override // io.sentry.S
    public final S p(String str) {
        return v(str, null);
    }

    @Override // io.sentry.T
    public final void q() {
        Long l10;
        synchronized (this.f34811j) {
            try {
                if (this.f34810i != null && (l10 = this.f34819r.f33812g) != null) {
                    z();
                    this.f34812k.set(true);
                    this.f34808g = new u1(this, 0);
                    this.f34810i.schedule(this.f34808g, l10.longValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.sentry.S
    public final void r(String str, Long l10, EnumC3665m0 enumC3665m0) {
        this.f34803b.r(str, l10, enumC3665m0);
    }

    @Override // io.sentry.S
    public final A1 s() {
        return this.f34803b.f34861c;
    }

    @Override // io.sentry.S
    public final R0 t() {
        return this.f34803b.f34860b;
    }

    @Override // io.sentry.S
    public final void u(C1 c12, R0 r02) {
        B(c12, r02, true, null);
    }

    @Override // io.sentry.S
    public final S v(String str, String str2) {
        return D(str, str2, null, W.SENTRY, new C0063g(1));
    }

    @Override // io.sentry.T
    public final io.sentry.protocol.B w() {
        return this.f34815n;
    }

    @Override // io.sentry.S
    public final R0 x() {
        return this.f34803b.f34859a;
    }

    public final void y() {
        synchronized (this.f34811j) {
            try {
                if (this.f34809h != null) {
                    this.f34809h.cancel();
                    this.f34813l.set(false);
                    this.f34809h = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z() {
        synchronized (this.f34811j) {
            try {
                if (this.f34808g != null) {
                    this.f34808g.cancel();
                    this.f34812k.set(false);
                    this.f34808g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
