package B0;

import E0.AbstractC0461u;
import b0.C2104h;
import w.C6066m;

/* renamed from: B0.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0193j {

    /* renamed from: a  reason: collision with root package name */
    public final C2104h f1651a = new C2104h(new C0192i[16]);

    public boolean a(C6066m c6066m, AbstractC0461u abstractC0461u, C0189f c0189f, boolean z10) {
        C2104h c2104h = this.f1651a;
        int i10 = c2104h.f25569h0;
        if (i10 <= 0) {
            return false;
        }
        Object[] objArr = c2104h.f25567Y;
        int i11 = 0;
        boolean z11 = false;
        do {
            if (!((C0192i) objArr[i11]).a(c6066m, abstractC0461u, c0189f, z10) && !z11) {
                z11 = false;
            } else {
                z11 = true;
            }
            i11++;
        } while (i11 < i10);
        return z11;
    }

    public void b(C0189f c0189f) {
        C2104h c2104h = this.f1651a;
        int i10 = c2104h.f25569h0;
        while (true) {
            i10--;
            if (-1 < i10) {
                if (((C0192i) c2104h.f25567Y[i10]).f1644c.f2483a == 0) {
                    c2104h.n(i10);
                }
            } else {
                return;
            }
        }
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            C2104h c2104h = this.f1651a;
            if (i10 < c2104h.f25569h0) {
                C0192i c0192i = (C0192i) c2104h.f25567Y[i10];
                if (!c0192i.f1643b.f37732r0) {
                    c2104h.n(i10);
                    c0192i.d();
                } else {
                    i10++;
                    c0192i.c();
                }
            } else {
                return;
            }
        }
    }
}
