package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Map;

/* loaded from: classes2.dex */
public final class y implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public Long f34663Y;

    /* renamed from: Z  reason: collision with root package name */
    public Integer f34664Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34665h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f34666i0;

    /* renamed from: j0  reason: collision with root package name */
    public Boolean f34667j0;

    /* renamed from: k0  reason: collision with root package name */
    public Boolean f34668k0;

    /* renamed from: l0  reason: collision with root package name */
    public Boolean f34669l0;

    /* renamed from: m0  reason: collision with root package name */
    public Boolean f34670m0;

    /* renamed from: n0  reason: collision with root package name */
    public x f34671n0;

    /* renamed from: o0  reason: collision with root package name */
    public Map f34672o0;

    /* renamed from: p0  reason: collision with root package name */
    public Map f34673p0;

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34663Y != null) {
            c3636c1.n(ParameterNames.ID);
            c3636c1.s(this.f34663Y);
        }
        if (this.f34664Z != null) {
            c3636c1.n("priority");
            c3636c1.s(this.f34664Z);
        }
        if (this.f34665h0 != null) {
            c3636c1.n("name");
            c3636c1.t(this.f34665h0);
        }
        if (this.f34666i0 != null) {
            c3636c1.n("state");
            c3636c1.t(this.f34666i0);
        }
        if (this.f34667j0 != null) {
            c3636c1.n("crashed");
            c3636c1.r(this.f34667j0);
        }
        if (this.f34668k0 != null) {
            c3636c1.n("current");
            c3636c1.r(this.f34668k0);
        }
        if (this.f34669l0 != null) {
            c3636c1.n("daemon");
            c3636c1.r(this.f34669l0);
        }
        if (this.f34670m0 != null) {
            c3636c1.n("main");
            c3636c1.r(this.f34670m0);
        }
        if (this.f34671n0 != null) {
            c3636c1.n("stacktrace");
            c3636c1.v(h10, this.f34671n0);
        }
        if (this.f34672o0 != null) {
            c3636c1.n("held_locks");
            c3636c1.v(h10, this.f34672o0);
        }
        Map map = this.f34673p0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34673p0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
