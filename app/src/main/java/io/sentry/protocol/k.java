package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34565Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34566Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34567h0;

    /* renamed from: i0  reason: collision with root package name */
    public Boolean f34568i0;

    /* renamed from: j0  reason: collision with root package name */
    public Map f34569j0;

    /* renamed from: k0  reason: collision with root package name */
    public Map f34570k0;

    /* renamed from: l0  reason: collision with root package name */
    public Boolean f34571l0;

    /* renamed from: m0  reason: collision with root package name */
    public Map f34572m0;

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34565Y != null) {
            c3636c1.n("type");
            c3636c1.t(this.f34565Y);
        }
        if (this.f34566Z != null) {
            c3636c1.n("description");
            c3636c1.t(this.f34566Z);
        }
        if (this.f34567h0 != null) {
            c3636c1.n("help_link");
            c3636c1.t(this.f34567h0);
        }
        if (this.f34568i0 != null) {
            c3636c1.n("handled");
            c3636c1.r(this.f34568i0);
        }
        if (this.f34569j0 != null) {
            c3636c1.n("meta");
            c3636c1.v(h10, this.f34569j0);
        }
        if (this.f34570k0 != null) {
            c3636c1.n("data");
            c3636c1.v(h10, this.f34570k0);
        }
        if (this.f34571l0 != null) {
            c3636c1.n("synthetic");
            c3636c1.r(this.f34571l0);
        }
        Map map = this.f34572m0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34572m0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
