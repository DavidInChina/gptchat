package p2;

import E2.AbstractC0469a;
import java.util.ArrayList;
import java.util.Random;
import m.RunnableC4517N;
import s2.AbstractC5530A;
import y2.C6502E;
import y2.C6504G;
import y2.C6506I;
import y2.C6507J;
import y2.C6509L;
import z2.C6757b;

/* renamed from: p2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5054g implements X {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f42062a = new f0();

    public final void a(long j6) {
        boolean z10;
        C6504G c6504g = (C6504G) this;
        int i10 = c6504g.i();
        c6504g.E();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        z2.w wVar = (z2.w) c6504g.f50379r;
        if (!wVar.f51544n0) {
            C6757b I10 = wVar.I();
            wVar.f51544n0 = true;
            wVar.N(I10, -1, new z2.r(I10, 0));
        }
        g0 g0Var = c6504g.f50360W.f50536a;
        if (g0Var.r() || i10 < g0Var.q()) {
            c6504g.f50344C++;
            if (c6504g.r()) {
                s2.p.g("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C6507J c6507j = new C6507J(c6504g.f50360W);
                c6507j.a(1);
                C6504G c6504g2 = c6504g.f50371j.f50700Y;
                c6504g2.f50370i.c(new RunnableC4517N(c6504g2, 7, c6507j));
                return;
            }
            y2.d0 d0Var = c6504g.f50360W;
            int i11 = d0Var.f50540e;
            if (i11 == 3 || (i11 == 4 && !g0Var.r())) {
                d0Var = c6504g.f50360W.f(2);
            }
            int i12 = c6504g.i();
            y2.d0 s10 = c6504g.s(d0Var, g0Var, c6504g.t(g0Var, i10, j6));
            c6504g.f50372k.f50437m0.a(3, new C6509L(g0Var, i10, AbstractC5530A.C(j6))).b();
            c6504g.B(s10, 0, 1, true, 1, c6504g.l(s10), i12);
        }
    }

    public final void b(H h10) {
        boolean z10;
        x8.k0 u02 = x8.N.u0(h10);
        C6504G c6504g = (C6504G) this;
        c6504g.E();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < u02.f49575i0; i10++) {
            arrayList.add(c6504g.f50378q.b((H) u02.get(i10)));
        }
        c6504g.E();
        c6504g.n(c6504g.f50360W);
        c6504g.k();
        c6504g.f50344C++;
        ArrayList arrayList2 = c6504g.f50376o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i11 = size - 1; i11 >= 0; i11--) {
                arrayList2.remove(i11);
            }
            E2.a0 a0Var = c6504g.f50349H;
            int[] iArr = a0Var.f4283b;
            int[] iArr2 = new int[iArr.length - size];
            int i12 = 0;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 >= 0 && i14 < size) {
                    i12++;
                } else {
                    int i15 = i13 - i12;
                    if (i14 >= 0) {
                        i14 -= size;
                    }
                    iArr2[i15] = i14;
                }
            }
            c6504g.f50349H = new E2.a0(iArr2, new Random(a0Var.f4282a.nextLong()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            y2.b0 b0Var = new y2.b0((AbstractC0469a) arrayList.get(i16), c6504g.f50377p);
            arrayList3.add(b0Var);
            arrayList2.add(i16, new C6502E(b0Var.f50517b, b0Var.f50516a));
        }
        c6504g.f50349H = c6504g.f50349H.a(arrayList3.size());
        y2.h0 h0Var = new y2.h0(arrayList2, c6504g.f50349H);
        boolean r10 = h0Var.r();
        int i17 = h0Var.f50611l0;
        if (!r10 && -1 >= i17) {
            throw new IllegalStateException();
        }
        int b10 = h0Var.b(false);
        y2.d0 s10 = c6504g.s(c6504g.f50360W, h0Var, c6504g.t(h0Var, b10, -9223372036854775807L));
        int i18 = s10.f50540e;
        if (b10 != -1 && i18 != 1) {
            i18 = (h0Var.r() || b10 >= i17) ? 4 : 2;
        }
        y2.d0 f6 = s10.f(i18);
        c6504g.f50372k.f50437m0.a(17, new C6506I(arrayList3, c6504g.f50349H, b10, AbstractC5530A.C(-9223372036854775807L))).b();
        if (!c6504g.f50360W.f50537b.f4420a.equals(f6.f50537b.f4420a) && !c6504g.f50360W.f50536a.r()) {
            z10 = true;
        } else {
            z10 = false;
        }
        c6504g.B(f6, 0, 1, z10, 4, c6504g.l(f6), -1);
    }
}
