package W;

import A.AbstractC0044t0;
import id.AbstractC3557B;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class I0 implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public static final I0 f19211a = new Object();

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        E0.d0 d0Var;
        Object obj;
        E0.d0 d0Var2;
        Object obj2;
        int size = list.size();
        int i10 = 0;
        while (true) {
            d0Var = null;
            if (i10 < size) {
                obj = list.get(i10);
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj), "leadingIcon")) {
                    break;
                }
                i10++;
            } else {
                obj = null;
                break;
            }
        }
        E0.M m10 = (E0.M) obj;
        if (m10 != null) {
            d0Var2 = m10.o(Z0.a.a(j6, 0, 0, 0, 0, 10));
        } else {
            d0Var2 = null;
        }
        int f6 = X3.f(d0Var2);
        int e10 = X3.e(d0Var2);
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size2) {
                obj2 = list.get(i11);
                if (AbstractC3557B.K(androidx.compose.ui.layout.a.e((E0.M) obj2), "trailingIcon")) {
                    break;
                }
                i11++;
            } else {
                obj2 = null;
                break;
            }
        }
        E0.M m11 = (E0.M) obj2;
        if (m11 != null) {
            d0Var = m11.o(Z0.a.a(j6, 0, 0, 0, 0, 10));
        }
        E0.d0 d0Var3 = d0Var;
        int f10 = X3.f(d0Var3);
        int e11 = X3.e(d0Var3);
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            E0.M m12 = (E0.M) list.get(i12);
            if (AbstractC3557B.K(androidx.compose.ui.layout.a.e(m12), "label")) {
                E0.d0 o10 = m12.o(A7.b.o1(-(f6 + f10), 0, 2, j6));
                int i13 = o10.f4053Y + f6 + f10;
                int max = Math.max(e10, Math.max(o10.f4054Z, e11));
                return p10.j0(i13, max, kf.w.f37484Y, new H0(d0Var2, e10, max, o10, f6, d0Var3, e11));
            }
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
