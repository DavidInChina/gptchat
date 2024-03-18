package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
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

/* loaded from: classes.dex */
public final class T extends AbstractC4468m {

    /* renamed from: t0  reason: collision with root package name */
    public static final T f30423t0;

    /* renamed from: u0  reason: collision with root package name */
    public static final C3033a f30424u0 = new C3033a(18);

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4460e f30425Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30426h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30427i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30428j0;

    /* renamed from: k0  reason: collision with root package name */
    public List f30429k0;

    /* renamed from: l0  reason: collision with root package name */
    public Q f30430l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f30431m0;

    /* renamed from: n0  reason: collision with root package name */
    public Q f30432n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f30433o0;

    /* renamed from: p0  reason: collision with root package name */
    public List f30434p0;

    /* renamed from: q0  reason: collision with root package name */
    public List f30435q0;

    /* renamed from: r0  reason: collision with root package name */
    public byte f30436r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f30437s0;

    static {
        T t10 = new T();
        f30423t0 = t10;
        t10.o();
    }

    public T(AbstractC4467l abstractC4467l) {
        super(abstractC4467l);
        this.f30436r0 = (byte) -1;
        this.f30437s0 = -1;
        this.f30425Z = abstractC4467l.f38400Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30437s0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30426h0 & 1) == 1) {
            i10 = C4462g.b(1, this.f30427i0);
        } else {
            i10 = 0;
        }
        if ((this.f30426h0 & 2) == 2) {
            i10 += C4462g.b(2, this.f30428j0);
        }
        for (int i12 = 0; i12 < this.f30429k0.size(); i12++) {
            i10 += C4462g.d(3, (AbstractC4456a) this.f30429k0.get(i12));
        }
        if ((this.f30426h0 & 4) == 4) {
            i10 += C4462g.d(4, this.f30430l0);
        }
        if ((this.f30426h0 & 8) == 8) {
            i10 += C4462g.b(5, this.f30431m0);
        }
        if ((this.f30426h0 & 16) == 16) {
            i10 += C4462g.d(6, this.f30432n0);
        }
        if ((this.f30426h0 & 32) == 32) {
            i10 += C4462g.b(7, this.f30433o0);
        }
        for (int i13 = 0; i13 < this.f30434p0.size(); i13++) {
            i10 += C4462g.d(8, (AbstractC4456a) this.f30434p0.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f30435q0.size(); i15++) {
            i14 += C4462g.c(((Integer) this.f30435q0.get(i15)).intValue());
        }
        int size = this.f30425Z.size() + h() + (this.f30435q0.size() * 2) + i10 + i14;
        this.f30437s0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return S.f();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        S f6 = S.f();
        f6.g(this);
        return f6;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        B2.E l10 = l();
        if ((this.f30426h0 & 1) == 1) {
            c4462g.m(1, this.f30427i0);
        }
        if ((this.f30426h0 & 2) == 2) {
            c4462g.m(2, this.f30428j0);
        }
        for (int i10 = 0; i10 < this.f30429k0.size(); i10++) {
            c4462g.o(3, (AbstractC4456a) this.f30429k0.get(i10));
        }
        if ((this.f30426h0 & 4) == 4) {
            c4462g.o(4, this.f30430l0);
        }
        if ((this.f30426h0 & 8) == 8) {
            c4462g.m(5, this.f30431m0);
        }
        if ((this.f30426h0 & 16) == 16) {
            c4462g.o(6, this.f30432n0);
        }
        if ((this.f30426h0 & 32) == 32) {
            c4462g.m(7, this.f30433o0);
        }
        for (int i11 = 0; i11 < this.f30434p0.size(); i11++) {
            c4462g.o(8, (AbstractC4456a) this.f30434p0.get(i11));
        }
        for (int i12 = 0; i12 < this.f30435q0.size(); i12++) {
            c4462g.m(31, ((Integer) this.f30435q0.get(i12)).intValue());
        }
        l10.h(RCHTTPStatusCodes.SUCCESS, c4462g);
        c4462g.r(this.f30425Z);
    }

    @Override // lg.x
    public final AbstractC4456a getDefaultInstanceForType() {
        return f30423t0;
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30436r0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f30426h0 & 2) == 2) {
            for (int i10 = 0; i10 < this.f30429k0.size(); i10++) {
                if (!((W) this.f30429k0.get(i10)).isInitialized()) {
                    this.f30436r0 = (byte) 0;
                    return false;
                }
            }
            if ((this.f30426h0 & 4) == 4 && !this.f30430l0.isInitialized()) {
                this.f30436r0 = (byte) 0;
                return false;
            } else if ((this.f30426h0 & 16) == 16 && !this.f30432n0.isInitialized()) {
                this.f30436r0 = (byte) 0;
                return false;
            } else {
                for (int i11 = 0; i11 < this.f30434p0.size(); i11++) {
                    if (!((C3039g) this.f30434p0.get(i11)).isInitialized()) {
                        this.f30436r0 = (byte) 0;
                        return false;
                    }
                }
                if (!g()) {
                    this.f30436r0 = (byte) 0;
                    return false;
                }
                this.f30436r0 = (byte) 1;
                return true;
            }
        }
        this.f30436r0 = (byte) 0;
        return false;
    }

    public final void o() {
        this.f30427i0 = 6;
        this.f30428j0 = 0;
        this.f30429k0 = Collections.emptyList();
        Q q10 = Q.f30393y0;
        this.f30430l0 = q10;
        this.f30431m0 = 0;
        this.f30432n0 = q10;
        this.f30433o0 = 0;
        this.f30434p0 = Collections.emptyList();
        this.f30435q0 = Collections.emptyList();
    }

    public T() {
        this.f30436r0 = (byte) -1;
        this.f30437s0 = -1;
        this.f30425Z = AbstractC4460e.f38378Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public T(C4461f c4461f, C4464i c4464i) {
        this.f30436r0 = (byte) -1;
        this.f30437s0 = -1;
        o();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r52 = 128;
            if (!z10) {
                try {
                    try {
                        int n10 = c4461f.n();
                        P p10 = null;
                        switch (n10) {
                            case 0:
                                break;
                            case 8:
                                this.f30426h0 |= 1;
                                this.f30427i0 = c4461f.k();
                                continue;
                            case 16:
                                this.f30426h0 |= 2;
                                this.f30428j0 = c4461f.k();
                                continue;
                            case 26:
                                if (!(z11 & true)) {
                                    this.f30429k0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f30429k0.add(c4461f.g(W.f30451s0, c4464i));
                                continue;
                            case 34:
                                if ((this.f30426h0 & 4) == 4) {
                                    Q q10 = this.f30430l0;
                                    q10.getClass();
                                    p10 = Q.q(q10);
                                }
                                Q q11 = (Q) c4461f.g(Q.f30394z0, c4464i);
                                this.f30430l0 = q11;
                                if (p10 != null) {
                                    p10.g(q11);
                                    this.f30430l0 = p10.e();
                                }
                                this.f30426h0 |= 4;
                                continue;
                            case 40:
                                this.f30426h0 |= 8;
                                this.f30431m0 = c4461f.k();
                                continue;
                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                if ((this.f30426h0 & 16) == 16) {
                                    Q q12 = this.f30432n0;
                                    q12.getClass();
                                    p10 = Q.q(q12);
                                }
                                Q q13 = (Q) c4461f.g(Q.f30394z0, c4464i);
                                this.f30432n0 = q13;
                                if (p10 != null) {
                                    p10.g(q13);
                                    this.f30432n0 = p10.e();
                                }
                                this.f30426h0 |= 16;
                                continue;
                            case 56:
                                this.f30426h0 |= 32;
                                this.f30433o0 = c4461f.k();
                                continue;
                            case 66:
                                if (!(z11 & true)) {
                                    this.f30434p0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f30434p0.add(c4461f.g(C3039g.f30591m0, c4464i));
                                continue;
                            case 248:
                                if (!(z11 & true)) {
                                    this.f30435q0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f30435q0.add(Integer.valueOf(c4461f.k()));
                                continue;
                            case 250:
                                int d10 = c4461f.d(c4461f.k());
                                if (!(z11 & true) && c4461f.b() > 0) {
                                    this.f30435q0 = new ArrayList();
                                    z11 |= true;
                                }
                                while (c4461f.b() > 0) {
                                    this.f30435q0.add(Integer.valueOf(c4461f.k()));
                                }
                                c4461f.c(d10);
                                continue;
                                break;
                            default:
                                r52 = m(c4461f, j6, c4464i, n10);
                                if (r52 == 0) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f30429k0 = Collections.unmodifiableList(this.f30429k0);
                        }
                        if ((z11 & true) == r52) {
                            this.f30434p0 = Collections.unmodifiableList(this.f30434p0);
                        }
                        if (z11 & true) {
                            this.f30435q0 = Collections.unmodifiableList(this.f30435q0);
                        }
                        try {
                            j6.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f30425Z = c4459d.i();
                            throw th3;
                        }
                        this.f30425Z = c4459d.i();
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
                if (z11 & true) {
                    this.f30429k0 = Collections.unmodifiableList(this.f30429k0);
                }
                if (z11 & true) {
                    this.f30434p0 = Collections.unmodifiableList(this.f30434p0);
                }
                if (z11 & true) {
                    this.f30435q0 = Collections.unmodifiableList(this.f30435q0);
                }
                try {
                    j6.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f30425Z = c4459d.i();
                    throw th4;
                }
                this.f30425Z = c4459d.i();
                k();
                return;
            }
        }
    }
}
