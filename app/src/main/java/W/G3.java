package W;

import A.C0051x;
import Z.AbstractC1725n;
import Z.C1737t0;
import androidx.compose.foundation.BorderModifierNodeElement;
import h0.C3288a;
import l0.AbstractC4326r;
import l0.C4323o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public abstract class G3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Z.O f19172a = A7.b.o0(Q0.f19572n0);

    public static final void a(AbstractC4326r abstractC4326r, r0.L l10, long j6, long j10, float f6, float f10, C0051x c0051x, C3288a c3288a, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r abstractC4326r2;
        r0.L l11;
        long j11;
        long j12;
        float f11;
        float f12;
        C0051x c0051x2;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-513881741);
        if ((i11 & 1) != 0) {
            abstractC4326r2 = C4323o.f37719b;
        } else {
            abstractC4326r2 = abstractC4326r;
        }
        if ((i11 & 2) != 0) {
            l11 = r0.G.f44171a;
        } else {
            l11 = l10;
        }
        if ((i11 & 4) != 0) {
            j11 = ((P0) rVar.m(R0.f19593a)).f19532p;
        } else {
            j11 = j6;
        }
        if ((i11 & 8) != 0) {
            j12 = R0.b(j11, rVar);
        } else {
            j12 = j10;
        }
        if ((i11 & 16) != 0) {
            f11 = 0;
        } else {
            f11 = f6;
        }
        if ((i11 & 32) != 0) {
            f12 = 0;
        } else {
            f12 = f10;
        }
        if ((i11 & 64) != 0) {
            c0051x2 = null;
        } else {
            c0051x2 = c0051x;
        }
        Z.O o10 = f19172a;
        float f13 = f11 + ((Z0.e) rVar.m(o10)).f22788Y;
        A7.b.l(new C1737t0[]{R.a.q(j12, Z0.f19875a), o10.b(new Z0.e(f13))}, R4.b.X(rVar, -70914509, new D3(abstractC4326r2, l11, j11, f13, c0051x2, f12, c3288a)), rVar, 48);
        rVar.t(false);
    }

    public static final void b(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, boolean z10, r0.L l10, long j6, long j10, float f6, float f10, C0051x c0051x, D.m mVar, C3288a c3288a, AbstractC1725n abstractC1725n, int i10, int i11) {
        long j11;
        float f11;
        float f12;
        C0051x c0051x2;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-789752804);
        if ((i11 & 32) != 0) {
            j11 = R0.b(j6, rVar);
        } else {
            j11 = j10;
        }
        if ((i11 & 64) != 0) {
            f11 = 0;
        } else {
            f11 = f6;
        }
        if ((i11 & 128) != 0) {
            f12 = 0;
        } else {
            f12 = f10;
        }
        if ((i11 & 256) != 0) {
            c0051x2 = null;
        } else {
            c0051x2 = c0051x;
        }
        Z.O o10 = f19172a;
        float f13 = ((Z0.e) rVar.m(o10)).f22788Y + f11;
        A7.b.l(new C1737t0[]{R.a.q(j11, Z0.f19875a), o10.b(new Z0.e(f13))}, R4.b.X(rVar, 1279702876, new E3(abstractC4326r, l10, j6, f13, c0051x2, mVar, z10, abstractC6216a, f12, c3288a)), rVar, 48);
        rVar.t(false);
    }

    public static final AbstractC4326r c(AbstractC4326r abstractC4326r, r0.L l10, long j6, C0051x c0051x, float f6) {
        AbstractC4326r abstractC4326r2;
        AbstractC4326r m10 = androidx.compose.ui.graphics.a.m(abstractC4326r, 0.0f, 0.0f, 0.0f, f6, 0.0f, 0L, l10, false, 124895);
        if (c0051x != null) {
            abstractC4326r2 = new BorderModifierNodeElement(c0051x.f321a, c0051x.f322b, l10);
        } else {
            abstractC4326r2 = C4323o.f37719b;
        }
        return androidx.compose.ui.draw.a.b(androidx.compose.foundation.a.d(m10.g(abstractC4326r2), j6, l10), l10);
    }

    public static final long d(long j6, float f6, AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-2079918090);
        P0 p02 = (P0) rVar.m(R0.f19593a);
        boolean booleanValue = ((Boolean) rVar.m(R0.f19594b)).booleanValue();
        if (r0.r.c(j6, p02.f19532p) && booleanValue) {
            j6 = R0.g(p02, f6);
        }
        rVar.t(false);
        return j6;
    }
}
