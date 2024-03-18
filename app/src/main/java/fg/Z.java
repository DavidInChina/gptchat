package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import lg.AbstractC4456a;
import lg.AbstractC4460e;
import lg.AbstractC4467l;
import lg.AbstractC4468m;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;
import lg.C4464i;

/* loaded from: classes.dex */
public final class Z extends AbstractC4468m {

    /* renamed from: q0  reason: collision with root package name */
    public static final Z f30478q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final C3033a f30479r0 = new C3033a(21);

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4460e f30480Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30481h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30482i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30483j0;

    /* renamed from: k0  reason: collision with root package name */
    public Q f30484k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30485l0;

    /* renamed from: m0  reason: collision with root package name */
    public Q f30486m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f30487n0;

    /* renamed from: o0  reason: collision with root package name */
    public byte f30488o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f30489p0;

    static {
        Z z10 = new Z();
        f30478q0 = z10;
        z10.f30482i0 = 0;
        z10.f30483j0 = 0;
        Q q10 = Q.f30393y0;
        z10.f30484k0 = q10;
        z10.f30485l0 = 0;
        z10.f30486m0 = q10;
        z10.f30487n0 = 0;
    }

    public Z(AbstractC4467l abstractC4467l) {
        super(abstractC4467l);
        this.f30488o0 = (byte) -1;
        this.f30489p0 = -1;
        this.f30480Z = abstractC4467l.f38400Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30489p0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30481h0 & 1) == 1) {
            i10 = C4462g.b(1, this.f30482i0);
        } else {
            i10 = 0;
        }
        if ((this.f30481h0 & 2) == 2) {
            i10 += C4462g.b(2, this.f30483j0);
        }
        if ((this.f30481h0 & 4) == 4) {
            i10 += C4462g.d(3, this.f30484k0);
        }
        if ((this.f30481h0 & 16) == 16) {
            i10 += C4462g.d(4, this.f30486m0);
        }
        if ((this.f30481h0 & 8) == 8) {
            i10 += C4462g.b(5, this.f30485l0);
        }
        if ((this.f30481h0 & 32) == 32) {
            i10 += C4462g.b(6, this.f30487n0);
        }
        int size = this.f30480Z.size() + h() + i10;
        this.f30489p0 = size;
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.Y, androidx.glance.appwidget.protobuf.a, lg.l] */
    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        ?? abstractC4467l = new AbstractC4467l();
        Q q10 = Q.f30393y0;
        abstractC4467l.f30474l0 = q10;
        abstractC4467l.f30476n0 = q10;
        return abstractC4467l;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.Y, androidx.glance.appwidget.protobuf.a, lg.l] */
    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        ?? abstractC4467l = new AbstractC4467l();
        Q q10 = Q.f30393y0;
        abstractC4467l.f30474l0 = q10;
        abstractC4467l.f30476n0 = q10;
        abstractC4467l.f(this);
        return abstractC4467l;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        B2.E l10 = l();
        if ((this.f30481h0 & 1) == 1) {
            c4462g.m(1, this.f30482i0);
        }
        if ((this.f30481h0 & 2) == 2) {
            c4462g.m(2, this.f30483j0);
        }
        if ((this.f30481h0 & 4) == 4) {
            c4462g.o(3, this.f30484k0);
        }
        if ((this.f30481h0 & 16) == 16) {
            c4462g.o(4, this.f30486m0);
        }
        if ((this.f30481h0 & 8) == 8) {
            c4462g.m(5, this.f30485l0);
        }
        if ((this.f30481h0 & 32) == 32) {
            c4462g.m(6, this.f30487n0);
        }
        l10.h(RCHTTPStatusCodes.SUCCESS, c4462g);
        c4462g.r(this.f30480Z);
    }

    @Override // lg.x
    public final AbstractC4456a getDefaultInstanceForType() {
        return f30478q0;
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30488o0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f30481h0;
        if ((i10 & 2) == 2) {
            if ((i10 & 4) == 4 && !this.f30484k0.isInitialized()) {
                this.f30488o0 = (byte) 0;
                return false;
            } else if ((this.f30481h0 & 16) == 16 && !this.f30486m0.isInitialized()) {
                this.f30488o0 = (byte) 0;
                return false;
            } else if (!g()) {
                this.f30488o0 = (byte) 0;
                return false;
            } else {
                this.f30488o0 = (byte) 1;
                return true;
            }
        }
        this.f30488o0 = (byte) 0;
        return false;
    }

    public Z() {
        this.f30488o0 = (byte) -1;
        this.f30489p0 = -1;
        this.f30480Z = AbstractC4460e.f38378Y;
    }

    public Z(C4461f c4461f, C4464i c4464i) {
        this.f30488o0 = (byte) -1;
        this.f30489p0 = -1;
        boolean z10 = false;
        this.f30482i0 = 0;
        this.f30483j0 = 0;
        Q q10 = Q.f30393y0;
        this.f30484k0 = q10;
        this.f30485l0 = 0;
        this.f30486m0 = q10;
        this.f30487n0 = 0;
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        while (!z10) {
            try {
                try {
                    int n10 = c4461f.n();
                    if (n10 != 0) {
                        if (n10 == 8) {
                            this.f30481h0 |= 1;
                            this.f30482i0 = c4461f.k();
                        } else if (n10 != 16) {
                            P p10 = null;
                            if (n10 == 26) {
                                if ((this.f30481h0 & 4) == 4) {
                                    Q q11 = this.f30484k0;
                                    q11.getClass();
                                    p10 = Q.q(q11);
                                }
                                Q q12 = (Q) c4461f.g(Q.f30394z0, c4464i);
                                this.f30484k0 = q12;
                                if (p10 != null) {
                                    p10.g(q12);
                                    this.f30484k0 = p10.e();
                                }
                                this.f30481h0 |= 4;
                            } else if (n10 == 34) {
                                if ((this.f30481h0 & 16) == 16) {
                                    Q q13 = this.f30486m0;
                                    q13.getClass();
                                    p10 = Q.q(q13);
                                }
                                Q q14 = (Q) c4461f.g(Q.f30394z0, c4464i);
                                this.f30486m0 = q14;
                                if (p10 != null) {
                                    p10.g(q14);
                                    this.f30486m0 = p10.e();
                                }
                                this.f30481h0 |= 16;
                            } else if (n10 == 40) {
                                this.f30481h0 |= 8;
                                this.f30485l0 = c4461f.k();
                            } else if (n10 != 48) {
                                if (!m(c4461f, j6, c4464i, n10)) {
                                }
                            } else {
                                this.f30481h0 |= 32;
                                this.f30487n0 = c4461f.k();
                            }
                        } else {
                            this.f30481h0 |= 2;
                            this.f30483j0 = c4461f.k();
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
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f30480Z = c4459d.i();
                    throw th3;
                }
                this.f30480Z = c4459d.i();
                k();
                throw th2;
            }
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30480Z = c4459d.i();
            throw th4;
        }
        this.f30480Z = c4459d.i();
        k();
    }
}
