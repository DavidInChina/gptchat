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

/* renamed from: ig.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3577c extends p {

    /* renamed from: l0  reason: collision with root package name */
    public static final C3577c f33170l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C3033a f33171m0 = new C3033a(25);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f33172Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f33173Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f33174h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33175i0;

    /* renamed from: j0  reason: collision with root package name */
    public byte f33176j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f33177k0;

    static {
        C3577c c3577c = new C3577c();
        f33170l0 = c3577c;
        c3577c.f33174h0 = 0;
        c3577c.f33175i0 = 0;
    }

    public C3577c() {
        this.f33176j0 = (byte) -1;
        this.f33177k0 = -1;
        this.f33172Y = AbstractC4460e.f38378Y;
    }

    public static C3575a g(C3577c c3577c) {
        C3575a c3575a = new C3575a(1);
        c3575a.g(c3577c);
        return c3575a;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f33177k0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f33173Z & 1) == 1) {
            i10 = C4462g.b(1, this.f33174h0);
        } else {
            i10 = 0;
        }
        if ((this.f33173Z & 2) == 2) {
            i10 += C4462g.b(2, this.f33175i0);
        }
        int size = this.f33172Y.size() + i10;
        this.f33177k0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return new C3575a(1);
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        return g(this);
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        if ((this.f33173Z & 1) == 1) {
            c4462g.m(1, this.f33174h0);
        }
        if ((this.f33173Z & 2) == 2) {
            c4462g.m(2, this.f33175i0);
        }
        c4462g.r(this.f33172Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f33176j0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f33176j0 = (byte) 1;
        return true;
    }

    public C3577c(C4461f c4461f) {
        this.f33176j0 = (byte) -1;
        this.f33177k0 = -1;
        boolean z10 = false;
        this.f33174h0 = 0;
        this.f33175i0 = 0;
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        while (!z10) {
            try {
                try {
                    int n10 = c4461f.n();
                    if (n10 != 0) {
                        if (n10 == 8) {
                            this.f33173Z |= 1;
                            this.f33174h0 = c4461f.k();
                        } else if (n10 != 16) {
                            if (!c4461f.q(n10, j6)) {
                            }
                        } else {
                            this.f33173Z |= 2;
                            this.f33175i0 = c4461f.k();
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
                    this.f33172Y = c4459d.i();
                    throw th3;
                }
                this.f33172Y = c4459d.i();
                throw th2;
            }
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f33172Y = c4459d.i();
            throw th4;
        }
        this.f33172Y = c4459d.i();
    }

    public C3577c(AbstractC4466k abstractC4466k) {
        this.f33176j0 = (byte) -1;
        this.f33177k0 = -1;
        this.f33172Y = abstractC4466k.f38400Y;
    }
}
