package ig;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import fg.C3033a;
import java.io.IOException;
import lg.AbstractC4460e;
import lg.AbstractC4466k;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;
import lg.p;
import lg.t;

/* renamed from: ig.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3576b extends p {

    /* renamed from: l0  reason: collision with root package name */
    public static final C3576b f33162l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C3033a f33163m0 = new C3033a(24);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f33164Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f33165Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f33166h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33167i0;

    /* renamed from: j0  reason: collision with root package name */
    public byte f33168j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f33169k0;

    static {
        C3576b c3576b = new C3576b();
        f33162l0 = c3576b;
        c3576b.f33166h0 = 0;
        c3576b.f33167i0 = 0;
    }

    public C3576b() {
        this.f33168j0 = (byte) -1;
        this.f33169k0 = -1;
        this.f33164Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f33169k0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f33165Z & 1) == 1) {
            i10 = C4462g.b(1, this.f33166h0);
        } else {
            i10 = 0;
        }
        if ((this.f33165Z & 2) == 2) {
            i10 += C4462g.b(2, this.f33167i0);
        }
        int size = this.f33164Y.size() + i10;
        this.f33169k0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return new C3575a(0);
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3575a c3575a = new C3575a(0);
        c3575a.f(this);
        return c3575a;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        if ((this.f33165Z & 1) == 1) {
            c4462g.m(1, this.f33166h0);
        }
        if ((this.f33165Z & 2) == 2) {
            c4462g.m(2, this.f33167i0);
        }
        c4462g.r(this.f33164Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f33168j0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f33168j0 = (byte) 1;
        return true;
    }

    public C3576b(C4461f c4461f) {
        this.f33168j0 = (byte) -1;
        this.f33169k0 = -1;
        boolean z10 = false;
        this.f33166h0 = 0;
        this.f33167i0 = 0;
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        while (!z10) {
            try {
                try {
                    int n10 = c4461f.n();
                    if (n10 != 0) {
                        if (n10 == 8) {
                            this.f33165Z |= 1;
                            this.f33166h0 = c4461f.k();
                        } else if (n10 != 16) {
                            if (!c4461f.q(n10, j6)) {
                            }
                        } else {
                            this.f33165Z |= 2;
                            this.f33167i0 = c4461f.k();
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
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f33164Y = c4459d.i();
                    throw th3;
                }
                this.f33164Y = c4459d.i();
                throw th2;
            }
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f33164Y = c4459d.i();
            throw th4;
        }
        this.f33164Y = c4459d.i();
    }

    public C3576b(AbstractC4466k abstractC4466k) {
        this.f33168j0 = (byte) -1;
        this.f33169k0 = -1;
        this.f33164Y = abstractC4466k.f38400Y;
    }
}
