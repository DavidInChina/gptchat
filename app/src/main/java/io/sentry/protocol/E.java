package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class E implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34482Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34483Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34484h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f34485i0;

    /* renamed from: j0  reason: collision with root package name */
    public Double f34486j0;

    /* renamed from: k0  reason: collision with root package name */
    public Double f34487k0;

    /* renamed from: l0  reason: collision with root package name */
    public Double f34488l0;

    /* renamed from: m0  reason: collision with root package name */
    public Double f34489m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f34490n0;

    /* renamed from: o0  reason: collision with root package name */
    public Double f34491o0;

    /* renamed from: p0  reason: collision with root package name */
    public List f34492p0;

    /* renamed from: q0  reason: collision with root package name */
    public Map f34493q0;

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34482Y != null) {
            c3636c1.n("rendering_system");
            c3636c1.t(this.f34482Y);
        }
        if (this.f34483Z != null) {
            c3636c1.n("type");
            c3636c1.t(this.f34483Z);
        }
        if (this.f34484h0 != null) {
            c3636c1.n("identifier");
            c3636c1.t(this.f34484h0);
        }
        if (this.f34485i0 != null) {
            c3636c1.n(ParameterNames.TAG);
            c3636c1.t(this.f34485i0);
        }
        if (this.f34486j0 != null) {
            c3636c1.n("width");
            c3636c1.s(this.f34486j0);
        }
        if (this.f34487k0 != null) {
            c3636c1.n("height");
            c3636c1.s(this.f34487k0);
        }
        if (this.f34488l0 != null) {
            c3636c1.n("x");
            c3636c1.s(this.f34488l0);
        }
        if (this.f34489m0 != null) {
            c3636c1.n("y");
            c3636c1.s(this.f34489m0);
        }
        if (this.f34490n0 != null) {
            c3636c1.n("visibility");
            c3636c1.t(this.f34490n0);
        }
        if (this.f34491o0 != null) {
            c3636c1.n("alpha");
            c3636c1.s(this.f34491o0);
        }
        List list = this.f34492p0;
        if (list != null && !list.isEmpty()) {
            c3636c1.n("children");
            c3636c1.v(h10, this.f34492p0);
        }
        Map map = this.f34493q0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34493q0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
