package io.sentry.transport;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import i8.C3493k;
import id.AbstractC3557B;
import io.sentry.C3667n;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.EnumC3652i;
import io.sentry.H;
import io.sentry.M1;
import io.sentry.R0;
import io.sentry.S0;
import io.sentry.T0;
import io.sentry.ThreadFactoryC3690w;
import io.sentry.X0;
import io.sentry.r1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: Y  reason: collision with root package name */
    public final n f34734Y;

    /* renamed from: Z  reason: collision with root package name */
    public final io.sentry.cache.d f34735Z;

    /* renamed from: h0  reason: collision with root package name */
    public final r1 f34736h0;

    /* renamed from: i0  reason: collision with root package name */
    public final o f34737i0;

    /* renamed from: j0  reason: collision with root package name */
    public final i f34738j0;

    /* renamed from: k0  reason: collision with root package name */
    public final f f34739k0;

    /* renamed from: l0  reason: collision with root package name */
    public volatile Runnable f34740l0 = null;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public d(r1 r1Var, o oVar, i iVar, U3.c cVar) {
        int maxQueueSize = r1Var.getMaxQueueSize();
        final io.sentry.cache.d envelopeDiskCache = r1Var.getEnvelopeDiskCache();
        final H logger = r1Var.getLogger();
        S0 dateProvider = r1Var.getDateProvider();
        n nVar = new n(maxQueueSize, new ThreadFactoryC3690w((AbstractC2469q0) null), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof c) {
                    c cVar2 = (c) runnable;
                    boolean D12 = AbstractC3557B.D1(cVar2.f34730Z, io.sentry.hints.d.class);
                    C3686u c3686u = cVar2.f34730Z;
                    if (!D12) {
                        io.sentry.cache.d.this.X(cVar2.f34729Y, c3686u);
                    }
                    Object v12 = AbstractC3557B.v1(c3686u);
                    if (io.sentry.hints.j.class.isInstance(AbstractC3557B.v1(c3686u)) && v12 != null) {
                        ((io.sentry.hints.j) v12).b(false);
                    }
                    Object v13 = AbstractC3557B.v1(c3686u);
                    if (io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u)) && v13 != null) {
                        ((io.sentry.hints.g) v13).c(true);
                    }
                    logger.f(EnumC3642e1.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        f fVar = new f(r1Var, cVar, oVar);
        this.f34734Y = nVar;
        io.sentry.cache.d envelopeDiskCache2 = r1Var.getEnvelopeDiskCache();
        Ad.l.Z0("envelopeCache is required", envelopeDiskCache2);
        this.f34735Z = envelopeDiskCache2;
        this.f34736h0 = r1Var;
        this.f34737i0 = oVar;
        Ad.l.Z0("transportGate is required", iVar);
        this.f34738j0 = iVar;
        this.f34739k0 = fVar;
    }

    @Override // io.sentry.transport.h
    public final void L(T0 t02, C3686u c3686u) {
        boolean z10;
        io.sentry.cache.d dVar;
        T0 t03;
        EnumC3652i enumC3652i;
        boolean isInstance = io.sentry.hints.d.class.isInstance(AbstractC3557B.v1(c3686u));
        r1 r1Var = this.f34736h0;
        io.sentry.cache.d dVar2 = this.f34735Z;
        if (isInstance) {
            dVar = j.f34748Y;
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z10 = true;
        } else {
            z10 = false;
            dVar = dVar2;
        }
        o oVar = this.f34737i0;
        oVar.getClass();
        Iterable<X0> iterable = t02.f33865b;
        Iterator it = iterable.iterator();
        ArrayList arrayList = null;
        while (true) {
            boolean hasNext = it.hasNext();
            r1 r1Var2 = oVar.f34758b;
            if (hasNext) {
                X0 x02 = (X0) it.next();
                String itemType = x02.f33884a.f33890h0.getItemType();
                itemType.getClass();
                char c10 = '\uffff';
                switch (itemType.hashCode()) {
                    case -1963501277:
                        if (itemType.equals("attachment")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -309425751:
                        if (itemType.equals("profile")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 96891546:
                        if (itemType.equals("event")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1536888764:
                        if (itemType.equals("check_in")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1984987798:
                        if (itemType.equals(ParameterNames.SESSION)) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 2141246174:
                        if (itemType.equals("transaction")) {
                            c10 = 5;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        enumC3652i = EnumC3652i.Attachment;
                        break;
                    case 1:
                        enumC3652i = EnumC3652i.Profile;
                        break;
                    case 2:
                        enumC3652i = EnumC3652i.Error;
                        break;
                    case 3:
                        enumC3652i = EnumC3652i.Monitor;
                        break;
                    case 4:
                        enumC3652i = EnumC3652i.Session;
                        break;
                    case 5:
                        enumC3652i = EnumC3652i.Transaction;
                        break;
                    default:
                        enumC3652i = EnumC3652i.Unknown;
                        break;
                }
                if (oVar.b(enumC3652i)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(x02);
                    r1Var2.getClientReportRecorder().e(io.sentry.clientreport.d.RATELIMIT_BACKOFF, x02);
                }
            } else {
                if (arrayList != null) {
                    r1Var2.getLogger().f(EnumC3642e1.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
                    ArrayList arrayList2 = new ArrayList();
                    for (X0 x03 : iterable) {
                        if (!arrayList.contains(x03)) {
                            arrayList2.add(x03);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        r1Var2.getLogger().f(EnumC3642e1.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
                        Object v12 = AbstractC3557B.v1(c3686u);
                        if (io.sentry.hints.j.class.isInstance(AbstractC3557B.v1(c3686u)) && v12 != null) {
                            ((io.sentry.hints.j) v12).b(false);
                        }
                        Object v13 = AbstractC3557B.v1(c3686u);
                        if (io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u)) && v13 != null) {
                            ((io.sentry.hints.g) v13).c(false);
                        }
                        t03 = null;
                    } else {
                        t03 = new T0(t02.f33864a, arrayList2);
                    }
                } else {
                    t03 = t02;
                }
                if (t03 == null) {
                    if (z10) {
                        dVar2.t(t02);
                        return;
                    }
                    return;
                }
                if (M1.class.isInstance(AbstractC3557B.v1(c3686u))) {
                    t03 = r1Var.getClientReportRecorder().d(t03);
                }
                Future submit = this.f34734Y.submit(new c(this, t03, c3686u, dVar));
                if (submit != null && submit.isCancelled()) {
                    r1Var.getClientReportRecorder().b(io.sentry.clientreport.d.QUEUE_OVERFLOW, t03);
                    return;
                } else {
                    AbstractC3557B.q2(c3686u, C3667n.class, new C3493k(7, this));
                    return;
                }
            }
        }
    }

    @Override // io.sentry.transport.h
    public final void c(boolean z10) {
        long flushTimeoutMillis;
        this.f34734Y.shutdown();
        this.f34736h0.getLogger().f(EnumC3642e1.DEBUG, "Shutting down", new Object[0]);
        if (z10) {
            flushTimeoutMillis = 0;
        } else {
            try {
                flushTimeoutMillis = this.f34736h0.getFlushTimeoutMillis();
            } catch (InterruptedException unused) {
                this.f34736h0.getLogger().f(EnumC3642e1.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
                Thread.currentThread().interrupt();
                return;
            }
        }
        if (!this.f34734Y.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
            H logger = this.f34736h0.getLogger();
            EnumC3642e1 enumC3642e1 = EnumC3642e1.WARNING;
            logger.f(enumC3642e1, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f34734Y.shutdownNow();
            if (this.f34740l0 != null) {
                this.f34734Y.getRejectedExecutionHandler().rejectedExecution(this.f34740l0, this.f34734Y);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c(false);
    }

    @Override // io.sentry.transport.h
    public final o e() {
        return this.f34737i0;
    }

    @Override // io.sentry.transport.h
    public final boolean g() {
        boolean z10;
        boolean z11;
        o oVar = this.f34737i0;
        oVar.getClass();
        Date date = new Date(oVar.f34757a.getCurrentTimeMillis());
        ConcurrentHashMap concurrentHashMap = oVar.f34759c;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Date date2 = (Date) concurrentHashMap.get((EnumC3652i) it.next());
                if (date2 != null && !date.after(date2)) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        n nVar = this.f34734Y;
        R0 r02 = nVar.f34753Z;
        if (r02 == null || nVar.f34755i0.e().b(r02) >= 2000000000) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 || z11) {
            return false;
        }
        return true;
    }

    @Override // io.sentry.transport.h
    public final void l(long j6) {
        n nVar = this.f34734Y;
        nVar.getClass();
        try {
            ((p) nVar.f34756j0.f50831Z).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j6));
        } catch (InterruptedException e10) {
            nVar.f34754h0.d(EnumC3642e1.ERROR, "Failed to wait till idle", e10);
            Thread.currentThread().interrupt();
        }
    }
}
