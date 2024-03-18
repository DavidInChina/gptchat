package fg;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.AbstractC4467l;
import lg.C4461f;
import lg.C4464i;

/* loaded from: classes.dex */
public final class Y extends AbstractC4467l {

    /* renamed from: i0  reason: collision with root package name */
    public int f30471i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30472j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30473k0;

    /* renamed from: l0  reason: collision with root package name */
    public Q f30474l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f30475m0;

    /* renamed from: n0  reason: collision with root package name */
    public Q f30476n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f30477o0;

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        Z e10 = e();
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
        Z z10 = null;
        try {
            try {
                f((Z) Z.f30479r0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                Z z11 = (Z) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    z10 = z11;
                    if (z10 != null) {
                        f(z10);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (z10 != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        f((Z) pVar);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.Y, java.lang.Object, lg.l] */
    public final Object clone() {
        ?? abstractC4467l = new AbstractC4467l();
        Q q10 = Q.f30393y0;
        abstractC4467l.f30474l0 = q10;
        abstractC4467l.f30476n0 = q10;
        abstractC4467l.f(e());
        return abstractC4467l;
    }

    public final Z e() {
        Z z10 = new Z(this);
        int i10 = this.f30471i0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        z10.f30482i0 = this.f30472j0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        z10.f30483j0 = this.f30473k0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        z10.f30484k0 = this.f30474l0;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        z10.f30485l0 = this.f30475m0;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        z10.f30486m0 = this.f30476n0;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        z10.f30487n0 = this.f30477o0;
        z10.f30481h0 = i11;
        return z10;
    }

    public final void f(Z z10) {
        Q q10;
        Q q11;
        if (z10 == Z.f30478q0) {
            return;
        }
        int i10 = z10.f30481h0;
        if ((i10 & 1) == 1) {
            int i11 = z10.f30482i0;
            this.f30471i0 = 1 | this.f30471i0;
            this.f30472j0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = z10.f30483j0;
            this.f30471i0 = 2 | this.f30471i0;
            this.f30473k0 = i12;
        }
        if ((i10 & 4) == 4) {
            Q q12 = z10.f30484k0;
            if ((this.f30471i0 & 4) == 4 && (q11 = this.f30474l0) != Q.f30393y0) {
                P q13 = Q.q(q11);
                q13.g(q12);
                this.f30474l0 = q13.e();
            } else {
                this.f30474l0 = q12;
            }
            this.f30471i0 |= 4;
        }
        int i13 = z10.f30481h0;
        if ((i13 & 8) == 8) {
            int i14 = z10.f30485l0;
            this.f30471i0 = 8 | this.f30471i0;
            this.f30475m0 = i14;
        }
        if ((i13 & 16) == 16) {
            Q q14 = z10.f30486m0;
            if ((this.f30471i0 & 16) == 16 && (q10 = this.f30476n0) != Q.f30393y0) {
                P q15 = Q.q(q10);
                q15.g(q14);
                this.f30476n0 = q15.e();
            } else {
                this.f30476n0 = q14;
            }
            this.f30471i0 |= 16;
        }
        if ((z10.f30481h0 & 32) == 32) {
            int i15 = z10.f30487n0;
            this.f30471i0 = 32 | this.f30471i0;
            this.f30477o0 = i15;
        }
        d(z10);
        this.f38400Y = this.f38400Y.r(z10.f30480Z);
    }
}
