package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34624Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34625Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34626h0;

    /* renamed from: i0  reason: collision with root package name */
    public Map f34627i0;

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34624Y != null) {
            c3636c1.n("name");
            c3636c1.t(this.f34624Y);
        }
        if (this.f34625Z != null) {
            c3636c1.n(ParameterNames.VERSION);
            c3636c1.t(this.f34625Z);
        }
        if (this.f34626h0 != null) {
            c3636c1.n("raw_description");
            c3636c1.t(this.f34626h0);
        }
        Map map = this.f34627i0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34627i0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
