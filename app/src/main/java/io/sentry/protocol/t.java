package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import j$.util.Objects;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f34621Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f34622Z;

    /* renamed from: h0  reason: collision with root package name */
    public Map f34623h0;

    public t(String str, String str2) {
        this.f34621Y = str;
        this.f34622Z = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (Objects.equals(this.f34621Y, tVar.f34621Y) && Objects.equals(this.f34622Z, tVar.f34622Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34621Y, this.f34622Z);
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("name");
        c3636c1.t(this.f34621Y);
        c3636c1.n(ParameterNames.VERSION);
        c3636c1.t(this.f34622Z);
        Map map = this.f34623h0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34623h0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
