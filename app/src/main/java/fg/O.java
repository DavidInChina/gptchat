package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.io.IOException;
import lg.AbstractC4460e;
import lg.AbstractC4466k;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;
import lg.C4464i;

/* loaded from: classes.dex */
public final class O extends lg.p {

    /* renamed from: m0  reason: collision with root package name */
    public static final O f30369m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final C3033a f30370n0 = new C3033a(17);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30371Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f30372Z;

    /* renamed from: h0  reason: collision with root package name */
    public N f30373h0;

    /* renamed from: i0  reason: collision with root package name */
    public Q f30374i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30375j0;

    /* renamed from: k0  reason: collision with root package name */
    public byte f30376k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30377l0;

    static {
        O o10 = new O();
        f30369m0 = o10;
        o10.f30373h0 = N.INV;
        o10.f30374i0 = Q.f30393y0;
        o10.f30375j0 = 0;
    }

    public O() {
        this.f30376k0 = (byte) -1;
        this.f30377l0 = -1;
        this.f30371Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30377l0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30372Z & 1) == 1) {
            i10 = C4462g.a(1, this.f30373h0.f30368Y);
        } else {
            i10 = 0;
        }
        if ((this.f30372Z & 2) == 2) {
            i10 += C4462g.d(2, this.f30374i0);
        }
        if ((this.f30372Z & 4) == 4) {
            i10 += C4462g.b(3, this.f30375j0);
        }
        int size = this.f30371Y.size() + i10;
        this.f30377l0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return M.e();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        M e10 = M.e();
        e10.f(this);
        return e10;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        if ((this.f30372Z & 1) == 1) {
            c4462g.l(1, this.f30373h0.f30368Y);
        }
        if ((this.f30372Z & 2) == 2) {
            c4462g.o(2, this.f30374i0);
        }
        if ((this.f30372Z & 4) == 4) {
            c4462g.m(3, this.f30375j0);
        }
        c4462g.r(this.f30371Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30376k0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f30372Z & 2) == 2 && !this.f30374i0.isInitialized()) {
            this.f30376k0 = (byte) 0;
            return false;
        }
        this.f30376k0 = (byte) 1;
        return true;
    }

    public O(C4461f c4461f, C4464i c4464i) {
        this.f30376k0 = (byte) -1;
        this.f30377l0 = -1;
        N n10 = N.INV;
        this.f30373h0 = n10;
        this.f30374i0 = Q.f30393y0;
        boolean z10 = false;
        this.f30375j0 = 0;
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        while (!z10) {
            try {
                try {
                    try {
                        int n11 = c4461f.n();
                        if (n11 != 0) {
                            P p10 = null;
                            N n12 = null;
                            if (n11 == 8) {
                                int k10 = c4461f.k();
                                if (k10 == 0) {
                                    n12 = N.IN;
                                } else if (k10 == 1) {
                                    n12 = N.OUT;
                                } else if (k10 == 2) {
                                    n12 = n10;
                                } else if (k10 == 3) {
                                    n12 = N.STAR;
                                }
                                if (n12 == null) {
                                    j6.v(n11);
                                    j6.v(k10);
                                } else {
                                    this.f30372Z |= 1;
                                    this.f30373h0 = n12;
                                }
                            } else if (n11 == 18) {
                                if ((this.f30372Z & 2) == 2) {
                                    Q q10 = this.f30374i0;
                                    q10.getClass();
                                    p10 = Q.q(q10);
                                }
                                Q q11 = (Q) c4461f.g(Q.f30394z0, c4464i);
                                this.f30374i0 = q11;
                                if (p10 != null) {
                                    p10.g(q11);
                                    this.f30374i0 = p10.e();
                                }
                                this.f30372Z |= 2;
                            } else if (n11 != 24) {
                                if (!c4461f.q(n11, j6)) {
                                }
                            } else {
                                this.f30372Z |= 4;
                                this.f30375j0 = c4461f.k();
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
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f30371Y = c4459d.i();
                    throw th3;
                }
                this.f30371Y = c4459d.i();
                throw th2;
            }
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30371Y = c4459d.i();
            throw th4;
        }
        this.f30371Y = c4459d.i();
    }

    public O(AbstractC4466k abstractC4466k) {
        this.f30376k0 = (byte) -1;
        this.f30377l0 = -1;
        this.f30371Y = abstractC4466k.f38400Y;
    }
}
