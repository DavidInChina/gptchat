package i1;

import h1.C3296c;
import h1.C3298e;
import h1.C3302i;

/* renamed from: i1.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3456a extends j {

    /* renamed from: f0  reason: collision with root package name */
    public int f32437f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f32438g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f32439h0;

    @Override // i1.d
    public final void b(C3298e c3298e) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        C3458c[] c3458cArr = this.f32469F;
        C3458c c3458c = this.f32512x;
        c3458cArr[0] = c3458c;
        C3458c c3458c2 = this.f32513y;
        int i14 = 2;
        c3458cArr[2] = c3458c2;
        C3458c c3458c3 = this.f32514z;
        c3458cArr[1] = c3458c3;
        C3458c c3458c4 = this.f32464A;
        c3458cArr[3] = c3458c4;
        for (C3458c c3458c5 : c3458cArr) {
            c3458c5.f32463g = c3298e.j(c3458c5);
        }
        int i15 = this.f32437f0;
        if (i15 >= 0 && i15 < 4) {
            C3458c c3458c6 = c3458cArr[i15];
            for (int i16 = 0; i16 < this.f32590e0; i16++) {
                d dVar = this.f32589d0[i16];
                if ((this.f32438g0 || dVar.c()) && ((((i13 = this.f32437f0) == 0 || i13 == 1) && dVar.f32491c0[0] == 3 && dVar.f32512x.f32460d != null && dVar.f32514z.f32460d != null) || ((i13 == 2 || i13 == 3) && dVar.f32491c0[1] == 3 && dVar.f32513y.f32460d != null && dVar.f32464A.f32460d != null))) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            if (!c3458c.e() && !c3458c3.e()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!c3458c2.e() && !c3458c4.e()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z10 && (((i12 = this.f32437f0) == 0 && z11) || ((i12 == 2 && z12) || ((i12 == 1 && z11) || (i12 == 3 && z12))))) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            int i17 = 0;
            while (i17 < this.f32590e0) {
                d dVar2 = this.f32589d0[i17];
                if (this.f32438g0 || dVar2.c()) {
                    C3302i j6 = c3298e.j(dVar2.f32469F[this.f32437f0]);
                    int i18 = this.f32437f0;
                    C3458c c3458c7 = dVar2.f32469F[i18];
                    c3458c7.f32463g = j6;
                    C3458c c3458c8 = c3458c7.f32460d;
                    if (c3458c8 != null && c3458c8.f32458b == this) {
                        i11 = c3458c7.f32461e;
                    } else {
                        i11 = 0;
                    }
                    if (i18 != 0 && i18 != i14) {
                        C3296c k10 = c3298e.k();
                        C3302i l10 = c3298e.l();
                        l10.f31732d = 0;
                        k10.b(c3458c6.f32463g, j6, l10, this.f32439h0 + i11);
                        c3298e.c(k10);
                    } else {
                        C3296c k11 = c3298e.k();
                        C3302i l11 = c3298e.l();
                        l11.f31732d = 0;
                        k11.c(c3458c6.f32463g, j6, l11, this.f32439h0 - i11);
                        c3298e.c(k11);
                    }
                    c3298e.e(c3458c6.f32463g, j6, this.f32439h0 + i11, i10);
                }
                i17++;
                i14 = 2;
            }
            int i19 = this.f32437f0;
            if (i19 == 0) {
                c3298e.e(c3458c3.f32463g, c3458c.f32463g, 0, 8);
                c3298e.e(c3458c.f32463g, this.f32472I.f32514z.f32463g, 0, 4);
                c3298e.e(c3458c.f32463g, this.f32472I.f32512x.f32463g, 0, 0);
            } else if (i19 == 1) {
                c3298e.e(c3458c.f32463g, c3458c3.f32463g, 0, 8);
                c3298e.e(c3458c.f32463g, this.f32472I.f32512x.f32463g, 0, 4);
                c3298e.e(c3458c.f32463g, this.f32472I.f32514z.f32463g, 0, 0);
            } else if (i19 == 2) {
                c3298e.e(c3458c4.f32463g, c3458c2.f32463g, 0, 8);
                c3298e.e(c3458c2.f32463g, this.f32472I.f32464A.f32463g, 0, 4);
                c3298e.e(c3458c2.f32463g, this.f32472I.f32513y.f32463g, 0, 0);
            } else if (i19 == 3) {
                c3298e.e(c3458c2.f32463g, c3458c4.f32463g, 0, 8);
                c3298e.e(c3458c2.f32463g, this.f32472I.f32513y.f32463g, 0, 4);
                c3298e.e(c3458c2.f32463g, this.f32472I.f32464A.f32463g, 0, 0);
            }
        }
    }

    @Override // i1.d
    public final boolean c() {
        return true;
    }

    @Override // i1.d
    public final String toString() {
        String t10 = R.a.t(new StringBuilder("[Barrier] "), this.f32482W, " {");
        for (int i10 = 0; i10 < this.f32590e0; i10++) {
            d dVar = this.f32589d0[i10];
            if (i10 > 0) {
                t10 = android.gov.nist.core.a.g(t10, ", ");
            }
            StringBuilder p10 = android.gov.nist.core.a.p(t10);
            p10.append(dVar.f32482W);
            t10 = p10.toString();
        }
        return android.gov.nist.core.a.g(t10, "}");
    }
}
