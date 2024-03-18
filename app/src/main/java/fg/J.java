package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.io.IOException;
import lg.AbstractC4460e;
import lg.AbstractC4466k;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;

/* loaded from: classes.dex */
public final class J extends lg.p {

    /* renamed from: m0  reason: collision with root package name */
    public static final J f30338m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final C3033a f30339n0 = new C3033a(14);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30340Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f30341Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30342h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30343i0;

    /* renamed from: j0  reason: collision with root package name */
    public I f30344j0;

    /* renamed from: k0  reason: collision with root package name */
    public byte f30345k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30346l0;

    static {
        J j6 = new J();
        f30338m0 = j6;
        j6.f30342h0 = -1;
        j6.f30343i0 = 0;
        j6.f30344j0 = I.PACKAGE;
    }

    public J() {
        this.f30345k0 = (byte) -1;
        this.f30346l0 = -1;
        this.f30340Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30346l0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30341Z & 1) == 1) {
            i10 = C4462g.b(1, this.f30342h0);
        } else {
            i10 = 0;
        }
        if ((this.f30341Z & 2) == 2) {
            i10 += C4462g.b(2, this.f30343i0);
        }
        if ((this.f30341Z & 4) == 4) {
            i10 += C4462g.a(3, this.f30344j0.f30337Y);
        }
        int size = this.f30340Y.size() + i10;
        this.f30346l0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return H.e();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        H e10 = H.e();
        e10.f(this);
        return e10;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        if ((this.f30341Z & 1) == 1) {
            c4462g.m(1, this.f30342h0);
        }
        if ((this.f30341Z & 2) == 2) {
            c4462g.m(2, this.f30343i0);
        }
        if ((this.f30341Z & 4) == 4) {
            c4462g.l(3, this.f30344j0.f30337Y);
        }
        c4462g.r(this.f30340Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30345k0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f30341Z & 2) == 2) {
            this.f30345k0 = (byte) 1;
            return true;
        }
        this.f30345k0 = (byte) 0;
        return false;
    }

    public J(C4461f c4461f) {
        I i10;
        this.f30345k0 = (byte) -1;
        this.f30346l0 = -1;
        this.f30342h0 = -1;
        boolean z10 = false;
        this.f30343i0 = 0;
        I i11 = I.PACKAGE;
        this.f30344j0 = i11;
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = c4461f.n();
                        if (n10 != 0) {
                            if (n10 == 8) {
                                this.f30341Z |= 1;
                                this.f30342h0 = c4461f.k();
                            } else if (n10 == 16) {
                                this.f30341Z |= 2;
                                this.f30343i0 = c4461f.k();
                            } else if (n10 != 24) {
                                if (!c4461f.q(n10, j6)) {
                                }
                            } else {
                                int k10 = c4461f.k();
                                if (k10 == 0) {
                                    i10 = I.CLASS;
                                } else if (k10 != 1) {
                                    i10 = k10 != 2 ? null : I.LOCAL;
                                } else {
                                    i10 = i11;
                                }
                                if (i10 == null) {
                                    j6.v(n10);
                                    j6.v(k10);
                                } else {
                                    this.f30341Z |= 4;
                                    this.f30344j0 = i10;
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
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f30340Y = c4459d.i();
                    throw th3;
                }
                this.f30340Y = c4459d.i();
                throw th2;
            }
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30340Y = c4459d.i();
            throw th4;
        }
        this.f30340Y = c4459d.i();
    }

    public J(AbstractC4466k abstractC4466k) {
        this.f30345k0 = (byte) -1;
        this.f30346l0 = -1;
        this.f30340Y = abstractC4466k.f38400Y;
    }
}
