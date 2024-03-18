package a0;

import Z.AbstractC1707e;
import Z.AbstractC1734s;
import Z.C1705d;
import Z.C1742w;
import Z.Q0;
import h0.C3289b;
import id.AbstractC3557B;

/* renamed from: a0.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1912i extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final C1912i f23826c = new AbstractC1901G(0, 2, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        boolean z10;
        int i10;
        int i11;
        boolean z11 = false;
        C3289b c3289b = (C3289b) c1902h.b(0);
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>", abstractC1707e);
        int c10 = q02.c((C1705d) c1902h.b(1));
        if (q02.f22560r < c10) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1734s.o(z10);
        r9.y.R0(q02, abstractC1707e, c10);
        int i12 = q02.f22560r;
        int i13 = q02.f22562t;
        while (i13 >= 0 && !M3.H.q(q02.f22544b, q02.o(i13))) {
            i13 = q02.y(q02.f22544b, i13);
        }
        int i14 = i13 + 1;
        int i15 = 0;
        while (i14 < i12) {
            if (q02.q(i12, i14)) {
                if (M3.H.q(q02.f22544b, q02.o(i14))) {
                    i15 = 0;
                }
                i14++;
            } else {
                if (M3.H.q(q02.f22544b, q02.o(i14))) {
                    i11 = 1;
                } else {
                    i11 = M3.H.s(q02.f22544b, q02.o(i14));
                }
                i15 += i11;
                i14 += q02.p(i14);
            }
        }
        while (true) {
            i10 = q02.f22560r;
            if (i10 >= c10) {
                break;
            } else if (q02.q(c10, i10)) {
                int i16 = q02.f22560r;
                if (i16 < q02.f22561s && M3.H.q(q02.f22544b, q02.o(i16))) {
                    abstractC1707e.c(q02.x(q02.f22560r));
                    i15 = 0;
                }
                q02.I();
            } else {
                i15 += q02.E();
            }
        }
        if (i10 == c10) {
            z11 = true;
        }
        AbstractC1734s.o(z11);
        c3289b.f31682a = i15;
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "effectiveNodeIndexOut";
        }
        if (A7.b.A0(i10, 1)) {
            return "anchor";
        }
        return super.c(i10);
    }
}
