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
public final class E extends AbstractC4468m {

    /* renamed from: o0  reason: collision with root package name */
    public static final E f30283o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final C3033a f30284p0 = new C3033a(11);

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4460e f30285Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30286h0;

    /* renamed from: i0  reason: collision with root package name */
    public L f30287i0;

    /* renamed from: j0  reason: collision with root package name */
    public K f30288j0;

    /* renamed from: k0  reason: collision with root package name */
    public C3032C f30289k0;

    /* renamed from: l0  reason: collision with root package name */
    public List f30290l0;

    /* renamed from: m0  reason: collision with root package name */
    public byte f30291m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f30292n0;

    static {
        E e10 = new E();
        f30283o0 = e10;
        e10.f30287i0 = L.f30353j0;
        e10.f30288j0 = K.f30347j0;
        e10.f30289k0 = C3032C.f30267p0;
        e10.f30290l0 = Collections.emptyList();
    }

    public E(AbstractC4467l abstractC4467l) {
        super(abstractC4467l);
        this.f30291m0 = (byte) -1;
        this.f30292n0 = -1;
        this.f30285Z = abstractC4467l.f38400Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30292n0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30286h0 & 1) == 1) {
            i10 = C4462g.d(1, this.f30287i0);
        } else {
            i10 = 0;
        }
        if ((this.f30286h0 & 2) == 2) {
            i10 += C4462g.d(2, this.f30288j0);
        }
        if ((this.f30286h0 & 4) == 4) {
            i10 += C4462g.d(3, this.f30289k0);
        }
        for (int i12 = 0; i12 < this.f30290l0.size(); i12++) {
            i10 += C4462g.d(4, (AbstractC4456a) this.f30290l0.get(i12));
        }
        int size = this.f30285Z.size() + h() + i10;
        this.f30292n0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return D.f();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        D f6 = D.f();
        f6.g(this);
        return f6;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        B2.E l10 = l();
        if ((this.f30286h0 & 1) == 1) {
            c4462g.o(1, this.f30287i0);
        }
        if ((this.f30286h0 & 2) == 2) {
            c4462g.o(2, this.f30288j0);
        }
        if ((this.f30286h0 & 4) == 4) {
            c4462g.o(3, this.f30289k0);
        }
        for (int i10 = 0; i10 < this.f30290l0.size(); i10++) {
            c4462g.o(4, (AbstractC4456a) this.f30290l0.get(i10));
        }
        l10.h(RCHTTPStatusCodes.SUCCESS, c4462g);
        c4462g.r(this.f30285Z);
    }

    @Override // lg.x
    public final AbstractC4456a getDefaultInstanceForType() {
        return f30283o0;
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30291m0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f30286h0 & 2) == 2 && !this.f30288j0.isInitialized()) {
            this.f30291m0 = (byte) 0;
            return false;
        } else if ((this.f30286h0 & 4) == 4 && !this.f30289k0.isInitialized()) {
            this.f30291m0 = (byte) 0;
            return false;
        } else {
            for (int i10 = 0; i10 < this.f30290l0.size(); i10++) {
                if (!((C3042j) this.f30290l0.get(i10)).isInitialized()) {
                    this.f30291m0 = (byte) 0;
                    return false;
                }
            }
            if (!g()) {
                this.f30291m0 = (byte) 0;
                return false;
            }
            this.f30291m0 = (byte) 1;
            return true;
        }
    }

    public E() {
        this.f30291m0 = (byte) -1;
        this.f30292n0 = -1;
        this.f30285Z = AbstractC4460e.f38378Y;
    }

    public E(C4461f c4461f, C4464i c4464i) {
        this.f30291m0 = (byte) -1;
        this.f30292n0 = -1;
        this.f30287i0 = L.f30353j0;
        this.f30288j0 = K.f30347j0;
        this.f30289k0 = C3032C.f30267p0;
        this.f30290l0 = Collections.emptyList();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = c4461f.n();
                    if (n10 != 0) {
                        C3031B c3031b = null;
                        C3045m c3045m = null;
                        C3045m c3045m2 = null;
                        if (n10 == 10) {
                            if ((this.f30286h0 & 1) == 1) {
                                L l10 = this.f30287i0;
                                l10.getClass();
                                c3045m = new C3045m(3);
                                c3045m.j(l10);
                            }
                            L l11 = (L) c4461f.g(L.f30354k0, c4464i);
                            this.f30287i0 = l11;
                            if (c3045m != null) {
                                c3045m.j(l11);
                                this.f30287i0 = c3045m.f();
                            }
                            this.f30286h0 |= 1;
                        } else if (n10 == 18) {
                            if ((this.f30286h0 & 2) == 2) {
                                K k10 = this.f30288j0;
                                k10.getClass();
                                c3045m2 = new C3045m(1);
                                c3045m2.i(k10);
                            }
                            K k11 = (K) c4461f.g(K.f30348k0, c4464i);
                            this.f30288j0 = k11;
                            if (c3045m2 != null) {
                                c3045m2.i(k11);
                                this.f30288j0 = c3045m2.e();
                            }
                            this.f30286h0 |= 2;
                        } else if (n10 == 26) {
                            if ((this.f30286h0 & 4) == 4) {
                                C3032C c3032c = this.f30289k0;
                                c3032c.getClass();
                                c3031b = C3031B.f();
                                c3031b.g(c3032c);
                            }
                            C3032C c3032c2 = (C3032C) c4461f.g(C3032C.f30268q0, c4464i);
                            this.f30289k0 = c3032c2;
                            if (c3031b != null) {
                                c3031b.g(c3032c2);
                                this.f30289k0 = c3031b.e();
                            }
                            this.f30286h0 |= 4;
                        } else if (n10 != 34) {
                            if (!m(c4461f, j6, c4464i, n10)) {
                            }
                        } else {
                            boolean z12 = z11 & true;
                            z11 = z11;
                            if (!z12) {
                                this.f30290l0 = new ArrayList();
                                z11 = true;
                            }
                            this.f30290l0.add(c4461f.g(C3042j.f30633P0, c4464i));
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
                    this.f30290l0 = Collections.unmodifiableList(this.f30290l0);
                }
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f30285Z = c4459d.i();
                    throw th3;
                }
                this.f30285Z = c4459d.i();
                k();
                throw th2;
            }
        }
        boolean z13 = z11 ? 1 : 0;
        boolean z14 = z11 ? 1 : 0;
        boolean z15 = z11 ? 1 : 0;
        boolean z16 = z11 ? 1 : 0;
        boolean z17 = z11 ? 1 : 0;
        if (z13 & true) {
            this.f30290l0 = Collections.unmodifiableList(this.f30290l0);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30285Z = c4459d.i();
            throw th4;
        }
        this.f30285Z = c4459d.i();
        k();
    }
}
