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
public final class K extends lg.p {

    /* renamed from: j0  reason: collision with root package name */
    public static final K f30347j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final C3033a f30348k0 = new C3033a(13);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30349Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f30350Z;

    /* renamed from: h0  reason: collision with root package name */
    public byte f30351h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30352i0;

    static {
        K k10 = new K();
        f30347j0 = k10;
        k10.f30350Z = Collections.emptyList();
    }

    public K() {
        this.f30351h0 = (byte) -1;
        this.f30352i0 = -1;
        this.f30349Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10 = this.f30352i0;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f30350Z.size(); i12++) {
            i11 += C4462g.d(1, (AbstractC4456a) this.f30350Z.get(i12));
        }
        int size = this.f30349Y.size() + i11;
        this.f30352i0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return new C3045m(1);
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3045m c3045m = new C3045m(1);
        c3045m.i(this);
        return c3045m;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        for (int i10 = 0; i10 < this.f30350Z.size(); i10++) {
            c4462g.o(1, (AbstractC4456a) this.f30350Z.get(i10));
        }
        c4462g.r(this.f30349Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30351h0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f30350Z.size(); i10++) {
            if (!((J) this.f30350Z.get(i10)).isInitialized()) {
                this.f30351h0 = (byte) 0;
                return false;
            }
        }
        this.f30351h0 = (byte) 1;
        return true;
    }

    public K(C4461f c4461f, C4464i c4464i) {
        this.f30351h0 = (byte) -1;
        this.f30352i0 = -1;
        this.f30350Z = Collections.emptyList();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = c4461f.n();
                    if (n10 != 0) {
                        if (n10 != 10) {
                            if (!c4461f.q(n10, j6)) {
                            }
                        } else {
                            if (!(z11 & true)) {
                                this.f30350Z = new ArrayList();
                                z11 = true;
                            }
                            this.f30350Z.add(c4461f.g(J.f30339n0, c4464i));
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f30350Z = Collections.unmodifiableList(this.f30350Z);
                    }
                    try {
                        j6.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f30349Y = c4459d.i();
                        throw th3;
                    }
                    this.f30349Y = c4459d.i();
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
            this.f30350Z = Collections.unmodifiableList(this.f30350Z);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30349Y = c4459d.i();
            throw th4;
        }
        this.f30349Y = c4459d.i();
    }

    public K(AbstractC4466k abstractC4466k) {
        this.f30351h0 = (byte) -1;
        this.f30352i0 = -1;
        this.f30349Y = abstractC4466k.f38400Y;
    }
}
