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

/* renamed from: fg.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3044l extends AbstractC4468m {

    /* renamed from: n0  reason: collision with root package name */
    public static final C3044l f30672n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final C3033a f30673o0 = new C3033a(4);

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4460e f30674Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30675h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30676i0;

    /* renamed from: j0  reason: collision with root package name */
    public List f30677j0;

    /* renamed from: k0  reason: collision with root package name */
    public List f30678k0;

    /* renamed from: l0  reason: collision with root package name */
    public byte f30679l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f30680m0;

    static {
        C3044l c3044l = new C3044l();
        f30672n0 = c3044l;
        c3044l.f30676i0 = 6;
        c3044l.f30677j0 = Collections.emptyList();
        c3044l.f30678k0 = Collections.emptyList();
    }

    public C3044l(AbstractC4467l abstractC4467l) {
        super(abstractC4467l);
        this.f30679l0 = (byte) -1;
        this.f30680m0 = -1;
        this.f30674Z = abstractC4467l.f38400Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30680m0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30675h0 & 1) == 1) {
            i10 = C4462g.b(1, this.f30676i0);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < this.f30677j0.size(); i12++) {
            i10 += C4462g.d(2, (AbstractC4456a) this.f30677j0.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f30678k0.size(); i14++) {
            i13 += C4462g.c(((Integer) this.f30678k0.get(i14)).intValue());
        }
        int size = this.f30674Z.size() + h() + (this.f30678k0.size() * 2) + i10 + i13;
        this.f30680m0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return C3043k.f();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3043k f6 = C3043k.f();
        f6.g(this);
        return f6;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        B2.E l10 = l();
        if ((this.f30675h0 & 1) == 1) {
            c4462g.m(1, this.f30676i0);
        }
        for (int i10 = 0; i10 < this.f30677j0.size(); i10++) {
            c4462g.o(2, (AbstractC4456a) this.f30677j0.get(i10));
        }
        for (int i11 = 0; i11 < this.f30678k0.size(); i11++) {
            c4462g.m(31, ((Integer) this.f30678k0.get(i11)).intValue());
        }
        l10.h(19000, c4462g);
        c4462g.r(this.f30674Z);
    }

    @Override // lg.x
    public final AbstractC4456a getDefaultInstanceForType() {
        return f30672n0;
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30679l0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f30677j0.size(); i10++) {
            if (!((Z) this.f30677j0.get(i10)).isInitialized()) {
                this.f30679l0 = (byte) 0;
                return false;
            }
        }
        if (!g()) {
            this.f30679l0 = (byte) 0;
            return false;
        }
        this.f30679l0 = (byte) 1;
        return true;
    }

    public C3044l() {
        this.f30679l0 = (byte) -1;
        this.f30680m0 = -1;
        this.f30674Z = AbstractC4460e.f38378Y;
    }

    public C3044l(C4461f c4461f, C4464i c4464i) {
        this.f30679l0 = (byte) -1;
        this.f30680m0 = -1;
        this.f30676i0 = 6;
        this.f30677j0 = Collections.emptyList();
        this.f30678k0 = Collections.emptyList();
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
                            this.f30675h0 |= 1;
                            this.f30676i0 = c4461f.k();
                        } else if (n10 == 18) {
                            if (!(z11 & true)) {
                                this.f30677j0 = new ArrayList();
                                z11 |= true;
                            }
                            this.f30677j0.add(c4461f.g(Z.f30479r0, c4464i));
                        } else if (n10 == 248) {
                            if (!(z11 & true)) {
                                this.f30678k0 = new ArrayList();
                                z11 |= true;
                            }
                            this.f30678k0.add(Integer.valueOf(c4461f.k()));
                        } else if (n10 != 250) {
                            if (!m(c4461f, j6, c4464i, n10)) {
                            }
                        } else {
                            int d10 = c4461f.d(c4461f.k());
                            if (!(z11 & true) && c4461f.b() > 0) {
                                this.f30678k0 = new ArrayList();
                                z11 |= true;
                            }
                            while (c4461f.b() > 0) {
                                this.f30678k0.add(Integer.valueOf(c4461f.k()));
                            }
                            c4461f.c(d10);
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f30677j0 = Collections.unmodifiableList(this.f30677j0);
                    }
                    if (z11 & true) {
                        this.f30678k0 = Collections.unmodifiableList(this.f30678k0);
                    }
                    try {
                        j6.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f30674Z = c4459d.i();
                        throw th3;
                    }
                    this.f30674Z = c4459d.i();
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
        if (z11 & true) {
            this.f30677j0 = Collections.unmodifiableList(this.f30677j0);
        }
        if (z11 & true) {
            this.f30678k0 = Collections.unmodifiableList(this.f30678k0);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30674Z = c4459d.i();
            throw th4;
        }
        this.f30674Z = c4459d.i();
        k();
    }
}
