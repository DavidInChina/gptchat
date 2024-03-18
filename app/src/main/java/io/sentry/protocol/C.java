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
public final class C implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34470Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34471Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34472h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f34473i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f34474j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f34475k0;

    /* renamed from: l0  reason: collision with root package name */
    public g f34476l0;

    /* renamed from: m0  reason: collision with root package name */
    public Map f34477m0;

    /* renamed from: n0  reason: collision with root package name */
    public Map f34478n0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c10 = (C) obj;
        if (Ad.l.j0(this.f34470Y, c10.f34470Y) && Ad.l.j0(this.f34471Z, c10.f34471Z) && Ad.l.j0(this.f34472h0, c10.f34472h0) && Ad.l.j0(this.f34473i0, c10.f34473i0) && Ad.l.j0(this.f34474j0, c10.f34474j0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34470Y, this.f34471Z, this.f34472h0, this.f34473i0, this.f34474j0});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34470Y != null) {
            c3636c1.n("email");
            c3636c1.t(this.f34470Y);
        }
        if (this.f34471Z != null) {
            c3636c1.n(ParameterNames.ID);
            c3636c1.t(this.f34471Z);
        }
        if (this.f34472h0 != null) {
            c3636c1.n("username");
            c3636c1.t(this.f34472h0);
        }
        if (this.f34473i0 != null) {
            c3636c1.n("segment");
            c3636c1.t(this.f34473i0);
        }
        if (this.f34474j0 != null) {
            c3636c1.n("ip_address");
            c3636c1.t(this.f34474j0);
        }
        if (this.f34475k0 != null) {
            c3636c1.n("name");
            c3636c1.t(this.f34475k0);
        }
        if (this.f34476l0 != null) {
            c3636c1.n("geo");
            this.f34476l0.serialize(c3636c1, h10);
        }
        if (this.f34477m0 != null) {
            c3636c1.n("data");
            c3636c1.v(h10, this.f34477m0);
        }
        Map map = this.f34478n0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34478n0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
