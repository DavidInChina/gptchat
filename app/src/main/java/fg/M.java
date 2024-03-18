package fg;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.C4461f;
import lg.C4464i;

/* loaded from: classes.dex */
public final class M extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public int f30359Z;

    /* renamed from: h0  reason: collision with root package name */
    public N f30360h0;

    /* renamed from: i0  reason: collision with root package name */
    public Q f30361i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30362j0;

    /* JADX WARN: Type inference failed for: r0v0, types: [lg.k, fg.M] */
    public static M e() {
        ?? abstractC4466k = new AbstractC4466k();
        abstractC4466k.f30360h0 = N.INV;
        abstractC4466k.f30361i0 = Q.f30393y0;
        return abstractC4466k;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        O d10 = d();
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
        O o10 = null;
        try {
            try {
                f((O) O.f30370n0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                O o11 = (O) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    o10 = o11;
                    if (o10 != null) {
                        f(o10);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (o10 != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        f((O) pVar);
        return this;
    }

    public final Object clone() {
        M e10 = e();
        e10.f(d());
        return e10;
    }

    public final O d() {
        O o10 = new O(this);
        int i10 = this.f30359Z;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        o10.f30373h0 = this.f30360h0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        o10.f30374i0 = this.f30361i0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        o10.f30375j0 = this.f30362j0;
        o10.f30372Z = i11;
        return o10;
    }

    public final void f(O o10) {
        Q q10;
        if (o10 == O.f30369m0) {
            return;
        }
        if ((o10.f30372Z & 1) == 1) {
            N n10 = o10.f30373h0;
            n10.getClass();
            this.f30359Z = 1 | this.f30359Z;
            this.f30360h0 = n10;
        }
        if ((o10.f30372Z & 2) == 2) {
            Q q11 = o10.f30374i0;
            if ((this.f30359Z & 2) == 2 && (q10 = this.f30361i0) != Q.f30393y0) {
                P q12 = Q.q(q10);
                q12.g(q11);
                this.f30361i0 = q12.e();
            } else {
                this.f30361i0 = q11;
            }
            this.f30359Z |= 2;
        }
        if ((o10.f30372Z & 4) == 4) {
            int i10 = o10.f30375j0;
            this.f30359Z = 4 | this.f30359Z;
            this.f30362j0 = i10;
        }
        this.f38400Y = this.f38400Y.r(o10.f30371Y);
    }
}
