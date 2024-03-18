package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Date;
import java.util.Map;

/* loaded from: classes2.dex */
public final class U0 implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final io.sentry.protocol.s f33866Y;

    /* renamed from: Z  reason: collision with root package name */
    public final io.sentry.protocol.q f33867Z;

    /* renamed from: h0  reason: collision with root package name */
    public final G1 f33868h0;

    /* renamed from: i0  reason: collision with root package name */
    public Date f33869i0;

    /* renamed from: j0  reason: collision with root package name */
    public Map f33870j0;

    public U0(io.sentry.protocol.s sVar, io.sentry.protocol.q qVar, G1 g1) {
        this.f33866Y = sVar;
        this.f33867Z = qVar;
        this.f33868h0 = g1;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        io.sentry.protocol.s sVar = this.f33866Y;
        if (sVar != null) {
            c3636c1.n("event_id");
            c3636c1.v(h10, sVar);
        }
        io.sentry.protocol.q qVar = this.f33867Z;
        if (qVar != null) {
            c3636c1.n("sdk");
            c3636c1.v(h10, qVar);
        }
        G1 g1 = this.f33868h0;
        if (g1 != null) {
            c3636c1.n("trace");
            c3636c1.v(h10, g1);
        }
        if (this.f33869i0 != null) {
            c3636c1.n("sent_at");
            c3636c1.v(h10, r.f.K(this.f33869i0));
        }
        Map map = this.f33870j0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f33870j0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
