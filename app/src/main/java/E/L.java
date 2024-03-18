package E;

import Z.AbstractC1725n;
import Z.C1723m;
import id.AbstractC3557B;
import java.util.List;
import l0.C4310b;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a  reason: collision with root package name */
    public static final E f3784a = new E(C4310b.f37702o0);

    public static final int a(List list, wf.o oVar, wf.o oVar2, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        if (list.isEmpty()) {
            return 0;
        }
        Object i22 = kf.t.i2(0, list);
        E0.r rVar = (E0.r) i22;
        if (rVar != null) {
            i14 = ((Number) oVar2.invoke(rVar, 0, Integer.valueOf(i10))).intValue();
        } else {
            i14 = 0;
        }
        if (rVar != null) {
            i15 = ((Number) oVar.invoke(rVar, 0, Integer.valueOf(i14))).intValue();
        } else {
            i15 = 0;
        }
        int size = list.size();
        int i18 = i10;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i23 = 0;
        while (i19 < size) {
            E0.r rVar2 = (E0.r) list.get(i19);
            AbstractC3557B.Z(i22);
            i18 -= i15;
            int max = Math.max(i21, i14);
            i19++;
            Object i24 = kf.t.i2(i19, list);
            E0.r rVar3 = (E0.r) i24;
            if (rVar3 != null) {
                i16 = ((Number) oVar2.invoke(rVar3, Integer.valueOf(i19), Integer.valueOf(i10))).intValue();
            } else {
                i16 = 0;
            }
            if (rVar3 != null) {
                i17 = ((Number) oVar.invoke(rVar3, Integer.valueOf(i19), Integer.valueOf(i16))).intValue() + i11;
            } else {
                i17 = 0;
            }
            if (i18 >= 0 && i19 != list.size()) {
                if (i19 - i23 != i13 && i18 - i17 >= 0) {
                    int i25 = i16;
                    i21 = max;
                    i22 = i24;
                    i15 = i17;
                    i14 = i25;
                }
            }
            i20 += max + i12;
            i17 -= i11;
            i18 = i10;
            max = 0;
            i23 = i19;
            int i252 = i16;
            i21 = max;
            i22 = i24;
            i15 = i17;
            i14 = i252;
        }
        return i20 - i12;
    }

    public static final int b(E0.M m10, long j6, wf.k kVar) {
        if (androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.a.k(m10)) == 0.0f) {
            E0.d0 o10 = m10.o(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.a.j(j6, 0, 0, 14), 1));
            kVar.invoke(o10);
            return o10.f4053Y;
        }
        return m10.l(Integer.MAX_VALUE);
    }

    public static final N c(C0426j c0426j, AbstractC1725n abstractC1725n) {
        C0423g c0423g = AbstractC0429m.f3909c;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(1479255111);
        rVar.W(1618982084);
        boolean g10 = rVar.g(Integer.MAX_VALUE) | rVar.g(c0426j) | rVar.g(c0423g);
        Object K10 = rVar.K();
        if (g10 || K10 == C1723m.f22654Y) {
            K10 = new N(c0426j, c0426j.f3880d, f3784a, c0423g.a());
            rVar.h0(K10);
        }
        rVar.t(false);
        N n10 = (N) K10;
        rVar.t(false);
        return n10;
    }
}
