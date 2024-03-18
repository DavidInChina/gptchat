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
public final class X extends lg.p {

    /* renamed from: l0  reason: collision with root package name */
    public static final X f30463l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C3033a f30464m0 = new C3033a(20);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30465Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f30466Z;

    /* renamed from: h0  reason: collision with root package name */
    public List f30467h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30468i0;

    /* renamed from: j0  reason: collision with root package name */
    public byte f30469j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30470k0;

    static {
        X x10 = new X();
        f30463l0 = x10;
        x10.f30467h0 = Collections.emptyList();
        x10.f30468i0 = -1;
    }

    public X() {
        this.f30469j0 = (byte) -1;
        this.f30470k0 = -1;
        this.f30465Y = AbstractC4460e.f38378Y;
    }

    public static C3038f g(X x10) {
        C3038f c3038f = new C3038f(1);
        c3038f.i(x10);
        return c3038f;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10 = this.f30470k0;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f30467h0.size(); i12++) {
            i11 += C4462g.d(1, (AbstractC4456a) this.f30467h0.get(i12));
        }
        if ((this.f30466Z & 1) == 1) {
            i11 += C4462g.b(2, this.f30468i0);
        }
        int size = this.f30465Y.size() + i11;
        this.f30470k0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return new C3038f(1);
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        return g(this);
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        for (int i10 = 0; i10 < this.f30467h0.size(); i10++) {
            c4462g.o(1, (AbstractC4456a) this.f30467h0.get(i10));
        }
        if ((this.f30466Z & 1) == 1) {
            c4462g.m(2, this.f30468i0);
        }
        c4462g.r(this.f30465Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30469j0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f30467h0.size(); i10++) {
            if (!((Q) this.f30467h0.get(i10)).isInitialized()) {
                this.f30469j0 = (byte) 0;
                return false;
            }
        }
        this.f30469j0 = (byte) 1;
        return true;
    }

    public X(C4461f c4461f, C4464i c4464i) {
        this.f30469j0 = (byte) -1;
        this.f30470k0 = -1;
        this.f30467h0 = Collections.emptyList();
        this.f30468i0 = -1;
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
                            if (n10 == 10) {
                                if (!(z11 & true)) {
                                    this.f30467h0 = new ArrayList();
                                    z11 = true;
                                }
                                this.f30467h0.add(c4461f.g(Q.f30394z0, c4464i));
                            } else if (n10 != 16) {
                                if (!c4461f.q(n10, j6)) {
                                }
                            } else {
                                this.f30466Z |= 1;
                                this.f30468i0 = c4461f.k();
                            }
                        }
                        z10 = true;
                    } catch (lg.t e10) {
                        e10.f38415Y = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    lg.t tVar = new lg.t(e11.getMessage());
                    tVar.f38415Y = this;
                    throw tVar;
                }
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f30467h0 = Collections.unmodifiableList(this.f30467h0);
                }
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f30465Y = c4459d.i();
                    throw th3;
                }
                this.f30465Y = c4459d.i();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f30467h0 = Collections.unmodifiableList(this.f30467h0);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30465Y = c4459d.i();
            throw th4;
        }
        this.f30465Y = c4459d.i();
    }

    public X(AbstractC4466k abstractC4466k) {
        this.f30469j0 = (byte) -1;
        this.f30470k0 = -1;
        this.f30465Y = abstractC4466k.f38400Y;
    }
}
