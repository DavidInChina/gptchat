package g4;

import E0.AbstractC0454m;
import E0.AbstractC0459s;
import E0.M;
import E0.O;
import E0.P;
import E0.d0;
import E0.j0;
import G0.AbstractC0590t;
import G0.C;
import G0.J;
import Ng.H;
import com.google.android.gms.internal.play_billing.N;
import l0.AbstractC4313e;
import l0.AbstractC4325q;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.C5347k;
import t0.AbstractC5646e;
import u0.AbstractC5824b;
import y.D;

/* renamed from: g4.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3194v extends AbstractC4325q implements AbstractC0590t, C {

    /* renamed from: s0  reason: collision with root package name */
    public AbstractC5824b f31261s0;

    /* renamed from: t0  reason: collision with root package name */
    public AbstractC4313e f31262t0;

    /* renamed from: u0  reason: collision with root package name */
    public AbstractC0454m f31263u0;

    /* renamed from: v0  reason: collision with root package name */
    public float f31264v0;

    /* renamed from: w0  reason: collision with root package name */
    public C5347k f31265w0;

    public final long A0(long j6) {
        if (C5254f.f(j6)) {
            int i10 = C5254f.f43639d;
            return C5254f.f43637b;
        }
        long h10 = this.f31261s0.h();
        int i11 = C5254f.f43639d;
        if (h10 == C5254f.f43638c) {
            return j6;
        }
        float d10 = C5254f.d(h10);
        if (Float.isInfinite(d10) || Float.isNaN(d10)) {
            d10 = C5254f.d(j6);
        }
        float b10 = C5254f.b(h10);
        if (Float.isInfinite(b10) || Float.isNaN(b10)) {
            b10 = C5254f.b(j6);
        }
        long i12 = AbstractC4828h.i(d10, b10);
        long a5 = this.f31263u0.a(i12, j6);
        float a10 = j0.a(a5);
        if (!Float.isInfinite(a10) && !Float.isNaN(a10)) {
            float b11 = j0.b(a5);
            if (!Float.isInfinite(b11) && !Float.isNaN(b11)) {
                return androidx.compose.ui.layout.a.m(i12, a5);
            }
            return j6;
        }
        return j6;
    }

    public final long B0(long j6) {
        boolean z10;
        float f6;
        float f10;
        int i10;
        boolean f11 = Z0.a.f(j6);
        boolean e10 = Z0.a.e(j6);
        if (f11 && e10) {
            return j6;
        }
        if (Z0.a.d(j6) && Z0.a.c(j6)) {
            z10 = true;
        } else {
            z10 = false;
        }
        long h10 = this.f31261s0.h();
        if (h10 == C5254f.f43638c) {
            if (z10) {
                return Z0.a.a(j6, Z0.a.h(j6), 0, Z0.a.g(j6), 0, 10);
            }
            return j6;
        }
        if (z10 && (f11 || e10)) {
            f10 = Z0.a.h(j6);
            i10 = Z0.a.g(j6);
        } else {
            float d10 = C5254f.d(h10);
            float b10 = C5254f.b(h10);
            if (!Float.isInfinite(d10) && !Float.isNaN(d10)) {
                r4.e eVar = AbstractC3172A.f31191b;
                f10 = N.o(d10, Z0.a.j(j6), Z0.a.h(j6));
            } else {
                f10 = Z0.a.j(j6);
            }
            if (!Float.isInfinite(b10) && !Float.isNaN(b10)) {
                r4.e eVar2 = AbstractC3172A.f31191b;
                f6 = N.o(b10, Z0.a.i(j6), Z0.a.g(j6));
                long A02 = A0(AbstractC4828h.i(f10, f6));
                return Z0.a.a(j6, A7.b.t0(AbstractC4344b.Y0(C5254f.d(A02)), j6), 0, A7.b.s0(AbstractC4344b.Y0(C5254f.b(A02)), j6), 0, 10);
            }
            i10 = Z0.a.i(j6);
        }
        f6 = i10;
        long A022 = A0(AbstractC4828h.i(f10, f6));
        return Z0.a.a(j6, A7.b.t0(AbstractC4344b.Y0(C5254f.d(A022)), j6), 0, A7.b.s0(AbstractC4344b.Y0(C5254f.b(A022)), j6), 0, 10);
    }

    @Override // G0.C
    public final int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f31261s0.h() != C5254f.f43638c) {
            int S = rVar.S(Z0.a.h(B0(A7.b.n(0, i10, 0, 0, 13))));
            return Math.max(AbstractC4344b.Y0(C5254f.b(A0(AbstractC4828h.i(i10, S)))), S);
        }
        return rVar.S(i10);
    }

    @Override // G0.C
    public final int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f31261s0.h() != C5254f.f43638c) {
            int l10 = rVar.l(Z0.a.g(B0(A7.b.n(0, 0, 0, i10, 7))));
            return Math.max(AbstractC4344b.Y0(C5254f.d(A0(AbstractC4828h.i(l10, i10)))), l10);
        }
        return rVar.l(i10);
    }

    @Override // G0.C
    public final O e(P p10, M m10, long j6) {
        d0 o10 = m10.o(B0(j6));
        return p10.j0(o10.f4053Y, o10.f4054Z, kf.w.f37484Y, new D(o10, 16));
    }

    @Override // G0.AbstractC0590t
    public final void f(AbstractC5646e abstractC5646e) {
        J j6 = (J) abstractC5646e;
        long A02 = A0(j6.f5596Y.g());
        AbstractC4313e abstractC4313e = this.f31262t0;
        r4.e eVar = AbstractC3172A.f31191b;
        long c10 = H.c(AbstractC4344b.Y0(C5254f.d(A02)), AbstractC4344b.Y0(C5254f.b(A02)));
        long g10 = j6.f5596Y.g();
        long a5 = abstractC4313e.a(c10, H.c(AbstractC4344b.Y0(C5254f.d(g10)), AbstractC4344b.Y0(C5254f.b(g10))), j6.getLayoutDirection());
        int i10 = Z0.i.f22798c;
        float f6 = (int) (a5 >> 32);
        float f10 = (int) (a5 & 4294967295L);
        j6.f5596Y.f45612Z.f45609a.e(f6, f10);
        this.f31261s0.g(abstractC5646e, A02, this.f31264v0, this.f31265w0);
        ((J) abstractC5646e).f5596Y.f45612Z.f45609a.e(-f6, -f10);
        j6.a();
    }

    @Override // G0.C
    public final int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f31261s0.h() != C5254f.f43638c) {
            int m10 = rVar.m(Z0.a.g(B0(A7.b.n(0, 0, 0, i10, 7))));
            return Math.max(AbstractC4344b.Y0(C5254f.d(A0(AbstractC4828h.i(m10, i10)))), m10);
        }
        return rVar.m(i10);
    }

    @Override // G0.C
    public final int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f31261s0.h() != C5254f.f43638c) {
            int c10 = rVar.c(Z0.a.h(B0(A7.b.n(0, i10, 0, 0, 13))));
            return Math.max(AbstractC4344b.Y0(C5254f.b(A0(AbstractC4828h.i(i10, c10)))), c10);
        }
        return rVar.c(i10);
    }

    @Override // l0.AbstractC4325q
    public final boolean q0() {
        return false;
    }

    @Override // G0.AbstractC0590t
    public final /* synthetic */ void G() {
    }
}
