package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34573Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34574Z;

    /* renamed from: h0  reason: collision with root package name */
    public List f34575h0;

    /* renamed from: i0  reason: collision with root package name */
    public Map f34576i0;

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34573Y != null) {
            c3636c1.n("formatted");
            c3636c1.t(this.f34573Y);
        }
        if (this.f34574Z != null) {
            c3636c1.n("message");
            c3636c1.t(this.f34574Z);
        }
        List list = this.f34575h0;
        if (list != null && !list.isEmpty()) {
            c3636c1.n("params");
            c3636c1.v(h10, this.f34575h0);
        }
        Map map = this.f34576i0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34576i0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
