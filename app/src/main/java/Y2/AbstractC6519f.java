package y2;

import E2.C0492y;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.C3636c1;
import p2.C5065s;
import s2.AbstractC5532b;
import z2.C6755D;

/* renamed from: y2.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6519f implements e0 {

    /* renamed from: Z  reason: collision with root package name */
    public final int f50564Z;

    /* renamed from: i0  reason: collision with root package name */
    public j0 f50566i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f50567j0;

    /* renamed from: k0  reason: collision with root package name */
    public C6755D f50568k0;

    /* renamed from: l0  reason: collision with root package name */
    public AbstractC5532b f50569l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f50570m0;

    /* renamed from: n0  reason: collision with root package name */
    public E2.Y f50571n0;

    /* renamed from: o0  reason: collision with root package name */
    public C5065s[] f50572o0;

    /* renamed from: p0  reason: collision with root package name */
    public long f50573p0;

    /* renamed from: q0  reason: collision with root package name */
    public long f50574q0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f50576s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f50577t0;

    /* renamed from: v0  reason: collision with root package name */
    public i0 f50579v0;

    /* renamed from: Y  reason: collision with root package name */
    public final Object f50563Y = new Object();

    /* renamed from: h0  reason: collision with root package name */
    public final C3636c1 f50565h0 = new C3636c1(5, (AbstractC2469q0) null);

    /* renamed from: r0  reason: collision with root package name */
    public long f50575r0 = Long.MIN_VALUE;

    /* renamed from: u0  reason: collision with root package name */
    public p2.g0 f50578u0 = p2.g0.f42063Y;

    public AbstractC6519f(int i10) {
        this.f50564Z = i10;
    }

    public int A() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6527n e(int i10, C5065s c5065s, Exception exc, boolean z10) {
        int i11;
        int i12;
        if (c5065s != null && !this.f50577t0) {
            this.f50577t0 = true;
            try {
                i11 = z(c5065s) & 7;
            } catch (C6527n unused) {
            } finally {
                this.f50577t0 = false;
            }
            String i13 = i();
            int i14 = this.f50567j0;
            if (c5065s != null) {
                i12 = 4;
            } else {
                i12 = i11;
            }
            return new C6527n(1, exc, i10, i13, i14, c5065s, i12, z10);
        }
        i11 = 4;
        String i132 = i();
        int i142 = this.f50567j0;
        if (c5065s != null) {
        }
        return new C6527n(1, exc, i10, i132, i142, c5065s, i12, z10);
    }

    public final C6527n f(C2.v vVar, C5065s c5065s) {
        return e(4002, c5065s, vVar, false);
    }

    public Q h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        if (this.f50575r0 == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean k();

    public abstract boolean l();

    public abstract void m();

    public abstract void o(long j6, boolean z10);

    public abstract void t(C5065s[] c5065sArr, long j6, long j10);

    public final int u(C3636c1 c3636c1, x2.h hVar, int i10) {
        E2.Y y10 = this.f50571n0;
        y10.getClass();
        int q10 = y10.q(c3636c1, hVar, i10);
        if (q10 == -4) {
            if (hVar.g(4)) {
                this.f50575r0 = Long.MIN_VALUE;
                if (this.f50576s0) {
                    return -4;
                }
                return -3;
            }
            long j6 = hVar.f48643l0 + this.f50573p0;
            hVar.f48643l0 = j6;
            this.f50575r0 = Math.max(this.f50575r0, j6);
        } else if (q10 == -5) {
            C5065s c5065s = (C5065s) c3636c1.f34286h0;
            c5065s.getClass();
            long j10 = c5065s.f42323u0;
            if (j10 != Long.MAX_VALUE) {
                p2.r b10 = c5065s.b();
                b10.f42241o = j10 + this.f50573p0;
                c3636c1.f34286h0 = b10.a();
            }
        }
        return q10;
    }

    public abstract void v(long j6, long j10);

    public final void w(C5065s[] c5065sArr, E2.Y y10, long j6, long j10, C0492y c0492y) {
        Gi.e.n(!this.f50576s0);
        this.f50571n0 = y10;
        if (this.f50575r0 == Long.MIN_VALUE) {
            this.f50575r0 = j6;
        }
        this.f50572o0 = c5065sArr;
        this.f50573p0 = j10;
        t(c5065sArr, j6, j10);
    }

    public final void x() {
        boolean z10;
        if (this.f50570m0 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        this.f50565h0.g();
        q();
    }

    public abstract int z(C5065s c5065s);

    public void g() {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    @Override // y2.e0
    public void b(int i10, Object obj) {
    }

    public void n(boolean z10, boolean z11) {
    }

    public void y(float f6, float f10) {
    }
}
