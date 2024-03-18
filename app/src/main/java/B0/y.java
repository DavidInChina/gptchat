package B0;

import G0.C0593w;
import b0.C2104h;
import q0.C5251c;
import w.C6066m;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.compose.ui.node.a f1699a;

    /* renamed from: b  reason: collision with root package name */
    public final C0188e f1700b;

    /* renamed from: c  reason: collision with root package name */
    public final F4.a f1701c = new F4.a(8);

    /* renamed from: d  reason: collision with root package name */
    public final C0593w f1702d = new C0593w();

    /* renamed from: e  reason: collision with root package name */
    public boolean f1703e;

    public y(androidx.compose.ui.node.a aVar) {
        this.f1699a = aVar;
        this.f1700b = new C0188e(aVar.f24831B0.f5701b);
    }

    public final int a(w wVar, G g10, boolean z10) {
        boolean z11;
        C0188e c0188e;
        int i10;
        C0593w c0593w = this.f1702d;
        if (this.f1703e) {
            return 0;
        }
        try {
            this.f1703e = true;
            C0189f k10 = this.f1701c.k(wVar, g10);
            C6066m c6066m = k10.f1633a;
            int i11 = c6066m.i();
            for (int i12 = 0; i12 < i11; i12++) {
                u uVar = (u) c6066m.j(i12);
                if (!uVar.f1673d && !uVar.f1677h) {
                }
                z11 = false;
                break;
            }
            z11 = true;
            int i13 = c6066m.i();
            int i14 = 0;
            while (true) {
                c0188e = this.f1700b;
                if (i14 >= i13) {
                    break;
                }
                u uVar2 = (u) c6066m.j(i14);
                if (z11 || r9.y.W(uVar2)) {
                    this.f1699a.K(uVar2.f1672c, this.f1702d, s.b(uVar2.f1678i, 1), true);
                    if (!c0593w.isEmpty()) {
                        c0188e.a(uVar2.f1670a, c0593w);
                        c0593w.clear();
                    }
                }
                i14++;
            }
            c0188e.f1632b.c();
            boolean b10 = c0188e.b(k10, z10);
            if (!k10.f1635c) {
                int i15 = c6066m.i();
                for (int i16 = 0; i16 < i15; i16++) {
                    u uVar3 = (u) c6066m.j(i16);
                    if ((!C5251c.b(r9.y.Q0(uVar3, true), C5251c.f43619b)) && uVar3.b()) {
                        i10 = 2;
                        break;
                    }
                }
            }
            i10 = 0;
            int i17 = b10 | i10;
            this.f1703e = false;
            return i17;
        } catch (Throwable th2) {
            this.f1703e = false;
            throw th2;
        }
    }

    public final void b() {
        if (!this.f1703e) {
            ((C6066m) this.f1701c.f5033Z).b();
            C0193j c0193j = this.f1700b.f1632b;
            C2104h c2104h = c0193j.f1651a;
            int i10 = c2104h.f25569h0;
            if (i10 > 0) {
                Object[] objArr = c2104h.f25567Y;
                int i11 = 0;
                do {
                    ((C0192i) objArr[i11]).d();
                    i11++;
                } while (i11 < i10);
                c0193j.f1651a.f();
            }
            c0193j.f1651a.f();
        }
    }
}
