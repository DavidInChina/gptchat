package io.sentry.transport;

import id.AbstractC3557B;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.R0;
import io.sentry.T0;
import io.sentry.r1;
import java.io.IOException;
import x8.W;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final T0 f34729Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C3686u f34730Z;

    /* renamed from: h0  reason: collision with root package name */
    public final io.sentry.cache.d f34731h0;

    /* renamed from: i0  reason: collision with root package name */
    public final q f34732i0 = new q(-1);

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ d f34733j0;

    public c(d dVar, T0 t02, C3686u c3686u, io.sentry.cache.d dVar2) {
        this.f34733j0 = dVar;
        Ad.l.Z0("Envelope is required.", t02);
        this.f34729Y = t02;
        this.f34730Z = c3686u;
        Ad.l.Z0("EnvelopeCache is required.", dVar2);
        this.f34731h0 = dVar2;
    }

    public static /* synthetic */ void a(c cVar, W w10, io.sentry.hints.j jVar) {
        cVar.f34733j0.f34736h0.getLogger().f(EnumC3642e1.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(w10.P()));
        jVar.b(w10.P());
    }

    public final W b() {
        T0 t02 = this.f34729Y;
        t02.f33864a.f33869i0 = null;
        io.sentry.cache.d dVar = this.f34731h0;
        C3686u c3686u = this.f34730Z;
        dVar.X(t02, c3686u);
        AbstractC3557B.q2(c3686u, io.sentry.hints.c.class, new io.sentry.util.a() { // from class: io.sentry.transport.b
            @Override // io.sentry.util.a
            public final void accept(Object obj) {
                io.sentry.hints.c cVar = (io.sentry.hints.c) obj;
                c cVar2 = c.this;
                boolean e10 = cVar.e(cVar2.f34729Y.f33864a.f33866Y);
                d dVar2 = cVar2.f34733j0;
                if (e10) {
                    cVar.f34353a.countDown();
                    dVar2.f34736h0.getLogger().f(EnumC3642e1.DEBUG, "Disk flush envelope fired", new Object[0]);
                    return;
                }
                dVar2.f34736h0.getLogger().f(EnumC3642e1.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        });
        d dVar2 = this.f34733j0;
        boolean a5 = dVar2.f34738j0.a();
        r1 r1Var = dVar2.f34736h0;
        if (a5) {
            T0 d10 = r1Var.getClientReportRecorder().d(t02);
            try {
                R0 e10 = r1Var.getDateProvider().e();
                d10.f33864a.f33869i0 = r.f.B(Double.valueOf(e10.d() / 1000000.0d).longValue());
                W d11 = dVar2.f34739k0.d(d10);
                if (d11.P()) {
                    dVar.t(t02);
                    return d11;
                }
                String str = "The transport failed to send the envelope with response code " + d11.I();
                r1Var.getLogger().f(EnumC3642e1.ERROR, str, new Object[0]);
                if (d11.I() >= 400 && d11.I() != 429) {
                    Object v12 = AbstractC3557B.v1(c3686u);
                    if (!io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u)) || v12 == null) {
                        r1Var.getClientReportRecorder().b(io.sentry.clientreport.d.NETWORK_ERROR, d10);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e11) {
                Object v13 = AbstractC3557B.v1(c3686u);
                if (io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u)) && v13 != null) {
                    ((io.sentry.hints.g) v13).c(true);
                } else {
                    AbstractC3557B.b2(r1Var.getLogger(), io.sentry.hints.g.class, v13);
                    r1Var.getClientReportRecorder().b(io.sentry.clientreport.d.NETWORK_ERROR, d10);
                }
                throw new IllegalStateException("Sending the event failed.", e11);
            }
        }
        Object v14 = AbstractC3557B.v1(c3686u);
        if (io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u)) && v14 != null) {
            ((io.sentry.hints.g) v14).c(true);
        } else {
            AbstractC3557B.b2(r1Var.getLogger(), io.sentry.hints.g.class, v14);
            r1Var.getClientReportRecorder().b(io.sentry.clientreport.d.NETWORK_ERROR, t02);
        }
        return this.f34732i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34733j0.f34740l0 = this;
        W w10 = this.f34732i0;
        try {
            w10 = b();
            this.f34733j0.f34736h0.getLogger().f(EnumC3642e1.DEBUG, "Envelope flushed", new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f34733j0.f34736h0.getLogger().b(EnumC3642e1.ERROR, th2, "Envelope submission failed", new Object[0]);
                throw th2;
            } finally {
                C3686u c3686u = this.f34730Z;
                Object v12 = AbstractC3557B.v1(c3686u);
                if (io.sentry.hints.j.class.isInstance(AbstractC3557B.v1(c3686u)) && v12 != null) {
                    a(this, w10, (io.sentry.hints.j) v12);
                }
                this.f34733j0.f34740l0 = null;
            }
        }
    }
}
