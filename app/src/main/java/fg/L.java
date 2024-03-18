package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.io.IOException;
import lg.AbstractC4460e;
import lg.AbstractC4466k;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;

/* loaded from: classes.dex */
public final class L extends lg.p {

    /* renamed from: j0  reason: collision with root package name */
    public static final L f30353j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final C3033a f30354k0 = new C3033a(15);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f30355Y;

    /* renamed from: Z  reason: collision with root package name */
    public lg.v f30356Z;

    /* renamed from: h0  reason: collision with root package name */
    public byte f30357h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30358i0;

    static {
        L l10 = new L();
        f30353j0 = l10;
        l10.f30356Z = lg.u.f38416Z;
    }

    public L() {
        this.f30357h0 = (byte) -1;
        this.f30358i0 = -1;
        this.f30355Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10 = this.f30358i0;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f30356Z.size(); i12++) {
            AbstractC4460e G02 = this.f30356Z.G0(i12);
            i11 += G02.size() + C4462g.f(G02.size());
        }
        int size = this.f30355Y.size() + this.f30356Z.size() + i11;
        this.f30358i0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return new C3045m(3);
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3045m c3045m = new C3045m(3);
        c3045m.j(this);
        return c3045m;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        for (int i10 = 0; i10 < this.f30356Z.size(); i10++) {
            AbstractC4460e G02 = this.f30356Z.G0(i10);
            c4462g.x(1, 2);
            c4462g.v(G02.size());
            c4462g.r(G02);
        }
        c4462g.r(this.f30355Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30357h0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f30357h0 = (byte) 1;
        return true;
    }

    public L(C4461f c4461f) {
        this.f30357h0 = (byte) -1;
        this.f30358i0 = -1;
        this.f30356Z = lg.u.f38416Z;
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
                            lg.w e10 = c4461f.e();
                            if (!(z11 & true)) {
                                this.f30356Z = new lg.u();
                                z11 = true;
                            }
                            this.f30356Z.w(e10);
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f30356Z = this.f30356Z.e();
                    }
                    try {
                        j6.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f30355Y = c4459d.i();
                        throw th3;
                    }
                    this.f30355Y = c4459d.i();
                    throw th2;
                }
            } catch (lg.t e11) {
                e11.f38415Y = this;
                throw e11;
            } catch (IOException e12) {
                lg.t tVar = new lg.t(e12.getMessage());
                tVar.f38415Y = this;
                throw tVar;
            }
        }
        if (z11 & true) {
            this.f30356Z = this.f30356Z.e();
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30355Y = c4459d.i();
            throw th4;
        }
        this.f30355Y = c4459d.i();
    }

    public L(AbstractC4466k abstractC4466k) {
        this.f30357h0 = (byte) -1;
        this.f30358i0 = -1;
        this.f30355Y = abstractC4466k.f38400Y;
    }
}
