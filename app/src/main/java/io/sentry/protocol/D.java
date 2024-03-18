package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class D implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f34479Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f34480Z;

    /* renamed from: h0  reason: collision with root package name */
    public Map f34481h0;

    public D(String str, List list) {
        this.f34479Y = str;
        this.f34480Z = list;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        String str = this.f34479Y;
        if (str != null) {
            c3636c1.n("rendering_system");
            c3636c1.t(str);
        }
        List list = this.f34480Z;
        if (list != null) {
            c3636c1.n("windows");
            c3636c1.v(h10, list);
        }
        Map map = this.f34481h0;
        if (map != null) {
            for (String str2 : map.keySet()) {
                AbstractC2469q0.r(this.f34481h0, str2, c3636c1, str2, h10);
            }
        }
        c3636c1.j();
    }
}
