package W;

import A.AbstractC0044t0;
import E0.AbstractC0445d;
import E0.C0458q;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: W.s3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1614s3 implements E0.N {
    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        E0.d0 d0Var;
        Object obj;
        E0.d0 d0Var2;
        Object obj2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int G10;
        List list2 = list;
        int min = Math.min(Z0.a.h(j6), p10.a0(AbstractC1649z3.f20663a));
        int size = list.size();
        int i21 = 0;
        while (true) {
            d0Var = null;
            if (i21 < size) {
                obj = list2.get(i21);
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj), "action")) {
                    break;
                }
                i21++;
            } else {
                obj = null;
                break;
            }
        }
        E0.M m10 = (E0.M) obj;
        if (m10 != null) {
            d0Var2 = m10.o(j6);
        } else {
            d0Var2 = null;
        }
        int size2 = list.size();
        int i22 = 0;
        while (true) {
            if (i22 < size2) {
                obj2 = list2.get(i22);
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj2), "dismissAction")) {
                    break;
                }
                i22++;
            } else {
                obj2 = null;
                break;
            }
        }
        E0.M m11 = (E0.M) obj2;
        if (m11 != null) {
            d0Var = m11.o(j6);
        }
        E0.d0 d0Var3 = d0Var;
        if (d0Var2 != null) {
            i10 = d0Var2.f4053Y;
        } else {
            i10 = 0;
        }
        if (d0Var2 != null) {
            i11 = d0Var2.f4054Z;
        } else {
            i11 = 0;
        }
        if (d0Var3 != null) {
            i12 = d0Var3.f4053Y;
        } else {
            i12 = 0;
        }
        if (d0Var3 != null) {
            i13 = d0Var3.f4054Z;
        } else {
            i13 = 0;
        }
        if (i12 == 0) {
            i14 = p10.a0(AbstractC1649z3.f20669g);
        } else {
            i14 = 0;
        }
        int i23 = ((min - i10) - i12) - i14;
        int j10 = Z0.a.j(j6);
        if (i23 >= j10) {
            j10 = i23;
        }
        int size3 = list.size();
        int i24 = 0;
        while (i24 < size3) {
            E0.M m12 = (E0.M) list2.get(i24);
            if (AbstractC3557B.K(androidx.compose.ui.layout.a.e(m12), ParameterNames.TEXT)) {
                E0.d0 o10 = m12.o(Z0.a.a(j6, 0, j10, 0, 0, 9));
                C0458q c0458q = AbstractC0445d.f4051a;
                int G11 = o10.G(c0458q);
                if (G11 != Integer.MIN_VALUE) {
                    int G12 = o10.G(AbstractC0445d.f4052b);
                    if (G12 != Integer.MIN_VALUE) {
                        if (G11 == G12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i25 = min - i12;
                        int i26 = i25 - i10;
                        if (z10) {
                            i17 = Math.max(p10.a0(X.C.f21355f), Math.max(i11, i13));
                            int i27 = (i17 - o10.f4054Z) / 2;
                            if (d0Var2 != null && (G10 = d0Var2.G(c0458q)) != Integer.MIN_VALUE) {
                                i20 = (G11 + i27) - G10;
                            } else {
                                i20 = 0;
                            }
                            i15 = i20;
                            i16 = i27;
                        } else {
                            int a02 = p10.a0(AbstractC1649z3.f20664b) - G11;
                            i17 = Math.max(p10.a0(X.C.f21356g), o10.f4054Z + a02);
                            if (d0Var2 != null) {
                                i19 = (i17 - d0Var2.f4054Z) / 2;
                            } else {
                                i19 = 0;
                            }
                            i16 = a02;
                            i15 = i19;
                        }
                        if (d0Var3 != null) {
                            i18 = (i17 - d0Var3.f4054Z) / 2;
                        } else {
                            i18 = 0;
                        }
                        return p10.j0(min, i17, kf.w.f37484Y, new C1609r3(o10, i16, d0Var3, i25, i18, d0Var2, i26, i15));
                    }
                    throw new IllegalArgumentException("No baselines for text".toString());
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
            i24++;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // E0.N
    public final /* synthetic */ int b(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.d(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int c(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.f(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int d(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.h(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int e(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.b(this, g0Var, list, i10);
    }
}
