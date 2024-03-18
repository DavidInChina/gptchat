package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34577Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34578Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34579h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f34580i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f34581j0;

    /* renamed from: k0  reason: collision with root package name */
    public Boolean f34582k0;

    /* renamed from: l0  reason: collision with root package name */
    public Map f34583l0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (Ad.l.j0(this.f34577Y, mVar.f34577Y) && Ad.l.j0(this.f34578Z, mVar.f34578Z) && Ad.l.j0(this.f34579h0, mVar.f34579h0) && Ad.l.j0(this.f34580i0, mVar.f34580i0) && Ad.l.j0(this.f34581j0, mVar.f34581j0) && Ad.l.j0(this.f34582k0, mVar.f34582k0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34577Y, this.f34578Z, this.f34579h0, this.f34580i0, this.f34581j0, this.f34582k0});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34577Y != null) {
            c3636c1.n("name");
            c3636c1.t(this.f34577Y);
        }
        if (this.f34578Z != null) {
            c3636c1.n(ParameterNames.VERSION);
            c3636c1.t(this.f34578Z);
        }
        if (this.f34579h0 != null) {
            c3636c1.n("raw_description");
            c3636c1.t(this.f34579h0);
        }
        if (this.f34580i0 != null) {
            c3636c1.n("build");
            c3636c1.t(this.f34580i0);
        }
        if (this.f34581j0 != null) {
            c3636c1.n("kernel_version");
            c3636c1.t(this.f34581j0);
        }
        if (this.f34582k0 != null) {
            c3636c1.n("rooted");
            c3636c1.r(this.f34582k0);
        }
        Map map = this.f34583l0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34583l0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
