package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/* renamed from: io.sentry.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3640e implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Date f34318Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34319Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34320h0;

    /* renamed from: i0  reason: collision with root package name */
    public Map f34321i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f34322j0;

    /* renamed from: k0  reason: collision with root package name */
    public EnumC3642e1 f34323k0;

    /* renamed from: l0  reason: collision with root package name */
    public Map f34324l0;

    public C3640e(Date date) {
        this.f34321i0 = new ConcurrentHashMap();
        this.f34318Y = date;
    }

    public final void a(String str, Object obj) {
        this.f34321i0.put(str, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3640e.class != obj.getClass()) {
            return false;
        }
        C3640e c3640e = (C3640e) obj;
        if (this.f34318Y.getTime() == c3640e.f34318Y.getTime() && Ad.l.j0(this.f34319Z, c3640e.f34319Z) && Ad.l.j0(this.f34320h0, c3640e.f34320h0) && Ad.l.j0(this.f34322j0, c3640e.f34322j0) && this.f34323k0 == c3640e.f34323k0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34318Y, this.f34319Z, this.f34320h0, this.f34322j0, this.f34323k0});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n(DiagnosticsEntry.Event.TIMESTAMP_KEY);
        c3636c1.v(h10, this.f34318Y);
        if (this.f34319Z != null) {
            c3636c1.n("message");
            c3636c1.t(this.f34319Z);
        }
        if (this.f34320h0 != null) {
            c3636c1.n("type");
            c3636c1.t(this.f34320h0);
        }
        c3636c1.n("data");
        c3636c1.v(h10, this.f34321i0);
        if (this.f34322j0 != null) {
            c3636c1.n("category");
            c3636c1.t(this.f34322j0);
        }
        if (this.f34323k0 != null) {
            c3636c1.n("level");
            c3636c1.v(h10, this.f34323k0);
        }
        Map map = this.f34324l0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34324l0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }

    public C3640e(C3640e c3640e) {
        this.f34321i0 = new ConcurrentHashMap();
        this.f34318Y = c3640e.f34318Y;
        this.f34319Z = c3640e.f34319Z;
        this.f34320h0 = c3640e.f34320h0;
        this.f34322j0 = c3640e.f34322j0;
        ConcurrentHashMap p02 = P4.a.p0(c3640e.f34321i0);
        if (p02 != null) {
            this.f34321i0 = p02;
        }
        this.f34324l0 = P4.a.p0(c3640e.f34324l0);
        this.f34323k0 = c3640e.f34323k0;
    }

    public C3640e() {
        this(r.f.A());
    }
}
