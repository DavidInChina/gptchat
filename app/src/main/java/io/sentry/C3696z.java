package io.sentry;

import id.AbstractC3557B;
import io.sentry.protocol.C3676c;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import u5.RunnableC5841a;

/* renamed from: io.sentry.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3696z implements G {

    /* renamed from: a  reason: collision with root package name */
    public final r1 f34851a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f34852b;

    /* renamed from: c  reason: collision with root package name */
    public final U3.e f34853c;

    /* renamed from: d  reason: collision with root package name */
    public final H1 f34854d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f34855e = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: f  reason: collision with root package name */
    public final K1 f34856f;

    public C3696z(r1 r1Var, U3.e eVar) {
        Ad.l.Z0("SentryOptions is required.", r1Var);
        if (r1Var.getDsn() != null && !r1Var.getDsn().isEmpty()) {
            this.f34851a = r1Var;
            this.f34854d = new H1(r1Var);
            this.f34853c = eVar;
            io.sentry.protocol.s sVar = io.sentry.protocol.s.f34619Z;
            this.f34856f = r1Var.getTransactionPerformanceCollector();
            this.f34852b = true;
            return;
        }
        throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s A(T0 t02) {
        return w(t02, new C3686u());
    }

    @Override // io.sentry.G
    public final void B() {
        U3.l lVar;
        String str;
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        D1 B10 = this.f34853c.B();
        D0 d02 = (D0) B10.f33782c;
        synchronized (d02.f33774m) {
            try {
                if (d02.f33773l != null) {
                    y1 y1Var = d02.f33773l;
                    y1Var.getClass();
                    y1Var.b(r.f.A());
                }
                y1 y1Var2 = d02.f33773l;
                lVar = null;
                y1 y1Var3 = null;
                if (d02.f33772k.getRelease() != null) {
                    String distinctId = d02.f33772k.getDistinctId();
                    io.sentry.protocol.C c10 = d02.f33765d;
                    String environment = d02.f33772k.getEnvironment();
                    String release = d02.f33772k.getRelease();
                    x1 x1Var = x1.Ok;
                    Date A10 = r.f.A();
                    Date A11 = r.f.A();
                    UUID randomUUID = UUID.randomUUID();
                    Boolean bool = Boolean.TRUE;
                    if (c10 != null) {
                        str = c10.f34474j0;
                    } else {
                        str = null;
                    }
                    d02.f33773l = new y1(x1Var, A10, A11, 0, distinctId, randomUUID, bool, null, null, str, null, environment, release, null);
                    if (y1Var2 != null) {
                        y1Var3 = y1Var2.clone();
                    }
                    lVar = new U3.l(d02.f33773l.clone(), y1Var3);
                } else {
                    d02.f33772k.getLogger().f(EnumC3642e1.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (lVar != null) {
            if (((y1) lVar.f17423Z) != null) {
                B10.f33781b.e((y1) lVar.f17423Z, AbstractC3557B.t0(new Object()));
            }
            B10.f33781b.e((y1) lVar.f17424h0, AbstractC3557B.t0(new io.sentry.hints.i(0)));
            return;
        }
        this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Session could not be started.", new Object[0]);
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s C(Z0 z02, C3686u c3686u) {
        io.sentry.protocol.s sVar = io.sentry.protocol.s.f34619Z;
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return sVar;
        }
        try {
            b(z02);
            D1 B10 = this.f34853c.B();
            return B10.f33781b.d(c3686u, B10.f33782c, z02);
        } catch (Throwable th2) {
            H logger = this.f34851a.getLogger();
            EnumC3642e1 enumC3642e1 = EnumC3642e1.ERROR;
            logger.d(enumC3642e1, "Error while capturing event with id: " + z02.f33836Y, th2);
            return sVar;
        }
    }

    @Override // io.sentry.G
    public final void a(String str, String str2) {
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str != null && str2 != null) {
            D0 d02 = (D0) this.f34853c.B().f33782c;
            ConcurrentHashMap concurrentHashMap = d02.f33769h;
            concurrentHashMap.put(str, str2);
            for (O o10 : d02.f33772k.getScopeObservers()) {
                o10.a(str, str2);
                o10.b(concurrentHashMap);
            }
        } else {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "setTag called with null parameter.", new Object[0]);
        }
    }

    public final void b(Z0 z02) {
        Throwable th2;
        S s10;
        if (this.f34851a.isTracingEnabled()) {
            Throwable th3 = z02.f33845o0;
            if (th3 instanceof io.sentry.exception.a) {
                th2 = ((io.sentry.exception.a) th3).f34327Z;
            } else {
                th2 = th3;
            }
            if (th2 != null) {
                if (th3 instanceof io.sentry.exception.a) {
                    th3 = ((io.sentry.exception.a) th3).f34327Z;
                }
                Ad.l.Z0("throwable cannot be null", th3);
                while (th3.getCause() != null && th3.getCause() != th3) {
                    th3 = th3.getCause();
                }
                io.sentry.util.c cVar = (io.sentry.util.c) this.f34855e.get(th3);
                if (cVar != null) {
                    WeakReference weakReference = (WeakReference) cVar.f34773a;
                    C3676c c3676c = z02.f33837Z;
                    if (c3676c.a() == null && weakReference != null && (s10 = (S) weakReference.get()) != null) {
                        c3676c.b(s10.s());
                    }
                    String str = (String) cVar.f34774b;
                    if (z02.f33895A0 == null && str != null) {
                        z02.f33895A0 = str;
                    }
                }
            }
        }
    }

    @Override // io.sentry.G
    public final void c(boolean z10) {
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (X x10 : this.f34851a.getIntegrations()) {
                if (x10 instanceof Closeable) {
                    try {
                        ((Closeable) x10).close();
                    } catch (IOException e10) {
                        this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Failed to close the integration {}.", x10, e10);
                    }
                }
            }
            p(new A9.a(22));
            this.f34851a.getTransactionProfiler().close();
            this.f34851a.getTransactionPerformanceCollector().close();
            P executorService = this.f34851a.getExecutorService();
            if (z10) {
                executorService.submit(new RunnableC5841a(this, 13, executorService));
            } else {
                executorService.c(this.f34851a.getShutdownTimeoutMillis());
            }
            this.f34853c.B().f33781b.g(z10);
        } catch (Throwable th2) {
            this.f34851a.getLogger().d(EnumC3642e1.ERROR, "Error while closing the Hub.", th2);
        }
        this.f34852b = false;
    }

    @Override // io.sentry.G
    public final io.sentry.transport.o e() {
        return this.f34853c.B().f33781b.f33852b.e();
    }

    @Override // io.sentry.G
    public final boolean g() {
        return this.f34853c.B().f33781b.f33852b.g();
    }

    @Override // io.sentry.G
    public final void h(io.sentry.protocol.C c10) {
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
            return;
        }
        D0 d02 = (D0) this.f34853c.B().f33782c;
        d02.f33765d = c10;
        for (O o10 : d02.f33772k.getScopeObservers()) {
            o10.h(c10);
        }
    }

    @Override // io.sentry.G
    public final void i(C3640e c3640e) {
        o(c3640e, new C3686u());
    }

    @Override // io.sentry.G
    public final boolean isEnabled() {
        return this.f34852b;
    }

    @Override // io.sentry.G
    public final void l(long j6) {
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f34853c.B().f33781b.f33852b.l(j6);
        } catch (Throwable th2) {
            this.f34851a.getLogger().d(EnumC3642e1.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.G
    public final T m(I1 i12, J1 j12) {
        w1 w1Var;
        boolean z10 = this.f34852b;
        C3687u0 c3687u0 = C3687u0.f34769a;
        if (!z10) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            w1Var = c3687u0;
        } else if (!this.f34851a.getInstrumenter().equals(i12.f33806t0)) {
            this.f34851a.getLogger().f(EnumC3642e1.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", i12.f33806t0, this.f34851a.getInstrumenter());
            w1Var = c3687u0;
        } else if (!this.f34851a.isTracingEnabled()) {
            this.f34851a.getLogger().f(EnumC3642e1.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            w1Var = c3687u0;
        } else {
            U3.n a5 = this.f34854d.a(new U3.e(i12));
            i12.f33717i0 = a5;
            w1 w1Var2 = new w1(i12, this, j12, this.f34856f);
            w1Var = w1Var2;
            if (((Boolean) a5.f17426Y).booleanValue()) {
                w1Var = w1Var2;
                if (((Boolean) a5.f17428h0).booleanValue()) {
                    U transactionProfiler = this.f34851a.getTransactionProfiler();
                    if (!transactionProfiler.isRunning()) {
                        transactionProfiler.start();
                        transactionProfiler.b(w1Var2);
                        w1Var = w1Var2;
                    } else {
                        w1Var = w1Var2;
                        if (j12.f33810e) {
                            transactionProfiler.b(w1Var2);
                            w1Var = w1Var2;
                        }
                    }
                }
            }
        }
        return w1Var;
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s n(io.sentry.protocol.z zVar, G1 g1, C3686u c3686u) {
        return y(zVar, g1, c3686u, null);
    }

    @Override // io.sentry.G
    public final void o(C3640e c3640e, C3686u c3686u) {
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
            return;
        }
        D0 d02 = (D0) this.f34853c.B().f33782c;
        d02.getClass();
        r1 r1Var = d02.f33772k;
        r1Var.getBeforeBreadcrumb();
        E1 e12 = d02.f33768g;
        e12.add(c3640e);
        for (O o10 : r1Var.getScopeObservers()) {
            o10.i(c3640e);
            o10.f(e12);
        }
    }

    @Override // io.sentry.G
    public final void p(E0 e02) {
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            e02.f(this.f34853c.B().f33782c);
        } catch (Throwable th2) {
            this.f34851a.getLogger().d(EnumC3642e1.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.G
    public final S q() {
        z1 l10;
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
            return null;
        }
        T t10 = ((D0) this.f34853c.B().f33782c).f33763b;
        if (t10 != null && (l10 = t10.l()) != null) {
            return l10;
        }
        return t10;
    }

    @Override // io.sentry.G
    public final void r(Throwable th2, S s10, String str) {
        Ad.l.Z0("throwable is required", th2);
        Ad.l.Z0("span is required", s10);
        Ad.l.Z0("transactionName is required", str);
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        Map map = this.f34855e;
        if (!map.containsKey(th2)) {
            map.put(th2, new io.sentry.util.c(new WeakReference(s10), str));
        }
    }

    @Override // io.sentry.G
    public final r1 s() {
        return this.f34853c.B().f33780a;
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s t(NullPointerException nullPointerException, C3686u c3686u) {
        io.sentry.protocol.s sVar = io.sentry.protocol.s.f34619Z;
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
            return sVar;
        }
        try {
            D1 B10 = this.f34853c.B();
            Z0 z02 = new Z0(nullPointerException);
            b(z02);
            return B10.f33781b.d(c3686u, B10.f33782c, z02);
        } catch (Throwable th2) {
            H logger = this.f34851a.getLogger();
            EnumC3642e1 enumC3642e1 = EnumC3642e1.ERROR;
            logger.d(enumC3642e1, "Error while capturing exception: " + nullPointerException.getMessage(), th2);
            return sVar;
        }
    }

    @Override // io.sentry.G
    public final void u(String str) {
        C3640e c3640e = new C3640e();
        c3640e.f34319Z = str;
        i(c3640e);
    }

    @Override // io.sentry.G
    public final T v() {
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
            return null;
        }
        return ((D0) this.f34853c.B().f33782c).f33763b;
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s w(T0 t02, C3686u c3686u) {
        io.sentry.protocol.s sVar = io.sentry.protocol.s.f34619Z;
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return sVar;
        }
        try {
            io.sentry.protocol.s c10 = this.f34853c.B().f33781b.c(t02, c3686u);
            if (c10 != null) {
                return c10;
            }
            return sVar;
        } catch (Throwable th2) {
            this.f34851a.getLogger().d(EnumC3642e1.ERROR, "Error while capturing envelope.", th2);
            return sVar;
        }
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s x(NullPointerException nullPointerException) {
        return t(nullPointerException, new C3686u());
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s y(io.sentry.protocol.z zVar, G1 g1, C3686u c3686u, B0 b02) {
        U3.n nVar;
        boolean z10;
        io.sentry.protocol.s sVar = io.sentry.protocol.s.f34619Z;
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return sVar;
        } else if (zVar.f34677w0 != null) {
            Boolean bool = Boolean.TRUE;
            A1 a5 = zVar.f33837Z.a();
            if (a5 == null) {
                nVar = null;
            } else {
                nVar = a5.f33717i0;
            }
            if (nVar == null) {
                z10 = false;
            } else {
                z10 = ((Boolean) nVar.f17426Y).booleanValue();
            }
            if (!bool.equals(Boolean.valueOf(z10))) {
                this.f34851a.getLogger().f(EnumC3642e1.DEBUG, "Transaction %s was dropped due to sampling decision.", zVar.f33836Y);
                if (this.f34851a.getBackpressureMonitor().a() > 0) {
                    this.f34851a.getClientReportRecorder().a(io.sentry.clientreport.d.BACKPRESSURE, EnumC3652i.Transaction);
                    return sVar;
                }
                this.f34851a.getClientReportRecorder().a(io.sentry.clientreport.d.SAMPLE_RATE, EnumC3652i.Transaction);
                return sVar;
            }
            try {
                D1 B10 = this.f34853c.B();
                return B10.f33781b.f(zVar, g1, B10.f33782c, c3686u, b02);
            } catch (Throwable th2) {
                this.f34851a.getLogger().d(EnumC3642e1.ERROR, "Error while capturing transaction with id: " + zVar.f33836Y, th2);
                return sVar;
            }
        } else {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", zVar.f33836Y);
            return sVar;
        }
    }

    @Override // io.sentry.G
    public final void z() {
        y1 y1Var;
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        D1 B10 = this.f34853c.B();
        D0 d02 = (D0) B10.f33782c;
        synchronized (d02.f33774m) {
            try {
                y1Var = null;
                if (d02.f33773l != null) {
                    y1 y1Var2 = d02.f33773l;
                    y1Var2.getClass();
                    y1Var2.b(r.f.A());
                    y1 clone = d02.f33773l.clone();
                    d02.f33773l = null;
                    y1Var = clone;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (y1Var != null) {
            B10.f33781b.e(y1Var, AbstractC3557B.t0(new Object()));
        }
    }

    @Override // io.sentry.G
    /* renamed from: clone */
    public final G mo84clone() {
        if (!this.f34852b) {
            this.f34851a.getLogger().f(EnumC3642e1.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        r1 r1Var = this.f34851a;
        U3.e eVar = this.f34853c;
        U3.e eVar2 = new U3.e((H) eVar.f17401Z, new D1((D1) ((Deque) eVar.f17400Y).getLast()));
        Iterator descendingIterator = ((Deque) eVar.f17400Y).descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (descendingIterator.hasNext()) {
            ((Deque) eVar2.f17400Y).push(new D1((D1) descendingIterator.next()));
        }
        return new C3696z(r1Var, eVar2);
    }
}
