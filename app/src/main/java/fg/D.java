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

/* loaded from: classes.dex */
public final class D extends AbstractC4467l {

    /* renamed from: i0  reason: collision with root package name */
    public int f30278i0;

    /* renamed from: j0  reason: collision with root package name */
    public L f30279j0;

    /* renamed from: k0  reason: collision with root package name */
    public K f30280k0;

    /* renamed from: l0  reason: collision with root package name */
    public C3032C f30281l0;

    /* renamed from: m0  reason: collision with root package name */
    public List f30282m0;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.D, lg.l] */
    public static D f() {
        ?? abstractC4467l = new AbstractC4467l();
        abstractC4467l.f30279j0 = L.f30353j0;
        abstractC4467l.f30280k0 = K.f30347j0;
        abstractC4467l.f30281l0 = C3032C.f30267p0;
        abstractC4467l.f30282m0 = Collections.emptyList();
        return abstractC4467l;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        E e10 = e();
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
        E e10 = null;
        try {
            try {
                g((E) E.f30284p0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e11) {
                E e12 = (E) e11.f38415Y;
                try {
                    throw e11;
                } catch (Throwable th3) {
                    th2 = th3;
                    e10 = e12;
                    if (e10 != null) {
                        g(e10);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (e10 != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        g((E) pVar);
        return this;
    }

    public final Object clone() {
        D f6 = f();
        f6.g(e());
        return f6;
    }

    public final E e() {
        E e10 = new E(this);
        int i10 = this.f30278i0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        e10.f30287i0 = this.f30279j0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        e10.f30288j0 = this.f30280k0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        e10.f30289k0 = this.f30281l0;
        if ((i10 & 8) == 8) {
            this.f30282m0 = Collections.unmodifiableList(this.f30282m0);
            this.f30278i0 &= -9;
        }
        e10.f30290l0 = this.f30282m0;
        e10.f30286h0 = i11;
        return e10;
    }

    public final void g(E e10) {
        C3032C c3032c;
        K k10;
        L l10;
        if (e10 == E.f30283o0) {
            return;
        }
        if ((e10.f30286h0 & 1) == 1) {
            L l11 = e10.f30287i0;
            if ((this.f30278i0 & 1) == 1 && (l10 = this.f30279j0) != L.f30353j0) {
                C3045m c3045m = new C3045m(3);
                c3045m.j(l10);
                c3045m.j(l11);
                this.f30279j0 = c3045m.f();
            } else {
                this.f30279j0 = l11;
            }
            this.f30278i0 |= 1;
        }
        if ((e10.f30286h0 & 2) == 2) {
            K k11 = e10.f30288j0;
            if ((this.f30278i0 & 2) == 2 && (k10 = this.f30280k0) != K.f30347j0) {
                C3045m c3045m2 = new C3045m(1);
                c3045m2.i(k10);
                c3045m2.i(k11);
                this.f30280k0 = c3045m2.e();
            } else {
                this.f30280k0 = k11;
            }
            this.f30278i0 |= 2;
        }
        if ((e10.f30286h0 & 4) == 4) {
            C3032C c3032c2 = e10.f30289k0;
            if ((this.f30278i0 & 4) == 4 && (c3032c = this.f30281l0) != C3032C.f30267p0) {
                C3031B f6 = C3031B.f();
                f6.g(c3032c);
                f6.g(c3032c2);
                this.f30281l0 = f6.e();
            } else {
                this.f30281l0 = c3032c2;
            }
            this.f30278i0 |= 4;
        }
        if (!e10.f30290l0.isEmpty()) {
            if (this.f30282m0.isEmpty()) {
                this.f30282m0 = e10.f30290l0;
                this.f30278i0 &= -9;
            } else {
                if ((this.f30278i0 & 8) != 8) {
                    this.f30282m0 = new ArrayList(this.f30282m0);
                    this.f30278i0 |= 8;
                }
                this.f30282m0.addAll(e10.f30290l0);
            }
        }
        d(e10);
        this.f38400Y = this.f38400Y.r(e10.f30285Z);
    }
}
