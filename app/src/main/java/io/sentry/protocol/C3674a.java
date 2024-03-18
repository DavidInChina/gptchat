package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.protocol.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3674a implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34494Y;

    /* renamed from: Z  reason: collision with root package name */
    public Date f34495Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34496h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f34497i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f34498j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f34499k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f34500l0;

    /* renamed from: m0  reason: collision with root package name */
    public Map f34501m0;

    /* renamed from: n0  reason: collision with root package name */
    public List f34502n0;

    /* renamed from: o0  reason: collision with root package name */
    public Boolean f34503o0;

    /* renamed from: p0  reason: collision with root package name */
    public Map f34504p0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3674a.class != obj.getClass()) {
            return false;
        }
        C3674a c3674a = (C3674a) obj;
        if (Ad.l.j0(this.f34494Y, c3674a.f34494Y) && Ad.l.j0(this.f34495Z, c3674a.f34495Z) && Ad.l.j0(this.f34496h0, c3674a.f34496h0) && Ad.l.j0(this.f34497i0, c3674a.f34497i0) && Ad.l.j0(this.f34498j0, c3674a.f34498j0) && Ad.l.j0(this.f34499k0, c3674a.f34499k0) && Ad.l.j0(this.f34500l0, c3674a.f34500l0) && Ad.l.j0(this.f34501m0, c3674a.f34501m0) && Ad.l.j0(this.f34503o0, c3674a.f34503o0) && Ad.l.j0(this.f34502n0, c3674a.f34502n0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34494Y, this.f34495Z, this.f34496h0, this.f34497i0, this.f34498j0, this.f34499k0, this.f34500l0, this.f34501m0, this.f34503o0, this.f34502n0});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34494Y != null) {
            c3636c1.n("app_identifier");
            c3636c1.t(this.f34494Y);
        }
        if (this.f34495Z != null) {
            c3636c1.n("app_start_time");
            c3636c1.v(h10, this.f34495Z);
        }
        if (this.f34496h0 != null) {
            c3636c1.n("device_app_hash");
            c3636c1.t(this.f34496h0);
        }
        if (this.f34497i0 != null) {
            c3636c1.n("build_type");
            c3636c1.t(this.f34497i0);
        }
        if (this.f34498j0 != null) {
            c3636c1.n("app_name");
            c3636c1.t(this.f34498j0);
        }
        if (this.f34499k0 != null) {
            c3636c1.n("app_version");
            c3636c1.t(this.f34499k0);
        }
        if (this.f34500l0 != null) {
            c3636c1.n("app_build");
            c3636c1.t(this.f34500l0);
        }
        Map map = this.f34501m0;
        if (map != null && !map.isEmpty()) {
            c3636c1.n("permissions");
            c3636c1.v(h10, this.f34501m0);
        }
        if (this.f34503o0 != null) {
            c3636c1.n("in_foreground");
            c3636c1.r(this.f34503o0);
        }
        if (this.f34502n0 != null) {
            c3636c1.n("view_names");
            c3636c1.v(h10, this.f34502n0);
        }
        Map map2 = this.f34504p0;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                AbstractC2469q0.r(this.f34504p0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
