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

/* renamed from: fg.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3054w extends lg.p {

    /* renamed from: q0  reason: collision with root package name */
    public static final C3054w f30737q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final C3033a f30738r0 = new C3033a(8);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30739Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f30740Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30741h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30742i0;

    /* renamed from: j0  reason: collision with root package name */
    public EnumC3053v f30743j0;

    /* renamed from: k0  reason: collision with root package name */
    public Q f30744k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30745l0;

    /* renamed from: m0  reason: collision with root package name */
    public List f30746m0;

    /* renamed from: n0  reason: collision with root package name */
    public List f30747n0;

    /* renamed from: o0  reason: collision with root package name */
    public byte f30748o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f30749p0;

    static {
        C3054w c3054w = new C3054w();
        f30737q0 = c3054w;
        c3054w.f30741h0 = 0;
        c3054w.f30742i0 = 0;
        c3054w.f30743j0 = EnumC3053v.TRUE;
        c3054w.f30744k0 = Q.f30393y0;
        c3054w.f30745l0 = 0;
        c3054w.f30746m0 = Collections.emptyList();
        c3054w.f30747n0 = Collections.emptyList();
    }

    public C3054w(C4461f c4461f, C4464i c4464i) {
        EnumC3053v enumC3053v;
        this.f30748o0 = (byte) -1;
        this.f30749p0 = -1;
        boolean z10 = false;
        this.f30741h0 = 0;
        this.f30742i0 = 0;
        EnumC3053v enumC3053v2 = EnumC3053v.TRUE;
        this.f30743j0 = enumC3053v2;
        this.f30744k0 = Q.f30393y0;
        this.f30745l0 = 0;
        this.f30746m0 = Collections.emptyList();
        this.f30747n0 = Collections.emptyList();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = c4461f.n();
                    if (n10 != 0) {
                        if (n10 == 8) {
                            this.f30740Z |= 1;
                            this.f30741h0 = c4461f.k();
                        } else if (n10 != 16) {
                            P p10 = null;
                            EnumC3053v enumC3053v3 = null;
                            if (n10 == 24) {
                                int k10 = c4461f.k();
                                if (k10 != 0) {
                                    if (k10 == 1) {
                                        enumC3053v3 = EnumC3053v.FALSE;
                                    } else if (k10 == 2) {
                                        enumC3053v3 = EnumC3053v.NULL;
                                    }
                                    enumC3053v = enumC3053v3;
                                } else {
                                    enumC3053v = enumC3053v2;
                                }
                                if (enumC3053v != null) {
                                    this.f30740Z |= 4;
                                    this.f30743j0 = enumC3053v;
                                } else {
                                    j6.v(n10);
                                    j6.v(k10);
                                }
                            } else if (n10 == 34) {
                                if ((this.f30740Z & 8) == 8) {
                                    Q q10 = this.f30744k0;
                                    q10.getClass();
                                    p10 = Q.q(q10);
                                }
                                P p11 = p10;
                                Q q11 = (Q) c4461f.g(Q.f30394z0, c4464i);
                                this.f30744k0 = q11;
                                if (p11 != null) {
                                    p11.g(q11);
                                    this.f30744k0 = p11.e();
                                }
                                this.f30740Z |= 8;
                            } else if (n10 == 40) {
                                this.f30740Z |= 16;
                                this.f30745l0 = c4461f.k();
                            } else {
                                C3033a c3033a = f30738r0;
                                if (n10 == 50) {
                                    boolean z12 = z11 & true;
                                    z11 = z11;
                                    if (!z12) {
                                        this.f30746m0 = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.f30746m0.add(c4461f.g(c3033a, c4464i));
                                } else if (n10 != 58) {
                                    if (!c4461f.q(n10, j6)) {
                                    }
                                } else {
                                    boolean z13 = z11 & true;
                                    z11 = z11;
                                    if (!z13) {
                                        this.f30747n0 = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.f30747n0.add(c4461f.g(c3033a, c4464i));
                                }
                            }
                        } else {
                            this.f30740Z |= 2;
                            this.f30742i0 = c4461f.k();
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
                if (z11 & true) {
                    this.f30746m0 = Collections.unmodifiableList(this.f30746m0);
                }
                if (z11 & true) {
                    this.f30747n0 = Collections.unmodifiableList(this.f30747n0);
                }
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f30739Y = c4459d.i();
                    throw th3;
                }
                this.f30739Y = c4459d.i();
                throw th2;
            }
        }
        boolean z14 = z11 ? 1 : 0;
        boolean z15 = z11 ? 1 : 0;
        boolean z16 = z11 ? 1 : 0;
        boolean z17 = z11 ? 1 : 0;
        boolean z18 = z11 ? 1 : 0;
        boolean z19 = z11 ? 1 : 0;
        boolean z20 = z11 ? 1 : 0;
        if (z14 & true) {
            this.f30746m0 = Collections.unmodifiableList(this.f30746m0);
        }
        if (z11 & true) {
            this.f30747n0 = Collections.unmodifiableList(this.f30747n0);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30739Y = c4459d.i();
            throw th4;
        }
        this.f30739Y = c4459d.i();
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30749p0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30740Z & 1) == 1) {
            i10 = C4462g.b(1, this.f30741h0);
        } else {
            i10 = 0;
        }
        if ((this.f30740Z & 2) == 2) {
            i10 += C4462g.b(2, this.f30742i0);
        }
        if ((this.f30740Z & 4) == 4) {
            i10 += C4462g.a(3, this.f30743j0.f30736Y);
        }
        if ((this.f30740Z & 8) == 8) {
            i10 += C4462g.d(4, this.f30744k0);
        }
        if ((this.f30740Z & 16) == 16) {
            i10 += C4462g.b(5, this.f30745l0);
        }
        for (int i12 = 0; i12 < this.f30746m0.size(); i12++) {
            i10 += C4462g.d(6, (AbstractC4456a) this.f30746m0.get(i12));
        }
        for (int i13 = 0; i13 < this.f30747n0.size(); i13++) {
            i10 += C4462g.d(7, (AbstractC4456a) this.f30747n0.get(i13));
        }
        int size = this.f30739Y.size() + i10;
        this.f30749p0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return C3052u.e();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3052u e10 = C3052u.e();
        e10.f(this);
        return e10;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        if ((this.f30740Z & 1) == 1) {
            c4462g.m(1, this.f30741h0);
        }
        if ((this.f30740Z & 2) == 2) {
            c4462g.m(2, this.f30742i0);
        }
        if ((this.f30740Z & 4) == 4) {
            c4462g.l(3, this.f30743j0.f30736Y);
        }
        if ((this.f30740Z & 8) == 8) {
            c4462g.o(4, this.f30744k0);
        }
        if ((this.f30740Z & 16) == 16) {
            c4462g.m(5, this.f30745l0);
        }
        for (int i10 = 0; i10 < this.f30746m0.size(); i10++) {
            c4462g.o(6, (AbstractC4456a) this.f30746m0.get(i10));
        }
        for (int i11 = 0; i11 < this.f30747n0.size(); i11++) {
            c4462g.o(7, (AbstractC4456a) this.f30747n0.get(i11));
        }
        c4462g.r(this.f30739Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30748o0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f30740Z & 8) == 8 && !this.f30744k0.isInitialized()) {
            this.f30748o0 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f30746m0.size(); i10++) {
            if (!((C3054w) this.f30746m0.get(i10)).isInitialized()) {
                this.f30748o0 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f30747n0.size(); i11++) {
            if (!((C3054w) this.f30747n0.get(i11)).isInitialized()) {
                this.f30748o0 = (byte) 0;
                return false;
            }
        }
        this.f30748o0 = (byte) 1;
        return true;
    }

    public C3054w() {
        this.f30748o0 = (byte) -1;
        this.f30749p0 = -1;
        this.f30739Y = AbstractC4460e.f38378Y;
    }

    public C3054w(AbstractC4466k abstractC4466k) {
        this.f30748o0 = (byte) -1;
        this.f30749p0 = -1;
        this.f30739Y = abstractC4466k.f38400Y;
    }
}
