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

/* loaded from: classes.dex */
public final class P extends AbstractC4467l {

    /* renamed from: i0  reason: collision with root package name */
    public int f30378i0;

    /* renamed from: j0  reason: collision with root package name */
    public List f30379j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f30380k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30381l0;

    /* renamed from: m0  reason: collision with root package name */
    public Q f30382m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f30383n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f30384o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f30385p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f30386q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f30387r0;

    /* renamed from: s0  reason: collision with root package name */
    public Q f30388s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f30389t0;

    /* renamed from: u0  reason: collision with root package name */
    public Q f30390u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f30391v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f30392w0;

    /* JADX WARN: Type inference failed for: r0v0, types: [lg.l, fg.P] */
    public static P f() {
        ?? abstractC4467l = new AbstractC4467l();
        abstractC4467l.f30379j0 = Collections.emptyList();
        Q q10 = Q.f30393y0;
        abstractC4467l.f30382m0 = q10;
        abstractC4467l.f30388s0 = q10;
        abstractC4467l.f30390u0 = q10;
        return abstractC4467l;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        Q e10 = e();
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
        Q q10 = null;
        try {
            try {
                g((Q) Q.f30394z0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                Q q11 = (Q) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    q10 = q11;
                    if (q10 != null) {
                        g(q10);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (q10 != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        g((Q) pVar);
        return this;
    }

    public final Object clone() {
        P f6 = f();
        f6.g(e());
        return f6;
    }

    public final Q e() {
        Q q10 = new Q(this);
        int i10 = this.f30378i0;
        int i11 = 1;
        if ((i10 & 1) == 1) {
            this.f30379j0 = Collections.unmodifiableList(this.f30379j0);
            this.f30378i0 &= -2;
        }
        q10.f30397i0 = this.f30379j0;
        if ((i10 & 2) != 2) {
            i11 = 0;
        }
        q10.f30398j0 = this.f30380k0;
        if ((i10 & 4) == 4) {
            i11 |= 2;
        }
        q10.f30399k0 = this.f30381l0;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        q10.f30400l0 = this.f30382m0;
        if ((i10 & 16) == 16) {
            i11 |= 8;
        }
        q10.f30401m0 = this.f30383n0;
        if ((i10 & 32) == 32) {
            i11 |= 16;
        }
        q10.f30402n0 = this.f30384o0;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        q10.f30403o0 = this.f30385p0;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        q10.f30404p0 = this.f30386q0;
        if ((i10 & 256) == 256) {
            i11 |= 128;
        }
        q10.f30405q0 = this.f30387r0;
        if ((i10 & 512) == 512) {
            i11 |= 256;
        }
        q10.f30406r0 = this.f30388s0;
        if ((i10 & 1024) == 1024) {
            i11 |= 512;
        }
        q10.f30407s0 = this.f30389t0;
        if ((i10 & 2048) == 2048) {
            i11 |= 1024;
        }
        q10.f30408t0 = this.f30390u0;
        if ((i10 & 4096) == 4096) {
            i11 |= 2048;
        }
        q10.f30409u0 = this.f30391v0;
        if ((i10 & 8192) == 8192) {
            i11 |= 4096;
        }
        q10.f30410v0 = this.f30392w0;
        q10.f30396h0 = i11;
        return q10;
    }

    public final P g(Q q10) {
        Q q11;
        Q q12;
        Q q13;
        Q q14 = Q.f30393y0;
        if (q10 == q14) {
            return this;
        }
        boolean z10 = true;
        if (!q10.f30397i0.isEmpty()) {
            if (this.f30379j0.isEmpty()) {
                this.f30379j0 = q10.f30397i0;
                this.f30378i0 &= -2;
            } else {
                if ((this.f30378i0 & 1) != 1) {
                    this.f30379j0 = new ArrayList(this.f30379j0);
                    this.f30378i0 |= 1;
                }
                this.f30379j0.addAll(q10.f30397i0);
            }
        }
        int i10 = q10.f30396h0;
        if ((i10 & 1) == 1) {
            boolean z11 = q10.f30398j0;
            this.f30378i0 |= 2;
            this.f30380k0 = z11;
        }
        if ((i10 & 2) == 2) {
            int i11 = q10.f30399k0;
            this.f30378i0 |= 4;
            this.f30381l0 = i11;
        }
        if ((i10 & 4) == 4) {
            Q q15 = q10.f30400l0;
            if ((this.f30378i0 & 8) == 8 && (q13 = this.f30382m0) != q14) {
                P q16 = Q.q(q13);
                q16.g(q15);
                this.f30382m0 = q16.e();
            } else {
                this.f30382m0 = q15;
            }
            this.f30378i0 |= 8;
        }
        if ((q10.f30396h0 & 8) == 8) {
            int i12 = q10.f30401m0;
            this.f30378i0 |= 16;
            this.f30383n0 = i12;
        }
        if (q10.o()) {
            int i13 = q10.f30402n0;
            this.f30378i0 |= 32;
            this.f30384o0 = i13;
        }
        int i14 = q10.f30396h0;
        if ((i14 & 32) == 32) {
            int i15 = q10.f30403o0;
            this.f30378i0 |= 64;
            this.f30385p0 = i15;
        }
        if ((i14 & 64) == 64) {
            int i16 = q10.f30404p0;
            this.f30378i0 |= 128;
            this.f30386q0 = i16;
        }
        if ((i14 & 128) == 128) {
            int i17 = q10.f30405q0;
            this.f30378i0 |= 256;
            this.f30387r0 = i17;
        }
        if ((i14 & 256) == 256) {
            Q q17 = q10.f30406r0;
            if ((this.f30378i0 & 512) == 512 && (q12 = this.f30388s0) != q14) {
                P q18 = Q.q(q12);
                q18.g(q17);
                this.f30388s0 = q18.e();
            } else {
                this.f30388s0 = q17;
            }
            this.f30378i0 |= 512;
        }
        int i18 = q10.f30396h0;
        if ((i18 & 512) == 512) {
            int i19 = q10.f30407s0;
            this.f30378i0 |= 1024;
            this.f30389t0 = i19;
        }
        if ((i18 & 1024) == 1024) {
            Q q19 = q10.f30408t0;
            if ((this.f30378i0 & 2048) == 2048 && (q11 = this.f30390u0) != q14) {
                P q20 = Q.q(q11);
                q20.g(q19);
                this.f30390u0 = q20.e();
            } else {
                this.f30390u0 = q19;
            }
            this.f30378i0 |= 2048;
        }
        int i20 = q10.f30396h0;
        if ((i20 & 2048) != 2048) {
            z10 = false;
        }
        if (z10) {
            int i21 = q10.f30409u0;
            this.f30378i0 |= 4096;
            this.f30391v0 = i21;
        }
        if ((i20 & 4096) == 4096) {
            int i22 = q10.f30410v0;
            this.f30378i0 |= 8192;
            this.f30392w0 = i22;
        }
        d(q10);
        this.f38400Y = this.f38400Y.r(q10.f30395Z);
        return this;
    }
}
