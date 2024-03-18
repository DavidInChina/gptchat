package fg;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.AbstractC4467l;
import lg.C4461f;
import lg.C4464i;

/* renamed from: fg.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3031B extends AbstractC4467l {

    /* renamed from: i0  reason: collision with root package name */
    public int f30261i0;

    /* renamed from: j0  reason: collision with root package name */
    public List f30262j0;

    /* renamed from: k0  reason: collision with root package name */
    public List f30263k0;

    /* renamed from: l0  reason: collision with root package name */
    public List f30264l0;

    /* renamed from: m0  reason: collision with root package name */
    public X f30265m0;

    /* renamed from: n0  reason: collision with root package name */
    public e0 f30266n0;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.B, lg.l] */
    public static C3031B f() {
        ?? abstractC4467l = new AbstractC4467l();
        abstractC4467l.f30262j0 = Collections.emptyList();
        abstractC4467l.f30263k0 = Collections.emptyList();
        abstractC4467l.f30264l0 = Collections.emptyList();
        abstractC4467l.f30265m0 = X.f30463l0;
        abstractC4467l.f30266n0 = e0.f30572j0;
        return abstractC4467l;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        C3032C e10 = e();
        if (e10.isInitialized()) {
            return e10;
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
        C3032C c3032c = null;
        try {
            try {
                g((C3032C) C3032C.f30268q0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                C3032C c3032c2 = (C3032C) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    c3032c = c3032c2;
                    if (c3032c != null) {
                        g(c3032c);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (c3032c != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        g((C3032C) pVar);
        return this;
    }

    public final Object clone() {
        C3031B f6 = f();
        f6.g(e());
        return f6;
    }

    public final C3032C e() {
        C3032C c3032c = new C3032C(this);
        int i10 = this.f30261i0;
        int i11 = 1;
        if ((i10 & 1) == 1) {
            this.f30262j0 = Collections.unmodifiableList(this.f30262j0);
            this.f30261i0 &= -2;
        }
        c3032c.f30271i0 = this.f30262j0;
        if ((this.f30261i0 & 2) == 2) {
            this.f30263k0 = Collections.unmodifiableList(this.f30263k0);
            this.f30261i0 &= -3;
        }
        c3032c.f30272j0 = this.f30263k0;
        if ((this.f30261i0 & 4) == 4) {
            this.f30264l0 = Collections.unmodifiableList(this.f30264l0);
            this.f30261i0 &= -5;
        }
        c3032c.f30273k0 = this.f30264l0;
        if ((i10 & 8) != 8) {
            i11 = 0;
        }
        c3032c.f30274l0 = this.f30265m0;
        if ((i10 & 16) == 16) {
            i11 |= 2;
        }
        c3032c.f30275m0 = this.f30266n0;
        c3032c.f30270h0 = i11;
        return c3032c;
    }

    public final void g(C3032C c3032c) {
        e0 e0Var;
        X x10;
        if (c3032c == C3032C.f30267p0) {
            return;
        }
        if (!c3032c.f30271i0.isEmpty()) {
            if (this.f30262j0.isEmpty()) {
                this.f30262j0 = c3032c.f30271i0;
                this.f30261i0 &= -2;
            } else {
                if ((this.f30261i0 & 1) != 1) {
                    this.f30262j0 = new ArrayList(this.f30262j0);
                    this.f30261i0 |= 1;
                }
                this.f30262j0.addAll(c3032c.f30271i0);
            }
        }
        if (!c3032c.f30272j0.isEmpty()) {
            if (this.f30263k0.isEmpty()) {
                this.f30263k0 = c3032c.f30272j0;
                this.f30261i0 &= -3;
            } else {
                if ((this.f30261i0 & 2) != 2) {
                    this.f30263k0 = new ArrayList(this.f30263k0);
                    this.f30261i0 |= 2;
                }
                this.f30263k0.addAll(c3032c.f30272j0);
            }
        }
        if (!c3032c.f30273k0.isEmpty()) {
            if (this.f30264l0.isEmpty()) {
                this.f30264l0 = c3032c.f30273k0;
                this.f30261i0 &= -5;
            } else {
                if ((this.f30261i0 & 4) != 4) {
                    this.f30264l0 = new ArrayList(this.f30264l0);
                    this.f30261i0 |= 4;
                }
                this.f30264l0.addAll(c3032c.f30273k0);
            }
        }
        if ((c3032c.f30270h0 & 1) == 1) {
            X x11 = c3032c.f30274l0;
            if ((this.f30261i0 & 8) == 8 && (x10 = this.f30265m0) != X.f30463l0) {
                C3038f g10 = X.g(x10);
                g10.i(x11);
                this.f30265m0 = g10.f();
            } else {
                this.f30265m0 = x11;
            }
            this.f30261i0 |= 8;
        }
        if ((c3032c.f30270h0 & 2) == 2) {
            e0 e0Var2 = c3032c.f30275m0;
            if ((this.f30261i0 & 16) == 16 && (e0Var = this.f30266n0) != e0.f30572j0) {
                C3045m c3045m = new C3045m(2);
                c3045m.k(e0Var);
                c3045m.k(e0Var2);
                this.f30266n0 = c3045m.g();
            } else {
                this.f30266n0 = e0Var2;
            }
            this.f30261i0 |= 16;
        }
        d(c3032c);
        this.f38400Y = this.f38400Y.r(c3032c.f30269Z);
    }
}
