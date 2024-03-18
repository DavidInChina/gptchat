package ig;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import fg.C3033a;
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
import lg.p;
import lg.t;

/* loaded from: classes.dex */
public final class j extends p {

    /* renamed from: l0  reason: collision with root package name */
    public static final j f33224l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C3033a f33225m0 = new C3033a(27);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f33226Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f33227Z;

    /* renamed from: h0  reason: collision with root package name */
    public List f33228h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33229i0;

    /* renamed from: j0  reason: collision with root package name */
    public byte f33230j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f33231k0;

    static {
        j jVar = new j();
        f33224l0 = jVar;
        jVar.f33227Z = Collections.emptyList();
        jVar.f33228h0 = Collections.emptyList();
    }

    public j() {
        this.f33229i0 = -1;
        this.f33230j0 = (byte) -1;
        this.f33231k0 = -1;
        this.f33226Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10 = this.f33231k0;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f33227Z.size(); i12++) {
            i11 += C4462g.d(1, (AbstractC4456a) this.f33227Z.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f33228h0.size(); i14++) {
            i13 += C4462g.c(((Integer) this.f33228h0.get(i14)).intValue());
        }
        int i15 = i11 + i13;
        if (!this.f33228h0.isEmpty()) {
            i15 = i15 + 1 + C4462g.c(i13);
        }
        this.f33229i0 = i13;
        int size = this.f33226Y.size() + i15;
        this.f33231k0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return C3580f.e();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3580f e10 = C3580f.e();
        e10.f(this);
        return e10;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        for (int i10 = 0; i10 < this.f33227Z.size(); i10++) {
            c4462g.o(1, (AbstractC4456a) this.f33227Z.get(i10));
        }
        if (this.f33228h0.size() > 0) {
            c4462g.v(42);
            c4462g.v(this.f33229i0);
        }
        for (int i11 = 0; i11 < this.f33228h0.size(); i11++) {
            c4462g.n(((Integer) this.f33228h0.get(i11)).intValue());
        }
        c4462g.r(this.f33226Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f33230j0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f33230j0 = (byte) 1;
        return true;
    }

    public j(C4461f c4461f, C4464i c4464i) {
        this.f33229i0 = -1;
        this.f33230j0 = (byte) -1;
        this.f33231k0 = -1;
        this.f33227Z = Collections.emptyList();
        this.f33228h0 = Collections.emptyList();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = c4461f.n();
                    if (n10 != 0) {
                        if (n10 == 10) {
                            if (!(z11 & true)) {
                                this.f33227Z = new ArrayList();
                                z11 |= true;
                            }
                            this.f33227Z.add(c4461f.g(C3583i.f33211s0, c4464i));
                        } else if (n10 == 40) {
                            if (!(z11 & true)) {
                                this.f33228h0 = new ArrayList();
                                z11 |= true;
                            }
                            this.f33228h0.add(Integer.valueOf(c4461f.k()));
                        } else if (n10 != 42) {
                            if (!c4461f.q(n10, j6)) {
                            }
                        } else {
                            int d10 = c4461f.d(c4461f.k());
                            if (!(z11 & true) && c4461f.b() > 0) {
                                this.f33228h0 = new ArrayList();
                                z11 |= true;
                            }
                            while (c4461f.b() > 0) {
                                this.f33228h0.add(Integer.valueOf(c4461f.k()));
                            }
                            c4461f.c(d10);
                        }
                    }
                    z10 = true;
                } catch (t e10) {
                    e10.f38415Y = this;
                    throw e10;
                } catch (IOException e11) {
                    t tVar = new t(e11.getMessage());
                    tVar.f38415Y = this;
                    throw tVar;
                }
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f33227Z = Collections.unmodifiableList(this.f33227Z);
                }
                if (z11 & true) {
                    this.f33228h0 = Collections.unmodifiableList(this.f33228h0);
                }
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f33226Y = c4459d.i();
                    throw th3;
                }
                this.f33226Y = c4459d.i();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f33227Z = Collections.unmodifiableList(this.f33227Z);
        }
        if (z11 & true) {
            this.f33228h0 = Collections.unmodifiableList(this.f33228h0);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f33226Y = c4459d.i();
            throw th4;
        }
        this.f33226Y = c4459d.i();
    }

    public j(AbstractC4466k abstractC4466k) {
        this.f33229i0 = -1;
        this.f33230j0 = (byte) -1;
        this.f33231k0 = -1;
        this.f33226Y = abstractC4466k.f38400Y;
    }
}
