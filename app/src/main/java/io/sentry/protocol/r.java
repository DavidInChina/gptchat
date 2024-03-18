package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34612Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34613Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34614h0;

    /* renamed from: i0  reason: collision with root package name */
    public Long f34615i0;

    /* renamed from: j0  reason: collision with root package name */
    public x f34616j0;

    /* renamed from: k0  reason: collision with root package name */
    public k f34617k0;

    /* renamed from: l0  reason: collision with root package name */
    public Map f34618l0;

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34612Y != null) {
            c3636c1.n("type");
            c3636c1.t(this.f34612Y);
        }
        if (this.f34613Z != null) {
            c3636c1.n("value");
            c3636c1.t(this.f34613Z);
        }
        if (this.f34614h0 != null) {
            c3636c1.n("module");
            c3636c1.t(this.f34614h0);
        }
        if (this.f34615i0 != null) {
            c3636c1.n("thread_id");
            c3636c1.s(this.f34615i0);
        }
        if (this.f34616j0 != null) {
            c3636c1.n("stacktrace");
            c3636c1.v(h10, this.f34616j0);
        }
        if (this.f34617k0 != null) {
            c3636c1.n("mechanism");
            c3636c1.v(h10, this.f34617k0);
        }
        Map map = this.f34618l0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34618l0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
