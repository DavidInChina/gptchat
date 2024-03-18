package fg;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.C4461f;
import lg.C4464i;

/* loaded from: classes.dex */
public final class H extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public int f30329Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30330h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30331i0;

    /* renamed from: j0  reason: collision with root package name */
    public I f30332j0;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.H, lg.k] */
    public static H e() {
        ?? abstractC4466k = new AbstractC4466k();
        abstractC4466k.f30330h0 = -1;
        abstractC4466k.f30332j0 = I.PACKAGE;
        return abstractC4466k;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        J d10 = d();
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
        J j6 = null;
        try {
            try {
                f((J) J.f30339n0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                J j10 = (J) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    j6 = j10;
                    if (j6 != null) {
                        f(j6);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (j6 != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        f((J) pVar);
        return this;
    }

    public final Object clone() {
        H e10 = e();
        e10.f(d());
        return e10;
    }

    public final J d() {
        J j6 = new J(this);
        int i10 = this.f30329Z;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        j6.f30342h0 = this.f30330h0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        j6.f30343i0 = this.f30331i0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        j6.f30344j0 = this.f30332j0;
        j6.f30341Z = i11;
        return j6;
    }

    public final void f(J j6) {
        if (j6 == J.f30338m0) {
            return;
        }
        int i10 = j6.f30341Z;
        if ((i10 & 1) == 1) {
            int i11 = j6.f30342h0;
            this.f30329Z = 1 | this.f30329Z;
            this.f30330h0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = j6.f30343i0;
            this.f30329Z = 2 | this.f30329Z;
            this.f30331i0 = i12;
        }
        if ((i10 & 4) == 4) {
            I i13 = j6.f30344j0;
            i13.getClass();
            this.f30329Z = 4 | this.f30329Z;
            this.f30332j0 = i13;
        }
        this.f38400Y = this.f38400Y.r(j6.f30340Y);
    }
}
