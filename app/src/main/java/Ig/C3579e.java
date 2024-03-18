package ig;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import fg.C3033a;
import java.io.IOException;
import lg.AbstractC4460e;
import lg.AbstractC4466k;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;
import lg.C4464i;
import lg.p;
import lg.t;

/* renamed from: ig.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3579e extends p {

    /* renamed from: o0  reason: collision with root package name */
    public static final C3579e f33184o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final C3033a f33185p0 = new C3033a(26);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f33186Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f33187Z;

    /* renamed from: h0  reason: collision with root package name */
    public C3576b f33188h0;

    /* renamed from: i0  reason: collision with root package name */
    public C3577c f33189i0;

    /* renamed from: j0  reason: collision with root package name */
    public C3577c f33190j0;

    /* renamed from: k0  reason: collision with root package name */
    public C3577c f33191k0;

    /* renamed from: l0  reason: collision with root package name */
    public C3577c f33192l0;

    /* renamed from: m0  reason: collision with root package name */
    public byte f33193m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f33194n0;

    static {
        C3579e c3579e = new C3579e();
        f33184o0 = c3579e;
        c3579e.f33188h0 = C3576b.f33162l0;
        C3577c c3577c = C3577c.f33170l0;
        c3579e.f33189i0 = c3577c;
        c3579e.f33190j0 = c3577c;
        c3579e.f33191k0 = c3577c;
        c3579e.f33192l0 = c3577c;
    }

    public C3579e() {
        this.f33193m0 = (byte) -1;
        this.f33194n0 = -1;
        this.f33186Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f33194n0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f33187Z & 1) == 1) {
            i10 = C4462g.d(1, this.f33188h0);
        } else {
            i10 = 0;
        }
        if ((this.f33187Z & 2) == 2) {
            i10 += C4462g.d(2, this.f33189i0);
        }
        if ((this.f33187Z & 4) == 4) {
            i10 += C4462g.d(3, this.f33190j0);
        }
        if ((this.f33187Z & 8) == 8) {
            i10 += C4462g.d(4, this.f33191k0);
        }
        if ((this.f33187Z & 16) == 16) {
            i10 += C4462g.d(5, this.f33192l0);
        }
        int size = this.f33186Y.size() + i10;
        this.f33194n0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return C3578d.e();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3578d e10 = C3578d.e();
        e10.f(this);
        return e10;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        if ((this.f33187Z & 1) == 1) {
            c4462g.o(1, this.f33188h0);
        }
        if ((this.f33187Z & 2) == 2) {
            c4462g.o(2, this.f33189i0);
        }
        if ((this.f33187Z & 4) == 4) {
            c4462g.o(3, this.f33190j0);
        }
        if ((this.f33187Z & 8) == 8) {
            c4462g.o(4, this.f33191k0);
        }
        if ((this.f33187Z & 16) == 16) {
            c4462g.o(5, this.f33192l0);
        }
        c4462g.r(this.f33186Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f33193m0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f33193m0 = (byte) 1;
        return true;
    }

    public C3579e(C4461f c4461f, C4464i c4464i) {
        this.f33193m0 = (byte) -1;
        this.f33194n0 = -1;
        this.f33188h0 = C3576b.f33162l0;
        C3577c c3577c = C3577c.f33170l0;
        this.f33189i0 = c3577c;
        this.f33190j0 = c3577c;
        this.f33191k0 = c3577c;
        this.f33192l0 = c3577c;
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = c4461f.n();
                        if (n10 != 0) {
                            C3575a c3575a = null;
                            if (n10 == 10) {
                                if ((this.f33187Z & 1) == 1) {
                                    C3576b c3576b = this.f33188h0;
                                    c3576b.getClass();
                                    c3575a = new C3575a(0);
                                    c3575a.f(c3576b);
                                }
                                C3576b c3576b2 = (C3576b) c4461f.g(C3576b.f33163m0, c4464i);
                                this.f33188h0 = c3576b2;
                                if (c3575a != null) {
                                    c3575a.f(c3576b2);
                                    this.f33188h0 = c3575a.d();
                                }
                                this.f33187Z |= 1;
                            } else if (n10 == 18) {
                                if ((this.f33187Z & 2) == 2) {
                                    C3577c c3577c2 = this.f33189i0;
                                    c3577c2.getClass();
                                    c3575a = C3577c.g(c3577c2);
                                }
                                C3577c c3577c3 = (C3577c) c4461f.g(C3577c.f33171m0, c4464i);
                                this.f33189i0 = c3577c3;
                                if (c3575a != null) {
                                    c3575a.g(c3577c3);
                                    this.f33189i0 = c3575a.e();
                                }
                                this.f33187Z |= 2;
                            } else if (n10 == 26) {
                                if ((this.f33187Z & 4) == 4) {
                                    C3577c c3577c4 = this.f33190j0;
                                    c3577c4.getClass();
                                    c3575a = C3577c.g(c3577c4);
                                }
                                C3577c c3577c5 = (C3577c) c4461f.g(C3577c.f33171m0, c4464i);
                                this.f33190j0 = c3577c5;
                                if (c3575a != null) {
                                    c3575a.g(c3577c5);
                                    this.f33190j0 = c3575a.e();
                                }
                                this.f33187Z |= 4;
                            } else if (n10 == 34) {
                                if ((this.f33187Z & 8) == 8) {
                                    C3577c c3577c6 = this.f33191k0;
                                    c3577c6.getClass();
                                    c3575a = C3577c.g(c3577c6);
                                }
                                C3577c c3577c7 = (C3577c) c4461f.g(C3577c.f33171m0, c4464i);
                                this.f33191k0 = c3577c7;
                                if (c3575a != null) {
                                    c3575a.g(c3577c7);
                                    this.f33191k0 = c3575a.e();
                                }
                                this.f33187Z |= 8;
                            } else if (n10 != 42) {
                                if (!c4461f.q(n10, j6)) {
                                }
                            } else {
                                if ((this.f33187Z & 16) == 16) {
                                    C3577c c3577c8 = this.f33192l0;
                                    c3577c8.getClass();
                                    c3575a = C3577c.g(c3577c8);
                                }
                                C3577c c3577c9 = (C3577c) c4461f.g(C3577c.f33171m0, c4464i);
                                this.f33192l0 = c3577c9;
                                if (c3575a != null) {
                                    c3575a.g(c3577c9);
                                    this.f33192l0 = c3575a.e();
                                }
                                this.f33187Z |= 16;
                            }
                        }
                        z10 = true;
                    } catch (t e10) {
                        e10.f38415Y = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    t tVar = new t(e11.getMessage());
                    tVar.f38415Y = this;
                    throw tVar;
                }
            } catch (Throwable th2) {
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f33186Y = c4459d.i();
                    throw th3;
                }
                this.f33186Y = c4459d.i();
                throw th2;
            }
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f33186Y = c4459d.i();
            throw th4;
        }
        this.f33186Y = c4459d.i();
    }

    public C3579e(AbstractC4466k abstractC4466k) {
        this.f33193m0 = (byte) -1;
        this.f33194n0 = -1;
        this.f33186Y = abstractC4466k.f38400Y;
    }
}
