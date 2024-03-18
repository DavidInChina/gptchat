package fg;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.C4461f;
import lg.C4464i;

/* renamed from: fg.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3038f extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f30578Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30579h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f30580i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30581j0;

    public C3038f(int i10) {
        this.f30578Z = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                this.f30580i0 = Collections.emptyList();
                return;
            } else {
                this.f30580i0 = C3036d.f30535u0;
                return;
            }
        }
        this.f30580i0 = Collections.emptyList();
        this.f30581j0 = -1;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        switch (this.f30578Z) {
            case 0:
                C3039g e10 = e();
                if (e10.isInitialized()) {
                    return e10;
                }
                throw new n0();
            case 1:
                X f6 = f();
                if (f6.isInitialized()) {
                    return f6;
                }
                throw new n0();
            default:
                C3037e d10 = d();
                if (d10.isInitialized()) {
                    return d10;
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
        Throwable th4;
        C3039g c3039g = null;
        X x10 = null;
        C3037e c3037e = null;
        try {
            try {
                switch (this.f30578Z) {
                    case 0:
                        try {
                            h((C3039g) C3039g.f30591m0.b(c4461f, c4464i));
                            return this;
                        } catch (lg.t e10) {
                            C3039g c3039g2 = (C3039g) e10.f38415Y;
                            try {
                                throw e10;
                            } catch (Throwable th5) {
                                th2 = th5;
                                c3039g = c3039g2;
                                if (c3039g != null) {
                                    h(c3039g);
                                }
                                throw th2;
                            }
                        }
                    case 1:
                        try {
                            try {
                                i((X) X.f30464m0.b(c4461f, c4464i));
                                return this;
                            } catch (lg.t e11) {
                                X x11 = (X) e11.f38415Y;
                                try {
                                    throw e11;
                                } catch (Throwable th6) {
                                    th4 = th6;
                                    x10 = x11;
                                    if (x10 != null) {
                                        i(x10);
                                    }
                                    throw th4;
                                }
                            }
                        } catch (Throwable th7) {
                            th4 = th7;
                            if (x10 != null) {
                            }
                            throw th4;
                        }
                    default:
                        try {
                            g((C3037e) C3037e.f30565m0.b(c4461f, c4464i));
                            return this;
                        } catch (lg.t e12) {
                            C3037e c3037e2 = (C3037e) e12.f38415Y;
                            try {
                                throw e12;
                            } catch (Throwable th8) {
                                th3 = th8;
                                c3037e = c3037e2;
                                if (c3037e != null) {
                                    g(c3037e);
                                }
                                throw th3;
                            }
                        }
                }
            } catch (Throwable th9) {
                th3 = th9;
            }
        } catch (Throwable th10) {
            th2 = th10;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        switch (this.f30578Z) {
            case 0:
                h((C3039g) pVar);
                return this;
            case 1:
                i((X) pVar);
                return this;
            default:
                g((C3037e) pVar);
                return this;
        }
    }

    public final Object clone() {
        switch (this.f30578Z) {
            case 0:
                C3038f c3038f = new C3038f(0);
                c3038f.h(e());
                return c3038f;
            case 1:
                C3038f c3038f2 = new C3038f(1);
                c3038f2.i(f());
                return c3038f2;
            default:
                C3038f c3038f3 = new C3038f(2);
                c3038f3.g(d());
                return c3038f3;
        }
    }

    public final C3037e d() {
        C3037e c3037e = new C3037e(this);
        int i10 = this.f30579h0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        c3037e.f30568h0 = this.f30581j0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c3037e.f30569i0 = (C3036d) this.f30580i0;
        c3037e.f30567Z = i11;
        return c3037e;
    }

    public final C3039g e() {
        C3039g c3039g = new C3039g(this);
        int i10 = this.f30579h0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        c3039g.f30594h0 = this.f30581j0;
        if ((i10 & 2) == 2) {
            this.f30580i0 = Collections.unmodifiableList((List) this.f30580i0);
            this.f30579h0 &= -3;
        }
        c3039g.f30595i0 = (List) this.f30580i0;
        c3039g.f30593Z = i11;
        return c3039g;
    }

    public final X f() {
        X x10 = new X(this);
        int i10 = this.f30579h0;
        int i11 = 1;
        if ((i10 & 1) == 1) {
            this.f30580i0 = Collections.unmodifiableList((List) this.f30580i0);
            this.f30579h0 &= -2;
        }
        x10.f30467h0 = (List) this.f30580i0;
        if ((i10 & 2) != 2) {
            i11 = 0;
        }
        x10.f30468i0 = this.f30581j0;
        x10.f30466Z = i11;
        return x10;
    }

    public final void g(C3037e c3037e) {
        C3036d c3036d;
        if (c3037e == C3037e.f30564l0) {
            return;
        }
        int i10 = c3037e.f30567Z;
        if ((i10 & 1) == 1) {
            int i11 = c3037e.f30568h0;
            this.f30579h0 = 1 | this.f30579h0;
            this.f30581j0 = i11;
        }
        if ((i10 & 2) == 2) {
            C3036d c3036d2 = c3037e.f30569i0;
            if ((this.f30579h0 & 2) == 2 && (c3036d = (C3036d) this.f30580i0) != C3036d.f30535u0) {
                C3034b e10 = C3034b.e();
                e10.f(c3036d);
                e10.f(c3036d2);
                this.f30580i0 = e10.d();
            } else {
                this.f30580i0 = c3036d2;
            }
            this.f30579h0 |= 2;
        }
        this.f38400Y = this.f38400Y.r(c3037e.f30566Y);
    }

    public final void h(C3039g c3039g) {
        if (c3039g == C3039g.f30590l0) {
            return;
        }
        if ((c3039g.f30593Z & 1) == 1) {
            int i10 = c3039g.f30594h0;
            this.f30579h0 = 1 | this.f30579h0;
            this.f30581j0 = i10;
        }
        if (!c3039g.f30595i0.isEmpty()) {
            if (((List) this.f30580i0).isEmpty()) {
                this.f30580i0 = c3039g.f30595i0;
                this.f30579h0 &= -3;
            } else {
                if ((this.f30579h0 & 2) != 2) {
                    this.f30580i0 = new ArrayList((List) this.f30580i0);
                    this.f30579h0 |= 2;
                }
                ((List) this.f30580i0).addAll(c3039g.f30595i0);
            }
        }
        this.f38400Y = this.f38400Y.r(c3039g.f30592Y);
    }

    public final void i(X x10) {
        if (x10 == X.f30463l0) {
            return;
        }
        if (!x10.f30467h0.isEmpty()) {
            if (((List) this.f30580i0).isEmpty()) {
                this.f30580i0 = x10.f30467h0;
                this.f30579h0 &= -2;
            } else {
                if ((this.f30579h0 & 1) != 1) {
                    this.f30580i0 = new ArrayList((List) this.f30580i0);
                    this.f30579h0 |= 1;
                }
                ((List) this.f30580i0).addAll(x10.f30467h0);
            }
        }
        if ((x10.f30466Z & 1) == 1) {
            int i10 = x10.f30468i0;
            this.f30579h0 |= 2;
            this.f30581j0 = i10;
        }
        this.f38400Y = this.f38400Y.r(x10.f30465Y);
    }
}
