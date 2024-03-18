package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class x implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public List f34659Y;

    /* renamed from: Z  reason: collision with root package name */
    public Map f34660Z;

    /* renamed from: h0  reason: collision with root package name */
    public Boolean f34661h0;

    /* renamed from: i0  reason: collision with root package name */
    public Map f34662i0;

    public x(List list) {
        this.f34659Y = list;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34659Y != null) {
            c3636c1.n("frames");
            c3636c1.v(h10, this.f34659Y);
        }
        if (this.f34660Z != null) {
            c3636c1.n("registers");
            c3636c1.v(h10, this.f34660Z);
        }
        if (this.f34661h0 != null) {
            c3636c1.n("snapshot");
            c3636c1.r(this.f34661h0);
        }
        Map map = this.f34662i0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34662i0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
