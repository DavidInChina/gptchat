package ig;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.C4461f;
import lg.C4464i;
import lg.p;
import lg.t;

/* renamed from: ig.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3575a extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f33158Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f33159h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33160i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f33161j0;

    public C3575a(int i10) {
        this.f33158Z = i10;
        if (i10 != 1) {
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        switch (this.f33158Z) {
            case 0:
                C3576b d10 = d();
                if (d10.isInitialized()) {
                    return d10;
                }
                throw new n0();
            default:
                C3577c e10 = e();
                if (e10.isInitialized()) {
                    return e10;
                }
                throw new n0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC2041a b(C4461f c4461f, C4464i c4464i) {
        Throwable th2;
        Throwable th3;
        C3577c c3577c = null;
        C3576b c3576b = null;
        try {
            switch (this.f33158Z) {
                case 0:
                    try {
                        try {
                            f((C3576b) C3576b.f33163m0.b(c4461f, c4464i));
                            return this;
                        } catch (t e10) {
                            C3576b c3576b2 = (C3576b) e10.f38415Y;
                            try {
                                throw e10;
                            } catch (Throwable th4) {
                                th3 = th4;
                                c3576b = c3576b2;
                                if (c3576b != null) {
                                    f(c3576b);
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        th3 = th5;
                        if (c3576b != null) {
                        }
                        throw th3;
                    }
                default:
                    try {
                        g((C3577c) C3577c.f33171m0.b(c4461f, c4464i));
                        return this;
                    } catch (t e11) {
                        C3577c c3577c2 = (C3577c) e11.f38415Y;
                        try {
                            throw e11;
                        } catch (Throwable th6) {
                            th2 = th6;
                            c3577c = c3577c2;
                            if (c3577c != null) {
                                g(c3577c);
                            }
                            throw th2;
                        }
                    }
            }
        } catch (Throwable th7) {
            th2 = th7;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(p pVar) {
        switch (this.f33158Z) {
            case 0:
                f((C3576b) pVar);
                return this;
            default:
                g((C3577c) pVar);
                return this;
        }
    }

    public final Object clone() {
        switch (this.f33158Z) {
            case 0:
                C3575a c3575a = new C3575a(0);
                c3575a.f(d());
                return c3575a;
            default:
                C3575a c3575a2 = new C3575a(1);
                c3575a2.g(e());
                return c3575a2;
        }
    }

    public final C3576b d() {
        C3576b c3576b = new C3576b(this);
        int i10 = this.f33159h0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        c3576b.f33166h0 = this.f33160i0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c3576b.f33167i0 = this.f33161j0;
        c3576b.f33165Z = i11;
        return c3576b;
    }

    public final C3577c e() {
        C3577c c3577c = new C3577c(this);
        int i10 = this.f33159h0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        c3577c.f33174h0 = this.f33160i0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c3577c.f33175i0 = this.f33161j0;
        c3577c.f33173Z = i11;
        return c3577c;
    }

    public final void f(C3576b c3576b) {
        if (c3576b == C3576b.f33162l0) {
            return;
        }
        int i10 = c3576b.f33165Z;
        if ((i10 & 1) == 1) {
            int i11 = c3576b.f33166h0;
            this.f33159h0 = 1 | this.f33159h0;
            this.f33160i0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = c3576b.f33167i0;
            this.f33159h0 = 2 | this.f33159h0;
            this.f33161j0 = i12;
        }
        this.f38400Y = this.f38400Y.r(c3576b.f33164Y);
    }

    public final void g(C3577c c3577c) {
        if (c3577c == C3577c.f33170l0) {
            return;
        }
        int i10 = c3577c.f33173Z;
        if ((i10 & 1) == 1) {
            int i11 = c3577c.f33174h0;
            this.f33159h0 = 1 | this.f33159h0;
            this.f33160i0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = c3577c.f33175i0;
            this.f33159h0 = 2 | this.f33159h0;
            this.f33161j0 = i12;
        }
        this.f38400Y = this.f38400Y.r(c3577c.f33172Y);
    }
}
