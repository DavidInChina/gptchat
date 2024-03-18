package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.protocol.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3677d implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public p f34509Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f34510Z;

    /* renamed from: h0  reason: collision with root package name */
    public Map f34511h0;

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34509Y != null) {
            c3636c1.n("sdk_info");
            c3636c1.v(h10, this.f34509Y);
        }
        if (this.f34510Z != null) {
            c3636c1.n("images");
            c3636c1.v(h10, this.f34510Z);
        }
        Map map = this.f34511h0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34511h0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
