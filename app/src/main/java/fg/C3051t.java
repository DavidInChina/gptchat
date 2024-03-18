package fg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import lg.AbstractC4456a;
import lg.AbstractC4460e;
import lg.AbstractC4467l;
import lg.AbstractC4468m;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;
import lg.C4464i;

/* renamed from: fg.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3051t extends AbstractC4468m {

    /* renamed from: l0  reason: collision with root package name */
    public static final C3051t f30717l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C3033a f30718m0 = new C3033a(7);

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4460e f30719Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30720h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30721i0;

    /* renamed from: j0  reason: collision with root package name */
    public byte f30722j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30723k0;

    static {
        C3051t c3051t = new C3051t();
        f30717l0 = c3051t;
        c3051t.f30721i0 = 0;
    }

    public C3051t(AbstractC4467l abstractC4467l) {
        super(abstractC4467l);
        this.f30722j0 = (byte) -1;
        this.f30723k0 = -1;
        this.f30719Z = abstractC4467l.f38400Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        int i11 = this.f30723k0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f30720h0 & 1) == 1) {
            i10 = C4462g.b(1, this.f30721i0);
        } else {
            i10 = 0;
        }
        int size = this.f30719Z.size() + h() + i10;
        this.f30723k0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return new AbstractC4467l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.glance.appwidget.protobuf.a, fg.s, lg.l] */
    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        ?? abstractC4467l = new AbstractC4467l();
        abstractC4467l.e(this);
        return abstractC4467l;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        a();
        B2.E l10 = l();
        if ((this.f30720h0 & 1) == 1) {
            c4462g.m(1, this.f30721i0);
        }
        l10.h(RCHTTPStatusCodes.SUCCESS, c4462g);
        c4462g.r(this.f30719Z);
    }

    @Override // lg.x
    public final AbstractC4456a getDefaultInstanceForType() {
        return f30717l0;
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f30722j0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!g()) {
            this.f30722j0 = (byte) 0;
            return false;
        }
        this.f30722j0 = (byte) 1;
        return true;
    }

    public C3051t() {
        this.f30722j0 = (byte) -1;
        this.f30723k0 = -1;
        this.f30719Z = AbstractC4460e.f38378Y;
    }

    public C3051t(C4461f c4461f, C4464i c4464i) {
        this.f30722j0 = (byte) -1;
        this.f30723k0 = -1;
        boolean z10 = false;
        this.f30721i0 = 0;
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = c4461f.n();
                        if (n10 != 0) {
                            if (n10 != 8) {
                                if (!m(c4461f, j6, c4464i, n10)) {
                                }
                            } else {
                                this.f30720h0 |= 1;
                                this.f30721i0 = c4461f.k();
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
                    this.f30719Z = c4459d.i();
                    throw th3;
                }
                this.f30719Z = c4459d.i();
                k();
                throw th2;
            }
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f30719Z = c4459d.i();
            throw th4;
        }
        this.f30719Z = c4459d.i();
        k();
    }
}
