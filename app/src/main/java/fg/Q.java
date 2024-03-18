package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.AbstractC4456a;
import lg.AbstractC4460e;
import lg.AbstractC4467l;
import lg.AbstractC4468m;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;
import lg.C4464i;

/* loaded from: classes.dex */
public final class Q extends AbstractC4468m {

    /* renamed from: y0  reason: collision with root package name */
    public static final Q f30393y0;

    /* renamed from: z0  reason: collision with root package name */
    public static final C3033a f30394z0 = new C3033a(16);

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4460e f30395Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30396h0;

    /* renamed from: i0  reason: collision with root package name */
    public List f30397i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f30398j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30399k0;

    /* renamed from: l0  reason: collision with root package name */
    public Q f30400l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f30401m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f30402n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f30403o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f30404p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f30405q0;

    /* renamed from: r0  reason: collision with root package name */
    public Q f30406r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f30407s0;

    /* renamed from: t0  reason: collision with root package name */
    public Q f30408t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f30409u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f30410v0;

    /* renamed from: w0  reason: collision with root package name */
    public byte f30411w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f30412x0;

    static {
        Q q10 = new Q();
        f30393y0 = q10;
        q10.p();
    }

    public Q(AbstractC4467l abstractC4467l) {
        super(abstractC4467l);
        this.f30411w0 = (byte) -1;
        this.f30412x0 = -1;
        this.f30395Z = abstractC4467l.f38400Y;
    }

    public static P q(Q q10) {
        P f6 = P.f();
        f6.g(q10);
        return f6;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30412x0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30396h0 & 4096) == 4096) {
            i10 = C4462g.b(1, this.f30410v0);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < this.f30397i0.size(); i12++) {
            i10 += C4462g.d(2, (AbstractC4456a) this.f30397i0.get(i12));
        }
        if ((this.f30396h0 & 1) == 1) {
            i10 += C4462g.h(3) + 1;
        }
        if ((this.f30396h0 & 2) == 2) {
            i10 += C4462g.b(4, this.f30399k0);
        }
        if ((this.f30396h0 & 4) == 4) {
            i10 += C4462g.d(5, this.f30400l0);
        }
        if ((this.f30396h0 & 16) == 16) {
            i10 += C4462g.b(6, this.f30402n0);
        }
        if ((this.f30396h0 & 32) == 32) {
            i10 += C4462g.b(7, this.f30403o0);
        }
        if ((this.f30396h0 & 8) == 8) {
            i10 += C4462g.b(8, this.f30401m0);
        }
        if ((this.f30396h0 & 64) == 64) {
            i10 += C4462g.b(9, this.f30404p0);
        }
        if ((this.f30396h0 & 256) == 256) {
            i10 += C4462g.d(10, this.f30406r0);
        }
        if ((this.f30396h0 & 512) == 512) {
            i10 += C4462g.b(11, this.f30407s0);
        }
        if ((this.f30396h0 & 128) == 128) {
            i10 += C4462g.b(12, this.f30405q0);
        }
        if ((this.f30396h0 & 1024) == 1024) {
            i10 += C4462g.d(13, this.f30408t0);
        }
        if ((this.f30396h0 & 2048) == 2048) {
            i10 += C4462g.b(14, this.f30409u0);
        }
        int size = this.f30395Z.size() + h() + i10;
        this.f30412x0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return P.f();
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        B2.E e10 = new B2.E(this);
        if ((this.f30396h0 & 4096) == 4096) {
            c4462g.m(1, this.f30410v0);
        }
        for (int i10 = 0; i10 < this.f30397i0.size(); i10++) {
            c4462g.o(2, (AbstractC4456a) this.f30397i0.get(i10));
        }
        if ((this.f30396h0 & 1) == 1) {
            boolean z10 = this.f30398j0;
            c4462g.x(3, 0);
            c4462g.q(z10 ? 1 : 0);
        }
        if ((this.f30396h0 & 2) == 2) {
            c4462g.m(4, this.f30399k0);
        }
        if ((this.f30396h0 & 4) == 4) {
            c4462g.o(5, this.f30400l0);
        }
        if ((this.f30396h0 & 16) == 16) {
            c4462g.m(6, this.f30402n0);
        }
        if ((this.f30396h0 & 32) == 32) {
            c4462g.m(7, this.f30403o0);
        }
        if ((this.f30396h0 & 8) == 8) {
            c4462g.m(8, this.f30401m0);
        }
        if ((this.f30396h0 & 64) == 64) {
            c4462g.m(9, this.f30404p0);
        }
        if ((this.f30396h0 & 256) == 256) {
            c4462g.o(10, this.f30406r0);
        }
        if ((this.f30396h0 & 512) == 512) {
            c4462g.m(11, this.f30407s0);
        }
        if ((this.f30396h0 & 128) == 128) {
            c4462g.m(12, this.f30405q0);
        }
        if ((this.f30396h0 & 1024) == 1024) {
            c4462g.o(13, this.f30408t0);
        }
        if ((this.f30396h0 & 2048) == 2048) {
            c4462g.m(14, this.f30409u0);
        }
        e10.h(RCHTTPStatusCodes.SUCCESS, c4462g);
        c4462g.r(this.f30395Z);
    }

    @Override // lg.x
    public final AbstractC4456a getDefaultInstanceForType() {
        return f30393y0;
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30411w0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f30397i0.size(); i10++) {
            if (!((O) this.f30397i0.get(i10)).isInitialized()) {
                this.f30411w0 = (byte) 0;
                return false;
            }
        }
        if ((this.f30396h0 & 4) == 4 && !this.f30400l0.isInitialized()) {
            this.f30411w0 = (byte) 0;
            return false;
        } else if ((this.f30396h0 & 256) == 256 && !this.f30406r0.isInitialized()) {
            this.f30411w0 = (byte) 0;
            return false;
        } else if ((this.f30396h0 & 1024) == 1024 && !this.f30408t0.isInitialized()) {
            this.f30411w0 = (byte) 0;
            return false;
        } else if (!g()) {
            this.f30411w0 = (byte) 0;
            return false;
        } else {
            this.f30411w0 = (byte) 1;
            return true;
        }
    }

    public final boolean o() {
        if ((this.f30396h0 & 16) == 16) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.f30397i0 = Collections.emptyList();
        this.f30398j0 = false;
        this.f30399k0 = 0;
        Q q10 = f30393y0;
        this.f30400l0 = q10;
        this.f30401m0 = 0;
        this.f30402n0 = 0;
        this.f30403o0 = 0;
        this.f30404p0 = 0;
        this.f30405q0 = 0;
        this.f30406r0 = q10;
        this.f30407s0 = 0;
        this.f30408t0 = q10;
        this.f30409u0 = 0;
        this.f30410v0 = 0;
    }

    /* renamed from: r */
    public final P c() {
        return q(this);
    }

    public Q() {
        this.f30411w0 = (byte) -1;
        this.f30412x0 = -1;
        this.f30395Z = AbstractC4460e.f38378Y;
    }

    public Q(C4461f c4461f, C4464i c4464i) {
        this.f30411w0 = (byte) -1;
        this.f30412x0 = -1;
        p();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = c4461f.n();
                    C3033a c3033a = f30394z0;
                    P p10 = null;
                    switch (n10) {
                        case 0:
                            break;
                        case 8:
                            this.f30396h0 |= 4096;
                            this.f30410v0 = c4461f.k();
                            continue;
                        case 18:
                            if (!(z11 & true)) {
                                this.f30397i0 = new ArrayList();
                                z11 = true;
                            }
                            this.f30397i0.add(c4461f.g(O.f30370n0, c4464i));
                            continue;
                        case 24:
                            this.f30396h0 |= 1;
                            this.f30398j0 = c4461f.l() != 0;
                            continue;
                        case 32:
                            this.f30396h0 |= 2;
                            this.f30399k0 = c4461f.k();
                            continue;
                        case 42:
                            if ((this.f30396h0 & 4) == 4) {
                                Q q10 = this.f30400l0;
                                q10.getClass();
                                p10 = q(q10);
                            }
                            Q q11 = (Q) c4461f.g(c3033a, c4464i);
                            this.f30400l0 = q11;
                            if (p10 != null) {
                                p10.g(q11);
                                this.f30400l0 = p10.e();
                            }
                            this.f30396h0 |= 4;
                            continue;
                        case r9.y.f44626f /* 48 */:
                            this.f30396h0 |= 16;
                            this.f30402n0 = c4461f.k();
                            continue;
                        case 56:
                            this.f30396h0 |= 32;
                            this.f30403o0 = c4461f.k();
                            continue;
                        case 64:
                            this.f30396h0 |= 8;
                            this.f30401m0 = c4461f.k();
                            continue;
                        case 72:
                            this.f30396h0 |= 64;
                            this.f30404p0 = c4461f.k();
                            continue;
                        case 82:
                            if ((this.f30396h0 & 256) == 256) {
                                Q q12 = this.f30406r0;
                                q12.getClass();
                                p10 = q(q12);
                            }
                            Q q13 = (Q) c4461f.g(c3033a, c4464i);
                            this.f30406r0 = q13;
                            if (p10 != null) {
                                p10.g(q13);
                                this.f30406r0 = p10.e();
                            }
                            this.f30396h0 |= 256;
                            continue;
                        case 88:
                            this.f30396h0 |= 512;
                            this.f30407s0 = c4461f.k();
                            continue;
                        case 96:
                            this.f30396h0 |= 128;
                            this.f30405q0 = c4461f.k();
                            continue;
                        case 106:
                            if ((this.f30396h0 & 1024) == 1024) {
                                Q q14 = this.f30408t0;
                                q14.getClass();
                                p10 = q(q14);
                            }
                            Q q15 = (Q) c4461f.g(c3033a, c4464i);
                            this.f30408t0 = q15;
                            if (p10 != null) {
                                p10.g(q15);
                                this.f30408t0 = p10.e();
                            }
                            this.f30396h0 |= 1024;
                            continue;
                        case 112:
                            this.f30396h0 |= 2048;
                            this.f30409u0 = c4461f.k();
                            continue;
                        default:
                            if (!m(c4461f, j6, c4464i, n10)) {
                                break;
                            } else {
                                continue;
                            }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f30397i0 = Collections.unmodifiableList(this.f30397i0);
                    }
                    try {
                        j6.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f30395Z = c4459d.i();
                        throw th3;
                    }
                    this.f30395Z = c4459d.i();
                    k();
                    throw th2;
                }
            } catch (lg.t e10) {
                e10.f38415Y = this;
                throw e10;
            } catch (IOException e11) {
                lg.t tVar = new lg.t(e11.getMessage());
                tVar.f38415Y = this;
                throw tVar;
            }
        }
        if (z11 & true) {
            this.f30397i0 = Collections.unmodifiableList(this.f30397i0);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30395Z = c4459d.i();
            throw th4;
        }
        this.f30395Z = c4459d.i();
        k();
    }
}
