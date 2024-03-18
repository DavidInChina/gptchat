package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.AbstractC4456a;
import lg.AbstractC4460e;
import lg.AbstractC4466k;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;
import lg.C4464i;

/* renamed from: fg.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3036d extends lg.p {

    /* renamed from: u0  reason: collision with root package name */
    public static final C3036d f30535u0;

    /* renamed from: v0  reason: collision with root package name */
    public static final C3033a f30536v0 = new C3033a(2);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30537Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f30538Z;

    /* renamed from: h0  reason: collision with root package name */
    public EnumC3035c f30539h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f30540i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f30541j0;

    /* renamed from: k0  reason: collision with root package name */
    public double f30542k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30543l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f30544m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f30545n0;

    /* renamed from: o0  reason: collision with root package name */
    public C3039g f30546o0;

    /* renamed from: p0  reason: collision with root package name */
    public List f30547p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f30548q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f30549r0;

    /* renamed from: s0  reason: collision with root package name */
    public byte f30550s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f30551t0;

    static {
        C3036d c3036d = new C3036d();
        f30535u0 = c3036d;
        c3036d.g();
    }

    public C3036d() {
        this.f30550s0 = (byte) -1;
        this.f30551t0 = -1;
        this.f30537Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30551t0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30538Z & 1) == 1) {
            i10 = C4462g.a(1, this.f30539h0.f30529Y);
        } else {
            i10 = 0;
        }
        if ((this.f30538Z & 2) == 2) {
            long j6 = this.f30540i0;
            i10 += C4462g.g((j6 >> 63) ^ (j6 << 1)) + C4462g.h(2);
        }
        if ((this.f30538Z & 4) == 4) {
            i10 += C4462g.h(3) + 4;
        }
        if ((this.f30538Z & 8) == 8) {
            i10 += C4462g.h(4) + 8;
        }
        if ((this.f30538Z & 16) == 16) {
            i10 += C4462g.b(5, this.f30543l0);
        }
        if ((this.f30538Z & 32) == 32) {
            i10 += C4462g.b(6, this.f30544m0);
        }
        if ((this.f30538Z & 64) == 64) {
            i10 += C4462g.b(7, this.f30545n0);
        }
        if ((this.f30538Z & 128) == 128) {
            i10 += C4462g.d(8, this.f30546o0);
        }
        for (int i12 = 0; i12 < this.f30547p0.size(); i12++) {
            i10 += C4462g.d(9, (AbstractC4456a) this.f30547p0.get(i12));
        }
        if ((this.f30538Z & 512) == 512) {
            i10 += C4462g.b(10, this.f30549r0);
        }
        if ((this.f30538Z & 256) == 256) {
            i10 += C4462g.b(11, this.f30548q0);
        }
        int size = this.f30537Y.size() + i10;
        this.f30551t0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return C3034b.e();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3034b e10 = C3034b.e();
        e10.f(this);
        return e10;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        if ((this.f30538Z & 1) == 1) {
            c4462g.l(1, this.f30539h0.f30529Y);
        }
        if ((this.f30538Z & 2) == 2) {
            long j6 = this.f30540i0;
            c4462g.x(2, 0);
            c4462g.w((j6 >> 63) ^ (j6 << 1));
        }
        if ((this.f30538Z & 4) == 4) {
            float f6 = this.f30541j0;
            c4462g.x(3, 5);
            c4462g.t(Float.floatToRawIntBits(f6));
        }
        if ((this.f30538Z & 8) == 8) {
            double d10 = this.f30542k0;
            c4462g.x(4, 1);
            c4462g.u(Double.doubleToRawLongBits(d10));
        }
        if ((this.f30538Z & 16) == 16) {
            c4462g.m(5, this.f30543l0);
        }
        if ((this.f30538Z & 32) == 32) {
            c4462g.m(6, this.f30544m0);
        }
        if ((this.f30538Z & 64) == 64) {
            c4462g.m(7, this.f30545n0);
        }
        if ((this.f30538Z & 128) == 128) {
            c4462g.o(8, this.f30546o0);
        }
        for (int i10 = 0; i10 < this.f30547p0.size(); i10++) {
            c4462g.o(9, (AbstractC4456a) this.f30547p0.get(i10));
        }
        if ((this.f30538Z & 512) == 512) {
            c4462g.m(10, this.f30549r0);
        }
        if ((this.f30538Z & 256) == 256) {
            c4462g.m(11, this.f30548q0);
        }
        c4462g.r(this.f30537Y);
    }

    public final void g() {
        this.f30539h0 = EnumC3035c.BYTE;
        this.f30540i0 = 0L;
        this.f30541j0 = 0.0f;
        this.f30542k0 = 0.0d;
        this.f30543l0 = 0;
        this.f30544m0 = 0;
        this.f30545n0 = 0;
        this.f30546o0 = C3039g.f30590l0;
        this.f30547p0 = Collections.emptyList();
        this.f30548q0 = 0;
        this.f30549r0 = 0;
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30550s0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f30538Z & 128) == 128 && !this.f30546o0.isInitialized()) {
            this.f30550s0 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f30547p0.size(); i10++) {
            if (!((C3036d) this.f30547p0.get(i10)).isInitialized()) {
                this.f30550s0 = (byte) 0;
                return false;
            }
        }
        this.f30550s0 = (byte) 1;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    public C3036d(C4461f c4461f, C4464i c4464i) {
        C3038f c3038f;
        this.f30550s0 = (byte) -1;
        this.f30551t0 = -1;
        g();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r62 = 256;
            if (!z10) {
                try {
                    try {
                        int n10 = c4461f.n();
                        switch (n10) {
                            case 0:
                                break;
                            case 8:
                                int k10 = c4461f.k();
                                EnumC3035c b10 = EnumC3035c.b(k10);
                                if (b10 == null) {
                                    j6.v(n10);
                                    j6.v(k10);
                                    continue;
                                } else {
                                    this.f30538Z |= 1;
                                    this.f30539h0 = b10;
                                }
                            case 16:
                                this.f30538Z |= 2;
                                long l10 = c4461f.l();
                                this.f30540i0 = (-(l10 & 1)) ^ (l10 >>> 1);
                                continue;
                            case 29:
                                this.f30538Z |= 4;
                                this.f30541j0 = Float.intBitsToFloat(c4461f.i());
                                continue;
                            case 33:
                                this.f30538Z |= 8;
                                this.f30542k0 = Double.longBitsToDouble(c4461f.j());
                                continue;
                            case 40:
                                this.f30538Z |= 16;
                                this.f30543l0 = c4461f.k();
                                continue;
                            case r9.y.f44626f /* 48 */:
                                this.f30538Z |= 32;
                                this.f30544m0 = c4461f.k();
                                continue;
                            case 56:
                                this.f30538Z |= 64;
                                this.f30545n0 = c4461f.k();
                                continue;
                            case 66:
                                if ((this.f30538Z & 128) == 128) {
                                    C3039g c3039g = this.f30546o0;
                                    c3039g.getClass();
                                    c3038f = new C3038f(0);
                                    c3038f.h(c3039g);
                                } else {
                                    c3038f = null;
                                }
                                C3039g c3039g2 = (C3039g) c4461f.g(C3039g.f30591m0, c4464i);
                                this.f30546o0 = c3039g2;
                                if (c3038f != null) {
                                    c3038f.h(c3039g2);
                                    this.f30546o0 = c3038f.e();
                                }
                                this.f30538Z |= 128;
                                continue;
                            case 74:
                                if (!(z11 & true)) {
                                    this.f30547p0 = new ArrayList();
                                    z11 = true;
                                }
                                this.f30547p0.add(c4461f.g(f30536v0, c4464i));
                                continue;
                            case 80:
                                this.f30538Z |= 512;
                                this.f30549r0 = c4461f.k();
                                continue;
                            case 88:
                                this.f30538Z |= 256;
                                this.f30548q0 = c4461f.k();
                                continue;
                            default:
                                r62 = c4461f.q(n10, j6);
                                if (r62 == 0) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z10 = true;
                    } catch (lg.t e10) {
                        e10.f38415Y = this;
                        throw e10;
                    } catch (IOException e11) {
                        lg.t tVar = new lg.t(e11.getMessage());
                        tVar.f38415Y = this;
                        throw tVar;
                    }
                } catch (Throwable th2) {
                    if ((z11 & true) == r62) {
                        this.f30547p0 = Collections.unmodifiableList(this.f30547p0);
                    }
                    try {
                        j6.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f30537Y = c4459d.i();
                        throw th3;
                    }
                    this.f30537Y = c4459d.i();
                    throw th2;
                }
            } else {
                if (z11 & true) {
                    this.f30547p0 = Collections.unmodifiableList(this.f30547p0);
                }
                try {
                    j6.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f30537Y = c4459d.i();
                    throw th4;
                }
                this.f30537Y = c4459d.i();
                return;
            }
        }
    }

    public C3036d(AbstractC4466k abstractC4466k) {
        this.f30550s0 = (byte) -1;
        this.f30551t0 = -1;
        this.f30537Y = abstractC4466k.f38400Y;
    }
}
