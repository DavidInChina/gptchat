package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public class A1 implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final io.sentry.protocol.s f33714Y;

    /* renamed from: Z  reason: collision with root package name */
    public final B1 f33715Z;

    /* renamed from: h0  reason: collision with root package name */
    public final B1 f33716h0;

    /* renamed from: i0  reason: collision with root package name */
    public transient U3.n f33717i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String f33718j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f33719k0;

    /* renamed from: l0  reason: collision with root package name */
    public C1 f33720l0;

    /* renamed from: m0  reason: collision with root package name */
    public ConcurrentHashMap f33721m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f33722n0;

    /* renamed from: o0  reason: collision with root package name */
    public Map f33723o0;

    public A1(io.sentry.protocol.s sVar, B1 b1, String str, B1 b12, U3.n nVar) {
        this(sVar, b1, b12, str, null, nVar, null, "manual");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1)) {
            return false;
        }
        A1 a12 = (A1) obj;
        if (this.f33714Y.equals(a12.f33714Y) && this.f33715Z.equals(a12.f33715Z) && Ad.l.j0(this.f33716h0, a12.f33716h0) && this.f33718j0.equals(a12.f33718j0) && Ad.l.j0(this.f33719k0, a12.f33719k0) && this.f33720l0 == a12.f33720l0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33714Y, this.f33715Z, this.f33716h0, this.f33718j0, this.f33719k0, this.f33720l0});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("trace_id");
        this.f33714Y.serialize(c3636c1, h10);
        c3636c1.n("span_id");
        this.f33715Z.serialize(c3636c1, h10);
        B1 b1 = this.f33716h0;
        if (b1 != null) {
            c3636c1.n("parent_span_id");
            b1.serialize(c3636c1, h10);
        }
        c3636c1.n("op");
        c3636c1.t(this.f33718j0);
        if (this.f33719k0 != null) {
            c3636c1.n("description");
            c3636c1.t(this.f33719k0);
        }
        if (this.f33720l0 != null) {
            c3636c1.n("status");
            c3636c1.v(h10, this.f33720l0);
        }
        if (this.f33722n0 != null) {
            c3636c1.n("origin");
            c3636c1.v(h10, this.f33722n0);
        }
        if (!this.f33721m0.isEmpty()) {
            c3636c1.n("tags");
            c3636c1.v(h10, this.f33721m0);
        }
        Map map = this.f33723o0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f33723o0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }

    public A1(io.sentry.protocol.s sVar, B1 b1, B1 b12, String str, String str2, U3.n nVar, C1 c12, String str3) {
        this.f33721m0 = new ConcurrentHashMap();
        this.f33722n0 = "manual";
        Ad.l.Z0("traceId is required", sVar);
        this.f33714Y = sVar;
        Ad.l.Z0("spanId is required", b1);
        this.f33715Z = b1;
        Ad.l.Z0("operation is required", str);
        this.f33718j0 = str;
        this.f33716h0 = b12;
        this.f33717i0 = nVar;
        this.f33719k0 = str2;
        this.f33720l0 = c12;
        this.f33722n0 = str3;
    }

    public A1(A1 a12) {
        this.f33721m0 = new ConcurrentHashMap();
        this.f33722n0 = "manual";
        this.f33714Y = a12.f33714Y;
        this.f33715Z = a12.f33715Z;
        this.f33716h0 = a12.f33716h0;
        this.f33717i0 = a12.f33717i0;
        this.f33718j0 = a12.f33718j0;
        this.f33719k0 = a12.f33719k0;
        this.f33720l0 = a12.f33720l0;
        ConcurrentHashMap p02 = P4.a.p0(a12.f33721m0);
        if (p02 != null) {
            this.f33721m0 = p02;
        }
    }
}
