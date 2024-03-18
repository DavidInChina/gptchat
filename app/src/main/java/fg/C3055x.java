package fg;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.AbstractC4467l;
import lg.C4461f;
import lg.C4464i;

/* renamed from: fg.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3055x extends AbstractC4467l {

    /* renamed from: i0  reason: collision with root package name */
    public int f30750i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30751j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30752k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30753l0;

    /* renamed from: m0  reason: collision with root package name */
    public Q f30754m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f30755n0;

    /* renamed from: o0  reason: collision with root package name */
    public List f30756o0;

    /* renamed from: p0  reason: collision with root package name */
    public Q f30757p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f30758q0;

    /* renamed from: r0  reason: collision with root package name */
    public List f30759r0;

    /* renamed from: s0  reason: collision with root package name */
    public List f30760s0;

    /* renamed from: t0  reason: collision with root package name */
    public List f30761t0;

    /* renamed from: u0  reason: collision with root package name */
    public X f30762u0;

    /* renamed from: v0  reason: collision with root package name */
    public List f30763v0;

    /* renamed from: w0  reason: collision with root package name */
    public C3046n f30764w0;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.x, lg.l] */
    public static C3055x f() {
        ?? abstractC4467l = new AbstractC4467l();
        abstractC4467l.f30751j0 = 6;
        abstractC4467l.f30752k0 = 6;
        Q q10 = Q.f30393y0;
        abstractC4467l.f30754m0 = q10;
        abstractC4467l.f30756o0 = Collections.emptyList();
        abstractC4467l.f30757p0 = q10;
        abstractC4467l.f30759r0 = Collections.emptyList();
        abstractC4467l.f30760s0 = Collections.emptyList();
        abstractC4467l.f30761t0 = Collections.emptyList();
        abstractC4467l.f30762u0 = X.f30463l0;
        abstractC4467l.f30763v0 = Collections.emptyList();
        abstractC4467l.f30764w0 = C3046n.f30684j0;
        return abstractC4467l;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        C3056y e10 = e();
        if (e10.isInitialized()) {
            return e10;
        }
        throw new n0();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC2041a b(C4461f c4461f, C4464i c4464i) {
        Throwable th2;
        C3056y c3056y = null;
        try {
            try {
                g((C3056y) C3056y.f30765A0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                C3056y c3056y2 = (C3056y) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    c3056y = c3056y2;
                    if (c3056y != null) {
                        g(c3056y);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (c3056y != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        g((C3056y) pVar);
        return this;
    }

    public final Object clone() {
        C3055x f6 = f();
        f6.g(e());
        return f6;
    }

    public final C3056y e() {
        C3056y c3056y = new C3056y(this);
        int i10 = this.f30750i0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        c3056y.f30769i0 = this.f30751j0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c3056y.f30770j0 = this.f30752k0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c3056y.f30771k0 = this.f30753l0;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        c3056y.f30772l0 = this.f30754m0;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        c3056y.f30773m0 = this.f30755n0;
        if ((i10 & 32) == 32) {
            this.f30756o0 = Collections.unmodifiableList(this.f30756o0);
            this.f30750i0 &= -33;
        }
        c3056y.f30774n0 = this.f30756o0;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        c3056y.f30775o0 = this.f30757p0;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        c3056y.f30776p0 = this.f30758q0;
        if ((this.f30750i0 & 256) == 256) {
            this.f30759r0 = Collections.unmodifiableList(this.f30759r0);
            this.f30750i0 &= -257;
        }
        c3056y.f30777q0 = this.f30759r0;
        if ((this.f30750i0 & 512) == 512) {
            this.f30760s0 = Collections.unmodifiableList(this.f30760s0);
            this.f30750i0 &= -513;
        }
        c3056y.f30778r0 = this.f30760s0;
        if ((this.f30750i0 & 1024) == 1024) {
            this.f30761t0 = Collections.unmodifiableList(this.f30761t0);
            this.f30750i0 &= -1025;
        }
        c3056y.f30780t0 = this.f30761t0;
        if ((i10 & 2048) == 2048) {
            i11 |= 128;
        }
        c3056y.f30781u0 = this.f30762u0;
        if ((this.f30750i0 & 4096) == 4096) {
            this.f30763v0 = Collections.unmodifiableList(this.f30763v0);
            this.f30750i0 &= -4097;
        }
        c3056y.f30782v0 = this.f30763v0;
        if ((i10 & 8192) == 8192) {
            i11 |= 256;
        }
        c3056y.f30783w0 = this.f30764w0;
        c3056y.f30768h0 = i11;
        return c3056y;
    }

    public final void g(C3056y c3056y) {
        C3046n c3046n;
        X x10;
        Q q10;
        Q q11;
        if (c3056y == C3056y.f30766z0) {
            return;
        }
        int i10 = c3056y.f30768h0;
        if ((i10 & 1) == 1) {
            int i11 = c3056y.f30769i0;
            this.f30750i0 = 1 | this.f30750i0;
            this.f30751j0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = c3056y.f30770j0;
            this.f30750i0 = 2 | this.f30750i0;
            this.f30752k0 = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = c3056y.f30771k0;
            this.f30750i0 = 4 | this.f30750i0;
            this.f30753l0 = i13;
        }
        if ((i10 & 8) == 8) {
            Q q12 = c3056y.f30772l0;
            if ((this.f30750i0 & 8) == 8 && (q11 = this.f30754m0) != Q.f30393y0) {
                P q13 = Q.q(q11);
                q13.g(q12);
                this.f30754m0 = q13.e();
            } else {
                this.f30754m0 = q12;
            }
            this.f30750i0 |= 8;
        }
        if ((c3056y.f30768h0 & 16) == 16) {
            int i14 = c3056y.f30773m0;
            this.f30750i0 = 16 | this.f30750i0;
            this.f30755n0 = i14;
        }
        if (!c3056y.f30774n0.isEmpty()) {
            if (this.f30756o0.isEmpty()) {
                this.f30756o0 = c3056y.f30774n0;
                this.f30750i0 &= -33;
            } else {
                if ((this.f30750i0 & 32) != 32) {
                    this.f30756o0 = new ArrayList(this.f30756o0);
                    this.f30750i0 |= 32;
                }
                this.f30756o0.addAll(c3056y.f30774n0);
            }
        }
        if (c3056y.o()) {
            Q q14 = c3056y.f30775o0;
            if ((this.f30750i0 & 64) == 64 && (q10 = this.f30757p0) != Q.f30393y0) {
                P q15 = Q.q(q10);
                q15.g(q14);
                this.f30757p0 = q15.e();
            } else {
                this.f30757p0 = q14;
            }
            this.f30750i0 |= 64;
        }
        if ((c3056y.f30768h0 & 64) == 64) {
            int i15 = c3056y.f30776p0;
            this.f30750i0 |= 128;
            this.f30758q0 = i15;
        }
        if (!c3056y.f30777q0.isEmpty()) {
            if (this.f30759r0.isEmpty()) {
                this.f30759r0 = c3056y.f30777q0;
                this.f30750i0 &= -257;
            } else {
                if ((this.f30750i0 & 256) != 256) {
                    this.f30759r0 = new ArrayList(this.f30759r0);
                    this.f30750i0 |= 256;
                }
                this.f30759r0.addAll(c3056y.f30777q0);
            }
        }
        if (!c3056y.f30778r0.isEmpty()) {
            if (this.f30760s0.isEmpty()) {
                this.f30760s0 = c3056y.f30778r0;
                this.f30750i0 &= -513;
            } else {
                if ((this.f30750i0 & 512) != 512) {
                    this.f30760s0 = new ArrayList(this.f30760s0);
                    this.f30750i0 |= 512;
                }
                this.f30760s0.addAll(c3056y.f30778r0);
            }
        }
        if (!c3056y.f30780t0.isEmpty()) {
            if (this.f30761t0.isEmpty()) {
                this.f30761t0 = c3056y.f30780t0;
                this.f30750i0 &= -1025;
            } else {
                if ((this.f30750i0 & 1024) != 1024) {
                    this.f30761t0 = new ArrayList(this.f30761t0);
                    this.f30750i0 |= 1024;
                }
                this.f30761t0.addAll(c3056y.f30780t0);
            }
        }
        if ((c3056y.f30768h0 & 128) == 128) {
            X x11 = c3056y.f30781u0;
            if ((this.f30750i0 & 2048) == 2048 && (x10 = this.f30762u0) != X.f30463l0) {
                C3038f g10 = X.g(x10);
                g10.i(x11);
                this.f30762u0 = g10.f();
            } else {
                this.f30762u0 = x11;
            }
            this.f30750i0 |= 2048;
        }
        if (!c3056y.f30782v0.isEmpty()) {
            if (this.f30763v0.isEmpty()) {
                this.f30763v0 = c3056y.f30782v0;
                this.f30750i0 &= -4097;
            } else {
                if ((this.f30750i0 & 4096) != 4096) {
                    this.f30763v0 = new ArrayList(this.f30763v0);
                    this.f30750i0 |= 4096;
                }
                this.f30763v0.addAll(c3056y.f30782v0);
            }
        }
        if ((c3056y.f30768h0 & 256) == 256) {
            C3046n c3046n2 = c3056y.f30783w0;
            if ((this.f30750i0 & 8192) == 8192 && (c3046n = this.f30764w0) != C3046n.f30684j0) {
                C3045m c3045m = new C3045m(0);
                c3045m.h(c3046n);
                c3045m.h(c3046n2);
                this.f30764w0 = c3045m.d();
            } else {
                this.f30764w0 = c3046n2;
            }
            this.f30750i0 |= 8192;
        }
        d(c3056y);
        this.f38400Y = this.f38400Y.r(c3056y.f30767Z);
    }
}
