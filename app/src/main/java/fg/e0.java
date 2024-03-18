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

/* loaded from: classes2.dex */
public final class e0 extends lg.p {

    /* renamed from: j0  reason: collision with root package name */
    public static final e0 f30572j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final C3033a f30573k0 = new C3033a(23);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30574Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f30575Z;

    /* renamed from: h0  reason: collision with root package name */
    public byte f30576h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30577i0;

    static {
        e0 e0Var = new e0();
        f30572j0 = e0Var;
        e0Var.f30575Z = Collections.emptyList();
    }

    public e0() {
        this.f30576h0 = (byte) -1;
        this.f30577i0 = -1;
        this.f30574Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10 = this.f30577i0;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f30575Z.size(); i12++) {
            i11 += C4462g.d(1, (AbstractC4456a) this.f30575Z.get(i12));
        }
        int size = this.f30574Y.size() + i11;
        this.f30577i0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return new C3045m(2);
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3045m c3045m = new C3045m(2);
        c3045m.k(this);
        return c3045m;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        for (int i10 = 0; i10 < this.f30575Z.size(); i10++) {
            c4462g.o(1, (AbstractC4456a) this.f30575Z.get(i10));
        }
        c4462g.r(this.f30574Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30576h0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f30576h0 = (byte) 1;
        return true;
    }

    public e0(C4461f c4461f, C4464i c4464i) {
        this.f30576h0 = (byte) -1;
        this.f30577i0 = -1;
        this.f30575Z = Collections.emptyList();
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
                                this.f30575Z = new ArrayList();
                                z11 = true;
                            }
                            this.f30575Z.add(c4461f.g(d0.f30553q0, c4464i));
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f30575Z = Collections.unmodifiableList(this.f30575Z);
                    }
                    try {
                        j6.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f30574Y = c4459d.i();
                        throw th3;
                    }
                    this.f30574Y = c4459d.i();
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
            this.f30575Z = Collections.unmodifiableList(this.f30575Z);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30574Y = c4459d.i();
            throw th4;
        }
        this.f30574Y = c4459d.i();
    }

    public e0(AbstractC4466k abstractC4466k) {
        this.f30576h0 = (byte) -1;
        this.f30577i0 = -1;
        this.f30574Y = abstractC4466k.f38400Y;
    }
}
