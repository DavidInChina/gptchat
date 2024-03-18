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

/* renamed from: fg.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3045m extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f30681Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30682h0;

    /* renamed from: i0  reason: collision with root package name */
    public List f30683i0;

    public C3045m(int i10) {
        this.f30681Z = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f30683i0 = Collections.emptyList();
                    return;
                } else {
                    this.f30683i0 = lg.u.f38416Z;
                    return;
                }
            }
            this.f30683i0 = Collections.emptyList();
            return;
        }
        this.f30683i0 = Collections.emptyList();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        switch (this.f30681Z) {
            case 0:
                C3046n d10 = d();
                if (d10.isInitialized()) {
                    return d10;
                }
                throw new n0();
            case 1:
                K e10 = e();
                if (e10.isInitialized()) {
                    return e10;
                }
                throw new n0();
            case 2:
                e0 g10 = g();
                if (g10.isInitialized()) {
                    return g10;
                }
                throw new n0();
            default:
                L f6 = f();
                if (f6.isInitialized()) {
                    return f6;
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
        Throwable th5;
        C3046n c3046n = null;
        e0 e0Var = null;
        L l10 = null;
        K k10 = null;
        try {
            try {
                try {
                    switch (this.f30681Z) {
                        case 0:
                            try {
                                h((C3046n) C3046n.f30685k0.b(c4461f, c4464i));
                                return this;
                            } catch (lg.t e10) {
                                C3046n c3046n2 = (C3046n) e10.f38415Y;
                                try {
                                    throw e10;
                                } catch (Throwable th6) {
                                    th2 = th6;
                                    c3046n = c3046n2;
                                    if (c3046n != null) {
                                        h(c3046n);
                                    }
                                    throw th2;
                                }
                            }
                        case 1:
                            try {
                                i((K) K.f30348k0.b(c4461f, c4464i));
                                return this;
                            } catch (lg.t e11) {
                                K k11 = (K) e11.f38415Y;
                                try {
                                    throw e11;
                                } catch (Throwable th7) {
                                    th3 = th7;
                                    k10 = k11;
                                    if (k10 != null) {
                                        i(k10);
                                    }
                                    throw th3;
                                }
                            }
                        case 2:
                            try {
                                try {
                                    k((e0) e0.f30573k0.b(c4461f, c4464i));
                                    return this;
                                } catch (lg.t e12) {
                                    e0 e0Var2 = (e0) e12.f38415Y;
                                    try {
                                        throw e12;
                                    } catch (Throwable th8) {
                                        th5 = th8;
                                        e0Var = e0Var2;
                                        if (e0Var != null) {
                                            k(e0Var);
                                        }
                                        throw th5;
                                    }
                                }
                            } catch (Throwable th9) {
                                th5 = th9;
                                if (e0Var != null) {
                                }
                                throw th5;
                            }
                        default:
                            try {
                                j((L) L.f30354k0.b(c4461f, c4464i));
                                return this;
                            } catch (lg.t e13) {
                                L l11 = (L) e13.f38415Y;
                                try {
                                    throw e13;
                                } catch (Throwable th10) {
                                    th4 = th10;
                                    l10 = l11;
                                    if (l10 != null) {
                                        j(l10);
                                    }
                                    throw th4;
                                }
                            }
                    }
                } catch (Throwable th11) {
                    th4 = th11;
                }
            } catch (Throwable th12) {
                th2 = th12;
            }
        } catch (Throwable th13) {
            th3 = th13;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        switch (this.f30681Z) {
            case 0:
                h((C3046n) pVar);
                return this;
            case 1:
                i((K) pVar);
                return this;
            case 2:
                k((e0) pVar);
                return this;
            default:
                j((L) pVar);
                return this;
        }
    }

    public final Object clone() {
        switch (this.f30681Z) {
            case 0:
                C3045m c3045m = new C3045m(0);
                c3045m.h(d());
                return c3045m;
            case 1:
                C3045m c3045m2 = new C3045m(1);
                c3045m2.i(e());
                return c3045m2;
            case 2:
                C3045m c3045m3 = new C3045m(2);
                c3045m3.k(g());
                return c3045m3;
            default:
                C3045m c3045m4 = new C3045m(3);
                c3045m4.j(f());
                return c3045m4;
        }
    }

    public final C3046n d() {
        C3046n c3046n = new C3046n(this);
        if ((this.f30682h0 & 1) == 1) {
            this.f30683i0 = Collections.unmodifiableList(this.f30683i0);
            this.f30682h0 &= -2;
        }
        c3046n.f30687Z = this.f30683i0;
        return c3046n;
    }

    public final K e() {
        K k10 = new K(this);
        if ((this.f30682h0 & 1) == 1) {
            this.f30683i0 = Collections.unmodifiableList(this.f30683i0);
            this.f30682h0 &= -2;
        }
        k10.f30350Z = this.f30683i0;
        return k10;
    }

    public final L f() {
        L l10 = new L(this);
        if ((this.f30682h0 & 1) == 1) {
            this.f30683i0 = ((lg.v) this.f30683i0).e();
            this.f30682h0 &= -2;
        }
        l10.f30356Z = (lg.v) this.f30683i0;
        return l10;
    }

    public final e0 g() {
        e0 e0Var = new e0(this);
        if ((this.f30682h0 & 1) == 1) {
            this.f30683i0 = Collections.unmodifiableList(this.f30683i0);
            this.f30682h0 &= -2;
        }
        e0Var.f30575Z = this.f30683i0;
        return e0Var;
    }

    public final void h(C3046n c3046n) {
        if (c3046n == C3046n.f30684j0) {
            return;
        }
        if (!c3046n.f30687Z.isEmpty()) {
            if (this.f30683i0.isEmpty()) {
                this.f30683i0 = c3046n.f30687Z;
                this.f30682h0 &= -2;
            } else {
                if ((this.f30682h0 & 1) != 1) {
                    this.f30683i0 = new ArrayList(this.f30683i0);
                    this.f30682h0 |= 1;
                }
                this.f30683i0.addAll(c3046n.f30687Z);
            }
        }
        this.f38400Y = this.f38400Y.r(c3046n.f30686Y);
    }

    public final void i(K k10) {
        if (k10 == K.f30347j0) {
            return;
        }
        if (!k10.f30350Z.isEmpty()) {
            if (this.f30683i0.isEmpty()) {
                this.f30683i0 = k10.f30350Z;
                this.f30682h0 &= -2;
            } else {
                if ((this.f30682h0 & 1) != 1) {
                    this.f30683i0 = new ArrayList(this.f30683i0);
                    this.f30682h0 |= 1;
                }
                this.f30683i0.addAll(k10.f30350Z);
            }
        }
        this.f38400Y = this.f38400Y.r(k10.f30349Y);
    }

    public final void j(L l10) {
        if (l10 == L.f30353j0) {
            return;
        }
        if (!l10.f30356Z.isEmpty()) {
            if (((lg.v) this.f30683i0).isEmpty()) {
                this.f30683i0 = l10.f30356Z;
                this.f30682h0 &= -2;
            } else {
                if ((this.f30682h0 & 1) != 1) {
                    this.f30683i0 = new lg.u((lg.v) this.f30683i0);
                    this.f30682h0 |= 1;
                }
                ((lg.v) this.f30683i0).addAll(l10.f30356Z);
            }
        }
        this.f38400Y = this.f38400Y.r(l10.f30355Y);
    }

    public final void k(e0 e0Var) {
        if (e0Var == e0.f30572j0) {
            return;
        }
        if (!e0Var.f30575Z.isEmpty()) {
            if (this.f30683i0.isEmpty()) {
                this.f30683i0 = e0Var.f30575Z;
                this.f30682h0 &= -2;
            } else {
                if ((this.f30682h0 & 1) != 1) {
                    this.f30683i0 = new ArrayList(this.f30683i0);
                    this.f30682h0 |= 1;
                }
                this.f30683i0.addAll(e0Var.f30575Z);
            }
        }
        this.f38400Y = this.f38400Y.r(e0Var.f30574Y);
    }
}
