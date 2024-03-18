package ig;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.C4461f;
import lg.C4464i;
import lg.p;
import lg.t;

/* renamed from: ig.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3578d extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public int f33178Z;

    /* renamed from: h0  reason: collision with root package name */
    public C3576b f33179h0;

    /* renamed from: i0  reason: collision with root package name */
    public C3577c f33180i0;

    /* renamed from: j0  reason: collision with root package name */
    public C3577c f33181j0;

    /* renamed from: k0  reason: collision with root package name */
    public C3577c f33182k0;

    /* renamed from: l0  reason: collision with root package name */
    public C3577c f33183l0;

    /* JADX WARN: Type inference failed for: r0v0, types: [ig.d, lg.k] */
    public static C3578d e() {
        ?? abstractC4466k = new AbstractC4466k();
        abstractC4466k.f33179h0 = C3576b.f33162l0;
        C3577c c3577c = C3577c.f33170l0;
        abstractC4466k.f33180i0 = c3577c;
        abstractC4466k.f33181j0 = c3577c;
        abstractC4466k.f33182k0 = c3577c;
        abstractC4466k.f33183l0 = c3577c;
        return abstractC4466k;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        C3579e d10 = d();
        if (d10.isInitialized()) {
            return d10;
        }
        throw new n0();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC2041a b(C4461f c4461f, C4464i c4464i) {
        Throwable th2;
        C3579e c3579e = null;
        try {
            try {
                f((C3579e) C3579e.f33185p0.b(c4461f, c4464i));
                return this;
            } catch (t e10) {
                C3579e c3579e2 = (C3579e) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    c3579e = c3579e2;
                    if (c3579e != null) {
                        f(c3579e);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (c3579e != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(p pVar) {
        f((C3579e) pVar);
        return this;
    }

    public final Object clone() {
        C3578d e10 = e();
        e10.f(d());
        return e10;
    }

    public final C3579e d() {
        C3579e c3579e = new C3579e(this);
        int i10 = this.f33178Z;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        c3579e.f33188h0 = this.f33179h0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c3579e.f33189i0 = this.f33180i0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c3579e.f33190j0 = this.f33181j0;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        c3579e.f33191k0 = this.f33182k0;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        c3579e.f33192l0 = this.f33183l0;
        c3579e.f33187Z = i11;
        return c3579e;
    }

    public final void f(C3579e c3579e) {
        C3577c c3577c;
        C3577c c3577c2;
        C3577c c3577c3;
        C3577c c3577c4;
        C3576b c3576b;
        if (c3579e == C3579e.f33184o0) {
            return;
        }
        if ((c3579e.f33187Z & 1) == 1) {
            C3576b c3576b2 = c3579e.f33188h0;
            if ((this.f33178Z & 1) == 1 && (c3576b = this.f33179h0) != C3576b.f33162l0) {
                C3575a c3575a = new C3575a(0);
                c3575a.f(c3576b);
                c3575a.f(c3576b2);
                this.f33179h0 = c3575a.d();
            } else {
                this.f33179h0 = c3576b2;
            }
            this.f33178Z |= 1;
        }
        if ((c3579e.f33187Z & 2) == 2) {
            C3577c c3577c5 = c3579e.f33189i0;
            if ((this.f33178Z & 2) == 2 && (c3577c4 = this.f33180i0) != C3577c.f33170l0) {
                C3575a g10 = C3577c.g(c3577c4);
                g10.g(c3577c5);
                this.f33180i0 = g10.e();
            } else {
                this.f33180i0 = c3577c5;
            }
            this.f33178Z |= 2;
        }
        if ((c3579e.f33187Z & 4) == 4) {
            C3577c c3577c6 = c3579e.f33190j0;
            if ((this.f33178Z & 4) == 4 && (c3577c3 = this.f33181j0) != C3577c.f33170l0) {
                C3575a g11 = C3577c.g(c3577c3);
                g11.g(c3577c6);
                this.f33181j0 = g11.e();
            } else {
                this.f33181j0 = c3577c6;
            }
            this.f33178Z |= 4;
        }
        if ((c3579e.f33187Z & 8) == 8) {
            C3577c c3577c7 = c3579e.f33191k0;
            if ((this.f33178Z & 8) == 8 && (c3577c2 = this.f33182k0) != C3577c.f33170l0) {
                C3575a g12 = C3577c.g(c3577c2);
                g12.g(c3577c7);
                this.f33182k0 = g12.e();
            } else {
                this.f33182k0 = c3577c7;
            }
            this.f33178Z |= 8;
        }
        if ((c3579e.f33187Z & 16) == 16) {
            C3577c c3577c8 = c3579e.f33192l0;
            if ((this.f33178Z & 16) == 16 && (c3577c = this.f33183l0) != C3577c.f33170l0) {
                C3575a g13 = C3577c.g(c3577c);
                g13.g(c3577c8);
                this.f33183l0 = g13.e();
            } else {
                this.f33183l0 = c3577c8;
            }
            this.f33178Z |= 16;
        }
        this.f38400Y = this.f38400Y.r(c3579e.f33186Y);
    }
}
