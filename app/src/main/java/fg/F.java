package fg;

import android.gov.nist.javax.sip.parser.TokenTypes;
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
public final class F extends AbstractC4467l {

    /* renamed from: i0  reason: collision with root package name */
    public int f30293i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30294j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30295k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30296l0;

    /* renamed from: m0  reason: collision with root package name */
    public Q f30297m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f30298n0;

    /* renamed from: o0  reason: collision with root package name */
    public List f30299o0;

    /* renamed from: p0  reason: collision with root package name */
    public Q f30300p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f30301q0;

    /* renamed from: r0  reason: collision with root package name */
    public List f30302r0;

    /* renamed from: s0  reason: collision with root package name */
    public List f30303s0;

    /* renamed from: t0  reason: collision with root package name */
    public Z f30304t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f30305u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f30306v0;

    /* renamed from: w0  reason: collision with root package name */
    public List f30307w0;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.F, lg.l] */
    public static F f() {
        ?? abstractC4467l = new AbstractC4467l();
        abstractC4467l.f30294j0 = 518;
        abstractC4467l.f30295k0 = TokenTypes.ACK;
        Q q10 = Q.f30393y0;
        abstractC4467l.f30297m0 = q10;
        abstractC4467l.f30299o0 = Collections.emptyList();
        abstractC4467l.f30300p0 = q10;
        abstractC4467l.f30302r0 = Collections.emptyList();
        abstractC4467l.f30303s0 = Collections.emptyList();
        abstractC4467l.f30304t0 = Z.f30478q0;
        abstractC4467l.f30307w0 = Collections.emptyList();
        return abstractC4467l;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        G e10 = e();
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
        G g10 = null;
        try {
            try {
                g((G) G.f30308A0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                G g11 = (G) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    g10 = g11;
                    if (g10 != null) {
                        g(g10);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (g10 != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        g((G) pVar);
        return this;
    }

    public final Object clone() {
        F f6 = f();
        f6.g(e());
        return f6;
    }

    public final G e() {
        G g10 = new G(this);
        int i10 = this.f30293i0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        g10.f30312i0 = this.f30294j0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        g10.f30313j0 = this.f30295k0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        g10.f30314k0 = this.f30296l0;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        g10.f30315l0 = this.f30297m0;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        g10.f30316m0 = this.f30298n0;
        if ((i10 & 32) == 32) {
            this.f30299o0 = Collections.unmodifiableList(this.f30299o0);
            this.f30293i0 &= -33;
        }
        g10.f30317n0 = this.f30299o0;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        g10.f30318o0 = this.f30300p0;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        g10.f30319p0 = this.f30301q0;
        if ((this.f30293i0 & 256) == 256) {
            this.f30302r0 = Collections.unmodifiableList(this.f30302r0);
            this.f30293i0 &= -257;
        }
        g10.f30320q0 = this.f30302r0;
        if ((this.f30293i0 & 512) == 512) {
            this.f30303s0 = Collections.unmodifiableList(this.f30303s0);
            this.f30293i0 &= -513;
        }
        g10.f30321r0 = this.f30303s0;
        if ((i10 & 1024) == 1024) {
            i11 |= 128;
        }
        g10.f30323t0 = this.f30304t0;
        if ((i10 & 2048) == 2048) {
            i11 |= 256;
        }
        g10.f30324u0 = this.f30305u0;
        if ((i10 & 4096) == 4096) {
            i11 |= 512;
        }
        g10.f30325v0 = this.f30306v0;
        if ((this.f30293i0 & 8192) == 8192) {
            this.f30307w0 = Collections.unmodifiableList(this.f30307w0);
            this.f30293i0 &= -8193;
        }
        g10.f30326w0 = this.f30307w0;
        g10.f30311h0 = i11;
        return g10;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [fg.Y, lg.l] */
    public final void g(G g10) {
        Z z10;
        Q q10;
        Q q11;
        if (g10 == G.f30309z0) {
            return;
        }
        int i10 = g10.f30311h0;
        if ((i10 & 1) == 1) {
            int i11 = g10.f30312i0;
            this.f30293i0 = 1 | this.f30293i0;
            this.f30294j0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = g10.f30313j0;
            this.f30293i0 = 2 | this.f30293i0;
            this.f30295k0 = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = g10.f30314k0;
            this.f30293i0 = 4 | this.f30293i0;
            this.f30296l0 = i13;
        }
        if ((i10 & 8) == 8) {
            Q q12 = g10.f30315l0;
            if ((this.f30293i0 & 8) == 8 && (q11 = this.f30297m0) != Q.f30393y0) {
                P q13 = Q.q(q11);
                q13.g(q12);
                this.f30297m0 = q13.e();
            } else {
                this.f30297m0 = q12;
            }
            this.f30293i0 |= 8;
        }
        if ((g10.f30311h0 & 16) == 16) {
            int i14 = g10.f30316m0;
            this.f30293i0 = 16 | this.f30293i0;
            this.f30298n0 = i14;
        }
        if (!g10.f30317n0.isEmpty()) {
            if (this.f30299o0.isEmpty()) {
                this.f30299o0 = g10.f30317n0;
                this.f30293i0 &= -33;
            } else {
                if ((this.f30293i0 & 32) != 32) {
                    this.f30299o0 = new ArrayList(this.f30299o0);
                    this.f30293i0 |= 32;
                }
                this.f30299o0.addAll(g10.f30317n0);
            }
        }
        if (g10.o()) {
            Q q14 = g10.f30318o0;
            if ((this.f30293i0 & 64) == 64 && (q10 = this.f30300p0) != Q.f30393y0) {
                P q15 = Q.q(q10);
                q15.g(q14);
                this.f30300p0 = q15.e();
            } else {
                this.f30300p0 = q14;
            }
            this.f30293i0 |= 64;
        }
        if ((g10.f30311h0 & 64) == 64) {
            int i15 = g10.f30319p0;
            this.f30293i0 |= 128;
            this.f30301q0 = i15;
        }
        if (!g10.f30320q0.isEmpty()) {
            if (this.f30302r0.isEmpty()) {
                this.f30302r0 = g10.f30320q0;
                this.f30293i0 &= -257;
            } else {
                if ((this.f30293i0 & 256) != 256) {
                    this.f30302r0 = new ArrayList(this.f30302r0);
                    this.f30293i0 |= 256;
                }
                this.f30302r0.addAll(g10.f30320q0);
            }
        }
        if (!g10.f30321r0.isEmpty()) {
            if (this.f30303s0.isEmpty()) {
                this.f30303s0 = g10.f30321r0;
                this.f30293i0 &= -513;
            } else {
                if ((this.f30293i0 & 512) != 512) {
                    this.f30303s0 = new ArrayList(this.f30303s0);
                    this.f30293i0 |= 512;
                }
                this.f30303s0.addAll(g10.f30321r0);
            }
        }
        if ((g10.f30311h0 & 128) == 128) {
            Z z11 = g10.f30323t0;
            if ((this.f30293i0 & 1024) == 1024 && (z10 = this.f30304t0) != Z.f30478q0) {
                ?? abstractC4467l = new AbstractC4467l();
                Q q16 = Q.f30393y0;
                abstractC4467l.f30474l0 = q16;
                abstractC4467l.f30476n0 = q16;
                abstractC4467l.f(z10);
                abstractC4467l.f(z11);
                this.f30304t0 = abstractC4467l.e();
            } else {
                this.f30304t0 = z11;
            }
            this.f30293i0 |= 1024;
        }
        int i16 = g10.f30311h0;
        if ((i16 & 256) == 256) {
            int i17 = g10.f30324u0;
            this.f30293i0 |= 2048;
            this.f30305u0 = i17;
        }
        if ((i16 & 512) == 512) {
            int i18 = g10.f30325v0;
            this.f30293i0 |= 4096;
            this.f30306v0 = i18;
        }
        if (!g10.f30326w0.isEmpty()) {
            if (this.f30307w0.isEmpty()) {
                this.f30307w0 = g10.f30326w0;
                this.f30293i0 &= -8193;
            } else {
                if ((this.f30293i0 & 8192) != 8192) {
                    this.f30307w0 = new ArrayList(this.f30307w0);
                    this.f30293i0 |= 8192;
                }
                this.f30307w0.addAll(g10.f30326w0);
            }
        }
        d(g10);
        this.f38400Y = this.f38400Y.r(g10.f30310Z);
    }
}
