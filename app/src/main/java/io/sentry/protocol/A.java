package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Map;

/* loaded from: classes2.dex */
public final class A implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f34468Y;

    /* renamed from: Z  reason: collision with root package name */
    public Map f34469Z;

    public A(String str) {
        this.f34468Y = str;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        String str = this.f34468Y;
        if (str != null) {
            c3636c1.n("source");
            c3636c1.v(h10, str);
        }
        Map map = this.f34469Z;
        if (map != null) {
            for (String str2 : map.keySet()) {
                AbstractC2469q0.r(this.f34469Z, str2, c3636c1, str2, h10);
            }
        }
        c3636c1.j();
    }
}
