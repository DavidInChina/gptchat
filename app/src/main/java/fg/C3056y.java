package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import com.statsig.androidsdk.StatsigLoggerKt;
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

/* renamed from: fg.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3056y extends AbstractC4468m {

    /* renamed from: A0  reason: collision with root package name */
    public static final C3033a f30765A0 = new C3033a(9);

    /* renamed from: z0  reason: collision with root package name */
    public static final C3056y f30766z0;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4460e f30767Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30768h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30769i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30770j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30771k0;

    /* renamed from: l0  reason: collision with root package name */
    public Q f30772l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f30773m0;

    /* renamed from: n0  reason: collision with root package name */
    public List f30774n0;

    /* renamed from: o0  reason: collision with root package name */
    public Q f30775o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f30776p0;

    /* renamed from: q0  reason: collision with root package name */
    public List f30777q0;

    /* renamed from: r0  reason: collision with root package name */
    public List f30778r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f30779s0;

    /* renamed from: t0  reason: collision with root package name */
    public List f30780t0;

    /* renamed from: u0  reason: collision with root package name */
    public X f30781u0;

    /* renamed from: v0  reason: collision with root package name */
    public List f30782v0;

    /* renamed from: w0  reason: collision with root package name */
    public C3046n f30783w0;

    /* renamed from: x0  reason: collision with root package name */
    public byte f30784x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f30785y0;

    static {
        C3056y c3056y = new C3056y();
        f30766z0 = c3056y;
        c3056y.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    public C3056y(C4461f c4461f, C4464i c4464i) {
        this.f30779s0 = -1;
        this.f30784x0 = (byte) -1;
        this.f30785y0 = -1;
        p();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r92 = 1024;
            if (!z10) {
                try {
                    try {
                        int n10 = c4461f.n();
                        P p10 = null;
                        C3045m c3045m = null;
                        C3038f c3038f = null;
                        P p11 = null;
                        switch (n10) {
                            case 0:
                                break;
                            case 8:
                                this.f30768h0 |= 2;
                                this.f30770j0 = c4461f.k();
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 16:
                                this.f30768h0 |= 4;
                                this.f30771k0 = c4461f.k();
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 26:
                                if ((this.f30768h0 & 8) == 8) {
                                    Q q10 = this.f30772l0;
                                    q10.getClass();
                                    p10 = Q.q(q10);
                                }
                                Q q11 = (Q) c4461f.g(Q.f30394z0, c4464i);
                                this.f30772l0 = q11;
                                if (p10 != null) {
                                    p10.g(q11);
                                    this.f30772l0 = p10.e();
                                }
                                this.f30768h0 |= 8;
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 34:
                                boolean z12 = z11 & true;
                                z11 = z11;
                                if (!z12) {
                                    this.f30774n0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f30774n0.add(c4461f.g(W.f30451s0, c4464i));
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 42:
                                if ((this.f30768h0 & 32) == 32) {
                                    Q q12 = this.f30775o0;
                                    q12.getClass();
                                    p11 = Q.q(q12);
                                }
                                Q q13 = (Q) c4461f.g(Q.f30394z0, c4464i);
                                this.f30775o0 = q13;
                                if (p11 != null) {
                                    p11.g(q13);
                                    this.f30775o0 = p11.e();
                                }
                                this.f30768h0 |= 32;
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                boolean z13 = z11 & true;
                                z11 = z11;
                                if (!z13) {
                                    this.f30780t0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f30780t0.add(c4461f.g(Z.f30479r0, c4464i));
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 56:
                                this.f30768h0 |= 16;
                                this.f30773m0 = c4461f.k();
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 64:
                                this.f30768h0 |= 64;
                                this.f30776p0 = c4461f.k();
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 72:
                                this.f30768h0 |= 1;
                                this.f30769i0 = c4461f.k();
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 82:
                                boolean z14 = z11 & true;
                                z11 = z11;
                                if (!z14) {
                                    this.f30777q0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f30777q0.add(c4461f.g(Q.f30394z0, c4464i));
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 88:
                                boolean z15 = z11 & true;
                                z11 = z11;
                                if (!z15) {
                                    this.f30778r0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f30778r0.add(Integer.valueOf(c4461f.k()));
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 90:
                                int d10 = c4461f.d(c4461f.k());
                                boolean z16 = z11 & true;
                                z11 = z11;
                                if (!z16) {
                                    z11 = z11;
                                    if (c4461f.b() > 0) {
                                        this.f30778r0 = new ArrayList();
                                        z11 |= true;
                                    }
                                }
                                while (c4461f.b() > 0) {
                                    this.f30778r0.add(Integer.valueOf(c4461f.k()));
                                }
                                c4461f.c(d10);
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 242:
                                if ((this.f30768h0 & 128) == 128) {
                                    X x10 = this.f30781u0;
                                    x10.getClass();
                                    c3038f = X.g(x10);
                                }
                                X x11 = (X) c4461f.g(X.f30464m0, c4464i);
                                this.f30781u0 = x11;
                                if (c3038f != null) {
                                    c3038f.i(x11);
                                    this.f30781u0 = c3038f.f();
                                }
                                this.f30768h0 |= 128;
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 248:
                                boolean z17 = z11 & true;
                                z11 = z11;
                                if (!z17) {
                                    this.f30782v0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f30782v0.add(Integer.valueOf(c4461f.k()));
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 250:
                                int d11 = c4461f.d(c4461f.k());
                                boolean z18 = z11 & true;
                                z11 = z11;
                                if (!z18) {
                                    z11 = z11;
                                    if (c4461f.b() > 0) {
                                        this.f30782v0 = new ArrayList();
                                        z11 |= true;
                                    }
                                }
                                while (c4461f.b() > 0) {
                                    this.f30782v0.add(Integer.valueOf(c4461f.k()));
                                }
                                c4461f.c(d11);
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            case 258:
                                if ((this.f30768h0 & 256) == 256) {
                                    C3046n c3046n = this.f30783w0;
                                    c3046n.getClass();
                                    c3045m = new C3045m(i10);
                                    c3045m.h(c3046n);
                                }
                                C3046n c3046n2 = (C3046n) c4461f.g(C3046n.f30685k0, c4464i);
                                this.f30783w0 = c3046n2;
                                if (c3045m != null) {
                                    c3045m.h(c3046n2);
                                    this.f30783w0 = c3045m.d();
                                }
                                this.f30768h0 |= 256;
                                continue;
                                i10 = 0;
                                z10 = z10;
                                z11 = z11;
                            default:
                                r92 = m(c4461f, j6, c4464i, n10);
                                if (r92 != 0) {
                                    continue;
                                    i10 = 0;
                                    z10 = z10;
                                    z11 = z11;
                                }
                                break;
                        }
                        z10 = true;
                        i10 = 0;
                        z10 = z10;
                        z11 = z11;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f30774n0 = Collections.unmodifiableList(this.f30774n0);
                        }
                        if ((z11 & true) == r92) {
                            this.f30780t0 = Collections.unmodifiableList(this.f30780t0);
                        }
                        if (z11 & true) {
                            this.f30777q0 = Collections.unmodifiableList(this.f30777q0);
                        }
                        if (z11 & true) {
                            this.f30778r0 = Collections.unmodifiableList(this.f30778r0);
                        }
                        if (z11 & true) {
                            this.f30782v0 = Collections.unmodifiableList(this.f30782v0);
                        }
                        try {
                            j6.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f30767Z = c4459d.i();
                            throw th3;
                        }
                        this.f30767Z = c4459d.i();
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
            } else {
                boolean z19 = z11 ? 1 : 0;
                boolean z20 = z11 ? 1 : 0;
                boolean z21 = z11 ? 1 : 0;
                boolean z22 = z11 ? 1 : 0;
                boolean z23 = z11 ? 1 : 0;
                boolean z24 = z11 ? 1 : 0;
                boolean z25 = z11 ? 1 : 0;
                boolean z26 = z11 ? 1 : 0;
                boolean z27 = z11 ? 1 : 0;
                boolean z28 = z11 ? 1 : 0;
                boolean z29 = z11 ? 1 : 0;
                boolean z30 = z11 ? 1 : 0;
                boolean z31 = z11 ? 1 : 0;
                boolean z32 = z11 ? 1 : 0;
                boolean z33 = z11 ? 1 : 0;
                boolean z34 = z11 ? 1 : 0;
                boolean z35 = z11 ? 1 : 0;
                if (z19 & true) {
                    this.f30774n0 = Collections.unmodifiableList(this.f30774n0);
                }
                if (z11 & true) {
                    this.f30780t0 = Collections.unmodifiableList(this.f30780t0);
                }
                if (z11 & true) {
                    this.f30777q0 = Collections.unmodifiableList(this.f30777q0);
                }
                if (z11 & true) {
                    this.f30778r0 = Collections.unmodifiableList(this.f30778r0);
                }
                if (z11 & true) {
                    this.f30782v0 = Collections.unmodifiableList(this.f30782v0);
                }
                try {
                    j6.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f30767Z = c4459d.i();
                    throw th4;
                }
                this.f30767Z = c4459d.i();
                k();
                return;
            }
        }
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30785y0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30768h0 & 2) == 2) {
            i10 = C4462g.b(1, this.f30770j0);
        } else {
            i10 = 0;
        }
        if ((this.f30768h0 & 4) == 4) {
            i10 += C4462g.b(2, this.f30771k0);
        }
        if ((this.f30768h0 & 8) == 8) {
            i10 += C4462g.d(3, this.f30772l0);
        }
        for (int i12 = 0; i12 < this.f30774n0.size(); i12++) {
            i10 += C4462g.d(4, (AbstractC4456a) this.f30774n0.get(i12));
        }
        if ((this.f30768h0 & 32) == 32) {
            i10 += C4462g.d(5, this.f30775o0);
        }
        for (int i13 = 0; i13 < this.f30780t0.size(); i13++) {
            i10 += C4462g.d(6, (AbstractC4456a) this.f30780t0.get(i13));
        }
        if ((this.f30768h0 & 16) == 16) {
            i10 += C4462g.b(7, this.f30773m0);
        }
        if ((this.f30768h0 & 64) == 64) {
            i10 += C4462g.b(8, this.f30776p0);
        }
        if ((this.f30768h0 & 1) == 1) {
            i10 += C4462g.b(9, this.f30769i0);
        }
        for (int i14 = 0; i14 < this.f30777q0.size(); i14++) {
            i10 += C4462g.d(10, (AbstractC4456a) this.f30777q0.get(i14));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f30778r0.size(); i16++) {
            i15 += C4462g.c(((Integer) this.f30778r0.get(i16)).intValue());
        }
        int i17 = i10 + i15;
        if (!this.f30778r0.isEmpty()) {
            i17 = i17 + 1 + C4462g.c(i15);
        }
        this.f30779s0 = i15;
        if ((this.f30768h0 & 128) == 128) {
            i17 += C4462g.d(30, this.f30781u0);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f30782v0.size(); i19++) {
            i18 += C4462g.c(((Integer) this.f30782v0.get(i19)).intValue());
        }
        int size = (this.f30782v0.size() * 2) + i17 + i18;
        if ((this.f30768h0 & 256) == 256) {
            size += C4462g.d(32, this.f30783w0);
        }
        int size2 = this.f30767Z.size() + h() + size;
        this.f30785y0 = size2;
        return size2;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return C3055x.f();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3055x f6 = C3055x.f();
        f6.g(this);
        return f6;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        B2.E l10 = l();
        if ((this.f30768h0 & 2) == 2) {
            c4462g.m(1, this.f30770j0);
        }
        if ((this.f30768h0 & 4) == 4) {
            c4462g.m(2, this.f30771k0);
        }
        if ((this.f30768h0 & 8) == 8) {
            c4462g.o(3, this.f30772l0);
        }
        for (int i10 = 0; i10 < this.f30774n0.size(); i10++) {
            c4462g.o(4, (AbstractC4456a) this.f30774n0.get(i10));
        }
        if ((this.f30768h0 & 32) == 32) {
            c4462g.o(5, this.f30775o0);
        }
        for (int i11 = 0; i11 < this.f30780t0.size(); i11++) {
            c4462g.o(6, (AbstractC4456a) this.f30780t0.get(i11));
        }
        if ((this.f30768h0 & 16) == 16) {
            c4462g.m(7, this.f30773m0);
        }
        if ((this.f30768h0 & 64) == 64) {
            c4462g.m(8, this.f30776p0);
        }
        if ((this.f30768h0 & 1) == 1) {
            c4462g.m(9, this.f30769i0);
        }
        for (int i12 = 0; i12 < this.f30777q0.size(); i12++) {
            c4462g.o(10, (AbstractC4456a) this.f30777q0.get(i12));
        }
        if (this.f30778r0.size() > 0) {
            c4462g.v(90);
            c4462g.v(this.f30779s0);
        }
        for (int i13 = 0; i13 < this.f30778r0.size(); i13++) {
            c4462g.n(((Integer) this.f30778r0.get(i13)).intValue());
        }
        if ((this.f30768h0 & 128) == 128) {
            c4462g.o(30, this.f30781u0);
        }
        for (int i14 = 0; i14 < this.f30782v0.size(); i14++) {
            c4462g.m(31, ((Integer) this.f30782v0.get(i14)).intValue());
        }
        if ((this.f30768h0 & 256) == 256) {
            c4462g.o(32, this.f30783w0);
        }
        l10.h(19000, c4462g);
        c4462g.r(this.f30767Z);
    }

    @Override // lg.x
    public final AbstractC4456a getDefaultInstanceForType() {
        return f30766z0;
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30784x0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f30768h0;
        if ((i10 & 4) == 4) {
            if ((i10 & 8) == 8 && !this.f30772l0.isInitialized()) {
                this.f30784x0 = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < this.f30774n0.size(); i11++) {
                if (!((W) this.f30774n0.get(i11)).isInitialized()) {
                    this.f30784x0 = (byte) 0;
                    return false;
                }
            }
            if (o() && !this.f30775o0.isInitialized()) {
                this.f30784x0 = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < this.f30777q0.size(); i12++) {
                if (!((Q) this.f30777q0.get(i12)).isInitialized()) {
                    this.f30784x0 = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < this.f30780t0.size(); i13++) {
                if (!((Z) this.f30780t0.get(i13)).isInitialized()) {
                    this.f30784x0 = (byte) 0;
                    return false;
                }
            }
            if ((this.f30768h0 & 128) == 128 && !this.f30781u0.isInitialized()) {
                this.f30784x0 = (byte) 0;
                return false;
            } else if ((this.f30768h0 & 256) == 256 && !this.f30783w0.isInitialized()) {
                this.f30784x0 = (byte) 0;
                return false;
            } else if (!g()) {
                this.f30784x0 = (byte) 0;
                return false;
            } else {
                this.f30784x0 = (byte) 1;
                return true;
            }
        }
        this.f30784x0 = (byte) 0;
        return false;
    }

    public final boolean o() {
        if ((this.f30768h0 & 32) == 32) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.f30769i0 = 6;
        this.f30770j0 = 6;
        this.f30771k0 = 0;
        Q q10 = Q.f30393y0;
        this.f30772l0 = q10;
        this.f30773m0 = 0;
        this.f30774n0 = Collections.emptyList();
        this.f30775o0 = q10;
        this.f30776p0 = 0;
        this.f30777q0 = Collections.emptyList();
        this.f30778r0 = Collections.emptyList();
        this.f30780t0 = Collections.emptyList();
        this.f30781u0 = X.f30463l0;
        this.f30782v0 = Collections.emptyList();
        this.f30783w0 = C3046n.f30684j0;
    }

    public C3056y(AbstractC4467l abstractC4467l) {
        super(abstractC4467l);
        this.f30779s0 = -1;
        this.f30784x0 = (byte) -1;
        this.f30785y0 = -1;
        this.f30767Z = abstractC4467l.f38400Y;
    }

    public C3056y() {
        this.f30779s0 = -1;
        this.f30784x0 = (byte) -1;
        this.f30785y0 = -1;
        this.f30767Z = AbstractC4460e.f38378Y;
    }
}
