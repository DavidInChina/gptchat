package B0;

import E0.AbstractC0461u;
import G0.C0593w;
import G0.C0595y;
import b0.C2104h;
import id.AbstractC3557B;
import l0.AbstractC4325q;

/* renamed from: B0.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0188e {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0461u f1631a;

    /* renamed from: b  reason: collision with root package name */
    public final C0193j f1632b = new C0193j();

    public C0188e(C0595y c0595y) {
        this.f1631a = c0595y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object[]] */
    public final void a(long j6, C0593w c0593w) {
        C0192i c0192i;
        C0193j c0193j = this.f1632b;
        int i10 = c0593w.f5837i0;
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            AbstractC4325q abstractC4325q = (AbstractC4325q) c0593w.get(i11);
            if (z10) {
                C2104h c2104h = c0193j.f1651a;
                int i12 = c2104h.f25569h0;
                if (i12 > 0) {
                    ?? r72 = c2104h.f25567Y;
                    int i13 = 0;
                    do {
                        c0192i = r72[i13];
                        if (AbstractC3557B.K(((C0192i) c0192i).f1643b, abstractC4325q)) {
                            break;
                        }
                        i13++;
                    } while (i13 < i12);
                    c0192i = null;
                } else {
                    c0192i = null;
                }
                C0192i c0192i2 = c0192i;
                if (c0192i2 != null) {
                    c0192i2.f1649h = true;
                    c0192i2.f1644c.a(j6);
                    c0193j = c0192i2;
                } else {
                    z10 = false;
                }
            }
            C0192i c0192i3 = new C0192i(abstractC4325q);
            c0192i3.f1644c.a(j6);
            c0193j.f1651a.b(c0192i3);
            c0193j = c0192i3;
        }
    }

    public final boolean b(C0189f c0189f, boolean z10) {
        boolean z11;
        boolean z12;
        C0193j c0193j = this.f1632b;
        if (!c0193j.a(c0189f.f1633a, this.f1631a, c0189f, z10)) {
            return false;
        }
        C2104h c2104h = c0193j.f1651a;
        int i10 = c2104h.f25569h0;
        if (i10 > 0) {
            Object[] objArr = c2104h.f25567Y;
            int i11 = 0;
            z11 = false;
            do {
                if (!((C0192i) objArr[i11]).f(c0189f, z10) && !z11) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                i11++;
            } while (i11 < i10);
        } else {
            z11 = false;
        }
        int i12 = c2104h.f25569h0;
        if (i12 > 0) {
            Object[] objArr2 = c2104h.f25567Y;
            int i13 = 0;
            z12 = false;
            do {
                if (!((C0192i) objArr2[i13]).e(c0189f) && !z12) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                i13++;
            } while (i13 < i12);
        } else {
            z12 = false;
        }
        c0193j.b(c0189f);
        if (!z12 && !z11) {
            return false;
        }
        return true;
    }
}
