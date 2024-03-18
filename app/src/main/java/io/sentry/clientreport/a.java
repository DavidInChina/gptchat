package io.sentry.clientreport;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Date f34297Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f34298Z;

    /* renamed from: h0  reason: collision with root package name */
    public Map f34299h0;

    public a(Date date, ArrayList arrayList) {
        this.f34297Y = date;
        this.f34298Z = arrayList;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n(DiagnosticsEntry.Event.TIMESTAMP_KEY);
        c3636c1.t(r.f.K(this.f34297Y));
        c3636c1.n("discarded_events");
        c3636c1.v(h10, this.f34298Z);
        Map map = this.f34299h0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34299h0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
