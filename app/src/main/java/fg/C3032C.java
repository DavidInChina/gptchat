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

/* renamed from: fg.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3032C extends AbstractC4468m {

    /* renamed from: p0  reason: collision with root package name */
    public static final C3032C f30267p0;

    /* renamed from: q0  reason: collision with root package name */
    public static final C3033a f30268q0 = new C3033a(10);

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4460e f30269Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30270h0;

    /* renamed from: i0  reason: collision with root package name */
    public List f30271i0;

    /* renamed from: j0  reason: collision with root package name */
    public List f30272j0;

    /* renamed from: k0  reason: collision with root package name */
    public List f30273k0;

    /* renamed from: l0  reason: collision with root package name */
    public X f30274l0;

    /* renamed from: m0  reason: collision with root package name */
    public e0 f30275m0;

    /* renamed from: n0  reason: collision with root package name */
    public byte f30276n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f30277o0;

    static {
        C3032C c3032c = new C3032C();
        f30267p0 = c3032c;
        c3032c.f30271i0 = Collections.emptyList();
        c3032c.f30272j0 = Collections.emptyList();
        c3032c.f30273k0 = Collections.emptyList();
        c3032c.f30274l0 = X.f30463l0;
        c3032c.f30275m0 = e0.f30572j0;
    }

    public C3032C(AbstractC4467l abstractC4467l) {
        super(abstractC4467l);
        this.f30276n0 = (byte) -1;
        this.f30277o0 = -1;
        this.f30269Z = abstractC4467l.f38400Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10 = this.f30277o0;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f30271i0.size(); i12++) {
            i11 += C4462g.d(3, (AbstractC4456a) this.f30271i0.get(i12));
        }
        for (int i13 = 0; i13 < this.f30272j0.size(); i13++) {
            i11 += C4462g.d(4, (AbstractC4456a) this.f30272j0.get(i13));
        }
        for (int i14 = 0; i14 < this.f30273k0.size(); i14++) {
            i11 += C4462g.d(5, (AbstractC4456a) this.f30273k0.get(i14));
        }
        if ((this.f30270h0 & 1) == 1) {
            i11 += C4462g.d(30, this.f30274l0);
        }
        if ((this.f30270h0 & 2) == 2) {
            i11 += C4462g.d(32, this.f30275m0);
        }
        int size = this.f30269Z.size() + h() + i11;
        this.f30277o0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return C3031B.f();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3031B f6 = C3031B.f();
        f6.g(this);
        return f6;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        B2.E l10 = l();
        for (int i10 = 0; i10 < this.f30271i0.size(); i10++) {
            c4462g.o(3, (AbstractC4456a) this.f30271i0.get(i10));
        }
        for (int i11 = 0; i11 < this.f30272j0.size(); i11++) {
            c4462g.o(4, (AbstractC4456a) this.f30272j0.get(i11));
        }
        for (int i12 = 0; i12 < this.f30273k0.size(); i12++) {
            c4462g.o(5, (AbstractC4456a) this.f30273k0.get(i12));
        }
        if ((this.f30270h0 & 1) == 1) {
            c4462g.o(30, this.f30274l0);
        }
        if ((this.f30270h0 & 2) == 2) {
            c4462g.o(32, this.f30275m0);
        }
        l10.h(RCHTTPStatusCodes.SUCCESS, c4462g);
        c4462g.r(this.f30269Z);
    }

    @Override // lg.x
    public final AbstractC4456a getDefaultInstanceForType() {
        return f30267p0;
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30276n0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f30271i0.size(); i10++) {
            if (!((C3056y) this.f30271i0.get(i10)).isInitialized()) {
                this.f30276n0 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f30272j0.size(); i11++) {
            if (!((G) this.f30272j0.get(i11)).isInitialized()) {
                this.f30276n0 = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f30273k0.size(); i12++) {
            if (!((T) this.f30273k0.get(i12)).isInitialized()) {
                this.f30276n0 = (byte) 0;
                return false;
            }
        }
        if ((this.f30270h0 & 1) == 1 && !this.f30274l0.isInitialized()) {
            this.f30276n0 = (byte) 0;
            return false;
        } else if (!g()) {
            this.f30276n0 = (byte) 0;
            return false;
        } else {
            this.f30276n0 = (byte) 1;
            return true;
        }
    }

    public C3032C() {
        this.f30276n0 = (byte) -1;
        this.f30277o0 = -1;
        this.f30269Z = AbstractC4460e.f38378Y;
    }

    public C3032C(C4461f c4461f, C4464i c4464i) {
        this.f30276n0 = (byte) -1;
        this.f30277o0 = -1;
        this.f30271i0 = Collections.emptyList();
        this.f30272j0 = Collections.emptyList();
        this.f30273k0 = Collections.emptyList();
        this.f30274l0 = X.f30463l0;
        this.f30275m0 = e0.f30572j0;
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = c4461f.n();
                    if (n10 != 0) {
                        if (n10 == 26) {
                            boolean z12 = z11 & true;
                            z11 = z11;
                            if (!z12) {
                                this.f30271i0 = new ArrayList();
                                z11 |= true;
                            }
                            this.f30271i0.add(c4461f.g(C3056y.f30765A0, c4464i));
                        } else if (n10 == 34) {
                            boolean z13 = z11 & true;
                            z11 = z11;
                            if (!z13) {
                                this.f30272j0 = new ArrayList();
                                z11 |= true;
                            }
                            this.f30272j0.add(c4461f.g(G.f30308A0, c4464i));
                        } else if (n10 != 42) {
                            C3045m c3045m = null;
                            C3038f c3038f = null;
                            if (n10 == 242) {
                                if ((this.f30270h0 & 1) == 1) {
                                    X x10 = this.f30274l0;
                                    x10.getClass();
                                    c3038f = X.g(x10);
                                }
                                X x11 = (X) c4461f.g(X.f30464m0, c4464i);
                                this.f30274l0 = x11;
                                if (c3038f != null) {
                                    c3038f.i(x11);
                                    this.f30274l0 = c3038f.f();
                                }
                                this.f30270h0 |= 1;
                            } else if (n10 != 258) {
                                if (!m(c4461f, j6, c4464i, n10)) {
                                }
                            } else {
                                if ((this.f30270h0 & 2) == 2) {
                                    e0 e0Var = this.f30275m0;
                                    e0Var.getClass();
                                    c3045m = new C3045m(2);
                                    c3045m.k(e0Var);
                                }
                                e0 e0Var2 = (e0) c4461f.g(e0.f30573k0, c4464i);
                                this.f30275m0 = e0Var2;
                                if (c3045m != null) {
                                    c3045m.k(e0Var2);
                                    this.f30275m0 = c3045m.g();
                                }
                                this.f30270h0 |= 2;
                            }
                        } else {
                            boolean z14 = z11 & true;
                            z11 = z11;
                            if (!z14) {
                                this.f30273k0 = new ArrayList();
                                z11 |= true;
                            }
                            this.f30273k0.add(c4461f.g(T.f30424u0, c4464i));
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f30271i0 = Collections.unmodifiableList(this.f30271i0);
                    }
                    if (z11 & true) {
                        this.f30272j0 = Collections.unmodifiableList(this.f30272j0);
                    }
                    if (z11 & true) {
                        this.f30273k0 = Collections.unmodifiableList(this.f30273k0);
                    }
                    try {
                        j6.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f30269Z = c4459d.i();
                        throw th3;
                    }
                    this.f30269Z = c4459d.i();
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
        boolean z15 = z11 ? 1 : 0;
        boolean z16 = z11 ? 1 : 0;
        boolean z17 = z11 ? 1 : 0;
        boolean z18 = z11 ? 1 : 0;
        boolean z19 = z11 ? 1 : 0;
        boolean z20 = z11 ? 1 : 0;
        boolean z21 = z11 ? 1 : 0;
        boolean z22 = z11 ? 1 : 0;
        boolean z23 = z11 ? 1 : 0;
        if (z15 & true) {
            this.f30271i0 = Collections.unmodifiableList(this.f30271i0);
        }
        if (z11 & true) {
            this.f30272j0 = Collections.unmodifiableList(this.f30272j0);
        }
        if (z11 & true) {
            this.f30273k0 = Collections.unmodifiableList(this.f30273k0);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30269Z = c4459d.i();
            throw th4;
        }
        this.f30269Z = c4459d.i();
        k();
    }
}
