package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class N1 implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final io.sentry.protocol.s f33831Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f33832Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f33833h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f33834i0;

    /* renamed from: j0  reason: collision with root package name */
    public Map f33835j0;

    public N1(io.sentry.protocol.s sVar, String str, String str2, String str3) {
        this.f33831Y = sVar;
        this.f33832Z = str;
        this.f33833h0 = str2;
        this.f33834i0 = str3;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("event_id");
        this.f33831Y.serialize(c3636c1, h10);
        String str = this.f33832Z;
        if (str != null) {
            c3636c1.n("name");
            c3636c1.t(str);
        }
        String str2 = this.f33833h0;
        if (str2 != null) {
            c3636c1.n("email");
            c3636c1.t(str2);
        }
        String str3 = this.f33834i0;
        if (str3 != null) {
            c3636c1.n("comments");
            c3636c1.t(str3);
        }
        Map map = this.f33835j0;
        if (map != null) {
            for (String str4 : map.keySet()) {
                AbstractC2469q0.r(this.f33835j0, str4, c3636c1, str4, h10);
            }
        }
        c3636c1.j();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserFeedback{eventId=");
        sb2.append(this.f33831Y);
        sb2.append(", name='");
        sb2.append(this.f33832Z);
        sb2.append("', email='");
        sb2.append(this.f33833h0);
        sb2.append("', comments='");
        return R.a.t(sb2, this.f33834i0, "'}");
    }
}
