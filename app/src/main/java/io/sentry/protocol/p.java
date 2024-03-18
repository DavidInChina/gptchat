package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34602Y;

    /* renamed from: Z  reason: collision with root package name */
    public Integer f34603Z;

    /* renamed from: h0  reason: collision with root package name */
    public Integer f34604h0;

    /* renamed from: i0  reason: collision with root package name */
    public Integer f34605i0;

    /* renamed from: j0  reason: collision with root package name */
    public Map f34606j0;

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34602Y != null) {
            c3636c1.n("sdk_name");
            c3636c1.t(this.f34602Y);
        }
        if (this.f34603Z != null) {
            c3636c1.n("version_major");
            c3636c1.s(this.f34603Z);
        }
        if (this.f34604h0 != null) {
            c3636c1.n("version_minor");
            c3636c1.s(this.f34604h0);
        }
        if (this.f34605i0 != null) {
            c3636c1.n("version_patchlevel");
            c3636c1.s(this.f34605i0);
        }
        Map map = this.f34606j0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34606j0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
