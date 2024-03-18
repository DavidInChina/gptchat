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

/* renamed from: fg.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3052u extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public int f30724Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f30725h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30726i0;

    /* renamed from: j0  reason: collision with root package name */
    public EnumC3053v f30727j0;

    /* renamed from: k0  reason: collision with root package name */
    public Q f30728k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30729l0;

    /* renamed from: m0  reason: collision with root package name */
    public List f30730m0;

    /* renamed from: n0  reason: collision with root package name */
    public List f30731n0;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.u, lg.k] */
    public static C3052u e() {
        ?? abstractC4466k = new AbstractC4466k();
        abstractC4466k.f30727j0 = EnumC3053v.TRUE;
        abstractC4466k.f30728k0 = Q.f30393y0;
        abstractC4466k.f30730m0 = Collections.emptyList();
        abstractC4466k.f30731n0 = Collections.emptyList();
        return abstractC4466k;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        C3054w d10 = d();
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
        C3054w c3054w = null;
        try {
            try {
                f((C3054w) C3054w.f30738r0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                C3054w c3054w2 = (C3054w) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    c3054w = c3054w2;
                    if (c3054w != null) {
                        f(c3054w);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (c3054w != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        f((C3054w) pVar);
        return this;
    }

    public final Object clone() {
        C3052u e10 = e();
        e10.f(d());
        return e10;
    }

    public final C3054w d() {
        C3054w c3054w = new C3054w(this);
        int i10 = this.f30724Z;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        c3054w.f30741h0 = this.f30725h0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c3054w.f30742i0 = this.f30726i0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c3054w.f30743j0 = this.f30727j0;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        c3054w.f30744k0 = this.f30728k0;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        c3054w.f30745l0 = this.f30729l0;
        if ((i10 & 32) == 32) {
            this.f30730m0 = Collections.unmodifiableList(this.f30730m0);
            this.f30724Z &= -33;
        }
        c3054w.f30746m0 = this.f30730m0;
        if ((this.f30724Z & 64) == 64) {
            this.f30731n0 = Collections.unmodifiableList(this.f30731n0);
            this.f30724Z &= -65;
        }
        c3054w.f30747n0 = this.f30731n0;
        c3054w.f30740Z = i11;
        return c3054w;
    }

    public final void f(C3054w c3054w) {
        Q q10;
        if (c3054w == C3054w.f30737q0) {
            return;
        }
        int i10 = c3054w.f30740Z;
        if ((i10 & 1) == 1) {
            int i11 = c3054w.f30741h0;
            this.f30724Z = 1 | this.f30724Z;
            this.f30725h0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = c3054w.f30742i0;
            this.f30724Z = 2 | this.f30724Z;
            this.f30726i0 = i12;
        }
        if ((i10 & 4) == 4) {
            EnumC3053v enumC3053v = c3054w.f30743j0;
            enumC3053v.getClass();
            this.f30724Z = 4 | this.f30724Z;
            this.f30727j0 = enumC3053v;
        }
        if ((c3054w.f30740Z & 8) == 8) {
            Q q11 = c3054w.f30744k0;
            if ((this.f30724Z & 8) == 8 && (q10 = this.f30728k0) != Q.f30393y0) {
                P q12 = Q.q(q10);
                q12.g(q11);
                this.f30728k0 = q12.e();
            } else {
                this.f30728k0 = q11;
            }
            this.f30724Z |= 8;
        }
        if ((c3054w.f30740Z & 16) == 16) {
            int i13 = c3054w.f30745l0;
            this.f30724Z = 16 | this.f30724Z;
            this.f30729l0 = i13;
        }
        if (!c3054w.f30746m0.isEmpty()) {
            if (this.f30730m0.isEmpty()) {
                this.f30730m0 = c3054w.f30746m0;
                this.f30724Z &= -33;
            } else {
                if ((this.f30724Z & 32) != 32) {
                    this.f30730m0 = new ArrayList(this.f30730m0);
                    this.f30724Z |= 32;
                }
                this.f30730m0.addAll(c3054w.f30746m0);
            }
        }
        if (!c3054w.f30747n0.isEmpty()) {
            if (this.f30731n0.isEmpty()) {
                this.f30731n0 = c3054w.f30747n0;
                this.f30724Z &= -65;
            } else {
                if ((this.f30724Z & 64) != 64) {
                    this.f30731n0 = new ArrayList(this.f30731n0);
                    this.f30724Z |= 64;
                }
                this.f30731n0.addAll(c3054w.f30747n0);
            }
        }
        this.f38400Y = this.f38400Y.r(c3054w.f30739Y);
    }
}
