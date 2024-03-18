package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.A1;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.B1;
import io.sentry.C1;
import io.sentry.C3636c1;
import io.sentry.H;
import io.sentry.R0;
import io.sentry.z1;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Double f34628Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Double f34629Z;

    /* renamed from: h0  reason: collision with root package name */
    public final s f34630h0;

    /* renamed from: i0  reason: collision with root package name */
    public final B1 f34631i0;

    /* renamed from: j0  reason: collision with root package name */
    public final B1 f34632j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f34633k0;

    /* renamed from: l0  reason: collision with root package name */
    public final String f34634l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C1 f34635m0;

    /* renamed from: n0  reason: collision with root package name */
    public final String f34636n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Map f34637o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Map f34638p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Map f34639q0;

    /* renamed from: r0  reason: collision with root package name */
    public Map f34640r0;

    public v(Double d10, Double d11, s sVar, B1 b1, B1 b12, String str, String str2, C1 c12, String str3, Map map, AbstractMap abstractMap, Map map2) {
        this.f34628Y = d10;
        this.f34629Z = d11;
        this.f34630h0 = sVar;
        this.f34631i0 = b1;
        this.f34632j0 = b12;
        this.f34633k0 = str;
        this.f34634l0 = str2;
        this.f34635m0 = c12;
        this.f34637o0 = map;
        this.f34638p0 = map2;
        this.f34639q0 = abstractMap;
        this.f34636n0 = str3;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("start_timestamp");
        BigDecimal valueOf = BigDecimal.valueOf(this.f34628Y.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        c3636c1.v(h10, valueOf.setScale(6, roundingMode));
        Double d10 = this.f34629Z;
        if (d10 != null) {
            c3636c1.n(DiagnosticsEntry.Event.TIMESTAMP_KEY);
            c3636c1.v(h10, BigDecimal.valueOf(d10.doubleValue()).setScale(6, roundingMode));
        }
        c3636c1.n("trace_id");
        c3636c1.v(h10, this.f34630h0);
        c3636c1.n("span_id");
        c3636c1.v(h10, this.f34631i0);
        B1 b1 = this.f34632j0;
        if (b1 != null) {
            c3636c1.n("parent_span_id");
            c3636c1.v(h10, b1);
        }
        c3636c1.n("op");
        c3636c1.t(this.f34633k0);
        String str = this.f34634l0;
        if (str != null) {
            c3636c1.n("description");
            c3636c1.t(str);
        }
        C1 c12 = this.f34635m0;
        if (c12 != null) {
            c3636c1.n("status");
            c3636c1.v(h10, c12);
        }
        String str2 = this.f34636n0;
        if (str2 != null) {
            c3636c1.n("origin");
            c3636c1.v(h10, str2);
        }
        Map map = this.f34637o0;
        if (!map.isEmpty()) {
            c3636c1.n("tags");
            c3636c1.v(h10, map);
        }
        Map map2 = this.f34638p0;
        if (map2 != null) {
            c3636c1.n("data");
            c3636c1.v(h10, map2);
        }
        Map map3 = this.f34639q0;
        if (!map3.isEmpty()) {
            c3636c1.n("measurements");
            c3636c1.v(h10, map3);
        }
        Map map4 = this.f34640r0;
        if (map4 != null) {
            for (String str3 : map4.keySet()) {
                AbstractC2469q0.r(this.f34640r0, str3, c3636c1, str3, h10);
            }
        }
        c3636c1.j();
    }

    public v(z1 z1Var) {
        ConcurrentHashMap concurrentHashMap = z1Var.f34868j;
        A1 a12 = z1Var.f34861c;
        this.f34634l0 = a12.f33719k0;
        this.f34633k0 = a12.f33718j0;
        this.f34631i0 = a12.f33715Z;
        this.f34632j0 = a12.f33716h0;
        this.f34630h0 = a12.f33714Y;
        this.f34635m0 = a12.f33720l0;
        this.f34636n0 = a12.f33722n0;
        ConcurrentHashMap p02 = P4.a.p0(a12.f33721m0);
        this.f34637o0 = p02 == null ? new ConcurrentHashMap() : p02;
        ConcurrentHashMap p03 = P4.a.p0(z1Var.f34869k);
        this.f34639q0 = p03 == null ? new ConcurrentHashMap() : p03;
        R0 r02 = z1Var.f34860b;
        this.f34629Z = r02 == null ? null : Double.valueOf(z1Var.f34859a.c(r02) / 1.0E9d);
        this.f34628Y = Double.valueOf(z1Var.f34859a.d() / 1.0E9d);
        this.f34638p0 = concurrentHashMap;
    }
}
