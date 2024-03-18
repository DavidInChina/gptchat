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

/* renamed from: fg.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3039g extends lg.p {

    /* renamed from: l0  reason: collision with root package name */
    public static final C3039g f30590l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C3033a f30591m0 = new C3033a(0);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30592Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f30593Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30594h0;

    /* renamed from: i0  reason: collision with root package name */
    public List f30595i0;

    /* renamed from: j0  reason: collision with root package name */
    public byte f30596j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30597k0;

    static {
        C3039g c3039g = new C3039g();
        f30590l0 = c3039g;
        c3039g.f30594h0 = 0;
        c3039g.f30595i0 = Collections.emptyList();
    }

    public C3039g() {
        this.f30596j0 = (byte) -1;
        this.f30597k0 = -1;
        this.f30592Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30597k0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30593Z & 1) == 1) {
            i10 = C4462g.b(1, this.f30594h0);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < this.f30595i0.size(); i12++) {
            i10 += C4462g.d(2, (AbstractC4456a) this.f30595i0.get(i12));
        }
        int size = this.f30592Y.size() + i10;
        this.f30597k0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return new C3038f(0);
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3038f c3038f = new C3038f(0);
        c3038f.h(this);
        return c3038f;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        if ((this.f30593Z & 1) == 1) {
            c4462g.m(1, this.f30594h0);
        }
        for (int i10 = 0; i10 < this.f30595i0.size(); i10++) {
            c4462g.o(2, (AbstractC4456a) this.f30595i0.get(i10));
        }
        c4462g.r(this.f30592Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30596j0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f30593Z & 1) == 1) {
            for (int i10 = 0; i10 < this.f30595i0.size(); i10++) {
                if (!((C3037e) this.f30595i0.get(i10)).isInitialized()) {
                    this.f30596j0 = (byte) 0;
                    return false;
                }
            }
            this.f30596j0 = (byte) 1;
            return true;
        }
        this.f30596j0 = (byte) 0;
        return false;
    }

    public C3039g(C4461f c4461f, C4464i c4464i) {
        this.f30596j0 = (byte) -1;
        this.f30597k0 = -1;
        boolean z10 = false;
        this.f30594h0 = 0;
        this.f30595i0 = Collections.emptyList();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = c4461f.n();
                        if (n10 != 0) {
                            if (n10 == 8) {
                                this.f30593Z |= 1;
                                this.f30594h0 = c4461f.k();
                            } else if (n10 != 18) {
                                if (!c4461f.q(n10, j6)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.f30595i0 = new ArrayList();
                                    z11 = true;
                                }
                                this.f30595i0.add(c4461f.g(C3037e.f30565m0, c4464i));
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
                    this.f30595i0 = Collections.unmodifiableList(this.f30595i0);
                }
                try {
                    j6.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f30592Y = c4459d.i();
                    throw th3;
                }
                this.f30592Y = c4459d.i();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f30595i0 = Collections.unmodifiableList(this.f30595i0);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30592Y = c4459d.i();
            throw th4;
        }
        this.f30592Y = c4459d.i();
    }

    public C3039g(AbstractC4466k abstractC4466k) {
        this.f30596j0 = (byte) -1;
        this.f30597k0 = -1;
        this.f30592Y = abstractC4466k.f38400Y;
    }
}
