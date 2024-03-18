package fg;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.C4461f;
import lg.C4464i;

/* loaded from: classes2.dex */
public final class a0 extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public int f30491Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30492h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30493i0;

    /* renamed from: j0  reason: collision with root package name */
    public b0 f30494j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30495k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30496l0;

    /* renamed from: m0  reason: collision with root package name */
    public c0 f30497m0;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.a0, lg.k] */
    public static a0 e() {
        ?? abstractC4466k = new AbstractC4466k();
        abstractC4466k.f30494j0 = b0.ERROR;
        abstractC4466k.f30497m0 = c0.LANGUAGE_VERSION;
        return abstractC4466k;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        d0 d10 = d();
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
        d0 d0Var = null;
        try {
            try {
                f((d0) d0.f30553q0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                d0 d0Var2 = (d0) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    d0Var = d0Var2;
                    if (d0Var != null) {
                        f(d0Var);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (d0Var != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        f((d0) pVar);
        return this;
    }

    public final Object clone() {
        a0 e10 = e();
        e10.f(d());
        return e10;
    }

    public final d0 d() {
        d0 d0Var = new d0(this);
        int i10 = this.f30491Z;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        d0Var.f30556h0 = this.f30492h0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        d0Var.f30557i0 = this.f30493i0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        d0Var.f30558j0 = this.f30494j0;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        d0Var.f30559k0 = this.f30495k0;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        d0Var.f30560l0 = this.f30496l0;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        d0Var.f30561m0 = this.f30497m0;
        d0Var.f30555Z = i11;
        return d0Var;
    }

    public final void f(d0 d0Var) {
        if (d0Var == d0.f30552p0) {
            return;
        }
        int i10 = d0Var.f30555Z;
        if ((i10 & 1) == 1) {
            int i11 = d0Var.f30556h0;
            this.f30491Z = 1 | this.f30491Z;
            this.f30492h0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = d0Var.f30557i0;
            this.f30491Z = 2 | this.f30491Z;
            this.f30493i0 = i12;
        }
        if ((i10 & 4) == 4) {
            b0 b0Var = d0Var.f30558j0;
            b0Var.getClass();
            this.f30491Z = 4 | this.f30491Z;
            this.f30494j0 = b0Var;
        }
        int i13 = d0Var.f30555Z;
        if ((i13 & 8) == 8) {
            int i14 = d0Var.f30559k0;
            this.f30491Z = 8 | this.f30491Z;
            this.f30495k0 = i14;
        }
        if ((i13 & 16) == 16) {
            int i15 = d0Var.f30560l0;
            this.f30491Z = 16 | this.f30491Z;
            this.f30496l0 = i15;
        }
        if ((i13 & 32) == 32) {
            c0 c0Var = d0Var.f30561m0;
            c0Var.getClass();
            this.f30491Z = 32 | this.f30491Z;
            this.f30497m0 = c0Var;
        }
        this.f38400Y = this.f38400Y.r(d0Var.f30554Y);
    }
}
