package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34584Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34585Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34586h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f34587i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f34588j0;

    /* renamed from: k0  reason: collision with root package name */
    public Map f34589k0;

    /* renamed from: l0  reason: collision with root package name */
    public Map f34590l0;

    /* renamed from: m0  reason: collision with root package name */
    public Long f34591m0;

    /* renamed from: n0  reason: collision with root package name */
    public Map f34592n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f34593o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f34594p0;

    /* renamed from: q0  reason: collision with root package name */
    public Map f34595q0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (Ad.l.j0(this.f34584Y, nVar.f34584Y) && Ad.l.j0(this.f34585Z, nVar.f34585Z) && Ad.l.j0(this.f34586h0, nVar.f34586h0) && Ad.l.j0(this.f34588j0, nVar.f34588j0) && Ad.l.j0(this.f34589k0, nVar.f34589k0) && Ad.l.j0(this.f34590l0, nVar.f34590l0) && Ad.l.j0(this.f34591m0, nVar.f34591m0) && Ad.l.j0(this.f34593o0, nVar.f34593o0) && Ad.l.j0(this.f34594p0, nVar.f34594p0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34584Y, this.f34585Z, this.f34586h0, this.f34588j0, this.f34589k0, this.f34590l0, this.f34591m0, this.f34593o0, this.f34594p0});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34584Y != null) {
            c3636c1.n("url");
            c3636c1.t(this.f34584Y);
        }
        if (this.f34585Z != null) {
            c3636c1.n("method");
            c3636c1.t(this.f34585Z);
        }
        if (this.f34586h0 != null) {
            c3636c1.n("query_string");
            c3636c1.t(this.f34586h0);
        }
        if (this.f34587i0 != null) {
            c3636c1.n("data");
            c3636c1.v(h10, this.f34587i0);
        }
        if (this.f34588j0 != null) {
            c3636c1.n("cookies");
            c3636c1.t(this.f34588j0);
        }
        if (this.f34589k0 != null) {
            c3636c1.n("headers");
            c3636c1.v(h10, this.f34589k0);
        }
        if (this.f34590l0 != null) {
            c3636c1.n("env");
            c3636c1.v(h10, this.f34590l0);
        }
        if (this.f34592n0 != null) {
            c3636c1.n("other");
            c3636c1.v(h10, this.f34592n0);
        }
        if (this.f34593o0 != null) {
            c3636c1.n("fragment");
            c3636c1.v(h10, this.f34593o0);
        }
        if (this.f34591m0 != null) {
            c3636c1.n("body_size");
            c3636c1.v(h10, this.f34591m0);
        }
        if (this.f34594p0 != null) {
            c3636c1.n("api_target");
            c3636c1.v(h10, this.f34594p0);
        }
        Map map = this.f34595q0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34595q0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
