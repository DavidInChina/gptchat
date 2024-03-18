package g4;

import Df.H;
import E0.AbstractC0454m;
import Z.C1718j0;
import Z.C1720k0;
import Z.C1724m0;
import Z.o1;
import android.os.SystemClock;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.C5347k;
import t0.AbstractC5650i;
import u0.AbstractC5824b;

/* renamed from: g4.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3195w extends AbstractC5824b {

    /* renamed from: k0  reason: collision with root package name */
    public AbstractC5824b f31266k0;

    /* renamed from: l0  reason: collision with root package name */
    public final AbstractC5824b f31267l0;

    /* renamed from: m0  reason: collision with root package name */
    public final AbstractC0454m f31268m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f31269n0;

    /* renamed from: o0  reason: collision with root package name */
    public final boolean f31270o0;

    /* renamed from: p0  reason: collision with root package name */
    public final boolean f31271p0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f31274s0;

    /* renamed from: q0  reason: collision with root package name */
    public final C1720k0 f31272q0 = U3.f.h0(0);

    /* renamed from: r0  reason: collision with root package name */
    public long f31273r0 = -1;

    /* renamed from: t0  reason: collision with root package name */
    public final C1718j0 f31275t0 = H.h0(1.0f);

    /* renamed from: u0  reason: collision with root package name */
    public final C1724m0 f31276u0 = AbstractC4828h.Z(null, o1.f22665a);

    public C3195w(AbstractC5824b abstractC5824b, AbstractC5824b abstractC5824b2, AbstractC0454m abstractC0454m, int i10, boolean z10, boolean z11) {
        this.f31266k0 = abstractC5824b;
        this.f31267l0 = abstractC5824b2;
        this.f31268m0 = abstractC0454m;
        this.f31269n0 = i10;
        this.f31270o0 = z10;
        this.f31271p0 = z11;
    }

    @Override // u0.AbstractC5824b
    public final boolean b(float f6) {
        this.f31275t0.i(f6);
        return true;
    }

    @Override // u0.AbstractC5824b
    public final boolean e(C5347k c5347k) {
        this.f31276u0.setValue(c5347k);
        return true;
    }

    @Override // u0.AbstractC5824b
    public final long h() {
        long j6;
        long j10;
        boolean z10;
        AbstractC5824b abstractC5824b = this.f31266k0;
        if (abstractC5824b != null) {
            j6 = abstractC5824b.h();
        } else {
            j6 = C5254f.f43637b;
        }
        AbstractC5824b abstractC5824b2 = this.f31267l0;
        if (abstractC5824b2 != null) {
            j10 = abstractC5824b2.h();
        } else {
            j10 = C5254f.f43637b;
        }
        long j11 = C5254f.f43638c;
        boolean z11 = false;
        if (j6 != j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 != j11) {
            z11 = true;
        }
        if (z10 && z11) {
            return AbstractC4828h.i(Math.max(C5254f.d(j6), C5254f.d(j10)), Math.max(C5254f.b(j6), C5254f.b(j10)));
        }
        if (this.f31271p0) {
            if (!z10) {
                if (z11) {
                    return j10;
                }
            } else {
                return j6;
            }
        }
        return j11;
    }

    @Override // u0.AbstractC5824b
    public final void i(AbstractC5650i abstractC5650i) {
        float f6;
        boolean z10;
        boolean z11 = this.f31274s0;
        C1718j0 c1718j0 = this.f31275t0;
        AbstractC5824b abstractC5824b = this.f31267l0;
        if (z11) {
            j(abstractC5650i, abstractC5824b, c1718j0.h());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f31273r0 == -1) {
            this.f31273r0 = uptimeMillis;
        }
        float f10 = ((float) (uptimeMillis - this.f31273r0)) / this.f31269n0;
        float h10 = c1718j0.h() * N.o(f10, 0.0f, 1.0f);
        if (this.f31270o0) {
            f6 = c1718j0.h() - h10;
        } else {
            f6 = c1718j0.h();
        }
        if (f10 >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31274s0 = z10;
        j(abstractC5650i, this.f31266k0, f6);
        j(abstractC5650i, abstractC5824b, h10);
        if (this.f31274s0) {
            this.f31266k0 = null;
            return;
        }
        C1720k0 c1720k0 = this.f31272q0;
        c1720k0.i(c1720k0.h() + 1);
    }

    public final void j(AbstractC5650i abstractC5650i, AbstractC5824b abstractC5824b, float f6) {
        long j6;
        if (abstractC5824b != null && f6 > 0.0f) {
            long g10 = abstractC5650i.g();
            long h10 = abstractC5824b.h();
            long j10 = C5254f.f43638c;
            if (h10 == j10 || C5254f.f(h10) || g10 == j10 || C5254f.f(g10)) {
                j6 = g10;
            } else {
                j6 = androidx.compose.ui.layout.a.m(h10, this.f31268m0.a(h10, g10));
            }
            int i10 = (g10 > j10 ? 1 : (g10 == j10 ? 0 : -1));
            C1724m0 c1724m0 = this.f31276u0;
            if (i10 == 0 || C5254f.f(g10)) {
                abstractC5824b.g(abstractC5650i, j6, f6, (C5347k) c1724m0.getValue());
                return;
            }
            float f10 = 2;
            float d10 = (C5254f.d(g10) - C5254f.d(j6)) / f10;
            float b10 = (C5254f.b(g10) - C5254f.b(j6)) / f10;
            abstractC5650i.V().f45609a.b(d10, b10, d10, b10);
            abstractC5824b.g(abstractC5650i, j6, f6, (C5347k) c1724m0.getValue());
            float f11 = -d10;
            float f12 = -b10;
            abstractC5650i.V().f45609a.b(f11, f12, f11, f12);
        }
    }
}
