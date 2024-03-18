package o0;

import E0.AbstractC0454m;
import E0.AbstractC0459s;
import E0.M;
import E0.O;
import E0.P;
import E0.d0;
import E0.r;
import G0.AbstractC0590t;
import G0.C;
import G0.J;
import Ng.H;
import kf.w;
import l0.AbstractC4313e;
import l0.AbstractC4325q;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.C5347k;
import t0.AbstractC5646e;
import t0.C5644c;
import u0.AbstractC5824b;
import y.D;

/* renamed from: o0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4875j extends AbstractC4325q implements C, AbstractC0590t {

    /* renamed from: s0  reason: collision with root package name */
    public AbstractC5824b f40424s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f40425t0;

    /* renamed from: u0  reason: collision with root package name */
    public AbstractC4313e f40426u0;

    /* renamed from: v0  reason: collision with root package name */
    public AbstractC0454m f40427v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f40428w0;

    /* renamed from: x0  reason: collision with root package name */
    public C5347k f40429x0;

    public static boolean B0(long j6) {
        if (!C5254f.a(j6, C5254f.f43638c)) {
            float b10 = C5254f.b(j6);
            if (!Float.isInfinite(b10) && !Float.isNaN(b10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean C0(long j6) {
        if (!C5254f.a(j6, C5254f.f43638c)) {
            float d10 = C5254f.d(j6);
            if (!Float.isInfinite(d10) && !Float.isNaN(d10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0() {
        if (this.f40425t0) {
            long h10 = this.f40424s0.h();
            int i10 = C5254f.f43639d;
            if (h10 != C5254f.f43638c) {
                return true;
            }
        }
        return false;
    }

    public final long D0(long j6) {
        boolean z10;
        int i10;
        int i11;
        float f6;
        float f10;
        boolean z11 = false;
        if (Z0.a.d(j6) && Z0.a.c(j6)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Z0.a.f(j6) && Z0.a.e(j6)) {
            z11 = true;
        }
        if ((!A0() && z10) || z11) {
            return Z0.a.a(j6, Z0.a.h(j6), 0, Z0.a.g(j6), 0, 10);
        }
        long h10 = this.f40424s0.h();
        if (C0(h10)) {
            i10 = AbstractC4344b.Y0(C5254f.d(h10));
        } else {
            i10 = Z0.a.j(j6);
        }
        if (B0(h10)) {
            i11 = AbstractC4344b.Y0(C5254f.b(h10));
        } else {
            i11 = Z0.a.i(j6);
        }
        long i12 = AbstractC4828h.i(A7.b.t0(i10, j6), A7.b.s0(i11, j6));
        if (A0()) {
            if (!C0(this.f40424s0.h())) {
                f6 = C5254f.d(i12);
            } else {
                f6 = C5254f.d(this.f40424s0.h());
            }
            if (!B0(this.f40424s0.h())) {
                f10 = C5254f.b(i12);
            } else {
                f10 = C5254f.b(this.f40424s0.h());
            }
            long i13 = AbstractC4828h.i(f6, f10);
            if (C5254f.d(i12) == 0.0f || C5254f.b(i12) == 0.0f) {
                i12 = C5254f.f43637b;
            } else {
                i12 = androidx.compose.ui.layout.a.m(i13, this.f40427v0.a(i13, i12));
            }
        }
        return Z0.a.a(j6, A7.b.t0(AbstractC4344b.Y0(C5254f.d(i12)), j6), 0, A7.b.s0(AbstractC4344b.Y0(C5254f.b(i12)), j6), 0, 10);
    }

    @Override // G0.C
    public final int c(AbstractC0459s abstractC0459s, r rVar, int i10) {
        if (A0()) {
            long D02 = D0(A7.b.n(0, i10, 0, 0, 13));
            return Math.max(Z0.a.i(D02), rVar.S(i10));
        }
        return rVar.S(i10);
    }

    @Override // G0.C
    public final int d(AbstractC0459s abstractC0459s, r rVar, int i10) {
        if (A0()) {
            long D02 = D0(A7.b.n(0, 0, 0, i10, 7));
            return Math.max(Z0.a.j(D02), rVar.l(i10));
        }
        return rVar.l(i10);
    }

    @Override // G0.C
    public final O e(P p10, M m10, long j6) {
        d0 o10 = m10.o(D0(j6));
        return p10.j0(o10.f4053Y, o10.f4054Z, w.f37484Y, new D(o10, 12));
    }

    @Override // G0.AbstractC0590t
    public final void f(AbstractC5646e abstractC5646e) {
        float f6;
        float f10;
        long j6;
        long h10 = this.f40424s0.h();
        if (C0(h10)) {
            f6 = C5254f.d(h10);
        } else {
            f6 = C5254f.d(((J) abstractC5646e).f5596Y.g());
        }
        if (B0(h10)) {
            f10 = C5254f.b(h10);
        } else {
            f10 = C5254f.b(((J) abstractC5646e).f5596Y.g());
        }
        long i10 = AbstractC4828h.i(f6, f10);
        J j10 = (J) abstractC5646e;
        if (C5254f.d(j10.f5596Y.g()) != 0.0f) {
            C5644c c5644c = j10.f5596Y;
            if (C5254f.b(c5644c.g()) != 0.0f) {
                j6 = androidx.compose.ui.layout.a.m(i10, this.f40427v0.a(i10, c5644c.g()));
                long j11 = j6;
                AbstractC4313e abstractC4313e = this.f40426u0;
                long c10 = H.c(AbstractC4344b.Y0(C5254f.d(j11)), AbstractC4344b.Y0(C5254f.b(j11)));
                C5644c c5644c2 = j10.f5596Y;
                long a5 = abstractC4313e.a(c10, H.c(AbstractC4344b.Y0(C5254f.d(c5644c2.g())), AbstractC4344b.Y0(C5254f.b(c5644c2.g()))), j10.getLayoutDirection());
                int i11 = Z0.i.f22798c;
                float f11 = (int) (a5 >> 32);
                float f12 = (int) (a5 & 4294967295L);
                j10.f5596Y.f45612Z.f45609a.e(f11, f12);
                this.f40424s0.g(abstractC5646e, j11, this.f40428w0, this.f40429x0);
                ((J) abstractC5646e).f5596Y.f45612Z.f45609a.e(-f11, -f12);
                j10.a();
            }
        }
        j6 = C5254f.f43637b;
        long j112 = j6;
        AbstractC4313e abstractC4313e2 = this.f40426u0;
        long c102 = H.c(AbstractC4344b.Y0(C5254f.d(j112)), AbstractC4344b.Y0(C5254f.b(j112)));
        C5644c c5644c22 = j10.f5596Y;
        long a52 = abstractC4313e2.a(c102, H.c(AbstractC4344b.Y0(C5254f.d(c5644c22.g())), AbstractC4344b.Y0(C5254f.b(c5644c22.g()))), j10.getLayoutDirection());
        int i112 = Z0.i.f22798c;
        float f112 = (int) (a52 >> 32);
        float f122 = (int) (a52 & 4294967295L);
        j10.f5596Y.f45612Z.f45609a.e(f112, f122);
        this.f40424s0.g(abstractC5646e, j112, this.f40428w0, this.f40429x0);
        ((J) abstractC5646e).f5596Y.f45612Z.f45609a.e(-f112, -f122);
        j10.a();
    }

    @Override // G0.C
    public final int h(AbstractC0459s abstractC0459s, r rVar, int i10) {
        if (A0()) {
            long D02 = D0(A7.b.n(0, 0, 0, i10, 7));
            return Math.max(Z0.a.j(D02), rVar.m(i10));
        }
        return rVar.m(i10);
    }

    @Override // G0.C
    public final int i(AbstractC0459s abstractC0459s, r rVar, int i10) {
        if (A0()) {
            long D02 = D0(A7.b.n(0, i10, 0, 0, 13));
            return Math.max(Z0.a.i(D02), rVar.c(i10));
        }
        return rVar.c(i10);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f40424s0 + ", sizeToIntrinsics=" + this.f40425t0 + ", alignment=" + this.f40426u0 + ", alpha=" + this.f40428w0 + ", colorFilter=" + this.f40429x0 + ')';
    }

    @Override // G0.AbstractC0590t
    public final /* synthetic */ void G() {
    }
}
