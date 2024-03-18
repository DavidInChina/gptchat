package io.sentry.profilemeasurements;

import Ad.l;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public Map f34465Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34466Z;

    /* renamed from: h0  reason: collision with root package name */
    public double f34467h0;

    public b(Long l10, Number number) {
        this.f34466Z = l10.toString();
        this.f34467h0 = number.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (l.j0(this.f34465Y, bVar.f34465Y) && this.f34466Z.equals(bVar.f34466Z) && this.f34467h0 == bVar.f34467h0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34465Y, this.f34466Z, Double.valueOf(this.f34467h0)});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("value");
        c3636c1.v(h10, Double.valueOf(this.f34467h0));
        c3636c1.n("elapsed_since_start_ns");
        c3636c1.v(h10, this.f34466Z);
        Map map = this.f34465Y;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34465Y, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
