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
public final class h implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34551Y;

    /* renamed from: Z  reason: collision with root package name */
    public Integer f34552Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34553h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f34554i0;

    /* renamed from: j0  reason: collision with root package name */
    public Integer f34555j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f34556k0;

    /* renamed from: l0  reason: collision with root package name */
    public Boolean f34557l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f34558m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f34559n0;

    /* renamed from: o0  reason: collision with root package name */
    public Map f34560o0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (Ad.l.j0(this.f34551Y, hVar.f34551Y) && Ad.l.j0(this.f34552Z, hVar.f34552Z) && Ad.l.j0(this.f34553h0, hVar.f34553h0) && Ad.l.j0(this.f34554i0, hVar.f34554i0) && Ad.l.j0(this.f34555j0, hVar.f34555j0) && Ad.l.j0(this.f34556k0, hVar.f34556k0) && Ad.l.j0(this.f34557l0, hVar.f34557l0) && Ad.l.j0(this.f34558m0, hVar.f34558m0) && Ad.l.j0(this.f34559n0, hVar.f34559n0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34551Y, this.f34552Z, this.f34553h0, this.f34554i0, this.f34555j0, this.f34556k0, this.f34557l0, this.f34558m0, this.f34559n0});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34551Y != null) {
            c3636c1.n("name");
            c3636c1.t(this.f34551Y);
        }
        if (this.f34552Z != null) {
            c3636c1.n(ParameterNames.ID);
            c3636c1.s(this.f34552Z);
        }
        if (this.f34553h0 != null) {
            c3636c1.n("vendor_id");
            c3636c1.t(this.f34553h0);
        }
        if (this.f34554i0 != null) {
            c3636c1.n("vendor_name");
            c3636c1.t(this.f34554i0);
        }
        if (this.f34555j0 != null) {
            c3636c1.n("memory_size");
            c3636c1.s(this.f34555j0);
        }
        if (this.f34556k0 != null) {
            c3636c1.n("api_type");
            c3636c1.t(this.f34556k0);
        }
        if (this.f34557l0 != null) {
            c3636c1.n("multi_threaded_rendering");
            c3636c1.r(this.f34557l0);
        }
        if (this.f34558m0 != null) {
            c3636c1.n(ParameterNames.VERSION);
            c3636c1.t(this.f34558m0);
        }
        if (this.f34559n0 != null) {
            c3636c1.n("npot_support");
            c3636c1.t(this.f34559n0);
        }
        Map map = this.f34560o0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34560o0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
