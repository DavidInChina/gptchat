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
public final class S extends AbstractC4467l {

    /* renamed from: i0  reason: collision with root package name */
    public int f30413i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30414j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30415k0;

    /* renamed from: l0  reason: collision with root package name */
    public List f30416l0;

    /* renamed from: m0  reason: collision with root package name */
    public Q f30417m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f30418n0;

    /* renamed from: o0  reason: collision with root package name */
    public Q f30419o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f30420p0;

    /* renamed from: q0  reason: collision with root package name */
    public List f30421q0;

    /* renamed from: r0  reason: collision with root package name */
    public List f30422r0;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.S, lg.l] */
    public static S f() {
        ?? abstractC4467l = new AbstractC4467l();
        abstractC4467l.f30414j0 = 6;
        abstractC4467l.f30416l0 = Collections.emptyList();
        Q q10 = Q.f30393y0;
        abstractC4467l.f30417m0 = q10;
        abstractC4467l.f30419o0 = q10;
        abstractC4467l.f30421q0 = Collections.emptyList();
        abstractC4467l.f30422r0 = Collections.emptyList();
        return abstractC4467l;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        T e10 = e();
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
        T t10 = null;
        try {
            try {
                g((T) T.f30424u0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                T t11 = (T) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    t10 = t11;
                    if (t10 != null) {
                        g(t10);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (t10 != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        g((T) pVar);
        return this;
    }

    public final Object clone() {
        S f6 = f();
        f6.g(e());
        return f6;
    }

    public final T e() {
        T t10 = new T(this);
        int i10 = this.f30413i0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        t10.f30427i0 = this.f30414j0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        t10.f30428j0 = this.f30415k0;
        if ((i10 & 4) == 4) {
            this.f30416l0 = Collections.unmodifiableList(this.f30416l0);
            this.f30413i0 &= -5;
        }
        t10.f30429k0 = this.f30416l0;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        t10.f30430l0 = this.f30417m0;
        if ((i10 & 16) == 16) {
            i11 |= 8;
        }
        t10.f30431m0 = this.f30418n0;
        if ((i10 & 32) == 32) {
            i11 |= 16;
        }
        t10.f30432n0 = this.f30419o0;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        t10.f30433o0 = this.f30420p0;
        if ((this.f30413i0 & 128) == 128) {
            this.f30421q0 = Collections.unmodifiableList(this.f30421q0);
            this.f30413i0 &= -129;
        }
        t10.f30434p0 = this.f30421q0;
        if ((this.f30413i0 & 256) == 256) {
            this.f30422r0 = Collections.unmodifiableList(this.f30422r0);
            this.f30413i0 &= -257;
        }
        t10.f30435q0 = this.f30422r0;
        t10.f30426h0 = i11;
        return t10;
    }

    public final void g(T t10) {
        Q q10;
        Q q11;
        if (t10 == T.f30423t0) {
            return;
        }
        int i10 = t10.f30426h0;
        if ((i10 & 1) == 1) {
            int i11 = t10.f30427i0;
            this.f30413i0 = 1 | this.f30413i0;
            this.f30414j0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = t10.f30428j0;
            this.f30413i0 = 2 | this.f30413i0;
            this.f30415k0 = i12;
        }
        if (!t10.f30429k0.isEmpty()) {
            if (this.f30416l0.isEmpty()) {
                this.f30416l0 = t10.f30429k0;
                this.f30413i0 &= -5;
            } else {
                if ((this.f30413i0 & 4) != 4) {
                    this.f30416l0 = new ArrayList(this.f30416l0);
                    this.f30413i0 |= 4;
                }
                this.f30416l0.addAll(t10.f30429k0);
            }
        }
        if ((t10.f30426h0 & 4) == 4) {
            Q q12 = t10.f30430l0;
            if ((this.f30413i0 & 8) == 8 && (q11 = this.f30417m0) != Q.f30393y0) {
                P q13 = Q.q(q11);
                q13.g(q12);
                this.f30417m0 = q13.e();
            } else {
                this.f30417m0 = q12;
            }
            this.f30413i0 |= 8;
        }
        int i13 = t10.f30426h0;
        if ((i13 & 8) == 8) {
            int i14 = t10.f30431m0;
            this.f30413i0 |= 16;
            this.f30418n0 = i14;
        }
        if ((i13 & 16) == 16) {
            Q q14 = t10.f30432n0;
            if ((this.f30413i0 & 32) == 32 && (q10 = this.f30419o0) != Q.f30393y0) {
                P q15 = Q.q(q10);
                q15.g(q14);
                this.f30419o0 = q15.e();
            } else {
                this.f30419o0 = q14;
            }
            this.f30413i0 |= 32;
        }
        if ((t10.f30426h0 & 32) == 32) {
            int i15 = t10.f30433o0;
            this.f30413i0 |= 64;
            this.f30420p0 = i15;
        }
        if (!t10.f30434p0.isEmpty()) {
            if (this.f30421q0.isEmpty()) {
                this.f30421q0 = t10.f30434p0;
                this.f30413i0 &= -129;
            } else {
                if ((this.f30413i0 & 128) != 128) {
                    this.f30421q0 = new ArrayList(this.f30421q0);
                    this.f30413i0 |= 128;
                }
                this.f30421q0.addAll(t10.f30434p0);
            }
        }
        if (!t10.f30435q0.isEmpty()) {
            if (this.f30422r0.isEmpty()) {
                this.f30422r0 = t10.f30435q0;
                this.f30413i0 &= -257;
            } else {
                if ((this.f30413i0 & 256) != 256) {
                    this.f30422r0 = new ArrayList(this.f30422r0);
                    this.f30413i0 |= 256;
                }
                this.f30422r0.addAll(t10.f30435q0);
            }
        }
        d(t10);
        this.f38400Y = this.f38400Y.r(t10.f30425Z);
    }
}
