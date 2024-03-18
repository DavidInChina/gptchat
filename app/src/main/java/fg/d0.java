package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.io.IOException;
import lg.AbstractC4460e;
import lg.AbstractC4466k;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;

/* loaded from: classes2.dex */
public final class d0 extends lg.p {

    /* renamed from: p0  reason: collision with root package name */
    public static final d0 f30552p0;

    /* renamed from: q0  reason: collision with root package name */
    public static final C3033a f30553q0 = new C3033a(22);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30554Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f30555Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30556h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30557i0;

    /* renamed from: j0  reason: collision with root package name */
    public b0 f30558j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30559k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30560l0;

    /* renamed from: m0  reason: collision with root package name */
    public c0 f30561m0;

    /* renamed from: n0  reason: collision with root package name */
    public byte f30562n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f30563o0;

    static {
        d0 d0Var = new d0();
        f30552p0 = d0Var;
        d0Var.f30556h0 = 0;
        d0Var.f30557i0 = 0;
        d0Var.f30558j0 = b0.ERROR;
        d0Var.f30559k0 = 0;
        d0Var.f30560l0 = 0;
        d0Var.f30561m0 = c0.LANGUAGE_VERSION;
    }

    public d0() {
        this.f30562n0 = (byte) -1;
        this.f30563o0 = -1;
        this.f30554Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30563o0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30555Z & 1) == 1) {
            i10 = C4462g.b(1, this.f30556h0);
        } else {
            i10 = 0;
        }
        if ((this.f30555Z & 2) == 2) {
            i10 += C4462g.b(2, this.f30557i0);
        }
        if ((this.f30555Z & 4) == 4) {
            i10 += C4462g.a(3, this.f30558j0.f30514Y);
        }
        if ((this.f30555Z & 8) == 8) {
            i10 += C4462g.b(4, this.f30559k0);
        }
        if ((this.f30555Z & 16) == 16) {
            i10 += C4462g.b(5, this.f30560l0);
        }
        if ((this.f30555Z & 32) == 32) {
            i10 += C4462g.a(6, this.f30561m0.f30534Y);
        }
        int size = this.f30554Y.size() + i10;
        this.f30563o0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return a0.e();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        a0 e10 = a0.e();
        e10.f(this);
        return e10;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        if ((this.f30555Z & 1) == 1) {
            c4462g.m(1, this.f30556h0);
        }
        if ((this.f30555Z & 2) == 2) {
            c4462g.m(2, this.f30557i0);
        }
        if ((this.f30555Z & 4) == 4) {
            c4462g.l(3, this.f30558j0.f30514Y);
        }
        if ((this.f30555Z & 8) == 8) {
            c4462g.m(4, this.f30559k0);
        }
        if ((this.f30555Z & 16) == 16) {
            c4462g.m(5, this.f30560l0);
        }
        if ((this.f30555Z & 32) == 32) {
            c4462g.l(6, this.f30561m0.f30534Y);
        }
        c4462g.r(this.f30554Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30562n0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f30562n0 = (byte) 1;
        return true;
    }

    public d0(C4461f c4461f) {
        this.f30562n0 = (byte) -1;
        this.f30563o0 = -1;
        boolean z10 = false;
        this.f30556h0 = 0;
        this.f30557i0 = 0;
        b0 b0Var = b0.ERROR;
        this.f30558j0 = b0Var;
        this.f30559k0 = 0;
        this.f30560l0 = 0;
        c0 c0Var = c0.LANGUAGE_VERSION;
        this.f30561m0 = c0Var;
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = c4461f.n();
                        if (n10 != 0) {
                            if (n10 == 8) {
                                this.f30555Z |= 1;
                                this.f30556h0 = c4461f.k();
                            } else if (n10 != 16) {
                                c0 c0Var2 = null;
                                b0 b0Var2 = null;
                                if (n10 == 24) {
                                    int k10 = c4461f.k();
                                    if (k10 == 0) {
                                        b0Var2 = b0.WARNING;
                                    } else if (k10 == 1) {
                                        b0Var2 = b0Var;
                                    } else if (k10 == 2) {
                                        b0Var2 = b0.HIDDEN;
                                    }
                                    if (b0Var2 == null) {
                                        j6.v(n10);
                                        j6.v(k10);
                                    } else {
                                        this.f30555Z |= 4;
                                        this.f30558j0 = b0Var2;
                                    }
                                } else if (n10 == 32) {
                                    this.f30555Z |= 8;
                                    this.f30559k0 = c4461f.k();
                                } else if (n10 == 40) {
                                    this.f30555Z |= 16;
                                    this.f30560l0 = c4461f.k();
                                } else if (n10 != 48) {
                                    if (!c4461f.q(n10, j6)) {
                                    }
                                } else {
                                    int k11 = c4461f.k();
                                    if (k11 == 0) {
                                        c0Var2 = c0Var;
                                    } else if (k11 == 1) {
                                        c0Var2 = c0.COMPILER_VERSION;
                                    } else if (k11 == 2) {
                                        c0Var2 = c0.API_VERSION;
                                    }
                                    if (c0Var2 == null) {
                                        j6.v(n10);
                                        j6.v(k11);
                                    } else {
                                        this.f30555Z |= 32;
                                        this.f30561m0 = c0Var2;
                                    }
                                }
                            } else {
                                this.f30555Z |= 2;
                                this.f30557i0 = c4461f.k();
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
                    this.f30554Y = c4459d.i();
                    throw th3;
                }
                this.f30554Y = c4459d.i();
                throw th2;
            }
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30554Y = c4459d.i();
            throw th4;
        }
        this.f30554Y = c4459d.i();
    }

    public d0(AbstractC4466k abstractC4466k) {
        this.f30562n0 = (byte) -1;
        this.f30563o0 = -1;
        this.f30554Y = abstractC4466k.f38400Y;
    }
}
