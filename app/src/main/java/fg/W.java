package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
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
public final class W extends AbstractC4468m {

    /* renamed from: r0  reason: collision with root package name */
    public static final W f30450r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final C3033a f30451s0 = new C3033a(19);

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4460e f30452Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30453h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30454i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30455j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f30456k0;

    /* renamed from: l0  reason: collision with root package name */
    public V f30457l0;

    /* renamed from: m0  reason: collision with root package name */
    public List f30458m0;

    /* renamed from: n0  reason: collision with root package name */
    public List f30459n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f30460o0;

    /* renamed from: p0  reason: collision with root package name */
    public byte f30461p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f30462q0;

    static {
        W w10 = new W();
        f30450r0 = w10;
        w10.f30454i0 = 0;
        w10.f30455j0 = 0;
        w10.f30456k0 = false;
        w10.f30457l0 = V.INV;
        w10.f30458m0 = Collections.emptyList();
        w10.f30459n0 = Collections.emptyList();
    }

    public W(AbstractC4467l abstractC4467l) {
        super(abstractC4467l);
        this.f30460o0 = -1;
        this.f30461p0 = (byte) -1;
        this.f30462q0 = -1;
        this.f30452Z = abstractC4467l.f38400Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30462q0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30453h0 & 1) == 1) {
            i10 = C4462g.b(1, this.f30454i0);
        } else {
            i10 = 0;
        }
        if ((this.f30453h0 & 2) == 2) {
            i10 += C4462g.b(2, this.f30455j0);
        }
        if ((this.f30453h0 & 4) == 4) {
            i10 += C4462g.h(3) + 1;
        }
        if ((this.f30453h0 & 8) == 8) {
            i10 += C4462g.a(4, this.f30457l0.f30449Y);
        }
        for (int i12 = 0; i12 < this.f30458m0.size(); i12++) {
            i10 += C4462g.d(5, (AbstractC4456a) this.f30458m0.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f30459n0.size(); i14++) {
            i13 += C4462g.c(((Integer) this.f30459n0.get(i14)).intValue());
        }
        int i15 = i10 + i13;
        if (!this.f30459n0.isEmpty()) {
            i15 = i15 + 1 + C4462g.c(i13);
        }
        this.f30460o0 = i13;
        int size = this.f30452Z.size() + h() + i15;
        this.f30462q0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return U.f();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        U f6 = U.f();
        f6.g(this);
        return f6;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        B2.E e10 = new B2.E(this);
        if ((this.f30453h0 & 1) == 1) {
            c4462g.m(1, this.f30454i0);
        }
        if ((this.f30453h0 & 2) == 2) {
            c4462g.m(2, this.f30455j0);
        }
        if ((this.f30453h0 & 4) == 4) {
            boolean z10 = this.f30456k0;
            c4462g.x(3, 0);
            c4462g.q(z10 ? 1 : 0);
        }
        if ((this.f30453h0 & 8) == 8) {
            c4462g.l(4, this.f30457l0.f30449Y);
        }
        for (int i10 = 0; i10 < this.f30458m0.size(); i10++) {
            c4462g.o(5, (AbstractC4456a) this.f30458m0.get(i10));
        }
        if (this.f30459n0.size() > 0) {
            c4462g.v(50);
            c4462g.v(this.f30460o0);
        }
        for (int i11 = 0; i11 < this.f30459n0.size(); i11++) {
            c4462g.n(((Integer) this.f30459n0.get(i11)).intValue());
        }
        e10.h(1000, c4462g);
        c4462g.r(this.f30452Z);
    }

    @Override // lg.x
    public final AbstractC4456a getDefaultInstanceForType() {
        return f30450r0;
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30461p0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f30453h0;
        if ((i10 & 1) == 1) {
            if ((i10 & 2) == 2) {
                for (int i11 = 0; i11 < this.f30458m0.size(); i11++) {
                    if (!((Q) this.f30458m0.get(i11)).isInitialized()) {
                        this.f30461p0 = (byte) 0;
                        return false;
                    }
                }
                if (!g()) {
                    this.f30461p0 = (byte) 0;
                    return false;
                }
                this.f30461p0 = (byte) 1;
                return true;
            }
            this.f30461p0 = (byte) 0;
            return false;
        }
        this.f30461p0 = (byte) 0;
        return false;
    }

    public W() {
        this.f30460o0 = -1;
        this.f30461p0 = (byte) -1;
        this.f30462q0 = -1;
        this.f30452Z = AbstractC4460e.f38378Y;
    }

    public W(C4461f c4461f, C4464i c4464i) {
        V v10;
        this.f30460o0 = -1;
        this.f30461p0 = (byte) -1;
        this.f30462q0 = -1;
        this.f30454i0 = 0;
        this.f30455j0 = 0;
        this.f30456k0 = false;
        V v11 = V.INV;
        this.f30457l0 = v11;
        this.f30458m0 = Collections.emptyList();
        this.f30459n0 = Collections.emptyList();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = c4461f.n();
                    if (n10 != 0) {
                        if (n10 == 8) {
                            this.f30453h0 |= 1;
                            this.f30454i0 = c4461f.k();
                        } else if (n10 == 16) {
                            this.f30453h0 |= 2;
                            this.f30455j0 = c4461f.k();
                        } else if (n10 == 24) {
                            this.f30453h0 |= 4;
                            this.f30456k0 = c4461f.l() != 0;
                        } else if (n10 == 32) {
                            int k10 = c4461f.k();
                            if (k10 == 0) {
                                v10 = V.IN;
                            } else if (k10 != 1) {
                                v10 = k10 != 2 ? null : v11;
                            } else {
                                v10 = V.OUT;
                            }
                            if (v10 == null) {
                                j6.v(n10);
                                j6.v(k10);
                            } else {
                                this.f30453h0 |= 8;
                                this.f30457l0 = v10;
                            }
                        } else if (n10 == 42) {
                            if (!(z11 & true)) {
                                this.f30458m0 = new ArrayList();
                                z11 |= true;
                            }
                            this.f30458m0.add(c4461f.g(Q.f30394z0, c4464i));
                        } else if (n10 == 48) {
                            if (!(z11 & true)) {
                                this.f30459n0 = new ArrayList();
                                z11 |= true;
                            }
                            this.f30459n0.add(Integer.valueOf(c4461f.k()));
                        } else if (n10 != 50) {
                            if (!m(c4461f, j6, c4464i, n10)) {
                            }
                        } else {
                            int d10 = c4461f.d(c4461f.k());
                            if (!(z11 & true) && c4461f.b() > 0) {
                                this.f30459n0 = new ArrayList();
                                z11 |= true;
                            }
                            while (c4461f.b() > 0) {
                                this.f30459n0.add(Integer.valueOf(c4461f.k()));
                            }
                            c4461f.c(d10);
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
                    this.f30458m0 = Collections.unmodifiableList(this.f30458m0);
                }
                if (z11 & true) {
                    this.f30459n0 = Collections.unmodifiableList(this.f30459n0);
                }
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f30452Z = c4459d.i();
                    throw th3;
                }
                this.f30452Z = c4459d.i();
                k();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f30458m0 = Collections.unmodifiableList(this.f30458m0);
        }
        if (z11 & true) {
            this.f30459n0 = Collections.unmodifiableList(this.f30459n0);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30452Z = c4459d.i();
            throw th4;
        }
        this.f30452Z = c4459d.i();
        k();
    }
}
