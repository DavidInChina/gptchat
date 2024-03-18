package io.sentry.clientreport;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f34304Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f34305Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Long f34306h0;

    /* renamed from: i0  reason: collision with root package name */
    public Map f34307i0;

    public e(String str, String str2, Long l10) {
        this.f34304Y = str;
        this.f34305Z = str2;
        this.f34306h0 = l10;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("reason");
        c3636c1.t(this.f34304Y);
        c3636c1.n("category");
        c3636c1.t(this.f34305Z);
        c3636c1.n("quantity");
        c3636c1.s(this.f34306h0);
        Map map = this.f34307i0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34307i0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.f34304Y + "', category='" + this.f34305Z + "', quantity=" + this.f34306h0 + '}';
    }
}
