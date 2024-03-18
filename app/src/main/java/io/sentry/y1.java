package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class y1 implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Date f34835Y;

    /* renamed from: Z  reason: collision with root package name */
    public Date f34836Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AtomicInteger f34837h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f34838i0;

    /* renamed from: j0  reason: collision with root package name */
    public final UUID f34839j0;

    /* renamed from: k0  reason: collision with root package name */
    public Boolean f34840k0;

    /* renamed from: l0  reason: collision with root package name */
    public x1 f34841l0;

    /* renamed from: m0  reason: collision with root package name */
    public Long f34842m0;

    /* renamed from: n0  reason: collision with root package name */
    public Double f34843n0;

    /* renamed from: o0  reason: collision with root package name */
    public final String f34844o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f34845p0;

    /* renamed from: q0  reason: collision with root package name */
    public final String f34846q0;

    /* renamed from: r0  reason: collision with root package name */
    public final String f34847r0;

    /* renamed from: s0  reason: collision with root package name */
    public String f34848s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Object f34849t0 = new Object();

    /* renamed from: u0  reason: collision with root package name */
    public Map f34850u0;

    public y1(x1 x1Var, Date date, Date date2, int i10, String str, UUID uuid, Boolean bool, Long l10, Double d10, String str2, String str3, String str4, String str5, String str6) {
        this.f34841l0 = x1Var;
        this.f34835Y = date;
        this.f34836Z = date2;
        this.f34837h0 = new AtomicInteger(i10);
        this.f34838i0 = str;
        this.f34839j0 = uuid;
        this.f34840k0 = bool;
        this.f34842m0 = l10;
        this.f34843n0 = d10;
        this.f34844o0 = str2;
        this.f34845p0 = str3;
        this.f34846q0 = str4;
        this.f34847r0 = str5;
        this.f34848s0 = str6;
    }

    /* renamed from: a */
    public final y1 clone() {
        return new y1(this.f34841l0, this.f34835Y, this.f34836Z, this.f34837h0.get(), this.f34838i0, this.f34839j0, this.f34840k0, this.f34842m0, this.f34843n0, this.f34844o0, this.f34845p0, this.f34846q0, this.f34847r0, this.f34848s0);
    }

    public final void b(Date date) {
        synchronized (this.f34849t0) {
            try {
                this.f34840k0 = null;
                if (this.f34841l0 == x1.Ok) {
                    this.f34841l0 = x1.Exited;
                }
                if (date != null) {
                    this.f34836Z = date;
                } else {
                    this.f34836Z = r.f.A();
                }
                Date date2 = this.f34836Z;
                if (date2 != null) {
                    this.f34843n0 = Double.valueOf(Math.abs(date2.getTime() - this.f34835Y.getTime()) / 1000.0d);
                    long time = this.f34836Z.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.f34842m0 = Long.valueOf(time);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(x1 x1Var, String str, boolean z10, String str2) {
        boolean z11;
        boolean z12;
        synchronized (this.f34849t0) {
            z11 = true;
            if (x1Var != null) {
                try {
                    this.f34841l0 = x1Var;
                    z12 = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                z12 = false;
            }
            if (str != null) {
                this.f34845p0 = str;
                z12 = true;
            }
            if (z10) {
                this.f34837h0.addAndGet(1);
                z12 = true;
            }
            if (str2 != null) {
                this.f34848s0 = str2;
            } else {
                z11 = z12;
            }
            if (z11) {
                this.f34840k0 = null;
                Date A10 = r.f.A();
                this.f34836Z = A10;
                if (A10 != null) {
                    long time = A10.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.f34842m0 = Long.valueOf(time);
                }
            }
        }
        return z11;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        UUID uuid = this.f34839j0;
        if (uuid != null) {
            c3636c1.n("sid");
            c3636c1.t(uuid.toString());
        }
        String str = this.f34838i0;
        if (str != null) {
            c3636c1.n("did");
            c3636c1.t(str);
        }
        if (this.f34840k0 != null) {
            c3636c1.n("init");
            c3636c1.r(this.f34840k0);
        }
        c3636c1.n("started");
        c3636c1.v(h10, this.f34835Y);
        c3636c1.n("status");
        c3636c1.v(h10, this.f34841l0.name().toLowerCase(Locale.ROOT));
        if (this.f34842m0 != null) {
            c3636c1.n("seq");
            c3636c1.s(this.f34842m0);
        }
        c3636c1.n("errors");
        c3636c1.q(this.f34837h0.intValue());
        if (this.f34843n0 != null) {
            c3636c1.n("duration");
            c3636c1.s(this.f34843n0);
        }
        if (this.f34836Z != null) {
            c3636c1.n(DiagnosticsEntry.Event.TIMESTAMP_KEY);
            c3636c1.v(h10, this.f34836Z);
        }
        if (this.f34848s0 != null) {
            c3636c1.n("abnormal_mechanism");
            c3636c1.v(h10, this.f34848s0);
        }
        c3636c1.n("attrs");
        c3636c1.d();
        c3636c1.n("release");
        c3636c1.v(h10, this.f34847r0);
        String str2 = this.f34846q0;
        if (str2 != null) {
            c3636c1.n("environment");
            c3636c1.v(h10, str2);
        }
        String str3 = this.f34844o0;
        if (str3 != null) {
            c3636c1.n("ip_address");
            c3636c1.v(h10, str3);
        }
        if (this.f34845p0 != null) {
            c3636c1.n("user_agent");
            c3636c1.v(h10, this.f34845p0);
        }
        c3636c1.j();
        Map map = this.f34850u0;
        if (map != null) {
            for (String str4 : map.keySet()) {
                AbstractC2469q0.r(this.f34850u0, str4, c3636c1, str4, h10);
            }
        }
        c3636c1.j();
    }
}
