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

/* loaded from: classes.dex */
public final class r extends lg.p {

    /* renamed from: n0  reason: collision with root package name */
    public static final r f30705n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final C3033a f30706o0 = new C3033a(6);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30707Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f30708Z;

    /* renamed from: h0  reason: collision with root package name */
    public EnumC3048p f30709h0;

    /* renamed from: i0  reason: collision with root package name */
    public List f30710i0;

    /* renamed from: j0  reason: collision with root package name */
    public C3054w f30711j0;

    /* renamed from: k0  reason: collision with root package name */
    public EnumC3049q f30712k0;

    /* renamed from: l0  reason: collision with root package name */
    public byte f30713l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f30714m0;

    static {
        r rVar = new r();
        f30705n0 = rVar;
        rVar.f30709h0 = EnumC3048p.RETURNS_CONSTANT;
        rVar.f30710i0 = Collections.emptyList();
        rVar.f30711j0 = C3054w.f30737q0;
        rVar.f30712k0 = EnumC3049q.AT_MOST_ONCE;
    }

    public r() {
        this.f30713l0 = (byte) -1;
        this.f30714m0 = -1;
        this.f30707Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30714m0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30708Z & 1) == 1) {
            i10 = C4462g.a(1, this.f30709h0.f30699Y);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < this.f30710i0.size(); i12++) {
            i10 += C4462g.d(2, (AbstractC4456a) this.f30710i0.get(i12));
        }
        if ((this.f30708Z & 2) == 2) {
            i10 += C4462g.d(3, this.f30711j0);
        }
        if ((this.f30708Z & 4) == 4) {
            i10 += C4462g.a(4, this.f30712k0.f30704Y);
        }
        int size = this.f30707Y.size() + i10;
        this.f30714m0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return C3047o.e();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3047o e10 = C3047o.e();
        e10.f(this);
        return e10;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        if ((this.f30708Z & 1) == 1) {
            c4462g.l(1, this.f30709h0.f30699Y);
        }
        for (int i10 = 0; i10 < this.f30710i0.size(); i10++) {
            c4462g.o(2, (AbstractC4456a) this.f30710i0.get(i10));
        }
        if ((this.f30708Z & 2) == 2) {
            c4462g.o(3, this.f30711j0);
        }
        if ((this.f30708Z & 4) == 4) {
            c4462g.l(4, this.f30712k0.f30704Y);
        }
        c4462g.r(this.f30707Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30713l0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f30710i0.size(); i10++) {
            if (!((C3054w) this.f30710i0.get(i10)).isInitialized()) {
                this.f30713l0 = (byte) 0;
                return false;
            }
        }
        if ((this.f30708Z & 2) == 2 && !this.f30711j0.isInitialized()) {
            this.f30713l0 = (byte) 0;
            return false;
        }
        this.f30713l0 = (byte) 1;
        return true;
    }

    public r(C4461f c4461f, C4464i c4464i) {
        this.f30713l0 = (byte) -1;
        this.f30714m0 = -1;
        EnumC3048p enumC3048p = EnumC3048p.RETURNS_CONSTANT;
        this.f30709h0 = enumC3048p;
        this.f30710i0 = Collections.emptyList();
        this.f30711j0 = C3054w.f30737q0;
        EnumC3049q enumC3049q = EnumC3049q.AT_MOST_ONCE;
        this.f30712k0 = enumC3049q;
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = c4461f.n();
                        if (n10 != 0) {
                            EnumC3049q enumC3049q2 = null;
                            EnumC3048p enumC3048p2 = null;
                            C3052u c3052u = null;
                            if (n10 == 8) {
                                int k10 = c4461f.k();
                                if (k10 == 0) {
                                    enumC3048p2 = enumC3048p;
                                } else if (k10 == 1) {
                                    enumC3048p2 = EnumC3048p.CALLS;
                                } else if (k10 == 2) {
                                    enumC3048p2 = EnumC3048p.RETURNS_NOT_NULL;
                                }
                                if (enumC3048p2 == null) {
                                    j6.v(n10);
                                    j6.v(k10);
                                } else {
                                    this.f30708Z |= 1;
                                    this.f30709h0 = enumC3048p2;
                                }
                            } else if (n10 == 18) {
                                boolean z12 = z11 & true;
                                z11 = z11;
                                if (!z12) {
                                    this.f30710i0 = new ArrayList();
                                    z11 = true;
                                }
                                this.f30710i0.add(c4461f.g(C3054w.f30738r0, c4464i));
                            } else if (n10 == 26) {
                                if ((this.f30708Z & 2) == 2) {
                                    C3054w c3054w = this.f30711j0;
                                    c3054w.getClass();
                                    c3052u = C3052u.e();
                                    c3052u.f(c3054w);
                                }
                                C3054w c3054w2 = (C3054w) c4461f.g(C3054w.f30738r0, c4464i);
                                this.f30711j0 = c3054w2;
                                if (c3052u != null) {
                                    c3052u.f(c3054w2);
                                    this.f30711j0 = c3052u.d();
                                }
                                this.f30708Z |= 2;
                            } else if (n10 != 32) {
                                if (!c4461f.q(n10, j6)) {
                                }
                            } else {
                                int k11 = c4461f.k();
                                if (k11 == 0) {
                                    enumC3049q2 = enumC3049q;
                                } else if (k11 == 1) {
                                    enumC3049q2 = EnumC3049q.EXACTLY_ONCE;
                                } else if (k11 == 2) {
                                    enumC3049q2 = EnumC3049q.AT_LEAST_ONCE;
                                }
                                if (enumC3049q2 == null) {
                                    j6.v(n10);
                                    j6.v(k11);
                                } else {
                                    this.f30708Z |= 4;
                                    this.f30712k0 = enumC3049q2;
                                }
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
                    this.f30710i0 = Collections.unmodifiableList(this.f30710i0);
                }
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f30707Y = c4459d.i();
                    throw th3;
                }
                this.f30707Y = c4459d.i();
                throw th2;
            }
        }
        boolean z13 = z11 ? 1 : 0;
        boolean z14 = z11 ? 1 : 0;
        boolean z15 = z11 ? 1 : 0;
        boolean z16 = z11 ? 1 : 0;
        boolean z17 = z11 ? 1 : 0;
        if (z13 & true) {
            this.f30710i0 = Collections.unmodifiableList(this.f30710i0);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30707Y = c4459d.i();
            throw th4;
        }
        this.f30707Y = c4459d.i();
    }

    public r(AbstractC4466k abstractC4466k) {
        this.f30713l0 = (byte) -1;
        this.f30714m0 = -1;
        this.f30707Y = abstractC4466k.f38400Y;
    }
}
