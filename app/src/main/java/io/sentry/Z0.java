package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import xe.C6431t;

/* loaded from: classes.dex */
public final class Z0 extends O0 implements AbstractC3656j0 {

    /* renamed from: A0  reason: collision with root package name */
    public String f33895A0;

    /* renamed from: B0  reason: collision with root package name */
    public List f33896B0;

    /* renamed from: C0  reason: collision with root package name */
    public Map f33897C0;

    /* renamed from: D0  reason: collision with root package name */
    public Map f33898D0;

    /* renamed from: u0  reason: collision with root package name */
    public Date f33899u0;

    /* renamed from: v0  reason: collision with root package name */
    public io.sentry.protocol.l f33900v0;

    /* renamed from: w0  reason: collision with root package name */
    public String f33901w0;

    /* renamed from: x0  reason: collision with root package name */
    public C4.c f33902x0;

    /* renamed from: y0  reason: collision with root package name */
    public C4.c f33903y0;

    /* renamed from: z0  reason: collision with root package name */
    public EnumC3642e1 f33904z0;

    public Z0(RuntimeException runtimeException) {
        this();
        this.f33845o0 = runtimeException;
    }

    public final io.sentry.protocol.r b() {
        Boolean bool;
        C4.c cVar = this.f33903y0;
        if (cVar != null) {
            for (io.sentry.protocol.r rVar : cVar.f2667Y) {
                io.sentry.protocol.k kVar = rVar.f34617k0;
                if (kVar != null && (bool = kVar.f34568i0) != null && !bool.booleanValue()) {
                    return rVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n(DiagnosticsEntry.Event.TIMESTAMP_KEY);
        c3636c1.v(h10, this.f33899u0);
        if (this.f33900v0 != null) {
            c3636c1.n("message");
            c3636c1.v(h10, this.f33900v0);
        }
        if (this.f33901w0 != null) {
            c3636c1.n("logger");
            c3636c1.t(this.f33901w0);
        }
        C4.c cVar = this.f33902x0;
        if (cVar != null && !cVar.f2667Y.isEmpty()) {
            c3636c1.n("threads");
            c3636c1.d();
            c3636c1.n(DiagnosticsEntry.Histogram.VALUES_KEY);
            c3636c1.v(h10, this.f33902x0.f2667Y);
            c3636c1.j();
        }
        C4.c cVar2 = this.f33903y0;
        if (cVar2 != null && !cVar2.f2667Y.isEmpty()) {
            c3636c1.n("exception");
            c3636c1.d();
            c3636c1.n(DiagnosticsEntry.Histogram.VALUES_KEY);
            c3636c1.v(h10, this.f33903y0.f2667Y);
            c3636c1.j();
        }
        if (this.f33904z0 != null) {
            c3636c1.n("level");
            c3636c1.v(h10, this.f33904z0);
        }
        if (this.f33895A0 != null) {
            c3636c1.n("transaction");
            c3636c1.t(this.f33895A0);
        }
        if (this.f33896B0 != null) {
            c3636c1.n("fingerprint");
            c3636c1.v(h10, this.f33896B0);
        }
        if (this.f33898D0 != null) {
            c3636c1.n("modules");
            c3636c1.v(h10, this.f33898D0);
        }
        C6431t.p(this, c3636c1, h10);
        Map map = this.f33897C0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f33897C0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Z0() {
        super(r0);
        io.sentry.protocol.s sVar = new io.sentry.protocol.s((UUID) null);
        Date A10 = r.f.A();
        this.f33899u0 = A10;
    }
}
