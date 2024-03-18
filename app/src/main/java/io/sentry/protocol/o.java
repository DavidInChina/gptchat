package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34596Y;

    /* renamed from: Z  reason: collision with root package name */
    public Map f34597Z;

    /* renamed from: h0  reason: collision with root package name */
    public Integer f34598h0;

    /* renamed from: i0  reason: collision with root package name */
    public Long f34599i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f34600j0;

    /* renamed from: k0  reason: collision with root package name */
    public Map f34601k0;

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34596Y != null) {
            c3636c1.n("cookies");
            c3636c1.t(this.f34596Y);
        }
        if (this.f34597Z != null) {
            c3636c1.n("headers");
            c3636c1.v(h10, this.f34597Z);
        }
        if (this.f34598h0 != null) {
            c3636c1.n("status_code");
            c3636c1.v(h10, this.f34598h0);
        }
        if (this.f34599i0 != null) {
            c3636c1.n("body_size");
            c3636c1.v(h10, this.f34599i0);
        }
        if (this.f34600j0 != null) {
            c3636c1.n("data");
            c3636c1.v(h10, this.f34600j0);
        }
        Map map = this.f34601k0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34601k0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
