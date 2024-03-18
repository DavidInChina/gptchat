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

/* renamed from: fg.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3040h extends AbstractC4467l {

    /* renamed from: A0  reason: collision with root package name */
    public int f30598A0;

    /* renamed from: B0  reason: collision with root package name */
    public List f30599B0;

    /* renamed from: C0  reason: collision with root package name */
    public List f30600C0;

    /* renamed from: D0  reason: collision with root package name */
    public List f30601D0;

    /* renamed from: E0  reason: collision with root package name */
    public X f30602E0;

    /* renamed from: F0  reason: collision with root package name */
    public List f30603F0;

    /* renamed from: G0  reason: collision with root package name */
    public e0 f30604G0;

    /* renamed from: i0  reason: collision with root package name */
    public int f30605i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30606j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30607k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30608l0;

    /* renamed from: m0  reason: collision with root package name */
    public List f30609m0;

    /* renamed from: n0  reason: collision with root package name */
    public List f30610n0;

    /* renamed from: o0  reason: collision with root package name */
    public List f30611o0;

    /* renamed from: p0  reason: collision with root package name */
    public List f30612p0;

    /* renamed from: q0  reason: collision with root package name */
    public List f30613q0;

    /* renamed from: r0  reason: collision with root package name */
    public List f30614r0;

    /* renamed from: s0  reason: collision with root package name */
    public List f30615s0;

    /* renamed from: t0  reason: collision with root package name */
    public List f30616t0;

    /* renamed from: u0  reason: collision with root package name */
    public List f30617u0;

    /* renamed from: v0  reason: collision with root package name */
    public List f30618v0;

    /* renamed from: w0  reason: collision with root package name */
    public List f30619w0;

    /* renamed from: x0  reason: collision with root package name */
    public List f30620x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f30621y0;

    /* renamed from: z0  reason: collision with root package name */
    public Q f30622z0;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.h, lg.l] */
    public static C3040h f() {
        ?? abstractC4467l = new AbstractC4467l();
        abstractC4467l.f30606j0 = 6;
        abstractC4467l.f30609m0 = Collections.emptyList();
        abstractC4467l.f30610n0 = Collections.emptyList();
        abstractC4467l.f30611o0 = Collections.emptyList();
        abstractC4467l.f30612p0 = Collections.emptyList();
        abstractC4467l.f30613q0 = Collections.emptyList();
        abstractC4467l.f30614r0 = Collections.emptyList();
        abstractC4467l.f30615s0 = Collections.emptyList();
        abstractC4467l.f30616t0 = Collections.emptyList();
        abstractC4467l.f30617u0 = Collections.emptyList();
        abstractC4467l.f30618v0 = Collections.emptyList();
        abstractC4467l.f30619w0 = Collections.emptyList();
        abstractC4467l.f30620x0 = Collections.emptyList();
        abstractC4467l.f30622z0 = Q.f30393y0;
        abstractC4467l.f30599B0 = Collections.emptyList();
        abstractC4467l.f30600C0 = Collections.emptyList();
        abstractC4467l.f30601D0 = Collections.emptyList();
        abstractC4467l.f30602E0 = X.f30463l0;
        abstractC4467l.f30603F0 = Collections.emptyList();
        abstractC4467l.f30604G0 = e0.f30572j0;
        return abstractC4467l;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        C3042j e10 = e();
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
        C3042j c3042j = null;
        try {
            try {
                g((C3042j) C3042j.f30633P0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                C3042j c3042j2 = (C3042j) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    c3042j = c3042j2;
                    if (c3042j != null) {
                        g(c3042j);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (c3042j != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        g((C3042j) pVar);
        return this;
    }

    public final Object clone() {
        C3040h f6 = f();
        f6.g(e());
        return f6;
    }

    public final C3042j e() {
        C3042j c3042j = new C3042j(this);
        int i10 = this.f30605i0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        c3042j.f30650i0 = this.f30606j0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c3042j.f30651j0 = this.f30607k0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c3042j.f30652k0 = this.f30608l0;
        if ((i10 & 8) == 8) {
            this.f30609m0 = Collections.unmodifiableList(this.f30609m0);
            this.f30605i0 &= -9;
        }
        c3042j.f30653l0 = this.f30609m0;
        if ((this.f30605i0 & 16) == 16) {
            this.f30610n0 = Collections.unmodifiableList(this.f30610n0);
            this.f30605i0 &= -17;
        }
        c3042j.f30654m0 = this.f30610n0;
        if ((this.f30605i0 & 32) == 32) {
            this.f30611o0 = Collections.unmodifiableList(this.f30611o0);
            this.f30605i0 &= -33;
        }
        c3042j.f30655n0 = this.f30611o0;
        if ((this.f30605i0 & 64) == 64) {
            this.f30612p0 = Collections.unmodifiableList(this.f30612p0);
            this.f30605i0 &= -65;
        }
        c3042j.f30657p0 = this.f30612p0;
        if ((this.f30605i0 & 128) == 128) {
            this.f30613q0 = Collections.unmodifiableList(this.f30613q0);
            this.f30605i0 &= -129;
        }
        c3042j.f30659r0 = this.f30613q0;
        if ((this.f30605i0 & 256) == 256) {
            this.f30614r0 = Collections.unmodifiableList(this.f30614r0);
            this.f30605i0 &= -257;
        }
        c3042j.f30660s0 = this.f30614r0;
        if ((this.f30605i0 & 512) == 512) {
            this.f30615s0 = Collections.unmodifiableList(this.f30615s0);
            this.f30605i0 &= -513;
        }
        c3042j.f30662u0 = this.f30615s0;
        if ((this.f30605i0 & 1024) == 1024) {
            this.f30616t0 = Collections.unmodifiableList(this.f30616t0);
            this.f30605i0 &= -1025;
        }
        c3042j.f30663v0 = this.f30616t0;
        if ((this.f30605i0 & 2048) == 2048) {
            this.f30617u0 = Collections.unmodifiableList(this.f30617u0);
            this.f30605i0 &= -2049;
        }
        c3042j.f30664w0 = this.f30617u0;
        if ((this.f30605i0 & 4096) == 4096) {
            this.f30618v0 = Collections.unmodifiableList(this.f30618v0);
            this.f30605i0 &= -4097;
        }
        c3042j.f30665x0 = this.f30618v0;
        if ((this.f30605i0 & 8192) == 8192) {
            this.f30619w0 = Collections.unmodifiableList(this.f30619w0);
            this.f30605i0 &= -8193;
        }
        c3042j.f30666y0 = this.f30619w0;
        if ((this.f30605i0 & 16384) == 16384) {
            this.f30620x0 = Collections.unmodifiableList(this.f30620x0);
            this.f30605i0 &= -16385;
        }
        c3042j.f30667z0 = this.f30620x0;
        if ((i10 & 32768) == 32768) {
            i11 |= 8;
        }
        c3042j.f30635B0 = this.f30621y0;
        if ((i10 & 65536) == 65536) {
            i11 |= 16;
        }
        c3042j.f30636C0 = this.f30622z0;
        if ((i10 & 131072) == 131072) {
            i11 |= 32;
        }
        c3042j.f30637D0 = this.f30598A0;
        if ((this.f30605i0 & 262144) == 262144) {
            this.f30599B0 = Collections.unmodifiableList(this.f30599B0);
            this.f30605i0 &= -262145;
        }
        c3042j.f30638E0 = this.f30599B0;
        if ((this.f30605i0 & 524288) == 524288) {
            this.f30600C0 = Collections.unmodifiableList(this.f30600C0);
            this.f30605i0 &= -524289;
        }
        c3042j.f30640G0 = this.f30600C0;
        if ((this.f30605i0 & 1048576) == 1048576) {
            this.f30601D0 = Collections.unmodifiableList(this.f30601D0);
            this.f30605i0 &= -1048577;
        }
        c3042j.f30641H0 = this.f30601D0;
        if ((i10 & 2097152) == 2097152) {
            i11 |= 64;
        }
        c3042j.f30643J0 = this.f30602E0;
        if ((this.f30605i0 & 4194304) == 4194304) {
            this.f30603F0 = Collections.unmodifiableList(this.f30603F0);
            this.f30605i0 &= -4194305;
        }
        c3042j.f30644K0 = this.f30603F0;
        if ((i10 & 8388608) == 8388608) {
            i11 |= 128;
        }
        c3042j.f30645L0 = this.f30604G0;
        c3042j.f30649h0 = i11;
        return c3042j;
    }

    public final void g(C3042j c3042j) {
        e0 e0Var;
        X x10;
        Q q10;
        if (c3042j == C3042j.f30632O0) {
            return;
        }
        int i10 = c3042j.f30649h0;
        if ((i10 & 1) == 1) {
            int i11 = c3042j.f30650i0;
            this.f30605i0 = 1 | this.f30605i0;
            this.f30606j0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = c3042j.f30651j0;
            this.f30605i0 |= 2;
            this.f30607k0 = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = c3042j.f30652k0;
            this.f30605i0 = 4 | this.f30605i0;
            this.f30608l0 = i13;
        }
        if (!c3042j.f30653l0.isEmpty()) {
            if (this.f30609m0.isEmpty()) {
                this.f30609m0 = c3042j.f30653l0;
                this.f30605i0 &= -9;
            } else {
                if ((this.f30605i0 & 8) != 8) {
                    this.f30609m0 = new ArrayList(this.f30609m0);
                    this.f30605i0 |= 8;
                }
                this.f30609m0.addAll(c3042j.f30653l0);
            }
        }
        if (!c3042j.f30654m0.isEmpty()) {
            if (this.f30610n0.isEmpty()) {
                this.f30610n0 = c3042j.f30654m0;
                this.f30605i0 &= -17;
            } else {
                if ((this.f30605i0 & 16) != 16) {
                    this.f30610n0 = new ArrayList(this.f30610n0);
                    this.f30605i0 |= 16;
                }
                this.f30610n0.addAll(c3042j.f30654m0);
            }
        }
        if (!c3042j.f30655n0.isEmpty()) {
            if (this.f30611o0.isEmpty()) {
                this.f30611o0 = c3042j.f30655n0;
                this.f30605i0 &= -33;
            } else {
                if ((this.f30605i0 & 32) != 32) {
                    this.f30611o0 = new ArrayList(this.f30611o0);
                    this.f30605i0 |= 32;
                }
                this.f30611o0.addAll(c3042j.f30655n0);
            }
        }
        if (!c3042j.f30657p0.isEmpty()) {
            if (this.f30612p0.isEmpty()) {
                this.f30612p0 = c3042j.f30657p0;
                this.f30605i0 &= -65;
            } else {
                if ((this.f30605i0 & 64) != 64) {
                    this.f30612p0 = new ArrayList(this.f30612p0);
                    this.f30605i0 |= 64;
                }
                this.f30612p0.addAll(c3042j.f30657p0);
            }
        }
        if (!c3042j.f30659r0.isEmpty()) {
            if (this.f30613q0.isEmpty()) {
                this.f30613q0 = c3042j.f30659r0;
                this.f30605i0 &= -129;
            } else {
                if ((this.f30605i0 & 128) != 128) {
                    this.f30613q0 = new ArrayList(this.f30613q0);
                    this.f30605i0 |= 128;
                }
                this.f30613q0.addAll(c3042j.f30659r0);
            }
        }
        if (!c3042j.f30660s0.isEmpty()) {
            if (this.f30614r0.isEmpty()) {
                this.f30614r0 = c3042j.f30660s0;
                this.f30605i0 &= -257;
            } else {
                if ((this.f30605i0 & 256) != 256) {
                    this.f30614r0 = new ArrayList(this.f30614r0);
                    this.f30605i0 |= 256;
                }
                this.f30614r0.addAll(c3042j.f30660s0);
            }
        }
        if (!c3042j.f30662u0.isEmpty()) {
            if (this.f30615s0.isEmpty()) {
                this.f30615s0 = c3042j.f30662u0;
                this.f30605i0 &= -513;
            } else {
                if ((this.f30605i0 & 512) != 512) {
                    this.f30615s0 = new ArrayList(this.f30615s0);
                    this.f30605i0 |= 512;
                }
                this.f30615s0.addAll(c3042j.f30662u0);
            }
        }
        if (!c3042j.f30663v0.isEmpty()) {
            if (this.f30616t0.isEmpty()) {
                this.f30616t0 = c3042j.f30663v0;
                this.f30605i0 &= -1025;
            } else {
                if ((this.f30605i0 & 1024) != 1024) {
                    this.f30616t0 = new ArrayList(this.f30616t0);
                    this.f30605i0 |= 1024;
                }
                this.f30616t0.addAll(c3042j.f30663v0);
            }
        }
        if (!c3042j.f30664w0.isEmpty()) {
            if (this.f30617u0.isEmpty()) {
                this.f30617u0 = c3042j.f30664w0;
                this.f30605i0 &= -2049;
            } else {
                if ((this.f30605i0 & 2048) != 2048) {
                    this.f30617u0 = new ArrayList(this.f30617u0);
                    this.f30605i0 |= 2048;
                }
                this.f30617u0.addAll(c3042j.f30664w0);
            }
        }
        if (!c3042j.f30665x0.isEmpty()) {
            if (this.f30618v0.isEmpty()) {
                this.f30618v0 = c3042j.f30665x0;
                this.f30605i0 &= -4097;
            } else {
                if ((this.f30605i0 & 4096) != 4096) {
                    this.f30618v0 = new ArrayList(this.f30618v0);
                    this.f30605i0 |= 4096;
                }
                this.f30618v0.addAll(c3042j.f30665x0);
            }
        }
        if (!c3042j.f30666y0.isEmpty()) {
            if (this.f30619w0.isEmpty()) {
                this.f30619w0 = c3042j.f30666y0;
                this.f30605i0 &= -8193;
            } else {
                if ((this.f30605i0 & 8192) != 8192) {
                    this.f30619w0 = new ArrayList(this.f30619w0);
                    this.f30605i0 |= 8192;
                }
                this.f30619w0.addAll(c3042j.f30666y0);
            }
        }
        if (!c3042j.f30667z0.isEmpty()) {
            if (this.f30620x0.isEmpty()) {
                this.f30620x0 = c3042j.f30667z0;
                this.f30605i0 &= -16385;
            } else {
                if ((this.f30605i0 & 16384) != 16384) {
                    this.f30620x0 = new ArrayList(this.f30620x0);
                    this.f30605i0 |= 16384;
                }
                this.f30620x0.addAll(c3042j.f30667z0);
            }
        }
        int i14 = c3042j.f30649h0;
        if ((i14 & 8) == 8) {
            int i15 = c3042j.f30635B0;
            this.f30605i0 |= 32768;
            this.f30621y0 = i15;
        }
        if ((i14 & 16) == 16) {
            Q q11 = c3042j.f30636C0;
            if ((this.f30605i0 & 65536) == 65536 && (q10 = this.f30622z0) != Q.f30393y0) {
                P q12 = Q.q(q10);
                q12.g(q11);
                this.f30622z0 = q12.e();
            } else {
                this.f30622z0 = q11;
            }
            this.f30605i0 |= 65536;
        }
        if ((c3042j.f30649h0 & 32) == 32) {
            int i16 = c3042j.f30637D0;
            this.f30605i0 |= 131072;
            this.f30598A0 = i16;
        }
        if (!c3042j.f30638E0.isEmpty()) {
            if (this.f30599B0.isEmpty()) {
                this.f30599B0 = c3042j.f30638E0;
                this.f30605i0 &= -262145;
            } else {
                if ((this.f30605i0 & 262144) != 262144) {
                    this.f30599B0 = new ArrayList(this.f30599B0);
                    this.f30605i0 |= 262144;
                }
                this.f30599B0.addAll(c3042j.f30638E0);
            }
        }
        if (!c3042j.f30640G0.isEmpty()) {
            if (this.f30600C0.isEmpty()) {
                this.f30600C0 = c3042j.f30640G0;
                this.f30605i0 &= -524289;
            } else {
                if ((this.f30605i0 & 524288) != 524288) {
                    this.f30600C0 = new ArrayList(this.f30600C0);
                    this.f30605i0 |= 524288;
                }
                this.f30600C0.addAll(c3042j.f30640G0);
            }
        }
        if (!c3042j.f30641H0.isEmpty()) {
            if (this.f30601D0.isEmpty()) {
                this.f30601D0 = c3042j.f30641H0;
                this.f30605i0 &= -1048577;
            } else {
                if ((this.f30605i0 & 1048576) != 1048576) {
                    this.f30601D0 = new ArrayList(this.f30601D0);
                    this.f30605i0 |= 1048576;
                }
                this.f30601D0.addAll(c3042j.f30641H0);
            }
        }
        if ((c3042j.f30649h0 & 64) == 64) {
            X x11 = c3042j.f30643J0;
            if ((this.f30605i0 & 2097152) == 2097152 && (x10 = this.f30602E0) != X.f30463l0) {
                C3038f g10 = X.g(x10);
                g10.i(x11);
                this.f30602E0 = g10.f();
            } else {
                this.f30602E0 = x11;
            }
            this.f30605i0 |= 2097152;
        }
        if (!c3042j.f30644K0.isEmpty()) {
            if (this.f30603F0.isEmpty()) {
                this.f30603F0 = c3042j.f30644K0;
                this.f30605i0 &= -4194305;
            } else {
                if ((this.f30605i0 & 4194304) != 4194304) {
                    this.f30603F0 = new ArrayList(this.f30603F0);
                    this.f30605i0 |= 4194304;
                }
                this.f30603F0.addAll(c3042j.f30644K0);
            }
        }
        if ((c3042j.f30649h0 & 128) == 128) {
            e0 e0Var2 = c3042j.f30645L0;
            if ((this.f30605i0 & 8388608) == 8388608 && (e0Var = this.f30604G0) != e0.f30572j0) {
                C3045m c3045m = new C3045m(2);
                c3045m.k(e0Var);
                c3045m.k(e0Var2);
                this.f30604G0 = c3045m.g();
            } else {
                this.f30604G0 = e0Var2;
            }
            this.f30605i0 |= 8388608;
        }
        d(c3042j);
        this.f38400Y = this.f38400Y.r(c3042j.f30648Z);
    }
}
