package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.io.IOException;
import lg.AbstractC4460e;
import lg.AbstractC4466k;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;
import lg.C4464i;

/* renamed from: fg.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3037e extends lg.p {

    /* renamed from: l0  reason: collision with root package name */
    public static final C3037e f30564l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C3033a f30565m0 = new C3033a(1);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30566Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f30567Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30568h0;

    /* renamed from: i0  reason: collision with root package name */
    public C3036d f30569i0;

    /* renamed from: j0  reason: collision with root package name */
    public byte f30570j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30571k0;

    static {
        C3037e c3037e = new C3037e();
        f30564l0 = c3037e;
        c3037e.f30568h0 = 0;
        c3037e.f30569i0 = C3036d.f30535u0;
    }

    public C3037e() {
        this.f30570j0 = (byte) -1;
        this.f30571k0 = -1;
        this.f30566Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30571k0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30567Z & 1) == 1) {
            i10 = C4462g.b(1, this.f30568h0);
        } else {
            i10 = 0;
        }
        if ((this.f30567Z & 2) == 2) {
            i10 += C4462g.d(2, this.f30569i0);
        }
        int size = this.f30566Y.size() + i10;
        this.f30571k0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return new C3038f(2);
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3038f c3038f = new C3038f(2);
        c3038f.g(this);
        return c3038f;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        if ((this.f30567Z & 1) == 1) {
            c4462g.m(1, this.f30568h0);
        }
        if ((this.f30567Z & 2) == 2) {
            c4462g.o(2, this.f30569i0);
        }
        c4462g.r(this.f30566Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30570j0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f30567Z;
        if ((i10 & 1) == 1) {
            if ((i10 & 2) == 2) {
                if (!this.f30569i0.isInitialized()) {
                    this.f30570j0 = (byte) 0;
                    return false;
                }
                this.f30570j0 = (byte) 1;
                return true;
            }
            this.f30570j0 = (byte) 0;
            return false;
        }
        this.f30570j0 = (byte) 0;
        return false;
    }

    public C3037e(C4461f c4461f, C4464i c4464i) {
        C3034b c3034b;
        this.f30570j0 = (byte) -1;
        this.f30571k0 = -1;
        boolean z10 = false;
        this.f30568h0 = 0;
        this.f30569i0 = C3036d.f30535u0;
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = c4461f.n();
                        if (n10 != 0) {
                            if (n10 == 8) {
                                this.f30567Z |= 1;
                                this.f30568h0 = c4461f.k();
                            } else if (n10 != 18) {
                                if (!c4461f.q(n10, j6)) {
                                }
                            } else {
                                if ((this.f30567Z & 2) == 2) {
                                    C3036d c3036d = this.f30569i0;
                                    c3036d.getClass();
                                    c3034b = C3034b.e();
                                    c3034b.f(c3036d);
                                } else {
                                    c3034b = null;
                                }
                                C3036d c3036d2 = (C3036d) c4461f.g(C3036d.f30536v0, c4464i);
                                this.f30569i0 = c3036d2;
                                if (c3034b != null) {
                                    c3034b.f(c3036d2);
                                    this.f30569i0 = c3034b.d();
                                }
                                this.f30567Z |= 2;
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
                    this.f30566Y = c4459d.i();
                    throw th3;
                }
                this.f30566Y = c4459d.i();
                throw th2;
            }
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30566Y = c4459d.i();
            throw th4;
        }
        this.f30566Y = c4459d.i();
    }

    public C3037e(AbstractC4466k abstractC4466k) {
        this.f30570j0 = (byte) -1;
        this.f30571k0 = -1;
        this.f30566Y = abstractC4466k.f38400Y;
    }
}
