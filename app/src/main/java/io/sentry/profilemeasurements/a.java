package io.sentry.profilemeasurements;

import Ad.l;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public Map f34462Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34463Z;

    /* renamed from: h0  reason: collision with root package name */
    public Collection f34464h0;

    public a(String str, AbstractCollection abstractCollection) {
        this.f34463Z = str;
        this.f34464h0 = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (l.j0(this.f34462Y, aVar.f34462Y) && this.f34463Z.equals(aVar.f34463Z) && new ArrayList(this.f34464h0).equals(new ArrayList(aVar.f34464h0))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34462Y, this.f34463Z, this.f34464h0});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("unit");
        c3636c1.v(h10, this.f34463Z);
        c3636c1.n(DiagnosticsEntry.Histogram.VALUES_KEY);
        c3636c1.v(h10, this.f34464h0);
        Map map = this.f34462Y;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34462Y, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
