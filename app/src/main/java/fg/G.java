package fg;

import android.gov.nist.javax.sip.parser.TokenTypes;
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

/* loaded from: classes.dex */
public final class G extends AbstractC4468m {

    /* renamed from: A0  reason: collision with root package name */
    public static final C3033a f30308A0 = new C3033a(12);

    /* renamed from: z0  reason: collision with root package name */
    public static final G f30309z0;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4460e f30310Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30311h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30312i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30313j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30314k0;

    /* renamed from: l0  reason: collision with root package name */
    public Q f30315l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f30316m0;

    /* renamed from: n0  reason: collision with root package name */
    public List f30317n0;

    /* renamed from: o0  reason: collision with root package name */
    public Q f30318o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f30319p0;

    /* renamed from: q0  reason: collision with root package name */
    public List f30320q0;

    /* renamed from: r0  reason: collision with root package name */
    public List f30321r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f30322s0;

    /* renamed from: t0  reason: collision with root package name */
    public Z f30323t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f30324u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f30325v0;

    /* renamed from: w0  reason: collision with root package name */
    public List f30326w0;

    /* renamed from: x0  reason: collision with root package name */
    public byte f30327x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f30328y0;

    static {
        G g10 = new G();
        f30309z0 = g10;
        g10.p();
    }

    public G(AbstractC4467l abstractC4467l) {
        super(abstractC4467l);
        this.f30322s0 = -1;
        this.f30327x0 = (byte) -1;
        this.f30328y0 = -1;
        this.f30310Z = abstractC4467l.f38400Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30328y0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30311h0 & 2) == 2) {
            i10 = C4462g.b(1, this.f30313j0);
        } else {
            i10 = 0;
        }
        if ((this.f30311h0 & 4) == 4) {
            i10 += C4462g.b(2, this.f30314k0);
        }
        if ((this.f30311h0 & 8) == 8) {
            i10 += C4462g.d(3, this.f30315l0);
        }
        for (int i12 = 0; i12 < this.f30317n0.size(); i12++) {
            i10 += C4462g.d(4, (AbstractC4456a) this.f30317n0.get(i12));
        }
        if ((this.f30311h0 & 32) == 32) {
            i10 += C4462g.d(5, this.f30318o0);
        }
        if ((this.f30311h0 & 128) == 128) {
            i10 += C4462g.d(6, this.f30323t0);
        }
        if ((this.f30311h0 & 256) == 256) {
            i10 += C4462g.b(7, this.f30324u0);
        }
        if ((this.f30311h0 & 512) == 512) {
            i10 += C4462g.b(8, this.f30325v0);
        }
        if ((this.f30311h0 & 16) == 16) {
            i10 += C4462g.b(9, this.f30316m0);
        }
        if ((this.f30311h0 & 64) == 64) {
            i10 += C4462g.b(10, this.f30319p0);
        }
        if ((this.f30311h0 & 1) == 1) {
            i10 += C4462g.b(11, this.f30312i0);
        }
        for (int i13 = 0; i13 < this.f30320q0.size(); i13++) {
            i10 += C4462g.d(12, (AbstractC4456a) this.f30320q0.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f30321r0.size(); i15++) {
            i14 += C4462g.c(((Integer) this.f30321r0.get(i15)).intValue());
        }
        int i16 = i10 + i14;
        if (!this.f30321r0.isEmpty()) {
            i16 = i16 + 1 + C4462g.c(i14);
        }
        this.f30322s0 = i14;
        int i17 = 0;
        for (int i18 = 0; i18 < this.f30326w0.size(); i18++) {
            i17 += C4462g.c(((Integer) this.f30326w0.get(i18)).intValue());
        }
        int size = this.f30310Z.size() + h() + (this.f30326w0.size() * 2) + i16 + i17;
        this.f30328y0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return F.f();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        F f6 = F.f();
        f6.g(this);
        return f6;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        B2.E l10 = l();
        if ((this.f30311h0 & 2) == 2) {
            c4462g.m(1, this.f30313j0);
        }
        if ((this.f30311h0 & 4) == 4) {
            c4462g.m(2, this.f30314k0);
        }
        if ((this.f30311h0 & 8) == 8) {
            c4462g.o(3, this.f30315l0);
        }
        for (int i10 = 0; i10 < this.f30317n0.size(); i10++) {
            c4462g.o(4, (AbstractC4456a) this.f30317n0.get(i10));
        }
        if ((this.f30311h0 & 32) == 32) {
            c4462g.o(5, this.f30318o0);
        }
        if ((this.f30311h0 & 128) == 128) {
            c4462g.o(6, this.f30323t0);
        }
        if ((this.f30311h0 & 256) == 256) {
            c4462g.m(7, this.f30324u0);
        }
        if ((this.f30311h0 & 512) == 512) {
            c4462g.m(8, this.f30325v0);
        }
        if ((this.f30311h0 & 16) == 16) {
            c4462g.m(9, this.f30316m0);
        }
        if ((this.f30311h0 & 64) == 64) {
            c4462g.m(10, this.f30319p0);
        }
        if ((this.f30311h0 & 1) == 1) {
            c4462g.m(11, this.f30312i0);
        }
        for (int i11 = 0; i11 < this.f30320q0.size(); i11++) {
            c4462g.o(12, (AbstractC4456a) this.f30320q0.get(i11));
        }
        if (this.f30321r0.size() > 0) {
            c4462g.v(106);
            c4462g.v(this.f30322s0);
        }
        for (int i12 = 0; i12 < this.f30321r0.size(); i12++) {
            c4462g.n(((Integer) this.f30321r0.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f30326w0.size(); i13++) {
            c4462g.m(31, ((Integer) this.f30326w0.get(i13)).intValue());
        }
        l10.h(19000, c4462g);
        c4462g.r(this.f30310Z);
    }

    @Override // lg.x
    public final AbstractC4456a getDefaultInstanceForType() {
        return f30309z0;
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30327x0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f30311h0;
        if ((i10 & 4) == 4) {
            if ((i10 & 8) == 8 && !this.f30315l0.isInitialized()) {
                this.f30327x0 = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < this.f30317n0.size(); i11++) {
                if (!((W) this.f30317n0.get(i11)).isInitialized()) {
                    this.f30327x0 = (byte) 0;
                    return false;
                }
            }
            if (o() && !this.f30318o0.isInitialized()) {
                this.f30327x0 = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < this.f30320q0.size(); i12++) {
                if (!((Q) this.f30320q0.get(i12)).isInitialized()) {
                    this.f30327x0 = (byte) 0;
                    return false;
                }
            }
            if ((this.f30311h0 & 128) == 128 && !this.f30323t0.isInitialized()) {
                this.f30327x0 = (byte) 0;
                return false;
            } else if (!g()) {
                this.f30327x0 = (byte) 0;
                return false;
            } else {
                this.f30327x0 = (byte) 1;
                return true;
            }
        }
        this.f30327x0 = (byte) 0;
        return false;
    }

    public final boolean o() {
        if ((this.f30311h0 & 32) == 32) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.f30312i0 = 518;
        this.f30313j0 = TokenTypes.ACK;
        this.f30314k0 = 0;
        Q q10 = Q.f30393y0;
        this.f30315l0 = q10;
        this.f30316m0 = 0;
        this.f30317n0 = Collections.emptyList();
        this.f30318o0 = q10;
        this.f30319p0 = 0;
        this.f30320q0 = Collections.emptyList();
        this.f30321r0 = Collections.emptyList();
        this.f30323t0 = Z.f30478q0;
        this.f30324u0 = 0;
        this.f30325v0 = 0;
        this.f30326w0 = Collections.emptyList();
    }

    public G() {
        this.f30322s0 = -1;
        this.f30327x0 = (byte) -1;
        this.f30328y0 = -1;
        this.f30310Z = AbstractC4460e.f38378Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [fg.Y, lg.l] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public G(C4461f c4461f, C4464i c4464i) {
        this.f30322s0 = -1;
        this.f30327x0 = (byte) -1;
        this.f30328y0 = -1;
        p();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r52 = 256;
            if (!z10) {
                try {
                    try {
                        try {
                            int n10 = c4461f.n();
                            P p10 = null;
                            Y y10 = null;
                            P p11 = null;
                            switch (n10) {
                                case 0:
                                    break;
                                case 8:
                                    this.f30311h0 |= 2;
                                    this.f30313j0 = c4461f.k();
                                    continue;
                                case 16:
                                    this.f30311h0 |= 4;
                                    this.f30314k0 = c4461f.k();
                                    continue;
                                case 26:
                                    if ((this.f30311h0 & 8) == 8) {
                                        Q q10 = this.f30315l0;
                                        q10.getClass();
                                        p10 = Q.q(q10);
                                    }
                                    Q q11 = (Q) c4461f.g(Q.f30394z0, c4464i);
                                    this.f30315l0 = q11;
                                    if (p10 != null) {
                                        p10.g(q11);
                                        this.f30315l0 = p10.e();
                                    }
                                    this.f30311h0 |= 8;
                                    continue;
                                case 34:
                                    boolean z12 = z11 & true;
                                    z11 = z11;
                                    if (!z12) {
                                        this.f30317n0 = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.f30317n0.add(c4461f.g(W.f30451s0, c4464i));
                                    continue;
                                case 42:
                                    if ((this.f30311h0 & 32) == 32) {
                                        Q q12 = this.f30318o0;
                                        q12.getClass();
                                        p11 = Q.q(q12);
                                    }
                                    Q q13 = (Q) c4461f.g(Q.f30394z0, c4464i);
                                    this.f30318o0 = q13;
                                    if (p11 != null) {
                                        p11.g(q13);
                                        this.f30318o0 = p11.e();
                                    }
                                    this.f30311h0 |= 32;
                                    continue;
                                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                    if ((this.f30311h0 & 128) == 128) {
                                        Z z13 = this.f30323t0;
                                        z13.getClass();
                                        ?? abstractC4467l = new AbstractC4467l();
                                        Q q14 = Q.f30393y0;
                                        abstractC4467l.f30474l0 = q14;
                                        abstractC4467l.f30476n0 = q14;
                                        abstractC4467l.f(z13);
                                        y10 = abstractC4467l;
                                    }
                                    Z z14 = (Z) c4461f.g(Z.f30479r0, c4464i);
                                    this.f30323t0 = z14;
                                    if (y10 != null) {
                                        y10.f(z14);
                                        this.f30323t0 = y10.e();
                                    }
                                    this.f30311h0 |= 128;
                                    continue;
                                case 56:
                                    this.f30311h0 |= 256;
                                    this.f30324u0 = c4461f.k();
                                    continue;
                                case 64:
                                    this.f30311h0 |= 512;
                                    this.f30325v0 = c4461f.k();
                                    continue;
                                case 72:
                                    this.f30311h0 |= 16;
                                    this.f30316m0 = c4461f.k();
                                    continue;
                                case 80:
                                    this.f30311h0 |= 64;
                                    this.f30319p0 = c4461f.k();
                                    continue;
                                case 88:
                                    this.f30311h0 |= 1;
                                    this.f30312i0 = c4461f.k();
                                    continue;
                                case 98:
                                    boolean z15 = z11 & true;
                                    z11 = z11;
                                    if (!z15) {
                                        this.f30320q0 = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.f30320q0.add(c4461f.g(Q.f30394z0, c4464i));
                                    continue;
                                case 104:
                                    boolean z16 = z11 & true;
                                    z11 = z11;
                                    if (!z16) {
                                        this.f30321r0 = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.f30321r0.add(Integer.valueOf(c4461f.k()));
                                    continue;
                                case 106:
                                    int d10 = c4461f.d(c4461f.k());
                                    boolean z17 = z11 & true;
                                    z11 = z11;
                                    if (!z17) {
                                        z11 = z11;
                                        if (c4461f.b() > 0) {
                                            this.f30321r0 = new ArrayList();
                                            z11 |= true;
                                        }
                                    }
                                    while (c4461f.b() > 0) {
                                        this.f30321r0.add(Integer.valueOf(c4461f.k()));
                                    }
                                    c4461f.c(d10);
                                    continue;
                                case 248:
                                    boolean z18 = z11 & true;
                                    z11 = z11;
                                    if (!z18) {
                                        this.f30326w0 = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.f30326w0.add(Integer.valueOf(c4461f.k()));
                                    continue;
                                case 250:
                                    int d11 = c4461f.d(c4461f.k());
                                    boolean z19 = z11 & true;
                                    z11 = z11;
                                    if (!z19) {
                                        z11 = z11;
                                        if (c4461f.b() > 0) {
                                            this.f30326w0 = new ArrayList();
                                            z11 |= true;
                                        }
                                    }
                                    while (c4461f.b() > 0) {
                                        this.f30326w0.add(Integer.valueOf(c4461f.k()));
                                    }
                                    c4461f.c(d11);
                                    continue;
                                default:
                                    r52 = m(c4461f, j6, c4464i, n10);
                                    if (r52 == 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            lg.t tVar = new lg.t(e10.getMessage());
                            tVar.f38415Y = this;
                            throw tVar;
                        }
                    } catch (lg.t e11) {
                        e11.f38415Y = this;
                        throw e11;
                    }
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f30317n0 = Collections.unmodifiableList(this.f30317n0);
                    }
                    if ((z11 & true) == r52) {
                        this.f30320q0 = Collections.unmodifiableList(this.f30320q0);
                    }
                    if (z11 & true) {
                        this.f30321r0 = Collections.unmodifiableList(this.f30321r0);
                    }
                    if (z11 & true) {
                        this.f30326w0 = Collections.unmodifiableList(this.f30326w0);
                    }
                    try {
                        j6.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f30310Z = c4459d.i();
                        throw th3;
                    }
                    this.f30310Z = c4459d.i();
                    k();
                    throw th2;
                }
            } else {
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
                if (z20 & true) {
                    this.f30317n0 = Collections.unmodifiableList(this.f30317n0);
                }
                if (z11 & true) {
                    this.f30320q0 = Collections.unmodifiableList(this.f30320q0);
                }
                if (z11 & true) {
                    this.f30321r0 = Collections.unmodifiableList(this.f30321r0);
                }
                if (z11 & true) {
                    this.f30326w0 = Collections.unmodifiableList(this.f30326w0);
                }
                try {
                    j6.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f30310Z = c4459d.i();
                    throw th4;
                }
                this.f30310Z = c4459d.i();
                k();
                return;
            }
        }
    }
}
