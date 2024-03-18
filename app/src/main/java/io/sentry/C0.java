package io.sentry;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class C0 implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f33754Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f33755Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f33756h0;

    /* renamed from: i0  reason: collision with root package name */
    public Long f33757i0;

    /* renamed from: j0  reason: collision with root package name */
    public Long f33758j0;

    /* renamed from: k0  reason: collision with root package name */
    public Long f33759k0;

    /* renamed from: l0  reason: collision with root package name */
    public Long f33760l0;

    /* renamed from: m0  reason: collision with root package name */
    public Map f33761m0;

    public C0(T t10, Long l10, Long l11) {
        this.f33754Y = t10.n().toString();
        this.f33755Z = t10.s().f33714Y.toString();
        this.f33756h0 = t10.getName();
        this.f33757i0 = l10;
        this.f33759k0 = l11;
    }

    public final void a(Long l10, Long l11, Long l12, Long l13) {
        if (this.f33758j0 == null) {
            this.f33758j0 = Long.valueOf(l10.longValue() - l11.longValue());
            this.f33757i0 = Long.valueOf(this.f33757i0.longValue() - l11.longValue());
            this.f33760l0 = Long.valueOf(l12.longValue() - l13.longValue());
            this.f33759k0 = Long.valueOf(this.f33759k0.longValue() - l13.longValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0.class != obj.getClass()) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (this.f33754Y.equals(c02.f33754Y) && this.f33755Z.equals(c02.f33755Z) && this.f33756h0.equals(c02.f33756h0) && this.f33757i0.equals(c02.f33757i0) && this.f33759k0.equals(c02.f33759k0) && Ad.l.j0(this.f33760l0, c02.f33760l0) && Ad.l.j0(this.f33758j0, c02.f33758j0) && Ad.l.j0(this.f33761m0, c02.f33761m0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33754Y, this.f33755Z, this.f33756h0, this.f33757i0, this.f33758j0, this.f33759k0, this.f33760l0, this.f33761m0});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n(ParameterNames.ID);
        c3636c1.v(h10, this.f33754Y);
        c3636c1.n("trace_id");
        c3636c1.v(h10, this.f33755Z);
        c3636c1.n("name");
        c3636c1.v(h10, this.f33756h0);
        c3636c1.n("relative_start_ns");
        c3636c1.v(h10, this.f33757i0);
        c3636c1.n("relative_end_ns");
        c3636c1.v(h10, this.f33758j0);
        c3636c1.n("relative_cpu_start_ms");
        c3636c1.v(h10, this.f33759k0);
        c3636c1.n("relative_cpu_end_ms");
        c3636c1.v(h10, this.f33760l0);
        Map map = this.f33761m0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f33761m0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
