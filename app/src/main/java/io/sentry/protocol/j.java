package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Number f34562Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f34563Z;

    /* renamed from: h0  reason: collision with root package name */
    public Map f34564h0;

    public j(Number number, String str) {
        this.f34562Y = number;
        this.f34563Z = str;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("value");
        c3636c1.s(this.f34562Y);
        String str = this.f34563Z;
        if (str != null) {
            c3636c1.n("unit");
            c3636c1.t(str);
        }
        Map map = this.f34564h0;
        if (map != null) {
            for (String str2 : map.keySet()) {
                AbstractC2469q0.r(this.f34564h0, str2, c3636c1, str2, h10);
            }
        }
        c3636c1.j();
    }
}
